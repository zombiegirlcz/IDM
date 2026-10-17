package ad;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.b0;
import hd.w;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import md.d2;
import md.e2;
import md.f2;
import md.g2;
import md.t1;
import md.u1;
import md.v1;
import md.w1;
import md.w2;
import md.z1;
import r10.v;

/* JADX INFO: loaded from: classes17.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f3194c;
    public static final g d;
    public static final g e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3196b;

    static {
        int i = 0;
        f3194c = new g("ENABLED", i);
        d = new g("DISABLED", i);
        e = new g("DESTROYED", i);
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f3195a = i;
        this.f3196b = obj2;
    }

    public synchronized void a(z1 z1Var) {
        f2 f2VarB;
        synchronized (this) {
            f2VarB = b(r.d(z1Var), z1Var.z());
        }
        d2 d2Var = (d2) this.f3196b;
        d2Var.e();
        g2.w((g2) d2Var.f49436b, f2VarB);
    }

    public synchronized f2 b(v1 v1Var, w2 w2Var) {
        int iA;
        synchronized (this) {
            iA = w.a();
            while (d(iA)) {
                iA = w.a();
            }
        }
        return (f2) e2VarE.a();
        if (w2Var == w2.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        e2 e2VarE = f2.E();
        e2VarE.e();
        f2.v((f2) e2VarE.f49436b, v1Var);
        e2VarE.e();
        f2.y((f2) e2VarE.f49436b, iA);
        w1 w1Var = w1.ENABLED;
        e2VarE.e();
        f2.x((f2) e2VarE.f49436b, w1Var);
        e2VarE.e();
        f2.w((f2) e2VarE.f49436b, w2Var);
        return (f2) e2VarE.a();
    }

    public synchronized v c() {
        return v.n((g2) ((d2) this.f3196b).a());
    }

    public synchronized boolean d(int i) {
        Iterator it8 = Collections.unmodifiableList(((g2) ((d2) this.f3196b).f49436b).z()).iterator();
        while (it8.hasNext()) {
            if (((f2) it8.next()).A() == i) {
                return true;
            }
        }
        return false;
    }

    public v1 e(com.google.crypto.tink.shaded.protobuf.j jVar) throws GeneralSecurityException {
        hd.e eVar = (hd.e) this.f3196b;
        try {
            cam.f fVarE = eVar.e();
            com.google.crypto.tink.shaded.protobuf.a aVarZ = fVarE.z(jVar);
            fVarE.E(aVarZ);
            com.google.crypto.tink.shaded.protobuf.a aVarF = fVarE.f(aVarZ);
            t1 t1VarC = v1.C();
            String strC = eVar.c();
            t1VarC.e();
            v1.v((v1) t1VarC.f49436b, strC);
            try {
                int iA = ((b0) aVarF).a(null);
                byte[] bArr = new byte[iA];
                com.google.crypto.tink.shaded.protobuf.n nVar = new com.google.crypto.tink.shaded.protobuf.n(bArr, iA);
                aVarF.e(nVar);
                if (nVar.f49393c - nVar.d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                com.google.crypto.tink.shaded.protobuf.i iVar = new com.google.crypto.tink.shaded.protobuf.i(bArr);
                t1VarC.e();
                v1.w((v1) t1VarC.f49436b, iVar);
                u1 u1VarF = eVar.f();
                t1VarC.e();
                v1.x((v1) t1VarC.f49436b, u1VarF);
                return (v1) t1VarC.a();
            } catch (IOException e2) {
                throw new RuntimeException(aVarF.b("ByteString"), e2);
            }
        } catch (InvalidProtocolBufferException e4) {
            throw new GeneralSecurityException("Unexpected proto", e4);
        }
    }

    public String toString() {
        switch (this.f3195a) {
            case 0:
                return (String) this.f3196b;
            default:
                return super.toString();
        }
    }

    public g(hd.e eVar, Class cls) {
        this.f3195a = 2;
        if (!((Map) eVar.f151345c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(a0.d.s("Given internalKeyMananger ", eVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f3196b = eVar;
    }
}
