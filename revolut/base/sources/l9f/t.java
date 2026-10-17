package l9f;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f193224c;
    public AccountInformationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ t(k kVar, Object obj2, int i) {
        this.f193222a = i;
        this.f193223b = kVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f193222a) {
            case 0:
                this.f193224c = viewController;
                break;
            default:
                this.f193224c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f193222a) {
            case 0:
                vc.s.h(this.f193224c, ViewController.class);
                vc.s.h(this.d, AccountInformationScreenContract$InputData.class);
                return new u(this.f193223b, (o) this.e, this.d);
            default:
                vc.s.h(this.f193224c, ViewController.class);
                vc.s.h(this.d, AccountInformationScreenContract$InputData.class);
                return new u(this.f193223b, (i) this.e, this.d);
        }
    }
}
