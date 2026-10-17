package nng;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeScreenContract$InputData f217647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f217648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f217649c;
    public final e4m.e d;
    public final e4m.e e;

    public g(p pVar, f fVar, IncomeScreenContract$InputData incomeScreenContract$InputData) {
        this.f217648b = pVar;
        this.f217647a = incomeScreenContract$InputData;
        int i = 12;
        this.f217649c = e4m.b.b(new nk7.k(pVar, this, 1, i));
        this.d = e4m.b.b(new nk7.k(pVar, this, 2, i));
        this.e = e4m.b.b(new nk7.k(pVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
