package jfb;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.c2;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends l1 {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffb.d f173826c;
    public final c0 d;
    public final iyi.j e;
    public final zkm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f173827g;

    public o(ffb.d locationManager, iyi.j ensurePermission, String webAppUrl, c0 isScreenVisible) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(isScreenVisible, "isScreenVisible");
        Intrinsics.checkNotNullParameter(ensurePermission, "ensurePermission");
        this.f173825b = webAppUrl;
        this.f173826c = locationManager;
        this.d = isScreenVisible;
        this.e = ensurePermission;
        c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        this.f = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a.e));
        this.f173827g = "getUserLocation";
    }

    @Override // jfb.l1
    public final Set a(Uri origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zhm.y0.b(origin.getScheme() + "://" + origin.getHost());
    }

    @Override // jfb.l1
    public final String b() {
        return this.f173827g;
    }

    @Override // jfb.l1
    public final String c() {
        return this.f173825b;
    }

    @Override // jfb.l1
    public final void e(WebView view, WebMessageCompat message, Uri sourceOrigin, boolean z, JavaScriptReplyProxy replyProxy) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
        String host = Uri.parse(this.f173825b).getHost();
        if (host == null) {
            return;
        }
        c0 c0Var = this.d;
        skm.e0.C(this.f, null, null, new a9j.o(new f(this.f173826c, this.e, host, c0Var), sourceOrigin, z, replyProxy, view, (Continuation) null), 3);
    }

    @Override // jfb.l1
    public final void f(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        super.f(webView);
        skm.e0.k(this.f, null);
    }
}
