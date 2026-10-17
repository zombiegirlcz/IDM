package lf9;

import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f194813c;
    public DropdownSearchableSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x(m mVar, Object obj2, int i) {
        this.f194811a = i;
        this.f194812b = mVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f194811a) {
            case 0:
                this.f194813c = viewController;
                break;
            case 1:
                this.f194813c = viewController;
                break;
            default:
                this.f194813c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f194811a) {
            case 0:
                vc.s.h(this.f194813c, ViewController.class);
                vc.s.h(this.d, DropdownSearchableSelectionScreenContract$InputData.class);
                return new y(this.f194812b, (h) this.e, this.d);
            case 1:
                vc.s.h(this.f194813c, ViewController.class);
                vc.s.h(this.d, DropdownSearchableSelectionScreenContract$InputData.class);
                return new y(this.f194812b, (b) this.e, this.d);
            default:
                vc.s.h(this.f194813c, ViewController.class);
                vc.s.h(this.d, DropdownSearchableSelectionScreenContract$InputData.class);
                return new y(this.f194812b, (n) this.e, this.d);
        }
    }
}
