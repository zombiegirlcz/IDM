package epg;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements m {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f128178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f128179b;

    public f(b underlineTextDelegate, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(underlineTextDelegate, "underlineTextDelegate");
        this.f128178a = underlineTextDelegate;
        this.f128179b = yhm.j.b(new bp0.k(languageProvider, 2));
    }
}
