package b42;

import kotlin.jvm.internal.Intrinsics;
import m3j.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6k.c f12154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.a f12155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f12156c;
    public final d d;
    public final r2a.b e;
    public final hp.b f;

    public b(b6k.c analyticsItemMapper, yof.a recipientTrustMapper, h accountFieldsMapper, d transactionMapper, r2a.b wallpaperSettingsMapper, hp.b cnpjValidator) {
        Intrinsics.checkNotNullParameter(analyticsItemMapper, "analyticsItemMapper");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(accountFieldsMapper, "accountFieldsMapper");
        Intrinsics.checkNotNullParameter(transactionMapper, "transactionMapper");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        Intrinsics.checkNotNullParameter(cnpjValidator, "cnpjValidator");
        this.f12154a = analyticsItemMapper;
        this.f12155b = recipientTrustMapper;
        this.f12156c = accountFieldsMapper;
        this.d = transactionMapper;
        this.e = wallpaperSettingsMapper;
        this.f = cnpjValidator;
    }
}
