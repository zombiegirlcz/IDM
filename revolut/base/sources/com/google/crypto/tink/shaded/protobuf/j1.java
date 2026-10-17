package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class j1 {
    public static final j1 f = new j1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f49374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f49375c;
    public int d = -1;
    public boolean e;

    public j1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f49373a = i;
        this.f49374b = iArr;
        this.f49375c = objArr;
        this.e = z;
    }

    public static j1 c() {
        return new j1(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.f49374b;
        if (i > iArr.length) {
            int i2 = this.f49373a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f49374b = Arrays.copyOf(iArr, i);
            this.f49375c = Arrays.copyOf(this.f49375c, i);
        }
    }

    public final int b() {
        int iT;
        int iV;
        int iP;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f49373a; i3++) {
            int i5 = this.f49374b[i3];
            int i6 = i5 >>> 3;
            int i21 = i5 & 7;
            if (i21 != 0) {
                if (i21 == 1) {
                    ((Long) this.f49375c[i3]).getClass();
                    iP = n.P(i6);
                } else if (i21 == 2) {
                    iP = n.M(i6, (j) this.f49375c[i3]);
                } else if (i21 == 3) {
                    iT = n.T(i6) * 2;
                    iV = ((j1) this.f49375c[i3]).b();
                } else {
                    if (i21 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.c());
                    }
                    ((Integer) this.f49375c[i3]).getClass();
                    iP = n.O(i6);
                }
                i2 = iP + i2;
            } else {
                long jLongValue = ((Long) this.f49375c[i3]).longValue();
                iT = n.T(i6);
                iV = n.V(jLongValue);
            }
            i2 = iV + iT + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj2) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.f49373a + 1);
        int[] iArr = this.f49374b;
        int i2 = this.f49373a;
        iArr[i2] = i;
        this.f49375c[i2] = obj2;
        this.f49373a = i2 + 1;
    }

    public final void e(p0 p0Var) {
        if (this.f49373a == 0) {
            return;
        }
        p0Var.getClass();
        for (int i = 0; i < this.f49373a; i++) {
            int i2 = this.f49374b[i];
            Object obj2 = this.f49375c[i];
            int i3 = i2 >>> 3;
            int i5 = i2 & 7;
            if (i5 == 0) {
                p0Var.j(i3, ((Long) obj2).longValue());
            } else if (i5 == 1) {
                p0Var.f(i3, ((Long) obj2).longValue());
            } else if (i5 == 2) {
                p0Var.b(i3, (j) obj2);
            } else if (i5 == 3) {
                n nVar = (n) p0Var.f49398a;
                nVar.d0(i3, 3);
                ((j1) obj2).e(p0Var);
                nVar.d0(i3, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.c());
                }
                p0Var.e(i3, ((Integer) obj2).intValue());
            }
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        int i = this.f49373a;
        if (i == j1Var.f49373a) {
            int[] iArr = this.f49374b;
            int[] iArr2 = j1Var.f49374b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f49375c;
                    Object[] objArr2 = j1Var.f49375c;
                    int i3 = this.f49373a;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f49373a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f49374b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        int i6 = (i2 + i3) * 31;
        Object[] objArr = this.f49375c;
        int i21 = this.f49373a;
        for (int i22 = 0; i22 < i21; i22++) {
            iHashCode = (iHashCode * 31) + objArr[i22].hashCode();
        }
        return i6 + iHashCode;
    }
}
