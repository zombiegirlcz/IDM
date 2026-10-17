package sh4;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5g.f0;
import qh4.o;
import qh4.p;
import sdl.y;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f263427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f263428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f263429c;
    public final f0 d;
    public final se0.a e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f263430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f263431h;
    public final p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f263432j;

    public f(Handler uiHandler, o onInit, p onClose, f0 onLoginSuccess, o onAnalytics, o onFetchLoading, o onFetchError, p onSessionExpired, p onBack) {
        y onConnectStarted = new y(15);
        y onLoginStarted = new y(16);
        se0.a onSuccess = new se0.a(25);
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(onInit, "onInit");
        Intrinsics.checkNotNullParameter(onConnectStarted, "onConnectStarted");
        Intrinsics.checkNotNullParameter(onLoginStarted, "onLoginStarted");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onLoginSuccess, "onLoginSuccess");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onAnalytics, "onAnalytics");
        Intrinsics.checkNotNullParameter(onFetchLoading, "onFetchLoading");
        Intrinsics.checkNotNullParameter(onFetchError, "onFetchError");
        Intrinsics.checkNotNullParameter(onSessionExpired, "onSessionExpired");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        this.f263427a = uiHandler;
        this.f263428b = onInit;
        this.f263429c = onClose;
        this.d = onLoginSuccess;
        this.e = onSuccess;
        this.f = onAnalytics;
        this.f263430g = onFetchLoading;
        this.f263431h = onFetchError;
        this.i = onSessionExpired;
        this.f263432j = onBack;
    }

    @JavascriptInterface
    public final boolean didAllPlatformsConnected() {
        return this.f263427a.post(new androidx.compose.ui.platform.b(11));
    }

    @JavascriptInterface
    public final boolean didAnalytics(@NotNull String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return this.f263427a.post(new a(payload, this, 1));
    }

    @JavascriptInterface
    public final boolean didBack() {
        return this.f263427a.post(new b(this, 0));
    }

    @JavascriptInterface
    public final boolean didClose() {
        return this.f263427a.post(new b(this, 2));
    }

    @JavascriptInterface
    public final boolean didConnectStarted() {
        return this.f263427a.post(new androidx.compose.ui.platform.b(this, 10));
    }

    @JavascriptInterface
    public final boolean didFetchError(@NotNull String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return this.f263427a.post(new a(payload, this, 3));
    }

    @JavascriptInterface
    public final boolean didFetchLoading(@NotNull String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return this.f263427a.post(new a(payload, this, 2));
    }

    @JavascriptInterface
    public final boolean didInit(@NotNull String screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f263427a.post(new a(screen, this, 5));
    }

    @JavascriptInterface
    public final boolean didLoginStarted() {
        return this.f263427a.post(new androidx.compose.ui.platform.b(this, 12));
    }

    @JavascriptInterface
    public final boolean didLoginSuccess(@NotNull String accountID, @NotNull String datasourceID) {
        Intrinsics.checkNotNullParameter(accountID, "accountID");
        Intrinsics.checkNotNullParameter(datasourceID, "datasourceID");
        return this.f263427a.post(new b0.d(accountID, 24, datasourceID, this));
    }

    @JavascriptInterface
    public final boolean didSessionExpired() {
        return this.f263427a.post(new b(this, 1));
    }

    @JavascriptInterface
    public final boolean didSuccess(@NotNull String userUUID) {
        Intrinsics.checkNotNullParameter(userUUID, "userUUID");
        return this.f263427a.post(new a(userUUID, this, 4));
    }

    @JavascriptInterface
    public final boolean didLoginSuccess(@NotNull String accountID) {
        Intrinsics.checkNotNullParameter(accountID, "accountID");
        return this.f263427a.post(new a(accountID, this, 0));
    }
}
