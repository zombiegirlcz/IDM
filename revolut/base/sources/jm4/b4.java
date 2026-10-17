package jm4;

import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class b4 implements as4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f176009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176010c;
    public InstalmentDetailsScreenContract$InputData d;

    public b4(a3 a3Var, t1 t1Var) {
        this.f176008a = a3Var;
        this.f176009b = t1Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f176010c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f176010c, ViewController.class);
        vc.s.h(this.d, InstalmentDetailsScreenContract$InputData.class);
        return new c4(this.f176008a, this.f176009b, this.d);
    }

    @Override // as4.a
    public final as4.a y(InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData) {
        instalmentDetailsScreenContract$InputData.getClass();
        this.d = instalmentDetailsScreenContract$InputData;
        return this;
    }
}
