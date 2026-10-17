package ufh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreenContract$InputData;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements fgh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundInvestmentDetailsScreenContract$InputData f279834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f279835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f279836c;
    public final e4m.e d;

    public d(i iVar, FundInvestmentDetailsScreenContract$InputData fundInvestmentDetailsScreenContract$InputData) {
        this.f279835b = iVar;
        this.f279834a = fundInvestmentDetailsScreenContract$InputData;
        this.f279836c = e4m.b.b(new k0(iVar, this, 0, 4));
        this.d = e4m.b.b(new k0(iVar, this, 1, 4));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        gdh.a aVar = (gdh.a) this.f279836c.get();
        f9f.b.f(aVar);
        builderBuilderWithExpectedSize.add(aVar);
        builderBuilderWithExpectedSize.addAll((Iterable) f9f.b.k((gdh.a) this.f279836c.get()));
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
