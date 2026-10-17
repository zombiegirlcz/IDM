package jyc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSource f179379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f179380c;
    public final h d;

    public f(h hVar, String str, IncomeSource incomeSource, Boolean bool) {
        this.d = hVar;
        this.f179378a = str;
        this.f179379b = incomeSource;
        this.f179380c = bool;
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
