package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentHubScreenContract$InputData f176049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176051c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176053h;

    public e1(a3 a3Var, ViewController viewController, CreditCardInstalmentHubScreenContract$InputData creditCardInstalmentHubScreenContract$InputData) {
        this.f176050b = a3Var;
        this.f176049a = creditCardInstalmentHubScreenContract$InputData;
        this.f176051c = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.d = e4m.b.b(new jdi.i(a3Var, this, 2, i));
        this.e = e4m.b.b(new jdi.i(a3Var, this, 1, i));
        this.f = e4m.b.b(new jdi.i(a3Var, this, 0, i));
        this.f176052g = e4m.b.b(new jdi.i(a3Var, this, 4, i));
        this.f176053h = e4m.b.b(new jdi.i(a3Var, this, 3, i));
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
