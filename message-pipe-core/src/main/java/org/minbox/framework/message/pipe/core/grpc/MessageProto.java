// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageService.proto

package org.minbox.framework.message.pipe.core.grpc;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_minbox_framework_message_pipe_core_grpc_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_minbox_framework_message_pipe_core_grpc_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_minbox_framework_message_pipe_core_grpc_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_minbox_framework_message_pipe_core_grpc_MessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024MessageService.proto\022+org.minbox.frame" +
      "work.message.pipe.core.grpc\"\036\n\016MessageRe" +
      "quest\022\014\n\004body\030\001 \001(\t\"\037\n\017MessageResponse\022\014" +
      "\n\004body\030\001 \001(\t2\233\001\n\016MessageService\022\210\001\n\013take" +
      "Message\022;.org.minbox.framework.message.p" +
      "ipe.core.grpc.MessageRequest\032<.org.minbo" +
      "x.framework.message.pipe.core.grpc.Messa" +
      "geResponseB\020B\014MessageProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_minbox_framework_message_pipe_core_grpc_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_minbox_framework_message_pipe_core_grpc_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_minbox_framework_message_pipe_core_grpc_MessageRequest_descriptor,
        new String[] { "Body", });
    internal_static_org_minbox_framework_message_pipe_core_grpc_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_minbox_framework_message_pipe_core_grpc_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_minbox_framework_message_pipe_core_grpc_MessageResponse_descriptor,
        new String[] { "Body", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
