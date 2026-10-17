package au0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.appbar.AppBarLayoutProxy;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppBarLayoutProxy f9454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f9456c;

    public z4(AppBarLayoutProxy coordinatorChild, int i) {
        Intrinsics.checkNotNullParameter(coordinatorChild, "coordinatorChild");
        this.f9454a = coordinatorChild;
        this.f9455b = i;
    }

    public final void a() {
        AppBarLayoutProxy appBarLayoutProxy = this.f9454a;
        ViewParent parent = appBarLayoutProxy.getParent();
        Drawable drawable = null;
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        if (coordinatorLayout == null) {
            return;
        }
        y4 y4Var = new y4(appBarLayoutProxy.getContext());
        y4Var.setId(this.f9455b);
        try {
            drawable = ContextCompat.getDrawable(appBarLayoutProxy.getContext(), R$drawable.uikit_bottom_bar_shadow);
        } catch (Exception unused) {
        }
        y4Var.setBackground(drawable);
        y4Var.setRotation(180.0f);
        coordinatorLayout.addView(y4Var);
        Context context = appBarLayoutProxy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        y4Var.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, kli.a.k(context, 16.0f)));
        this.f9456c = y4Var;
    }

    public final View b() {
        View view = this.f9456c;
        if (view != null) {
            return view;
        }
        ViewParent parent = this.f9454a.getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        View viewFindViewById = coordinatorLayout != null ? coordinatorLayout.findViewById(this.f9455b) : null;
        this.f9456c = viewFindViewById;
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        a();
        if (coordinatorLayout != null) {
            coordinatorLayout.requestLayout();
        }
        return this.f9456c;
    }

    public /* synthetic */ z4(AppBarLayoutProxy appBarLayoutProxy) {
        this(appBarLayoutProxy, R$id.internal_nav_bar_shadow);
    }
}
