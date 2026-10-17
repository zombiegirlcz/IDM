package tu9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru9.m;
import ru9.r;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f274537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f274538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f274539c;
    public final yik.h d;

    public c(m paymentBubbleFactory, ru9.b commonBubbleElementsMapper, h planReferralTagDataMapper, f planReferralButtonsMapper, r pricingPlanBubbleStyleMapper, yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(planReferralTagDataMapper, "planReferralTagDataMapper");
        Intrinsics.checkNotNullParameter(planReferralButtonsMapper, "planReferralButtonsMapper");
        Intrinsics.checkNotNullParameter(pricingPlanBubbleStyleMapper, "pricingPlanBubbleStyleMapper");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f274537a = paymentBubbleFactory;
        this.f274538b = planReferralTagDataMapper;
        this.f274539c = planReferralButtonsMapper;
        this.d = pricingPlanStringMapper;
    }
}
