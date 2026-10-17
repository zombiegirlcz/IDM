package a3e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3e.f f1100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3e.b f1101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3e.l f1102c;
    public final e3e.d d;
    public final e3e.o e;

    public b(e3e.f heroCarouselMapper, e3e.b brandsGridMapper, e3e.m nearbyWidgetStateMapper, e3e.l nearbyWidgetListItemMapper, e3e.d discoverMoreMapper, e3e.o regularCarouselMapper) {
        Intrinsics.checkNotNullParameter(heroCarouselMapper, "heroCarouselMapper");
        Intrinsics.checkNotNullParameter(brandsGridMapper, "brandsGridMapper");
        Intrinsics.checkNotNullParameter(nearbyWidgetStateMapper, "nearbyWidgetStateMapper");
        Intrinsics.checkNotNullParameter(nearbyWidgetListItemMapper, "nearbyWidgetListItemMapper");
        Intrinsics.checkNotNullParameter(discoverMoreMapper, "discoverMoreMapper");
        Intrinsics.checkNotNullParameter(regularCarouselMapper, "regularCarouselMapper");
        this.f1100a = heroCarouselMapper;
        this.f1101b = brandsGridMapper;
        this.f1102c = nearbyWidgetListItemMapper;
        this.d = discoverMoreMapper;
        this.e = regularCarouselMapper;
    }
}
