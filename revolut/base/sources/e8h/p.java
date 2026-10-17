package e8h;

import fag.t0;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123721c;

    public /* synthetic */ p(Object obj2, boolean z, int i) {
        this.f123719a = i;
        this.f123721c = obj2;
        this.f123720b = z;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f123719a) {
            case 0:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((u) this.f123721c).f123730b.f203547a, m8h.d.d, Boolean.valueOf(this.f123720b));
                break;
            case 1:
                t0 t0Var = (t0) this.f123721c;
                t0Var.e(dgi.c.a(t0Var.a(), null, null, null, null, null, null, null, this.f123720b, null, null, null, null, null, 4193279));
                break;
            case 2:
                fwj.p pVar = (fwj.p) this.f123721c;
                if (this.f123720b) {
                    i1b.e.a(pVar.k, i1b.b.Account, i1b.d.Signup, i1b.a.Completed);
                    pVar.v.f138661b.e2(new ho.p("Account_Signup_completed"));
                }
                break;
            case 3:
                ((com.revolut.retail.analytics.tracking.impl.b) ((noi.a) this.f123721c).f218046a).k3(this.f123720b);
                break;
            case 4:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((prl.b) this.f123721c).f239322a, "KEY_EXTENDED_HOURS_INCLUDED_BY_DEFAULT", Boolean.valueOf(this.f123720b));
                break;
            case 5:
                pyc.h0 h0Var = (pyc.h0) ((pyc.t) ((pyc.g0) this.f123721c).f240776c).f240799b;
                h0Var.f240785m.getValue(h0Var, pyc.h0.f240778q[11]).set(Boolean.valueOf(this.f123720b));
                break;
            default:
                ((soi.e) this.f123721c).d.j(Unit.f186387a, Boolean.valueOf(this.f123720b));
                break;
        }
    }

    public /* synthetic */ p(boolean z, fwj.p pVar) {
        this.f123719a = 2;
        this.f123720b = z;
        this.f123721c = pVar;
    }
}
