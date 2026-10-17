package q50;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements l {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih0.b f242245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f242246b;

    public n(ih0.b remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.f242245a = remoteConfig;
        this.f242246b = yhm.j.b(new pyc.a(this, 16));
    }
}
