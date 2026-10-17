package c43;

import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f21064c;
    public LinkCardDetailsReviewScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ n(h hVar, Object obj2, int i) {
        this.f21062a = i;
        this.f21063b = hVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f21062a) {
            case 0:
                this.f21064c = viewController;
                break;
            default:
                this.f21064c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f21062a) {
            case 0:
                s.h(this.f21064c, ViewController.class);
                s.h(this.d, LinkCardDetailsReviewScreenContract$InputData.class);
                return new o(this.f21063b, (l) this.e, this.f21064c, this.d);
            default:
                s.h(this.f21064c, ViewController.class);
                s.h(this.d, LinkCardDetailsReviewScreenContract$InputData.class);
                return new o(this.f21063b, (j) this.e, this.f21064c, this.d);
        }
    }
}
