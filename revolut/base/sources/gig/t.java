package gig;

import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import fmc.z;
import ip0.qj0;
import ip0.qm0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144212a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f144213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f144214c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f144215g;

    public t(vv1.a actionsMapper, vv1.b aliasSectionMapper, vv1.c contactsSectionMapper, vv1.d transactionsSectionMapper, vv1.e qrInfoSectionMapper, vv1.f bottomSectionMapper) {
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(aliasSectionMapper, "aliasSectionMapper");
        Intrinsics.checkNotNullParameter(contactsSectionMapper, "contactsSectionMapper");
        Intrinsics.checkNotNullParameter(transactionsSectionMapper, "transactionsSectionMapper");
        Intrinsics.checkNotNullParameter(qrInfoSectionMapper, "qrInfoSectionMapper");
        Intrinsics.checkNotNullParameter(bottomSectionMapper, "bottomSectionMapper");
        this.f144213b = actionsMapper;
        this.f144214c = aliasSectionMapper;
        this.d = contactsSectionMapper;
        this.e = transactionsSectionMapper;
        this.f = qrInfoSectionMapper;
        this.f144215g = bottomSectionMapper;
    }

    public aim.e a() {
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            qm0 qm0Var = new qm0(a0.d.n("RECOMMENDED_FLIGHTS_LOADING_ITEM_ID", i));
            yp0.b.l(qm0Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(qm0Var);
        }
        eVarB.addAll(iig.o.a(arrayList));
        eVarB.addAll(((iig.d) this.f144213b).b());
        eVarB.addAll(((iig.m) this.f144214c).b());
        eVarB.addAll(((iig.n) this.d).b());
        eVarB.addAll(((iig.g) this.e).a());
        return u.a(eVarB);
    }

    public aim.e b() {
        aim.e eVarB = u.b();
        qj0 qj0Var = new qj0("TABS_LOADING_ITEM_ID", 1);
        yp0.b.r(qj0Var, 0, 0, 0, 0, 15);
        Intrinsics.checkNotNullParameter("FLIGHT_CARD_LOADING_ITEM_ID", "listId");
        qm0 qm0Var = new qm0("FLIGHT_CARD_LOADING_ITEM_ID");
        yp0.b.l(qm0Var, 0, 0, 0, 0, null, false, 63);
        eVarB.addAll(v.k(qj0Var, mhg.d.a("FLIGHT_CARDS_LOADING_CARROUSEL_ITEM_ID", null, u.c(qm0Var))));
        eVarB.addAll(((iig.d) this.f144213b).b());
        eVarB.addAll(((iig.m) this.f144214c).b());
        eVarB.addAll(((iig.n) this.d).b());
        eVarB.addAll(((iig.g) this.e).a());
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0317  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r38) {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gig.t.c(cli.j):cli.o");
    }

    public t(mgh.e priceMapper, mgh.l scenariosMapper, mgh.h riskMapper, mgh.a aboutMapper, mgh.c feesMapper, d1h.h disclaimersMapper) {
        Intrinsics.checkNotNullParameter(priceMapper, "priceMapper");
        Intrinsics.checkNotNullParameter(scenariosMapper, "scenariosMapper");
        Intrinsics.checkNotNullParameter(riskMapper, "riskMapper");
        Intrinsics.checkNotNullParameter(aboutMapper, "aboutMapper");
        Intrinsics.checkNotNullParameter(feesMapper, "feesMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f144213b = priceMapper;
        this.f144214c = scenariosMapper;
        this.d = riskMapper;
        this.e = aboutMapper;
        this.f = feesMapper;
        this.f144215g = disclaimersMapper;
    }

    public t(iig.o flightsSectionMapper, iig.d accountSectionMapper, iig.m howToBookSectionMapper, iig.n learnMoreSectionMapper, iig.g disclaimerMapper, iig.i headerMapper, iig.h footerMapper) {
        Intrinsics.checkNotNullParameter(flightsSectionMapper, "flightsSectionMapper");
        Intrinsics.checkNotNullParameter(accountSectionMapper, "accountSectionMapper");
        Intrinsics.checkNotNullParameter(howToBookSectionMapper, "howToBookSectionMapper");
        Intrinsics.checkNotNullParameter(learnMoreSectionMapper, "learnMoreSectionMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f144213b = accountSectionMapper;
        this.f144214c = howToBookSectionMapper;
        this.d = learnMoreSectionMapper;
        this.e = disclaimerMapper;
        this.f = headerMapper;
        this.f144215g = footerMapper;
    }

    public t(mhg.d flightsSectionMapper, iig.d accountSectionMapper, iig.m howToBookSectionMapper, iig.n learnMoreSectionMapper, iig.g disclaimerMapper, mhg.a headerMapper, iig.h footerMapper) {
        Intrinsics.checkNotNullParameter(flightsSectionMapper, "flightsSectionMapper");
        Intrinsics.checkNotNullParameter(accountSectionMapper, "accountSectionMapper");
        Intrinsics.checkNotNullParameter(howToBookSectionMapper, "howToBookSectionMapper");
        Intrinsics.checkNotNullParameter(learnMoreSectionMapper, "learnMoreSectionMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f = flightsSectionMapper;
        this.f144213b = accountSectionMapper;
        this.f144214c = howToBookSectionMapper;
        this.d = learnMoreSectionMapper;
        this.e = disclaimerMapper;
        this.f144215g = footerMapper;
    }

    public t(ProjectionScreenContract$Input input, jnc.n headerMapper, jlc.o projectionChartWidgetMapper, jnc.o strategyWidgetMapper, jlc.s roboFooterDisclaimersWidgetMapper, z buttonMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(projectionChartWidgetMapper, "projectionChartWidgetMapper");
        Intrinsics.checkNotNullParameter(strategyWidgetMapper, "strategyWidgetMapper");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetMapper, "roboFooterDisclaimersWidgetMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        this.f144213b = input;
        this.f144214c = headerMapper;
        this.d = projectionChartWidgetMapper;
        this.e = strategyWidgetMapper;
        this.f = roboFooterDisclaimersWidgetMapper;
        this.f144215g = buttonMapper;
    }
}
