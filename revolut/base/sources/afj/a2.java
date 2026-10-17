package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class a2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4116c;
    public EsimMobilePlanEsimMigrationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a2(b bVar, Object obj2, int i) {
        this.f4114a = i;
        this.f4115b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4114a) {
            case 0:
                this.f4116c = viewController;
                break;
            case 1:
                this.f4116c = viewController;
                break;
            default:
                this.f4116c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4114a) {
            case 0:
                vc.s.h(this.f4116c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanEsimMigrationScreenContract$InputData.class);
                return new b2(this.f4115b, (q) this.e, this.d);
            case 1:
                vc.s.h(this.f4116c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanEsimMigrationScreenContract$InputData.class);
                return new b2(this.f4115b, (q0) this.e, this.d);
            default:
                vc.s.h(this.f4116c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanEsimMigrationScreenContract$InputData.class);
                return new b2(this.f4115b, (m) this.e, this.d);
        }
    }
}
