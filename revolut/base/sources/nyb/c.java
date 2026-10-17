package nyb;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxb.e f220777a;

    public c(kxb.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f220777a = repository;
    }

    public final efm.r a(hha.d pricingPlan, boolean z) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        kxb.e eVar = this.f220777a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return eVar.d.f(pricingPlan, z);
    }

    public final efm.r b(hha.d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        kxb.e eVar = this.f220777a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(eVar.e.e(Unit.f186387a, loadingStrategy), new clk.a(plan, 17));
    }
}
