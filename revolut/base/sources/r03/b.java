package r03;

import android.view.View;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;
import rp0.x0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements e {
    public static k1 a(com.revolut.kompot.navigable.a controller) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        x0 x0Var = g1.Companion;
        View decorView = controller.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return x0.a(x0Var, decorView);
    }
}
