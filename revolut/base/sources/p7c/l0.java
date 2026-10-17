package p7c;

import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 implements xdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f233640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233641c;
    public InsufficientFundsOptionsContract$InputData d;

    public l0(r rVar, j jVar) {
        this.f233639a = rVar;
        this.f233640b = jVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233641c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233641c, ViewController.class);
        vc.s.h(this.d, InsufficientFundsOptionsContract$InputData.class);
        return new m0(this.f233639a, this.f233640b, this.d);
    }

    @Override // xdc.a
    public final xdc.a p0(InsufficientFundsOptionsContract$InputData insufficientFundsOptionsContract$InputData) {
        insufficientFundsOptionsContract$InputData.getClass();
        this.d = insufficientFundsOptionsContract$InputData;
        return this;
    }
}
