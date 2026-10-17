package hx0;

import android.app.Activity;
import android.transition.Fade;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.view.ComponentActivity;
import au0.o5;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private h() {
    }

    public static View a(View view, Integer num) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (Intrinsics.f(view.getTag(), num)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewA = a(viewGroup.getChildAt(i), num);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static View b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        Intrinsics.checkNotNullParameter(controllerContainerCoordinatorLayout, "<this>");
        return a(controllerContainerCoordinatorLayout, Integer.valueOf(R$id.internal_app_entry_wallpaper_tag));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NavBarWithContainerBackground c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        o5 o5Var = view instanceof o5 ? (o5) view : null;
        if (o5Var != null) {
            return o5Var.getCurrentBackground();
        }
        return null;
    }

    public static void d(Activity activity, m transitionItemsProvider, int i) {
        long j2;
        Fade fade;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(transitionItemsProvider, "transitionItemsProvider");
        if (activity instanceof ComponentActivity) {
            boolean z = transitionItemsProvider.v() != null;
            c cVar = d.Companion;
            cVar.getClass();
            d dVarB = c.b((ComponentActivity) activity);
            if (i == 0) {
                j2 = 0;
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                j2 = 300;
            }
            e eVar = (e) dVarB;
            ComponentActivity componentActivity = eVar.f156304a;
            cVar.getClass();
            Window window = componentActivity.getWindow();
            if (window != null) {
                window.setTransitionBackgroundFadeDuration(j2);
            }
            Fade fade2 = new Fade();
            fade2.setDuration(300L);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            fade2.addListener(new g(activity, ref$ObjectRef, dVarB, ref$ObjectRef, activity));
            eVar.a(fade2);
            if (z) {
                fade = null;
            } else {
                fade = new Fade();
                fade.setDuration(300L);
                fade.setStartDelay(16L);
            }
            cVar.getClass();
            Window window2 = componentActivity.getWindow();
            if (window2 != null) {
                window2.setReturnTransition(fade);
            }
            eVar.e = new WeakReference(transitionItemsProvider);
        }
    }
}
