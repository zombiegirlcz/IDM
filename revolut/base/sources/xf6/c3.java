package xf6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.AccessDetailsAuScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304815c;
    public AccessDetailsAuScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ c3(w2 w2Var, Object obj2, int i) {
        this.f304813a = i;
        this.f304814b = w2Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304813a) {
            case 0:
                this.f304815c = viewController;
                break;
            default:
                this.f304815c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304813a) {
            case 0:
                vc.s.h(this.f304815c, ViewController.class);
                vc.s.h(this.d, AccessDetailsAuScreenContract$InputData.class);
                return new d3(this.f304814b, (p2) this.e, this.d);
            default:
                vc.s.h(this.f304815c, ViewController.class);
                vc.s.h(this.d, AccessDetailsAuScreenContract$InputData.class);
                return new d3(this.f304814b, (x2) this.e, this.d);
        }
    }
}
