package mc4;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import az0.m1;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f204274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3.a f204275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc4.c f204276c;
    public final yc4.c d;
    public final yc4.b e;
    public final j1 f;

    public g(Handler uiHandler, b3.a onSuccessEvent, yc4.c onErrorEvent, yc4.c onUnsupportedTargetEvent, yc4.b onStartedEvent) {
        m3g.c onInitializedEvent = new m3g.c(20);
        m3g.c onRedirectEvent = new m3g.c(21);
        m3g.c onResetEvent = new m3g.c(22);
        m3g.c onConsentsGivenEvent = new m3g.c(23);
        j1 onTargetSelectedEvent = new j1(10);
        m3g.c onCredentialEnteredEvent = new m3g.c(19);
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(onSuccessEvent, "onSuccessEvent");
        Intrinsics.checkNotNullParameter(onErrorEvent, "onErrorEvent");
        Intrinsics.checkNotNullParameter(onUnsupportedTargetEvent, "onUnsupportedTargetEvent");
        Intrinsics.checkNotNullParameter(onInitializedEvent, "onInitializedEvent");
        Intrinsics.checkNotNullParameter(onStartedEvent, "onStartedEvent");
        Intrinsics.checkNotNullParameter(onRedirectEvent, "onRedirectEvent");
        Intrinsics.checkNotNullParameter(onResetEvent, "onResetEvent");
        Intrinsics.checkNotNullParameter(onConsentsGivenEvent, "onConsentsGivenEvent");
        Intrinsics.checkNotNullParameter(onTargetSelectedEvent, "onTargetSelectedEvent");
        Intrinsics.checkNotNullParameter(onCredentialEnteredEvent, "onCredentialEnteredEvent");
        this.f204274a = uiHandler;
        this.f204275b = onSuccessEvent;
        this.f204276c = onErrorEvent;
        this.d = onUnsupportedTargetEvent;
        this.e = onStartedEvent;
        this.f = onTargetSelectedEvent;
    }

    @JavascriptInterface
    public final boolean onConsentsGiven() {
        return this.f204274a.post(new androidx.compose.ui.platform.b(this, 5));
    }

    @JavascriptInterface
    public final boolean onCredentialEntered() {
        return this.f204274a.post(new androidx.compose.ui.platform.b(this, 6));
    }

    @JavascriptInterface
    public final boolean onError(@NotNull String exception, @NotNull String optionsJson) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(optionsJson, "optionsJson");
        return this.f204274a.post(new e(this, exception, optionsJson, 1));
    }

    @JavascriptInterface
    public final boolean onInitialized() {
        return this.f204274a.post(new androidx.compose.ui.platform.b(this, 4));
    }

    @JavascriptInterface
    public final boolean onRedirect() {
        return this.f204274a.post(new androidx.compose.ui.platform.b(this, 8));
    }

    @JavascriptInterface
    public final boolean onReset() {
        return this.f204274a.post(new androidx.compose.ui.platform.b(this, 7));
    }

    @JavascriptInterface
    public final boolean onStarted() {
        return this.f204274a.post(new kt0.d(this, 9));
    }

    @JavascriptInterface
    public final boolean onSuccess(@NotNull String target, @NotNull String sessionId, @NotNull String sessionIdSignature, @NotNull String optionsJson) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sessionIdSignature, "sessionIdSignature");
        Intrinsics.checkNotNullParameter(optionsJson, "optionsJson");
        return this.f204274a.post(new m1(this, target, sessionId, sessionIdSignature, optionsJson, 1));
    }

    @JavascriptInterface
    public final boolean onTargetSelected(@NotNull String name, @NotNull String officialName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(officialName, "officialName");
        return this.f204274a.post(new e(this, name, officialName, 0));
    }

    @JavascriptInterface
    public final boolean onUnsupportedTarget(@NotNull String target, @NotNull String country, @NotNull String address) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(address, "address");
        return this.f204274a.post(new b0.e(this, target, country, address, 4));
    }
}
