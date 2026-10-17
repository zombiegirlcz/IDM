package p7c;

import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 implements xdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f233651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InsufficientFundsOptionsContract$InputData f233652c;

    public n0(r rVar) {
        this.f233650a = rVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233651b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233651b, ViewController.class);
        vc.s.h(this.f233652c, InsufficientFundsOptionsContract$InputData.class);
        return new o0(this.f233650a, this.f233652c);
    }

    @Override // xdc.a
    public final xdc.a p0(InsufficientFundsOptionsContract$InputData insufficientFundsOptionsContract$InputData) {
        insufficientFundsOptionsContract$InputData.getClass();
        this.f233652c = insufficientFundsOptionsContract$InputData;
        return this;
    }
}
