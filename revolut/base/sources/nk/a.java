package nk;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk.c f216605a;

    public a(rk.c onJsonReceived) {
        Intrinsics.checkNotNullParameter(onJsonReceived, "onJsonReceived");
        this.f216605a = onJsonReceived;
    }

    @JavascriptInterface
    public final void sendNativeMessage(@NotNull String payloadJson) {
        Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
        this.f216605a.invoke(payloadJson);
    }
}
