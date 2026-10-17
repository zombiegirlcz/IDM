package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.AddressConfirmationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressConfirmationControllerContract$InputData f119704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final afj.d f119706c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119708h;

    public s(c1 c1Var, g4 g4Var, ViewController viewController, AddressConfirmationControllerContract$InputData addressConfirmationControllerContract$InputData) {
        this.f119704a = addressConfirmationControllerContract$InputData;
        this.f119705b = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        afj.d dVar = new afj.d(c1Var, g4Var, this, 1, i);
        this.f119706c = dVar;
        this.d = e4m.b.b(dVar);
        this.e = e4m.b.b(new afj.d(c1Var, g4Var, this, 0, i));
        this.f = e4m.b.b(this.f119706c);
        this.f119707g = e4m.b.b(new afj.d(c1Var, g4Var, this, 3, i));
        this.f119708h = e4m.b.b(new afj.d(c1Var, g4Var, this, 2, i));
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
