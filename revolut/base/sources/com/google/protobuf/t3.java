package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends v3 {
    @Override // com.google.protobuf.v3
    public final void c(long j2, byte[] bArr, long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.v3
    public final boolean d(Object obj2, long j2) {
        return w3.f49825h ? w3.h(obj2, j2) != 0 : w3.i(obj2, j2) != 0;
    }

    @Override // com.google.protobuf.v3
    public final byte e(long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.v3
    public final byte f(Object obj2, long j2) {
        return w3.f49825h ? w3.h(obj2, j2) : w3.i(obj2, j2);
    }

    @Override // com.google.protobuf.v3
    public final double g(Object obj2, long j2) {
        return Double.longBitsToDouble(j(obj2, j2));
    }

    @Override // com.google.protobuf.v3
    public final float h(Object obj2, long j2) {
        return Float.intBitsToFloat(i(obj2, j2));
    }

    @Override // com.google.protobuf.v3
    public final void m(Object obj2, long j2, boolean z) {
        if (w3.f49825h) {
            w3.l(obj2, j2, z ? (byte) 1 : (byte) 0);
        } else {
            w3.m(obj2, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.protobuf.v3
    public final void n(Object obj2, long j2, byte b4) {
        if (w3.f49825h) {
            w3.l(obj2, j2, b4);
        } else {
            w3.m(obj2, j2, b4);
        }
    }

    @Override // com.google.protobuf.v3
    public final void o(Object obj2, long j2, double d) {
        r(obj2, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.protobuf.v3
    public final void p(Object obj2, long j2, float f) {
        q(obj2, j2, Float.floatToIntBits(f));
    }

    @Override // com.google.protobuf.v3
    public final boolean u() {
        return false;
    }
}
