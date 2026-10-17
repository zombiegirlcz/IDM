package wlh;

import ael.i0;
import ael.y;
import cfl.p;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureDestination;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import cxe.u;
import efm.r;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import x8h.n0;
import xzg.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends uih.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d4f.f f298499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r60.b f298500n;
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n0 f298501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f298502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f298503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f298504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.i f298505t;
    public final d1e.a u;
    public final Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j6h.c f298506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ybl.j f298507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final uih.g f298508y;

    public k(d4f.f stockBuyBlockInteractor, r60.b promptViewControllerExtension, n stocksBuyBlockDialogFactory, n0 stockLendingInteractor, ybl.l tradingConfigInteractor, gte.a featureToggleInteractor, j60.a expandableDialogActionDispatcher, ybl.i productGroupAvailabilityInteractor, d1e.a stockLendingNaviCommandProvider, Map productsProviders, j6h.c giaMarginCommandProvider, ybl.j tradingAccountProductGroupOnboardingStateInteractor) {
        Intrinsics.checkNotNullParameter(stockBuyBlockInteractor, "stockBuyBlockInteractor");
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(stocksBuyBlockDialogFactory, "stocksBuyBlockDialogFactory");
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stockLendingNaviCommandProvider, "stockLendingNaviCommandProvider");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(giaMarginCommandProvider, "giaMarginCommandProvider");
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupOnboardingStateInteractor, "tradingAccountProductGroupOnboardingStateInteractor");
        this.f298499m = stockBuyBlockInteractor;
        this.f298500n = promptViewControllerExtension;
        this.o = stocksBuyBlockDialogFactory;
        this.f298501p = stockLendingInteractor;
        this.f298502q = tradingConfigInteractor;
        this.f298503r = featureToggleInteractor;
        this.f298504s = expandableDialogActionDispatcher;
        this.f298505t = productGroupAvailabilityInteractor;
        this.u = stockLendingNaviCommandProvider;
        this.v = productsProviders;
        this.f298506w = giaMarginCommandProvider;
        this.f298507x = tradingAccountProductGroupOnboardingStateInteractor;
        this.f298508y = new uih.g(0);
    }

    public static final Object h3(k kVar, String portfolioId, boolean z, gim.i iVar) {
        d4f.f fVar = kVar.f298499m;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        ybl.d dVar = fVar.f111284a;
        ybl.c cVar = ybl.d.Companion;
        efm.k kVarFirstElement = m70.a.g(rd0.e.c(((y) dVar).e(portfolioId, w4l.h.f294642c), kotlin.coroutines.g.f186406a), null, new czh.a(18), 1).firstElement();
        d2i.a aVar = new d2i.a(new a6j.a(fVar, z, 14), 11);
        kVarFirstElement.getClass();
        pfm.a aVar2 = new pfm.a(kVarFirstElement, aVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        Object objA = nim.a.a(aVar2, iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f298508y;
    }

    @Override // uih.a
    public final Flow e3(String portfolioId, q0 wealthAccountHolderType) {
        r rVarR;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
        int i = h.f298493a[wealthAccountHolderType.ordinal()];
        if (i == 1) {
            return new go.g(zi0.c.P(new uih.i(portfolioId), false, null, 3), 2);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (((jte.d) this.f298503r).c(WealthUiApi$Toggles.InvestBuyBlock.f95856c)) {
            od0.i.Companion.getClass();
            rVarR = w.h(zi0.c.P(od0.i.f224256b, false, null, 3));
        } else {
            rVarR = pd.b.r(rd0.e.c(ybl.l.d(this.f298502q), kotlin.coroutines.g.f186406a), new wg2.g(19, portfolioId, this));
        }
        r rVarA = this.f298501p.a(TradingAccountType.Gia.f105270a);
        akg.n nVarA = ((i0) this.f298507x).a(p.MARGIN_TRADING, portfolioId);
        h0 h0Var = h0.f322473a;
        u uVarA = nim.a.A(rd0.e.n(nVarA, h0Var), new wl3.d(10));
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        r rVarC = rd0.e.c(uVarA, gVar);
        r rVarDoOnNext = zi0.c.G(nim.a.w(rd0.e.c(rd0.e.n(((ael.h0) this.f298505t).d(), h0Var), gVar), new g(this, 0)), h0Var).doOnNext(new wl3.b(new g(this, 1), 9));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "observeRemediationComplexBonds(...)");
        return rd0.e.b(nim.a.w(ue0.e.p(mif.a.f(rVarR, rVarA, rVarC, rVarDoOnNext), h0Var), new wb3.k(portfolioId, 13)));
    }

    @Override // uih.a
    public final void f3(CellDetailsChevronDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.e;
        if (!(obj2 instanceof uih.e)) {
            obj2 = null;
        }
        uih.e eVar = (uih.e) obj2;
        if (eVar != null) {
            A2(new AccountClosureDestination(eVar.f280442a));
        }
    }

    @Override // uih.a
    public final void g3(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        boolean zF = Intrinsics.f(itemId, "COMPLEX_BONDS_ASSESSMENT_DIALOG_PRIMARY_ACTION_LIST_ID");
        j60.a aVar = this.f298504s;
        if (zF) {
            j60.a.v(aVar, false, new vt3.a(this, 24), 1);
        } else if (Intrinsics.f(itemId, "COMPLEX_BONDS_ASSESSMENT_DIALOG_SECONDARY_ACTION_LIST_ID")) {
            j60.a.v(aVar, false, null, 3);
        }
    }
}
