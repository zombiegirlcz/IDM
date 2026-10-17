package dme;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme.c f116110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cme.e f116111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gme.b f116112c;
    public final bme.c d;

    public d(eme.c lifestyleHomeFeedActionListMapper, cme.e lifestyleHomeFeedCollectionProductsListMapper, gme.b lifestyleHomeMultipleDealsWidgetMapper, bme.c lifestyleHomeBrandGridCarouselMapper) {
        Intrinsics.checkNotNullParameter(lifestyleHomeFeedActionListMapper, "lifestyleHomeFeedActionListMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeFeedCollectionProductsListMapper, "lifestyleHomeFeedCollectionProductsListMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeMultipleDealsWidgetMapper, "lifestyleHomeMultipleDealsWidgetMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeBrandGridCarouselMapper, "lifestyleHomeBrandGridCarouselMapper");
        this.f116110a = lifestyleHomeFeedActionListMapper;
        this.f116111b = lifestyleHomeFeedCollectionProductsListMapper;
        this.f116112c = lifestyleHomeMultipleDealsWidgetMapper;
        this.d = lifestyleHomeBrandGridCarouselMapper;
    }
}
