package kr9;

import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f188790c;
    public GroupDetailsSettlementScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ q(l lVar, Object obj2, int i) {
        this.f188788a = i;
        this.f188789b = lVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f188788a) {
            case 0:
                this.f188790c = baseScreen;
                break;
            default:
                this.f188790c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f188788a) {
            case 0:
                vc.s.h(this.f188790c, BaseScreen.class);
                vc.s.h(this.d, GroupDetailsSettlementScreenContract$InputData.class);
                return new r(this.f188789b, (g) this.e, this.d);
            default:
                vc.s.h(this.f188790c, BaseScreen.class);
                vc.s.h(this.d, GroupDetailsSettlementScreenContract$InputData.class);
                return new r(this.f188789b, (a) this.e, this.d);
        }
    }
}
