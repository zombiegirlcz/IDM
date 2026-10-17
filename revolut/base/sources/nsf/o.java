package nsf;

import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f218843c;
    public AdditionalInfoDropdownSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o(b bVar, Object obj2, int i) {
        this.f218841a = i;
        this.f218842b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f218841a) {
            case 0:
                this.f218843c = viewController;
                break;
            default:
                this.f218843c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f218841a) {
            case 0:
                vc.s.h(this.f218843c, ViewController.class);
                vc.s.h(this.d, AdditionalInfoDropdownSelectionScreenContract$InputData.class);
                return new p(this.f218842b, (f) this.e, this.d);
            default:
                vc.s.h(this.f218843c, ViewController.class);
                vc.s.h(this.d, AdditionalInfoDropdownSelectionScreenContract$InputData.class);
                return new p(this.f218842b, (d) this.e, this.d);
        }
    }
}
