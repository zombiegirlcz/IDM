package tu0;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements b {

    @NotNull
    public static final C1525a Companion = new C1525a();

    /* JADX INFO: renamed from: tu0.a$a, reason: collision with other inner class name */
    public static final class C1525a {
        private C1525a() {
        }
    }

    @Override // tu0.b
    public final void a(SwipeableCardContainerView view) {
        Activity activityM;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        if (context == null || (activityM = kli.a.m(context)) == null || (window = activityM.getWindow()) == null) {
            return;
        }
        window.addFlags(128);
    }

    @Override // tu0.b
    public final void b(SwipeableCardContainerView view) {
        Activity activityM;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        if (context == null || (activityM = kli.a.m(context)) == null || (window = activityM.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }
}
