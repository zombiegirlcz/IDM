package oh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f225269a;

    public c(a firebaseAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsProvider, "firebaseAnalyticsProvider");
        this.f225269a = firebaseAnalyticsProvider;
    }
}
