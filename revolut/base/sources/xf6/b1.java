package xf6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304797c;
    public ReviewAccountLinkingDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ b1(t tVar, Object obj2, int i) {
        this.f304795a = i;
        this.f304796b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304795a) {
            case 0:
                this.f304797c = viewController;
                break;
            default:
                this.f304797c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304795a) {
            case 0:
                vc.s.h(this.f304797c, ViewController.class);
                vc.s.h(this.d, ReviewAccountLinkingDetailsScreenContract$InputData.class);
                return new c1(this.f304796b, (d0) this.e, this.d);
            default:
                vc.s.h(this.f304797c, ViewController.class);
                vc.s.h(this.d, ReviewAccountLinkingDetailsScreenContract$InputData.class);
                return new c1(this.f304796b, (z) this.e, this.d);
        }
    }
}
