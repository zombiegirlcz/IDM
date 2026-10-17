package zkh;

import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Destination;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$DisplayOptions;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 implements z87.d {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8h.q f323032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1h.e f323033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ugc.a f323034c;
    public final o97.r d;

    public r0(x8h.q investTransactionsInteractor, f1h.e investTransactionsCommonMapper, ugc.a transactionsCommonNavigationProvider) {
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        Intrinsics.checkNotNullParameter(investTransactionsCommonMapper, "investTransactionsCommonMapper");
        Intrinsics.checkNotNullParameter(transactionsCommonNavigationProvider, "transactionsCommonNavigationProvider");
        this.f323032a = investTransactionsInteractor;
        this.f323033b = investTransactionsCommonMapper;
        this.f323034c = transactionsCommonNavigationProvider;
        this.d = o97.r.TRADING_TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (searchQuery.length() > 0) {
            efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        WealthAccountType wealthAccountType = WealthAccountType.SECURITIES;
        companion.getClass();
        efm.r map = zi0.c.o(nim.a.w(nim.a.w(rd0.e.c(this.f323032a.b(new z2f.f(InvestTransactionsFilter.Companion.a(wealthAccountType)), w4l.h.f294642c), skm.p0.f264003c), new zhf.f(this, 18)), new zke.f(18))).map(new zii.e(new zke.f(19), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        if (!Intrinsics.f(str, "TRADING_TRANSACTIONS_SECTION_LIST_ID")) {
            Object obj2 = yVar.f223136b;
            if (!(obj2 instanceof q0)) {
                return o97.e.f223096a;
            }
            return new o97.l(u0.f(this.f323034c.q(((q0) obj2).f323028a)));
        }
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        WealthAccountType wealthAccountType = WealthAccountType.SECURITIES;
        companion.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplA = InvestTransactionsFilter.Companion.a(wealthAccountType);
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        return new o97.l(u0.f(new InvestTransactionsListContract$Destination(new InvestTransactionsListContract$InputData(investTransactionsFilterImplA, new InvestTransactionsListContract$DisplayOptions(InvestTransactionsListContract$Disclaimers.Companion.b())))));
    }
}
