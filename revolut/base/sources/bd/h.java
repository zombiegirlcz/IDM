package bd;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import md.b1;
import md.b3;
import md.f0;
import md.g0;
import md.i1;
import md.j0;
import md.l0;
import md.l1;
import md.m0;
import md.n1;
import md.o1;
import md.o2;
import md.p0;
import md.q1;
import md.r0;
import md.r1;
import md.s0;
import md.t2;
import md.u1;
import md.v0;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends hd.e {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Class cls, f[] fVarArr, int i) {
        super(cls, fVarArr);
        this.d = i;
    }

    public static hd.d k(int i, int i2, i1 i1Var, ad.i iVar) {
        md.t tVarA = md.u.A();
        md.w wVarY = md.x.y();
        wVarY.e();
        md.x.v((md.x) wVarY.f49436b);
        md.x xVar = (md.x) wVarY.a();
        tVarA.e();
        md.u.v((md.u) tVarA.f49436b, xVar);
        tVarA.e();
        md.u.w((md.u) tVarA.f49436b, i);
        md.u uVar = (md.u) tVarA.a();
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
        o1.w((o1) n1VarA.f49436b, 32);
        o1 o1Var = (o1) n1VarA.a();
        md.n nVarZ = md.o.z();
        nVarZ.e();
        md.o.v((md.o) nVarZ.f49436b, uVar);
        nVarZ.e();
        md.o.w((md.o) nVarZ.f49436b, o1Var);
        return new hd.d((md.o) nVarZ.a(), iVar);
    }

    public static hd.d l(int i, ad.i iVar) {
        md.c0 c0VarZ = md.d0.z();
        c0VarZ.e();
        md.d0.w((md.d0) c0VarZ.f49436b, i);
        f0 f0VarY = g0.y();
        f0VarY.e();
        g0.v((g0) f0VarY.f49436b);
        g0 g0Var = (g0) f0VarY.a();
        c0VarZ.e();
        md.d0.v((md.d0) c0VarZ.f49436b, g0Var);
        return new hd.d((md.d0) c0VarZ.a(), iVar);
    }

    public static hd.d m(int i, ad.i iVar) {
        l0 l0VarX = m0.x();
        l0VarX.e();
        m0.v((m0) l0VarX.f49436b, i);
        return new hd.d((m0) l0VarX.a(), iVar);
    }

    public static hd.d n(int i, ad.i iVar) {
        r0 r0VarX = s0.x();
        r0VarX.e();
        s0.v((s0) r0VarX.f49436b, i);
        return new hd.d((s0) r0VarX.a(), iVar);
    }

    @Override // hd.e
    public ed.c b() {
        switch (this.d) {
            case 0:
                return ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
            case 1:
            default:
                return super.b();
            case 2:
                return ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
        }
    }

    @Override // hd.e
    public final String c() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // hd.e
    public final cam.f e() {
        switch (this.d) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, (char) 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, (short) 0);
            case 5:
                return new g(this, (byte) 0, false);
            case 6:
                return new g(this, (byte) 0, (byte) 0);
            case 7:
                return new g(this, (byte) 0, (char) 0);
            default:
                return new g(this, (byte) 0, 0);
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
                return md.l.C(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 1:
                return md.a0.C(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 2:
                return j0.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 3:
                return p0.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 4:
                return b1.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 5:
                return o2.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 6:
                return t2.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 7:
                return b3.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            default:
                return v0.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
        }
    }

    @Override // hd.e
    public final void i(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.d) {
            case 0:
                md.l lVar = (md.l) aVar;
                nd.x.c(lVar.A());
                f[] fVarArr = {new f(nd.r.class, 1)};
                HashMap map = new HashMap();
                f fVar = fVarArr[0];
                Class cls = fVar.f14473a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(a10.b.q(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, fVar);
                Class cls2 = fVarArr[0].f14473a;
                Collections.unmodifiableMap(map);
                md.r rVarY = lVar.y();
                nd.x.c(rVarY.B());
                nd.x.a(rVarY.z().size());
                md.x xVarA = rVarY.A();
                if (xVarA.x() < 12 || xVarA.x() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(ad.n.class, 11)};
                HashMap map2 = new HashMap();
                f fVar2 = fVarArr2[0];
                Class cls3 = fVar2.f14473a;
                if (map2.containsKey(cls3)) {
                    throw new IllegalArgumentException(a10.b.q(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls3, fVar2);
                Class cls4 = fVarArr2[0].f14473a;
                Collections.unmodifiableMap(map2);
                l1 l1VarZ = lVar.z();
                nd.x.c(l1VarZ.B());
                if (l1VarZ.z().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                id.b.m(l1VarZ.A());
                return;
            case 1:
                md.a0 a0Var = (md.a0) aVar;
                nd.x.c(a0Var.A());
                nd.x.a(a0Var.y().size());
                if (a0Var.z().x() != 12 && a0Var.z().x() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                j0 j0Var = (j0) aVar;
                nd.x.c(j0Var.y());
                nd.x.a(j0Var.x().size());
                return;
            case 3:
                p0 p0Var = (p0) aVar;
                nd.x.c(p0Var.y());
                nd.x.a(p0Var.x().size());
                return;
            case 4:
                b1 b1Var = (b1) aVar;
                nd.x.c(b1Var.y());
                if (b1Var.x().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                nd.x.c(((o2) aVar).y());
                return;
            case 6:
                nd.x.c(((t2) aVar).y());
                return;
            case 7:
                b3 b3Var = (b3) aVar;
                nd.x.c(b3Var.y());
                if (b3Var.x().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                v0 v0Var = (v0) aVar;
                nd.x.c(v0Var.y());
                if (v0Var.x().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + v0Var.x().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
