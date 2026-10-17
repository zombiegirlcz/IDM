package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes17.dex */
public final class p1 extends r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f49399b = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final boolean c(Object obj2, long j2) {
        switch (this.f49399b) {
            case 0:
                if (s1.f49413g) {
                    if (s1.h(obj2, j2) == 0) {
                    }
                } else if (s1.i(obj2, j2) == 0) {
                }
                break;
            default:
                if (s1.f49413g) {
                    if (s1.h(obj2, j2) == 0) {
                    }
                } else if (s1.i(obj2, j2) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final byte d(Object obj2, long j2) {
        switch (this.f49399b) {
            case 0:
                if (!s1.f49413g) {
                }
                break;
            default:
                if (!s1.f49413g) {
                }
                break;
        }
        return s1.i(obj2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final double e(Object obj2, long j2) {
        switch (this.f49399b) {
        }
        return Double.longBitsToDouble(h(obj2, j2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final float f(Object obj2, long j2) {
        switch (this.f49399b) {
        }
        return Float.intBitsToFloat(g(obj2, j2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void k(Object obj2, long j2, boolean z) {
        switch (this.f49399b) {
            case 0:
                if (!s1.f49413g) {
                    s1.m(obj2, j2, z ? (byte) 1 : (byte) 0);
                } else {
                    s1.l(obj2, j2, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!s1.f49413g) {
                    s1.m(obj2, j2, z ? (byte) 1 : (byte) 0);
                } else {
                    s1.l(obj2, j2, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void l(Object obj2, long j2, byte b4) {
        switch (this.f49399b) {
            case 0:
                if (!s1.f49413g) {
                    s1.m(obj2, j2, b4);
                } else {
                    s1.l(obj2, j2, b4);
                }
                break;
            default:
                if (!s1.f49413g) {
                    s1.m(obj2, j2, b4);
                } else {
                    s1.l(obj2, j2, b4);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void m(Object obj2, long j2, double d) {
        switch (this.f49399b) {
            case 0:
                p(obj2, j2, Double.doubleToLongBits(d));
                break;
            default:
                p(obj2, j2, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void n(Object obj2, long j2, float f) {
        switch (this.f49399b) {
            case 0:
                o(obj2, j2, Float.floatToIntBits(f));
                break;
            default:
                o(obj2, j2, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final boolean s() {
        switch (this.f49399b) {
        }
        return false;
    }
}
