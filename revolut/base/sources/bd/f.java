package bd;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import md.b1;
import md.b3;
import md.i1;
import md.j0;
import md.l1;
import md.o2;
import md.p0;
import md.t2;
import md.v0;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14474b;

    public f(Class cls, int i) {
        this.f14474b = i;
        this.f14473a = cls;
    }

    public final Object a(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f14474b) {
            case 0:
                md.l lVar = (md.l) aVar;
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
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                md.r rVarY = lVar.y();
                f fVar2 = (f) mapUnmodifiableMap.get(nd.r.class);
                if (fVar2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + nd.r.class.getCanonicalName() + " not supported.");
                }
                nd.r rVar = (nd.r) fVar2.a(rVarY);
                f[] fVarArr2 = {new f(ad.n.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar3 : fVarArr2) {
                    Class cls3 = fVar3.f14473a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a10.b.q(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar3);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f14473a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                l1 l1VarZ = lVar.z();
                f fVar4 = (f) mapUnmodifiableMap2.get(ad.n.class);
                if (fVar4 != null) {
                    return new nd.h(rVar, (ad.n) fVar4.a(l1VarZ), lVar.z().A().z());
                }
                throw new IllegalArgumentException("Requested primitive class " + ad.n.class.getCanonicalName() + " not supported.");
            case 1:
                md.r rVar2 = (md.r) aVar;
                return new nd.a(rVar2.z().e(), rVar2.A().x());
            case 2:
                md.a0 a0Var = (md.a0) aVar;
                return new nd.b(a0Var.y().e(), a0Var.z().x());
            case 3:
                return new nd.c(((j0) aVar).x().e());
            case 4:
                return new dd.a(((p0) aVar).x().e());
            case 5:
                return new nd.g(((b1) aVar).x().e(), 0);
            case 6:
                String strW = ((o2) aVar).x().w();
                return ad.m.a(strW).c(strW);
            case 7:
                t2 t2Var = (t2) aVar;
                String strX = t2Var.x().x();
                return new z(t2Var.x().w(), ad.m.a(strX).c(strX));
            case 8:
                return new nd.g(((b3) aVar).x().e(), 1);
            case 9:
                return new nd.d(((v0) aVar).x().e());
            case 10:
                md.c cVar = (md.c) aVar;
                return new nd.v(new nd.s(cVar.y().e()), cVar.z().x());
            default:
                l1 l1Var = (l1) aVar;
                i1 i1VarY = l1Var.A().y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(l1Var.z().e(), "HMAC");
                int iZ = l1Var.A().z();
                int i = id.k.f160364a[i1VarY.ordinal()];
                if (i == 1) {
                    return new nd.v(new nd.u("HMACSHA1", secretKeySpec), iZ);
                }
                if (i == 2) {
                    return new nd.v(new nd.u("HMACSHA224", secretKeySpec), iZ);
                }
                if (i == 3) {
                    return new nd.v(new nd.u("HMACSHA256", secretKeySpec), iZ);
                }
                if (i == 4) {
                    return new nd.v(new nd.u("HMACSHA384", secretKeySpec), iZ);
                }
                if (i == 5) {
                    return new nd.v(new nd.u("HMACSHA512", secretKeySpec), iZ);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
