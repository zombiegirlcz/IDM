package hag;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f150503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f150504b;

    public c(l80.e dateProvider, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f150503a = phoneToolsProvider;
        this.f150504b = dateProvider;
    }
}
