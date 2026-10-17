package xb2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f303970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f303971b;

    public b(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f303970a = regexMatcher;
        this.f303971b = phoneToolsProvider;
    }
}
