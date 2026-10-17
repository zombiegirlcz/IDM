package r6e;

import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f251817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f251818c;
    public BillSelectorScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x(o oVar, Object obj2, int i) {
        this.f251816a = i;
        this.f251817b = oVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f251816a) {
            case 0:
                this.f251818c = baseScreen;
                break;
            default:
                this.f251818c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f251816a) {
            case 0:
                vc.s.h(this.f251818c, BaseScreen.class);
                vc.s.h(this.d, BillSelectorScreenContract$InputData.class);
                return new y(this.f251817b, (d) this.e, this.f251818c, this.d);
            default:
                vc.s.h(this.f251818c, BaseScreen.class);
                vc.s.h(this.d, BillSelectorScreenContract$InputData.class);
                return new y(this.f251817b, (f) this.e, this.f251818c, this.d);
        }
    }
}
