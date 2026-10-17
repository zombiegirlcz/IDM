package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleSelectionBottomSheetContract$InputData f119458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5 f119460c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119462h;

    public o6(c1 c1Var, f4 f4Var, ViewController viewController, SingleSelectionBottomSheetContract$InputData singleSelectionBottomSheetContract$InputData) {
        this.f119458a = singleSelectionBottomSheetContract$InputData;
        this.f119459b = e4m.b.b(e4m.c.a(viewController));
        t5 t5Var = new t5(c1Var, f4Var, this, 1, 8);
        this.f119460c = t5Var;
        this.d = e4m.b.b(t5Var);
        this.e = e4m.b.b(new t5(c1Var, f4Var, this, 0, 8));
        this.f = e4m.b.b(new t5(c1Var, f4Var, this, 2, 8));
        this.f119461g = e4m.b.b(this.f119460c);
        this.f119462h = e4m.b.b(new t5(c1Var, f4Var, this, 3, 8));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f119461g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
