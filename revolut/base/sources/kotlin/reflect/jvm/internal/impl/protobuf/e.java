package kotlin.reflect.jvm.internal.impl.protobuf;

import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements FieldSet$FieldDescriptorLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Internal.EnumLiteMap f187522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WireFormat.FieldType f187524c;
    public final boolean d;
    public final boolean e;

    public e(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z3) {
        this.f187522a = enumLiteMap;
        this.f187523b = i;
        this.f187524c = fieldType;
        this.d = z;
        this.e = z3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        return this.f187523b - ((e) obj2).f187523b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.f187524c.getJavaType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.f187524c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.f187523b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.d;
    }
}
