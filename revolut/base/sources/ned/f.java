package ned;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f214452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f214453b;

    public f(g gVar, int i) {
        this.f214452a = gVar;
        this.f214453b = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f214452a;
        int i = this.f214453b;
        if (i == 0) {
            return new com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a(gVar.f214454a);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) gVar.e.get();
        ted.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        x0 x0Var = g1.Companion;
        View decorView = controller.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return x0.a(x0Var, decorView);
    }
}
