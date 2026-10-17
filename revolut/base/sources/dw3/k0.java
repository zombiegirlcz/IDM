package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationBottomSheetContract$InputData f119064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dmc.b0 f119066c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119067g;

    public k0(c1 c1Var, f4 f4Var, ViewController viewController, ConfirmationBottomSheetContract$InputData confirmationBottomSheetContract$InputData) {
        this.f119064a = confirmationBottomSheetContract$InputData;
        this.f119065b = e4m.b.b(e4m.c.a(viewController));
        dmc.b0 b0Var = new dmc.b0(f4Var, this, 1, 15);
        this.f119066c = b0Var;
        this.d = e4m.b.b(b0Var);
        this.e = e4m.b.b(new dmc.b0(f4Var, this, 0, 15));
        this.f = e4m.b.b(this.f119066c);
        this.f119067g = e4m.b.b(new dmc.b0(f4Var, this, 2, 15));
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
