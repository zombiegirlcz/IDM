package jfb;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f173786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j75.i f173787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f173788c;

    public c(Handler uiHandler, j75.i onPerfTiming, b0 onFcpTiming) {
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(onPerfTiming, "onPerfTiming");
        Intrinsics.checkNotNullParameter(onFcpTiming, "onFcpTiming");
        this.f173786a = uiHandler;
        this.f173787b = onPerfTiming;
        this.f173788c = onFcpTiming;
    }

    @JavascriptInterface
    public final void postFcp(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f173786a.post(new a(json, this, 0));
    }

    @JavascriptInterface
    public final void postTimingFull(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f173786a.post(new a(json, this, 1));
    }
}
