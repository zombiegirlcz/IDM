package vrl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f291690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f291691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.d f291692c;

    public y0(u0 ordersInteractor, g investOrdersInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(ordersInteractor, "ordersInteractor");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f291690a = ordersInteractor;
        this.f291691b = investOrdersInteractor;
        this.f291692c = portfolioInteractor;
    }

    public final ufm.i a(String portfolioId, k4l.z orderRequest) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        ufm.i iVar = new ufm.i(new ufm.i(this.f291690a.b(portfolioId, orderRequest), new v0(0, new n(this, orderRequest, 3)), 0), new v0(1, new n(this, portfolioId, 4)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
