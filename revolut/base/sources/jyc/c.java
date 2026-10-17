package jyc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSource f179364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179365b;

    public c(IncomeSource incomeSource, List list) {
        this.f179364a = incomeSource;
        this.f179365b = list;
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
