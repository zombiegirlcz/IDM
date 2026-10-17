package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes13.dex */
public final class JvmProtoBuf {
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> anonymousObjectOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> constructorSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> flags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> isRaw;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> jvmClassFlags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> lambdaClassOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> methodSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> propertySignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final JvmFieldSignature f187408g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187411c;
        public int d;
        public byte e;
        public int f;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187412b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187413c;
            public int d;

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i = this.f187412b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f187411c = this.f187413c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.d = this.d;
                jvmFieldSignature.f187410b = i2;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i) {
                this.f187412b |= 2;
                this.d = i;
                return this;
            }

            public Builder setName(int i) {
                this.f187412b |= 1;
                this.f187413c = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureBuildPartial = buildPartial();
                if (jvmFieldSignatureBuildPartial.isInitialized()) {
                    return jvmFieldSignatureBuildPartial;
                }
                throw new UninitializedMessageException(jvmFieldSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    setName(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    setDesc(jvmFieldSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmFieldSignature.f187409a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mergeFrom(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder");
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f187408g = jvmFieldSignature;
            jvmFieldSignature.f187411c = 0;
            jvmFieldSignature.d = 0;
        }

        public JvmFieldSignature() {
            this.e = (byte) -1;
            this.f = -1;
            this.f187409a = ByteString.EMPTY;
        }

        public static JvmFieldSignature getDefaultInstance() {
            return f187408g;
        }

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mergeFrom(jvmFieldSignature);
        }

        public int getDesc() {
            return this.d;
        }

        public int getName() {
            return this.f187411c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187410b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187411c) : 0;
            if ((this.f187410b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int size = this.f187409a.size() + iComputeInt32Size;
            this.f = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f187410b & 2) == 2;
        }

        public boolean hasName() {
            return (this.f187410b & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.e;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187410b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f187411c);
            }
            if ((this.f187410b & 2) == 2) {
                codedOutputStream.writeInt32(2, this.d);
            }
            codedOutputStream.writeRawBytes(this.f187409a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmFieldSignature getDefaultInstanceForType() {
            return f187408g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmFieldSignature(CodedInputStream codedInputStream) {
            this.e = (byte) -1;
            this.f = -1;
            boolean z = false;
            this.f187411c = 0;
            this.d = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 8) {
                                this.f187410b |= 1;
                                this.f187411c = codedInputStream.readInt32();
                            } else if (tag2 != 16) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                this.f187410b |= 2;
                                this.d = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187409a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187409a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187409a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187409a = outputNewOutput.toByteString();
        }

        public JvmFieldSignature(Builder builder) {
            this.e = (byte) -1;
            this.f = -1;
            this.f187409a = builder.getUnknownFields();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final JvmMethodSignature f187414g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187417c;
        public int d;
        public byte e;
        public int f;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187418b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187419c;
            public int d;

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i = this.f187418b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f187417c = this.f187419c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.d = this.d;
                jvmMethodSignature.f187416b = i2;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i) {
                this.f187418b |= 2;
                this.d = i;
                return this;
            }

            public Builder setName(int i) {
                this.f187418b |= 1;
                this.f187419c = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureBuildPartial = buildPartial();
                if (jvmMethodSignatureBuildPartial.isInitialized()) {
                    return jvmMethodSignatureBuildPartial;
                }
                throw new UninitializedMessageException(jvmMethodSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    setName(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    setDesc(jvmMethodSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmMethodSignature.f187415a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mergeFrom(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder");
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f187414g = jvmMethodSignature;
            jvmMethodSignature.f187417c = 0;
            jvmMethodSignature.d = 0;
        }

        public JvmMethodSignature() {
            this.e = (byte) -1;
            this.f = -1;
            this.f187415a = ByteString.EMPTY;
        }

        public static JvmMethodSignature getDefaultInstance() {
            return f187414g;
        }

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mergeFrom(jvmMethodSignature);
        }

        public int getDesc() {
            return this.d;
        }

        public int getName() {
            return this.f187417c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187416b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187417c) : 0;
            if ((this.f187416b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int size = this.f187415a.size() + iComputeInt32Size;
            this.f = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f187416b & 2) == 2;
        }

        public boolean hasName() {
            return (this.f187416b & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.e;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187416b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f187417c);
            }
            if ((this.f187416b & 2) == 2) {
                codedOutputStream.writeInt32(2, this.d);
            }
            codedOutputStream.writeRawBytes(this.f187415a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmMethodSignature getDefaultInstanceForType() {
            return f187414g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmMethodSignature(CodedInputStream codedInputStream) {
            this.e = (byte) -1;
            this.f = -1;
            boolean z = false;
            this.f187417c = 0;
            this.d = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 8) {
                                this.f187416b |= 1;
                                this.f187417c = codedInputStream.readInt32();
                            } else if (tag2 != 16) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                this.f187416b |= 2;
                                this.d = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187415a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187415a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187415a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187415a = outputNewOutput.toByteString();
        }

        public JvmMethodSignature(Builder builder) {
            this.e = (byte) -1;
            this.f = -1;
            this.f187415a = builder.getUnknownFields();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new c();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final JvmPropertySignature f187420j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JvmFieldSignature f187423c;
        public JvmMethodSignature d;
        public JvmMethodSignature e;
        public JvmMethodSignature f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public JvmMethodSignature f187424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f187425h;
        public int i;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187426b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public JvmFieldSignature f187427c = JvmFieldSignature.getDefaultInstance();
            public JvmMethodSignature d = JvmMethodSignature.getDefaultInstance();
            public JvmMethodSignature e = JvmMethodSignature.getDefaultInstance();
            public JvmMethodSignature f = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public JvmMethodSignature f187428g = JvmMethodSignature.getDefaultInstance();

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.f187426b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f187423c = this.f187427c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.f = this.f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.f187424g = this.f187428g;
                jvmPropertySignature.f187422b = i2;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDelegateMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f187426b & 16) != 16 || this.f187428g == JvmMethodSignature.getDefaultInstance()) {
                    this.f187428g = jvmMethodSignature;
                } else {
                    this.f187428g = JvmMethodSignature.newBuilder(this.f187428g).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f187426b |= 16;
                return this;
            }

            public Builder mergeField(JvmFieldSignature jvmFieldSignature) {
                if ((this.f187426b & 1) != 1 || this.f187427c == JvmFieldSignature.getDefaultInstance()) {
                    this.f187427c = jvmFieldSignature;
                } else {
                    this.f187427c = JvmFieldSignature.newBuilder(this.f187427c).mergeFrom(jvmFieldSignature).buildPartial();
                }
                this.f187426b |= 1;
                return this;
            }

            public Builder mergeGetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f187426b & 4) != 4 || this.e == JvmMethodSignature.getDefaultInstance()) {
                    this.e = jvmMethodSignature;
                } else {
                    this.e = JvmMethodSignature.newBuilder(this.e).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f187426b |= 4;
                return this;
            }

            public Builder mergeSetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f187426b & 8) != 8 || this.f == JvmMethodSignature.getDefaultInstance()) {
                    this.f = jvmMethodSignature;
                } else {
                    this.f = JvmMethodSignature.newBuilder(this.f).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f187426b |= 8;
                return this;
            }

            public Builder mergeSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f187426b & 2) != 2 || this.d == JvmMethodSignature.getDefaultInstance()) {
                    this.d = jvmMethodSignature;
                } else {
                    this.d = JvmMethodSignature.newBuilder(this.d).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f187426b |= 2;
                return this;
            }

            public Builder setDelegateMethod(JvmMethodSignature jvmMethodSignature) {
                jvmMethodSignature.getClass();
                this.f187428g = jvmMethodSignature;
                this.f187426b |= 16;
                return this;
            }

            public Builder setField(JvmFieldSignature jvmFieldSignature) {
                jvmFieldSignature.getClass();
                this.f187427c = jvmFieldSignature;
                this.f187426b |= 1;
                return this;
            }

            public Builder setGetter(JvmMethodSignature jvmMethodSignature) {
                jvmMethodSignature.getClass();
                this.e = jvmMethodSignature;
                this.f187426b |= 4;
                return this;
            }

            public Builder setSetter(JvmMethodSignature jvmMethodSignature) {
                jvmMethodSignature.getClass();
                this.f = jvmMethodSignature;
                this.f187426b |= 8;
                return this;
            }

            public Builder setSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                jvmMethodSignature.getClass();
                this.d = jvmMethodSignature;
                this.f187426b |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureBuildPartial = buildPartial();
                if (jvmPropertySignatureBuildPartial.isInitialized()) {
                    return jvmPropertySignatureBuildPartial;
                }
                throw new UninitializedMessageException(jvmPropertySignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mergeField(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mergeSyntheticMethod(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mergeGetter(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mergeSetter(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    mergeDelegateMethod(jvmPropertySignature.getDelegateMethod());
                }
                setUnknownFields(getUnknownFields().concat(jvmPropertySignature.f187421a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mergeFrom(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$Builder");
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f187420j = jvmPropertySignature;
            jvmPropertySignature.f187423c = JvmFieldSignature.getDefaultInstance();
            jvmPropertySignature.d = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.e = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f187424g = JvmMethodSignature.getDefaultInstance();
        }

        public JvmPropertySignature() {
            this.f187425h = (byte) -1;
            this.i = -1;
            this.f187421a = ByteString.EMPTY;
        }

        public static JvmPropertySignature getDefaultInstance() {
            return f187420j;
        }

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mergeFrom(jvmPropertySignature);
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.f187424g;
        }

        public JvmFieldSignature getField() {
            return this.f187423c;
        }

        public JvmMethodSignature getGetter() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.f187422b & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f187423c) : 0;
            if ((this.f187422b & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.d);
            }
            if ((this.f187422b & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.e);
            }
            if ((this.f187422b & 8) == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f);
            }
            if ((this.f187422b & 16) == 16) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f187424g);
            }
            int size = this.f187421a.size() + iComputeMessageSize;
            this.i = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.f;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.d;
        }

        public boolean hasDelegateMethod() {
            return (this.f187422b & 16) == 16;
        }

        public boolean hasField() {
            return (this.f187422b & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.f187422b & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.f187422b & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.f187422b & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187425h;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.f187425h = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187422b & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f187423c);
            }
            if ((this.f187422b & 2) == 2) {
                codedOutputStream.writeMessage(2, this.d);
            }
            if ((this.f187422b & 4) == 4) {
                codedOutputStream.writeMessage(3, this.e);
            }
            if ((this.f187422b & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f);
            }
            if ((this.f187422b & 16) == 16) {
                codedOutputStream.writeMessage(5, this.f187424g);
            }
            codedOutputStream.writeRawBytes(this.f187421a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmPropertySignature getDefaultInstanceForType() {
            return f187420j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187425h = (byte) -1;
            this.i = -1;
            this.f187423c = JvmFieldSignature.getDefaultInstance();
            this.d = JvmMethodSignature.getDefaultInstance();
            this.e = JvmMethodSignature.getDefaultInstance();
            this.f = JvmMethodSignature.getDefaultInstance();
            this.f187424g = JvmMethodSignature.getDefaultInstance();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 10) {
                                JvmFieldSignature.Builder builder = (this.f187422b & 1) == 1 ? this.f187423c.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.readMessage(JvmFieldSignature.PARSER, extensionRegistryLite);
                                this.f187423c = jvmFieldSignature;
                                if (builder != null) {
                                    builder.mergeFrom(jvmFieldSignature);
                                    this.f187423c = builder.buildPartial();
                                }
                                this.f187422b |= 1;
                            } else if (tag2 == 18) {
                                JvmMethodSignature.Builder builder2 = (this.f187422b & 2) == 2 ? this.d.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.d = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.mergeFrom(jvmMethodSignature);
                                    this.d = builder2.buildPartial();
                                }
                                this.f187422b |= 2;
                            } else if (tag2 == 26) {
                                JvmMethodSignature.Builder builder3 = (this.f187422b & 4) == 4 ? this.e.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.e = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(jvmMethodSignature2);
                                    this.e = builder3.buildPartial();
                                }
                                this.f187422b |= 4;
                            } else if (tag2 == 34) {
                                JvmMethodSignature.Builder builder4 = (this.f187422b & 8) == 8 ? this.f.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.mergeFrom(jvmMethodSignature3);
                                    this.f = builder4.buildPartial();
                                }
                                this.f187422b |= 8;
                            } else if (tag2 != 42) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                JvmMethodSignature.Builder builder5 = (this.f187422b & 16) == 16 ? this.f187424g.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f187424g = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.mergeFrom(jvmMethodSignature4);
                                    this.f187424g = builder5.buildPartial();
                                }
                                this.f187422b |= 16;
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187421a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187421a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187421a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187421a = outputNewOutput.toByteString();
        }

        public JvmPropertySignature(Builder builder) {
            this.f187425h = (byte) -1;
            this.i = -1;
            this.f187421a = builder.getUnknownFields();
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new d();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final StringTableTypes f187429g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f187431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f187432c;
        public int d;
        public byte e;
        public int f;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187433b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List f187434c;
            public List d;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f187434c = list;
                this.d = list;
            }

            public static Builder b() {
                return new Builder();
            }

            public StringTableTypes buildPartial() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f187433b & 1) == 1) {
                    this.f187434c = Collections.unmodifiableList(this.f187434c);
                    this.f187433b &= -2;
                }
                stringTableTypes.f187431b = this.f187434c;
                if ((this.f187433b & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.f187433b &= -3;
                }
                stringTableTypes.f187432c = this.d;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTableTypes build() {
                StringTableTypes stringTableTypesBuildPartial = buildPartial();
                if (stringTableTypesBuildPartial.isInitialized()) {
                    return stringTableTypesBuildPartial;
                }
                throw new UninitializedMessageException(stringTableTypesBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.f187431b.isEmpty()) {
                    if (this.f187434c.isEmpty()) {
                        this.f187434c = stringTableTypes.f187431b;
                        this.f187433b &= -2;
                    } else {
                        if ((this.f187433b & 1) != 1) {
                            this.f187434c = new ArrayList(this.f187434c);
                            this.f187433b |= 1;
                        }
                        this.f187434c.addAll(stringTableTypes.f187431b);
                    }
                }
                if (!stringTableTypes.f187432c.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = stringTableTypes.f187432c;
                        this.f187433b &= -3;
                    } else {
                        if ((this.f187433b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.f187433b |= 2;
                        }
                        this.d.addAll(stringTableTypes.f187432c);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTableTypes.f187430a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mergeFrom(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Builder");
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new e();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final Record f187435m;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ByteString f187436a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187437b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187438c;
            public int d;
            public Object e;
            public Operation f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List f187439g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f187440h;
            public List i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f187441j;
            public byte k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f187442l;

            /* JADX INFO: loaded from: classes14.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f187443b;
                public int d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public List f187445g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public List f187446h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f187444c = 1;
                public Object e = "";
                public Operation f = Operation.NONE;

                public Builder() {
                    List list = Collections.EMPTY_LIST;
                    this.f187445g = list;
                    this.f187446h = list;
                }

                public static Builder b() {
                    return new Builder();
                }

                public Record buildPartial() {
                    Record record = new Record(this);
                    int i = this.f187443b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    record.f187438c = this.f187444c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.d = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.e = this.e;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.f = this.f;
                    if ((i & 16) == 16) {
                        this.f187445g = Collections.unmodifiableList(this.f187445g);
                        this.f187443b &= -17;
                    }
                    record.f187439g = this.f187445g;
                    if ((this.f187443b & 32) == 32) {
                        this.f187446h = Collections.unmodifiableList(this.f187446h);
                        this.f187443b &= -33;
                    }
                    record.i = this.f187446h;
                    record.f187437b = i2;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setOperation(Operation operation) {
                    operation.getClass();
                    this.f187443b |= 8;
                    this.f = operation;
                    return this;
                }

                public Builder setPredefinedIndex(int i) {
                    this.f187443b |= 2;
                    this.d = i;
                    return this;
                }

                public Builder setRange(int i) {
                    this.f187443b |= 1;
                    this.f187444c = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Record build() {
                    Record recordBuildPartial = buildPartial();
                    if (recordBuildPartial.isInitialized()) {
                        return recordBuildPartial;
                    }
                    throw new UninitializedMessageException(recordBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo3794clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        setRange(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        setPredefinedIndex(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f187443b |= 4;
                        this.e = record.e;
                    }
                    if (record.hasOperation()) {
                        setOperation(record.getOperation());
                    }
                    if (!record.f187439g.isEmpty()) {
                        if (this.f187445g.isEmpty()) {
                            this.f187445g = record.f187439g;
                            this.f187443b &= -17;
                        } else {
                            if ((this.f187443b & 16) != 16) {
                                this.f187445g = new ArrayList(this.f187445g);
                                this.f187443b |= 16;
                            }
                            this.f187445g.addAll(record.f187439g);
                        }
                    }
                    if (!record.i.isEmpty()) {
                        if (this.f187446h.isEmpty()) {
                            this.f187446h = record.i;
                            this.f187443b &= -33;
                        } else {
                            if ((this.f187443b & 32) != 32) {
                                this.f187446h = new ArrayList(this.f187446h);
                                this.f187443b |= 32;
                            }
                            this.f187446h.addAll(record.i);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(record.f187436a));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.mergeFrom(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.mergeFrom(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Builder");
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                private static Internal.EnumLiteMap<Operation> internalValueMap = new f();
                private final int value;

                Operation(int i) {
                    this.value = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                Record record = new Record();
                f187435m = record;
                record.f187438c = 1;
                record.d = 0;
                record.e = "";
                record.f = Operation.NONE;
                List list = Collections.EMPTY_LIST;
                record.f187439g = list;
                record.i = list;
            }

            public Record() {
                this.f187440h = -1;
                this.f187441j = -1;
                this.k = (byte) -1;
                this.f187442l = -1;
                this.f187436a = ByteString.EMPTY;
            }

            public static Record getDefaultInstance() {
                return f187435m;
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            public Operation getOperation() {
                return this.f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.d;
            }

            public int getRange() {
                return this.f187438c;
            }

            public int getReplaceCharCount() {
                return this.i.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.f187442l;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.f187437b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187438c) : 0;
                if ((this.f187437b & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
                }
                if ((this.f187437b & 8) == 8) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f.getNumber());
                }
                int iComputeInt32SizeNoTag = 0;
                for (int i2 = 0; i2 < this.f187439g.size(); i2++) {
                    iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187439g.get(i2)).intValue());
                }
                int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
                if (!getSubstringIndexList().isEmpty()) {
                    iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
                }
                this.f187440h = iComputeInt32SizeNoTag;
                int iComputeInt32SizeNoTag3 = 0;
                for (int i3 = 0; i3 < this.i.size(); i3++) {
                    iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.i.get(i3)).intValue());
                }
                int iComputeBytesSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
                if (!getReplaceCharList().isEmpty()) {
                    iComputeBytesSize = iComputeBytesSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
                }
                this.f187441j = iComputeInt32SizeNoTag3;
                if ((this.f187437b & 4) == 4) {
                    iComputeBytesSize += CodedOutputStream.computeBytesSize(6, getStringBytes());
                }
                int size = this.f187436a.size() + iComputeBytesSize;
                this.f187442l = size;
                return size;
            }

            public String getString() {
                Object obj2 = this.e;
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                ByteString byteString = (ByteString) obj2;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.e = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getStringBytes() {
                Object obj2 = this.e;
                if (!(obj2 instanceof String)) {
                    return (ByteString) obj2;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj2);
                this.e = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSubstringIndexCount() {
                return this.f187439g.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.f187439g;
            }

            public boolean hasOperation() {
                return (this.f187437b & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.f187437b & 2) == 2;
            }

            public boolean hasRange() {
                return (this.f187437b & 1) == 1;
            }

            public boolean hasString() {
                return (this.f187437b & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b4 = this.k;
                if (b4 == 1) {
                    return true;
                }
                if (b4 == 0) {
                    return false;
                }
                this.k = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f187437b & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f187438c);
                }
                if ((this.f187437b & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.d);
                }
                if ((this.f187437b & 8) == 8) {
                    codedOutputStream.writeEnum(3, this.f.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.writeRawVarint32(34);
                    codedOutputStream.writeRawVarint32(this.f187440h);
                }
                for (int i = 0; i < this.f187439g.size(); i++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.f187439g.get(i)).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.writeRawVarint32(42);
                    codedOutputStream.writeRawVarint32(this.f187441j);
                }
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.i.get(i2)).intValue());
                }
                if ((this.f187437b & 4) == 4) {
                    codedOutputStream.writeBytes(6, getStringBytes());
                }
                codedOutputStream.writeRawBytes(this.f187436a);
            }

            public static Builder newBuilder(Record record) {
                return newBuilder().mergeFrom(record);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Record getDefaultInstanceForType() {
                return f187435m;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Record(CodedInputStream codedInputStream) {
                this.f187440h = -1;
                this.f187441j = -1;
                this.k = (byte) -1;
                this.f187442l = -1;
                this.f187438c = 1;
                boolean z = false;
                this.d = 0;
                this.e = "";
                this.f = Operation.NONE;
                List list = Collections.EMPTY_LIST;
                this.f187439g = list;
                this.i = list;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                int i = 0;
                while (!z) {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 8) {
                                    this.f187437b |= 1;
                                    this.f187438c = codedInputStream.readInt32();
                                } else if (tag2 == 16) {
                                    this.f187437b |= 2;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag2 == 24) {
                                    int i2 = codedInputStream.readEnum();
                                    Operation operationValueOf = Operation.valueOf(i2);
                                    if (operationValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                        codedOutputStreamNewInstance.writeRawVarint32(i2);
                                    } else {
                                        this.f187437b |= 8;
                                        this.f = operationValueOf;
                                    }
                                } else if (tag2 == 32) {
                                    if ((i & 16) != 16) {
                                        this.f187439g = new ArrayList();
                                        i |= 16;
                                    }
                                    this.f187439g.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag2 == 34) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 16) != 16 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f187439g = new ArrayList();
                                        i |= 16;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f187439g.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag2 == 40) {
                                    if ((i & 32) != 32) {
                                        this.i = new ArrayList();
                                        i |= 32;
                                    }
                                    this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag2 == 42) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.i = new ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                } else if (tag2 != 50) {
                                    if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.f187437b |= 4;
                                    this.e = bytes;
                                }
                            }
                            z = true;
                        } catch (Throwable th10) {
                            if ((i & 16) == 16) {
                                this.f187439g = Collections.unmodifiableList(this.f187439g);
                            }
                            if ((i & 32) == 32) {
                                this.i = Collections.unmodifiableList(this.i);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th11) {
                                this.f187436a = outputNewOutput.toByteString();
                                throw th11;
                            }
                            this.f187436a = outputNewOutput.toByteString();
                            throw th10;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                }
                if ((i & 16) == 16) {
                    this.f187439g = Collections.unmodifiableList(this.f187439g);
                }
                if ((i & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th12) {
                    this.f187436a = outputNewOutput.toByteString();
                    throw th12;
                }
                this.f187436a = outputNewOutput.toByteString();
            }

            public Record(Builder builder) {
                this.f187440h = -1;
                this.f187441j = -1;
                this.k = (byte) -1;
                this.f187442l = -1;
                this.f187436a = builder.getUnknownFields();
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f187429g = stringTableTypes;
            List list = Collections.EMPTY_LIST;
            stringTableTypes.f187431b = list;
            stringTableTypes.f187432c = list;
        }

        public StringTableTypes() {
            this.d = -1;
            this.e = (byte) -1;
            this.f = -1;
            this.f187430a = ByteString.EMPTY;
        }

        public static StringTableTypes getDefaultInstance() {
            return f187429g;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public List<Integer> getLocalNameList() {
            return this.f187432c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.f187431b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.f187431b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f187431b.get(i2));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.f187432c.size(); i3++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187432c.get(i3)).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeMessageSize + iComputeInt32SizeNoTag;
            if (!getLocalNameList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.d = iComputeInt32SizeNoTag;
            int size = this.f187430a.size() + iComputeInt32SizeNoTag2;
            this.f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.e;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f187431b.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f187431b.get(i));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(42);
                codedOutputStream.writeRawVarint32(this.d);
            }
            for (int i2 = 0; i2 < this.f187432c.size(); i2++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f187432c.get(i2)).intValue());
            }
            codedOutputStream.writeRawBytes(this.f187430a);
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mergeFrom(stringTableTypes);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTableTypes getDefaultInstanceForType() {
            return f187429g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.d = -1;
            this.e = (byte) -1;
            this.f = -1;
            List list = Collections.EMPTY_LIST;
            this.f187431b = list;
            this.f187432c = list;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 10) {
                                    if ((i & 1) != 1) {
                                        this.f187431b = new ArrayList();
                                        i |= 1;
                                    }
                                    this.f187431b.add(codedInputStream.readMessage(Record.PARSER, extensionRegistryLite));
                                } else if (tag2 == 40) {
                                    if ((i & 2) != 2) {
                                        this.f187432c = new ArrayList();
                                        i |= 2;
                                    }
                                    this.f187432c.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag2 != 42) {
                                    if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f187432c = new ArrayList();
                                        i |= 2;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f187432c.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th10) {
                    if ((i & 1) == 1) {
                        this.f187431b = Collections.unmodifiableList(this.f187431b);
                    }
                    if ((i & 2) == 2) {
                        this.f187432c = Collections.unmodifiableList(this.f187432c);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187430a = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187430a = outputNewOutput.toByteString();
                    throw th10;
                }
            }
            if ((i & 1) == 1) {
                this.f187431b = Collections.unmodifiableList(this.f187431b);
            }
            if ((i & 2) == 2) {
                this.f187432c = Collections.unmodifiableList(this.f187432c);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187430a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187430a = outputNewOutput.toByteString();
        }

        public StringTableTypes(Builder builder) {
            this.d = -1;
            this.e = (byte) -1;
            this.f = -1;
            this.f187430a = builder.getUnknownFields();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor defaultInstance = ProtoBuf.Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        flags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        isRaw = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        jvmClassFlags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(constructorSignature);
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(lambdaClassOriginName);
        extensionRegistryLite.add(propertySignature);
        extensionRegistryLite.add(flags);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(isRaw);
        extensionRegistryLite.add(typeParameterAnnotation);
        extensionRegistryLite.add(classModuleName);
        extensionRegistryLite.add(classLocalVariable);
        extensionRegistryLite.add(anonymousObjectOriginName);
        extensionRegistryLite.add(jvmClassFlags);
        extensionRegistryLite.add(packageModuleName);
        extensionRegistryLite.add(packageLocalVariable);
    }
}
