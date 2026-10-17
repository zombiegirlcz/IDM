package xf6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.ExpirationSelectionBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304821c;
    public ExpirationSelectionBottomSheetContract$InputData d;
    public final Object e;

    public /* synthetic */ d1(t tVar, Object obj2, int i) {
        this.f304819a = i;
        this.f304820b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304819a) {
            case 0:
                this.f304821c = viewController;
                break;
            default:
                this.f304821c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304819a) {
            case 0:
                vc.s.h(this.f304821c, ViewController.class);
                vc.s.h(this.d, ExpirationSelectionBottomSheetContract$InputData.class);
                return new e1(this.f304820b, (d0) this.e, this.d);
            default:
                vc.s.h(this.f304821c, ViewController.class);
                vc.s.h(this.d, ExpirationSelectionBottomSheetContract$InputData.class);
                return new e1(this.f304820b, (z) this.e, this.d);
        }
    }
}
