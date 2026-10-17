package ljl;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheetContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class b1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f195888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f195889c;
    public AccountsToApplyChangesBottomSheetContract$InputData d;
    public final Object e;

    public /* synthetic */ b1(q0 q0Var, Object obj2, int i) {
        this.f195887a = i;
        this.f195888b = q0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f195887a) {
            case 0:
                this.f195889c = viewController;
                break;
            default:
                this.f195889c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f195887a) {
            case 0:
                vc.s.h(this.f195889c, ViewController.class);
                vc.s.h(this.d, AccountsToApplyChangesBottomSheetContract$InputData.class);
                return new c1(this.f195888b, (h) this.e, this.d);
            default:
                vc.s.h(this.f195889c, ViewController.class);
                vc.s.h(this.d, AccountsToApplyChangesBottomSheetContract$InputData.class);
                return new c1(this.f195888b, (f) this.e, this.d);
        }
    }
}
