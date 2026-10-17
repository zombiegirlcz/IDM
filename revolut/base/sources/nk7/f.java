package nk7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimExpensesScreenContract$InputData f216676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f216678c;
    public final e4m.e d;

    public f(q qVar, r rVar, CFACClaimExpensesScreenContract$InputData cFACClaimExpensesScreenContract$InputData) {
        this.f216677b = qVar;
        this.f216676a = cFACClaimExpensesScreenContract$InputData;
        int i = 0;
        this.f216678c = e4m.b.b(new e(this, 1, i));
        this.d = e4m.b.b(new e(this, 0, i));
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
