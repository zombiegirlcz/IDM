package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.youTransactor.uCube.rpc.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes14.dex */
public final class ProtoBuf {

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Annotation f187117g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187120c;
        public List d;
        public byte e;
        public int f;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new b();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final Argument f187121g;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ByteString f187122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187123b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187124c;
            public Value d;
            public byte e;
            public int f;

            /* JADX INFO: loaded from: classes14.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f187125b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f187126c;
                public Value d = Value.getDefaultInstance();

                public static Builder b() {
                    return new Builder();
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.f187125b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.f187124c = this.f187126c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.d = this.d;
                    argument.f187123b = i2;
                    return argument;
                }

                public Value getValue() {
                    return this.d;
                }

                public boolean hasNameId() {
                    return (this.f187125b & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.f187125b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                public Builder mergeValue(Value value) {
                    if ((this.f187125b & 2) != 2 || this.d == Value.getDefaultInstance()) {
                        this.d = value;
                    } else {
                        this.d = Value.newBuilder(this.d).mergeFrom(value).buildPartial();
                    }
                    this.f187125b |= 2;
                    return this;
                }

                public Builder setNameId(int i) {
                    this.f187125b |= 1;
                    this.f187126c = i;
                    return this;
                }

                public Builder setValue(Value value) {
                    value.getClass();
                    this.d = value;
                    this.f187125b |= 2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw new UninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo3794clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f187122a));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new c();

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public static final Value f187127p;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ByteString f187128a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f187129b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Type f187130c;
                public long d;
                public float e;
                public double f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public int f187131g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public int f187132h;
                public int i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Annotation f187133j;
                public List k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public int f187134l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public int f187135m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public byte f187136n;
                public int o;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f187137b;
                    public long d;
                    public float e;
                    public double f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public int f187139g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public int f187140h;
                    public int i;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public int f187142l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public int f187143m;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Type f187138c = Type.BYTE;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public Annotation f187141j = Annotation.getDefaultInstance();
                    public List k = Collections.EMPTY_LIST;

                    public Builder addArrayElement(Builder builder) {
                        if ((this.f187137b & 256) != 256) {
                            this.k = new ArrayList(this.k);
                            this.f187137b |= 256;
                        }
                        this.k.add(builder.build());
                        return this;
                    }

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i = this.f187137b;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.f187130c = this.f187138c;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.d = this.d;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.e = this.e;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.f = this.f;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.f187131g = this.f187139g;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.f187132h = this.f187140h;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.i = this.i;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.f187133j = this.f187141j;
                        if ((i & 256) == 256) {
                            this.k = Collections.unmodifiableList(this.k);
                            this.f187137b &= -257;
                        }
                        value.k = this.k;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.f187134l = this.f187142l;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.f187135m = this.f187143m;
                        value.f187129b = i2;
                        return value;
                    }

                    public Annotation getAnnotation() {
                        return this.f187141j;
                    }

                    public Value getArrayElement(int i) {
                        return (Value) this.k.get(i);
                    }

                    public int getArrayElementCount() {
                        return this.k.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.f187137b & 128) == 128;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.f187137b & 128) != 128 || this.f187141j == Annotation.getDefaultInstance()) {
                            this.f187141j = annotation;
                        } else {
                            this.f187141j = Annotation.newBuilder(this.f187141j).mergeFrom(annotation).buildPartial();
                        }
                        this.f187137b |= 128;
                        return this;
                    }

                    public Builder setAnnotation(Annotation annotation) {
                        annotation.getClass();
                        this.f187141j = annotation;
                        this.f187137b |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i) {
                        this.f187137b |= 512;
                        this.f187142l = i;
                        return this;
                    }

                    public Builder setClassId(int i) {
                        this.f187137b |= 32;
                        this.f187140h = i;
                        return this;
                    }

                    public Builder setDoubleValue(double d) {
                        this.f187137b |= 8;
                        this.f = d;
                        return this;
                    }

                    public Builder setEnumValueId(int i) {
                        this.f187137b |= 64;
                        this.i = i;
                        return this;
                    }

                    public Builder setFlags(int i) {
                        this.f187137b |= 1024;
                        this.f187143m = i;
                        return this;
                    }

                    public Builder setFloatValue(float f) {
                        this.f187137b |= 4;
                        this.e = f;
                        return this;
                    }

                    public Builder setIntValue(long j2) {
                        this.f187137b |= 2;
                        this.d = j2;
                        return this;
                    }

                    public Builder setStringValue(int i) {
                        this.f187137b |= 16;
                        this.f187139g = i;
                        return this;
                    }

                    public Builder setType(Type type) {
                        type.getClass();
                        this.f187137b |= 1;
                        this.f187138c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw new UninitializedMessageException(valueBuildPartial);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo3794clone() {
                        return new Builder().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.k.isEmpty()) {
                            if (this.k.isEmpty()) {
                                this.k = value.k;
                                this.f187137b &= -257;
                            } else {
                                if ((this.f187137b & 256) != 256) {
                                    this.k = new ArrayList(this.k);
                                    this.f187137b |= 256;
                                }
                                this.k.addAll(value.k);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.f187128a));
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> Lf
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
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    private static Internal.EnumLiteMap<Type> internalValueMap = new d();
                    private final int value;

                    Type(int i) {
                        this.value = i;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                static {
                    Value value = new Value();
                    f187127p = value;
                    value.a();
                }

                public Value() {
                    this.f187136n = (byte) -1;
                    this.o = -1;
                    this.f187128a = ByteString.EMPTY;
                }

                public static Value getDefaultInstance() {
                    return f187127p;
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                public final void a() {
                    this.f187130c = Type.BYTE;
                    this.d = 0L;
                    this.e = BitmapDescriptorFactory.HUE_RED;
                    this.f = 0.0d;
                    this.f187131g = 0;
                    this.f187132h = 0;
                    this.i = 0;
                    this.f187133j = Annotation.getDefaultInstance();
                    this.k = Collections.EMPTY_LIST;
                    this.f187134l = 0;
                    this.f187135m = 0;
                }

                public Annotation getAnnotation() {
                    return this.f187133j;
                }

                public int getArrayDimensionCount() {
                    return this.f187134l;
                }

                public Value getArrayElement(int i) {
                    return (Value) this.k.get(i);
                }

                public int getArrayElementCount() {
                    return this.k.size();
                }

                public List<Value> getArrayElementList() {
                    return this.k;
                }

                public int getClassId() {
                    return this.f187132h;
                }

                public double getDoubleValue() {
                    return this.f;
                }

                public int getEnumValueId() {
                    return this.i;
                }

                public int getFlags() {
                    return this.f187135m;
                }

                public float getFloatValue() {
                    return this.e;
                }

                public long getIntValue() {
                    return this.d;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.o;
                    if (i != -1) {
                        return i;
                    }
                    int iComputeEnumSize = (this.f187129b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f187130c.getNumber()) : 0;
                    if ((this.f187129b & 2) == 2) {
                        iComputeEnumSize += CodedOutputStream.computeSInt64Size(2, this.d);
                    }
                    if ((this.f187129b & 4) == 4) {
                        iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.e);
                    }
                    if ((this.f187129b & 8) == 8) {
                        iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.f);
                    }
                    if ((this.f187129b & 16) == 16) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(5, this.f187131g);
                    }
                    if ((this.f187129b & 32) == 32) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.f187132h);
                    }
                    if ((this.f187129b & 64) == 64) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(7, this.i);
                    }
                    if ((this.f187129b & 128) == 128) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(8, this.f187133j);
                    }
                    for (int i2 = 0; i2 < this.k.size(); i2++) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.k.get(i2));
                    }
                    if ((this.f187129b & 512) == 512) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(10, this.f187135m);
                    }
                    if ((this.f187129b & 256) == 256) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(11, this.f187134l);
                    }
                    int size = this.f187128a.size() + iComputeEnumSize;
                    this.o = size;
                    return size;
                }

                public int getStringValue() {
                    return this.f187131g;
                }

                public Type getType() {
                    return this.f187130c;
                }

                public boolean hasAnnotation() {
                    return (this.f187129b & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.f187129b & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.f187129b & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.f187129b & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.f187129b & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.f187129b & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.f187129b & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.f187129b & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.f187129b & 16) == 16;
                }

                public boolean hasType() {
                    return (this.f187129b & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b4 = this.f187136n;
                    if (b4 == 1) {
                        return true;
                    }
                    if (b4 == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.f187136n = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.f187136n = (byte) 0;
                            return false;
                        }
                    }
                    this.f187136n = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.f187129b & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.f187130c.getNumber());
                    }
                    if ((this.f187129b & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.d);
                    }
                    if ((this.f187129b & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.e);
                    }
                    if ((this.f187129b & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.f);
                    }
                    if ((this.f187129b & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.f187131g);
                    }
                    if ((this.f187129b & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.f187132h);
                    }
                    if ((this.f187129b & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.i);
                    }
                    if ((this.f187129b & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.f187133j);
                    }
                    for (int i = 0; i < this.k.size(); i++) {
                        codedOutputStream.writeMessage(9, (MessageLite) this.k.get(i));
                    }
                    if ((this.f187129b & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.f187135m);
                    }
                    if ((this.f187129b & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.f187134l);
                    }
                    codedOutputStream.writeRawBytes(this.f187128a);
                }

                public static Builder newBuilder() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return f187127p;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    this.f187136n = (byte) -1;
                    this.o = -1;
                    a();
                    ByteString.Output outputNewOutput = ByteString.newOutput();
                    CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z = false;
                    char c2 = 0;
                    while (true) {
                        ?? SkipField = 256;
                        if (!z) {
                            try {
                                try {
                                    int tag2 = codedInputStream.readTag();
                                    switch (tag2) {
                                        case 0:
                                            z = true;
                                            break;
                                        case 8:
                                            int i = codedInputStream.readEnum();
                                            Type typeValueOf = Type.valueOf(i);
                                            if (typeValueOf == null) {
                                                codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                                codedOutputStreamNewInstance.writeRawVarint32(i);
                                            } else {
                                                this.f187129b |= 1;
                                                this.f187130c = typeValueOf;
                                            }
                                            break;
                                        case 16:
                                            this.f187129b |= 2;
                                            this.d = codedInputStream.readSInt64();
                                            break;
                                        case 29:
                                            this.f187129b |= 4;
                                            this.e = codedInputStream.readFloat();
                                            break;
                                        case 33:
                                            this.f187129b |= 8;
                                            this.f = codedInputStream.readDouble();
                                            break;
                                        case 40:
                                            this.f187129b |= 16;
                                            this.f187131g = codedInputStream.readInt32();
                                            break;
                                        case 48:
                                            this.f187129b |= 32;
                                            this.f187132h = codedInputStream.readInt32();
                                            break;
                                        case 56:
                                            this.f187129b |= 64;
                                            this.i = codedInputStream.readInt32();
                                            break;
                                        case 66:
                                            Builder builder = (this.f187129b & 128) == 128 ? this.f187133j.toBuilder() : null;
                                            Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                            this.f187133j = annotation;
                                            if (builder != null) {
                                                builder.mergeFrom(annotation);
                                                this.f187133j = builder.buildPartial();
                                            }
                                            this.f187129b |= 128;
                                            break;
                                        case 74:
                                            if ((c2 & 256) != 256) {
                                                this.k = new ArrayList();
                                                c2 = 256;
                                            }
                                            this.k.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                            break;
                                        case 80:
                                            this.f187129b |= 512;
                                            this.f187135m = codedInputStream.readInt32();
                                            break;
                                        case 88:
                                            this.f187129b |= 256;
                                            this.f187134l = codedInputStream.readInt32();
                                            break;
                                        default:
                                            SkipField = codedInputStream.skipField(tag2, codedOutputStreamNewInstance);
                                            if (SkipField == 0) {
                                                z = true;
                                            }
                                            break;
                                    }
                                } catch (Throwable th10) {
                                    if ((c2 & 256) == SkipField) {
                                        this.k = Collections.unmodifiableList(this.k);
                                    }
                                    try {
                                        codedOutputStreamNewInstance.flush();
                                    } catch (IOException unused) {
                                    } catch (Throwable th11) {
                                        this.f187128a = outputNewOutput.toByteString();
                                        throw th11;
                                    }
                                    this.f187128a = outputNewOutput.toByteString();
                                    throw th10;
                                }
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e2) {
                                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                            }
                        } else {
                            if ((c2 & 256) == 256) {
                                this.k = Collections.unmodifiableList(this.k);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused2) {
                            } catch (Throwable th12) {
                                this.f187128a = outputNewOutput.toByteString();
                                throw th12;
                            }
                            this.f187128a = outputNewOutput.toByteString();
                            return;
                        }
                    }
                }

                public Value(Builder builder) {
                    this.f187136n = (byte) -1;
                    this.o = -1;
                    this.f187128a = builder.getUnknownFields();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                f187121g = argument;
                argument.f187124c = 0;
                argument.d = Value.getDefaultInstance();
            }

            public Argument() {
                this.e = (byte) -1;
                this.f = -1;
                this.f187122a = ByteString.EMPTY;
            }

            public static Argument getDefaultInstance() {
                return f187121g;
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            public int getNameId() {
                return this.f187124c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.f;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.f187123b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187124c) : 0;
                if ((this.f187123b & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.d);
                }
                int size = this.f187122a.size() + iComputeInt32Size;
                this.f = size;
                return size;
            }

            public Value getValue() {
                return this.d;
            }

            public boolean hasNameId() {
                return (this.f187123b & 1) == 1;
            }

            public boolean hasValue() {
                return (this.f187123b & 2) == 2;
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
                if (!hasNameId()) {
                    this.e = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.e = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.e = (byte) 1;
                    return true;
                }
                this.e = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f187123b & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f187124c);
                }
                if ((this.f187123b & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.d);
                }
                codedOutputStream.writeRawBytes(this.f187122a);
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f187121g;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.e = (byte) -1;
                this.f = -1;
                boolean z = false;
                this.f187124c = 0;
                this.d = Value.getDefaultInstance();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int tag2 = codedInputStream.readTag();
                                if (tag2 != 0) {
                                    if (tag2 == 8) {
                                        this.f187123b |= 1;
                                        this.f187124c = codedInputStream.readInt32();
                                    } else if (tag2 != 18) {
                                        if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                        }
                                    } else {
                                        Value.Builder builder = (this.f187123b & 2) == 2 ? this.d.toBuilder() : null;
                                        Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                        this.d = value;
                                        if (builder != null) {
                                            builder.mergeFrom(value);
                                            this.d = builder.buildPartial();
                                        }
                                        this.f187123b |= 2;
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
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187122a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187122a = outputNewOutput.toByteString();
                        throw th10;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th12) {
                    this.f187122a = outputNewOutput.toByteString();
                    throw th12;
                }
                this.f187122a = outputNewOutput.toByteString();
            }

            public Argument(Builder builder) {
                this.e = (byte) -1;
                this.f = -1;
                this.f187122a = builder.getUnknownFields();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187144b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187145c;
            public List d = Collections.EMPTY_LIST;

            public Builder addArgument(Argument.Builder builder) {
                if ((this.f187144b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.f187144b |= 2;
                }
                this.d.add(builder.build());
                return this;
            }

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i = this.f187144b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                annotation.f187120c = this.f187145c;
                if ((i & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.f187144b &= -3;
                }
                annotation.d = this.d;
                annotation.f187119b = i2;
                return annotation;
            }

            public Argument getArgument(int i) {
                return (Argument) this.d.get(i);
            }

            public int getArgumentCount() {
                return this.d.size();
            }

            public boolean hasId() {
                return (this.f187144b & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setId(int i) {
                this.f187144b |= 1;
                this.f187145c = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw new UninitializedMessageException(annotationBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.d.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = annotation.d;
                        this.f187144b &= -3;
                    } else {
                        if ((this.f187144b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.f187144b |= 2;
                        }
                        this.d.addAll(annotation.d);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.f187118a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
            }
        }

        static {
            Annotation annotation = new Annotation();
            f187117g = annotation;
            annotation.f187120c = 0;
            annotation.d = Collections.EMPTY_LIST;
        }

        public Annotation() {
            this.e = (byte) -1;
            this.f = -1;
            this.f187118a = ByteString.EMPTY;
        }

        public static Annotation getDefaultInstance() {
            return f187117g;
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public Argument getArgument(int i) {
            return (Argument) this.d.get(i);
        }

        public int getArgumentCount() {
            return this.d.size();
        }

        public List<Argument> getArgumentList() {
            return this.d;
        }

        public int getId() {
            return this.f187120c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187119b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187120c) : 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.d.get(i2));
            }
            int size = this.f187118a.size() + iComputeInt32Size;
            this.f = size;
            return size;
        }

        public boolean hasId() {
            return (this.f187119b & 1) == 1;
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
            if (!hasId()) {
                this.e = (byte) 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.e = (byte) 0;
                    return false;
                }
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187119b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f187120c);
            }
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.d.get(i));
            }
            codedOutputStream.writeRawBytes(this.f187118a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return f187117g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.e = (byte) -1;
            this.f = -1;
            boolean z = false;
            this.f187120c = 0;
            this.d = Collections.EMPTY_LIST;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            char c2 = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 8) {
                                    this.f187119b |= 1;
                                    this.f187120c = codedInputStream.readInt32();
                                } else if (tag2 != 18) {
                                    if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    if ((c2 & 2) != 2) {
                                        this.d = new ArrayList();
                                        c2 = 2;
                                    }
                                    this.d.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
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
                    if ((c2 & 2) == 2) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187118a = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187118a = outputNewOutput.toByteString();
                    throw th10;
                }
            }
            if ((c2 & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187118a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187118a = outputNewOutput.toByteString();
        }

        public Annotation(Builder builder) {
            this.e = (byte) -1;
            this.f = -1;
            this.f187118a = builder.getUnknownFields();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static final Class G;
        public static Parser<Class> PARSER = new e();
        public TypeTable A;
        public List B;
        public VersionRequirementTable C;
        public List D;
        public byte E;
        public int F;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187147c;
        public int d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f187148g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f187149h;
        public List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187150j;
        public List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f187151l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f187152m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f187153n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List f187154p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List f187155q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List f187156r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f187157s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f187158t;
        public List u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f187159w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Type f187160x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f187161y;
        public List z;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            public List A;
            public int d;
            public int e = 6;
            public int f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187162g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public List f187163h;
            public List i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public List f187164j;
            public List k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public List f187165l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public List f187166m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public List f187167n;
            public List o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public List f187168p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public List f187169q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public List f187170r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public List f187171s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f187172t;
            public Type u;
            public int v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public List f187173w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public TypeTable f187174x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public List f187175y;
            public VersionRequirementTable z;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f187163h = list;
                this.i = list;
                this.f187164j = list;
                this.k = list;
                this.f187165l = list;
                this.f187166m = list;
                this.f187167n = list;
                this.o = list;
                this.f187168p = list;
                this.f187169q = list;
                this.f187170r = list;
                this.f187171s = list;
                this.u = Type.getDefaultInstance();
                this.f187173w = list;
                this.f187174x = TypeTable.getDefaultInstance();
                this.f187175y = list;
                this.z = VersionRequirementTable.getDefaultInstance();
                this.A = list;
            }

            public static Builder c() {
                return new Builder();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 262144) != 262144) {
                    this.f187173w = new ArrayList(this.f187173w);
                    this.d |= 262144;
                }
                AbstractMessageLite.Builder.a(iterable, this.f187173w);
                return this;
            }

            public Class buildPartial() {
                Class r06 = new Class(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r06.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r06.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r06.f = this.f187162g;
                if ((i & 8) == 8) {
                    this.f187163h = Collections.unmodifiableList(this.f187163h);
                    this.d &= -9;
                }
                r06.f187148g = this.f187163h;
                if ((this.d & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                r06.f187149h = this.i;
                if ((this.d & 32) == 32) {
                    this.f187164j = Collections.unmodifiableList(this.f187164j);
                    this.d &= -33;
                }
                r06.i = this.f187164j;
                if ((this.d & 64) == 64) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.d &= -65;
                }
                r06.k = this.k;
                if ((this.d & 128) == 128) {
                    this.f187165l = Collections.unmodifiableList(this.f187165l);
                    this.d &= -129;
                }
                r06.f187152m = this.f187165l;
                if ((this.d & 256) == 256) {
                    this.f187166m = Collections.unmodifiableList(this.f187166m);
                    this.d &= -257;
                }
                r06.f187153n = this.f187166m;
                if ((this.d & 512) == 512) {
                    this.f187167n = Collections.unmodifiableList(this.f187167n);
                    this.d &= -513;
                }
                r06.f187154p = this.f187167n;
                if ((this.d & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= -1025;
                }
                r06.f187155q = this.o;
                if ((this.d & 2048) == 2048) {
                    this.f187168p = Collections.unmodifiableList(this.f187168p);
                    this.d &= -2049;
                }
                r06.f187156r = this.f187168p;
                if ((this.d & 4096) == 4096) {
                    this.f187169q = Collections.unmodifiableList(this.f187169q);
                    this.d &= -4097;
                }
                r06.f187157s = this.f187169q;
                if ((this.d & 8192) == 8192) {
                    this.f187170r = Collections.unmodifiableList(this.f187170r);
                    this.d &= -8193;
                }
                r06.f187158t = this.f187170r;
                if ((this.d & 16384) == 16384) {
                    this.f187171s = Collections.unmodifiableList(this.f187171s);
                    this.d &= -16385;
                }
                r06.u = this.f187171s;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r06.f187159w = this.f187172t;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r06.f187160x = this.u;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                r06.f187161y = this.v;
                if ((this.d & 262144) == 262144) {
                    this.f187173w = Collections.unmodifiableList(this.f187173w);
                    this.d &= -262145;
                }
                r06.z = this.f187173w;
                if ((i & 524288) == 524288) {
                    i2 |= 64;
                }
                r06.A = this.f187174x;
                if ((this.d & PKIFailureInfo.badCertTemplate) == 1048576) {
                    this.f187175y = Collections.unmodifiableList(this.f187175y);
                    this.d &= -1048577;
                }
                r06.B = this.f187175y;
                if ((i & PKIFailureInfo.badSenderNonce) == 2097152) {
                    i2 |= 128;
                }
                r06.C = this.z;
                if ((this.d & 4194304) == 4194304) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.d &= -4194305;
                }
                r06.D = this.A;
                r06.f187147c = i2;
                return r06;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.f187173w.get(i);
            }

            public int getAnnotationCount() {
                return this.f187173w.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.A.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.A.size();
            }

            public Constructor getConstructor(int i) {
                return (Constructor) this.f187167n.get(i);
            }

            public int getConstructorCount() {
                return this.f187167n.size();
            }

            public Type getContextReceiverType(int i) {
                return (Type) this.f187165l.get(i);
            }

            public int getContextReceiverTypeCount() {
                return this.f187165l.size();
            }

            public EnumEntry getEnumEntry(int i) {
                return (EnumEntry) this.f187170r.get(i);
            }

            public int getEnumEntryCount() {
                return this.f187170r.size();
            }

            public Function getFunction(int i) {
                return (Function) this.o.get(i);
            }

            public int getFunctionCount() {
                return this.o.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.u;
            }

            public Property getProperty(int i) {
                return (Property) this.f187168p.get(i);
            }

            public int getPropertyCount() {
                return this.f187168p.size();
            }

            public Type getSupertype(int i) {
                return (Type) this.i.get(i);
            }

            public int getSupertypeCount() {
                return this.i.size();
            }

            public TypeAlias getTypeAlias(int i) {
                return (TypeAlias) this.f187169q.get(i);
            }

            public int getTypeAliasCount() {
                return this.f187169q.size();
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.f187163h.get(i);
            }

            public int getTypeParameterCount() {
                return this.f187163h.size();
            }

            public TypeTable getTypeTable() {
                return this.f187174x;
            }

            public boolean hasFqName() {
                return (this.d & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.d & 65536) == 65536;
            }

            public boolean hasTypeTable() {
                return (this.d & 524288) == 524288;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                    if (!getContextReceiverType(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getConstructorCount(); i5++) {
                    if (!getConstructor(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getFunctionCount(); i6++) {
                    if (!getFunction(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i21 = 0; i21 < getPropertyCount(); i21++) {
                    if (!getProperty(i21).isInitialized()) {
                        return false;
                    }
                }
                for (int i22 = 0; i22 < getTypeAliasCount(); i22++) {
                    if (!getTypeAlias(i22).isInitialized()) {
                        return false;
                    }
                }
                for (int i32 = 0; i32 < getEnumEntryCount(); i32++) {
                    if (!getEnumEntry(i32).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i33 = 0; i33 < getAnnotationCount(); i33++) {
                    if (!getAnnotation(i33).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                for (int i43 = 0; i43 < getCompilerPluginDataCount(); i43++) {
                    if (!getCompilerPluginData(i43).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder mergeInlineClassUnderlyingType(Type type) {
                if ((this.d & 65536) != 65536 || this.u == Type.getDefaultInstance()) {
                    this.u = type;
                } else {
                    this.u = Type.newBuilder(this.u).mergeFrom(type).buildPartial();
                }
                this.d |= 65536;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.d & 524288) != 524288 || this.f187174x == TypeTable.getDefaultInstance()) {
                    this.f187174x = typeTable;
                } else {
                    this.f187174x = TypeTable.newBuilder(this.f187174x).mergeFrom(typeTable).buildPartial();
                }
                this.d |= 524288;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.d & PKIFailureInfo.badSenderNonce) != 2097152 || this.z == VersionRequirementTable.getDefaultInstance()) {
                    this.z = versionRequirementTable;
                } else {
                    this.z = VersionRequirementTable.newBuilder(this.z).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.d |= PKIFailureInfo.badSenderNonce;
                return this;
            }

            public Builder setCompanionObjectName(int i) {
                this.d |= 4;
                this.f187162g = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setFqName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i) {
                this.d |= 32768;
                this.f187172t = i;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i) {
                this.d |= 131072;
                this.v = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw new UninitializedMessageException(classBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r4) {
                if (r4 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r4.hasFlags()) {
                    setFlags(r4.getFlags());
                }
                if (r4.hasFqName()) {
                    setFqName(r4.getFqName());
                }
                if (r4.hasCompanionObjectName()) {
                    setCompanionObjectName(r4.getCompanionObjectName());
                }
                if (!r4.f187148g.isEmpty()) {
                    if (this.f187163h.isEmpty()) {
                        this.f187163h = r4.f187148g;
                        this.d &= -9;
                    } else {
                        if ((this.d & 8) != 8) {
                            this.f187163h = new ArrayList(this.f187163h);
                            this.d |= 8;
                        }
                        this.f187163h.addAll(r4.f187148g);
                    }
                }
                if (!r4.f187149h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = r4.f187149h;
                        this.d &= -17;
                    } else {
                        if ((this.d & 16) != 16) {
                            this.i = new ArrayList(this.i);
                            this.d |= 16;
                        }
                        this.i.addAll(r4.f187149h);
                    }
                }
                if (!r4.i.isEmpty()) {
                    if (this.f187164j.isEmpty()) {
                        this.f187164j = r4.i;
                        this.d &= -33;
                    } else {
                        if ((this.d & 32) != 32) {
                            this.f187164j = new ArrayList(this.f187164j);
                            this.d |= 32;
                        }
                        this.f187164j.addAll(r4.i);
                    }
                }
                if (!r4.k.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = r4.k;
                        this.d &= -65;
                    } else {
                        if ((this.d & 64) != 64) {
                            this.k = new ArrayList(this.k);
                            this.d |= 64;
                        }
                        this.k.addAll(r4.k);
                    }
                }
                if (!r4.f187152m.isEmpty()) {
                    if (this.f187165l.isEmpty()) {
                        this.f187165l = r4.f187152m;
                        this.d &= -129;
                    } else {
                        if ((this.d & 128) != 128) {
                            this.f187165l = new ArrayList(this.f187165l);
                            this.d |= 128;
                        }
                        this.f187165l.addAll(r4.f187152m);
                    }
                }
                if (!r4.f187153n.isEmpty()) {
                    if (this.f187166m.isEmpty()) {
                        this.f187166m = r4.f187153n;
                        this.d &= -257;
                    } else {
                        if ((this.d & 256) != 256) {
                            this.f187166m = new ArrayList(this.f187166m);
                            this.d |= 256;
                        }
                        this.f187166m.addAll(r4.f187153n);
                    }
                }
                if (!r4.f187154p.isEmpty()) {
                    if (this.f187167n.isEmpty()) {
                        this.f187167n = r4.f187154p;
                        this.d &= -513;
                    } else {
                        if ((this.d & 512) != 512) {
                            this.f187167n = new ArrayList(this.f187167n);
                            this.d |= 512;
                        }
                        this.f187167n.addAll(r4.f187154p);
                    }
                }
                if (!r4.f187155q.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = r4.f187155q;
                        this.d &= -1025;
                    } else {
                        if ((this.d & 1024) != 1024) {
                            this.o = new ArrayList(this.o);
                            this.d |= 1024;
                        }
                        this.o.addAll(r4.f187155q);
                    }
                }
                if (!r4.f187156r.isEmpty()) {
                    if (this.f187168p.isEmpty()) {
                        this.f187168p = r4.f187156r;
                        this.d &= -2049;
                    } else {
                        if ((this.d & 2048) != 2048) {
                            this.f187168p = new ArrayList(this.f187168p);
                            this.d |= 2048;
                        }
                        this.f187168p.addAll(r4.f187156r);
                    }
                }
                if (!r4.f187157s.isEmpty()) {
                    if (this.f187169q.isEmpty()) {
                        this.f187169q = r4.f187157s;
                        this.d &= -4097;
                    } else {
                        if ((this.d & 4096) != 4096) {
                            this.f187169q = new ArrayList(this.f187169q);
                            this.d |= 4096;
                        }
                        this.f187169q.addAll(r4.f187157s);
                    }
                }
                if (!r4.f187158t.isEmpty()) {
                    if (this.f187170r.isEmpty()) {
                        this.f187170r = r4.f187158t;
                        this.d &= -8193;
                    } else {
                        if ((this.d & 8192) != 8192) {
                            this.f187170r = new ArrayList(this.f187170r);
                            this.d |= 8192;
                        }
                        this.f187170r.addAll(r4.f187158t);
                    }
                }
                if (!r4.u.isEmpty()) {
                    if (this.f187171s.isEmpty()) {
                        this.f187171s = r4.u;
                        this.d &= -16385;
                    } else {
                        if ((this.d & 16384) != 16384) {
                            this.f187171s = new ArrayList(this.f187171s);
                            this.d |= 16384;
                        }
                        this.f187171s.addAll(r4.u);
                    }
                }
                if (r4.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r4.getInlineClassUnderlyingPropertyName());
                }
                if (r4.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r4.getInlineClassUnderlyingType());
                }
                if (r4.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r4.getInlineClassUnderlyingTypeId());
                }
                if (!r4.z.isEmpty()) {
                    if (this.f187173w.isEmpty()) {
                        this.f187173w = r4.z;
                        this.d &= -262145;
                    } else {
                        if ((this.d & 262144) != 262144) {
                            this.f187173w = new ArrayList(this.f187173w);
                            this.d |= 262144;
                        }
                        this.f187173w.addAll(r4.z);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (!r4.B.isEmpty()) {
                    if (this.f187175y.isEmpty()) {
                        this.f187175y = r4.B;
                        this.d &= -1048577;
                    } else {
                        if ((this.d & PKIFailureInfo.badCertTemplate) != 1048576) {
                            this.f187175y = new ArrayList(this.f187175y);
                            this.d |= PKIFailureInfo.badCertTemplate;
                        }
                        this.f187175y.addAll(r4.B);
                    }
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                if (!r4.D.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = r4.D;
                        this.d &= -4194305;
                    } else {
                        if ((this.d & 4194304) != 4194304) {
                            this.A = new ArrayList(this.A);
                            this.d |= 4194304;
                        }
                        this.A.addAll(r4.D);
                    }
                }
                b(r4);
                setUnknownFields(getUnknownFields().concat(r4.f187146b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Builder");
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);

            private static Internal.EnumLiteMap<Kind> internalValueMap = new f();
            private final int value;

            Kind(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        static {
            Class r06 = new Class();
            G = r06;
            r06.e();
        }

        public Class(Builder builder) {
            super(builder);
            this.f187150j = -1;
            this.f187151l = -1;
            this.o = -1;
            this.v = -1;
            this.E = (byte) -1;
            this.F = -1;
            this.f187146b = builder.getUnknownFields();
        }

        public static Class getDefaultInstance() {
            return G;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public final void e() {
            this.d = 6;
            this.e = 0;
            this.f = 0;
            List list = Collections.EMPTY_LIST;
            this.f187148g = list;
            this.f187149h = list;
            this.i = list;
            this.k = list;
            this.f187152m = list;
            this.f187153n = list;
            this.f187154p = list;
            this.f187155q = list;
            this.f187156r = list;
            this.f187157s = list;
            this.f187158t = list;
            this.u = list;
            this.f187159w = 0;
            this.f187160x = Type.getDefaultInstance();
            this.f187161y = 0;
            this.z = list;
            this.A = TypeTable.getDefaultInstance();
            this.B = list;
            this.C = VersionRequirementTable.getDefaultInstance();
            this.D = list;
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.z.get(i);
        }

        public int getAnnotationCount() {
            return this.z.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.z;
        }

        public int getCompanionObjectName() {
            return this.f;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.D.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.D.size();
        }

        public Constructor getConstructor(int i) {
            return (Constructor) this.f187154p.get(i);
        }

        public int getConstructorCount() {
            return this.f187154p.size();
        }

        public List<Constructor> getConstructorList() {
            return this.f187154p;
        }

        public Type getContextReceiverType(int i) {
            return (Type) this.f187152m.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.f187152m.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f187153n;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f187152m;
        }

        public EnumEntry getEnumEntry(int i) {
            return (EnumEntry) this.f187158t.get(i);
        }

        public int getEnumEntryCount() {
            return this.f187158t.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.f187158t;
        }

        public int getFlags() {
            return this.d;
        }

        public int getFqName() {
            return this.e;
        }

        public Function getFunction(int i) {
            return (Function) this.f187155q.get(i);
        }

        public int getFunctionCount() {
            return this.f187155q.size();
        }

        public List<Function> getFunctionList() {
            return this.f187155q;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.f187159w;
        }

        public Type getInlineClassUnderlyingType() {
            return this.f187160x;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.f187161y;
        }

        public List<Integer> getNestedClassNameList() {
            return this.k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return (Property) this.f187156r.get(i);
        }

        public int getPropertyCount() {
            return this.f187156r.size();
        }

        public List<Property> getPropertyList() {
            return this.f187156r;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.F;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187147c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.i.get(i2)).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f187150j = iComputeInt32SizeNoTag;
            if ((this.f187147c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(3, this.e);
            }
            if ((this.f187147c & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(4, this.f);
            }
            for (int i3 = 0; i3 < this.f187148g.size(); i3++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f187148g.get(i3));
            }
            for (int i5 = 0; i5 < this.f187149h.size(); i5++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f187149h.get(i5));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i6 = 0; i6 < this.k.size(); i6++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.k.get(i6)).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.f187151l = iComputeInt32SizeNoTag2;
            for (int i21 = 0; i21 < this.f187154p.size(); i21++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(8, (MessageLite) this.f187154p.get(i21));
            }
            for (int i22 = 0; i22 < this.f187155q.size(); i22++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f187155q.get(i22));
            }
            for (int i32 = 0; i32 < this.f187156r.size(); i32++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f187156r.get(i32));
            }
            for (int i33 = 0; i33 < this.f187157s.size(); i33++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(11, (MessageLite) this.f187157s.get(i33));
            }
            for (int i43 = 0; i43 < this.f187158t.size(); i43++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(13, (MessageLite) this.f187158t.get(i43));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i59 = 0; i59 < this.u.size(); i59++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.u.get(i59)).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.v = iComputeInt32SizeNoTag3;
            if ((this.f187147c & 8) == 8) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(17, this.f187159w);
            }
            if ((this.f187147c & 16) == 16) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(18, this.f187160x);
            }
            if ((this.f187147c & 32) == 32) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(19, this.f187161y);
            }
            for (int i66 = 0; i66 < this.f187152m.size(); i66++) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(20, (MessageLite) this.f187152m.get(i66));
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i74 = 0; i74 < this.f187153n.size(); i74++) {
                iComputeInt32SizeNoTag4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187153n.get(i74)).intValue());
            }
            int iComputeMessageSize4 = iComputeMessageSize3 + iComputeInt32SizeNoTag4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize4 = iComputeMessageSize4 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag4);
            }
            this.o = iComputeInt32SizeNoTag4;
            for (int i92 = 0; i92 < this.z.size(); i92++) {
                iComputeMessageSize4 += CodedOutputStream.computeMessageSize(25, (MessageLite) this.z.get(i92));
            }
            if ((this.f187147c & 64) == 64) {
                iComputeMessageSize4 += CodedOutputStream.computeMessageSize(30, this.A);
            }
            int iComputeInt32SizeNoTag5 = 0;
            for (int i96 = 0; i96 < this.B.size(); i96++) {
                iComputeInt32SizeNoTag5 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.B.get(i96)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize4 + iComputeInt32SizeNoTag5;
            if ((this.f187147c & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.C);
            }
            for (int i99 = 0; i99 < this.D.size(); i99++) {
                size += CodedOutputStream.computeMessageSize(33, (MessageLite) this.D.get(i99));
            }
            int size2 = this.f187146b.size() + a() + size;
            this.F = size2;
            return size2;
        }

        public Type getSupertype(int i) {
            return (Type) this.f187149h.get(i);
        }

        public int getSupertypeCount() {
            return this.f187149h.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.i;
        }

        public List<Type> getSupertypeList() {
            return this.f187149h;
        }

        public TypeAlias getTypeAlias(int i) {
            return (TypeAlias) this.f187157s.get(i);
        }

        public int getTypeAliasCount() {
            return this.f187157s.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f187157s;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.f187148g.get(i);
        }

        public int getTypeParameterCount() {
            return this.f187148g.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f187148g;
        }

        public TypeTable getTypeTable() {
            return this.A;
        }

        public List<Integer> getVersionRequirementList() {
            return this.B;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.C;
        }

        public boolean hasCompanionObjectName() {
            return (this.f187147c & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f187147c & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.f187147c & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.f187147c & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.f187147c & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.f187147c & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.f187147c & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f187147c & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.E;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.E = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                if (!getContextReceiverType(i3).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getConstructorCount(); i5++) {
                if (!getConstructor(i5).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getFunctionCount(); i6++) {
                if (!getFunction(i6).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i21 = 0; i21 < getPropertyCount(); i21++) {
                if (!getProperty(i21).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i22 = 0; i22 < getTypeAliasCount(); i22++) {
                if (!getTypeAlias(i22).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            for (int i32 = 0; i32 < getEnumEntryCount(); i32++) {
                if (!getEnumEntry(i32).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
            for (int i33 = 0; i33 < getAnnotationCount(); i33++) {
                if (!getAnnotation(i33).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
            for (int i43 = 0; i43 < getCompilerPluginDataCount(); i43++) {
                if (!getCompilerPluginData(i43).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.E = (byte) 1;
                return true;
            }
            this.E = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187147c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.f187150j);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.i.get(i)).intValue());
            }
            if ((this.f187147c & 2) == 2) {
                codedOutputStream.writeInt32(3, this.e);
            }
            if ((this.f187147c & 4) == 4) {
                codedOutputStream.writeInt32(4, this.f);
            }
            for (int i2 = 0; i2 < this.f187148g.size(); i2++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f187148g.get(i2));
            }
            for (int i3 = 0; i3 < this.f187149h.size(); i3++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f187149h.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.f187151l);
            }
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.k.get(i5)).intValue());
            }
            for (int i6 = 0; i6 < this.f187154p.size(); i6++) {
                codedOutputStream.writeMessage(8, (MessageLite) this.f187154p.get(i6));
            }
            for (int i21 = 0; i21 < this.f187155q.size(); i21++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.f187155q.get(i21));
            }
            for (int i22 = 0; i22 < this.f187156r.size(); i22++) {
                codedOutputStream.writeMessage(10, (MessageLite) this.f187156r.get(i22));
            }
            for (int i32 = 0; i32 < this.f187157s.size(); i32++) {
                codedOutputStream.writeMessage(11, (MessageLite) this.f187157s.get(i32));
            }
            for (int i33 = 0; i33 < this.f187158t.size(); i33++) {
                codedOutputStream.writeMessage(13, (MessageLite) this.f187158t.get(i33));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.v);
            }
            for (int i43 = 0; i43 < this.u.size(); i43++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.u.get(i43)).intValue());
            }
            if ((this.f187147c & 8) == 8) {
                codedOutputStream.writeInt32(17, this.f187159w);
            }
            if ((this.f187147c & 16) == 16) {
                codedOutputStream.writeMessage(18, this.f187160x);
            }
            if ((this.f187147c & 32) == 32) {
                codedOutputStream.writeInt32(19, this.f187161y);
            }
            for (int i59 = 0; i59 < this.f187152m.size(); i59++) {
                codedOutputStream.writeMessage(20, (MessageLite) this.f187152m.get(i59));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(170);
                codedOutputStream.writeRawVarint32(this.o);
            }
            for (int i66 = 0; i66 < this.f187153n.size(); i66++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f187153n.get(i66)).intValue());
            }
            for (int i74 = 0; i74 < this.z.size(); i74++) {
                codedOutputStream.writeMessage(25, (MessageLite) this.z.get(i74));
            }
            if ((this.f187147c & 64) == 64) {
                codedOutputStream.writeMessage(30, this.A);
            }
            for (int i92 = 0; i92 < this.B.size(); i92++) {
                codedOutputStream.writeInt32(31, ((Integer) this.B.get(i92)).intValue());
            }
            if ((this.f187147c & 128) == 128) {
                codedOutputStream.writeMessage(32, this.C);
            }
            for (int i96 = 0; i96 < this.D.size(); i96++) {
                codedOutputStream.writeMessage(33, (MessageLite) this.D.get(i96));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187146b);
        }

        public static Builder newBuilder(Class r110) {
            return newBuilder().mergeFrom(r110);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return G;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Class() {
            this.f187150j = -1;
            this.f187151l = -1;
            this.o = -1;
            this.v = -1;
            this.E = (byte) -1;
            this.F = -1;
            this.f187146b = ByteString.EMPTY;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r22, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1602
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {
        public static Parser<CompilerPluginData> PARSER = new g();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final CompilerPluginData f187176g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187179c;
        public ByteString d;
        public byte e;
        public int f;

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187180b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187181c;
            public ByteString d = ByteString.EMPTY;

            public CompilerPluginData buildPartial() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i = this.f187180b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                compilerPluginData.f187179c = this.f187181c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                compilerPluginData.d = this.d;
                compilerPluginData.f187178b = i2;
                return compilerPluginData;
            }

            public boolean hasData() {
                return (this.f187180b & 2) == 2;
            }

            public boolean hasPluginId() {
                return (this.f187180b & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPluginId() && hasData();
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.f187180b |= 2;
                this.d = byteString;
                return this;
            }

            public Builder setPluginId(int i) {
                this.f187180b |= 1;
                this.f187181c = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public CompilerPluginData build() {
                CompilerPluginData compilerPluginDataBuildPartial = buildPartial();
                if (compilerPluginDataBuildPartial.isInitialized()) {
                    return compilerPluginDataBuildPartial;
                }
                throw new UninitializedMessageException(compilerPluginDataBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public CompilerPluginData getDefaultInstanceForType() {
                return CompilerPluginData.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.getDefaultInstance()) {
                    return this;
                }
                if (compilerPluginData.hasPluginId()) {
                    setPluginId(compilerPluginData.getPluginId());
                }
                if (compilerPluginData.hasData()) {
                    setData(compilerPluginData.getData());
                }
                setUnknownFields(getUnknownFields().concat(compilerPluginData.f187177a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$Builder");
            }
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData();
            f187176g = compilerPluginData;
            compilerPluginData.f187179c = 0;
            compilerPluginData.d = ByteString.EMPTY;
        }

        public CompilerPluginData() {
            this.e = (byte) -1;
            this.f = -1;
            this.f187177a = ByteString.EMPTY;
        }

        public static CompilerPluginData getDefaultInstance() {
            return f187176g;
        }

        public static Builder newBuilder(CompilerPluginData compilerPluginData) {
            return newBuilder().mergeFrom(compilerPluginData);
        }

        public ByteString getData() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<CompilerPluginData> getParserForType() {
            return PARSER;
        }

        public int getPluginId() {
            return this.f187179c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187178b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187179c) : 0;
            if ((this.f187178b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(2, this.d);
            }
            int size = this.f187177a.size() + iComputeInt32Size;
            this.f = size;
            return size;
        }

        public boolean hasData() {
            return (this.f187178b & 2) == 2;
        }

        public boolean hasPluginId() {
            return (this.f187178b & 1) == 1;
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
            if (!hasPluginId()) {
                this.e = (byte) 0;
                return false;
            }
            if (hasData()) {
                this.e = (byte) 1;
                return true;
            }
            this.e = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187178b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f187179c);
            }
            if ((this.f187178b & 2) == 2) {
                codedOutputStream.writeBytes(2, this.d);
            }
            codedOutputStream.writeRawBytes(this.f187177a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public CompilerPluginData getDefaultInstanceForType() {
            return f187176g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public CompilerPluginData(CodedInputStream codedInputStream) {
            this.e = (byte) -1;
            this.f = -1;
            boolean z = false;
            this.f187179c = 0;
            this.d = ByteString.EMPTY;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 8) {
                                    this.f187178b |= 1;
                                    this.f187179c = codedInputStream.readInt32();
                                } else if (tag2 != 18) {
                                    if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    this.f187178b |= 2;
                                    this.d = codedInputStream.readBytes();
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
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187177a = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187177a = outputNewOutput.toByteString();
                    throw th10;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187177a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187177a = outputNewOutput.toByteString();
        }

        public CompilerPluginData(Builder builder) {
            this.e = (byte) -1;
            this.f = -1;
            this.f187177a = builder.getUnknownFields();
        }
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new h();
        public static final Constructor k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187183c;
        public int d;
        public List e;
        public List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f187184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f187185h;
        public byte i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187186j;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            public int d;
            public int e = 6;
            public List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List f187187g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public List f187188h;
            public List i;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f = list;
                this.f187187g = list;
                this.f187188h = list;
                this.i = list;
            }

            public static Builder c() {
                return new Builder();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                AbstractMessageLite.Builder.a(iterable, this.i);
                return this;
            }

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                constructor.d = this.e;
                if ((i & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                constructor.e = this.f;
                if ((this.d & 4) == 4) {
                    this.f187187g = Collections.unmodifiableList(this.f187187g);
                    this.d &= -5;
                }
                constructor.f = this.f187187g;
                if ((this.d & 8) == 8) {
                    this.f187188h = Collections.unmodifiableList(this.f187188h);
                    this.d &= -9;
                }
                constructor.f187184g = this.f187188h;
                if ((this.d & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                constructor.f187185h = this.i;
                constructor.f187183c = i2;
                return constructor;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.i.get(i);
            }

            public int getAnnotationCount() {
                return this.i.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.f187188h.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.f187188h.size();
            }

            public ValueParameter getValueParameter(int i) {
                return (ValueParameter) this.f.get(i);
            }

            public int getValueParameterCount() {
                return this.f.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                    if (!getCompilerPluginData(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                    if (!getAnnotation(i3).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw new UninitializedMessageException(constructorBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = constructor.e;
                        this.d &= -3;
                    } else {
                        if ((this.d & 2) != 2) {
                            this.f = new ArrayList(this.f);
                            this.d |= 2;
                        }
                        this.f.addAll(constructor.e);
                    }
                }
                if (!constructor.f.isEmpty()) {
                    if (this.f187187g.isEmpty()) {
                        this.f187187g = constructor.f;
                        this.d &= -5;
                    } else {
                        if ((this.d & 4) != 4) {
                            this.f187187g = new ArrayList(this.f187187g);
                            this.d |= 4;
                        }
                        this.f187187g.addAll(constructor.f);
                    }
                }
                if (!constructor.f187184g.isEmpty()) {
                    if (this.f187188h.isEmpty()) {
                        this.f187188h = constructor.f187184g;
                        this.d &= -9;
                    } else {
                        if ((this.d & 8) != 8) {
                            this.f187188h = new ArrayList(this.f187188h);
                            this.d |= 8;
                        }
                        this.f187188h.addAll(constructor.f187184g);
                    }
                }
                if (!constructor.f187185h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = constructor.f187185h;
                        this.d &= -17;
                    } else {
                        if ((this.d & 16) != 16) {
                            this.i = new ArrayList(this.i);
                            this.d |= 16;
                        }
                        this.i.addAll(constructor.f187185h);
                    }
                }
                b(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.f187182b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$Builder");
            }
        }

        static {
            Constructor constructor = new Constructor();
            k = constructor;
            constructor.d = 6;
            List list = Collections.EMPTY_LIST;
            constructor.e = list;
            constructor.f = list;
            constructor.f187184g = list;
            constructor.f187185h = list;
        }

        public Constructor(Builder builder) {
            super(builder);
            this.i = (byte) -1;
            this.f187186j = -1;
            this.f187182b = builder.getUnknownFields();
        }

        public static Constructor getDefaultInstance() {
            return k;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.f187185h.get(i);
        }

        public int getAnnotationCount() {
            return this.f187185h.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.f187185h;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.f187184g.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.f187184g.size();
        }

        public int getFlags() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187186j;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187183c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.e.get(i2));
            }
            for (int i3 = 0; i3 < this.f187185h.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f187185h.get(i3));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i5 = 0; i5 < this.f.size(); i5++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f.get(i5)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeInt32Size + iComputeInt32SizeNoTag;
            for (int i6 = 0; i6 < this.f187184g.size(); i6++) {
                size += CodedOutputStream.computeMessageSize(32, (MessageLite) this.f187184g.get(i6));
            }
            int size2 = this.f187182b.size() + a() + size;
            this.f187186j = size2;
            return size2;
        }

        public ValueParameter getValueParameter(int i) {
            return (ValueParameter) this.e.get(i);
        }

        public int getValueParameterCount() {
            return this.e.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.e;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f;
        }

        public boolean hasFlags() {
            return (this.f187183c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.i;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                if (!getCompilerPluginData(i2).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                if (!getAnnotation(i3).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.i = (byte) 1;
                return true;
            }
            this.i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187183c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            for (int i = 0; i < this.e.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.e.get(i));
            }
            for (int i2 = 0; i2 < this.f187185h.size(); i2++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f187185h.get(i2));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f.get(i3)).intValue());
            }
            for (int i5 = 0; i5 < this.f187184g.size(); i5++) {
                codedOutputStream.writeMessage(32, (MessageLite) this.f187184g.get(i5));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187182b);
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Constructor() {
            this.i = (byte) -1;
            this.f187186j = -1;
            this.f187182b = ByteString.EMPTY;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.i = (byte) -1;
            this.f187186j = -1;
            this.d = 6;
            List list = Collections.EMPTY_LIST;
            this.e = list;
            this.f = list;
            this.f187184g = list;
            this.f187185h = list;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 8) {
                                this.f187183c |= 1;
                                this.d = codedInputStream.readInt32();
                            } else if (tag2 == 18) {
                                if ((i & 2) != 2) {
                                    this.e = new ArrayList();
                                    i |= 2;
                                }
                                this.e.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (tag2 == 26) {
                                if ((i & 16) != 16) {
                                    this.f187185h = new ArrayList();
                                    i |= 16;
                                }
                                this.f187185h.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            } else if (tag2 == 248) {
                                if ((i & 4) != 4) {
                                    this.f = new ArrayList();
                                    i |= 4;
                                }
                                this.f.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag2 == 250) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f = new ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            } else if (tag2 != 258) {
                                if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                }
                            } else {
                                if ((i & 8) != 8) {
                                    this.f187184g = new ArrayList();
                                    i |= 8;
                                }
                                this.f187184g.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if ((i & 2) == 2) {
                            this.e = Collections.unmodifiableList(this.e);
                        }
                        if ((i & 16) == 16) {
                            this.f187185h = Collections.unmodifiableList(this.f187185h);
                        }
                        if ((i & 4) == 4) {
                            this.f = Collections.unmodifiableList(this.f);
                        }
                        if ((i & 8) == 8) {
                            this.f187184g = Collections.unmodifiableList(this.f187184g);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187182b = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187182b = outputNewOutput.toByteString();
                        b();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((i & 16) == 16) {
                this.f187185h = Collections.unmodifiableList(this.f187185h);
            }
            if ((i & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            if ((i & 8) == 8) {
                this.f187184g = Collections.unmodifiableList(this.f187184g);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187182b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187182b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new i();
        public static final Contract e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f187190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f187191c;
        public int d;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187192b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List f187193c = Collections.EMPTY_LIST;

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.f187192b & 1) == 1) {
                    this.f187193c = Collections.unmodifiableList(this.f187193c);
                    this.f187192b &= -2;
                }
                contract.f187190b = this.f187193c;
                return contract;
            }

            public Effect getEffect(int i) {
                return (Effect) this.f187193c.get(i);
            }

            public int getEffectCount() {
                return this.f187193c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw new UninitializedMessageException(contractBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.f187190b.isEmpty()) {
                    if (this.f187193c.isEmpty()) {
                        this.f187193c = contract.f187190b;
                        this.f187192b &= -2;
                    } else {
                        if ((this.f187192b & 1) != 1) {
                            this.f187193c = new ArrayList(this.f187193c);
                            this.f187192b |= 1;
                        }
                        this.f187193c.addAll(contract.f187190b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.f187189a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder");
            }
        }

        static {
            Contract contract = new Contract();
            e = contract;
            contract.f187190b = Collections.EMPTY_LIST;
        }

        public Contract() {
            this.f187191c = (byte) -1;
            this.d = -1;
            this.f187189a = ByteString.EMPTY;
        }

        public static Contract getDefaultInstance() {
            return e;
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        public Effect getEffect(int i) {
            return (Effect) this.f187190b.get(i);
        }

        public int getEffectCount() {
            return this.f187190b.size();
        }

        public List<Effect> getEffectList() {
            return this.f187190b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.f187190b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f187190b.get(i2));
            }
            int size = this.f187189a.size() + iComputeMessageSize;
            this.d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187191c;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.f187191c = (byte) 0;
                    return false;
                }
            }
            this.f187191c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f187190b.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f187190b.get(i));
            }
            codedOutputStream.writeRawBytes(this.f187189a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187191c = (byte) -1;
            this.d = -1;
            this.f187190b = Collections.EMPTY_LIST;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z3 = false;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 != 10) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f187190b = new ArrayList();
                                    z3 = true;
                                }
                                this.f187190b.add(codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (z3) {
                            this.f187190b = Collections.unmodifiableList(this.f187190b);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187189a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187189a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z3) {
                this.f187190b = Collections.unmodifiableList(this.f187190b);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187189a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187189a = outputNewOutput.toByteString();
        }

        public Contract(Builder builder) {
            this.f187191c = (byte) -1;
            this.d = -1;
            this.f187189a = builder.getUnknownFields();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new j();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Effect f187194j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EffectType f187197c;
        public List d;
        public Expression e;
        public InvocationKind f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public EffectConditionKind f187198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f187199h;
        public int i;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187200b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public EffectType f187201c = EffectType.RETURNS_CONSTANT;
            public List d = Collections.EMPTY_LIST;
            public Expression e = Expression.getDefaultInstance();
            public InvocationKind f = InvocationKind.AT_MOST_ONCE;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public EffectConditionKind f187202g = EffectConditionKind.CONCLUSION_CONDITION;

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i = this.f187200b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.f187197c = this.f187201c;
                if ((i & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.f187200b &= -3;
                }
                effect.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.f = this.f;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                effect.f187198g = this.f187202g;
                effect.f187196b = i2;
                return effect;
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.e;
            }

            public Expression getEffectConstructorArgument(int i) {
                return (Expression) this.d.get(i);
            }

            public int getEffectConstructorArgumentCount() {
                return this.d.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.f187200b & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.f187200b & 4) != 4 || this.e == Expression.getDefaultInstance()) {
                    this.e = expression;
                } else {
                    this.e = Expression.newBuilder(this.e).mergeFrom(expression).buildPartial();
                }
                this.f187200b |= 4;
                return this;
            }

            public Builder setConditionKind(EffectConditionKind effectConditionKind) {
                effectConditionKind.getClass();
                this.f187200b |= 16;
                this.f187202g = effectConditionKind;
                return this;
            }

            public Builder setEffectType(EffectType effectType) {
                effectType.getClass();
                this.f187200b |= 1;
                this.f187201c = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f187200b |= 8;
                this.f = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw new UninitializedMessageException(effectBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.d.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = effect.d;
                        this.f187200b &= -3;
                    } else {
                        if ((this.f187200b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.f187200b |= 2;
                        }
                        this.d.addAll(effect.d);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                if (effect.hasConditionKind()) {
                    setConditionKind(effect.getConditionKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.f187195a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$Builder");
            }
        }

        public enum EffectConditionKind implements Internal.EnumLite {
            CONCLUSION_CONDITION(0),
            RETURNS_CONDITION(1),
            HOLDSIN_CONDITION(2);

            private static Internal.EnumLiteMap<EffectConditionKind> internalValueMap = new k();
            private final int value;

            EffectConditionKind(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EffectConditionKind valueOf(int i) {
                if (i == 0) {
                    return CONCLUSION_CONDITION;
                }
                if (i == 1) {
                    return RETURNS_CONDITION;
                }
                if (i != 2) {
                    return null;
                }
                return HOLDSIN_CONDITION;
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new l();
            private final int value;

            EffectType(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new m();
            private final int value;

            InvocationKind(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        static {
            Effect effect = new Effect();
            f187194j = effect;
            effect.f187197c = EffectType.RETURNS_CONSTANT;
            effect.d = Collections.EMPTY_LIST;
            effect.e = Expression.getDefaultInstance();
            effect.f = InvocationKind.AT_MOST_ONCE;
            effect.f187198g = EffectConditionKind.CONCLUSION_CONDITION;
        }

        public Effect() {
            this.f187199h = (byte) -1;
            this.i = -1;
            this.f187195a = ByteString.EMPTY;
        }

        public static Effect getDefaultInstance() {
            return f187194j;
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.e;
        }

        public EffectConditionKind getConditionKind() {
            return this.f187198g;
        }

        public Expression getEffectConstructorArgument(int i) {
            return (Expression) this.d.get(i);
        }

        public int getEffectConstructorArgumentCount() {
            return this.d.size();
        }

        public List<Expression> getEffectConstructorArgumentList() {
            return this.d;
        }

        public EffectType getEffectType() {
            return this.f187197c;
        }

        public InvocationKind getKind() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.f187196b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f187197c.getNumber()) : 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.d.get(i2));
            }
            if ((this.f187196b & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.e);
            }
            if ((this.f187196b & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.f.getNumber());
            }
            if ((this.f187196b & 8) == 8) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(5, this.f187198g.getNumber());
            }
            int size = this.f187195a.size() + iComputeEnumSize;
            this.i = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.f187196b & 2) == 2;
        }

        public boolean hasConditionKind() {
            return (this.f187196b & 8) == 8;
        }

        public boolean hasEffectType() {
            return (this.f187196b & 1) == 1;
        }

        public boolean hasKind() {
            return (this.f187196b & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187199h;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.f187199h = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.f187199h = (byte) 1;
                return true;
            }
            this.f187199h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187196b & 1) == 1) {
                codedOutputStream.writeEnum(1, this.f187197c.getNumber());
            }
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.d.get(i));
            }
            if ((this.f187196b & 2) == 2) {
                codedOutputStream.writeMessage(3, this.e);
            }
            if ((this.f187196b & 4) == 4) {
                codedOutputStream.writeEnum(4, this.f.getNumber());
            }
            if ((this.f187196b & 8) == 8) {
                codedOutputStream.writeEnum(5, this.f187198g.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f187195a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return f187194j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187199h = (byte) -1;
            this.i = -1;
            this.f187197c = EffectType.RETURNS_CONSTANT;
            this.d = Collections.EMPTY_LIST;
            this.e = Expression.getDefaultInstance();
            this.f = InvocationKind.AT_MOST_ONCE;
            this.f187198g = EffectConditionKind.CONCLUSION_CONDITION;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            char c2 = 0;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 8) {
                                int i = codedInputStream.readEnum();
                                EffectType effectTypeValueOf = EffectType.valueOf(i);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i);
                                } else {
                                    this.f187196b |= 1;
                                    this.f187197c = effectTypeValueOf;
                                }
                            } else if (tag2 == 18) {
                                if ((c2 & 2) != 2) {
                                    this.d = new ArrayList();
                                    c2 = 2;
                                }
                                this.d.add(codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                            } else if (tag2 == 26) {
                                Expression.Builder builder = (this.f187196b & 2) == 2 ? this.e.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                this.e = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.e = builder.buildPartial();
                                }
                                this.f187196b |= 2;
                            } else if (tag2 == 32) {
                                int i2 = codedInputStream.readEnum();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(i2);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.f187196b |= 4;
                                    this.f = invocationKindValueOf;
                                }
                            } else if (tag2 != 40) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                int i3 = codedInputStream.readEnum();
                                EffectConditionKind effectConditionKindValueOf = EffectConditionKind.valueOf(i3);
                                if (effectConditionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i3);
                                } else {
                                    this.f187196b |= 8;
                                    this.f187198g = effectConditionKindValueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if ((c2 & 2) == 2) {
                            this.d = Collections.unmodifiableList(this.d);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187195a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187195a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c2 & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187195a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187195a = outputNewOutput.toByteString();
        }

        public Effect(Builder builder) {
            this.f187199h = (byte) -1;
            this.i = -1;
            this.f187195a = builder.getUnknownFields();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new n();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumEntry f187203h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187205c;
        public int d;
        public List e;
        public byte f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f187206g;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            public int d;
            public int e;
            public List f = Collections.EMPTY_LIST;

            public static Builder c() {
                return new Builder();
            }

            public Builder addAnnotation(Annotation annotation) {
                annotation.getClass();
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.add(annotation);
                return this;
            }

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                enumEntry.d = this.e;
                if ((i & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                enumEntry.e = this.f;
                enumEntry.f187205c = i2;
                return enumEntry;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.f.get(i);
            }

            public int getAnnotationCount() {
                return this.f.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder setName(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw new UninitializedMessageException(enumEntryBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                if (!enumEntry.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = enumEntry.e;
                        this.d &= -3;
                    } else {
                        if ((this.d & 2) != 2) {
                            this.f = new ArrayList(this.f);
                            this.d |= 2;
                        }
                        this.f.addAll(enumEntry.e);
                    }
                }
                b(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.f187204b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$Builder");
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            f187203h = enumEntry;
            enumEntry.d = 0;
            enumEntry.e = Collections.EMPTY_LIST;
        }

        public EnumEntry(Builder builder) {
            super(builder);
            this.f = (byte) -1;
            this.f187206g = -1;
            this.f187204b = builder.getUnknownFields();
        }

        public static EnumEntry getDefaultInstance() {
            return f187203h;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.e.get(i);
        }

        public int getAnnotationCount() {
            return this.e.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.e;
        }

        public int getName() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187206g;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187205c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.e.get(i2));
            }
            int size = this.f187204b.size() + a() + iComputeInt32Size;
            this.f187206g = size;
            return size;
        }

        public boolean hasName() {
            return (this.f187205c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.f = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.f = (byte) 1;
                return true;
            }
            this.f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187205c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            for (int i = 0; i < this.e.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.e.get(i));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187204b);
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return f187203h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public EnumEntry() {
            this.f = (byte) -1;
            this.f187206g = -1;
            this.f187204b = ByteString.EMPTY;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f = (byte) -1;
            this.f187206g = -1;
            boolean z = false;
            this.d = 0;
            this.e = Collections.EMPTY_LIST;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            char c2 = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 8) {
                                    this.f187205c |= 1;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag2 != 18) {
                                    if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                    }
                                } else {
                                    if ((c2 & 2) != 2) {
                                        this.e = new ArrayList();
                                        c2 = 2;
                                    }
                                    this.e.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
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
                    if ((c2 & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187204b = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187204b = outputNewOutput.toByteString();
                    b();
                    throw th10;
                }
            }
            if ((c2 & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187204b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187204b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new o();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Expression f187207l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187210c;
        public int d;
        public ConstantValue e;
        public Type f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f187211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f187212h;
        public List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f187213j;
        public int k;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187215c;
            public int d;
            public ConstantValue e = ConstantValue.TRUE;
            public Type f = Type.getDefaultInstance();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187216g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public List f187217h;
            public List i;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f187217h = list;
                this.i = list;
            }

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i = this.f187214b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.f187210c = this.f187215c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.f = this.f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.f187211g = this.f187216g;
                if ((i & 32) == 32) {
                    this.f187217h = Collections.unmodifiableList(this.f187217h);
                    this.f187214b &= -33;
                }
                expression.f187212h = this.f187217h;
                if ((this.f187214b & 64) == 64) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.f187214b &= -65;
                }
                expression.i = this.i;
                expression.f187209b = i2;
                return expression;
            }

            public Expression getAndArgument(int i) {
                return (Expression) this.f187217h.get(i);
            }

            public int getAndArgumentCount() {
                return this.f187217h.size();
            }

            public Type getIsInstanceType() {
                return this.f;
            }

            public Expression getOrArgument(int i) {
                return (Expression) this.i.get(i);
            }

            public int getOrArgumentCount() {
                return this.i.size();
            }

            public boolean hasIsInstanceType() {
                return (this.f187214b & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.f187214b & 8) != 8 || this.f == Type.getDefaultInstance()) {
                    this.f = type;
                } else {
                    this.f = Type.newBuilder(this.f).mergeFrom(type).buildPartial();
                }
                this.f187214b |= 8;
                return this;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                constantValue.getClass();
                this.f187214b |= 4;
                this.e = constantValue;
                return this;
            }

            public Builder setFlags(int i) {
                this.f187214b |= 1;
                this.f187215c = i;
                return this;
            }

            public Builder setIsInstanceTypeId(int i) {
                this.f187214b |= 16;
                this.f187216g = i;
                return this;
            }

            public Builder setValueParameterReference(int i) {
                this.f187214b |= 2;
                this.d = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw new UninitializedMessageException(expressionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.f187212h.isEmpty()) {
                    if (this.f187217h.isEmpty()) {
                        this.f187217h = expression.f187212h;
                        this.f187214b &= -33;
                    } else {
                        if ((this.f187214b & 32) != 32) {
                            this.f187217h = new ArrayList(this.f187217h);
                            this.f187214b |= 32;
                        }
                        this.f187217h.addAll(expression.f187212h);
                    }
                }
                if (!expression.i.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = expression.i;
                        this.f187214b &= -65;
                    } else {
                        if ((this.f187214b & 64) != 64) {
                            this.i = new ArrayList(this.i);
                            this.f187214b |= 64;
                        }
                        this.i.addAll(expression.i);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.f187208a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$Builder");
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new p();
            private final int value;

            ConstantValue(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }
        }

        static {
            Expression expression = new Expression();
            f187207l = expression;
            expression.f187210c = 0;
            expression.d = 0;
            expression.e = ConstantValue.TRUE;
            expression.f = Type.getDefaultInstance();
            expression.f187211g = 0;
            List list = Collections.EMPTY_LIST;
            expression.f187212h = list;
            expression.i = list;
        }

        public Expression() {
            this.f187213j = (byte) -1;
            this.k = -1;
            this.f187208a = ByteString.EMPTY;
        }

        public static Expression getDefaultInstance() {
            return f187207l;
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public Expression getAndArgument(int i) {
            return (Expression) this.f187212h.get(i);
        }

        public int getAndArgumentCount() {
            return this.f187212h.size();
        }

        public List<Expression> getAndArgumentList() {
            return this.f187212h;
        }

        public ConstantValue getConstantValue() {
            return this.e;
        }

        public int getFlags() {
            return this.f187210c;
        }

        public Type getIsInstanceType() {
            return this.f;
        }

        public int getIsInstanceTypeId() {
            return this.f187211g;
        }

        public Expression getOrArgument(int i) {
            return (Expression) this.i.get(i);
        }

        public int getOrArgumentCount() {
            return this.i.size();
        }

        public List<Expression> getOrArgumentList() {
            return this.i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.k;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187209b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187210c) : 0;
            if ((this.f187209b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            if ((this.f187209b & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
            }
            if ((this.f187209b & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f);
            }
            if ((this.f187209b & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f187211g);
            }
            for (int i2 = 0; i2 < this.f187212h.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f187212h.get(i2));
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.i.get(i3));
            }
            int size = this.f187208a.size() + iComputeInt32Size;
            this.k = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.d;
        }

        public boolean hasConstantValue() {
            return (this.f187209b & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f187209b & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.f187209b & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.f187209b & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.f187209b & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187213j;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.f187213j = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.f187213j = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.f187213j = (byte) 0;
                    return false;
                }
            }
            this.f187213j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187209b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f187210c);
            }
            if ((this.f187209b & 2) == 2) {
                codedOutputStream.writeInt32(2, this.d);
            }
            if ((this.f187209b & 4) == 4) {
                codedOutputStream.writeEnum(3, this.e.getNumber());
            }
            if ((this.f187209b & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f);
            }
            if ((this.f187209b & 16) == 16) {
                codedOutputStream.writeInt32(5, this.f187211g);
            }
            for (int i = 0; i < this.f187212h.size(); i++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f187212h.get(i));
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.i.get(i2));
            }
            codedOutputStream.writeRawBytes(this.f187208a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return f187207l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187213j = (byte) -1;
            this.k = -1;
            boolean z = false;
            this.f187210c = 0;
            this.d = 0;
            this.e = ConstantValue.TRUE;
            this.f = Type.getDefaultInstance();
            this.f187211g = 0;
            List list = Collections.EMPTY_LIST;
            this.f187212h = list;
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
                                this.f187209b |= 1;
                                this.f187210c = codedInputStream.readInt32();
                            } else if (tag2 == 16) {
                                this.f187209b |= 2;
                                this.d = codedInputStream.readInt32();
                            } else if (tag2 == 24) {
                                int i2 = codedInputStream.readEnum();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(i2);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.f187209b |= 4;
                                    this.e = constantValueValueOf;
                                }
                            } else if (tag2 == 34) {
                                Type.Builder builder = (this.f187209b & 8) == 8 ? this.f.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f = builder.buildPartial();
                                }
                                this.f187209b |= 8;
                            } else if (tag2 == 40) {
                                this.f187209b |= 16;
                                this.f187211g = codedInputStream.readInt32();
                            } else if (tag2 == 50) {
                                if ((i & 32) != 32) {
                                    this.f187212h = new ArrayList();
                                    i |= 32;
                                }
                                this.f187212h.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag2 != 58) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if ((i & 64) != 64) {
                                    this.i = new ArrayList();
                                    i |= 64;
                                }
                                this.i.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if ((i & 32) == 32) {
                            this.f187212h = Collections.unmodifiableList(this.f187212h);
                        }
                        if ((i & 64) == 64) {
                            this.i = Collections.unmodifiableList(this.i);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187208a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187208a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 32) == 32) {
                this.f187212h = Collections.unmodifiableList(this.f187212h);
            }
            if ((i & 64) == 64) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187208a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187208a = outputNewOutput.toByteString();
        }

        public Expression(Builder builder) {
            this.f187213j = (byte) -1;
            this.k = -1;
            this.f187208a = builder.getUnknownFields();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new q();

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Function f187218y;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187220c;
        public int d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Type f187221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f187222h;
        public List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Type f187223j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f187224l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f187225m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f187226n;
        public List o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List f187227p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public TypeTable f187228q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List f187229r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Contract f187230s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f187231t;
        public List u;
        public List v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public byte f187232w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f187233x;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            public int d;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187234g;
            public int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public List f187236j;
            public Type k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f187237l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public List f187238m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public List f187239n;
            public List o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public List f187240p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public TypeTable f187241q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public List f187242r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Contract f187243s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public List f187244t;
            public List u;
            public List v;
            public int e = 6;
            public int f = 6;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Type f187235h = Type.getDefaultInstance();

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f187236j = list;
                this.k = Type.getDefaultInstance();
                this.f187238m = list;
                this.f187239n = list;
                this.o = list;
                this.f187240p = list;
                this.f187241q = TypeTable.getDefaultInstance();
                this.f187242r = list;
                this.f187243s = Contract.getDefaultInstance();
                this.f187244t = list;
                this.u = list;
                this.v = list;
            }

            public static Builder c() {
                return new Builder();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 65536) != 65536) {
                    this.u = new ArrayList(this.u);
                    this.d |= 65536;
                }
                AbstractMessageLite.Builder.a(iterable, this.u);
                return this;
            }

            public Builder addAllExtensionReceiverAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 131072) != 131072) {
                    this.v = new ArrayList(this.v);
                    this.d |= 131072;
                }
                AbstractMessageLite.Builder.a(iterable, this.v);
                return this;
            }

            public Function buildPartial() {
                Function function = new Function(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.f = this.f187234g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.f187221g = this.f187235h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.f187222h = this.i;
                if ((i & 32) == 32) {
                    this.f187236j = Collections.unmodifiableList(this.f187236j);
                    this.d &= -33;
                }
                function.i = this.f187236j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.f187223j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.k = this.f187237l;
                if ((this.d & 256) == 256) {
                    this.f187238m = Collections.unmodifiableList(this.f187238m);
                    this.d &= -257;
                }
                function.f187224l = this.f187238m;
                if ((this.d & 512) == 512) {
                    this.f187239n = Collections.unmodifiableList(this.f187239n);
                    this.d &= -513;
                }
                function.f187225m = this.f187239n;
                if ((this.d & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= -1025;
                }
                function.o = this.o;
                if ((this.d & 2048) == 2048) {
                    this.f187240p = Collections.unmodifiableList(this.f187240p);
                    this.d &= -2049;
                }
                function.f187227p = this.f187240p;
                if ((i & 4096) == 4096) {
                    i2 |= 128;
                }
                function.f187228q = this.f187241q;
                if ((this.d & 8192) == 8192) {
                    this.f187242r = Collections.unmodifiableList(this.f187242r);
                    this.d &= -8193;
                }
                function.f187229r = this.f187242r;
                if ((i & 16384) == 16384) {
                    i2 |= 256;
                }
                function.f187230s = this.f187243s;
                if ((this.d & 32768) == 32768) {
                    this.f187244t = Collections.unmodifiableList(this.f187244t);
                    this.d &= -32769;
                }
                function.f187231t = this.f187244t;
                if ((this.d & 65536) == 65536) {
                    this.u = Collections.unmodifiableList(this.u);
                    this.d &= -65537;
                }
                function.u = this.u;
                if ((this.d & 131072) == 131072) {
                    this.v = Collections.unmodifiableList(this.v);
                    this.d &= -131073;
                }
                function.v = this.v;
                function.f187220c = i2;
                return function;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.u.get(i);
            }

            public int getAnnotationCount() {
                return this.u.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.f187244t.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.f187244t.size();
            }

            public ValueParameter getContextParameter(int i) {
                return (ValueParameter) this.o.get(i);
            }

            public int getContextParameterCount() {
                return this.o.size();
            }

            public Type getContextReceiverType(int i) {
                return (Type) this.f187238m.get(i);
            }

            public int getContextReceiverTypeCount() {
                return this.f187238m.size();
            }

            public Contract getContract() {
                return this.f187243s;
            }

            public Annotation getExtensionReceiverAnnotation(int i) {
                return (Annotation) this.v.get(i);
            }

            public int getExtensionReceiverAnnotationCount() {
                return this.v.size();
            }

            public Type getReceiverType() {
                return this.k;
            }

            public Type getReturnType() {
                return this.f187235h;
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.f187236j.get(i);
            }

            public int getTypeParameterCount() {
                return this.f187236j.size();
            }

            public TypeTable getTypeTable() {
                return this.f187241q;
            }

            public ValueParameter getValueParameter(int i) {
                return (ValueParameter) this.f187240p.get(i);
            }

            public int getValueParameterCount() {
                return this.f187240p.size();
            }

            public boolean hasContract() {
                return (this.d & 16384) == 16384;
            }

            public boolean hasName() {
                return (this.d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.d & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.d & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.d & 4096) == 4096;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                    if (!getContextParameter(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getValueParameterCount(); i5++) {
                    if (!getValueParameter(i5).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                if (hasContract() && !getContract().isInitialized()) {
                    return false;
                }
                for (int i6 = 0; i6 < getCompilerPluginDataCount(); i6++) {
                    if (!getCompilerPluginData(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i21 = 0; i21 < getAnnotationCount(); i21++) {
                    if (!getAnnotation(i21).isInitialized()) {
                        return false;
                    }
                }
                for (int i22 = 0; i22 < getExtensionReceiverAnnotationCount(); i22++) {
                    if (!getExtensionReceiverAnnotation(i22).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder mergeContract(Contract contract) {
                if ((this.d & 16384) != 16384 || this.f187243s == Contract.getDefaultInstance()) {
                    this.f187243s = contract;
                } else {
                    this.f187243s = Contract.newBuilder(this.f187243s).mergeFrom(contract).buildPartial();
                }
                this.d |= 16384;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.d & 64) != 64 || this.k == Type.getDefaultInstance()) {
                    this.k = type;
                } else {
                    this.k = Type.newBuilder(this.k).mergeFrom(type).buildPartial();
                }
                this.d |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.d & 8) != 8 || this.f187235h == Type.getDefaultInstance()) {
                    this.f187235h = type;
                } else {
                    this.f187235h = Type.newBuilder(this.f187235h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.d & 4096) != 4096 || this.f187241q == TypeTable.getDefaultInstance()) {
                    this.f187241q = typeTable;
                } else {
                    this.f187241q = TypeTable.newBuilder(this.f187241q).mergeFrom(typeTable).buildPartial();
                }
                this.d |= 4096;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 4;
                this.f187234g = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.d |= 128;
                this.f187237l = i;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw new UninitializedMessageException(functionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.i.isEmpty()) {
                    if (this.f187236j.isEmpty()) {
                        this.f187236j = function.i;
                        this.d &= -33;
                    } else {
                        if ((this.d & 32) != 32) {
                            this.f187236j = new ArrayList(this.f187236j);
                            this.d |= 32;
                        }
                        this.f187236j.addAll(function.i);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.f187224l.isEmpty()) {
                    if (this.f187238m.isEmpty()) {
                        this.f187238m = function.f187224l;
                        this.d &= -257;
                    } else {
                        if ((this.d & 256) != 256) {
                            this.f187238m = new ArrayList(this.f187238m);
                            this.d |= 256;
                        }
                        this.f187238m.addAll(function.f187224l);
                    }
                }
                if (!function.f187225m.isEmpty()) {
                    if (this.f187239n.isEmpty()) {
                        this.f187239n = function.f187225m;
                        this.d &= -513;
                    } else {
                        if ((this.d & 512) != 512) {
                            this.f187239n = new ArrayList(this.f187239n);
                            this.d |= 512;
                        }
                        this.f187239n.addAll(function.f187225m);
                    }
                }
                if (!function.o.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = function.o;
                        this.d &= -1025;
                    } else {
                        if ((this.d & 1024) != 1024) {
                            this.o = new ArrayList(this.o);
                            this.d |= 1024;
                        }
                        this.o.addAll(function.o);
                    }
                }
                if (!function.f187227p.isEmpty()) {
                    if (this.f187240p.isEmpty()) {
                        this.f187240p = function.f187227p;
                        this.d &= -2049;
                    } else {
                        if ((this.d & 2048) != 2048) {
                            this.f187240p = new ArrayList(this.f187240p);
                            this.d |= 2048;
                        }
                        this.f187240p.addAll(function.f187227p);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.f187229r.isEmpty()) {
                    if (this.f187242r.isEmpty()) {
                        this.f187242r = function.f187229r;
                        this.d &= -8193;
                    } else {
                        if ((this.d & 8192) != 8192) {
                            this.f187242r = new ArrayList(this.f187242r);
                            this.d |= 8192;
                        }
                        this.f187242r.addAll(function.f187229r);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                if (!function.f187231t.isEmpty()) {
                    if (this.f187244t.isEmpty()) {
                        this.f187244t = function.f187231t;
                        this.d &= -32769;
                    } else {
                        if ((this.d & 32768) != 32768) {
                            this.f187244t = new ArrayList(this.f187244t);
                            this.d |= 32768;
                        }
                        this.f187244t.addAll(function.f187231t);
                    }
                }
                if (!function.u.isEmpty()) {
                    if (this.u.isEmpty()) {
                        this.u = function.u;
                        this.d &= -65537;
                    } else {
                        if ((this.d & 65536) != 65536) {
                            this.u = new ArrayList(this.u);
                            this.d |= 65536;
                        }
                        this.u.addAll(function.u);
                    }
                }
                if (!function.v.isEmpty()) {
                    if (this.v.isEmpty()) {
                        this.v = function.v;
                        this.d &= -131073;
                    } else {
                        if ((this.d & 131072) != 131072) {
                            this.v = new ArrayList(this.v);
                            this.d |= 131072;
                        }
                        this.v.addAll(function.v);
                    }
                }
                b(function);
                setUnknownFields(getUnknownFields().concat(function.f187219b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$Builder");
            }
        }

        static {
            Function function = new Function();
            f187218y = function;
            function.e();
        }

        public Function(Builder builder) {
            super(builder);
            this.f187226n = -1;
            this.f187232w = (byte) -1;
            this.f187233x = -1;
            this.f187219b = builder.getUnknownFields();
        }

        public static Function getDefaultInstance() {
            return f187218y;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public final void e() {
            this.d = 6;
            this.e = 6;
            this.f = 0;
            this.f187221g = Type.getDefaultInstance();
            this.f187222h = 0;
            List list = Collections.EMPTY_LIST;
            this.i = list;
            this.f187223j = Type.getDefaultInstance();
            this.k = 0;
            this.f187224l = list;
            this.f187225m = list;
            this.o = list;
            this.f187227p = list;
            this.f187228q = TypeTable.getDefaultInstance();
            this.f187229r = list;
            this.f187230s = Contract.getDefaultInstance();
            this.f187231t = list;
            this.u = list;
            this.v = list;
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.u.get(i);
        }

        public int getAnnotationCount() {
            return this.u.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.u;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.f187231t.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.f187231t.size();
        }

        public ValueParameter getContextParameter(int i) {
            return (ValueParameter) this.o.get(i);
        }

        public int getContextParameterCount() {
            return this.o.size();
        }

        public List<ValueParameter> getContextParameterList() {
            return this.o;
        }

        public Type getContextReceiverType(int i) {
            return (Type) this.f187224l.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.f187224l.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f187225m;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f187224l;
        }

        public Contract getContract() {
            return this.f187230s;
        }

        public Annotation getExtensionReceiverAnnotation(int i) {
            return (Annotation) this.v.get(i);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.v.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.v;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.f;
        }

        public int getOldFlags() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f187223j;
        }

        public int getReceiverTypeId() {
            return this.k;
        }

        public Type getReturnType() {
            return this.f187221g;
        }

        public int getReturnTypeId() {
            return this.f187222h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187233x;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187220c & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.e) : 0;
            if ((this.f187220c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f);
            }
            if ((this.f187220c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f187221g);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.i.get(i2));
            }
            if ((this.f187220c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f187223j);
            }
            for (int i3 = 0; i3 < this.f187227p.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f187227p.get(i3));
            }
            if ((this.f187220c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f187222h);
            }
            if ((this.f187220c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.k);
            }
            if ((this.f187220c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.d);
            }
            for (int i5 = 0; i5 < this.f187224l.size(); i5++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f187224l.get(i5));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i6 = 0; i6 < this.f187225m.size(); i6++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187225m.get(i6)).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f187226n = iComputeInt32SizeNoTag;
            for (int i21 = 0; i21 < this.u.size(); i21++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, (MessageLite) this.u.get(i21));
            }
            for (int i22 = 0; i22 < this.o.size(); i22++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, (MessageLite) this.o.get(i22));
            }
            if ((this.f187220c & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.f187228q);
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i32 = 0; i32 < this.f187229r.size(); i32++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187229r.get(i32)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize + iComputeInt32SizeNoTag2;
            if ((this.f187220c & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.f187230s);
            }
            for (int i33 = 0; i33 < this.f187231t.size(); i33++) {
                size += CodedOutputStream.computeMessageSize(33, (MessageLite) this.f187231t.get(i33));
            }
            for (int i43 = 0; i43 < this.v.size(); i43++) {
                size += CodedOutputStream.computeMessageSize(34, (MessageLite) this.v.get(i43));
            }
            int size2 = this.f187219b.size() + a() + size;
            this.f187233x = size2;
            return size2;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.i.get(i);
        }

        public int getTypeParameterCount() {
            return this.i.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.i;
        }

        public TypeTable getTypeTable() {
            return this.f187228q;
        }

        public ValueParameter getValueParameter(int i) {
            return (ValueParameter) this.f187227p.get(i);
        }

        public int getValueParameterCount() {
            return this.f187227p.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.f187227p;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f187229r;
        }

        public boolean hasContract() {
            return (this.f187220c & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.f187220c & 1) == 1;
        }

        public boolean hasName() {
            return (this.f187220c & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f187220c & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f187220c & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f187220c & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f187220c & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f187220c & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.f187220c & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187232w;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f187232w = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.f187232w = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.f187232w = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getValueParameterCount(); i5++) {
                if (!getValueParameter(i5).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f187232w = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.f187232w = (byte) 0;
                return false;
            }
            for (int i6 = 0; i6 < getCompilerPluginDataCount(); i6++) {
                if (!getCompilerPluginData(i6).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            for (int i21 = 0; i21 < getAnnotationCount(); i21++) {
                if (!getAnnotation(i21).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            for (int i22 = 0; i22 < getExtensionReceiverAnnotationCount(); i22++) {
                if (!getExtensionReceiverAnnotation(i22).isInitialized()) {
                    this.f187232w = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.f187232w = (byte) 1;
                return true;
            }
            this.f187232w = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187220c & 2) == 2) {
                codedOutputStream.writeInt32(1, this.e);
            }
            if ((this.f187220c & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f);
            }
            if ((this.f187220c & 8) == 8) {
                codedOutputStream.writeMessage(3, this.f187221g);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.i.get(i));
            }
            if ((this.f187220c & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f187223j);
            }
            for (int i2 = 0; i2 < this.f187227p.size(); i2++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f187227p.get(i2));
            }
            if ((this.f187220c & 16) == 16) {
                codedOutputStream.writeInt32(7, this.f187222h);
            }
            if ((this.f187220c & 64) == 64) {
                codedOutputStream.writeInt32(8, this.k);
            }
            if ((this.f187220c & 1) == 1) {
                codedOutputStream.writeInt32(9, this.d);
            }
            for (int i3 = 0; i3 < this.f187224l.size(); i3++) {
                codedOutputStream.writeMessage(10, (MessageLite) this.f187224l.get(i3));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.f187226n);
            }
            for (int i5 = 0; i5 < this.f187225m.size(); i5++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f187225m.get(i5)).intValue());
            }
            for (int i6 = 0; i6 < this.u.size(); i6++) {
                codedOutputStream.writeMessage(12, (MessageLite) this.u.get(i6));
            }
            for (int i21 = 0; i21 < this.o.size(); i21++) {
                codedOutputStream.writeMessage(13, (MessageLite) this.o.get(i21));
            }
            if ((this.f187220c & 128) == 128) {
                codedOutputStream.writeMessage(30, this.f187228q);
            }
            for (int i22 = 0; i22 < this.f187229r.size(); i22++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f187229r.get(i22)).intValue());
            }
            if ((this.f187220c & 256) == 256) {
                codedOutputStream.writeMessage(32, this.f187230s);
            }
            for (int i32 = 0; i32 < this.f187231t.size(); i32++) {
                codedOutputStream.writeMessage(33, (MessageLite) this.f187231t.get(i32));
            }
            for (int i33 = 0; i33 < this.v.size(); i33++) {
                codedOutputStream.writeMessage(34, (MessageLite) this.v.get(i33));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187219b);
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return f187218y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Function() {
            this.f187226n = -1;
            this.f187232w = (byte) -1;
            this.f187233x = -1;
            this.f187219b = ByteString.EMPTY;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0330  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0394  */
        /* JADX WARN: Type inference failed for: r11v19, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder] */
        /* JADX WARN: Type inference failed for: r11v52, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder] */
        /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder] */
        /* JADX WARN: Type inference failed for: r12v33, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder] */
        /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Function(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r22, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1170
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new r();
        private final int value;

        MemberKind(int i) {
            this.value = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public enum Modality implements Internal.EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);

        private static Internal.EnumLiteMap<Modality> internalValueMap = new s();
        private final int value;

        Modality(int i) {
            this.value = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new t();
        public static final Package k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187246c;
        public List d;
        public List e;
        public List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TypeTable f187247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public VersionRequirementTable f187248h;
        public byte i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187249j;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            public int d;
            public List e;
            public List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List f187250g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public TypeTable f187251h;
            public VersionRequirementTable i;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.e = list;
                this.f = list;
                this.f187250g = list;
                this.f187251h = TypeTable.getDefaultInstance();
                this.i = VersionRequirementTable.getDefaultInstance();
            }

            public static Builder c() {
                return new Builder();
            }

            public Package buildPartial() {
                Package r06 = new Package(this);
                int i = this.d;
                if ((i & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.d &= -2;
                }
                r06.d = this.e;
                if ((this.d & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                r06.e = this.f;
                if ((this.d & 4) == 4) {
                    this.f187250g = Collections.unmodifiableList(this.f187250g);
                    this.d &= -5;
                }
                r06.f = this.f187250g;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r06.f187247g = this.f187251h;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r06.f187248h = this.i;
                r06.f187246c = i2;
                return r06;
            }

            public Function getFunction(int i) {
                return (Function) this.e.get(i);
            }

            public int getFunctionCount() {
                return this.e.size();
            }

            public Property getProperty(int i) {
                return (Property) this.f.get(i);
            }

            public int getPropertyCount() {
                return this.f.size();
            }

            public TypeAlias getTypeAlias(int i) {
                return (TypeAlias) this.f187250g.get(i);
            }

            public int getTypeAliasCount() {
                return this.f187250g.size();
            }

            public TypeTable getTypeTable() {
                return this.f187251h;
            }

            public boolean hasTypeTable() {
                return (this.d & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && this.f187503b.f();
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.d & 8) != 8 || this.f187251h == TypeTable.getDefaultInstance()) {
                    this.f187251h = typeTable;
                } else {
                    this.f187251h = TypeTable.newBuilder(this.f187251h).mergeFrom(typeTable).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.d & 16) != 16 || this.i == VersionRequirementTable.getDefaultInstance()) {
                    this.i = versionRequirementTable;
                } else {
                    this.i = VersionRequirementTable.newBuilder(this.i).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.d |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw new UninitializedMessageException(packageBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r4) {
                if (r4 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r4.d.isEmpty()) {
                    if (this.e.isEmpty()) {
                        this.e = r4.d;
                        this.d &= -2;
                    } else {
                        if ((this.d & 1) != 1) {
                            this.e = new ArrayList(this.e);
                            this.d |= 1;
                        }
                        this.e.addAll(r4.d);
                    }
                }
                if (!r4.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = r4.e;
                        this.d &= -3;
                    } else {
                        if ((this.d & 2) != 2) {
                            this.f = new ArrayList(this.f);
                            this.d |= 2;
                        }
                        this.f.addAll(r4.e);
                    }
                }
                if (!r4.f.isEmpty()) {
                    if (this.f187250g.isEmpty()) {
                        this.f187250g = r4.f;
                        this.d &= -5;
                    } else {
                        if ((this.d & 4) != 4) {
                            this.f187250g = new ArrayList(this.f187250g);
                            this.d |= 4;
                        }
                        this.f187250g.addAll(r4.f);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                b(r4);
                setUnknownFields(getUnknownFields().concat(r4.f187245b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$Builder");
            }
        }

        static {
            Package r06 = new Package();
            k = r06;
            List list = Collections.EMPTY_LIST;
            r06.d = list;
            r06.e = list;
            r06.f = list;
            r06.f187247g = TypeTable.getDefaultInstance();
            r06.f187248h = VersionRequirementTable.getDefaultInstance();
        }

        public Package(Builder builder) {
            super(builder);
            this.i = (byte) -1;
            this.f187249j = -1;
            this.f187245b = builder.getUnknownFields();
        }

        public static Package getDefaultInstance() {
            return k;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Function getFunction(int i) {
            return (Function) this.d.get(i);
        }

        public int getFunctionCount() {
            return this.d.size();
        }

        public List<Function> getFunctionList() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return (Property) this.e.get(i);
        }

        public int getPropertyCount() {
            return this.e.size();
        }

        public List<Property> getPropertyList() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187249j;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.d.get(i2));
            }
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.e.get(i3));
            }
            for (int i5 = 0; i5 < this.f.size(); i5++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f.get(i5));
            }
            if ((this.f187246c & 1) == 1) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.f187247g);
            }
            if ((this.f187246c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(32, this.f187248h);
            }
            int size = this.f187245b.size() + a() + iComputeMessageSize;
            this.f187249j = size;
            return size;
        }

        public TypeAlias getTypeAlias(int i) {
            return (TypeAlias) this.f.get(i);
        }

        public int getTypeAliasCount() {
            return this.f.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f;
        }

        public TypeTable getTypeTable() {
            return this.f187247g;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.f187248h;
        }

        public boolean hasTypeTable() {
            return (this.f187246c & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f187246c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.i;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
            if (this.f187505a.f()) {
                this.i = (byte) 1;
                return true;
            }
            this.i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.d.get(i));
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.e.get(i2));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f.get(i3));
            }
            if ((this.f187246c & 1) == 1) {
                codedOutputStream.writeMessage(30, this.f187247g);
            }
            if ((this.f187246c & 2) == 2) {
                codedOutputStream.writeMessage(32, this.f187248h);
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187245b);
        }

        public static Builder newBuilder(Package r110) {
            return newBuilder().mergeFrom(r110);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Package() {
            this.i = (byte) -1;
            this.f187249j = -1;
            this.f187245b = ByteString.EMPTY;
        }

        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.i = (byte) -1;
            this.f187249j = -1;
            List list = Collections.EMPTY_LIST;
            this.d = list;
            this.e = list;
            this.f = list;
            this.f187247g = TypeTable.getDefaultInstance();
            this.f187248h = VersionRequirementTable.getDefaultInstance();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.d = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.d.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                            } else if (tag2 == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.e = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.e.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                            } else if (tag2 != 42) {
                                if (tag2 == 242) {
                                    TypeTable.Builder builder = (this.f187246c & 1) == 1 ? this.f187247g.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                    this.f187247g = typeTable;
                                    if (builder != null) {
                                        builder.mergeFrom(typeTable);
                                        this.f187247g = builder.buildPartial();
                                    }
                                    this.f187246c |= 1;
                                } else if (tag2 != 258) {
                                    if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                    }
                                } else {
                                    VersionRequirementTable.Builder builder2 = (this.f187246c & 2) == 2 ? this.f187248h.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                    this.f187248h = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(versionRequirementTable);
                                        this.f187248h = builder2.buildPartial();
                                    }
                                    this.f187246c |= 2;
                                }
                            } else {
                                int i5 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i5 != 4) {
                                    this.f = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.f.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (((i == true ? 1 : 0) & 1) == 1) {
                            this.d = Collections.unmodifiableList(this.d);
                        }
                        if (((i == true ? 1 : 0) & 2) == 2) {
                            this.e = Collections.unmodifiableList(this.e);
                        }
                        if (((i == true ? 1 : 0) & 4) == 4) {
                            this.f = Collections.unmodifiableList(this.f);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187245b = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187245b = outputNewOutput.toByteString();
                        b();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((i == true ? 1 : 0) & 1) == 1) {
                this.d = Collections.unmodifiableList(this.d);
            }
            if (((i == true ? 1 : 0) & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if (((i == true ? 1 : 0) & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187245b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187245b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new u();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final PackageFragment f187252j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187254c;
        public StringTable d;
        public QualifiedNameTable e;
        public Package f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f187255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f187256h;
        public int i;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            public int d;
            public StringTable e = StringTable.getDefaultInstance();
            public QualifiedNameTable f = QualifiedNameTable.getDefaultInstance();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Package f187257g = Package.getDefaultInstance();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public List f187258h = Collections.EMPTY_LIST;

            public static Builder c() {
                return new Builder();
            }

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.f = this.f187257g;
                if ((i & 8) == 8) {
                    this.f187258h = Collections.unmodifiableList(this.f187258h);
                    this.d &= -9;
                }
                packageFragment.f187255g = this.f187258h;
                packageFragment.f187254c = i2;
                return packageFragment;
            }

            public Class getClass_(int i) {
                return (Class) this.f187258h.get(i);
            }

            public int getClass_Count() {
                return this.f187258h.size();
            }

            public Package getPackage() {
                return this.f187257g;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.f;
            }

            public boolean hasPackage() {
                return (this.d & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder mergePackage(Package r4) {
                if ((this.d & 4) != 4 || this.f187257g == Package.getDefaultInstance()) {
                    this.f187257g = r4;
                } else {
                    this.f187257g = Package.newBuilder(this.f187257g).mergeFrom(r4).buildPartial();
                }
                this.d |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.d & 2) != 2 || this.f == QualifiedNameTable.getDefaultInstance()) {
                    this.f = qualifiedNameTable;
                } else {
                    this.f = QualifiedNameTable.newBuilder(this.f).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.d |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.d & 1) != 1 || this.e == StringTable.getDefaultInstance()) {
                    this.e = stringTable;
                } else {
                    this.e = StringTable.newBuilder(this.e).mergeFrom(stringTable).buildPartial();
                }
                this.d |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw new UninitializedMessageException(packageFragmentBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.f187255g.isEmpty()) {
                    if (this.f187258h.isEmpty()) {
                        this.f187258h = packageFragment.f187255g;
                        this.d &= -9;
                    } else {
                        if ((this.d & 8) != 8) {
                            this.f187258h = new ArrayList(this.f187258h);
                            this.d |= 8;
                        }
                        this.f187258h.addAll(packageFragment.f187255g);
                    }
                }
                b(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.f187253b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$Builder");
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            f187252j = packageFragment;
            packageFragment.d = StringTable.getDefaultInstance();
            packageFragment.e = QualifiedNameTable.getDefaultInstance();
            packageFragment.f = Package.getDefaultInstance();
            packageFragment.f187255g = Collections.EMPTY_LIST;
        }

        public PackageFragment(Builder builder) {
            super(builder);
            this.f187256h = (byte) -1;
            this.i = -1;
            this.f187253b = builder.getUnknownFields();
        }

        public static PackageFragment getDefaultInstance() {
            return f187252j;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Class getClass_(int i) {
            return (Class) this.f187255g.get(i);
        }

        public int getClass_Count() {
            return this.f187255g.size();
        }

        public List<Class> getClass_List() {
            return this.f187255g;
        }

        public Package getPackage() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.f187254c & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.d) : 0;
            if ((this.f187254c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.e);
            }
            if ((this.f187254c & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f);
            }
            for (int i2 = 0; i2 < this.f187255g.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f187255g.get(i2));
            }
            int size = this.f187253b.size() + a() + iComputeMessageSize;
            this.i = size;
            return size;
        }

        public StringTable getStrings() {
            return this.d;
        }

        public boolean hasPackage() {
            return (this.f187254c & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.f187254c & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.f187254c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187256h;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.f187256h = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.f187256h = (byte) 0;
                return false;
            }
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
                    this.f187256h = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.f187256h = (byte) 1;
                return true;
            }
            this.f187256h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187254c & 1) == 1) {
                codedOutputStream.writeMessage(1, this.d);
            }
            if ((this.f187254c & 2) == 2) {
                codedOutputStream.writeMessage(2, this.e);
            }
            if ((this.f187254c & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f);
            }
            for (int i = 0; i < this.f187255g.size(); i++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f187255g.get(i));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187253b);
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return f187252j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public PackageFragment() {
            this.f187256h = (byte) -1;
            this.i = -1;
            this.f187253b = ByteString.EMPTY;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187256h = (byte) -1;
            this.i = -1;
            this.d = StringTable.getDefaultInstance();
            this.e = QualifiedNameTable.getDefaultInstance();
            this.f = Package.getDefaultInstance();
            this.f187255g = Collections.EMPTY_LIST;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            char c2 = 0;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 10) {
                                StringTable.Builder builder = (this.f187254c & 1) == 1 ? this.d.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                this.d = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.d = builder.buildPartial();
                                }
                                this.f187254c |= 1;
                            } else if (tag2 == 18) {
                                QualifiedNameTable.Builder builder2 = (this.f187254c & 2) == 2 ? this.e.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.e = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.e = builder2.buildPartial();
                                }
                                this.f187254c |= 2;
                            } else if (tag2 == 26) {
                                Package.Builder builder3 = (this.f187254c & 4) == 4 ? this.f.toBuilder() : null;
                                Package r62 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                this.f = r62;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r62);
                                    this.f = builder3.buildPartial();
                                }
                                this.f187254c |= 4;
                            } else if (tag2 != 34) {
                                if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                }
                            } else {
                                int i = (c2 == true ? 1 : 0) & '\b';
                                c2 = c2;
                                if (i != 8) {
                                    this.f187255g = new ArrayList();
                                    c2 = '\b';
                                }
                                this.f187255g.add(codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (((c2 == true ? 1 : 0) & '\b') == 8) {
                            this.f187255g = Collections.unmodifiableList(this.f187255g);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187253b = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187253b = outputNewOutput.toByteString();
                        b();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c2 == true ? 1 : 0) & '\b') == 8) {
                this.f187255g = Collections.unmodifiableList(this.f187255g);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187253b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187253b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static final Property C;
        public static Parser<Property> PARSER = new v();
        public byte A;
        public int B;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187260c;
        public int d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Type f187261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f187262h;
        public List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Type f187263j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f187264l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f187265m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f187266n;
        public List o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ValueParameter f187267p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f187268q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f187269r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f187270s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f187271t;
        public List u;
        public List v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public List f187272w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public List f187273x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public List f187274y;
        public List z;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            public int d;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187275g;
            public int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public List f187277j;
            public Type k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f187278l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public List f187279m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public List f187280n;
            public List o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public ValueParameter f187281p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f187282q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f187283r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public List f187284s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public List f187285t;
            public List u;
            public List v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public List f187286w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public List f187287x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public List f187288y;
            public List z;
            public int e = 518;
            public int f = 2054;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Type f187276h = Type.getDefaultInstance();

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f187277j = list;
                this.k = Type.getDefaultInstance();
                this.f187279m = list;
                this.f187280n = list;
                this.o = list;
                this.f187281p = ValueParameter.getDefaultInstance();
                this.f187284s = list;
                this.f187285t = list;
                this.u = list;
                this.v = list;
                this.f187286w = list;
                this.f187287x = list;
                this.f187288y = list;
                this.z = list;
            }

            public static Builder c() {
                return new Builder();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 65536) != 65536) {
                    this.u = new ArrayList(this.u);
                    this.d |= 65536;
                }
                AbstractMessageLite.Builder.a(iterable, this.u);
                return this;
            }

            public Builder addAllBackingFieldAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & PKIFailureInfo.badCertTemplate) != 1048576) {
                    this.f187288y = new ArrayList(this.f187288y);
                    this.d |= PKIFailureInfo.badCertTemplate;
                }
                AbstractMessageLite.Builder.a(iterable, this.f187288y);
                return this;
            }

            public Builder addAllContextParameter(Iterable<? extends ValueParameter> iterable) {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
                AbstractMessageLite.Builder.a(iterable, this.o);
                return this;
            }

            public Builder addAllContextReceiverType(Iterable<? extends Type> iterable) {
                if ((this.d & 256) != 256) {
                    this.f187279m = new ArrayList(this.f187279m);
                    this.d |= 256;
                }
                AbstractMessageLite.Builder.a(iterable, this.f187279m);
                return this;
            }

            public Builder addAllDelegateFieldAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & PKIFailureInfo.badSenderNonce) != 2097152) {
                    this.z = new ArrayList(this.z);
                    this.d |= PKIFailureInfo.badSenderNonce;
                }
                AbstractMessageLite.Builder.a(iterable, this.z);
                return this;
            }

            public Builder addAllExtensionReceiverAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 524288) != 524288) {
                    this.f187287x = new ArrayList(this.f187287x);
                    this.d |= 524288;
                }
                AbstractMessageLite.Builder.a(iterable, this.f187287x);
                return this;
            }

            public Builder addAllGetterAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 131072) != 131072) {
                    this.v = new ArrayList(this.v);
                    this.d |= 131072;
                }
                AbstractMessageLite.Builder.a(iterable, this.v);
                return this;
            }

            public Builder addAllSetterAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 262144) != 262144) {
                    this.f187286w = new ArrayList(this.f187286w);
                    this.d |= 262144;
                }
                AbstractMessageLite.Builder.a(iterable, this.f187286w);
                return this;
            }

            public Builder addAllVersionRequirement(Iterable<? extends Integer> iterable) {
                if ((this.d & 16384) != 16384) {
                    this.f187284s = new ArrayList(this.f187284s);
                    this.d |= 16384;
                }
                AbstractMessageLite.Builder.a(iterable, this.f187284s);
                return this;
            }

            public Builder addTypeParameter(TypeParameter typeParameter) {
                typeParameter.getClass();
                if ((this.d & 32) != 32) {
                    this.f187277j = new ArrayList(this.f187277j);
                    this.d |= 32;
                }
                this.f187277j.add(typeParameter);
                return this;
            }

            public Property buildPartial() {
                Property property = new Property(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.f = this.f187275g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.f187261g = this.f187276h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.f187262h = this.i;
                if ((i & 32) == 32) {
                    this.f187277j = Collections.unmodifiableList(this.f187277j);
                    this.d &= -33;
                }
                property.i = this.f187277j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.f187263j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.k = this.f187278l;
                if ((this.d & 256) == 256) {
                    this.f187279m = Collections.unmodifiableList(this.f187279m);
                    this.d &= -257;
                }
                property.f187264l = this.f187279m;
                if ((this.d & 512) == 512) {
                    this.f187280n = Collections.unmodifiableList(this.f187280n);
                    this.d &= -513;
                }
                property.f187265m = this.f187280n;
                if ((this.d & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= -1025;
                }
                property.o = this.o;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                property.f187267p = this.f187281p;
                if ((i & 4096) == 4096) {
                    i2 |= 256;
                }
                property.f187268q = this.f187282q;
                if ((i & 8192) == 8192) {
                    i2 |= 512;
                }
                property.f187269r = this.f187283r;
                if ((this.d & 16384) == 16384) {
                    this.f187284s = Collections.unmodifiableList(this.f187284s);
                    this.d &= -16385;
                }
                property.f187270s = this.f187284s;
                if ((this.d & 32768) == 32768) {
                    this.f187285t = Collections.unmodifiableList(this.f187285t);
                    this.d &= -32769;
                }
                property.f187271t = this.f187285t;
                if ((this.d & 65536) == 65536) {
                    this.u = Collections.unmodifiableList(this.u);
                    this.d &= -65537;
                }
                property.u = this.u;
                if ((this.d & 131072) == 131072) {
                    this.v = Collections.unmodifiableList(this.v);
                    this.d &= -131073;
                }
                property.v = this.v;
                if ((this.d & 262144) == 262144) {
                    this.f187286w = Collections.unmodifiableList(this.f187286w);
                    this.d &= -262145;
                }
                property.f187272w = this.f187286w;
                if ((this.d & 524288) == 524288) {
                    this.f187287x = Collections.unmodifiableList(this.f187287x);
                    this.d &= -524289;
                }
                property.f187273x = this.f187287x;
                if ((this.d & PKIFailureInfo.badCertTemplate) == 1048576) {
                    this.f187288y = Collections.unmodifiableList(this.f187288y);
                    this.d &= -1048577;
                }
                property.f187274y = this.f187288y;
                if ((this.d & PKIFailureInfo.badSenderNonce) == 2097152) {
                    this.z = Collections.unmodifiableList(this.z);
                    this.d &= -2097153;
                }
                property.z = this.z;
                property.f187260c = i2;
                return property;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.u.get(i);
            }

            public int getAnnotationCount() {
                return this.u.size();
            }

            public Annotation getBackingFieldAnnotation(int i) {
                return (Annotation) this.f187288y.get(i);
            }

            public int getBackingFieldAnnotationCount() {
                return this.f187288y.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.f187285t.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.f187285t.size();
            }

            public ValueParameter getContextParameter(int i) {
                return (ValueParameter) this.o.get(i);
            }

            public int getContextParameterCount() {
                return this.o.size();
            }

            public Type getContextReceiverType(int i) {
                return (Type) this.f187279m.get(i);
            }

            public int getContextReceiverTypeCount() {
                return this.f187279m.size();
            }

            public Annotation getDelegateFieldAnnotation(int i) {
                return (Annotation) this.z.get(i);
            }

            public int getDelegateFieldAnnotationCount() {
                return this.z.size();
            }

            public Annotation getExtensionReceiverAnnotation(int i) {
                return (Annotation) this.f187287x.get(i);
            }

            public int getExtensionReceiverAnnotationCount() {
                return this.f187287x.size();
            }

            public Annotation getGetterAnnotation(int i) {
                return (Annotation) this.v.get(i);
            }

            public int getGetterAnnotationCount() {
                return this.v.size();
            }

            public Type getReceiverType() {
                return this.k;
            }

            public Type getReturnType() {
                return this.f187276h;
            }

            public Annotation getSetterAnnotation(int i) {
                return (Annotation) this.f187286w.get(i);
            }

            public int getSetterAnnotationCount() {
                return this.f187286w.size();
            }

            public ValueParameter getSetterValueParameter() {
                return this.f187281p;
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.f187277j.get(i);
            }

            public int getTypeParameterCount() {
                return this.f187277j.size();
            }

            public boolean hasName() {
                return (this.d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.d & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.d & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.d & 2048) == 2048;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                    if (!getContextParameter(i3).isInitialized()) {
                        return false;
                    }
                }
                if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    return false;
                }
                for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                    if (!getCompilerPluginData(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                    if (!getAnnotation(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i21 = 0; i21 < getGetterAnnotationCount(); i21++) {
                    if (!getGetterAnnotation(i21).isInitialized()) {
                        return false;
                    }
                }
                for (int i22 = 0; i22 < getSetterAnnotationCount(); i22++) {
                    if (!getSetterAnnotation(i22).isInitialized()) {
                        return false;
                    }
                }
                for (int i32 = 0; i32 < getExtensionReceiverAnnotationCount(); i32++) {
                    if (!getExtensionReceiverAnnotation(i32).isInitialized()) {
                        return false;
                    }
                }
                for (int i33 = 0; i33 < getBackingFieldAnnotationCount(); i33++) {
                    if (!getBackingFieldAnnotation(i33).isInitialized()) {
                        return false;
                    }
                }
                for (int i43 = 0; i43 < getDelegateFieldAnnotationCount(); i43++) {
                    if (!getDelegateFieldAnnotation(i43).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.d & 64) != 64 || this.k == Type.getDefaultInstance()) {
                    this.k = type;
                } else {
                    this.k = Type.newBuilder(this.k).mergeFrom(type).buildPartial();
                }
                this.d |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.d & 8) != 8 || this.f187276h == Type.getDefaultInstance()) {
                    this.f187276h = type;
                } else {
                    this.f187276h = Type.newBuilder(this.f187276h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.d & 2048) != 2048 || this.f187281p == ValueParameter.getDefaultInstance()) {
                    this.f187281p = valueParameter;
                } else {
                    this.f187281p = ValueParameter.newBuilder(this.f187281p).mergeFrom(valueParameter).buildPartial();
                }
                this.d |= 2048;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setGetterFlags(int i) {
                this.d |= 4096;
                this.f187282q = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 4;
                this.f187275g = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setReceiverType(Type type) {
                type.getClass();
                this.k = type;
                this.d |= 64;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.d |= 128;
                this.f187278l = i;
                return this;
            }

            public Builder setReturnType(Type type) {
                type.getClass();
                this.f187276h = type;
                this.d |= 8;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            public Builder setSetterFlags(int i) {
                this.d |= 8192;
                this.f187283r = i;
                return this;
            }

            public Builder setSetterValueParameter(ValueParameter valueParameter) {
                valueParameter.getClass();
                this.f187281p = valueParameter;
                this.d |= 2048;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw new UninitializedMessageException(propertyBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.i.isEmpty()) {
                    if (this.f187277j.isEmpty()) {
                        this.f187277j = property.i;
                        this.d &= -33;
                    } else {
                        if ((this.d & 32) != 32) {
                            this.f187277j = new ArrayList(this.f187277j);
                            this.d |= 32;
                        }
                        this.f187277j.addAll(property.i);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.f187264l.isEmpty()) {
                    if (this.f187279m.isEmpty()) {
                        this.f187279m = property.f187264l;
                        this.d &= -257;
                    } else {
                        if ((this.d & 256) != 256) {
                            this.f187279m = new ArrayList(this.f187279m);
                            this.d |= 256;
                        }
                        this.f187279m.addAll(property.f187264l);
                    }
                }
                if (!property.f187265m.isEmpty()) {
                    if (this.f187280n.isEmpty()) {
                        this.f187280n = property.f187265m;
                        this.d &= -513;
                    } else {
                        if ((this.d & 512) != 512) {
                            this.f187280n = new ArrayList(this.f187280n);
                            this.d |= 512;
                        }
                        this.f187280n.addAll(property.f187265m);
                    }
                }
                if (!property.o.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = property.o;
                        this.d &= -1025;
                    } else {
                        if ((this.d & 1024) != 1024) {
                            this.o = new ArrayList(this.o);
                            this.d |= 1024;
                        }
                        this.o.addAll(property.o);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.f187270s.isEmpty()) {
                    if (this.f187284s.isEmpty()) {
                        this.f187284s = property.f187270s;
                        this.d &= -16385;
                    } else {
                        if ((this.d & 16384) != 16384) {
                            this.f187284s = new ArrayList(this.f187284s);
                            this.d |= 16384;
                        }
                        this.f187284s.addAll(property.f187270s);
                    }
                }
                if (!property.f187271t.isEmpty()) {
                    if (this.f187285t.isEmpty()) {
                        this.f187285t = property.f187271t;
                        this.d &= -32769;
                    } else {
                        if ((this.d & 32768) != 32768) {
                            this.f187285t = new ArrayList(this.f187285t);
                            this.d |= 32768;
                        }
                        this.f187285t.addAll(property.f187271t);
                    }
                }
                if (!property.u.isEmpty()) {
                    if (this.u.isEmpty()) {
                        this.u = property.u;
                        this.d &= -65537;
                    } else {
                        if ((this.d & 65536) != 65536) {
                            this.u = new ArrayList(this.u);
                            this.d |= 65536;
                        }
                        this.u.addAll(property.u);
                    }
                }
                if (!property.v.isEmpty()) {
                    if (this.v.isEmpty()) {
                        this.v = property.v;
                        this.d &= -131073;
                    } else {
                        if ((this.d & 131072) != 131072) {
                            this.v = new ArrayList(this.v);
                            this.d |= 131072;
                        }
                        this.v.addAll(property.v);
                    }
                }
                if (!property.f187272w.isEmpty()) {
                    if (this.f187286w.isEmpty()) {
                        this.f187286w = property.f187272w;
                        this.d &= -262145;
                    } else {
                        if ((this.d & 262144) != 262144) {
                            this.f187286w = new ArrayList(this.f187286w);
                            this.d |= 262144;
                        }
                        this.f187286w.addAll(property.f187272w);
                    }
                }
                if (!property.f187273x.isEmpty()) {
                    if (this.f187287x.isEmpty()) {
                        this.f187287x = property.f187273x;
                        this.d &= -524289;
                    } else {
                        if ((this.d & 524288) != 524288) {
                            this.f187287x = new ArrayList(this.f187287x);
                            this.d |= 524288;
                        }
                        this.f187287x.addAll(property.f187273x);
                    }
                }
                if (!property.f187274y.isEmpty()) {
                    if (this.f187288y.isEmpty()) {
                        this.f187288y = property.f187274y;
                        this.d &= -1048577;
                    } else {
                        if ((this.d & PKIFailureInfo.badCertTemplate) != 1048576) {
                            this.f187288y = new ArrayList(this.f187288y);
                            this.d |= PKIFailureInfo.badCertTemplate;
                        }
                        this.f187288y.addAll(property.f187274y);
                    }
                }
                if (!property.z.isEmpty()) {
                    if (this.z.isEmpty()) {
                        this.z = property.z;
                        this.d &= -2097153;
                    } else {
                        if ((this.d & PKIFailureInfo.badSenderNonce) != 2097152) {
                            this.z = new ArrayList(this.z);
                            this.d |= PKIFailureInfo.badSenderNonce;
                        }
                        this.z.addAll(property.z);
                    }
                }
                b(property);
                setUnknownFields(getUnknownFields().concat(property.f187259b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$Builder");
            }
        }

        static {
            Property property = new Property();
            C = property;
            property.e();
        }

        public Property(Builder builder) {
            super(builder);
            this.f187266n = -1;
            this.A = (byte) -1;
            this.B = -1;
            this.f187259b = builder.getUnknownFields();
        }

        public static Property getDefaultInstance() {
            return C;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public final void e() {
            this.d = 518;
            this.e = 2054;
            this.f = 0;
            this.f187261g = Type.getDefaultInstance();
            this.f187262h = 0;
            List list = Collections.EMPTY_LIST;
            this.i = list;
            this.f187263j = Type.getDefaultInstance();
            this.k = 0;
            this.f187264l = list;
            this.f187265m = list;
            this.o = list;
            this.f187267p = ValueParameter.getDefaultInstance();
            this.f187268q = 0;
            this.f187269r = 0;
            this.f187270s = list;
            this.f187271t = list;
            this.u = list;
            this.v = list;
            this.f187272w = list;
            this.f187273x = list;
            this.f187274y = list;
            this.z = list;
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.u.get(i);
        }

        public int getAnnotationCount() {
            return this.u.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.u;
        }

        public Annotation getBackingFieldAnnotation(int i) {
            return (Annotation) this.f187274y.get(i);
        }

        public int getBackingFieldAnnotationCount() {
            return this.f187274y.size();
        }

        public List<Annotation> getBackingFieldAnnotationList() {
            return this.f187274y;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.f187271t.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.f187271t.size();
        }

        public ValueParameter getContextParameter(int i) {
            return (ValueParameter) this.o.get(i);
        }

        public int getContextParameterCount() {
            return this.o.size();
        }

        public List<ValueParameter> getContextParameterList() {
            return this.o;
        }

        public Type getContextReceiverType(int i) {
            return (Type) this.f187264l.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.f187264l.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f187265m;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f187264l;
        }

        public Annotation getDelegateFieldAnnotation(int i) {
            return (Annotation) this.z.get(i);
        }

        public int getDelegateFieldAnnotationCount() {
            return this.z.size();
        }

        public List<Annotation> getDelegateFieldAnnotationList() {
            return this.z;
        }

        public Annotation getExtensionReceiverAnnotation(int i) {
            return (Annotation) this.f187273x.get(i);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.f187273x.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.f187273x;
        }

        public int getFlags() {
            return this.d;
        }

        public Annotation getGetterAnnotation(int i) {
            return (Annotation) this.v.get(i);
        }

        public int getGetterAnnotationCount() {
            return this.v.size();
        }

        public List<Annotation> getGetterAnnotationList() {
            return this.v;
        }

        public int getGetterFlags() {
            return this.f187268q;
        }

        public int getName() {
            return this.f;
        }

        public int getOldFlags() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f187263j;
        }

        public int getReceiverTypeId() {
            return this.k;
        }

        public Type getReturnType() {
            return this.f187261g;
        }

        public int getReturnTypeId() {
            return this.f187262h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.B;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187260c & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.e) : 0;
            if ((this.f187260c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f);
            }
            if ((this.f187260c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f187261g);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.i.get(i2));
            }
            if ((this.f187260c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f187263j);
            }
            if ((this.f187260c & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f187267p);
            }
            if ((this.f187260c & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f187268q);
            }
            if ((this.f187260c & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f187269r);
            }
            if ((this.f187260c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f187262h);
            }
            if ((this.f187260c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, this.k);
            }
            if ((this.f187260c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.d);
            }
            for (int i3 = 0; i3 < this.f187264l.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, (MessageLite) this.f187264l.get(i3));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i5 = 0; i5 < this.f187265m.size(); i5++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187265m.get(i5)).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f187266n = iComputeInt32SizeNoTag;
            for (int i6 = 0; i6 < this.u.size(); i6++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, (MessageLite) this.u.get(i6));
            }
            for (int i21 = 0; i21 < this.v.size(); i21++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, (MessageLite) this.v.get(i21));
            }
            for (int i22 = 0; i22 < this.f187272w.size(); i22++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, (MessageLite) this.f187272w.get(i22));
            }
            for (int i32 = 0; i32 < this.o.size(); i32++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, (MessageLite) this.o.get(i32));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i33 = 0; i33 < this.f187270s.size(); i33++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187270s.get(i33)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize + iComputeInt32SizeNoTag2;
            for (int i43 = 0; i43 < this.f187271t.size(); i43++) {
                size += CodedOutputStream.computeMessageSize(32, (MessageLite) this.f187271t.get(i43));
            }
            for (int i59 = 0; i59 < this.f187273x.size(); i59++) {
                size += CodedOutputStream.computeMessageSize(33, (MessageLite) this.f187273x.get(i59));
            }
            for (int i66 = 0; i66 < this.f187274y.size(); i66++) {
                size += CodedOutputStream.computeMessageSize(34, (MessageLite) this.f187274y.get(i66));
            }
            for (int i74 = 0; i74 < this.z.size(); i74++) {
                size += CodedOutputStream.computeMessageSize(35, (MessageLite) this.z.get(i74));
            }
            int size2 = this.f187259b.size() + a() + size;
            this.B = size2;
            return size2;
        }

        public Annotation getSetterAnnotation(int i) {
            return (Annotation) this.f187272w.get(i);
        }

        public int getSetterAnnotationCount() {
            return this.f187272w.size();
        }

        public List<Annotation> getSetterAnnotationList() {
            return this.f187272w;
        }

        public int getSetterFlags() {
            return this.f187269r;
        }

        public ValueParameter getSetterValueParameter() {
            return this.f187267p;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.i.get(i);
        }

        public int getTypeParameterCount() {
            return this.i.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.i;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f187270s;
        }

        public boolean hasFlags() {
            return (this.f187260c & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.f187260c & 256) == 256;
        }

        public boolean hasName() {
            return (this.f187260c & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f187260c & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f187260c & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f187260c & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f187260c & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f187260c & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.f187260c & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.f187260c & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.A;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (!hasName()) {
                this.A = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.A = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.A = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.A = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                if (!getCompilerPluginData(i5).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                if (!getAnnotation(i6).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i21 = 0; i21 < getGetterAnnotationCount(); i21++) {
                if (!getGetterAnnotation(i21).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i22 = 0; i22 < getSetterAnnotationCount(); i22++) {
                if (!getSetterAnnotation(i22).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i32 = 0; i32 < getExtensionReceiverAnnotationCount(); i32++) {
                if (!getExtensionReceiverAnnotation(i32).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i33 = 0; i33 < getBackingFieldAnnotationCount(); i33++) {
                if (!getBackingFieldAnnotation(i33).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i43 = 0; i43 < getDelegateFieldAnnotationCount(); i43++) {
                if (!getDelegateFieldAnnotation(i43).isInitialized()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.A = (byte) 1;
                return true;
            }
            this.A = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187260c & 2) == 2) {
                codedOutputStream.writeInt32(1, this.e);
            }
            if ((this.f187260c & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f);
            }
            if ((this.f187260c & 8) == 8) {
                codedOutputStream.writeMessage(3, this.f187261g);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.i.get(i));
            }
            if ((this.f187260c & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f187263j);
            }
            if ((this.f187260c & 128) == 128) {
                codedOutputStream.writeMessage(6, this.f187267p);
            }
            if ((this.f187260c & 256) == 256) {
                codedOutputStream.writeInt32(7, this.f187268q);
            }
            if ((this.f187260c & 512) == 512) {
                codedOutputStream.writeInt32(8, this.f187269r);
            }
            if ((this.f187260c & 16) == 16) {
                codedOutputStream.writeInt32(9, this.f187262h);
            }
            if ((this.f187260c & 64) == 64) {
                codedOutputStream.writeInt32(10, this.k);
            }
            if ((this.f187260c & 1) == 1) {
                codedOutputStream.writeInt32(11, this.d);
            }
            for (int i2 = 0; i2 < this.f187264l.size(); i2++) {
                codedOutputStream.writeMessage(12, (MessageLite) this.f187264l.get(i2));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.f187266n);
            }
            for (int i3 = 0; i3 < this.f187265m.size(); i3++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f187265m.get(i3)).intValue());
            }
            for (int i5 = 0; i5 < this.u.size(); i5++) {
                codedOutputStream.writeMessage(14, (MessageLite) this.u.get(i5));
            }
            for (int i6 = 0; i6 < this.v.size(); i6++) {
                codedOutputStream.writeMessage(15, (MessageLite) this.v.get(i6));
            }
            for (int i21 = 0; i21 < this.f187272w.size(); i21++) {
                codedOutputStream.writeMessage(16, (MessageLite) this.f187272w.get(i21));
            }
            for (int i22 = 0; i22 < this.o.size(); i22++) {
                codedOutputStream.writeMessage(17, (MessageLite) this.o.get(i22));
            }
            for (int i32 = 0; i32 < this.f187270s.size(); i32++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f187270s.get(i32)).intValue());
            }
            for (int i33 = 0; i33 < this.f187271t.size(); i33++) {
                codedOutputStream.writeMessage(32, (MessageLite) this.f187271t.get(i33));
            }
            for (int i43 = 0; i43 < this.f187273x.size(); i43++) {
                codedOutputStream.writeMessage(33, (MessageLite) this.f187273x.get(i43));
            }
            for (int i59 = 0; i59 < this.f187274y.size(); i59++) {
                codedOutputStream.writeMessage(34, (MessageLite) this.f187274y.get(i59));
            }
            for (int i66 = 0; i66 < this.z.size(); i66++) {
                codedOutputStream.writeMessage(35, (MessageLite) this.z.get(i66));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187259b);
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return C;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Property() {
            this.f187266n = -1;
            this.A = (byte) -1;
            this.B = -1;
            this.f187259b = ByteString.EMPTY;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0387  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0395  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x03a3  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x03b1  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x03bd  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x03c9  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x03d5  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x03e1  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x03ed  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x03f9  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
        /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r8v19, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder] */
        /* JADX WARN: Type inference failed for: r8v26, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder] */
        /* JADX WARN: Type inference failed for: r8v9, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Property(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r23, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new w();
        public static final QualifiedNameTable e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f187290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f187291c;
        public int d;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187292b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List f187293c = Collections.EMPTY_LIST;

            public static Builder b() {
                return new Builder();
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f187292b & 1) == 1) {
                    this.f187293c = Collections.unmodifiableList(this.f187293c);
                    this.f187292b &= -2;
                }
                qualifiedNameTable.f187290b = this.f187293c;
                return qualifiedNameTable;
            }

            public QualifiedName getQualifiedName(int i) {
                return (QualifiedName) this.f187293c.get(i);
            }

            public int getQualifiedNameCount() {
                return this.f187293c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw new UninitializedMessageException(qualifiedNameTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.f187290b.isEmpty()) {
                    if (this.f187293c.isEmpty()) {
                        this.f187293c = qualifiedNameTable.f187290b;
                        this.f187292b &= -2;
                    } else {
                        if ((this.f187292b & 1) != 1) {
                            this.f187293c = new ArrayList(this.f187293c);
                            this.f187292b |= 1;
                        }
                        this.f187293c.addAll(qualifiedNameTable.f187290b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.f187289a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$Builder");
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new x();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final QualifiedName f187294h;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ByteString f187295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187297c;
            public int d;
            public Kind e;
            public byte f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187298g;

            /* JADX INFO: loaded from: classes14.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f187299b;
                public int d;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f187300c = -1;
                public Kind e = Kind.PACKAGE;

                public static Builder b() {
                    return new Builder();
                }

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.f187299b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.f187297c = this.f187300c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.d = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.e = this.e;
                    qualifiedName.f187296b = i2;
                    return qualifiedName;
                }

                public boolean hasShortName() {
                    return (this.f187299b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                public Builder setKind(Kind kind) {
                    kind.getClass();
                    this.f187299b |= 4;
                    this.e = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i) {
                    this.f187299b |= 1;
                    this.f187300c = i;
                    return this;
                }

                public Builder setShortName(int i) {
                    this.f187299b |= 2;
                    this.d = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw new UninitializedMessageException(qualifiedNameBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo3794clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.f187295a));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Builder");
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new y();
                private final int value;

                Kind(int i) {
                    this.value = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                f187294h = qualifiedName;
                qualifiedName.f187297c = -1;
                qualifiedName.d = 0;
                qualifiedName.e = Kind.PACKAGE;
            }

            public QualifiedName() {
                this.f = (byte) -1;
                this.f187298g = -1;
                this.f187295a = ByteString.EMPTY;
            }

            public static QualifiedName getDefaultInstance() {
                return f187294h;
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            public Kind getKind() {
                return this.e;
            }

            public int getParentQualifiedName() {
                return this.f187297c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.f187298g;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.f187296b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187297c) : 0;
                if ((this.f187296b & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
                }
                if ((this.f187296b & 4) == 4) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
                }
                int size = this.f187295a.size() + iComputeInt32Size;
                this.f187298g = size;
                return size;
            }

            public int getShortName() {
                return this.d;
            }

            public boolean hasKind() {
                return (this.f187296b & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.f187296b & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.f187296b & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b4 = this.f;
                if (b4 == 1) {
                    return true;
                }
                if (b4 == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.f = (byte) 1;
                    return true;
                }
                this.f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f187296b & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f187297c);
                }
                if ((this.f187296b & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.d);
                }
                if ((this.f187296b & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.e.getNumber());
                }
                codedOutputStream.writeRawBytes(this.f187295a);
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return f187294h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public QualifiedName(CodedInputStream codedInputStream) {
                this.f = (byte) -1;
                this.f187298g = -1;
                this.f187297c = -1;
                boolean z = false;
                this.d = 0;
                this.e = Kind.PACKAGE;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z) {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 8) {
                                    this.f187296b |= 1;
                                    this.f187297c = codedInputStream.readInt32();
                                } else if (tag2 == 16) {
                                    this.f187296b |= 2;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag2 != 24) {
                                    if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    int i = codedInputStream.readEnum();
                                    Kind kindValueOf = Kind.valueOf(i);
                                    if (kindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                        codedOutputStreamNewInstance.writeRawVarint32(i);
                                    } else {
                                        this.f187296b |= 4;
                                        this.e = kindValueOf;
                                    }
                                }
                            }
                            z = true;
                        } catch (Throwable th10) {
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th11) {
                                this.f187295a = outputNewOutput.toByteString();
                                throw th11;
                            }
                            this.f187295a = outputNewOutput.toByteString();
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
                    this.f187295a = outputNewOutput.toByteString();
                    throw th12;
                }
                this.f187295a = outputNewOutput.toByteString();
            }

            public QualifiedName(Builder builder) {
                this.f = (byte) -1;
                this.f187298g = -1;
                this.f187295a = builder.getUnknownFields();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            e = qualifiedNameTable;
            qualifiedNameTable.f187290b = Collections.EMPTY_LIST;
        }

        public QualifiedNameTable() {
            this.f187291c = (byte) -1;
            this.d = -1;
            this.f187289a = ByteString.EMPTY;
        }

        public static QualifiedNameTable getDefaultInstance() {
            return e;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i) {
            return (QualifiedName) this.f187290b.get(i);
        }

        public int getQualifiedNameCount() {
            return this.f187290b.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.f187290b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f187290b.get(i2));
            }
            int size = this.f187289a.size() + iComputeMessageSize;
            this.d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187291c;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.f187291c = (byte) 0;
                    return false;
                }
            }
            this.f187291c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f187290b.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f187290b.get(i));
            }
            codedOutputStream.writeRawBytes(this.f187289a);
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187291c = (byte) -1;
            this.d = -1;
            this.f187290b = Collections.EMPTY_LIST;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z3 = false;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 != 10) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f187290b = new ArrayList();
                                    z3 = true;
                                }
                                this.f187290b.add(codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (z3) {
                            this.f187290b = Collections.unmodifiableList(this.f187290b);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187289a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187289a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z3) {
                this.f187290b = Collections.unmodifiableList(this.f187290b);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187289a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187289a = outputNewOutput.toByteString();
        }

        public QualifiedNameTable(Builder builder) {
            this.f187291c = (byte) -1;
            this.d = -1;
            this.f187289a = builder.getUnknownFields();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new z();
        public static final StringTable e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LazyStringList f187302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f187303c;
        public int d;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public LazyStringList f187305c = LazyStringArrayList.EMPTY;

            public static Builder b() {
                return new Builder();
            }

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.f187304b & 1) == 1) {
                    this.f187305c = this.f187305c.getUnmodifiableView();
                    this.f187304b &= -2;
                }
                stringTable.f187302b = this.f187305c;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw new UninitializedMessageException(stringTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.f187302b.isEmpty()) {
                    if (this.f187305c.isEmpty()) {
                        this.f187305c = stringTable.f187302b;
                        this.f187304b &= -2;
                    } else {
                        if ((this.f187304b & 1) != 1) {
                            this.f187305c = new LazyStringArrayList(this.f187305c);
                            this.f187304b |= 1;
                        }
                        this.f187305c.addAll(stringTable.f187302b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.f187301a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$Builder");
            }
        }

        static {
            StringTable stringTable = new StringTable();
            e = stringTable;
            stringTable.f187302b = LazyStringArrayList.EMPTY;
        }

        public StringTable() {
            this.f187303c = (byte) -1;
            this.d = -1;
            this.f187301a = ByteString.EMPTY;
        }

        public static StringTable getDefaultInstance() {
            return e;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i2 = 0; i2 < this.f187302b.size(); i2++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.f187302b.getByteString(i2));
            }
            int size = this.f187301a.size() + getStringList().size() + iComputeBytesSizeNoTag;
            this.d = size;
            return size;
        }

        public String getString(int i) {
            return this.f187302b.get(i);
        }

        public ProtocolStringList getStringList() {
            return this.f187302b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187303c;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.f187303c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f187302b.size(); i++) {
                codedOutputStream.writeBytes(1, this.f187302b.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.f187301a);
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public StringTable(CodedInputStream codedInputStream) {
            this.f187303c = (byte) -1;
            this.d = -1;
            this.f187302b = LazyStringArrayList.EMPTY;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z3 = false;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 != 10) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                ByteString bytes = codedInputStream.readBytes();
                                if (!z3) {
                                    this.f187302b = new LazyStringArrayList();
                                    z3 = true;
                                }
                                this.f187302b.add(bytes);
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (z3) {
                            this.f187302b = this.f187302b.getUnmodifiableView();
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187301a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187301a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z3) {
                this.f187302b = this.f187302b.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187301a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187301a = outputNewOutput.toByteString();
        }

        public StringTable(Builder builder) {
            this.f187303c = (byte) -1;
            this.d = -1;
            this.f187301a = builder.getUnknownFields();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new a0();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Type f187306t;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187308c;
        public List d;
        public boolean e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Type f187309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f187310h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187311j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f187312l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Type f187313m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f187314n;
        public Type o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f187315p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f187316q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public byte f187317r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f187318s;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new b0();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final Argument f187319h;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ByteString f187320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Projection f187322c;
            public Type d;
            public int e;
            public byte f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187323g;

            /* JADX INFO: loaded from: classes14.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f187324b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Projection f187325c = Projection.INV;
                public Type d = Type.getDefaultInstance();
                public int e;

                public static Builder b() {
                    return new Builder();
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.f187324b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.f187322c = this.f187325c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.d = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.e = this.e;
                    argument.f187321b = i2;
                    return argument;
                }

                public Type getType() {
                    return this.d;
                }

                public boolean hasType() {
                    return (this.f187324b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                public Builder mergeType(Type type) {
                    if ((this.f187324b & 2) != 2 || this.d == Type.getDefaultInstance()) {
                        this.d = type;
                    } else {
                        this.d = Type.newBuilder(this.d).mergeFrom(type).buildPartial();
                    }
                    this.f187324b |= 2;
                    return this;
                }

                public Builder setProjection(Projection projection) {
                    projection.getClass();
                    this.f187324b |= 1;
                    this.f187325c = projection;
                    return this;
                }

                public Builder setType(Type type) {
                    type.getClass();
                    this.d = type;
                    this.f187324b |= 2;
                    return this;
                }

                public Builder setTypeId(int i) {
                    this.f187324b |= 4;
                    this.e = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw new UninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo3794clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f187320a));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Builder");
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new c0();
                private final int value;

                Projection(int i) {
                    this.value = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            static {
                Argument argument = new Argument();
                f187319h = argument;
                argument.f187322c = Projection.INV;
                argument.d = Type.getDefaultInstance();
                argument.e = 0;
            }

            public Argument() {
                this.f = (byte) -1;
                this.f187323g = -1;
                this.f187320a = ByteString.EMPTY;
            }

            public static Argument getDefaultInstance() {
                return f187319h;
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.f187322c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.f187323g;
                if (i != -1) {
                    return i;
                }
                int iComputeEnumSize = (this.f187321b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f187322c.getNumber()) : 0;
                if ((this.f187321b & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.d);
                }
                if ((this.f187321b & 4) == 4) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.e);
                }
                int size = this.f187320a.size() + iComputeEnumSize;
                this.f187323g = size;
                return size;
            }

            public Type getType() {
                return this.d;
            }

            public int getTypeId() {
                return this.e;
            }

            public boolean hasProjection() {
                return (this.f187321b & 1) == 1;
            }

            public boolean hasType() {
                return (this.f187321b & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.f187321b & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b4 = this.f;
                if (b4 == 1) {
                    return true;
                }
                if (b4 == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.f = (byte) 1;
                    return true;
                }
                this.f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f187321b & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.f187322c.getNumber());
                }
                if ((this.f187321b & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.d);
                }
                if ((this.f187321b & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.e);
                }
                codedOutputStream.writeRawBytes(this.f187320a);
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f187319h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f = (byte) -1;
                this.f187323g = -1;
                this.f187322c = Projection.INV;
                this.d = Type.getDefaultInstance();
                boolean z = false;
                this.e = 0;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int tag2 = codedInputStream.readTag();
                                if (tag2 != 0) {
                                    if (tag2 == 8) {
                                        int i = codedInputStream.readEnum();
                                        Projection projectionValueOf = Projection.valueOf(i);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                            codedOutputStreamNewInstance.writeRawVarint32(i);
                                        } else {
                                            this.f187321b |= 1;
                                            this.f187322c = projectionValueOf;
                                        }
                                    } else if (tag2 == 18) {
                                        Builder builder = (this.f187321b & 2) == 2 ? this.d.toBuilder() : null;
                                        Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.d = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.d = builder.buildPartial();
                                        }
                                        this.f187321b |= 2;
                                    } else if (tag2 != 24) {
                                        if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                        }
                                    } else {
                                        this.f187321b |= 4;
                                        this.e = codedInputStream.readInt32();
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
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187320a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187320a = outputNewOutput.toByteString();
                        throw th10;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th12) {
                    this.f187320a = outputNewOutput.toByteString();
                    throw th12;
                }
                this.f187320a = outputNewOutput.toByteString();
            }

            public Argument(Builder builder) {
                this.f = (byte) -1;
                this.f187323g = -1;
                this.f187320a = builder.getUnknownFields();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            public int d;
            public boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187326g;
            public int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f187328j;
            public int k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f187329l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f187330m;
            public int o;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f187333q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f187334r;
            public List e = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Type f187327h = Type.getDefaultInstance();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Type f187331n = Type.getDefaultInstance();

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Type f187332p = Type.getDefaultInstance();

            public Builder addArgument(Argument.Builder builder) {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.add(builder.build());
                return this;
            }

            public Type buildPartial() {
                Type type = new Type(this);
                int i = this.d;
                if ((i & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.d &= -2;
                }
                type.d = this.e;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.f = this.f187326g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.f187309g = this.f187327h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.f187310h = this.i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.i = this.f187328j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.f187311j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.k = this.f187329l;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.f187312l = this.f187330m;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.f187313m = this.f187331n;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.f187314n = this.o;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.o = this.f187332p;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.f187315p = this.f187333q;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.f187316q = this.f187334r;
                type.f187308c = i2;
                return type;
            }

            public Type getAbbreviatedType() {
                return this.f187332p;
            }

            public Argument getArgument(int i) {
                return (Argument) this.e.get(i);
            }

            public int getArgumentCount() {
                return this.e.size();
            }

            public Type getFlexibleUpperBound() {
                return this.f187327h;
            }

            public Type getOuterType() {
                return this.f187331n;
            }

            public boolean hasAbbreviatedType() {
                return (this.d & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.d & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.d & 512) == 512;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && this.f187503b.f();
                }
                return false;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.d & 2048) != 2048 || this.f187332p == Type.getDefaultInstance()) {
                    this.f187332p = type;
                } else {
                    this.f187332p = Type.newBuilder(this.f187332p).mergeFrom(type).buildPartial();
                }
                this.d |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.d & 8) != 8 || this.f187327h == Type.getDefaultInstance()) {
                    this.f187327h = type;
                } else {
                    this.f187327h = Type.newBuilder(this.f187327h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.d & 512) != 512 || this.f187331n == Type.getDefaultInstance()) {
                    this.f187331n = type;
                } else {
                    this.f187331n = Type.newBuilder(this.f187331n).mergeFrom(type).buildPartial();
                }
                this.d |= 512;
                return this;
            }

            public Builder setAbbreviatedType(Type type) {
                type.getClass();
                this.f187332p = type;
                this.d |= 2048;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i) {
                this.d |= 4096;
                this.f187333q = i;
                return this;
            }

            public Builder setClassName(int i) {
                this.d |= 32;
                this.f187328j = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 8192;
                this.f187334r = i;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i) {
                this.d |= 4;
                this.f187326g = i;
                return this;
            }

            public Builder setFlexibleUpperBound(Type type) {
                type.getClass();
                this.f187327h = type;
                this.d |= 8;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            public Builder setNullable(boolean z) {
                this.d |= 2;
                this.f = z;
                return this;
            }

            public Builder setOuterType(Type type) {
                type.getClass();
                this.f187331n = type;
                this.d |= 512;
                return this;
            }

            public Builder setOuterTypeId(int i) {
                this.d |= 1024;
                this.o = i;
                return this;
            }

            public Builder setTypeAliasName(int i) {
                this.d |= 256;
                this.f187330m = i;
                return this;
            }

            public Builder setTypeParameter(int i) {
                this.d |= 64;
                this.k = i;
                return this;
            }

            public Builder setTypeParameterName(int i) {
                this.d |= 128;
                this.f187329l = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw new UninitializedMessageException(typeBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.d.isEmpty()) {
                    if (this.e.isEmpty()) {
                        this.e = type.d;
                        this.d &= -2;
                    } else {
                        if ((this.d & 1) != 1) {
                            this.e = new ArrayList(this.e);
                            this.d |= 1;
                        }
                        this.e.addAll(type.d);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                b(type);
                setUnknownFields(getUnknownFields().concat(type.f187307b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder");
            }
        }

        static {
            Type type = new Type();
            f187306t = type;
            type.e();
        }

        public Type(Builder builder) {
            super(builder);
            this.f187317r = (byte) -1;
            this.f187318s = -1;
            this.f187307b = builder.getUnknownFields();
        }

        public static Type getDefaultInstance() {
            return f187306t;
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        public final void e() {
            this.d = Collections.EMPTY_LIST;
            this.e = false;
            this.f = 0;
            this.f187309g = getDefaultInstance();
            this.f187310h = 0;
            this.i = 0;
            this.f187311j = 0;
            this.k = 0;
            this.f187312l = 0;
            this.f187313m = getDefaultInstance();
            this.f187314n = 0;
            this.o = getDefaultInstance();
            this.f187315p = 0;
            this.f187316q = 0;
        }

        public Type getAbbreviatedType() {
            return this.o;
        }

        public int getAbbreviatedTypeId() {
            return this.f187315p;
        }

        public Argument getArgument(int i) {
            return (Argument) this.d.get(i);
        }

        public int getArgumentCount() {
            return this.d.size();
        }

        public List<Argument> getArgumentList() {
            return this.d;
        }

        public int getClassName() {
            return this.i;
        }

        public int getFlags() {
            return this.f187316q;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.f;
        }

        public Type getFlexibleUpperBound() {
            return this.f187309g;
        }

        public int getFlexibleUpperBoundId() {
            return this.f187310h;
        }

        public boolean getNullable() {
            return this.e;
        }

        public Type getOuterType() {
            return this.f187313m;
        }

        public int getOuterTypeId() {
            return this.f187314n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187318s;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187308c & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.f187316q) : 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.d.get(i2));
            }
            if ((this.f187308c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.e);
            }
            if ((this.f187308c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f);
            }
            if ((this.f187308c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f187309g);
            }
            if ((this.f187308c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.i);
            }
            if ((this.f187308c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f187311j);
            }
            if ((this.f187308c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f187310h);
            }
            if ((this.f187308c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.k);
            }
            if ((this.f187308c & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.f187313m);
            }
            if ((this.f187308c & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.f187314n);
            }
            if ((this.f187308c & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, this.f187312l);
            }
            if ((this.f187308c & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, this.o);
            }
            if ((this.f187308c & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.f187315p);
            }
            int size = this.f187307b.size() + a() + iComputeInt32Size;
            this.f187318s = size;
            return size;
        }

        public int getTypeAliasName() {
            return this.f187312l;
        }

        public int getTypeParameter() {
            return this.f187311j;
        }

        public int getTypeParameterName() {
            return this.k;
        }

        public boolean hasAbbreviatedType() {
            return (this.f187308c & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.f187308c & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.f187308c & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.f187308c & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.f187308c & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.f187308c & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.f187308c & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.f187308c & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.f187308c & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.f187308c & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.f187308c & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.f187308c & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.f187308c & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187317r;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.f187317r = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.f187317r = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.f187317r = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.f187317r = (byte) 0;
                return false;
            }
            if (this.f187505a.f()) {
                this.f187317r = (byte) 1;
                return true;
            }
            this.f187317r = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187308c & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.f187316q);
            }
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.d.get(i));
            }
            if ((this.f187308c & 1) == 1) {
                codedOutputStream.writeBool(3, this.e);
            }
            if ((this.f187308c & 2) == 2) {
                codedOutputStream.writeInt32(4, this.f);
            }
            if ((this.f187308c & 4) == 4) {
                codedOutputStream.writeMessage(5, this.f187309g);
            }
            if ((this.f187308c & 16) == 16) {
                codedOutputStream.writeInt32(6, this.i);
            }
            if ((this.f187308c & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f187311j);
            }
            if ((this.f187308c & 8) == 8) {
                codedOutputStream.writeInt32(8, this.f187310h);
            }
            if ((this.f187308c & 64) == 64) {
                codedOutputStream.writeInt32(9, this.k);
            }
            if ((this.f187308c & 256) == 256) {
                codedOutputStream.writeMessage(10, this.f187313m);
            }
            if ((this.f187308c & 512) == 512) {
                codedOutputStream.writeInt32(11, this.f187314n);
            }
            if ((this.f187308c & 128) == 128) {
                codedOutputStream.writeInt32(12, this.f187312l);
            }
            if ((this.f187308c & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.o);
            }
            if ((this.f187308c & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.f187315p);
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187307b);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return f187306t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Type() {
            this.f187317r = (byte) -1;
            this.f187318s = -1;
            this.f187307b = ByteString.EMPTY;
        }

        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Builder builder;
            this.f187317r = (byte) -1;
            this.f187318s = -1;
            e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z3 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            switch (tag2) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    this.f187308c |= 4096;
                                    this.f187316q = codedInputStream.readInt32();
                                    break;
                                case 18:
                                    if (!z3) {
                                        this.d = new ArrayList();
                                        z3 = true;
                                    }
                                    this.d.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                    break;
                                case 24:
                                    this.f187308c |= 1;
                                    this.e = codedInputStream.readBool();
                                    break;
                                case 32:
                                    this.f187308c |= 2;
                                    this.f = codedInputStream.readInt32();
                                    break;
                                case 42:
                                    builder = (this.f187308c & 4) == 4 ? this.f187309g.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f187309g = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f187309g = builder.buildPartial();
                                    }
                                    this.f187308c |= 4;
                                    break;
                                case 48:
                                    this.f187308c |= 16;
                                    this.i = codedInputStream.readInt32();
                                    break;
                                case 56:
                                    this.f187308c |= 32;
                                    this.f187311j = codedInputStream.readInt32();
                                    break;
                                case 64:
                                    this.f187308c |= 8;
                                    this.f187310h = codedInputStream.readInt32();
                                    break;
                                case 72:
                                    this.f187308c |= 64;
                                    this.k = codedInputStream.readInt32();
                                    break;
                                case 82:
                                    builder = (this.f187308c & 256) == 256 ? this.f187313m.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f187313m = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.f187313m = builder.buildPartial();
                                    }
                                    this.f187308c |= 256;
                                    break;
                                case 88:
                                    this.f187308c |= 512;
                                    this.f187314n = codedInputStream.readInt32();
                                    break;
                                case 96:
                                    this.f187308c |= 128;
                                    this.f187312l = codedInputStream.readInt32();
                                    break;
                                case 106:
                                    builder = (this.f187308c & 1024) == 1024 ? this.o.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.o = type3;
                                    if (builder != null) {
                                        builder.mergeFrom(type3);
                                        this.o = builder.buildPartial();
                                    }
                                    this.f187308c |= 1024;
                                    break;
                                case 112:
                                    this.f187308c |= 2048;
                                    this.f187315p = codedInputStream.readInt32();
                                    break;
                                default:
                                    if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th10) {
                    if (z3) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187307b = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187307b = outputNewOutput.toByteString();
                    b();
                    throw th10;
                }
            }
            if (z3) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187307b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187307b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new d0();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final TypeAlias f187335p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187337c;
        public int d;
        public int e;
        public List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Type f187338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f187339h;
        public Type i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187340j;
        public List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f187341l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f187342m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public byte f187343n;
        public int o;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            public int d;
            public int e = 6;
            public int f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public List f187344g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Type f187345h;
            public int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Type f187346j;
            public int k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public List f187347l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public List f187348m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public List f187349n;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.f187344g = list;
                this.f187345h = Type.getDefaultInstance();
                this.f187346j = Type.getDefaultInstance();
                this.f187347l = list;
                this.f187348m = list;
                this.f187349n = list;
            }

            public static Builder c() {
                return new Builder();
            }

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.e = this.f;
                if ((i & 4) == 4) {
                    this.f187344g = Collections.unmodifiableList(this.f187344g);
                    this.d &= -5;
                }
                typeAlias.f = this.f187344g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.f187338g = this.f187345h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.f187339h = this.i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.i = this.f187346j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.f187340j = this.k;
                if ((this.d & 128) == 128) {
                    this.f187347l = Collections.unmodifiableList(this.f187347l);
                    this.d &= -129;
                }
                typeAlias.k = this.f187347l;
                if ((this.d & 256) == 256) {
                    this.f187348m = Collections.unmodifiableList(this.f187348m);
                    this.d &= -257;
                }
                typeAlias.f187341l = this.f187348m;
                if ((this.d & 512) == 512) {
                    this.f187349n = Collections.unmodifiableList(this.f187349n);
                    this.d &= -513;
                }
                typeAlias.f187342m = this.f187349n;
                typeAlias.f187337c = i2;
                return typeAlias;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.f187347l.get(i);
            }

            public int getAnnotationCount() {
                return this.f187347l.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.f187349n.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.f187349n.size();
            }

            public Type getExpandedType() {
                return this.f187346j;
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.f187344g.get(i);
            }

            public int getTypeParameterCount() {
                return this.f187344g.size();
            }

            public Type getUnderlyingType() {
                return this.f187345h;
            }

            public boolean hasExpandedType() {
                return (this.d & 32) == 32;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.d & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                    if (!getCompilerPluginData(i3).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.d & 32) != 32 || this.f187346j == Type.getDefaultInstance()) {
                    this.f187346j = type;
                } else {
                    this.f187346j = Type.newBuilder(this.f187346j).mergeFrom(type).buildPartial();
                }
                this.d |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.d & 8) != 8 || this.f187345h == Type.getDefaultInstance()) {
                    this.f187345h = type;
                } else {
                    this.f187345h = Type.newBuilder(this.f187345h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i) {
                this.d |= 64;
                this.k = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setUnderlyingTypeId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw new UninitializedMessageException(typeAliasBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.f.isEmpty()) {
                    if (this.f187344g.isEmpty()) {
                        this.f187344g = typeAlias.f;
                        this.d &= -5;
                    } else {
                        if ((this.d & 4) != 4) {
                            this.f187344g = new ArrayList(this.f187344g);
                            this.d |= 4;
                        }
                        this.f187344g.addAll(typeAlias.f);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.k.isEmpty()) {
                    if (this.f187347l.isEmpty()) {
                        this.f187347l = typeAlias.k;
                        this.d &= -129;
                    } else {
                        if ((this.d & 128) != 128) {
                            this.f187347l = new ArrayList(this.f187347l);
                            this.d |= 128;
                        }
                        this.f187347l.addAll(typeAlias.k);
                    }
                }
                if (!typeAlias.f187341l.isEmpty()) {
                    if (this.f187348m.isEmpty()) {
                        this.f187348m = typeAlias.f187341l;
                        this.d &= -257;
                    } else {
                        if ((this.d & 256) != 256) {
                            this.f187348m = new ArrayList(this.f187348m);
                            this.d |= 256;
                        }
                        this.f187348m.addAll(typeAlias.f187341l);
                    }
                }
                if (!typeAlias.f187342m.isEmpty()) {
                    if (this.f187349n.isEmpty()) {
                        this.f187349n = typeAlias.f187342m;
                        this.d &= -513;
                    } else {
                        if ((this.d & 512) != 512) {
                            this.f187349n = new ArrayList(this.f187349n);
                            this.d |= 512;
                        }
                        this.f187349n.addAll(typeAlias.f187342m);
                    }
                }
                b(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.f187336b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$Builder");
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            f187335p = typeAlias;
            typeAlias.e();
        }

        public TypeAlias(Builder builder) {
            super(builder);
            this.f187343n = (byte) -1;
            this.o = -1;
            this.f187336b = builder.getUnknownFields();
        }

        public static TypeAlias getDefaultInstance() {
            return f187335p;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public final void e() {
            this.d = 6;
            this.e = 0;
            List list = Collections.EMPTY_LIST;
            this.f = list;
            this.f187338g = Type.getDefaultInstance();
            this.f187339h = 0;
            this.i = Type.getDefaultInstance();
            this.f187340j = 0;
            this.k = list;
            this.f187341l = list;
            this.f187342m = list;
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.k.get(i);
        }

        public int getAnnotationCount() {
            return this.k.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.k;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.f187342m.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.f187342m.size();
        }

        public Type getExpandedType() {
            return this.i;
        }

        public int getExpandedTypeId() {
            return this.f187340j;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.o;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187337c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if ((this.f187337c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.e);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f.get(i2));
            }
            if ((this.f187337c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f187338g);
            }
            if ((this.f187337c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f187339h);
            }
            if ((this.f187337c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.i);
            }
            if ((this.f187337c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f187340j);
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, (MessageLite) this.k.get(i3));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i5 = 0; i5 < this.f187341l.size(); i5++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f187341l.get(i5)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeInt32Size + iComputeInt32SizeNoTag;
            for (int i6 = 0; i6 < this.f187342m.size(); i6++) {
                size += CodedOutputStream.computeMessageSize(32, (MessageLite) this.f187342m.get(i6));
            }
            int size2 = this.f187336b.size() + a() + size;
            this.o = size2;
            return size2;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.f.get(i);
        }

        public int getTypeParameterCount() {
            return this.f.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f;
        }

        public Type getUnderlyingType() {
            return this.f187338g;
        }

        public int getUnderlyingTypeId() {
            return this.f187339h;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f187341l;
        }

        public boolean hasExpandedType() {
            return (this.f187337c & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.f187337c & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.f187337c & 1) == 1;
        }

        public boolean hasName() {
            return (this.f187337c & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.f187337c & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.f187337c & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187343n;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f187343n = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.f187343n = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.f187343n = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.f187343n = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.f187343n = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                if (!getCompilerPluginData(i3).isInitialized()) {
                    this.f187343n = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.f187343n = (byte) 1;
                return true;
            }
            this.f187343n = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187337c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if ((this.f187337c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e);
            }
            for (int i = 0; i < this.f.size(); i++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f.get(i));
            }
            if ((this.f187337c & 4) == 4) {
                codedOutputStream.writeMessage(4, this.f187338g);
            }
            if ((this.f187337c & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f187339h);
            }
            if ((this.f187337c & 16) == 16) {
                codedOutputStream.writeMessage(6, this.i);
            }
            if ((this.f187337c & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f187340j);
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                codedOutputStream.writeMessage(8, (MessageLite) this.k.get(i2));
            }
            for (int i3 = 0; i3 < this.f187341l.size(); i3++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f187341l.get(i3)).intValue());
            }
            for (int i5 = 0; i5 < this.f187342m.size(); i5++) {
                codedOutputStream.writeMessage(32, (MessageLite) this.f187342m.get(i5));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187336b);
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return f187335p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeAlias() {
            this.f187343n = (byte) -1;
            this.o = -1;
            this.f187336b = ByteString.EMPTY;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Type.Builder builder;
            this.f187343n = (byte) -1;
            this.o = -1;
            e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? C = 128;
                if (!z) {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            switch (tag2) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    this.f187337c |= 1;
                                    this.d = codedInputStream.readInt32();
                                    break;
                                case 16:
                                    this.f187337c |= 2;
                                    this.e = codedInputStream.readInt32();
                                    break;
                                case 26:
                                    if ((i & 4) != 4) {
                                        this.f = new ArrayList();
                                        i |= 4;
                                    }
                                    this.f.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                    break;
                                case 34:
                                    builder = (this.f187337c & 4) == 4 ? this.f187338g.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f187338g = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f187338g = builder.buildPartial();
                                    }
                                    this.f187337c |= 4;
                                    break;
                                case 40:
                                    this.f187337c |= 8;
                                    this.f187339h = codedInputStream.readInt32();
                                    break;
                                case 50:
                                    builder = (this.f187337c & 16) == 16 ? this.i.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.i = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.i = builder.buildPartial();
                                    }
                                    this.f187337c |= 16;
                                    break;
                                case 56:
                                    this.f187337c |= 32;
                                    this.f187340j = codedInputStream.readInt32();
                                    break;
                                case 66:
                                    if ((i & 128) != 128) {
                                        this.k = new ArrayList();
                                        i |= 128;
                                    }
                                    this.k.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                    break;
                                case Constants.TAG_FULL_SVPP_IDENTIFICATION /* 248 */:
                                    if ((i & 256) != 256) {
                                        this.f187341l = new ArrayList();
                                        i |= 256;
                                    }
                                    this.f187341l.add(Integer.valueOf(codedInputStream.readInt32()));
                                    break;
                                case Constants.TAG_SUPPORTED_LOCALE_LIST /* 250 */:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f187341l = new ArrayList();
                                        i |= 256;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f187341l.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    break;
                                case 258:
                                    if ((i & 512) != 512) {
                                        this.f187342m = new ArrayList();
                                        i |= 512;
                                    }
                                    this.f187342m.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                                    break;
                                default:
                                    C = c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2);
                                    if (C == 0) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (Throwable th10) {
                            if ((i & 4) == 4) {
                                this.f = Collections.unmodifiableList(this.f);
                            }
                            if ((i & 128) == C) {
                                this.k = Collections.unmodifiableList(this.k);
                            }
                            if ((i & 256) == 256) {
                                this.f187341l = Collections.unmodifiableList(this.f187341l);
                            }
                            if ((i & 512) == 512) {
                                this.f187342m = Collections.unmodifiableList(this.f187342m);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th11) {
                                this.f187336b = outputNewOutput.toByteString();
                                throw th11;
                            }
                            this.f187336b = outputNewOutput.toByteString();
                            b();
                            throw th10;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } else {
                    if ((i & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if ((i & 128) == 128) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i & 256) == 256) {
                        this.f187341l = Collections.unmodifiableList(this.f187341l);
                    }
                    if ((i & 512) == 512) {
                        this.f187342m = Collections.unmodifiableList(this.f187342m);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } catch (Throwable th12) {
                        this.f187336b = outputNewOutput.toByteString();
                        throw th12;
                    }
                    this.f187336b = outputNewOutput.toByteString();
                    b();
                    return;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new e0();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final TypeParameter f187350m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187352c;
        public int d;
        public int e;
        public boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Variance f187353g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f187354h;
        public List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187355j;
        public byte k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f187356l;

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            public int d;
            public int e;
            public int f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f187357g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Variance f187358h = Variance.INV;
            public List i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public List f187359j;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.i = list;
                this.f187359j = list;
            }

            public static Builder c() {
                return new Builder();
            }

            public Builder addUpperBound(Type type) {
                type.getClass();
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.add(type);
                return this;
            }

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.f = this.f187357g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.f187353g = this.f187358h;
                if ((i & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                typeParameter.f187354h = this.i;
                if ((this.d & 32) == 32) {
                    this.f187359j = Collections.unmodifiableList(this.f187359j);
                    this.d &= -33;
                }
                typeParameter.i = this.f187359j;
                typeParameter.f187352c = i2;
                return typeParameter;
            }

            public Type getUpperBound(int i) {
                return (Type) this.i.get(i);
            }

            public int getUpperBoundCount() {
                return this.i.size();
            }

            public boolean hasId() {
                return (this.d & 1) == 1;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                return this.f187503b.f();
            }

            public Builder setId(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setReified(boolean z) {
                this.d |= 4;
                this.f187357g = z;
                return this;
            }

            public Builder setVariance(Variance variance) {
                variance.getClass();
                this.d |= 8;
                this.f187358h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw new UninitializedMessageException(typeParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.f187354h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = typeParameter.f187354h;
                        this.d &= -17;
                    } else {
                        if ((this.d & 16) != 16) {
                            this.i = new ArrayList(this.i);
                            this.d |= 16;
                        }
                        this.i.addAll(typeParameter.f187354h);
                    }
                }
                if (!typeParameter.i.isEmpty()) {
                    if (this.f187359j.isEmpty()) {
                        this.f187359j = typeParameter.i;
                        this.d &= -33;
                    } else {
                        if ((this.d & 32) != 32) {
                            this.f187359j = new ArrayList(this.f187359j);
                            this.d |= 32;
                        }
                        this.f187359j.addAll(typeParameter.i);
                    }
                }
                b(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.f187351b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Builder");
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new f0();
            private final int value;

            Variance(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            f187350m = typeParameter;
            typeParameter.d = 0;
            typeParameter.e = 0;
            typeParameter.f = false;
            typeParameter.f187353g = Variance.INV;
            List list = Collections.EMPTY_LIST;
            typeParameter.f187354h = list;
            typeParameter.i = list;
        }

        public TypeParameter(Builder builder) {
            super(builder);
            this.f187355j = -1;
            this.k = (byte) -1;
            this.f187356l = -1;
            this.f187351b = builder.getUnknownFields();
        }

        public static TypeParameter getDefaultInstance() {
            return f187350m;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public int getId() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187356l;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187352c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if ((this.f187352c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.e);
            }
            if ((this.f187352c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f);
            }
            if ((this.f187352c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.f187353g.getNumber());
            }
            for (int i2 = 0; i2 < this.f187354h.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f187354h.get(i2));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.i.get(i3)).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f187355j = iComputeInt32SizeNoTag;
            int size = this.f187351b.size() + a() + iComputeInt32SizeNoTag2;
            this.f187356l = size;
            return size;
        }

        public Type getUpperBound(int i) {
            return (Type) this.f187354h.get(i);
        }

        public int getUpperBoundCount() {
            return this.f187354h.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.i;
        }

        public List<Type> getUpperBoundList() {
            return this.f187354h;
        }

        public Variance getVariance() {
            return this.f187353g;
        }

        public boolean hasId() {
            return (this.f187352c & 1) == 1;
        }

        public boolean hasName() {
            return (this.f187352c & 2) == 2;
        }

        public boolean hasReified() {
            return (this.f187352c & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.f187352c & 8) == 8;
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
            if (!hasId()) {
                this.k = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.k = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.k = (byte) 0;
                    return false;
                }
            }
            if (this.f187505a.f()) {
                this.k = (byte) 1;
                return true;
            }
            this.k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187352c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if ((this.f187352c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e);
            }
            if ((this.f187352c & 4) == 4) {
                codedOutputStream.writeBool(3, this.f);
            }
            if ((this.f187352c & 8) == 8) {
                codedOutputStream.writeEnum(4, this.f187353g.getNumber());
            }
            for (int i = 0; i < this.f187354h.size(); i++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f187354h.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.f187355j);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.i.get(i2)).intValue());
            }
            extensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187351b);
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return f187350m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeParameter() {
            this.f187355j = -1;
            this.k = (byte) -1;
            this.f187356l = -1;
            this.f187351b = ByteString.EMPTY;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187355j = -1;
            this.k = (byte) -1;
            this.f187356l = -1;
            boolean z = false;
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.f187353g = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.f187354h = list;
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
                                this.f187352c |= 1;
                                this.d = codedInputStream.readInt32();
                            } else if (tag2 == 16) {
                                this.f187352c |= 2;
                                this.e = codedInputStream.readInt32();
                            } else if (tag2 == 24) {
                                this.f187352c |= 4;
                                this.f = codedInputStream.readBool();
                            } else if (tag2 == 32) {
                                int i2 = codedInputStream.readEnum();
                                Variance varianceValueOf = Variance.valueOf(i2);
                                if (varianceValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.f187352c |= 8;
                                    this.f187353g = varianceValueOf;
                                }
                            } else if (tag2 == 42) {
                                if ((i & 16) != 16) {
                                    this.f187354h = new ArrayList();
                                    i |= 16;
                                }
                                this.f187354h.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag2 == 48) {
                                if ((i & 32) != 32) {
                                    this.i = new ArrayList();
                                    i |= 32;
                                }
                                this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag2 != 50) {
                                if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.i = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th10) {
                    if ((i & 16) == 16) {
                        this.f187354h = Collections.unmodifiableList(this.f187354h);
                    }
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187351b = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187351b = outputNewOutput.toByteString();
                    b();
                    throw th10;
                }
            }
            if ((i & 16) == 16) {
                this.f187354h = Collections.unmodifiableList(this.f187354h);
            }
            if ((i & 32) == 32) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187351b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187351b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new g0();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final TypeTable f187360g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f187363c;
        public int d;
        public byte e;
        public int f;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187364b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List f187365c = Collections.EMPTY_LIST;
            public int d = -1;

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.f187364b;
                if ((i & 1) == 1) {
                    this.f187365c = Collections.unmodifiableList(this.f187365c);
                    this.f187364b &= -2;
                }
                typeTable.f187363c = this.f187365c;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.d = this.d;
                typeTable.f187362b = i2;
                return typeTable;
            }

            public Type getType(int i) {
                return (Type) this.f187365c.get(i);
            }

            public int getTypeCount() {
                return this.f187365c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setFirstNullable(int i) {
                this.f187364b |= 2;
                this.d = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw new UninitializedMessageException(typeTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.f187363c.isEmpty()) {
                    if (this.f187365c.isEmpty()) {
                        this.f187365c = typeTable.f187363c;
                        this.f187364b &= -2;
                    } else {
                        if ((this.f187364b & 1) != 1) {
                            this.f187365c = new ArrayList(this.f187365c);
                            this.f187364b |= 1;
                        }
                        this.f187365c.addAll(typeTable.f187363c);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.f187361a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder");
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            f187360g = typeTable;
            typeTable.f187363c = Collections.EMPTY_LIST;
            typeTable.d = -1;
        }

        public TypeTable() {
            this.e = (byte) -1;
            this.f = -1;
            this.f187361a = ByteString.EMPTY;
        }

        public static TypeTable getDefaultInstance() {
            return f187360g;
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        public int getFirstNullable() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = 0;
            for (int i2 = 0; i2 < this.f187363c.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f187363c.get(i2));
            }
            if ((this.f187362b & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int size = this.f187361a.size() + iComputeInt32Size;
            this.f = size;
            return size;
        }

        public Type getType(int i) {
            return (Type) this.f187363c.get(i);
        }

        public int getTypeCount() {
            return this.f187363c.size();
        }

        public List<Type> getTypeList() {
            return this.f187363c;
        }

        public boolean hasFirstNullable() {
            return (this.f187362b & 1) == 1;
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
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.e = (byte) 0;
                    return false;
                }
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f187363c.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f187363c.get(i));
            }
            if ((this.f187362b & 1) == 1) {
                codedOutputStream.writeInt32(2, this.d);
            }
            codedOutputStream.writeRawBytes(this.f187361a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return f187360g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.e = (byte) -1;
            this.f = -1;
            this.f187363c = Collections.EMPTY_LIST;
            this.d = -1;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z3 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag2 = codedInputStream.readTag();
                            if (tag2 != 0) {
                                if (tag2 == 10) {
                                    if (!z3) {
                                        this.f187363c = new ArrayList();
                                        z3 = true;
                                    }
                                    this.f187363c.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                } else if (tag2 != 16) {
                                    if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    this.f187362b |= 1;
                                    this.d = codedInputStream.readInt32();
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
                    if (z3) {
                        this.f187363c = Collections.unmodifiableList(this.f187363c);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th11) {
                        this.f187361a = outputNewOutput.toByteString();
                        throw th11;
                    }
                    this.f187361a = outputNewOutput.toByteString();
                    throw th10;
                }
            }
            if (z3) {
                this.f187363c = Collections.unmodifiableList(this.f187363c);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187361a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187361a = outputNewOutput.toByteString();
        }

        public TypeTable(Builder builder) {
            this.e = (byte) -1;
            this.f = -1;
            this.f187361a = builder.getUnknownFields();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new h0();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final ValueParameter f187366n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f187367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187368c;
        public int d;
        public int e;
        public Type f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f187369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Type f187370h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f187371j;
        public Annotation.Argument.Value k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte f187372l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f187373m;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            public int d;
            public int e;
            public int f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f187375h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f187376j;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Type f187374g = Type.getDefaultInstance();
            public Type i = Type.getDefaultInstance();
            public List k = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public Annotation.Argument.Value f187377l = Annotation.Argument.Value.getDefaultInstance();

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.d |= 64;
                }
                AbstractMessageLite.Builder.a(iterable, this.k);
                return this;
            }

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.f = this.f187374g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.f187369g = this.f187375h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.f187370h = this.i;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.i = this.f187376j;
                if ((i & 64) == 64) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.d &= -65;
                }
                valueParameter.f187371j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                valueParameter.k = this.f187377l;
                valueParameter.f187368c = i2;
                return valueParameter;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.k.get(i);
            }

            public int getAnnotationCount() {
                return this.k.size();
            }

            public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
                return this.f187377l;
            }

            public Type getType() {
                return this.f187374g;
            }

            public Type getVarargElementType() {
                return this.i;
            }

            public boolean hasAnnotationParameterDefaultValue() {
                return (this.d & 128) == 128;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            public boolean hasType() {
                return (this.d & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.d & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    return false;
                }
                if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return (!hasAnnotationParameterDefaultValue() || getAnnotationParameterDefaultValue().isInitialized()) && this.f187503b.f();
            }

            public Builder mergeAnnotationParameterDefaultValue(Annotation.Argument.Value value) {
                if ((this.d & 128) != 128 || this.f187377l == Annotation.Argument.Value.getDefaultInstance()) {
                    this.f187377l = value;
                } else {
                    this.f187377l = Annotation.Argument.Value.newBuilder(this.f187377l).mergeFrom(value).buildPartial();
                }
                this.d |= 128;
                return this;
            }

            public Builder mergeType(Type type) {
                if ((this.d & 4) != 4 || this.f187374g == Type.getDefaultInstance()) {
                    this.f187374g = type;
                } else {
                    this.f187374g = Type.newBuilder(this.f187374g).mergeFrom(type).buildPartial();
                }
                this.d |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.d & 16) != 16 || this.i == Type.getDefaultInstance()) {
                    this.i = type;
                } else {
                    this.i = Type.newBuilder(this.i).mergeFrom(type).buildPartial();
                }
                this.d |= 16;
                return this;
            }

            public Builder setAnnotationParameterDefaultValue(Annotation.Argument.Value value) {
                value.getClass();
                this.f187377l = value;
                this.d |= 128;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.f187374g = type;
                this.d |= 4;
                return this;
            }

            public Builder setTypeId(int i) {
                this.d |= 8;
                this.f187375h = i;
                return this;
            }

            public Builder setVarargElementType(Type type) {
                type.getClass();
                this.i = type;
                this.d |= 16;
                return this;
            }

            public Builder setVarargElementTypeId(int i) {
                this.d |= 32;
                this.f187376j = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw new UninitializedMessageException(valueParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                if (!valueParameter.f187371j.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = valueParameter.f187371j;
                        this.d &= -65;
                    } else {
                        if ((this.d & 64) != 64) {
                            this.k = new ArrayList(this.k);
                            this.d |= 64;
                        }
                        this.k.addAll(valueParameter.f187371j);
                    }
                }
                if (valueParameter.hasAnnotationParameterDefaultValue()) {
                    mergeAnnotationParameterDefaultValue(valueParameter.getAnnotationParameterDefaultValue());
                }
                b(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.f187367b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder");
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            f187366n = valueParameter;
            valueParameter.e();
        }

        public ValueParameter(Builder builder) {
            super(builder);
            this.f187372l = (byte) -1;
            this.f187373m = -1;
            this.f187367b = builder.getUnknownFields();
        }

        public static ValueParameter getDefaultInstance() {
            return f187366n;
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        public final void e() {
            this.d = 0;
            this.e = 0;
            this.f = Type.getDefaultInstance();
            this.f187369g = 0;
            this.f187370h = Type.getDefaultInstance();
            this.i = 0;
            this.f187371j = Collections.EMPTY_LIST;
            this.k = Annotation.Argument.Value.getDefaultInstance();
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.f187371j.get(i);
        }

        public int getAnnotationCount() {
            return this.f187371j.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.f187371j;
        }

        public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
            return this.k;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187373m;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187368c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if ((this.f187368c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.e);
            }
            if ((this.f187368c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f);
            }
            if ((this.f187368c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f187370h);
            }
            if ((this.f187368c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f187369g);
            }
            if ((this.f187368c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.i);
            }
            for (int i2 = 0; i2 < this.f187371j.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f187371j.get(i2));
            }
            if ((this.f187368c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, this.k);
            }
            int size = this.f187367b.size() + a() + iComputeInt32Size;
            this.f187373m = size;
            return size;
        }

        public Type getType() {
            return this.f;
        }

        public int getTypeId() {
            return this.f187369g;
        }

        public Type getVarargElementType() {
            return this.f187370h;
        }

        public int getVarargElementTypeId() {
            return this.i;
        }

        public boolean hasAnnotationParameterDefaultValue() {
            return (this.f187368c & 64) == 64;
        }

        public boolean hasFlags() {
            return (this.f187368c & 1) == 1;
        }

        public boolean hasName() {
            return (this.f187368c & 2) == 2;
        }

        public boolean hasType() {
            return (this.f187368c & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.f187368c & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.f187368c & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.f187368c & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187372l;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f187372l = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.f187372l = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.f187372l = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.f187372l = (byte) 0;
                    return false;
                }
            }
            if (hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) {
                this.f187372l = (byte) 0;
                return false;
            }
            if (this.f187505a.f()) {
                this.f187372l = (byte) 1;
                return true;
            }
            this.f187372l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f187368c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if ((this.f187368c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e);
            }
            if ((this.f187368c & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f);
            }
            if ((this.f187368c & 16) == 16) {
                codedOutputStream.writeMessage(4, this.f187370h);
            }
            if ((this.f187368c & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f187369g);
            }
            if ((this.f187368c & 32) == 32) {
                codedOutputStream.writeInt32(6, this.i);
            }
            for (int i = 0; i < this.f187371j.size(); i++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f187371j.get(i));
            }
            if ((this.f187368c & 64) == 64) {
                codedOutputStream.writeMessage(8, this.k);
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f187367b);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return f187366n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public ValueParameter() {
            this.f187372l = (byte) -1;
            this.f187373m = -1;
            this.f187367b = ByteString.EMPTY;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187372l = (byte) -1;
            this.f187373m = -1;
            e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            char c2 = 0;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 8) {
                                this.f187368c |= 1;
                                this.d = codedInputStream.readInt32();
                            } else if (tag2 != 16) {
                                if (tag2 == 26) {
                                    Type.Builder builder = (this.f187368c & 4) == 4 ? this.f.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f = builder.buildPartial();
                                    }
                                    this.f187368c |= 4;
                                } else if (tag2 == 34) {
                                    Type.Builder builder2 = (this.f187368c & 16) == 16 ? this.f187370h.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f187370h = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.f187370h = builder2.buildPartial();
                                    }
                                    this.f187368c |= 16;
                                } else if (tag2 == 40) {
                                    this.f187368c |= 8;
                                    this.f187369g = codedInputStream.readInt32();
                                } else if (tag2 == 48) {
                                    this.f187368c |= 32;
                                    this.i = codedInputStream.readInt32();
                                } else if (tag2 == 58) {
                                    int i = (c2 == true ? 1 : 0) & '@';
                                    c2 = c2;
                                    if (i != 64) {
                                        this.f187371j = new ArrayList();
                                        c2 = '@';
                                    }
                                    this.f187371j.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                } else if (tag2 != 66) {
                                    if (!c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag2)) {
                                    }
                                } else {
                                    Annotation.Argument.Value.Builder builder3 = (this.f187368c & 64) == 64 ? this.k.toBuilder() : null;
                                    Annotation.Argument.Value value = (Annotation.Argument.Value) codedInputStream.readMessage(Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.k = value;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(value);
                                        this.k = builder3.buildPartial();
                                    }
                                    this.f187368c |= 64;
                                }
                            } else {
                                this.f187368c |= 2;
                                this.e = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (((c2 == true ? 1 : 0) & '@') == 64) {
                            this.f187371j = Collections.unmodifiableList(this.f187371j);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187367b = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187367b = outputNewOutput.toByteString();
                        b();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c2 == true ? 1 : 0) & '@') == 64) {
                this.f187371j = Collections.unmodifiableList(this.f187371j);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187367b = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187367b = outputNewOutput.toByteString();
            b();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new i0();
        public static final VersionRequirement k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f187379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f187380c;
        public int d;
        public Level e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f187381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public VersionKind f187382h;
        public byte i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f187383j;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187384b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f187385c;
            public int d;
            public int f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f187386g;
            public Level e = Level.ERROR;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public VersionKind f187387h = VersionKind.LANGUAGE_VERSION;

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.f187384b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.f187380c = this.f187385c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.f = this.f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.f187381g = this.f187386g;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.f187382h = this.f187387h;
                versionRequirement.f187379b = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setErrorCode(int i) {
                this.f187384b |= 8;
                this.f = i;
                return this;
            }

            public Builder setLevel(Level level) {
                level.getClass();
                this.f187384b |= 4;
                this.e = level;
                return this;
            }

            public Builder setMessage(int i) {
                this.f187384b |= 16;
                this.f187386g = i;
                return this;
            }

            public Builder setVersion(int i) {
                this.f187384b |= 1;
                this.f187385c = i;
                return this;
            }

            public Builder setVersionFull(int i) {
                this.f187384b |= 2;
                this.d = i;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                versionKind.getClass();
                this.f187384b |= 32;
                this.f187387h = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw new UninitializedMessageException(versionRequirementBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.f187378a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Builder");
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new j0();
            private final int value;

            Level(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new k0();
            private final int value;

            VersionKind(int i) {
                this.value = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            k = versionRequirement;
            versionRequirement.f187380c = 0;
            versionRequirement.d = 0;
            versionRequirement.e = Level.ERROR;
            versionRequirement.f = 0;
            versionRequirement.f187381g = 0;
            versionRequirement.f187382h = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement() {
            this.i = (byte) -1;
            this.f187383j = -1;
            this.f187378a = ByteString.EMPTY;
        }

        public static VersionRequirement getDefaultInstance() {
            return k;
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        public int getErrorCode() {
            return this.f;
        }

        public Level getLevel() {
            return this.e;
        }

        public int getMessage() {
            return this.f187381g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f187383j;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.f187379b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f187380c) : 0;
            if ((this.f187379b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            if ((this.f187379b & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
            }
            if ((this.f187379b & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f);
            }
            if ((this.f187379b & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f187381g);
            }
            if ((this.f187379b & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(6, this.f187382h.getNumber());
            }
            int size = this.f187378a.size() + iComputeInt32Size;
            this.f187383j = size;
            return size;
        }

        public int getVersion() {
            return this.f187380c;
        }

        public int getVersionFull() {
            return this.d;
        }

        public VersionKind getVersionKind() {
            return this.f187382h;
        }

        public boolean hasErrorCode() {
            return (this.f187379b & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.f187379b & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.f187379b & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.f187379b & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.f187379b & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.f187379b & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.i;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f187379b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f187380c);
            }
            if ((this.f187379b & 2) == 2) {
                codedOutputStream.writeInt32(2, this.d);
            }
            if ((this.f187379b & 4) == 4) {
                codedOutputStream.writeEnum(3, this.e.getNumber());
            }
            if ((this.f187379b & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f);
            }
            if ((this.f187379b & 16) == 16) {
                codedOutputStream.writeInt32(5, this.f187381g);
            }
            if ((this.f187379b & 32) == 32) {
                codedOutputStream.writeEnum(6, this.f187382h.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f187378a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public VersionRequirement(CodedInputStream codedInputStream) {
            this.i = (byte) -1;
            this.f187383j = -1;
            boolean z = false;
            this.f187380c = 0;
            this.d = 0;
            this.e = Level.ERROR;
            this.f = 0;
            this.f187381g = 0;
            this.f187382h = VersionKind.LANGUAGE_VERSION;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 == 8) {
                                this.f187379b |= 1;
                                this.f187380c = codedInputStream.readInt32();
                            } else if (tag2 == 16) {
                                this.f187379b |= 2;
                                this.d = codedInputStream.readInt32();
                            } else if (tag2 == 24) {
                                int i = codedInputStream.readEnum();
                                Level levelValueOf = Level.valueOf(i);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i);
                                } else {
                                    this.f187379b |= 4;
                                    this.e = levelValueOf;
                                }
                            } else if (tag2 == 32) {
                                this.f187379b |= 8;
                                this.f = codedInputStream.readInt32();
                            } else if (tag2 == 40) {
                                this.f187379b |= 16;
                                this.f187381g = codedInputStream.readInt32();
                            } else if (tag2 != 48) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                int i2 = codedInputStream.readEnum();
                                VersionKind versionKindValueOf = VersionKind.valueOf(i2);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag2);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.f187379b |= 32;
                                    this.f187382h = versionKindValueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187378a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187378a = outputNewOutput.toByteString();
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
                this.f187378a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187378a = outputNewOutput.toByteString();
        }

        public VersionRequirement(Builder builder) {
            this.i = (byte) -1;
            this.f187383j = -1;
            this.f187378a = builder.getUnknownFields();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new l0();
        public static final VersionRequirementTable e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f187388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f187389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f187390c;
        public int d;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f187391b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List f187392c = Collections.EMPTY_LIST;

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f187391b & 1) == 1) {
                    this.f187392c = Collections.unmodifiableList(this.f187392c);
                    this.f187391b &= -2;
                }
                versionRequirementTable.f187389b = this.f187392c;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw new UninitializedMessageException(versionRequirementTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo3794clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.f187389b.isEmpty()) {
                    if (this.f187392c.isEmpty()) {
                        this.f187392c = versionRequirementTable.f187389b;
                        this.f187391b &= -2;
                    } else {
                        if ((this.f187391b & 1) != 1) {
                            this.f187392c = new ArrayList(this.f187392c);
                            this.f187391b |= 1;
                        }
                        this.f187392c.addAll(versionRequirementTable.f187389b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.f187388a));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder");
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            e = versionRequirementTable;
            versionRequirementTable.f187389b = Collections.EMPTY_LIST;
        }

        public VersionRequirementTable() {
            this.f187390c = (byte) -1;
            this.d = -1;
            this.f187388a = ByteString.EMPTY;
        }

        public static VersionRequirementTable getDefaultInstance() {
            return e;
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.f187389b.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.f187389b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.f187389b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f187389b.get(i2));
            }
            int size = this.f187388a.size() + iComputeMessageSize;
            this.d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b4 = this.f187390c;
            if (b4 == 1) {
                return true;
            }
            if (b4 == 0) {
                return false;
            }
            this.f187390c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f187389b.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f187389b.get(i));
            }
            codedOutputStream.writeRawBytes(this.f187388a);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f187390c = (byte) -1;
            this.d = -1;
            this.f187389b = Collections.EMPTY_LIST;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z3 = false;
            while (!z) {
                try {
                    try {
                        int tag2 = codedInputStream.readTag();
                        if (tag2 != 0) {
                            if (tag2 != 10) {
                                if (!codedInputStream.skipField(tag2, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if (!z3) {
                                    this.f187389b = new ArrayList();
                                    z3 = true;
                                }
                                this.f187389b.add(codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th10) {
                        if (z3) {
                            this.f187389b = Collections.unmodifiableList(this.f187389b);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th11) {
                            this.f187388a = outputNewOutput.toByteString();
                            throw th11;
                        }
                        this.f187388a = outputNewOutput.toByteString();
                        throw th10;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z3) {
                this.f187389b = Collections.unmodifiableList(this.f187389b);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th12) {
                this.f187388a = outputNewOutput.toByteString();
                throw th12;
            }
            this.f187388a = outputNewOutput.toByteString();
        }

        public VersionRequirementTable(Builder builder) {
            this.f187390c = (byte) -1;
            this.d = -1;
            this.f187388a = builder.getUnknownFields();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new m0();
        private final int value;

        Visibility(int i) {
            this.value = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }
    }
}
