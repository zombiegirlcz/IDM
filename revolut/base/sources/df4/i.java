package df4;

import ag.q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import az0.l1;
import bx0.v;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static void a(NavBarLargeCentred navBar, RecyclerView contentView) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (!contentView.isLaidOut() || contentView.isLayoutRequested()) {
            contentView.addOnLayoutChangeListener(new v(navBar, contentView, 3));
            return;
        }
        int i = navBar.getResources().getDisplayMetrics().heightPixels;
        Context context = navBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iO = kli.a.o(context);
        Context context2 = navBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 56.0f);
        Context context3 = navBar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iMax = Math.max(i - contentView.getHeight(), kli.a.k(context3, 204.0f) + iK + iO);
        ViewGroup.LayoutParams layoutParams = navBar.getLayoutParams();
        if (layoutParams.height != iMax) {
            layoutParams.height = iMax;
            navBar.setLayoutParams(layoutParams);
            navBar.requestLayout();
        }
    }

    public static void b(NavBarLargeCentred navBar, RecyclerView recyclerView, FrameLayout button, Function0 doOnPrepared) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(doOnPrepared, "doOnPrepared");
        float f = button.getResources().getDisplayMetrics().heightPixels;
        if (recyclerView != null) {
            recyclerView.setTranslationY(f);
        }
        button.setTranslationY(f);
        button.setAlpha(1.0f);
        if (navBar.isLaidOut() && navBar.getWidth() > 0 && navBar.getHeight() > 0) {
            doOnPrepared.invoke();
            return;
        }
        ViewTreeObserver viewTreeObserver = navBar.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new ax.d(doOnPrepared, viewTreeObserver));
        }
    }

    public static void c(View navBar, Function0 withEndAction) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(withEndAction, "withEndAction");
        if (!navBar.isLaidOut() || navBar.isLayoutRequested()) {
            navBar.addOnLayoutChangeListener(new v(navBar, withEndAction, 4));
            return;
        }
        float f = navBar.getResources().getDisplayMetrics().heightPixels / 2.0f;
        float height = navBar.getHeight() / 2.0f;
        navBar.setTranslationY((com.google.android.gms.internal.mlkit_vision_face.a.a(navBar, "getContext(...)", 64.0f) + f) - height);
        navBar.animate().translationY(f - height).alpha(1.0f).setDuration(800L).withEndAction(new q(withEndAction)).start();
    }

    public static void d(LifecycleCoroutineScope coroutineScope, NavBarLargeCentred navBar, RecyclerView contentView, FrameLayout button, Function0 withEndAction) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(withEndAction, "withEndAction");
        c(navBar, new l1(coroutineScope, navBar, contentView, button, withEndAction));
    }
}
