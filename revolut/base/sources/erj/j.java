package erj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryBudgetContract$InputData f128711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f128712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f128713c;
    public final e4m.e d;

    public j(h hVar, CategoryBudgetContract$InputData categoryBudgetContract$InputData) {
        this.f128712b = hVar;
        this.f128711a = categoryBudgetContract$InputData;
        int i = 8;
        this.f128713c = e4m.b.b(new ea2.p(hVar, this, 1, i));
        this.d = e4m.b.b(new ea2.p(hVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
