package kr9;

import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f188781c;
    public GroupDetailsBillScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o(l lVar, Object obj2, int i) {
        this.f188779a = i;
        this.f188780b = lVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f188779a) {
            case 0:
                this.f188781c = baseScreen;
                break;
            default:
                this.f188781c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f188779a) {
            case 0:
                vc.s.h(this.f188781c, BaseScreen.class);
                vc.s.h(this.d, GroupDetailsBillScreenContract$InputData.class);
                return new p(this.f188780b, (g) this.e, this.f188781c, this.d);
            default:
                vc.s.h(this.f188781c, BaseScreen.class);
                vc.s.h(this.d, GroupDetailsBillScreenContract$InputData.class);
                return new p(this.f188780b, (a) this.e, this.f188781c, this.d);
        }
    }
}
