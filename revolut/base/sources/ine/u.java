package ine;

import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f162909c;
    public TaxResidencyPrefetchDataScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u(o oVar, Object obj2, int i) {
        this.f162907a = i;
        this.f162908b = oVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f162907a) {
            case 0:
                this.f162909c = baseScreen;
                break;
            default:
                this.f162909c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f162907a) {
            case 0:
                vc.s.h(this.f162909c, BaseScreen.class);
                vc.s.h(this.d, TaxResidencyPrefetchDataScreenContract$InputData.class);
                return new v(this.f162908b, (i) this.e, this.d);
            default:
                vc.s.h(this.f162909c, BaseScreen.class);
                vc.s.h(this.d, TaxResidencyPrefetchDataScreenContract$InputData.class);
                return new v(this.f162908b, (b) this.e, this.d);
        }
    }
}
