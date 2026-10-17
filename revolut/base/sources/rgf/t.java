package rgf;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends oki.h implements h {
    public final AllAccountsTransactionFiltersScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f254169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f254170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xh5.a f254171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gv5.d f254172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tzg.m f254173t;
    public final rkg.b u;
    public final ybl.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f254174w;

    public t(AllAccountsTransactionFiltersScreenContract$InputData inputData, w spaceContentModelsProvider, gte.a featureToggleInteractor, xh5.a cryptoFeatureEnabledInteractor, gv5.d cryptoInvestmentsSummaryDataProvider, tzg.m wealthAccountsInteractor, rkg.b investFilterMapper, ybl.l tradingConfigInteractor, l mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(spaceContentModelsProvider, "spaceContentModelsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsSummaryDataProvider, "cryptoInvestmentsSummaryDataProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(investFilterMapper, "investFilterMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f254169p = spaceContentModelsProvider;
        this.f254170q = featureToggleInteractor;
        this.f254171r = cryptoFeatureEnabledInteractor;
        this.f254172s = cryptoInvestmentsSummaryDataProvider;
        this.f254173t = wealthAccountsInteractor;
        this.u = investFilterMapper;
        this.v = tradingConfigInteractor;
        f0 f0Var = f0.f322471a;
        h0 h0Var = h0.f322473a;
        this.f254174w = mra.d.b(this, new f(f0Var, h0Var, h0Var, h0Var, h0Var, inputData.f91923b.f92013b, inputData.f91922a.f92013b, r0.g(), false, null), mapper, null, false, 12);
    }

    public static final Set I2(t tVar, TransactionsListFilterType.ConfigurableFilter.AccountFilters accountFilters, Set set) {
        boolean z;
        Set set2 = accountFilters.f92012a;
        Set set3 = set2;
        ArrayList arrayList = new ArrayList(zhm.w.t(set3, 10));
        Iterator it8 = set3.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductAccountDescriptor$Value.Main) it8.next()).f89728b.f89729a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = set3.iterator();
        while (true) {
            z = false;
            if (!it9.hasNext()) {
                break;
            }
            ProductAccountDescriptor$Value.Main main = (ProductAccountDescriptor$Value.Main) it9.next();
            ProductId productId = kotlin.text.a0.H(main.f89728b.f89729a, "Total-", false) ? main.f89727a : null;
            if (productId != null) {
                arrayList2.add(productId);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : set) {
            ProductAccountDescriptor$Value.Main main2 = (ProductAccountDescriptor$Value.Main) obj2;
            if (arrayList.contains(main2.f89728b.f89729a) || arrayList2.contains(main2.f89727a)) {
                if (!kotlin.text.a0.H(main2.f89728b.f89729a, "Total-", false)) {
                    linkedHashSet.add(obj2);
                }
            }
        }
        if (set2.isEmpty() && !accountFilters.f92013b.isEmpty()) {
            z = true;
        }
        if (!linkedHashSet.isEmpty() || z || set.isEmpty()) {
            return linkedHashSet;
        }
        Set setB = y0.b(zhm.d0.a0(set));
        IllegalStateException illegalStateException = new IllegalStateException("Accounts " + set2 + " were not available.Accounts " + setB + " selected as default");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return setB;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f254169p.a(sfe.a.FULL, qfe.j.f245295a), null, null, new q(this, null), 3);
        l2(new n(this, null), new yi5.b(26));
        l2(new p(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f254174w;
    }
}
