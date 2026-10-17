package ta9;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f269194b;

    public /* synthetic */ d(m mVar, int i) {
        this.f269193a = i;
        this.f269194b = mVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f269193a) {
            case 0:
                m mVar = this.f269194b;
                l70.e eVar = mVar.i;
                s70.a aVarM = eVar.m();
                vc.s.j(aVarM);
                y80.a aVarR = eVar.r();
                vc.s.j(aVarR);
                cl3.a aVarD = mVar.E.d();
                vc.s.j(aVarD);
                return new ma9.k(aVarM, aVarR, aVarD, new ma9.l());
            default:
                m mVar2 = this.f269194b;
                q89.e eVar2 = (q89.e) mVar2.P.get();
                efk.a aVar = mVar2.f;
                ffk.t tVarF = aVar.f();
                vc.s.j(tVarF);
                fy2.d dVar = mVar2.F;
                v6l.s sVarH = dVar.f138882a.h();
                wsg.n nVarB = dVar.f138883b.b();
                Context context = dVar.e;
                fy2.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                ix2.e eVar3 = new ix2.e(new c90.c(context));
                qz0.j jVar = (qz0.j) dVar.f138887j.get();
                hy2.h hVarB = dVar.b();
                gte.a aVarB = dVar.f138884c.b();
                vc.s.j(aVarB);
                hy2.j jVar2 = new hy2.j(sVarH, nVarB, eVar3, jVar, hVarB, aVarB);
                tfk.a aVar2 = (tfk.a) aVar.M.get();
                vc.s.j(aVar2);
                gte.a aVarB2 = mVar2.f269248n.b();
                vc.s.j(aVarB2);
                wik.m mVarA = mVar2.G.a();
                ma3.a aVarA = mVar2.H.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.onboarding.impl.onboarding.plan_selection.a(eVar2, tVarF, jVar2, aVar2, aVarB2, mVarA, aVarA);
        }
    }
}
