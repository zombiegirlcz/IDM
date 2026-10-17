package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class i2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f49732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f49733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49734c;
    public final f0 d;

    public i2(l3 l3Var, f0 f0Var, d2 d2Var) {
        this.f49733b = l3Var;
        f0Var.getClass();
        this.f49734c = d2Var instanceof s0;
        this.d = f0Var;
        this.f49732a = d2Var;
    }

    public static i2 g(l3 l3Var, f0 f0Var, d2 d2Var) {
        return new i2(l3Var, f0Var, d2Var);
    }

    @Override // com.google.protobuf.t2
    public final void a(Object obj2, w1 w1Var) {
        this.d.getClass();
        Iterator itK = ((s0) obj2).extensions.k();
        while (itK.hasNext()) {
            Map.Entry entry = (Map.Entry) itK.next();
            t0 t0Var = (t0) entry.getKey();
            if (t0Var.f49793c.a() != l4.MESSAGE || t0Var.d || t0Var.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            w1Var.h(t0Var.f49792b, entry.getValue());
        }
        ((n3) this.f49733b).getClass();
        m3 m3Var = ((w0) obj2).unknownFields;
        m3Var.getClass();
        w1Var.getClass();
        if (q4.ASCENDING == q4.DESCENDING) {
            for (int i = m3Var.f49748a - 1; i >= 0; i--) {
                w1Var.h(m3Var.f49749b[i] >>> 3, m3Var.f49750c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < m3Var.f49748a; i2++) {
            w1Var.h(m3Var.f49749b[i2] >>> 3, m3Var.f49750c[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    @Override // com.google.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.i r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i2.b(java.lang.Object, byte[], int, int, com.google.protobuf.i):void");
    }

    @Override // com.google.protobuf.t2
    public final int c(w0 w0Var) {
        ((n3) this.f49733b).getClass();
        int iHashCode = w0Var.unknownFields.hashCode();
        if (!this.f49734c) {
            return iHashCode;
        }
        this.d.getClass();
        return ((s0) w0Var).extensions.f49730a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.t2
    public final int d(w0 w0Var) {
        ((n3) this.f49733b).getClass();
        m3 m3Var = w0Var.unknownFields;
        int i = m3Var.d;
        if (i == -1) {
            int iJ = 0;
            for (int i2 = 0; i2 < m3Var.f49748a; i2++) {
                int i3 = m3Var.f49749b[i2] >>> 3;
                iJ += y.j(3, (p) m3Var.f49750c[i2]) + y.m(i3) + y.l(2) + (y.l(1) * 2);
            }
            m3Var.d = iJ;
            i = iJ;
        }
        if (!this.f49734c) {
            return i;
        }
        this.d.getClass();
        return ((s0) w0Var).extensions.f() + i;
    }

    @Override // com.google.protobuf.t2
    public final void e(Object obj2, v vVar, d0 d0Var) {
        l3 l3Var = this.f49733b;
        m3 m3VarA = l3Var.a(obj2);
        f0 f0Var = this.d;
        f0Var.getClass();
        i0 i0VarEnsureExtensionsAreMutable = ((s0) obj2).ensureExtensionsAreMutable();
        while (vVar.a() != Integer.MAX_VALUE) {
            try {
                v vVar2 = vVar;
                d0 d0Var2 = d0Var;
                if (!h(vVar2, d0Var2, f0Var, i0VarEnsureExtensionsAreMutable, l3Var, m3VarA)) {
                    break;
                }
                vVar = vVar2;
                d0Var = d0Var2;
            } finally {
                ((w0) obj2).unknownFields = m3VarA;
            }
        }
    }

    @Override // com.google.protobuf.t2
    public final boolean f(w0 w0Var, w0 w0Var2) {
        n3 n3Var = (n3) this.f49733b;
        n3Var.getClass();
        m3 m3Var = w0Var.unknownFields;
        n3Var.getClass();
        if (!m3Var.equals(w0Var2.unknownFields)) {
            return false;
        }
        if (!this.f49734c) {
            return true;
        }
        this.d.getClass();
        return ((s0) w0Var).extensions.equals(((s0) w0Var2).extensions);
    }

    public final boolean h(v vVar, d0 d0Var, f0 f0Var, i0 i0Var, l3 l3Var, m3 m3Var) throws InvalidProtocolBufferException {
        int i = vVar.f49805b;
        d2 d2Var = this.f49732a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return vVar.y();
            }
            f0Var.getClass();
            u0 u0VarA = d0Var.a(i >>> 3, d2Var);
            if (u0VarA == null) {
                return l3Var.b(m3Var, vVar);
            }
            i0Var.o(u0VarA.d, vVar.o(u0VarA.d().getClass(), d0Var));
            return true;
        }
        u0 u0VarA2 = null;
        p pVarE = null;
        int iF = 0;
        while (vVar.a() != Integer.MAX_VALUE) {
            int i2 = vVar.f49805b;
            if (i2 == 16) {
                vVar.x(0);
                iF = vVar.f49804a.F();
                f0Var.getClass();
                u0VarA2 = d0Var.a(iF, d2Var);
            } else if (i2 == 26) {
                if (u0VarA2 != null) {
                    f0Var.getClass();
                    i0Var.o(u0VarA2.d, vVar.o(u0VarA2.d().getClass(), d0Var));
                } else {
                    pVarE = vVar.e();
                }
            } else if (!vVar.y()) {
                break;
            }
        }
        if (vVar.f49805b != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (pVarE != null) {
            if (u0VarA2 != null) {
                f0Var.getClass();
                c2 c2VarNewBuilderForType = u0VarA2.f49799c.newBuilderForType();
                t tVarH = pVarE.h();
                p0 p0Var = (p0) c2VarNewBuilderForType;
                p0Var.e(tVarH, d0Var);
                i0Var.o(u0VarA2.d, p0Var.b());
                tVarH.a(0);
                return true;
            }
            ((n3) l3Var).getClass();
            m3Var.f((iF << 3) | 2, pVarE);
        }
        return true;
    }

    @Override // com.google.protobuf.t2
    public final boolean isInitialized(Object obj2) {
        this.d.getClass();
        return ((s0) obj2).extensions.i();
    }

    @Override // com.google.protobuf.t2
    public final void makeImmutable(Object obj2) {
        ((n3) this.f49733b).getClass();
        m3 m3Var = ((w0) obj2).unknownFields;
        if (m3Var.e) {
            m3Var.e = false;
        }
        this.d.getClass();
        ((s0) obj2).extensions.l();
    }

    @Override // com.google.protobuf.t2
    public final void mergeFrom(Object obj2, Object obj3) {
        u2.l(this.f49733b, obj2, obj3);
        if (this.f49734c) {
            this.d.getClass();
            i0 i0Var = ((s0) obj3).extensions;
            if (i0Var.f49730a.isEmpty()) {
                return;
            }
            ((s0) obj2).ensureExtensionsAreMutable().m(i0Var);
        }
    }

    @Override // com.google.protobuf.t2
    public final w0 newInstance() {
        d2 d2Var = this.f49732a;
        return d2Var instanceof w0 ? ((w0) d2Var).newMutableInstance() : ((p0) d2Var.newBuilderForType()).b();
    }
}
