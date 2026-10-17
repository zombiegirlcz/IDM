package hyl;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import au0.n4;
import ip0.yc0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f156914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc0 f156915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iyl.a f156916c;
    public final iyl.a d;
    public final in1.a e;

    public h(Handler uiHandler, yc0 onLoad, iyl.a onCountrySelection, iyl.a onMarkerLabelSelection, in1.a onError) {
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        Intrinsics.checkNotNullParameter(onCountrySelection, "onCountrySelection");
        Intrinsics.checkNotNullParameter(onMarkerLabelSelection, "onMarkerLabelSelection");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f156914a = uiHandler;
        this.f156915b = onLoad;
        this.f156916c = onCountrySelection;
        this.d = onMarkerLabelSelection;
        this.e = onError;
    }

    @JavascriptInterface
    public final boolean onCountrySelected(String str) {
        return this.f156914a.post(new g(this, str, 0));
    }

    @JavascriptInterface
    public final boolean onErrorCaught(@NotNull String error, @NotNull String context) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f156914a.post(new b0.d(this, 8, error, context));
    }

    @JavascriptInterface
    public final boolean onGlobeReady(boolean z) {
        return this.f156914a.post(new n4(this, z, 2));
    }

    @JavascriptInterface
    public final boolean onMarkerLabelSelected(@NotNull String labelData) {
        Intrinsics.checkNotNullParameter(labelData, "labelData");
        return this.f156914a.post(new g(this, labelData, 1));
    }
}
