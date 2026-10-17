package id;

import java.security.GeneralSecurityException;
import md.i1;
import md.l1;
import md.n1;
import md.o1;
import md.q1;
import md.r1;
import md.u1;
import nd.x;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends hd.e {
    public static final hd.o e = new hd.o(a.class, new h35.c(15));
    public static final hd.o f = new hd.o(j.class, new h35.c(17));
    public final /* synthetic */ int d = 1;

    public /* synthetic */ b(Class cls, bd.f[] fVarArr) {
        super(cls, fVarArr);
    }

    public static hd.d k(int i, int i2, i1 i1Var, ad.i iVar) {
        n1 n1VarA = o1.A();
        q1 q1VarA = r1.A();
        q1VarA.e();
        r1.v((r1) q1VarA.f49436b, i1Var);
        q1VarA.e();
        r1.w((r1) q1VarA.f49436b, i2);
        r1 r1Var = (r1) q1VarA.a();
        n1VarA.e();
        o1.v((o1) n1VarA.f49436b, r1Var);
        n1VarA.e();
        o1.w((o1) n1VarA.f49436b, i);
        return new hd.d((o1) n1VarA.a(), iVar);
    }

    public static void l(md.i iVar) {
        if (iVar.x() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (iVar.x() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void m(r1 r1Var) {
        if (r1Var.z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = k.f160364a[r1Var.y().ordinal()];
        if (i == 1) {
            if (r1Var.z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i == 2) {
            if (r1Var.z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i == 3) {
            if (r1Var.z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 4) {
            if (r1Var.z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (r1Var.z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // hd.e
    public ed.c b() {
        switch (this.d) {
            case 1:
                return ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
            default:
                return super.b();
        }
    }

    @Override // hd.e
    public final String c() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // hd.e
    public final cam.f e() {
        switch (this.d) {
            case 0:
                return new bd.g(md.f.class);
            default:
                return new bd.g(this);
        }
    }

    @Override // hd.e
    public final u1 f() {
        switch (this.d) {
        }
        return u1.SYMMETRIC;
    }

    @Override // hd.e
    public final com.google.crypto.tink.shaded.protobuf.a g(com.google.crypto.tink.shaded.protobuf.j jVar) {
        switch (this.d) {
            case 0:
                return md.c.C(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            default:
                return l1.D(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
        }
    }

    @Override // hd.e
    public final void i(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.d) {
            case 0:
                md.c cVar = (md.c) aVar;
                x.c(cVar.A());
                if (cVar.y().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                l(cVar.z());
                return;
            default:
                l1 l1Var = (l1) aVar;
                x.c(l1Var.B());
                if (l1Var.z().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m(l1Var.A());
                return;
        }
    }

    public b() {
        super(l1.class, new bd.f(ad.n.class, 11));
    }
}
