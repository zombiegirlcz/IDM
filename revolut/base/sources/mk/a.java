package mk;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f206134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f206135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f206136c;
    public final ProgressBar d;
    public final ConstraintLayout e;
    public final WebView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WebView f206137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f206138h;

    public a(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ProgressBar progressBar, ConstraintLayout constraintLayout2, WebView webView, WebView webView2, FrameLayout frameLayout) {
        this.f206134a = constraintLayout;
        this.f206135b = imageView;
        this.f206136c = imageView2;
        this.d = progressBar;
        this.e = constraintLayout2;
        this.f = webView;
        this.f206137g = webView2;
        this.f206138h = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f206134a;
    }
}
