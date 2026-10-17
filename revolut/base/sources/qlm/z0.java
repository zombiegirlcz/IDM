package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class z0 extends plm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f247731a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tlm.d f247732b = tlm.h.f272133a;

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b4) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c2) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j2) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s2) {
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // plm.b
    public final void encodeValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final tlm.e getSerializersModule() {
        return f247732b;
    }
}
