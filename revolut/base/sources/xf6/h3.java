package xf6;

import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304881c;
    public RevokeConsentBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ h3(w2 w2Var, Object obj2, int i) {
        this.f304879a = i;
        this.f304880b = w2Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304879a) {
            case 0:
                this.f304881c = viewController;
                break;
            default:
                this.f304881c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304879a) {
            case 0:
                vc.s.h(this.f304881c, ViewController.class);
                vc.s.h(this.d, RevokeConsentBottomSheetScreenContract$InputData.class);
                return new i3(this.f304880b, (a3) this.e, this.d);
            default:
                vc.s.h(this.f304881c, ViewController.class);
                vc.s.h(this.d, RevokeConsentBottomSheetScreenContract$InputData.class);
                return new i3(this.f304880b, (x2) this.e, this.d);
        }
    }
}
