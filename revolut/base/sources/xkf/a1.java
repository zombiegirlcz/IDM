package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f306673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tnb.g0 f306674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jlf.f f306675c;

    public a1(klf.h0 commonDataSource, tnb.g0 paymentBreakdownContentProvider, jlf.f paymentBreakdownClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(paymentBreakdownContentProvider, "paymentBreakdownContentProvider");
        Intrinsics.checkNotNullParameter(paymentBreakdownClickHandler, "paymentBreakdownClickHandler");
        this.f306673a = commonDataSource;
        this.f306674b = paymentBreakdownContentProvider;
        this.f306675c = paymentBreakdownClickHandler;
    }

    public final cmf.p a() {
        return new cmf.p(new wyd.f(this.f306673a.d(), this, 8), new c(7), zhm.u.c(this.f306675c), "PaymentBreakdown");
    }
}
