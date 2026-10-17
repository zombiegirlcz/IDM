package ehe;

import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f126040c;
    public RemoveAccountContract$InputData d;
    public final hhe.d e;

    public /* synthetic */ g(c cVar, hhe.d dVar, int i) {
        this.f126038a = i;
        this.f126039b = cVar;
        this.e = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f126038a) {
            case 0:
                this.f126040c = viewController;
                break;
            default:
                this.f126040c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f126038a) {
            case 0:
                vc.s.h(this.f126040c, ViewController.class);
                vc.s.h(this.d, RemoveAccountContract$InputData.class);
                return new h(this.f126039b, (a) this.e, this.d);
            default:
                vc.s.h(this.f126040c, ViewController.class);
                vc.s.h(this.d, RemoveAccountContract$InputData.class);
                return new i(this.f126039b, (b) this.e, this.d);
        }
    }
}
