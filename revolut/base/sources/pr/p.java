package pr;

import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationScansService;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationService;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationVisionResourcesService;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class p implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f238867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238868b;

    public p(q qVar, int i) {
        this.f238867a = qVar;
        this.f238868b = i;
    }

    @Override // phm.a
    public final Object get() {
        q qVar = this.f238867a;
        int i = this.f238868b;
        switch (i) {
            case 0:
                return new zr.l((ne0.j) qVar.f238876m.get());
            case 1:
                return j.a();
            case 2:
                return new ds.a();
            case 3:
                return new lr.e(qVar.f238869a, (BiometricVerificationDatabase) qVar.f238878p.get());
            case 4:
                return pl1.d.l(qVar.f238869a);
            case 5:
                return new lr.c((BiometricVerificationScansService) qVar.f238881s.get(), f.a());
            case 6:
                ek.a aVarD = ((nj0.d) qVar.f238870b).d();
                OkHttpClient okHttpClient = (OkHttpClient) qVar.f238880r.get();
                ik0.b bVarM = ((nj0.d) qVar.f238870b).m();
                vc.s.j(bVarM);
                return d.a(aVarD, okHttpClient, bVarM, qVar.d);
            case 7:
                xj0.i iVarL = ((nj0.d) qVar.f238870b).l();
                vc.s.j(iVarL);
                return pl1.d.y(iVarL, new xq.a(), new xq.c(qVar.a(), qVar.d));
            case 8:
                return new lr.a((BiometricVerificationDatabase) qVar.f238878p.get(), (BiometricVerificationService) qVar.v.get());
            case 9:
                ek.a aVarD2 = ((nj0.d) qVar.f238870b).d();
                OkHttpClient okHttpClient2 = (OkHttpClient) qVar.u.get();
                ik0.b bVarM2 = ((nj0.d) qVar.f238870b).m();
                vc.s.j(bVarM2);
                return e.a(aVarD2, okHttpClient2, bVarM2, qVar.d);
            case 10:
                xj0.i iVarL2 = ((nj0.d) qVar.f238870b).l();
                vc.s.j(iVarL2);
                return pl1.d.x(iVarL2, new xq.a(), new xq.c(qVar.a(), qVar.d));
            case 11:
                return new br.b(new yr.d(new usc.a((lr.e) qVar.f238879q.get()), new tsk.t((lr.e) qVar.f238879q.get()), new tsk.t((lr.c) qVar.f238882t.get()), new vfg.p((lr.e) qVar.f238879q.get()), new ybh.c0((lr.a) qVar.f238883w.get()), new ugc.a((lr.a) qVar.f238883w.get()), new qr.a()));
            case 12:
                return new zr.k(new lr.p((BiometricVerificationService) qVar.v.get(), (BiometricVerificationScansService) qVar.f238881s.get(), (tr.e) qVar.f238884x.get(), (lr.a) qVar.f238883w.get(), new cr.d(f.a()), f.a()), new tr.a(), new cr.a());
            case 13:
                return new tr.f();
            case 14:
                CoroutineScope coroutineScope = (CoroutineScope) qVar.z.get();
                zw.e eVarD = qVar.e.f240527a.d();
                vc.s.j(eVarD);
                return new sr.a(new lal.a(coroutineScope, eVarD, (BiometricVerificationVisionResourcesService) qVar.A.get()));
            case 15:
                return i.a();
            case 16:
                return pl1.d.m(((nj0.d) qVar.f238870b).f());
            case 17:
                return new zr.e();
            case 18:
                return new lr.h((BiometricVerificationService) qVar.v.get());
            case 19:
                return new zr.a(new lr.g((ne0.j) qVar.f238876m.get()));
            default:
                throw new AssertionError(i);
        }
    }
}
