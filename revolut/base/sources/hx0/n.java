package hx0;

import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import au0.x5;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private n() {
    }

    public static void a(LogoWithTaglineView logoView) throws Throwable {
        Intrinsics.checkNotNullParameter(logoView, "logoView");
        ViewParent parent = logoView.getParent();
        if (parent instanceof ConstraintLayout) {
            OneShotPreDrawListener.add(logoView, new x5(logoView, (ConstraintLayout) parent, logoView, 19));
        } else {
            hx7.e.n(new IllegalStateException(j6.a.q("LogoViewIntroTransition requires ConstraintLayout as parent, but was ", parent != null ? parent.getClass().getSimpleName() : null)));
        }
    }
}
