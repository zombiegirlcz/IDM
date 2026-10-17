package erj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SetOverallBudgetScreenContract$InputData f128721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f128722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f128723c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f128724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f128725h;

    public m(h hVar, k kVar, BaseScreen baseScreen, SetOverallBudgetScreenContract$InputData setOverallBudgetScreenContract$InputData) {
        this.f128722b = hVar;
        this.f128721a = setOverallBudgetScreenContract$InputData;
        this.f128723c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 3;
        this.d = e4m.b.b(new ehe.o(hVar, kVar, this, 2, i));
        this.e = e4m.b.b(new ehe.o(hVar, kVar, this, 1, i));
        this.f = e4m.b.b(new ehe.o(hVar, kVar, this, 0, i));
        this.f128724g = e4m.b.b(new ehe.o(hVar, kVar, this, 4, i));
        this.f128725h = e4m.b.b(new ehe.o(hVar, kVar, this, 3, i));
    }

    public final w80.b d() {
        qd0.b languageProvider = this.f128722b.e.n();
        s.j(languageProvider);
        fsj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 62);
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
