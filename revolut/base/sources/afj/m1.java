package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class m1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4344c;
    public EsimPlanDurationPickerBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ m1(b bVar, Object obj2, int i) {
        this.f4342a = i;
        this.f4343b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4342a) {
            case 0:
                this.f4344c = viewController;
                break;
            default:
                this.f4344c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4342a) {
            case 0:
                vc.s.h(this.f4344c, ViewController.class);
                vc.s.h(this.d, EsimPlanDurationPickerBottomSheetScreenContract$InputData.class);
                return new n1(this.f4343b, (j) this.e, this.d);
            default:
                vc.s.h(this.f4344c, ViewController.class);
                vc.s.h(this.d, EsimPlanDurationPickerBottomSheetScreenContract$InputData.class);
                return new n1(this.f4343b, (m) this.e, this.d);
        }
    }
}
