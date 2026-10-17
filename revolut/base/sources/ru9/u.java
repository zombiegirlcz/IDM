package ru9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f257500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f257501b;

    public u(m paymentBubbleFactory, b commonBubbleElementsMapper, x pricingPlanGiftImageMapper, z pricingPlanGiftTagDataMapper, w pricingPlanGiftButtonsMapper, r pricingPlanBubbleStyleMapper) {
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(pricingPlanGiftImageMapper, "pricingPlanGiftImageMapper");
        Intrinsics.checkNotNullParameter(pricingPlanGiftTagDataMapper, "pricingPlanGiftTagDataMapper");
        Intrinsics.checkNotNullParameter(pricingPlanGiftButtonsMapper, "pricingPlanGiftButtonsMapper");
        Intrinsics.checkNotNullParameter(pricingPlanBubbleStyleMapper, "pricingPlanBubbleStyleMapper");
        this.f257500a = paymentBubbleFactory;
        this.f257501b = pricingPlanGiftTagDataMapper;
    }
}
