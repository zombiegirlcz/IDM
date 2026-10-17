package wo0;

import android.graphics.Bitmap;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f298861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f298863c;

    public e(WebView webView, String url2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f298861a = webView;
        this.f298862b = url2;
        this.f298863c = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f298861a, eVar.f298861a) && Intrinsics.f(this.f298862b, eVar.f298862b) && Intrinsics.f(this.f298863c, eVar.f298863c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f298861a.hashCode() * 31, 31, this.f298862b);
        Bitmap bitmap = this.f298863c;
        return iC + (bitmap == null ? 0 : bitmap.hashCode());
    }
}
