package jfb;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f173791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f173792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f173793c;
    public final c0 d;
    public final d0 e;

    public c1(Handler uiHandler, c0 onClose, d0 didInit, c0 didSessionExpire, d0 didInitPayment) {
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(didInit, "didInit");
        Intrinsics.checkNotNullParameter(didSessionExpire, "didSessionExpire");
        Intrinsics.checkNotNullParameter(didInitPayment, "didInitPayment");
        this.f173791a = uiHandler;
        this.f173792b = onClose;
        this.f173793c = didInit;
        this.d = didSessionExpire;
        this.e = didInitPayment;
    }

    @JavascriptInterface
    public final boolean closeApp(@NotNull String arg2) {
        Intrinsics.checkNotNullParameter(arg2, "arg");
        return this.f173791a.post(new a1(this, 0));
    }

    @JavascriptInterface
    public final boolean didInit(@NotNull String arg2) {
        Intrinsics.checkNotNullParameter(arg2, "arg");
        return this.f173791a.post(new z0(this, arg2, 0));
    }

    @JavascriptInterface
    public final boolean didInitPayment(@NotNull String universalLink) {
        Intrinsics.checkNotNullParameter(universalLink, "universalLink");
        return this.f173791a.post(new z0(this, universalLink, 1));
    }

    @JavascriptInterface
    public final boolean didSessionExpire(@NotNull String arg2) {
        Intrinsics.checkNotNullParameter(arg2, "arg");
        return this.f173791a.post(new a1(this, 1));
    }
}
