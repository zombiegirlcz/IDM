package iq5;

import ik5.d;
import kotlin.jvm.internal.Intrinsics;
import op5.e;
import org.jetbrains.annotations.NotNull;
import whf.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f167802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6k.c f167803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2a.b f167804c;

    public c(d cryptoAddressTypeUiMapper, n transactionsListMapper, e recipientDetailsTitleResolver, b6k.c analyticsItemMapper, r2a.b wallpaperSettingsMapper) {
        Intrinsics.checkNotNullParameter(cryptoAddressTypeUiMapper, "cryptoAddressTypeUiMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(recipientDetailsTitleResolver, "recipientDetailsTitleResolver");
        Intrinsics.checkNotNullParameter(analyticsItemMapper, "analyticsItemMapper");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        this.f167802a = transactionsListMapper;
        this.f167803b = analyticsItemMapper;
        this.f167804c = wallpaperSettingsMapper;
    }
}
