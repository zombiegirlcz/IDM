package gsa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import whf.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6k.c f146350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f146351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yof.a f146352c;
    public final r2a.b d;
    public final n e;

    public c(b6k.c analyticsItemMapper, n8b.a countryInteractor, yof.a recipientTrustMapper, r2a.b wallpaperSettingsMapper, n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(analyticsItemMapper, "analyticsItemMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f146350a = analyticsItemMapper;
        this.f146351b = countryInteractor;
        this.f146352c = recipientTrustMapper;
        this.d = wallpaperSettingsMapper;
        this.e = transactionsListMapper;
    }
}
