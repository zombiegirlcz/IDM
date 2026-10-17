package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtsHubScreenContract$InputData f120194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f120196c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120198h;

    public y1(c1 c1Var, s4 s4Var, BaseScreen baseScreen, DebtsHubScreenContract$InputData debtsHubScreenContract$InputData) {
        this.f120194a = debtsHubScreenContract$InputData;
        this.f120195b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 10;
        e0 e0Var = new e0(c1Var, s4Var, this, 1, i);
        this.f120196c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, s4Var, this, 0, i));
        this.f = e4m.b.b(this.f120196c);
        this.f120197g = e4m.b.b(new e0(c1Var, s4Var, this, 3, i));
        this.f120198h = e4m.b.b(new e0(c1Var, s4Var, this, 2, i));
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
