package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class g8 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtDetailsControllerContract$InputData f118829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118831c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118833h;

    public g8(c1 c1Var, t4 t4Var, ViewController viewController, DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData) {
        this.f118830b = c1Var;
        this.f118829a = debtDetailsControllerContract$InputData;
        this.f118831c = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.d = e4m.b.b(new s7(c1Var, t4Var, this, 1, i));
        this.e = e4m.b.b(new s7(c1Var, t4Var, this, 0, i));
        this.f = e4m.b.b(new s7(c1Var, t4Var, this, 3, i));
        this.f118832g = e4m.b.b(new s7(c1Var, t4Var, this, 4, i));
        this.f118833h = e4m.b.b(new s7(c1Var, t4Var, this, 2, i));
        e4m.b.b(new s7(c1Var, t4Var, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
