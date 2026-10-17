package xri;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import or0.u;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f308352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f308353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f308354c;
    public boolean d;
    public final f2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z, boolean z3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f308352a = z;
        this.f308353b = z3;
        this.e = new f2(this, 24);
    }

    private final ViewGroup getDecorView() {
        Window window;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityM = kli.a.m(context);
        View decorView = (activityM == null || (window = activityM.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof ViewGroup) {
            return (ViewGroup) decorView;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.d) {
            a aVar = new a("view is added during layout pass : ".concat(view != null ? view.getClass().getName() : "null"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, aVar, h0Var);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(getRootWindowInsets());
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        boolean z = this.f308352a;
        setPadding(getPaddingLeft(), 0, getPaddingRight(), z ? insets2.bottom : 0);
        Insets insetsOf = Insets.of(insets2.left, insets2.top, insets2.right, z ? 0 : insets2.bottom);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
        if (windowInsets != null) {
            return windowInsets;
        }
        WindowInsets rootWindowInsets = getRootWindowInsets();
        Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
        return rootWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup decorView;
        if (Build.VERSION.SDK_INT <= 29 && (decorView = getDecorView()) != null) {
            u.b(decorView, true, this.e);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Window window;
        super.onDetachedFromWindow();
        Integer num = this.f308354c;
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityM = kli.a.m(context);
            if (activityM != null && (window = activityM.getWindow()) != null) {
                window.setNavigationBarDividerColor(iIntValue);
            }
        }
        this.f308354c = null;
        ViewGroup decorView = getDecorView();
        if (decorView != null) {
            u.q(decorView, this.e);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        this.d = true;
        try {
            super.onLayout(z, i, i2, i3, i5);
        } finally {
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        Window window;
        super.onViewAdded(view);
        if (this.f308353b) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityM = kli.a.m(context);
            if (activityM == null || (window = activityM.getWindow()) == null) {
                return;
            }
            int navigationBarDividerColor = window.getNavigationBarDividerColor();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorGreyTone5, context2);
            if (navigationBarDividerColor != iS) {
                this.f308354c = Integer.valueOf(navigationBarDividerColor);
                window.setNavigationBarDividerColor(iS);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.d) {
            a aVar = new a("view is going to be removed during layout pass : ".concat(view != null ? view.getClass().getName() : "null"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, aVar, h0Var);
        }
        super.removeView(view);
    }
}
