package erj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SetCategoryBudgetsScreenContract$InputData f128717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f128718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f128719c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f128720g;

    public l(h hVar, k kVar, BaseScreen baseScreen, SetCategoryBudgetsScreenContract$InputData setCategoryBudgetsScreenContract$InputData) {
        this.f128718b = hVar;
        this.f128717a = setCategoryBudgetsScreenContract$InputData;
        this.f128719c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 2;
        this.d = e4m.b.b(new ehe.o(hVar, kVar, this, 2, i));
        this.e = e4m.b.b(new ehe.o(hVar, kVar, this, 1, i));
        this.f = e4m.b.b(new ehe.o(hVar, kVar, this, 0, i));
        this.f128720g = e4m.b.b(new ehe.o(hVar, kVar, this, 3, i));
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
