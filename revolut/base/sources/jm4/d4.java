package jm4;

import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class d4 implements as4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f176042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InstalmentDetailsScreenContract$InputData f176043c;

    public d4(a3 a3Var) {
        this.f176041a = a3Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f176042b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f176042b, ViewController.class);
        vc.s.h(this.f176043c, InstalmentDetailsScreenContract$InputData.class);
        return new c4(this.f176041a, this.f176043c);
    }

    @Override // as4.a
    public final as4.a y(InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData) {
        instalmentDetailsScreenContract$InputData.getClass();
        this.f176043c = instalmentDetailsScreenContract$InputData;
        return this;
    }
}
