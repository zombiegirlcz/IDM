package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.k6;
import dw3.k9;
import dw3.z5;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 implements xki.c, xk4.a, rk4.a, vk4.a, ok4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardAutopaySettingsFlowContract$InputData f176143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f176145c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176147h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176148j;

    public j0(a3 a3Var, ViewController viewController, CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData) {
        this.f176144b = a3Var;
        this.f176143a = creditCardAutopaySettingsFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.e = e4m.b.b(new jdi.i(a3Var, this, 2, i));
        this.f = e4m.b.b(new jdi.i(a3Var, this, 1, i));
        this.f176146g = e4m.b.b(new jdi.i(a3Var, this, 0, i));
        this.f176147h = e4m.b.b(new jdi.i(a3Var, this, 3, i));
        this.i = e4m.b.b(new jdi.i(a3Var, this, 4, i));
        this.f176148j = e4m.b.b(new jdi.i(a3Var, this, 5, i));
    }

    @Override // vk4.a
    public final q3 b() {
        return new q3(this.f176144b, this.f176145c, 0);
    }

    @Override // rk4.a
    public final z5 c() {
        return new z5(this.f176144b, this.f176145c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f176146g.get());
    }

    @Override // xk4.a
    public final k6 j() {
        return new k6(this.f176144b, this.f176145c, 1);
    }

    @Override // ok4.a
    public final k9 s() {
        return new k9(this.f176144b, this.f176145c, 2);
    }
}
