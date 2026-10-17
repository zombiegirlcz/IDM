package i9g;

import fag.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements p8g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f159830b;

    public p(t0 travelHotelsRepository, ffk.t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f159829a = travelHotelsRepository;
        this.f159830b = pricingPlanInteractor;
    }
}
