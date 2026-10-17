package fna;

import cfl.k;
import com.revolut.feature.statements.api.models.AnnualStatementDateRange;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x8h.v0;
import xzg.r0;
import ybl.l;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f136571b;

    public /* synthetic */ d(h hVar, int i) {
        this.f136570a = i;
        this.f136571b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136570a) {
            case 0:
                qla.a profileType = (qla.a) obj2;
                Intrinsics.checkNotNullParameter(profileType, "profileType");
                int i = e.f136572a[profileType.ordinal()];
                h hVar = this.f136571b;
                if (i == 1 || i == 2) {
                    hVar.getClass();
                    return zi0.c.i(new r0(f0.f322471a, new TradingLegalEntityInformation(null)));
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                v0 v0Var = (v0) hVar.f136580j;
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                k accountHolderTypeFilter = k.f23744a;
                Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
                return nim.a.v(nim.a.v(u0.m(l.d(v0Var.d), v0Var.e(loadingStrategy, accountHolderTypeFilter)), new x8h.h(27)), new fkh.f(16));
            default:
                AnnualStatementDateRange dateRange = (AnnualStatementDateRange) obj2;
                Intrinsics.checkNotNullParameter(dateRange, "dateRange");
                return Boolean.valueOf(dateRange.getFromYear() < dateRange.getToYear() && !((o8b.c) this.f136571b.f136578g).g());
        }
    }
}
