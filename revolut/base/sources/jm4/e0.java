package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollateralMoveMoneyScreenContract$InputData f176044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176046c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176048h;
    public final e4m.e i;

    public e0(a3 a3Var, ViewController viewController, CollateralMoveMoneyScreenContract$InputData collateralMoveMoneyScreenContract$InputData) {
        this.f176045b = a3Var;
        this.f176044a = collateralMoveMoneyScreenContract$InputData;
        this.f176046c = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.d = e4m.b.b(new jdi.i(a3Var, this, 2, i));
        this.e = e4m.b.b(new jdi.i(a3Var, this, 1, i));
        this.f = e4m.b.b(new jdi.i(a3Var, this, 0, i));
        this.f176047g = e4m.b.b(new jdi.i(a3Var, this, 5, i));
        this.f176048h = e4m.b.b(new jdi.i(a3Var, this, 4, i));
        this.i = e4m.b.b(new jdi.i(a3Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
