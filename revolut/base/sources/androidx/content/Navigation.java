package androidx.content;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nkm.t;
import nkm.y;
import o5.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/navigation/Navigation;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/navigation/NavController;", "findNavController", "(Landroid/view/View;)Landroidx/navigation/NavController;", "controller", "", "setViewNavController", "(Landroid/view/View;Landroidx/navigation/NavController;)V", "findViewNavController", "getViewNavController", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Navigation {

    @NotNull
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    @NotNull
    public static final NavController findNavController(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(view);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final NavController findViewNavController(View view) {
        return (NavController) y.r(y.z(t.g(view, new b(5)), new b(6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewNavController$lambda$2(View it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        Object parent = it8.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavController findViewNavController$lambda$3(View it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return INSTANCE.getViewNavController(it8);
    }

    private final NavController getViewNavController(View view) {
        Object tag2 = view.getTag(R$id.nav_controller_view_tag);
        if (tag2 instanceof WeakReference) {
            return (NavController) ((WeakReference) tag2).get();
        }
        if (tag2 instanceof NavController) {
            return (NavController) tag2;
        }
        return null;
    }

    public static final void setViewNavController(@NotNull View view, NavController controller) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R$id.nav_controller_view_tag, controller);
    }
}
