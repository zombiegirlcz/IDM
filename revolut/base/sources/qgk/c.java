package qgk;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245898b;

    public /* synthetic */ c(i0 i0Var, int i) {
        this.f245897a = i;
        this.f245898b = i0Var;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f245897a) {
            case 0:
                cha.c cVarJ = this.f245898b.f246013h.j();
                vc.s.j(cVarJ);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a(cVarJ);
            default:
                cha.c cVarJ2 = this.f245898b.f246013h.j();
                vc.s.j(cVarJ2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a(cVarJ2);
        }
    }
}
