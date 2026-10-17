package fnc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qoc.s0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.v f136659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final doc.b0 f136660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jlc.w f136661c;
    public final noc.o d;
    public final u e;
    public final bdh.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jlc.s f136662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final he2.b f136663h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final upc.d f136664j;
    public final l5f.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f136665l;

    public v(r10.v buildHeader, doc.b0 chartWidgetMapper, jlc.w recurringDepositWidgetMapper, noc.o allocationsWidgetMapper, u projectionWidgetMapper, bdh.e helpWidgetMapper, jlc.s roboFooterDisclaimersWidgetMapper, he2.b buildActionButtons, s portfolioInformationSectionMapper, upc.d spareChangeMapper, l5f.a investmentSectionWidgetMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(buildHeader, "buildHeader");
        Intrinsics.checkNotNullParameter(chartWidgetMapper, "chartWidgetMapper");
        Intrinsics.checkNotNullParameter(recurringDepositWidgetMapper, "recurringDepositWidgetMapper");
        Intrinsics.checkNotNullParameter(allocationsWidgetMapper, "allocationsWidgetMapper");
        Intrinsics.checkNotNullParameter(projectionWidgetMapper, "projectionWidgetMapper");
        Intrinsics.checkNotNullParameter(helpWidgetMapper, "helpWidgetMapper");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetMapper, "roboFooterDisclaimersWidgetMapper");
        Intrinsics.checkNotNullParameter(buildActionButtons, "buildActionButtons");
        Intrinsics.checkNotNullParameter(portfolioInformationSectionMapper, "portfolioInformationSectionMapper");
        Intrinsics.checkNotNullParameter(spareChangeMapper, "spareChangeMapper");
        Intrinsics.checkNotNullParameter(investmentSectionWidgetMapper, "investmentSectionWidgetMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f136659a = buildHeader;
        this.f136660b = chartWidgetMapper;
        this.f136661c = recurringDepositWidgetMapper;
        this.d = allocationsWidgetMapper;
        this.e = projectionWidgetMapper;
        this.f = helpWidgetMapper;
        this.f136662g = roboFooterDisclaimersWidgetMapper;
        this.f136663h = buildActionButtons;
        this.i = portfolioInformationSectionMapper;
        this.f136664j = spareChangeMapper;
        this.k = investmentSectionWidgetMapper;
        this.f136665l = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        List listJ;
        List list2;
        List list3;
        List list4;
        jlc.n nVar;
        int i;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (((jte.d) this.f136665l).c(ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign.f91229c)) {
            e7f.c cVar = domainState.f136646l;
            e7f.i iVar = (e7f.i) this.k;
            iVar.getClass();
            if (cVar == null) {
                cVar = null;
            }
            if (cVar != null) {
                e7f.e eVar = cVar.f123317a;
                String str = cVar.f123318b;
                list = iVar.a(eVar, str != null ? new l5f.b(str) : null).f123322a;
            } else {
                list = null;
            }
            if (list == null) {
                list = f0.f322471a;
            }
        } else {
            list = f0.f322471a;
        }
        Data data = domainState.f136640a;
        q qVar = data != null ? (q) iii.c.f(data, new hmc.a(11), new hkb.e(10), new hnc.a(this.f136659a, 0)) : null;
        List listA = this.f136660b.a(new doc.e(null), domainState.f136642c);
        Data data2 = domainState.k;
        ArrayList arrayListU = zhm.w.u(zhm.v.l(data2 != null ? (List) data2.getContent() : null));
        List[] elements = {((tpc.d) this.f136661c).b(domainState.f136643g), this.f136664j.a(domainState.f136644h)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListU2 = zhm.w.u(kotlin.collections.d.L(elements));
        yp0.b.k(arrayListU2, 0, 0, 0, 0, 31);
        List listC = this.d.c(domainState.d, new noc.d(R$string.wealth_robo_porfolio_portfolio_allocation, R$string.wealth_robo_portfolio_portfolio_allocation_target_allocation));
        jlc.r rVar = domainState.f136645j;
        if (rVar == null || (nVar = rVar.f175697a) == null) {
            listJ = f0.f322471a;
        } else {
            if (nVar instanceof jlc.g) {
                i = R$string.wealth_robo_portfolio_projection_projected_value;
            } else if (nVar instanceof jlc.k) {
                i = ((jlc.k) nVar).f175688b != null ? R$string.wealth_robo_portfolio_goal_title : R$string.wealth_robo_portfolio_projection_projected_value;
            } else {
                if (!(nVar instanceof jlc.m) && !(nVar instanceof jlc.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_robo_onboarding_projections_title;
            }
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("projections-widget-subheader", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            yp0.b.a(model);
            listJ = ue0.e.J(model, ((s0) this.e.f136658a).a(rVar));
        }
        Data data3 = domainState.f136640a;
        boolean z = domainState.f136641b;
        if (data3 != null) {
            list2 = list;
            list3 = listJ;
            list4 = (List) iii.c.f(data3, new fkh.f(24), new fk4.r(19), new ajd.t(this.i, z, 1));
        } else {
            list2 = list;
            list3 = listJ;
            list4 = null;
        }
        if (list4 == null) {
            list4 = f0.f322471a;
        }
        List[] elements2 = {listA, arrayListU, list2, arrayListU2, listC, list3, list4, domainState.f, this.f.a(), ((ppc.t) this.f136662g).a(domainState.e)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        ArrayList arrayListU3 = zhm.w.u(kotlin.collections.d.L(elements2));
        Data data4 = domainState.i;
        return new r(qVar, arrayListU3, data4 != null ? (p) iii.c.f(data4, new fkh.f(23), new fk4.r(18), new et6.a(this.f136663h, 29)) : null);
    }
}
