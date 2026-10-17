package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class p8 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f119538c;
    public CreditLinkedAccountsV2ListScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ p8(c1 c1Var, Object obj2, int i) {
        this.f119536a = i;
        this.f119537b = c1Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f119536a) {
            case 0:
                this.f119538c = baseScreen;
                break;
            default:
                this.f119538c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f119536a) {
            case 0:
                vc.s.h(this.f119538c, BaseScreen.class);
                vc.s.h(this.d, CreditLinkedAccountsV2ListScreenContract$InputData.class);
                return new r8(this.f119537b, (m1) this.e, this.f119538c, this.d);
            default:
                vc.s.h(this.f119538c, BaseScreen.class);
                vc.s.h(this.d, CreditLinkedAccountsV2ListScreenContract$InputData.class);
                return new r8(this.f119537b, (l1) this.e, this.f119538c, this.d);
        }
    }
}
