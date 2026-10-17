package lwl;

import com.revolut.ui.login.pin.LoginActivity;
import kotlin.jvm.functions.Function0;
import ljl.q0;
import lp.q1;
import no.m1;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements d4m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200491b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f200490a = i;
        this.f200491b = obj2;
    }

    @Override // d4m.a, phm.a
    public final Object get() {
        int i = this.f200490a;
        Object obj2 = this.f200491b;
        switch (i) {
            case 0:
                int i2 = LoginActivity.f107072x0;
                return ((vl3.n) ((q1) obj2).f197854ot.get()).e();
            case 1:
                int i3 = LoginActivity.f107072x0;
                return ((v8k.a) ((q1) obj2).En.get()).a();
            case 2:
                int i5 = LoginActivity.f107072x0;
                return ((zvj.a) ((q1) obj2).Ig.get()).a();
            case 3:
                int i6 = LoginActivity.f107072x0;
                return ((ozl.a) ((cri.d) ((q1) obj2).a7.get())).a();
            case 4:
                int i21 = LoginActivity.f107072x0;
                return ((q1) obj2).C5().a();
            case 5:
                int i22 = LoginActivity.f107072x0;
                xjl.n nVar = (xjl.n) ((q0) ((ljl.q1) ((q1) obj2).f197899qp.get())).f196079t0.get();
                nVar.getClass();
                return new kll.c(nVar.f306574a, nVar.f306575b, nVar.f306576c);
            case 6:
                int i32 = LoginActivity.f107072x0;
                return ((q1) obj2).M5().e();
            case 7:
                int i33 = LoginActivity.f107072x0;
                return ((opa.c) ((q1) obj2).f198088z2.get()).a();
            case 8:
                int i43 = LoginActivity.f107072x0;
                return (lte.c) ((q1) obj2).I5().f168370h.get();
            case 9:
                int i59 = LoginActivity.f107072x0;
                return (dl0.a) ((el0.a) ((q1) obj2).f197842og.get()).f127229c.get();
            case 10:
                int i66 = LoginActivity.f107072x0;
                return ((q1) obj2).k.f197513b.j6().a();
            case 11:
                int i74 = LoginActivity.f107072x0;
                poi.b bVarA5 = ((q1) obj2).A5();
                uo.b bVar = (uo.b) bVarA5.z.get();
                return new m1(e4m.b.a(bVarA5.K), bVarA5.a(), bVar, (uo.l) bVarA5.T.get(), bVarA5.j());
            default:
                return (com.revolut.analytics.tracking.v3.d) ((Function0) obj2).invoke();
        }
    }
}
