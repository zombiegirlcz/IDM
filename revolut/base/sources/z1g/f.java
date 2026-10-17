package z1g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f318794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f318795b;

    public f(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f318794a = regexMatcher;
        this.f318795b = phoneToolsProvider;
    }
}
