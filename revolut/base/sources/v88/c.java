package v88;

import a83.z;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import te8.v;
import vkm.q;
import w4l.h;
import w88.g;
import zf8.k;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements c78.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f286720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f286721c;
    public final ppk.f d;
    public final prl.e e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final an8.b f286722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x88.c f286723h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gte.a f286724j;
    public final j9l.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ang.f f286725l;

    public c(k juniorAccountInfoProvider, wsg.b newWalletsInteractor, ppk.f ratesInteractor, prl.e totalWealthVaultsInteractor, v juniorPocketsProductInteractor, an8.b juniorSavingProductInteractor, x88.c juniorTotalWealthWidgetMapper, g juniorISAProductInteractor, gte.a featureToggleInteractor, j9l.a moneyCalculator, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(totalWealthVaultsInteractor, "totalWealthVaultsInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(juniorTotalWealthWidgetMapper, "juniorTotalWealthWidgetMapper");
        Intrinsics.checkNotNullParameter(juniorISAProductInteractor, "juniorISAProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f286720b = juniorAccountInfoProvider;
        this.f286721c = newWalletsInteractor;
        this.d = ratesInteractor;
        this.e = totalWealthVaultsInteractor;
        this.f = juniorPocketsProductInteractor;
        this.f286722g = juniorSavingProductInteractor;
        this.f286723h = juniorTotalWealthWidgetMapper;
        this.i = juniorISAProductInteractor;
        this.f286724j = featureToggleInteractor;
        this.k = moneyCalculator;
        this.f286725l = userInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "TotalWealthList") && !Intrinsics.f(str, "TotalWealthListSmall")) {
            throw new IllegalStateException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "TotalWealthList") || Intrinsics.f(str, "TotalWealthListSmall")) {
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(j6.a.q("Unexpected widget type = ", str));
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ((x88.f) this.f286723h).getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "TotalWealthList")) {
            return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.junior_widgets_total_wealth_loading_header_title, null, null, 14), 3, null, 24);
        }
        if (Intrinsics.f(widgetType, "TotalWealthListSmall")) {
            return new TileLoadingWidgetDelegate.Model(4, new TextLocalisedClause(R$string.junior_widgets_total_wealth_loading_header_title, null, null, 14), id10);
        }
        throw new IllegalArgumentException(j6.a.q("Unexpected widget type = ", widgetType));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(i(str, ((HomeFeedWidgetContext.Junior) widgetContext).getJuniorId(), str2), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10, widgetContext2.getJuniorId(), widgetType);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Junior) widgetContext, str, eVar);
        return null;
    }

    public final jhi.b i(String str, String juniorBankingRegId, String str2) {
        Flow flowV;
        vkm.d dVarB = rd0.e.b(this.f286720b.b(juniorBankingRegId));
        boolean zC = ((jte.d) this.f286724j).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c);
        Continuation continuation = null;
        h loadingStrategy = h.f294642c;
        if (zC) {
            flowV = nim.a.v(xam.a.h(new v44.e(this, continuation, 10), this.f286721c.c(juniorBankingRegId, loadingStrategy)), new v80.a(1));
        } else {
            i.Companion.getClass();
            flowV = new go.g(new Data(i.f224256b, null, false, 6, null), 2);
        }
        Intrinsics.checkNotNullParameter(juniorBankingRegId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        prl.e eVar = this.e;
        Flow flowH = xam.a.h(new qqj.g(eVar, juniorBankingRegId, continuation, 9), rd0.e.b(((k) eVar.f239326c).b(juniorBankingRegId)));
        jhi.k kVar = new jhi.k(this.f.b(juniorBankingRegId, null, loadingStrategy), Boolean.FALSE, 2);
        jhi.k kVar2 = new jhi.k(this.f286722g.a(juniorBankingRegId, loadingStrategy), f0.f322471a, 2);
        Intrinsics.checkNotNullParameter(juniorBankingRegId, "juniorBankingRegId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = this.i;
        jhi.k kVar3 = new jhi.k(q.Q(bla.b.b(gVar.f295611a, ne8.b.f214421c.a()), new sdi.a(continuation, gVar, juniorBankingRegId, 27)), new w88.c(u98.a.TOO_OLD), 2);
        return mo3.a.f(nim.a.u(new tk9.i(2, 12, continuation), u0.i(u0.i(dVarB, flowV, flowH), u0.i(kVar, kVar2, kVar3), q.q(nim.a.v(this.f286725l.j(w4l.j.f294644c), new v80.a(2))))), new z(this, 19, str, str2), new soc.f(this, 7, str, str2), new v78.d(2));
    }
}
