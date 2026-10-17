package zx8;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yx8.a f326091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f326092b;

    public a(yx8.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f326091a = model;
        ConsoleMessage.MessageLevel[] elements = {ConsoleMessage.MessageLevel.WARNING, ConsoleMessage.MessageLevel.ERROR};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f326092b = d.y0(elements);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null && this.f326092b.contains(consoleMessage.messageLevel())) {
            this.f326091a.b3("Message: " + consoleMessage.message());
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (str == null || callback == null) {
            return;
        }
        this.f326091a.e3(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f326091a.f3(request);
    }
}
