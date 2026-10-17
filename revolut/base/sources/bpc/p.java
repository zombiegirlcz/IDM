package bpc;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements m1h.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zoc.f f17590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qmc.h f17591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qmc.b f17592c;
    public final ybl.k d;

    public p(zoc.f addMoneyPortfolioInfoProvider, qmc.h roboPortfolioInfoProvider, qmc.b roboContextProvider, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(addMoneyPortfolioInfoProvider, "addMoneyPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f17590a = addMoneyPortfolioInfoProvider;
        this.f17591b = roboPortfolioInfoProvider;
        this.f17592c = roboContextProvider;
        this.d = tradingAccountsInteractor;
    }

    @Override // m1h.q
    public final Flow a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Flow flowE = this.f17590a.e(transferSubjectId);
        Flow flowA = glc.a.a(this.f17591b, transferSubjectId.getF95657a());
        q0 q0VarA = this.f17592c.a();
        return nim.a.u(new a2c.c(2, 14, null), u0.m(u0.i(flowE, flowA, q0VarA), nim.a.v(((ael.q0) this.d).o(transferSubjectId.getF95657a(), w4l.h.f294642c), new bng.a(18))));
    }
}
