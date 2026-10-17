package plc;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartWithHeaderAndLegendView;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step$Modal$CustomizationMenu;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step$Modal$TabsOrderSettings;
import com.revolut.feature.robo.impl.data.network.TemplateService;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import efm.d0;
import ipe.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import org.joda.time.Instant;
import pfk.o0;
import pij.d1;
import pqg.i0;
import vlc.b;
import zhm.h0;
import zhm.v;
import zhm.w;
import zlc.a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 14;
        int i2 = 10;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f) {
            case 0:
                String templateId = (String) obj2;
                Intrinsics.checkNotNullParameter(templateId, "p0");
                j jVar = (j) this.receiver;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                d0<vlc.d> template = jVar.f237339a.getTemplate(templateId);
                pjg.i iVar = new pjg.i(new i(1, jVar.f237340b, vlc.g.class, "toDomain", "toDomain$feature_robo_impl_release(Lcom/revolut/feature/robo/impl/data/network/model/templates/TemplateDto;)Lcom/revolut/feature/wealth/models/robo/Template;", 0, 3), 7);
                template.getClass();
                ufm.i iVar2 = new ufm.i(template, iVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 1:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "p0");
                j jVar2 = (j) this.receiver;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "templateId");
                wlc.f fVar = jVar2.f237341c;
                Intrinsics.checkNotNullParameter(id10, "id");
                vlc.d dVar = (vlc.d) fVar.f298473a.T2(j6.a.q("TEMPLATE_", id10), wlc.f.f298472b);
                if (dVar != null) {
                    return vlc.g.d(dVar);
                }
                return null;
            case 2:
                String templateId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(templateId2, "p0");
                j jVar3 = (j) this.receiver;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(templateId2, "templateId");
                return (Template) jVar3.d.j(templateId2);
            case 3:
                vlc.d p0 = (vlc.d) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((vlc.g) this.receiver).getClass();
                return vlc.g.d(p0);
            case 4:
                p params = (p) obj2;
                Intrinsics.checkNotNullParameter(params, "p0");
                l lVar = (l) this.receiver;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                if (!(params instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                d0<List<vlc.d>> templatesByPortfolio = lVar.f237344a.getTemplatesByPortfolio(((o) params).f237352a);
                pjg.i iVar3 = new pjg.i(new d1(lVar, i), 8);
                templatesByPortfolio.getClass();
                ufm.i iVar4 = new ufm.i(templatesByPortfolio, iVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 5:
                p params2 = (p) obj2;
                Intrinsics.checkNotNullParameter(params2, "p0");
                l lVar2 = (l) this.receiver;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                wlc.i iVar5 = lVar2.f237346c;
                Intrinsics.checkNotNullParameter(params2, "params");
                wlc.h hVar = (wlc.h) iVar5.f298476a.T2(j6.a.q("TEMPLATES_", params2.a()), wlc.i.f298475b);
                List templates = hVar != null ? hVar.getTemplates() : null;
                if (templates != null) {
                    List list = templates;
                    arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(vlc.g.d((vlc.d) it8.next()));
                    }
                }
                return arrayList;
            case 6:
                p params3 = (p) obj2;
                Intrinsics.checkNotNullParameter(params3, "p0");
                l lVar3 = (l) this.receiver;
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(params3, "params");
                return (List) lVar3.d.j(params3);
            case 7:
                alc.b params4 = (alc.b) obj2;
                Intrinsics.checkNotNullParameter(params4, "p0");
                n nVar = (n) this.receiver;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(params4, "params");
                d0<vlc.a> templateDrawdown = nVar.f237349a.getTemplateDrawdown(params4.f6187a, nVar.f237350b.g(params4.f6188b), params4.f6189c);
                pjg.i iVar6 = new pjg.i(new i(1, nVar.d, ylc.c.class, "toDomain", "toDomain$feature_robo_impl_release(Lcom/revolut/feature/robo/impl/data/network/model/templates/DrawdownChartDto;)Lcom/revolut/feature/wealth/models/drawdown/DrawdownChart;", 0, 10), 9);
                templateDrawdown.getClass();
                ufm.i iVar7 = new ufm.i(templateDrawdown, iVar6, 1);
                Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                return iVar7;
            case 8:
                alc.b params5 = (alc.b) obj2;
                Intrinsics.checkNotNullParameter(params5, "p0");
                n nVar2 = (n) this.receiver;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(params5, "params");
                ej9.c cVar = nVar2.f237351c;
                Intrinsics.checkNotNullParameter(params5, "params");
                vlc.a aVar = (vlc.a) cVar.f126792a.T2(pyd.c.g0(params5), vlc.a.class);
                if (aVar != null) {
                    return ylc.c.a(aVar);
                }
                return null;
            case 9:
                alc.b params6 = (alc.b) obj2;
                Intrinsics.checkNotNullParameter(params6, "p0");
                n nVar3 = (n) this.receiver;
                nVar3.getClass();
                Intrinsics.checkNotNullParameter(params6, "params");
                return (sdh.b) nVar3.e.j(params6);
            case 10:
                vlc.a p03 = (vlc.a) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ylc.c) this.receiver).getClass();
                return ylc.c.a(p03);
            case 11:
                vlc.b performanceChartDto = (vlc.b) obj2;
                Intrinsics.checkNotNullParameter(performanceChartDto, "p0");
                ((vlc.g) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(performanceChartDto, "performanceChartDto");
                Instant instant = new Instant(performanceChartDto.getStart());
                Instant instant2 = new Instant(performanceChartDto.getEnd());
                Long lB = performanceChartDto.getLastUpdated();
                Instant instant3 = lB != null ? new Instant(lB.longValue()) : new Instant();
                List<b.a> listC = performanceChartDto.getPoints();
                ArrayList arrayList2 = new ArrayList(w.t(listC, 10));
                for (b.a aVar2 : listC) {
                    arrayList2.add(new pdh.a(new Instant(aVar2.getTimestamp()), aVar2.getReturns(), aVar2.getTotalReturns(), aVar2.getBenchmark()));
                }
                return new pdh.b(instant, instant2, instant3, arrayList2);
            case 12:
                alc.c params7 = (alc.c) obj2;
                Intrinsics.checkNotNullParameter(params7, "p0");
                r rVar = (r) this.receiver;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(params7, "params");
                TemplateService templateService = rVar.f237355a;
                String str = params7.f6190a;
                vlc.g gVar = rVar.f237356b;
                pdh.c cVar2 = params7.f6191b;
                d0<vlc.b> templatePerformance = templateService.getTemplatePerformance(str, gVar.g(cVar2), params7.f6192c, cVar2 == pdh.c.YEAR_TO_DATE);
                pjg.i iVar8 = new pjg.i(new i(1, gVar, vlc.g.class, "toDomain", "toDomain$feature_robo_impl_release(Lcom/revolut/feature/robo/impl/data/network/model/templates/PerformanceChartDto;)Lcom/revolut/feature/wealth/models/PerformanceChart;", 0, 11), i2);
                templatePerformance.getClass();
                ufm.i iVar9 = new ufm.i(templatePerformance, iVar8, 1);
                Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                return iVar9;
            case 13:
                alc.c params8 = (alc.c) obj2;
                Intrinsics.checkNotNullParameter(params8, "p0");
                r rVar2 = (r) this.receiver;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(params8, "params");
                wlc.d dVar2 = rVar2.f237357c;
                Intrinsics.checkNotNullParameter(params8, "params");
                ue0.c cVar3 = dVar2.f298471a;
                wlc.d.Companion.getClass();
                zlc.a performanceChart = (zlc.a) cVar3.T2(wlc.c.a(params8), zlc.a.class);
                if (performanceChart == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
                Instant instant4 = new Instant(performanceChart.getStart());
                Instant instant5 = new Instant(performanceChart.getEnd());
                Instant instant6 = new Instant(performanceChart.getLastUpdated());
                List<a.C1793a> listC2 = performanceChart.getPoints();
                ArrayList arrayList3 = new ArrayList(w.t(listC2, 10));
                for (a.C1793a c1793a : listC2) {
                    arrayList3.add(new pdh.a(new Instant(c1793a.getTimestamp()), c1793a.getReturns(), c1793a.getTotalReturns(), c1793a.getBenchmark()));
                }
                return new pdh.b(instant4, instant5, instant6, arrayList3);
            case 14:
                alc.c params9 = (alc.c) obj2;
                Intrinsics.checkNotNullParameter(params9, "p0");
                r rVar3 = (r) this.receiver;
                rVar3.getClass();
                Intrinsics.checkNotNullParameter(params9, "params");
                return (pdh.b) rVar3.d.j(params9);
            case 15:
                Throwable p010 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar3 = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) this.receiver;
                lpe.d dVar3 = aVar3.f90233q;
                int i3 = 2;
                if (Intrinsics.f(aVar3.f90234r.W(p010), d.a.f167742a)) {
                    TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = aVar3.o;
                    wi0.b countryCode = taxResidencyDeclarationFlowContract$InputData.f90216a;
                    AnalyticsProduct analyticsProduct = taxResidencyDeclarationFlowContract$InputData.e;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    CountryClause countryClause = new CountryClause(countryCode, null);
                    ActionsBottomSheetController actionsBottomSheetControllerA = lpe.d.a(new TextLocalisedClause(R$string.tin_flow_primary_residency_dialog_title, null, null, 14), new TextLocalisedClause(R$string.tin_flow_primary_residency_dialog_description, v.k(countryClause, countryClause), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), analyticsProduct);
                    pp5.d onResult = new pp5.d(aVar3, 5);
                    Intrinsics.checkNotNullParameter(actionsBottomSheetControllerA, "<this>");
                    Intrinsics.checkNotNullParameter(onResult, "onResult");
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    llh.j block = new llh.j(ref$BooleanRef, onResult, 15);
                    Intrinsics.checkNotNullParameter(block, "block");
                    actionsBottomSheetControllerA.H = block;
                    actionsBottomSheetControllerA.k2(new lea.b(ref$BooleanRef, onResult, 17));
                    yji.l.j2(aVar3, actionsBottomSheetControllerA, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                } else {
                    ppe.g gVar2 = new ppe.g(aVar3, i3);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, p010, h0Var);
                    yji.l.a1(aVar3, aVar3.X1(dVar3.b(p010, false)), null, null, new o0((Object) gVar2, (Continuation) (objArr == true ? 1 : 0), 29), 3);
                }
                return Boolean.TRUE;
            case 16:
                Throwable p011 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                return Boolean.valueOf(((i0) this.receiver).D2(p011));
            case 17:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return Boolean.valueOf(((i0) this.receiver).D2(p012));
            case 18:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                return Boolean.valueOf(((i0) this.receiver).D2(p013));
            case 19:
                MainContainerFlowContract$Step p014 = (MainContainerFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                MainContainerFlow mainContainerFlow = (MainContainerFlow) this.receiver;
                if (p014 instanceof MainContainerFlowContract$Step.Tab) {
                    mainContainerFlow.O.b(((MainContainerFlowContract$Step.Tab) p014).f83436a.f83420a);
                } else {
                    KProperty[] kPropertyArr = MainContainerFlow.T;
                    mainContainerFlow.getClass();
                    if (!Intrinsics.f(p014, MainContainerFlowContract$Step$Modal$TabsOrderSettings.f83435a) && !Intrinsics.f(p014, MainContainerFlowContract$Step$Modal$CustomizationMenu.f83434a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 20:
                od9.i p015 = (od9.i) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                ((com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.receiver).V2(p015);
                return Unit.f186387a;
            case 21:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 22:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 23:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 24:
                StackedChartWithHeaderAndLegendView.b((StackedChartWithHeaderAndLegendView) this.receiver, ((yhm.m) obj2).f314193a);
                return Unit.f186387a;
            case 25:
                qua.p p016 = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return ((pva.d) this.receiver).b(p016);
            case 26:
                vvc.l p017 = (vvc.l) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.I2((com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.receiver, p017);
                return Unit.f186387a;
            case 27:
                vvc.l p018 = (vvc.l) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.I2((com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.receiver, p018);
                return Unit.f186387a;
            case 28:
                th1.d p019 = (th1.d) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.security_hub.impl.ui.street_mode.flow.b bVar = (com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.receiver;
                if (p019 instanceof th1.b) {
                    bVar.B2();
                } else {
                    bVar.getClass();
                    if (!(p019 instanceof th1.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.n2(new pnf.f(bVar, p019, objArr2 == true ? 1 : 0, 22), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                rvc.i p020 = (rvc.i) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.security_hub.impl.ui.street_mode.flow.b bVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.receiver;
                if (p020 instanceof rvc.h) {
                    oki.h.D2(bVar2.f85671s);
                } else {
                    bVar2.getClass();
                    if (!Intrinsics.f(p020, rvc.g.f257745a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.B2();
                    bVar2.f85669q.getClass();
                    bVar2.X1(new mii.k("RENAME_SUCCESS_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_toast_location_renamed, null, null, 14), null, null, null, 28));
                }
                return Unit.f186387a;
        }
    }
}
