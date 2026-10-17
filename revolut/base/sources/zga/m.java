package zga;

import com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.PricingPlanContextualUpsellService;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    @NotNull
    public static final h Companion = new h();
    public static final IntRange d = new IntRange(400, 499, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanContextualUpsellService f322104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f322105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f322106c;

    public m(PricingPlanContextualUpsellService service, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f322104a = service;
        this.f322105b = memoryCache;
        this.f322106c = yhm.j.b(new yq0.e(this, 29));
    }
}
