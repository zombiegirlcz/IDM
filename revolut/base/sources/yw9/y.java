package yw9;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements f {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epg.b f317388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f317389b;

    public y(epg.b underlineTextDelegate, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(underlineTextDelegate, "underlineTextDelegate");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f317388a = underlineTextDelegate;
        this.f317389b = yhm.j.b(new bp0.k(languageProvider, 5));
    }
}
