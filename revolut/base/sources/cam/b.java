package cam;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f22668c;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22666a = context;
        this.f22667b = new ArrayList();
        Lazy lazyB = yhm.j.b(new abm.f(this, 2));
        this.f22668c = lazyB;
        ((FrameLayout) lazyB.getValue()).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public final t a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        t tVar = new t(this, webView);
        this.f22667b.add(tVar);
        ((FrameLayout) this.f22668c.getValue()).addView(tVar.f22697c, new FrameLayout.LayoutParams(-1, -1));
        return tVar;
    }
}
