package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsStatementsScreenContract$InputData f130673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130675c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130677h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130678j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130679l;

    public a0(b0 b0Var, w wVar, ViewController viewController, SavingsStatementsScreenContract$InputData savingsStatementsScreenContract$InputData) {
        this.f130673a = savingsStatementsScreenContract$InputData;
        this.f130674b = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.f130675c = e4m.b.b(new j(b0Var, this, 2, i));
        this.d = e4m.b.b(new j(b0Var, this, 4, i));
        this.e = e4m.b.b(new j(b0Var, this, 5, i));
        this.f = e4m.b.b(new j(b0Var, this, 3, i));
        this.f130676g = e4m.b.b(new j(b0Var, this, 1, i));
        this.f130677h = e4m.b.b(new j(b0Var, this, 0, i));
        this.i = e4m.b.b(new j(b0Var, this, 6, i));
        this.f130678j = e4m.b.b(new j(b0Var, this, 7, i));
        this.k = e4m.b.b(new j(b0Var, this, 9, i));
        this.f130679l = e4m.b.b(new j(b0Var, this, 8, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130678j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130677h.get(), (yji.d) this.i.get());
    }
}
