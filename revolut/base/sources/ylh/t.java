package ylh;

import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.ProductStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends yji.n implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f314728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f314729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.d f314730n;
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f314731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f314732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f314733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f314734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f314735t;

    public t(f mapper, zxd.c statementsInteractor, ybl.d portfolioInteractor, k statementSelectorPeriodCalculator, j60.a bottomExpandableExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(statementSelectorPeriodCalculator, "statementSelectorPeriodCalculator");
        Intrinsics.checkNotNullParameter(bottomExpandableExtension, "bottomExpandableExtension");
        this.f314728l = mapper;
        this.f314729m = statementsInteractor;
        this.f314730n = portfolioInteractor;
        this.o = statementSelectorPeriodCalculator;
        this.f314731p = bottomExpandableExtension;
        this.f314732q = vkm.q.c(null);
        this.f314733r = new ConcurrentHashMap();
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f314734s = z1VarB;
        this.f314735t = vkm.q.c(new q(null, null));
    }

    public static final ProductStatementPeriods Z2(t tVar, ProductStatementPeriods productStatementPeriods, StatementProduct statementProduct, Pair pair) {
        StatementProductType statementProductType;
        tVar.getClass();
        List<ProductStatementPeriod> productPeriods = productStatementPeriods.getProductPeriods();
        if (statementProduct instanceof StatementProduct.TaxAdvantage) {
            statementProductType = StatementProductType.TAX_ADVANTAGED_INVESTING;
        } else if (statementProduct instanceof StatementProduct.Stocks) {
            statementProductType = StatementProductType.STOCK;
        } else if (statementProduct instanceof StatementProduct.MarginTrading) {
            statementProductType = StatementProductType.MARGIN_TRADE;
        } else if (statementProduct instanceof StatementProduct.Robo) {
            statementProductType = StatementProductType.ROBO;
        } else {
            if (!(statementProduct instanceof StatementProduct.Commodities)) {
                throw new NoWhenBranchMatchedException();
            }
            statementProductType = StatementProductType.COMMODITIES;
        }
        return ProductStatementPeriods.copy$default(productStatementPeriods, null, zhm.d0.E0(zhm.u.c(new ProductStatementPeriod(statementProductType.name(), (LocalDate) pair.f186385a, (LocalDate) pair.f186386b, null)), productPeriods), 1, null);
    }

    @Override // yji.n
    public final void E2() {
        this.f314733r.clear();
    }

    public final void b3(y period, boolean z) {
        a aVar = period.f314738a;
        a aVar2 = period.f314739b;
        ((u) this.f314728l).getClass();
        Intrinsics.checkNotNullParameter(period, "period");
        LocalDate localDate = z ? aVar2.f314705a : aVar2.f314706b;
        LocalDate localDate2 = z ? aVar.f314705a : aVar2.f314705a;
        LocalDate localDate3 = z ? aVar2.f314706b : aVar.f314706b;
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.statement_period_from, null, null, 14) : new TextLocalisedClause(R$string.statement_period_to, null, null, 14);
        String str = z ? "CUSTOM_DATE_SELECTOR_FROM_LIST_ID" : "CUSTOM_DATE_SELECTOR_TO_LIST_ID";
        rp0.t tVar = new rp0.t(textLocalisedClause, null, null, 30);
        List listC = zhm.u.c(new g5(str, localDate, localDate, true, null, localDate2, localDate3, null, null, null, 0, 0, 1048368));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        this.f314731p.x(new rp0.y(listC, tVar, rp0.l.WINDOW, null, null, null, 1016));
    }
}
