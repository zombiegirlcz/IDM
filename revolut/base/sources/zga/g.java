package zga;

import com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.PricingPlanContextualUpsellService;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final b Companion = new b();
    public static final IntRange d = new IntRange(400, 499, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanContextualUpsellService f322099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f322100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f322101c;

    public g(PricingPlanContextualUpsellService service, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f322099a = service;
        this.f322100b = memoryCache;
        this.f322101c = yhm.j.b(new yq0.e(this, 28));
    }
}
