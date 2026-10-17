package mx0;

import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarView f209887a;

    public o6(FloatingBottomBarView floatingBottomBarView) {
        this.f209887a = floatingBottomBarView;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(String str) {
        String str2;
        FloatingBottomBarView floatingBottomBarView = this.f209887a;
        floatingBottomBarView.setVisualSelection(str);
        com.revolut.core.ui_kit.internal.views.floatingbottombar.a bottomBarController = floatingBottomBarView.getBottomBarController();
        if (bottomBarController == null || !((Boolean) jo0.g.J.getValue()).booleanValue() || bottomBarController.f57052h || Intrinsics.f(bottomBarController.f57054l, str)) {
            return;
        }
        if ((!bottomBarController.k || bottomBarController.f57053j) && (str2 = bottomBarController.f57054l) != null) {
            bottomBarController.b(str2, false);
        }
        bottomBarController.f57054l = str;
        if (!bottomBarController.f57053j || str == null) {
            return;
        }
        bottomBarController.b(str, true);
    }
}
