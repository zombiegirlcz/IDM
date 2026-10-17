package fhk;

import ehk.g;
import ehk.j;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylk.a f135258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f135259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f135260c;

    public a(ylk.a statusDialogConfigProvider, t pricingPlanInteractor, j planDurableTermsPendingStateResolver) {
        Intrinsics.checkNotNullParameter(statusDialogConfigProvider, "statusDialogConfigProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planDurableTermsPendingStateResolver, "planDurableTermsPendingStateResolver");
        this.f135258a = statusDialogConfigProvider;
        this.f135259b = pricingPlanInteractor;
        this.f135260c = planDurableTermsPendingStateResolver;
    }

    public final g a() {
        return new g(this.f135258a, this.f135259b, this.f135260c);
    }
}
