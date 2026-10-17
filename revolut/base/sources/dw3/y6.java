package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.screen.StatusDialogScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusDialogScreenContract$InputData f120234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5 f120236c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120238h;

    public y6(c1 c1Var, x6 x6Var, ViewController viewController, StatusDialogScreenContract$InputData statusDialogScreenContract$InputData) {
        this.f120234a = statusDialogScreenContract$InputData;
        this.f120235b = e4m.b.b(e4m.c.a(viewController));
        t5 t5Var = new t5(c1Var, x6Var, this, 1, 9);
        this.f120236c = t5Var;
        this.d = e4m.b.b(t5Var);
        this.e = e4m.b.b(new t5(c1Var, x6Var, this, 0, 9));
        this.f = e4m.b.b(this.f120236c);
        this.f120237g = e4m.b.b(new t5(c1Var, x6Var, this, 3, 9));
        this.f120238h = e4m.b.b(new t5(c1Var, x6Var, this, 2, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
