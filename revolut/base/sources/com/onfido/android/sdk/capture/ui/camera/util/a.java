package com.onfido.android.sdk.capture.ui.camera.util;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.delegates.ed;
import jr0.d;
import jr0.f;
import jr0.g;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50039b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f50038a = i;
        this.f50039b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.f50038a;
        Object obj2 = this.f50039b;
        switch (i) {
            case 0:
                break;
            case 1:
                ed edVar = (ed) obj2;
                ConstraintLayout constraintLayout = edVar.f54118s;
                ScrollView scrollView = edVar.f54110h;
                int height = constraintLayout.getHeight();
                ImageView imageView = edVar.i;
                int height2 = imageView.getHeight();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i2 = height2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                if (height != scrollView.getPaddingBottom() || i2 != scrollView.getPaddingTop()) {
                    scrollView.setPadding(scrollView.getPaddingLeft(), i2, scrollView.getPaddingRight(), height);
                } else if (edVar.f54120w) {
                    if (!edVar.f54121x || scrollView.getScrollY() == 0) {
                        edVar.H(scrollView.getScrollY());
                    } else {
                        scrollView.scrollTo(0, 0);
                    }
                    edVar.f54120w = false;
                    edVar.f54121x = false;
                }
                break;
            default:
                d dVar = (d) obj2;
                g gVar = dVar.f177896b;
                f fVar = g.Companion;
                gVar.e(false);
                dVar.invalidate();
                break;
        }
        return true;
    }
}
