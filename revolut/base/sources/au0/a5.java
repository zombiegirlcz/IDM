package au0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a5 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9144a;

    public a5(View navBarView) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        this.f9144a = navBarView;
    }

    @Override // au0.t2
    public final void a(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // au0.t2
    public final void c(float f, int i) {
        this.f9144a.setBackgroundColor(i);
    }

    @Override // au0.t2
    public final void onAttachedToWindow() {
    }

    @Override // au0.t2
    public final void onDetachedFromWindow() {
    }
}
