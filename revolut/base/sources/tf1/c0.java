package tf1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 implements of1.b {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f270149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jt0.b f270150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final os2.g f270151c;
    public final of1.a d;

    public c0(s addNewProductItemsProvider, a addNewProductBannerItemsProvider, jt0.b widgetStateInteractor, os2.g trackRecommendedProductsInteractor, of1.a addNewProductFeatureAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(addNewProductItemsProvider, "addNewProductItemsProvider");
        Intrinsics.checkNotNullParameter(addNewProductBannerItemsProvider, "addNewProductBannerItemsProvider");
        Intrinsics.checkNotNullParameter(widgetStateInteractor, "widgetStateInteractor");
        Intrinsics.checkNotNullParameter(trackRecommendedProductsInteractor, "trackRecommendedProductsInteractor");
        Intrinsics.checkNotNullParameter(addNewProductFeatureAvailabilityProvider, "addNewProductFeatureAvailabilityProvider");
        this.f270149a = addNewProductItemsProvider;
        this.f270150b = widgetStateInteractor;
        this.f270151c = trackRecommendedProductsInteractor;
        this.d = addNewProductFeatureAvailabilityProvider;
    }
}
