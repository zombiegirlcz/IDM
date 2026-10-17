package m5e;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.c0;
import q87.z;
import qdk.r0;
import qdk.x;
import qdk.x0;
import qdk.y0;
import z0f.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202932a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f202933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f202934c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f202935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f202936h;
    public final Object i;

    public o(qdk.g headerContentMapper, qdk.n revealSectionMapper, qdk.f footerMapper, x0 toolbarMenuItemsMapper, qdk.k promotedRewardsMapper, qdk.e exceptionalRewardsMapper, qdk.i maximiseRewardsMapper, qdk.c everydayRewardsMapper, y0 ultraRewardsMapper, qdk.a actionFooterMapper, yik.b planAnimatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(headerContentMapper, "headerContentMapper");
        Intrinsics.checkNotNullParameter(revealSectionMapper, "revealSectionMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(toolbarMenuItemsMapper, "toolbarMenuItemsMapper");
        Intrinsics.checkNotNullParameter(promotedRewardsMapper, "promotedRewardsMapper");
        Intrinsics.checkNotNullParameter(exceptionalRewardsMapper, "exceptionalRewardsMapper");
        Intrinsics.checkNotNullParameter(maximiseRewardsMapper, "maximiseRewardsMapper");
        Intrinsics.checkNotNullParameter(everydayRewardsMapper, "everydayRewardsMapper");
        Intrinsics.checkNotNullParameter(ultraRewardsMapper, "ultraRewardsMapper");
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        Intrinsics.checkNotNullParameter(planAnimatedBackgroundTypeMapper, "planAnimatedBackgroundTypeMapper");
        this.f202933b = headerContentMapper;
        this.f202934c = revealSectionMapper;
        this.d = promotedRewardsMapper;
        this.e = exceptionalRewardsMapper;
        this.f = maximiseRewardsMapper;
        this.f202935g = everydayRewardsMapper;
        this.f202936h = actionFooterMapper;
        this.i = planAnimatedBackgroundTypeMapper;
    }

    public AnimatedBackgroundType a(x xVar) {
        String str = xVar.f244991a;
        if (str == null) {
            return null;
        }
        yik.b bVar = (yik.b) this.i;
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return bVar.c(upperCase);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Collection collection;
        Collection collection2;
        Collection collection3;
        Collection collection4;
        switch (this.f202932a) {
            case 0:
                h domainState = (h) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                aim.e eVarB = u.b();
                w4e.b domainState2 = domainState.i;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                Data data = domainState2.f294553a;
                Data data2 = domainState2.f294554b;
                List list = null;
                Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
                List list2 = dataT != null ? (List) iii.c.f(dataT, new w29.a(23), new w2.d(24), new w2a.o(6)) : null;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                eVarB.addAll(list2);
                Data data3 = domainState.f202915m;
                c0 c0Var = data3 != null ? (c0) data3.getContent() : null;
                int i = c0Var == null ? -1 : n.f202931a[c0Var.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        eVarB.addAll(((x4e.l) this.d).c(domainState.f));
                        y4e.d domainState3 = domainState.d;
                        Intrinsics.checkNotNullParameter(domainState3, "domainState");
                        Data data4 = domainState3.f310892a;
                        if (data4 == null || (collection3 = (List) iii.c.f(data4, new y4b.b(5), new y13.a(18), new x0b.h(27))) == null) {
                            collection3 = f0.f322471a;
                        }
                        eVarB.addAll(collection3);
                        eVarB.addAll(((a5e.m) this.f202933b).a(domainState.f202908a));
                    } else {
                        if (i != 2 && i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e3h.c cVar = domainState.f202913j;
                        if (cVar != null) {
                            eVarB.addAll(((e3h.f) this.f).a(cVar));
                        }
                        eVarB.addAll(((q4h.g) this.e).a(domainState.e));
                        z4e.k kVar = (z4e.k) this.f202935g;
                        z4e.d domainState4 = domainState.f202911g;
                        Intrinsics.checkNotNullParameter(domainState4, "domainState");
                        Data data5 = domainState4.f319376a;
                        if (data5 == null || (collection4 = (List) iii.c.f(data5, new z1i.l(25), new a0(13), new y5g.l(kVar, 19))) == null) {
                            collection4 = f0.f322471a;
                        }
                        eVarB.addAll(collection4);
                    }
                }
                u4e.n nVar = (u4e.n) this.f202936h;
                u4e.d domainState5 = domainState.f202912h;
                Intrinsics.checkNotNullParameter(domainState5, "domainState");
                Data data6 = domainState5.f277321a;
                Data data7 = domainState5.f277322b;
                Data dataT2 = (data6 == null || data7 == null) ? null : t1.t(data6, data7);
                if (dataT2 == null || (collection = (List) iii.c.f(dataT2, new u4e.i(3), new tw8.g(29), new tch.c(nVar, domainState5, 20))) == null) {
                    collection = f0.f322471a;
                }
                eVarB.addAll(collection);
                t4e.l lVar = (t4e.l) this.f202934c;
                t4e.d domainState6 = domainState.f202910c;
                Intrinsics.checkNotNullParameter(domainState6, "domainState");
                Data data8 = domainState6.f267976a;
                Data data9 = domainState6.f267977b;
                if (data8 != null && data9 != null) {
                    list = (List) iii.c.f(t1.t(data8, data9), new t3b.g(18), new szb.f(28), new sr8.a(lVar, 6));
                }
                if (list == null) {
                    list = f0.f322471a;
                }
                eVarB.addAll(list);
                if (c0Var == c0.POST_TRADE || c0Var == c0.POST_MATURITY) {
                    eVarB.addAll(domainState.f202914l);
                }
                eVarB.addAll(((fsl.u) ((fsl.k) this.i)).b(domainState, new fsl.j(null, 3)));
                List list3 = domainState.k;
                if (list3 != null) {
                    eVarB.addAll(list3);
                }
                s4e.d domainState7 = domainState.f202909b;
                Intrinsics.checkNotNullParameter(domainState7, "domainState");
                Data data10 = domainState7.f259836a;
                if (data10 == null || (collection2 = (List) iii.c.f(data10, new s4b.e(2), new s20.c(16), new rd3.x(19))) == null) {
                    collection2 = f0.f322471a;
                }
                eVarB.addAll(collection2);
                return new i(u.a(eVarB));
            default:
                x domainState8 = (x) jVar;
                Intrinsics.checkNotNullParameter(domainState8, "domainState");
                return (r0) iii.c.f(domainState8.f244992b, new qce.a(this, domainState8, 3), new qce.b(this, domainState8, 2), new z(this, domainState8, 6));
        }
    }

    public o(a5e.m underlyingAssetsWidgetMapper, s4e.j aboutIssuerWidgetMapper, t4e.l aboutNoteWidgetMapper, y4e.j payoutScenarioWidgetMapper, x4e.l payoutChartWidgetMapper, q4h.g investmentsWidgetMapper, e3h.f historicalChartWidgetMapper, z4e.k performanceTrackerWidgetMapper, u4e.n annualReturnInsightsWidgetMapper, w4e.g noteStateWarningWidgetMapper, fsl.k investOrdersWidgetMapper) {
        Intrinsics.checkNotNullParameter(underlyingAssetsWidgetMapper, "underlyingAssetsWidgetMapper");
        Intrinsics.checkNotNullParameter(aboutIssuerWidgetMapper, "aboutIssuerWidgetMapper");
        Intrinsics.checkNotNullParameter(aboutNoteWidgetMapper, "aboutNoteWidgetMapper");
        Intrinsics.checkNotNullParameter(payoutScenarioWidgetMapper, "payoutScenarioWidgetMapper");
        Intrinsics.checkNotNullParameter(payoutChartWidgetMapper, "payoutChartWidgetMapper");
        Intrinsics.checkNotNullParameter(investmentsWidgetMapper, "investmentsWidgetMapper");
        Intrinsics.checkNotNullParameter(historicalChartWidgetMapper, "historicalChartWidgetMapper");
        Intrinsics.checkNotNullParameter(performanceTrackerWidgetMapper, "performanceTrackerWidgetMapper");
        Intrinsics.checkNotNullParameter(annualReturnInsightsWidgetMapper, "annualReturnInsightsWidgetMapper");
        Intrinsics.checkNotNullParameter(noteStateWarningWidgetMapper, "noteStateWarningWidgetMapper");
        Intrinsics.checkNotNullParameter(investOrdersWidgetMapper, "investOrdersWidgetMapper");
        this.f202933b = underlyingAssetsWidgetMapper;
        this.f202934c = aboutNoteWidgetMapper;
        this.d = payoutChartWidgetMapper;
        this.e = investmentsWidgetMapper;
        this.f = historicalChartWidgetMapper;
        this.f202935g = performanceTrackerWidgetMapper;
        this.f202936h = annualReturnInsightsWidgetMapper;
        this.i = investOrdersWidgetMapper;
    }
}
