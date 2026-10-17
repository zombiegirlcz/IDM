package hm9;

import com.revolut.feature.payees.impl.ui.payees_overview_info_bottom_sheet.PayeesOverviewInfoBottomSheetScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f153570c;
    public PayeesOverviewInfoBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ i(b bVar, Object obj2, int i) {
        this.f153568a = i;
        this.f153569b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f153568a) {
            case 0:
                this.f153570c = viewController;
                break;
            default:
                this.f153570c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f153568a) {
            case 0:
                s.h(this.f153570c, ViewController.class);
                s.h(this.d, PayeesOverviewInfoBottomSheetScreenContract$InputData.class);
                return new j(this.f153569b, (g) this.e, this.d);
            default:
                s.h(this.f153570c, ViewController.class);
                s.h(this.d, PayeesOverviewInfoBottomSheetScreenContract$InputData.class);
                return new j(this.f153569b, (e) this.e, this.d);
        }
    }
}
