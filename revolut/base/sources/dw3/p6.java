package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleSelectionControllerContract$InputData f119528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5 f119530c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119532h;

    public p6(c1 c1Var, g4 g4Var, ViewController viewController, SingleSelectionControllerContract$InputData singleSelectionControllerContract$InputData) {
        this.f119528a = singleSelectionControllerContract$InputData;
        this.f119529b = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        g5 g5Var = new g5(g4Var, this, 1, i);
        this.f119530c = g5Var;
        this.d = e4m.b.b(g5Var);
        this.e = e4m.b.b(new g5(g4Var, this, 0, i));
        this.f = e4m.b.b(this.f119530c);
        this.f119531g = e4m.b.b(new g5(g4Var, this, 3, i));
        this.f119532h = e4m.b.b(new g5(g4Var, this, 2, i));
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
