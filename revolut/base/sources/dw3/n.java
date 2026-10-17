package dw3;

import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f119304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DirectDebitAccountSelectionScreenContract$InputData f119305c;
    public final Object d;
    public final Object e;

    public /* synthetic */ n(Object obj2, Object obj3, int i) {
        this.f119303a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f119303a) {
            case 0:
                this.f119304b = baseScreen;
                break;
            case 1:
                this.f119304b = baseScreen;
                break;
            default:
                this.f119304b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f119303a) {
            case 0:
                vc.s.h(this.f119304b, BaseScreen.class);
                vc.s.h(this.f119305c, DirectDebitAccountSelectionScreenContract$InputData.class);
                return new o((c1) this.d, (h2) this.e, this.f119304b, this.f119305c);
            case 1:
                vc.s.h(this.f119304b, BaseScreen.class);
                vc.s.h(this.f119305c, DirectDebitAccountSelectionScreenContract$InputData.class);
                return new o((jm4.a3) this.d, (jm4.a4) this.e, this.f119304b, this.f119305c);
            default:
                vc.s.h(this.f119304b, BaseScreen.class);
                vc.s.h(this.f119305c, DirectDebitAccountSelectionScreenContract$InputData.class);
                return new o((u45.h) this.d, (u45.p) this.e, this.f119304b, this.f119305c);
        }
    }
}
