package qod;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import au0.n4;
import kotlin.jvm.internal.Intrinsics;
import om4.m1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f248161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok7.c f248162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f248163c;
    public final ol6.b d;

    public e(Handler uiHandler, ok7.c onLoad, m1 onCountrySelection, ol6.b onError) {
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        Intrinsics.checkNotNullParameter(onCountrySelection, "onCountrySelection");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f248161a = uiHandler;
        this.f248162b = onLoad;
        this.f248163c = onCountrySelection;
        this.d = onError;
    }

    @JavascriptInterface
    public final boolean onCountrySelected(String str) {
        return this.f248161a.post(new p6.e(this, str, 8));
    }

    @JavascriptInterface
    public final boolean onErrorCaught(@NotNull String error, @NotNull String context) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f248161a.post(new b0.d(this, 21, error, context));
    }

    @JavascriptInterface
    public final boolean onGlobeReady(boolean z) {
        return this.f248161a.post(new n4(this, z, 7));
    }
}
