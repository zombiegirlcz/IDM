package oja;

import com.revolut.feature.product.onboarding.data.ProductOnboardingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductOnboardingService f225751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pja.a f225752b;

    public a(ProductOnboardingService productOnboardingService, pja.a productOnboardingMapper) {
        Intrinsics.checkNotNullParameter(productOnboardingService, "productOnboardingService");
        Intrinsics.checkNotNullParameter(productOnboardingMapper, "productOnboardingMapper");
        this.f225751a = productOnboardingService;
        this.f225752b = productOnboardingMapper;
    }
}
