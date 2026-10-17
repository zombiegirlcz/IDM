package r6e;

import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f251740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MoneyBoxAmountInputScreenContract$InputData f251741c;
    public final Object d;
    public final Object e;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f251739a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f251739a) {
            case 0:
                this.f251740b = baseScreen;
                break;
            case 1:
                this.f251740b = baseScreen;
                break;
            case 2:
                this.f251740b = baseScreen;
                break;
            default:
                this.f251740b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f251739a) {
            case 0:
                vc.s.h(this.f251740b, BaseScreen.class);
                vc.s.h(this.f251741c, MoneyBoxAmountInputScreenContract$InputData.class);
                return new wpg.o((o) this.d, (j) this.e, this.f251741c);
            case 1:
                vc.s.h(this.f251740b, BaseScreen.class);
                vc.s.h(this.f251741c, MoneyBoxAmountInputScreenContract$InputData.class);
                return new wpg.o((wpg.l) this.d, (wpg.n) this.e, this.f251741c);
            case 2:
                vc.s.h(this.f251740b, BaseScreen.class);
                vc.s.h(this.f251741c, MoneyBoxAmountInputScreenContract$InputData.class);
                return new wpg.o((wpg.l) this.d, (wpg.i) this.e, this.f251741c);
            default:
                vc.s.h(this.f251740b, BaseScreen.class);
                vc.s.h(this.f251741c, MoneyBoxAmountInputScreenContract$InputData.class);
                return new wpg.o((wpg.l) this.d, (wpg.m) this.e, this.f251741c);
        }
    }
}
