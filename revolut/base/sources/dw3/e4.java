package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e4 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyInputControllerContract$InputData f118641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118643c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118645h;
    public final e4m.e i;

    public e4(c1 c1Var, g4 g4Var, ViewController viewController, MoneyInputControllerContract$InputData moneyInputControllerContract$InputData) {
        this.f118642b = c1Var;
        this.f118641a = moneyInputControllerContract$InputData;
        this.f118643c = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        e0 e0Var = new e0(c1Var, g4Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, g4Var, this, 0, i));
        this.f118644g = e4m.b.b(this.d);
        this.f118645h = e4m.b.b(new e0(c1Var, g4Var, this, 3, i));
        this.i = e4m.b.b(new e0(c1Var, g4Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118644g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
