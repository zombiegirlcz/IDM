package ne9;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import jo0.g;
import knm.b;
import kotlin.jvm.internal.Intrinsics;
import ny0.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private a() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(View pinCodeView, BasicNavBar basicNavBar) {
        Intrinsics.checkNotNullParameter(pinCodeView, "pinCodeView");
        if (basicNavBar == null || basicNavBar.getVisibility() == 0) {
            return;
        }
        if (((Boolean) g.f176833q.getValue()).booleanValue()) {
            Context context = basicNavBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (i.c(context)) {
                basicNavBar.setVisibility(8);
                Context context2 = basicNavBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                b.y(kli.a.k(context2, 24.0f), pinCodeView);
                return;
            }
        }
        basicNavBar.setVisibility(4);
        b.y(0, pinCodeView);
    }
}
