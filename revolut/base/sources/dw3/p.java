package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddDebtScreenContract$InputData f119471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119473c;
    public final afj.d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119475h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119476j;

    public p(c1 c1Var, s4 s4Var, BaseScreen baseScreen, AddDebtScreenContract$InputData addDebtScreenContract$InputData) {
        this.f119472b = c1Var;
        this.f119471a = addDebtScreenContract$InputData;
        this.f119473c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 26;
        afj.d dVar = new afj.d(c1Var, s4Var, this, 1, i);
        this.d = dVar;
        this.e = e4m.b.b(dVar);
        this.f = e4m.b.b(new afj.d(c1Var, s4Var, this, 0, i));
        this.f119474g = e4m.b.b(this.d);
        this.f119475h = e4m.b.b(new afj.d(c1Var, s4Var, this, 3, i));
        this.i = e4m.b.b(new afj.d(c1Var, s4Var, this, 4, i));
        this.f119476j = e4m.b.b(new afj.d(c1Var, s4Var, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119474g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
