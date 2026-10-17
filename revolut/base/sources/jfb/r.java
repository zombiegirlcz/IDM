package jfb;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends l1 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173833c;
    public final d0 d;

    public r(String webAppUrl, boolean z, d0 onShowTermsAndConditions) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(onShowTermsAndConditions, "onShowTermsAndConditions");
        this.f173832b = webAppUrl;
        this.f173833c = z;
        this.d = onShowTermsAndConditions;
    }

    @Override // jfb.l1
    public final Set a(Uri origin) {
        List listN0;
        List listW0;
        Intrinsics.checkNotNullParameter(origin, "origin");
        String host = origin.getHost();
        String strK0 = (host == null || (listN0 = kotlin.text.d0.n0(host, new String[]{"."}, 0, 6)) == null || (listW0 = zhm.d0.W0(2, listN0)) == null) ? null : zhm.d0.k0(listW0, ".", null, null, 0, null, 62);
        return zhm.y0.b(origin.getScheme() + "://*." + strK0);
    }

    @Override // jfb.l1
    public final String b() {
        return "showTermsAndConditions";
    }

    @Override // jfb.l1
    public final String c() {
        return this.f173832b;
    }

    @Override // jfb.l1
    public final void e(WebView view, WebMessageCompat message, Uri sourceOrigin, boolean z, JavaScriptReplyProxy replyProxy) {
        Object i1Var;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
        d0 onShowTermsAndConditions = this.d;
        Intrinsics.checkNotNullParameter(onShowTermsAndConditions, "onShowTermsAndConditions");
        String termsScope = message.getData();
        if (termsScope == null) {
            termsScope = "";
        }
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        if (this.f173833c) {
            onShowTermsAndConditions.invoke(termsScope);
            i1Var = h1.f173812a;
        } else {
            i1Var = new i1(j1.UNSUPPORTED);
        }
        if (i1Var instanceof h1) {
            string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            if (!(i1Var instanceof i1)) {
                throw new NoWhenBranchMatchedException();
            }
            string = new JSONObject().put("error", ((i1) i1Var).f173816a.name()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        }
        replyProxy.postMessage(string);
    }
}
