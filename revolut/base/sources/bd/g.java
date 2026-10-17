package bd;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import md.a1;
import md.a3;
import md.b1;
import md.b3;
import md.d3;
import md.e1;
import md.g0;
import md.i0;
import md.i1;
import md.j0;
import md.k1;
import md.l1;
import md.m0;
import md.n2;
import md.o0;
import md.o1;
import md.o2;
import md.p0;
import md.q2;
import md.r1;
import md.s0;
import md.s2;
import md.t2;
import md.u0;
import md.v0;
import md.v2;
import md.x0;
import md.y0;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14475b = 0;

    public /* synthetic */ g(Class cls) {
        super(cls, false);
    }

    @Override // cam.f
    public final void E(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f14475b) {
            case 0:
                md.o oVar = (md.o) aVar;
                f[] fVarArr = {new f(nd.r.class, 1)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f14473a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(a10.b.q(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f14473a;
                }
                Collections.unmodifiableMap(map);
                md.u uVarX = oVar.x();
                nd.x.a(uVarX.y());
                md.x xVarZ = uVarX.z();
                if (xVarZ.x() < 12 || xVarZ.x() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(ad.n.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    Class cls3 = fVar2.f14473a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a10.b.q(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f14473a;
                }
                Collections.unmodifiableMap(map2);
                o1 o1VarY = oVar.y();
                if (o1VarY.y() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                id.b.m(o1VarY.z());
                nd.x.a(oVar.x().y());
                return;
            case 1:
                md.d0 d0Var = (md.d0) aVar;
                nd.x.a(d0Var.x());
                if (d0Var.y().x() != 12 && d0Var.y().x() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                nd.x.a(((m0) aVar).w());
                return;
            case 3:
                nd.x.a(((s0) aVar).w());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                v2 v2Var = (v2) aVar;
                if (v2Var.x().isEmpty() || !v2Var.y()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                y0 y0Var = (y0) aVar;
                if (y0Var.w() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + y0Var.w() + ". Valid keys must have 64 bytes.");
            case 9:
                md.f fVar3 = (md.f) aVar;
                id.b.l(fVar3.y());
                if (fVar3.x() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                o1 o1Var = (o1) aVar;
                if (o1Var.y() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                id.b.m(o1Var.z());
                return;
        }
    }

    @Override // cam.f
    public final com.google.crypto.tink.shaded.protobuf.a f(com.google.crypto.tink.shaded.protobuf.a aVar) {
        switch (this.f14475b) {
            case 0:
                md.o oVar = (md.o) aVar;
                f[] fVarArr = {new f(nd.r.class, 1)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f14473a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(a10.b.q(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f14473a;
                }
                Collections.unmodifiableMap(map);
                md.u uVarX = oVar.x();
                md.q qVarC = md.r.C();
                md.x xVarZ = uVarX.z();
                qVarC.e();
                md.r.w((md.r) qVarC.f49436b, xVarZ);
                byte[] bArrA = nd.w.a(uVarX.y());
                com.google.crypto.tink.shaded.protobuf.i iVarC = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA.length, bArrA);
                qVarC.e();
                md.r.x((md.r) qVarC.f49436b, iVarC);
                qVarC.e();
                md.r.v((md.r) qVarC.f49436b);
                md.r rVar = (md.r) qVarC.a();
                f[] fVarArr2 = {new f(ad.n.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    Class cls3 = fVar2.f14473a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a10.b.q(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f14473a;
                }
                Collections.unmodifiableMap(map2);
                o1 o1VarY = oVar.y();
                k1 k1VarC = l1.C();
                k1VarC.e();
                l1.v((l1) k1VarC.f49436b);
                r1 r1VarZ = o1VarY.z();
                k1VarC.e();
                l1.w((l1) k1VarC.f49436b, r1VarZ);
                byte[] bArrA2 = nd.w.a(o1VarY.y());
                com.google.crypto.tink.shaded.protobuf.i iVarC2 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA2.length, bArrA2);
                k1VarC.e();
                l1.x((l1) k1VarC.f49436b, iVarC2);
                l1 l1Var = (l1) k1VarC.a();
                md.k kVarB = md.l.B();
                kVarB.e();
                md.l.w((md.l) kVarB.f49436b, rVar);
                kVarB.e();
                md.l.x((md.l) kVarB.f49436b, l1Var);
                kVarB.e();
                md.l.v((md.l) kVarB.f49436b);
                return (md.l) kVarB.a();
            case 1:
                md.d0 d0Var = (md.d0) aVar;
                md.z zVarB = md.a0.B();
                byte[] bArrA3 = nd.w.a(d0Var.x());
                com.google.crypto.tink.shaded.protobuf.i iVarC3 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA3.length, bArrA3);
                zVarB.e();
                md.a0.x((md.a0) zVarB.f49436b, iVarC3);
                g0 g0VarY = d0Var.y();
                zVarB.e();
                md.a0.w((md.a0) zVarB.f49436b, g0VarY);
                zVarB.e();
                md.a0.v((md.a0) zVarB.f49436b);
                return (md.a0) zVarB.a();
            case 2:
                i0 i0VarZ = j0.z();
                byte[] bArrA4 = nd.w.a(((m0) aVar).w());
                com.google.crypto.tink.shaded.protobuf.i iVarC4 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA4.length, bArrA4);
                i0VarZ.e();
                j0.w((j0) i0VarZ.f49436b, iVarC4);
                i0VarZ.e();
                j0.v((j0) i0VarZ.f49436b);
                return (j0) i0VarZ.a();
            case 3:
                o0 o0VarZ = p0.z();
                byte[] bArrA5 = nd.w.a(((s0) aVar).w());
                com.google.crypto.tink.shaded.protobuf.i iVarC5 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA5.length, bArrA5);
                o0VarZ.e();
                p0.w((p0) o0VarZ.f49436b, iVarC5);
                o0VarZ.e();
                p0.v((p0) o0VarZ.f49436b);
                return (p0) o0VarZ.a();
            case 4:
                a1 a1VarZ = b1.z();
                a1VarZ.e();
                b1.v((b1) a1VarZ.f49436b);
                byte[] bArrA6 = nd.w.a(32);
                com.google.crypto.tink.shaded.protobuf.i iVarC6 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA6.length, bArrA6);
                a1VarZ.e();
                b1.w((b1) a1VarZ.f49436b, iVarC6);
                return (b1) a1VarZ.a();
            case 5:
                n2 n2VarZ = o2.z();
                n2VarZ.e();
                o2.w((o2) n2VarZ.f49436b, (q2) aVar);
                n2VarZ.e();
                o2.v((o2) n2VarZ.f49436b);
                return (o2) n2VarZ.a();
            case 6:
                s2 s2VarZ = t2.z();
                s2VarZ.e();
                t2.w((t2) s2VarZ.f49436b, (v2) aVar);
                s2VarZ.e();
                t2.v((t2) s2VarZ.f49436b);
                return (t2) s2VarZ.a();
            case 7:
                a3 a3VarZ = b3.z();
                a3VarZ.e();
                b3.v((b3) a3VarZ.f49436b);
                byte[] bArrA7 = nd.w.a(32);
                com.google.crypto.tink.shaded.protobuf.i iVarC7 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA7.length, bArrA7);
                a3VarZ.e();
                b3.w((b3) a3VarZ.f49436b, iVarC7);
                return (b3) a3VarZ.a();
            case 8:
                u0 u0VarZ = v0.z();
                byte[] bArrA8 = nd.w.a(((y0) aVar).w());
                com.google.crypto.tink.shaded.protobuf.i iVarC8 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA8.length, bArrA8);
                u0VarZ.e();
                v0.w((v0) u0VarZ.f49436b, iVarC8);
                u0VarZ.e();
                v0.v((v0) u0VarZ.f49436b);
                return (v0) u0VarZ.a();
            case 9:
                md.f fVar3 = (md.f) aVar;
                md.b bVarB = md.c.B();
                bVarB.e();
                md.c.v((md.c) bVarB.f49436b);
                byte[] bArrA9 = nd.w.a(fVar3.x());
                com.google.crypto.tink.shaded.protobuf.i iVarC9 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA9.length, bArrA9);
                bVarB.e();
                md.c.w((md.c) bVarB.f49436b, iVarC9);
                md.i iVarY = fVar3.y();
                bVarB.e();
                md.c.x((md.c) bVarB.f49436b, iVarY);
                return (md.c) bVarB.a();
            default:
                o1 o1Var = (o1) aVar;
                k1 k1VarC2 = l1.C();
                k1VarC2.e();
                l1.v((l1) k1VarC2.f49436b);
                r1 r1VarZ2 = o1Var.z();
                k1VarC2.e();
                l1.w((l1) k1VarC2.f49436b, r1VarZ2);
                byte[] bArrA10 = nd.w.a(o1Var.y());
                com.google.crypto.tink.shaded.protobuf.i iVarC10 = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrA10.length, bArrA10);
                k1VarC2.e();
                l1.x((l1) k1VarC2.f49436b, iVarC10);
                return (l1) k1VarC2.a();
        }
    }

    @Override // cam.f
    public Map s() {
        switch (this.f14475b) {
            case 0:
                HashMap map = new HashMap();
                i1 i1Var = i1.SHA256;
                ad.i iVar = ad.i.TINK;
                map.put("AES128_CTR_HMAC_SHA256", h.k(16, 16, i1Var, iVar));
                ad.i iVar2 = ad.i.RAW;
                map.put("AES128_CTR_HMAC_SHA256_RAW", h.k(16, 16, i1Var, iVar2));
                map.put("AES256_CTR_HMAC_SHA256", h.k(32, 32, i1Var, iVar));
                map.put("AES256_CTR_HMAC_SHA256_RAW", h.k(32, 32, i1Var, iVar2));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                ad.i iVar3 = ad.i.TINK;
                map2.put("AES128_EAX", h.l(16, iVar3));
                ad.i iVar4 = ad.i.RAW;
                map2.put("AES128_EAX_RAW", h.l(16, iVar4));
                map2.put("AES256_EAX", h.l(32, iVar3));
                map2.put("AES256_EAX_RAW", h.l(32, iVar4));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                ad.i iVar5 = ad.i.TINK;
                map3.put("AES128_GCM", h.m(16, iVar5));
                ad.i iVar6 = ad.i.RAW;
                map3.put("AES128_GCM_RAW", h.m(16, iVar6));
                map3.put("AES256_GCM", h.m(32, iVar5));
                map3.put("AES256_GCM_RAW", h.m(32, iVar6));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                ad.i iVar7 = ad.i.TINK;
                map4.put("AES128_GCM_SIV", h.n(16, iVar7));
                ad.i iVar8 = ad.i.RAW;
                map4.put("AES128_GCM_SIV_RAW", h.n(16, iVar8));
                map4.put("AES256_GCM_SIV", h.n(32, iVar7));
                map4.put("AES256_GCM_SIV_RAW", h.n(32, iVar8));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new hd.d(e1.v(), ad.i.TINK));
                map5.put("CHACHA20_POLY1305_RAW", new hd.d(e1.v(), ad.i.RAW));
                return Collections.unmodifiableMap(map5);
            case 5:
            case 6:
            default:
                return super.s();
            case 7:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new hd.d(d3.v(), ad.i.TINK));
                map6.put("XCHACHA20_POLY1305_RAW", new hd.d(d3.v(), ad.i.RAW));
                return Collections.unmodifiableMap(map6);
            case 8:
                HashMap map7 = new HashMap();
                x0 x0VarX = y0.x();
                x0VarX.e();
                y0.v((y0) x0VarX.f49436b);
                map7.put("AES256_SIV", new hd.d((y0) x0VarX.a(), ad.i.TINK));
                x0 x0VarX2 = y0.x();
                x0VarX2.e();
                y0.v((y0) x0VarX2.f49436b);
                map7.put("AES256_SIV_RAW", new hd.d((y0) x0VarX2.a(), ad.i.RAW));
                return Collections.unmodifiableMap(map7);
            case 9:
                HashMap map8 = new HashMap();
                md.e eVarZ = md.f.z();
                eVarZ.e();
                md.f.v((md.f) eVarZ.f49436b);
                md.h hVarY = md.i.y();
                hVarY.e();
                md.i.v((md.i) hVarY.f49436b);
                md.i iVar9 = (md.i) hVarY.a();
                eVarZ.e();
                md.f.w((md.f) eVarZ.f49436b, iVar9);
                md.f fVar = (md.f) eVarZ.a();
                ad.i iVar10 = ad.i.TINK;
                map8.put("AES_CMAC", new hd.d(fVar, iVar10));
                md.e eVarZ2 = md.f.z();
                eVarZ2.e();
                md.f.v((md.f) eVarZ2.f49436b);
                md.h hVarY2 = md.i.y();
                hVarY2.e();
                md.i.v((md.i) hVarY2.f49436b);
                md.i iVar11 = (md.i) hVarY2.a();
                eVarZ2.e();
                md.f.w((md.f) eVarZ2.f49436b, iVar11);
                map8.put("AES256_CMAC", new hd.d((md.f) eVarZ2.a(), iVar10));
                md.e eVarZ3 = md.f.z();
                eVarZ3.e();
                md.f.v((md.f) eVarZ3.f49436b);
                md.h hVarY3 = md.i.y();
                hVarY3.e();
                md.i.v((md.i) hVarY3.f49436b);
                md.i iVar12 = (md.i) hVarY3.a();
                eVarZ3.e();
                md.f.w((md.f) eVarZ3.f49436b, iVar12);
                map8.put("AES256_CMAC_RAW", new hd.d((md.f) eVarZ3.a(), ad.i.RAW));
                return Collections.unmodifiableMap(map8);
            case 10:
                HashMap map9 = new HashMap();
                i1 i1Var2 = i1.SHA256;
                ad.i iVar13 = ad.i.TINK;
                map9.put("HMAC_SHA256_128BITTAG", id.b.k(32, 16, i1Var2, iVar13));
                ad.i iVar14 = ad.i.RAW;
                map9.put("HMAC_SHA256_128BITTAG_RAW", id.b.k(32, 16, i1Var2, iVar14));
                map9.put("HMAC_SHA256_256BITTAG", id.b.k(32, 32, i1Var2, iVar13));
                map9.put("HMAC_SHA256_256BITTAG_RAW", id.b.k(32, 32, i1Var2, iVar14));
                i1 i1Var3 = i1.SHA512;
                map9.put("HMAC_SHA512_128BITTAG", id.b.k(64, 16, i1Var3, iVar13));
                map9.put("HMAC_SHA512_128BITTAG_RAW", id.b.k(64, 16, i1Var3, iVar14));
                map9.put("HMAC_SHA512_256BITTAG", id.b.k(64, 32, i1Var3, iVar13));
                map9.put("HMAC_SHA512_256BITTAG_RAW", id.b.k(64, 32, i1Var3, iVar14));
                map9.put("HMAC_SHA512_512BITTAG", id.b.k(64, 64, i1Var3, iVar13));
                map9.put("HMAC_SHA512_512BITTAG_RAW", id.b.k(64, 64, i1Var3, iVar14));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // cam.f
    public final com.google.crypto.tink.shaded.protobuf.a z(com.google.crypto.tink.shaded.protobuf.j jVar) {
        switch (this.f14475b) {
            case 0:
                return md.o.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 1:
                return md.d0.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 2:
                return m0.y(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 3:
                return s0.y(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 4:
                return e1.w(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 5:
                return q2.x(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 6:
                return v2.z(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 7:
                return d3.w(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 8:
                return y0.y(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            case 9:
                return md.f.A(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
            default:
                return o1.B(jVar, com.google.crypto.tink.shaded.protobuf.q.a());
        }
    }

    public g(h hVar, byte b4, boolean z) {
        super(q2.class, false);
    }

    public g(h hVar, byte b4, byte b5) {
        super(v2.class, false);
    }

    public g(h hVar, char c2) {
        super(m0.class, false);
    }

    public g(h hVar, byte b4) {
        super(md.d0.class, false);
    }

    public g(h hVar, int i) {
        super(s0.class, false);
    }

    public g(h hVar, short s2) {
        super(e1.class, false);
    }

    public g(h hVar, byte b4, char c2) {
        super(d3.class, false);
    }

    public g(h hVar, byte b4, int i) {
        super(y0.class, false);
    }

    public g(h hVar) {
        super(md.o.class, false);
    }

    public g(id.b bVar) {
        super(o1.class, false);
    }
}
