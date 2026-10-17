package ix5;

import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements px5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f169336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f169337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f169338c;
    public CryptoSortingPickerInputData d;

    public a(d dVar, e eVar) {
        this.f169336a = dVar;
        this.f169337b = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f169338c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f169338c, ViewController.class);
        s.h(this.d, CryptoSortingPickerInputData.class);
        return new c(this.f169336a, this.f169337b, this.d);
    }

    @Override // px5.a
    public final px5.a x(CryptoSortingPickerInputData cryptoSortingPickerInputData) {
        cryptoSortingPickerInputData.getClass();
        this.d = cryptoSortingPickerInputData;
        return this;
    }
}
