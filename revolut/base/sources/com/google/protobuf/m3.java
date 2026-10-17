package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m3 {
    public static final m3 f = new m3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f49749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f49750c;
    public int d;
    public boolean e;

    public m3() {
        this(0, new int[8], new Object[8], true);
    }

    public static m3 e(m3 m3Var, m3 m3Var2) {
        int i = m3Var.f49748a + m3Var2.f49748a;
        int[] iArrCopyOf = Arrays.copyOf(m3Var.f49749b, i);
        System.arraycopy(m3Var2.f49749b, 0, iArrCopyOf, m3Var.f49748a, m3Var2.f49748a);
        Object[] objArrCopyOf = Arrays.copyOf(m3Var.f49750c, i);
        System.arraycopy(m3Var2.f49750c, 0, objArrCopyOf, m3Var.f49748a, m3Var2.f49748a);
        return new m3(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i) {
        int[] iArr = this.f49749b;
        if (i > iArr.length) {
            int i2 = this.f49748a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f49749b = Arrays.copyOf(iArr, i);
            this.f49750c = Arrays.copyOf(this.f49750c, i);
        }
    }

    public final int c() {
        int iL;
        int iN;
        int iL2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f49748a; i3++) {
            int i5 = this.f49749b[i3];
            int i6 = i5 >>> 3;
            int i21 = i5 & 7;
            if (i21 != 0) {
                if (i21 == 1) {
                    ((Long) this.f49750c[i3]).getClass();
                    iL2 = y.l(i6) + 8;
                } else if (i21 == 2) {
                    iL2 = y.j(i6, (p) this.f49750c[i3]);
                } else if (i21 == 3) {
                    iL = y.l(i6) * 2;
                    iN = ((m3) this.f49750c[i3]).c();
                } else {
                    if (i21 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.c());
                    }
                    ((Integer) this.f49750c[i3]).getClass();
                    iL2 = y.l(i6) + 4;
                }
                i2 = iL2 + i2;
            } else {
                long jLongValue = ((Long) this.f49750c[i3]).longValue();
                iL = y.l(i6);
                iN = y.n(jLongValue);
            }
            i2 = iN + iL + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean d(int i, t tVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iE;
        a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f(i, Long.valueOf(tVar.u()));
            return true;
        }
        if (i3 == 1) {
            f(i, Long.valueOf(tVar.q()));
            return true;
        }
        if (i3 == 2) {
            f(i, tVar.m());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            f(i, Integer.valueOf(tVar.p()));
            return true;
        }
        m3 m3Var = new m3();
        do {
            iE = tVar.E();
            if (iE == 0) {
                break;
            }
        } while (m3Var.d(iE, tVar));
        tVar.a((i2 << 3) | 4);
        f(i, m3Var);
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        int i = this.f49748a;
        if (i == m3Var.f49748a) {
            int[] iArr = this.f49749b;
            int[] iArr2 = m3Var.f49749b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f49750c;
                    Object[] objArr2 = m3Var.f49750c;
                    int i3 = this.f49748a;
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

    public final void f(int i, Object obj2) {
        a();
        b(this.f49748a + 1);
        int[] iArr = this.f49749b;
        int i2 = this.f49748a;
        iArr[i2] = i;
        this.f49750c[i2] = obj2;
        this.f49748a = i2 + 1;
    }

    public final void g(w1 w1Var) {
        if (this.f49748a == 0) {
            return;
        }
        w1Var.getClass();
        for (int i = 0; i < this.f49748a; i++) {
            int i2 = this.f49749b[i];
            Object obj2 = this.f49750c[i];
            int i3 = i2 >>> 3;
            int i5 = i2 & 7;
            if (i5 == 0) {
                w1Var.f(i3, ((Long) obj2).longValue());
            } else if (i5 == 1) {
                w1Var.c(i3, ((Long) obj2).longValue());
            } else if (i5 == 2) {
                w1Var.a(i3, (p) obj2);
            } else if (i5 == 3) {
                y yVar = (y) w1Var.f49817a;
                yVar.G(i3, 3);
                ((m3) obj2).g(w1Var);
                yVar.G(i3, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.c());
                }
                w1Var.b(i3, ((Integer) obj2).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.f49748a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f49749b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        int i6 = (i2 + i3) * 31;
        Object[] objArr = this.f49750c;
        int i21 = this.f49748a;
        for (int i22 = 0; i22 < i21; i22++) {
            iHashCode = (iHashCode * 31) + objArr[i22].hashCode();
        }
        return i6 + iHashCode;
    }

    public m3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f49748a = i;
        this.f49749b = iArr;
        this.f49750c = objArr;
        this.e = z;
    }
}
