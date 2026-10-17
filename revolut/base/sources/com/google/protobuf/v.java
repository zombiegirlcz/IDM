package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f49804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49806c;
    public int d = 0;

    public v(t tVar) {
        j1.a(tVar, "input");
        this.f49804a = tVar;
        tVar.f49790c = this;
    }

    public static void A(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void z(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.f49805b = i;
            this.d = 0;
        } else {
            this.f49805b = this.f49804a.E();
        }
        int i2 = this.f49805b;
        if (i2 == 0 || i2 == this.f49806c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj2, t2 t2Var, d0 d0Var) {
        int i = this.f49806c;
        this.f49806c = ((this.f49805b >>> 3) << 3) | 4;
        try {
            t2Var.e(obj2, this, d0Var);
            if (this.f49805b == this.f49806c) {
            } else {
                throw InvalidProtocolBufferException.f();
            }
        } finally {
            this.f49806c = i;
        }
    }

    public final void c(Object obj2, t2 t2Var, d0 d0Var) throws InvalidProtocolBufferException {
        t tVar = this.f49804a;
        int iF = tVar.F();
        if (tVar.f49788a >= tVar.f49789b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iK = tVar.k(iF);
        tVar.f49788a++;
        t2Var.e(obj2, this, d0Var);
        tVar.a(0);
        tVar.f49788a--;
        tVar.j(iK);
    }

    public final void d(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof k;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(tVar.l()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Boolean.valueOf(tVar.l()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        k kVar = (k) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                kVar.b(tVar.l());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            kVar.b(tVar.l());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final p e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        x(2);
        return this.f49804a.m();
    }

    public final void f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iE;
        if ((this.f49805b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(e());
            t tVar = this.f49804a;
            if (tVar.g()) {
                return;
            } else {
                iE = tVar.E();
            }
        } while (iE == this.f49805b);
        this.d = iE;
    }

    public final void g(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof z;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(tVar.n()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.F();
            A(iF);
            int iF2 = tVar.f() + iF;
            do {
                list.add(Double.valueOf(tVar.n()));
            } while (tVar.f() < iF2);
            return;
        }
        z zVar = (z) list;
        int i2 = this.f49805b & 7;
        if (i2 == 1) {
            do {
                zVar.b(tVar.n());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF3 = tVar.F();
        A(iF3);
        int iF4 = tVar.f() + iF3;
        do {
            zVar.b(tVar.n());
        } while (tVar.f() < iF4);
    }

    public final void h(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof x0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(tVar.o()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Integer.valueOf(tVar.o()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                x0Var.b(tVar.o());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            x0Var.b(tVar.o());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final Object i(k4 k4Var, Class cls, d0 d0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i = u.f49796a[k4Var.ordinal()];
        t tVar = this.f49804a;
        switch (i) {
            case 1:
                x(0);
                return Boolean.valueOf(tVar.l());
            case 2:
                return e();
            case 3:
                x(1);
                return Double.valueOf(tVar.n());
            case 4:
                x(0);
                return Integer.valueOf(tVar.o());
            case 5:
                x(5);
                return Integer.valueOf(tVar.p());
            case 6:
                x(1);
                return Long.valueOf(tVar.q());
            case 7:
                x(5);
                return Float.valueOf(tVar.r());
            case 8:
                x(0);
                return Integer.valueOf(tVar.t());
            case 9:
                x(0);
                return Long.valueOf(tVar.u());
            case 10:
                return o(cls, d0Var);
            case 11:
                x(5);
                return Integer.valueOf(tVar.y());
            case 12:
                x(1);
                return Long.valueOf(tVar.z());
            case 13:
                x(0);
                return Integer.valueOf(tVar.A());
            case 14:
                x(0);
                return Long.valueOf(tVar.B());
            case 15:
                x(2);
                return tVar.D();
            case 16:
                x(0);
                return Integer.valueOf(tVar.F());
            case 17:
                x(0);
                return Long.valueOf(tVar.G());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof x0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 2) {
                int iF = tVar.F();
                z(iF);
                int iF2 = tVar.f() + iF;
                do {
                    list.add(Integer.valueOf(tVar.p()));
                } while (tVar.f() < iF2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(tVar.p()));
                if (tVar.g()) {
                    return;
                } else {
                    iE = tVar.E();
                }
            } while (iE == this.f49805b);
            this.d = iE;
            return;
        }
        x0 x0Var = (x0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 2) {
            int iF3 = tVar.F();
            z(iF3);
            int iF4 = tVar.f() + iF3;
            do {
                x0Var.b(tVar.p());
            } while (tVar.f() < iF4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            x0Var.b(tVar.p());
            if (tVar.g()) {
                return;
            } else {
                iE2 = tVar.E();
            }
        } while (iE2 == this.f49805b);
        this.d = iE2;
    }

    public final void k(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof t1;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(tVar.q()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.F();
            A(iF);
            int iF2 = tVar.f() + iF;
            do {
                list.add(Long.valueOf(tVar.q()));
            } while (tVar.f() < iF2);
            return;
        }
        t1 t1Var = (t1) list;
        int i2 = this.f49805b & 7;
        if (i2 == 1) {
            do {
                t1Var.b(tVar.q());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF3 = tVar.F();
        A(iF3);
        int iF4 = tVar.f() + iF3;
        do {
            t1Var.b(tVar.q());
        } while (tVar.f() < iF4);
    }

    public final void l(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof m0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 2) {
                int iF = tVar.F();
                z(iF);
                int iF2 = tVar.f() + iF;
                do {
                    list.add(Float.valueOf(tVar.r()));
                } while (tVar.f() < iF2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Float.valueOf(tVar.r()));
                if (tVar.g()) {
                    return;
                } else {
                    iE = tVar.E();
                }
            } while (iE == this.f49805b);
            this.d = iE;
            return;
        }
        m0 m0Var = (m0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 2) {
            int iF3 = tVar.F();
            z(iF3);
            int iF4 = tVar.f() + iF3;
            do {
                m0Var.b(tVar.r());
            } while (tVar.f() < iF4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            m0Var.b(tVar.r());
            if (tVar.g()) {
                return;
            } else {
                iE2 = tVar.E();
            }
        } while (iE2 == this.f49805b);
        this.d = iE2;
    }

    public final void m(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof x0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(tVar.t()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Integer.valueOf(tVar.t()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                x0Var.b(tVar.t());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            x0Var.b(tVar.t());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final void n(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof t1;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(tVar.u()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Long.valueOf(tVar.u()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        t1 t1Var = (t1) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                t1Var.b(tVar.u());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            t1Var.b(tVar.u());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final Object o(Class cls, d0 d0Var) throws InvalidProtocolBufferException {
        x(2);
        t2 t2VarA = p2.f49764c.a(cls);
        w0 w0VarNewInstance = t2VarA.newInstance();
        c(w0VarNewInstance, t2VarA, d0Var);
        t2VarA.makeImmutable(w0VarNewInstance);
        return w0VarNewInstance;
    }

    public final void p(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof x0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 2) {
                int iF = tVar.F();
                z(iF);
                int iF2 = tVar.f() + iF;
                do {
                    list.add(Integer.valueOf(tVar.y()));
                } while (tVar.f() < iF2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(tVar.y()));
                if (tVar.g()) {
                    return;
                } else {
                    iE = tVar.E();
                }
            } while (iE == this.f49805b);
            this.d = iE;
            return;
        }
        x0 x0Var = (x0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 2) {
            int iF3 = tVar.F();
            z(iF3);
            int iF4 = tVar.f() + iF3;
            do {
                x0Var.b(tVar.y());
            } while (tVar.f() < iF4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            x0Var.b(tVar.y());
            if (tVar.g()) {
                return;
            } else {
                iE2 = tVar.E();
            }
        } while (iE2 == this.f49805b);
        this.d = iE2;
    }

    public final void q(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof t1;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(tVar.z()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.F();
            A(iF);
            int iF2 = tVar.f() + iF;
            do {
                list.add(Long.valueOf(tVar.z()));
            } while (tVar.f() < iF2);
            return;
        }
        t1 t1Var = (t1) list;
        int i2 = this.f49805b & 7;
        if (i2 == 1) {
            do {
                t1Var.b(tVar.z());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF3 = tVar.F();
        A(iF3);
        int iF4 = tVar.f() + iF3;
        do {
            t1Var.b(tVar.z());
        } while (tVar.f() < iF4);
    }

    public final void r(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof x0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(tVar.A()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Integer.valueOf(tVar.A()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                x0Var.b(tVar.A());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            x0Var.b(tVar.A());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final void s(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof t1;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(tVar.B()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Long.valueOf(tVar.B()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        t1 t1Var = (t1) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                t1Var.b(tVar.B());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            t1Var.b(tVar.B());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final void t(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strC;
        int iE;
        int iE2;
        if ((this.f49805b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        boolean z3 = list instanceof m1;
        t tVar = this.f49804a;
        if (z3 && !z) {
            m1 m1Var = (m1) list;
            do {
                m1Var.p1(e());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        do {
            if (z) {
                x(2);
                strC = tVar.D();
            } else {
                x(2);
                strC = tVar.C();
            }
            list.add(strC);
            if (tVar.g()) {
                return;
            } else {
                iE = tVar.E();
            }
        } while (iE == this.f49805b);
        this.d = iE;
    }

    public final void u(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof x0;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(tVar.F()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Integer.valueOf(tVar.F()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                x0Var.b(tVar.F());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            x0Var.b(tVar.F());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final void v(List list) throws InvalidProtocolBufferException {
        int iE;
        int iE2;
        boolean z = list instanceof t1;
        t tVar = this.f49804a;
        if (!z) {
            int i = this.f49805b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(tVar.G()));
                    if (tVar.g()) {
                        return;
                    } else {
                        iE = tVar.E();
                    }
                } while (iE == this.f49805b);
                this.d = iE;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = tVar.f() + tVar.F();
            do {
                list.add(Long.valueOf(tVar.G()));
            } while (tVar.f() < iF);
            w(iF);
            return;
        }
        t1 t1Var = (t1) list;
        int i2 = this.f49805b & 7;
        if (i2 == 0) {
            do {
                t1Var.b(tVar.G());
                if (tVar.g()) {
                    return;
                } else {
                    iE2 = tVar.E();
                }
            } while (iE2 == this.f49805b);
            this.d = iE2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = tVar.f() + tVar.F();
        do {
            t1Var.b(tVar.G());
        } while (tVar.f() < iF2);
        w(iF2);
    }

    public final void w(int i) throws InvalidProtocolBufferException {
        if (this.f49804a.f() != i) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void x(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f49805b & 7) != i) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public final boolean y() {
        int i;
        t tVar = this.f49804a;
        if (tVar.g() || (i = this.f49805b) == this.f49806c) {
            return false;
        }
        return tVar.H(i);
    }
}
