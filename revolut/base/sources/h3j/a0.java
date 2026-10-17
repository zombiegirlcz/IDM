package h3j;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6k.c f149138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.a f149139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3j.h f149140c;
    public final qd0.b d;
    public final r2a.b e;
    public final whf.n f;

    public a0(b6k.c analyticsItemMapper, yof.a recipientTrustMapper, m3j.h accountFieldsMapper, qd0.b languageProvider, r2a.b wallpaperSettingsMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(analyticsItemMapper, "analyticsItemMapper");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(accountFieldsMapper, "accountFieldsMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f149138a = analyticsItemMapper;
        this.f149139b = recipientTrustMapper;
        this.f149140c = accountFieldsMapper;
        this.d = languageProvider;
        this.e = wallpaperSettingsMapper;
        this.f = transactionsListMapper;
    }
}
