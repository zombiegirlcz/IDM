package mw5;

import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements px5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f209393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f209394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CryptoSortingPickerInputData f209395c;

    public n(l lVar) {
        this.f209393a = lVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f209394b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f209394b, ViewController.class);
        s.h(this.f209395c, CryptoSortingPickerInputData.class);
        return new ix5.c(this.f209393a, this.f209395c);
    }

    @Override // px5.a
    public final px5.a x(CryptoSortingPickerInputData cryptoSortingPickerInputData) {
        cryptoSortingPickerInputData.getClass();
        this.f209395c = cryptoSortingPickerInputData;
        return this;
    }
}
