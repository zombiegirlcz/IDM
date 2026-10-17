package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceManageExpensesScreenContract$InputData f216723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216725c;
    public final e4m.e d;

    public s(q qVar, j jVar, CFACInsuranceManageExpensesScreenContract$InputData cFACInsuranceManageExpensesScreenContract$InputData) {
        this.f216724b = qVar;
        this.f216723a = cFACInsuranceManageExpensesScreenContract$InputData;
        int i = 5;
        this.f216725c = e4m.b.b(new k(jVar, this, 1, i));
        this.d = e4m.b.b(new k(jVar, this, 0, i));
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
