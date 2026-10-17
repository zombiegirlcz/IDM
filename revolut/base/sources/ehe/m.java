package ehe;

import cie.f0;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f126086c;
    public TabAccountsScreenContract$InputData d;
    public d5a.a e;
    public ash.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f126087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hhe.d f126088h;

    public /* synthetic */ m(c cVar, hhe.d dVar, int i) {
        this.f126084a = i;
        this.f126085b = cVar;
        this.f126088h = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f126084a) {
            case 0:
                this.f126086c = viewController;
                break;
            default:
                this.f126086c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f126084a) {
            case 0:
                vc.s.h(this.f126086c, ViewController.class);
                vc.s.h(this.d, TabAccountsScreenContract$InputData.class);
                vc.s.h(this.e, mkd.g.class);
                vc.s.h(this.f, ash.j.class);
                vc.s.h(this.f126087g, f0.class);
                return new p(this.f126085b, (a) this.f126088h, new fc7.i(), this.f126086c, this.d, this.e, this.f, this.f126087g);
            default:
                vc.s.h(this.f126086c, ViewController.class);
                vc.s.h(this.d, TabAccountsScreenContract$InputData.class);
                vc.s.h(this.e, mkd.g.class);
                vc.s.h(this.f, ash.j.class);
                vc.s.h(this.f126087g, f0.class);
                return new q(this.f126085b, (b) this.f126088h, new fc7.i(), this.f126086c, this.d, this.e, this.f, this.f126087g);
        }
    }
}
