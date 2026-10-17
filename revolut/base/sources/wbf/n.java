package wbf;

import efm.r;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements kbf.a {

    @NotNull
    public static final m Companion = new m();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f296154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f296155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f296156c;

    static {
        lbf.k[] elements = {lbf.k.ADVANCED_PORTFOLIO_ANALYTICS, lbf.k.DEDICATED_CUSTOMER_SUPPORT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public n(k tradingAddOnListInteractor, j tradingAddOnEnabledListInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingAddOnListInteractor, "tradingAddOnListInteractor");
        Intrinsics.checkNotNullParameter(tradingAddOnEnabledListInteractor, "tradingAddOnEnabledListInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f296154a = tradingAddOnListInteractor;
        this.f296155b = tradingAddOnEnabledListInteractor;
        this.f296156c = featureToggleInteractor;
    }

    public final r b(lbf.f code, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        w4l.f fVar = this.f296154a.f296152a.f253046g;
        Unit unit = Unit.f186387a;
        return pd.b.r(u1.d(fVar.f(unit, true), this.f296155b.f296151a.f253047h.f(unit, true)), new pud.b(this, z, code, 28));
    }
}
