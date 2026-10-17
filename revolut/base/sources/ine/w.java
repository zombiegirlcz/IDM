package ine;

import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f162915c;
    public TaxNumberInputScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w(o oVar, Object obj2, int i) {
        this.f162913a = i;
        this.f162914b = oVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f162913a) {
            case 0:
                this.f162915c = baseScreen;
                break;
            case 1:
                this.f162915c = baseScreen;
                break;
            default:
                this.f162915c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f162913a) {
            case 0:
                vc.s.h(this.f162915c, BaseScreen.class);
                vc.s.h(this.d, TaxNumberInputScreenContract$InputData.class);
                return new x(this.f162914b, (n) this.e, this.f162915c, this.d);
            case 1:
                vc.s.h(this.f162915c, BaseScreen.class);
                vc.s.h(this.d, TaxNumberInputScreenContract$InputData.class);
                return new x(this.f162914b, (i) this.e, this.f162915c, this.d);
            default:
                vc.s.h(this.f162915c, BaseScreen.class);
                vc.s.h(this.d, TaxNumberInputScreenContract$InputData.class);
                return new x(this.f162914b, (m) this.e, this.f162915c, this.d);
        }
    }
}
