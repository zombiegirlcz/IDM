package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstructorCreditPromptControllerContract$InputData f119556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119558c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q0(c1 c1Var, q1 q1Var, ViewController viewController, ConstructorCreditPromptControllerContract$InputData constructorCreditPromptControllerContract$InputData) {
        this.f119557b = c1Var;
        this.f119556a = constructorCreditPromptControllerContract$InputData;
        this.f119558c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new dmc.b0(c1Var, this, 0, 20));
        this.e = e4m.b.b(new dmc.b0(c1Var, this, 1, 20));
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, 20));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
