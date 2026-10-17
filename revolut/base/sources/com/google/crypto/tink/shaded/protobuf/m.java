package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd.e f49385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49387c;
    public int d = 0;

    public m(cd.e eVar) {
        g0.a(eVar, "input");
        this.f49385a = eVar;
        eVar.f23134b = this;
    }

    public static void w(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void x(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.f49386b = i;
            this.d = 0;
        } else {
            this.f49386b = this.f49385a.C();
        }
        int i2 = this.f49386b;
        if (i2 == 0 || i2 == this.f49387c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj2, g1 g1Var, q qVar) {
        int i = this.f49387c;
        this.f49387c = ((this.f49386b >>> 3) << 3) | 4;
        try {
            g1Var.b(obj2, this, qVar);
            if (this.f49386b == this.f49387c) {
            } else {
                throw InvalidProtocolBufferException.f();
            }
        } finally {
            this.f49387c = i;
        }
    }

    public final void c(Object obj2, g1 g1Var, q qVar) throws InvalidProtocolBufferException {
        cd.e eVar = this.f49385a;
        int iD = eVar.D();
        if (eVar.f23133a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM = eVar.m(iD);
        eVar.f23133a++;
        g1Var.b(obj2, this, qVar);
        eVar.b(0);
        eVar.f23133a--;
        eVar.k(iM);
    }

    public final void d(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof e;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(eVar.n()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Boolean.valueOf(eVar.n()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        e eVar2 = (e) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                eVar2.b(eVar.n());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            eVar2.b(eVar.n());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final j e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        v(2);
        return this.f49385a.o();
    }

    public final void f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if ((this.f49386b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(e());
            cd.e eVar = this.f49385a;
            if (eVar.h()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f49386b);
        this.d = iC;
    }

    public final void g(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof o;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(eVar.p()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iD = eVar.D();
            x(iD);
            int iG = eVar.g() + iD;
            do {
                list.add(Double.valueOf(eVar.p()));
            } while (eVar.g() < iG);
            return;
        }
        o oVar = (o) list;
        int i2 = this.f49386b & 7;
        if (i2 == 1) {
            do {
                oVar.b(eVar.p());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iD2 = eVar.D();
        x(iD2);
        int iG2 = eVar.g() + iD2;
        do {
            oVar.b(eVar.p());
        } while (eVar.g() < iG2);
    }

    public final void h(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof c0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(eVar.q()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Integer.valueOf(eVar.q()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        c0 c0Var = (c0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                c0Var.b(eVar.q());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            c0Var.b(eVar.q());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void i(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof c0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 2) {
                int iD = eVar.D();
                w(iD);
                int iG = eVar.g() + iD;
                do {
                    list.add(Integer.valueOf(eVar.r()));
                } while (eVar.g() < iG);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(eVar.r()));
                if (eVar.h()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f49386b);
            this.d = iC;
            return;
        }
        c0 c0Var = (c0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 2) {
            int iD2 = eVar.D();
            w(iD2);
            int iG2 = eVar.g() + iD2;
            do {
                c0Var.b(eVar.r());
            } while (eVar.g() < iG2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            c0Var.b(eVar.r());
            if (eVar.h()) {
                return;
            } else {
                iC2 = eVar.C();
            }
        } while (iC2 == this.f49386b);
        this.d = iC2;
    }

    public final void j(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(eVar.s()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iD = eVar.D();
            x(iD);
            int iG = eVar.g() + iD;
            do {
                list.add(Long.valueOf(eVar.s()));
            } while (eVar.g() < iG);
            return;
        }
        n0 n0Var = (n0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 1) {
            do {
                n0Var.b(eVar.s());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iD2 = eVar.D();
        x(iD2);
        int iG2 = eVar.g() + iD2;
        do {
            n0Var.b(eVar.s());
        } while (eVar.g() < iG2);
    }

    public final void k(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof w;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 2) {
                int iD = eVar.D();
                w(iD);
                int iG = eVar.g() + iD;
                do {
                    list.add(Float.valueOf(eVar.t()));
                } while (eVar.g() < iG);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Float.valueOf(eVar.t()));
                if (eVar.h()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f49386b);
            this.d = iC;
            return;
        }
        w wVar = (w) list;
        int i2 = this.f49386b & 7;
        if (i2 == 2) {
            int iD2 = eVar.D();
            w(iD2);
            int iG2 = eVar.g() + iD2;
            do {
                wVar.b(eVar.t());
            } while (eVar.g() < iG2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            wVar.b(eVar.t());
            if (eVar.h()) {
                return;
            } else {
                iC2 = eVar.C();
            }
        } while (iC2 == this.f49386b);
        this.d = iC2;
    }

    public final void l(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof c0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(eVar.u()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Integer.valueOf(eVar.u()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        c0 c0Var = (c0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                c0Var.b(eVar.u());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            c0Var.b(eVar.u());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void m(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(eVar.v()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Long.valueOf(eVar.v()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        n0 n0Var = (n0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                n0Var.b(eVar.v());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            n0Var.b(eVar.v());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void n(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof c0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 2) {
                int iD = eVar.D();
                w(iD);
                int iG = eVar.g() + iD;
                do {
                    list.add(Integer.valueOf(eVar.w()));
                } while (eVar.g() < iG);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(eVar.w()));
                if (eVar.h()) {
                    return;
                } else {
                    iC = eVar.C();
                }
            } while (iC == this.f49386b);
            this.d = iC;
            return;
        }
        c0 c0Var = (c0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 2) {
            int iD2 = eVar.D();
            w(iD2);
            int iG2 = eVar.g() + iD2;
            do {
                c0Var.b(eVar.w());
            } while (eVar.g() < iG2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            c0Var.b(eVar.w());
            if (eVar.h()) {
                return;
            } else {
                iC2 = eVar.C();
            }
        } while (iC2 == this.f49386b);
        this.d = iC2;
    }

    public final void o(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(eVar.x()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iD = eVar.D();
            x(iD);
            int iG = eVar.g() + iD;
            do {
                list.add(Long.valueOf(eVar.x()));
            } while (eVar.g() < iG);
            return;
        }
        n0 n0Var = (n0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 1) {
            do {
                n0Var.b(eVar.x());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iD2 = eVar.D();
        x(iD2);
        int iG2 = eVar.g() + iD2;
        do {
            n0Var.b(eVar.x());
        } while (eVar.g() < iG2);
    }

    public final void p(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof c0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(eVar.y()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Integer.valueOf(eVar.y()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        c0 c0Var = (c0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                c0Var.b(eVar.y());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            c0Var.b(eVar.y());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void q(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(eVar.z()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Long.valueOf(eVar.z()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        n0 n0Var = (n0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                n0Var.b(eVar.z());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            n0Var.b(eVar.z());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void r(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strA;
        int iC;
        int iC2;
        if ((this.f49386b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        boolean z3 = list instanceof j0;
        cd.e eVar = this.f49385a;
        if (z3 && !z) {
            j0 j0Var = (j0) list;
            do {
                j0Var.U4(e());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        do {
            if (z) {
                v(2);
                strA = eVar.B();
            } else {
                v(2);
                strA = eVar.A();
            }
            list.add(strA);
            if (eVar.h()) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == this.f49386b);
        this.d = iC;
    }

    public final void s(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof c0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(eVar.D()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Integer.valueOf(eVar.D()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        c0 c0Var = (c0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                c0Var.b(eVar.D());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            c0Var.b(eVar.D());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void t(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n0;
        cd.e eVar = this.f49385a;
        if (!z) {
            int i = this.f49386b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(eVar.E()));
                    if (eVar.h()) {
                        return;
                    } else {
                        iC = eVar.C();
                    }
                } while (iC == this.f49386b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = eVar.g() + eVar.D();
            do {
                list.add(Long.valueOf(eVar.E()));
            } while (eVar.g() < iG);
            u(iG);
            return;
        }
        n0 n0Var = (n0) list;
        int i2 = this.f49386b & 7;
        if (i2 == 0) {
            do {
                n0Var.b(eVar.E());
                if (eVar.h()) {
                    return;
                } else {
                    iC2 = eVar.C();
                }
            } while (iC2 == this.f49386b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = eVar.g() + eVar.D();
        do {
            n0Var.b(eVar.E());
        } while (eVar.g() < iG2);
        u(iG2);
    }

    public final void u(int i) throws InvalidProtocolBufferException {
        if (this.f49385a.g() != i) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void v(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f49386b & 7) != i) {
            throw InvalidProtocolBufferException.c();
        }
    }
}
