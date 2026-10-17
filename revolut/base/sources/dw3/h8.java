package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h8 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtDetailsScreenContract$InputData f118917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v7 f118919c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118921h;

    public h8(c1 c1Var, s4 s4Var, BaseScreen baseScreen, DebtDetailsScreenContract$InputData debtDetailsScreenContract$InputData) {
        this.f118917a = debtDetailsScreenContract$InputData;
        this.f118918b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 7;
        v7 v7Var = new v7(s4Var, this, 1, i);
        this.f118919c = v7Var;
        this.d = e4m.b.b(v7Var);
        this.e = e4m.b.b(new v7(s4Var, this, 0, i));
        this.f = e4m.b.b(this.f118919c);
        this.f118920g = e4m.b.b(new v7(s4Var, this, 3, i));
        this.f118921h = e4m.b.b(new v7(s4Var, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
