package com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan;

import cli.n;
import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanAttributes;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import dej.m;
import dfj.w;
import dfj.z1;
import fgj.g;
import fij.d0;
import fij.e0;
import fij.o;
import fij.p;
import fij.q;
import fij.r;
import fij.t;
import fij.u;
import fij.v;
import fij.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ogm.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends h implements x {

    @NotNull
    public static final d0 Companion = new d0();
    public final ugc.a A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final vii.b D;
    public final EsimGetPlanScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f101008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f101009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oij.b f101010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oij.d f101011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f101012t;
    public final l61.a u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cej.b f101013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hij.f f101014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hij.d f101015y;
    public final hij.c z;

    public f(n stateMapper, EsimGetPlanScreenContract$InputData inputData, w dataPlansInteractor, z1 planGroupingInteractor, oij.b groupsToTabsMapper, oij.d plansToCoverageMapper, i selectionResolver, l61.a userCompanyInteractor, gte.a featureToggleInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, hij.f includedCountriesControllerMapper, hij.d abroadWarningBottomSheetControllerMapper, hij.c durationSelectionRequirementChecker, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dataPlansInteractor, "dataPlansInteractor");
        Intrinsics.checkNotNullParameter(planGroupingInteractor, "planGroupingInteractor");
        Intrinsics.checkNotNullParameter(groupsToTabsMapper, "groupsToTabsMapper");
        Intrinsics.checkNotNullParameter(plansToCoverageMapper, "plansToCoverageMapper");
        Intrinsics.checkNotNullParameter(selectionResolver, "selectionResolver");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(includedCountriesControllerMapper, "includedCountriesControllerMapper");
        Intrinsics.checkNotNullParameter(abroadWarningBottomSheetControllerMapper, "abroadWarningBottomSheetControllerMapper");
        Intrinsics.checkNotNullParameter(durationSelectionRequirementChecker, "durationSelectionRequirementChecker");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.o = inputData;
        this.f101008p = dataPlansInteractor;
        this.f101009q = planGroupingInteractor;
        this.f101010r = groupsToTabsMapper;
        this.f101011s = plansToCoverageMapper;
        this.f101012t = selectionResolver;
        this.u = userCompanyInteractor;
        this.v = featureToggleInteractor;
        this.f101013w = mobilePlansFeatureAvailabilityInteractor;
        this.f101014x = includedCountriesControllerMapper;
        this.f101015y = abroadWarningBottomSheetControllerMapper;
        this.z = durationSelectionRequirementChecker;
        this.A = giftRecipientNameResolver;
        this.B = mra.d.b(this, new EsimGetPlanScreenContract$DomainState(0), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new g(this, 6));
        this.D = new vii.b(w4l.i.f294643c);
    }

    public static void K2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimGetPlanScreenModel", null, illegalStateException, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fij.o S2(com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f r3, com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState r4, com.revolut.data.model.Data r5, fij.o r6, int r7) {
        /*
            r0 = r7 & 1
            if (r0 == 0) goto L6
            com.revolut.data.model.Data r5 = r4.e
        L6:
            r7 = r7 & 2
            if (r7 == 0) goto Lc
            fij.o r6 = r4.f100986a
        Lc:
            ogm.i r3 = r3.f101012t
            r3.getClass()
            java.lang.String r4 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.Object r4 = r5.getContent()
            java.util.List r4 = (java.util.List) r4
            r5 = 0
            if (r4 != 0) goto L20
            goto L7f
        L20:
            if (r6 == 0) goto L6b
            r7 = r4
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r0 = r7.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            r2 = r1
            fij.p r2 = (fij.p) r2
            fij.o r2 = r2.f135451a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r6)
            if (r2 == 0) goto L29
            goto L40
        L3f:
            r1 = r5
        L40:
            fij.p r1 = (fij.p) r1
            if (r1 != 0) goto L66
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r7.next()
            r1 = r0
            fij.p r1 = (fij.p) r1
            fij.o r1 = r1.f135451a
            dej.m r1 = ogm.i.d(r1)
            dej.m r2 = ogm.i.d(r6)
            if (r1 != r2) goto L48
            goto L63
        L62:
            r0 = r5
        L63:
            r1 = r0
            fij.p r1 = (fij.p) r1
        L66:
            if (r1 == 0) goto L6b
            fij.o r6 = r1.f135451a
            goto L6c
        L6b:
            r6 = r5
        L6c:
            if (r6 != 0) goto L80
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r3 = r3.f225222b
            afa.a r3 = (afa.a) r3
            java.lang.Object r3 = zhm.d0.t0(r4, r3)
            fij.p r3 = (fij.p) r3
            if (r3 == 0) goto L7f
            fij.o r3 = r3.f135451a
            return r3
        L7f:
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f.S2(com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f, com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState, com.revolut.data.model.Data, fij.o, int):fij.o");
    }

    @Override // yji.l
    public final void I1() {
        l2(new c(this, null), new yi5.b(26));
        l.a1(this, xam.a.h(new f9d.c(this, (Continuation) null, 20), this.B.B(new fg8.g(25))), null, null, new d(this, null), 3);
        l.a1(this, com.revolut.data.database.models.openbanking.d.y("EsimGetPlanScreenModel", "loadUserCompanyTillFinish", rd0.e.b(hng.g.b(((ang.b) this.u).f7765a))), null, null, new e(this, null), 3);
    }

    public final void I2(String str) {
        String str2;
        EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.o.f100995c;
        String str3 = null;
        EsimGetPlanLaunchMode.DataPlanChange dataPlanChange = esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.DataPlanChange ? (EsimGetPlanLaunchMode.DataPlanChange) esimGetPlanLaunchMode : null;
        if (dataPlanChange != null && (str2 = dataPlanChange.f100262a) != null) {
            if (((jte.d) this.v).c(EsimApi$Toggles.EsimChangeDataPlan.f100170c)) {
                str3 = str2;
            }
        }
        C2(new t(str, str3));
    }

    public final void J2(EsimDataPlan esimDataPlan) {
        Boolean boolValueOf;
        List list;
        if (!((efj.d) this.f101013w).a()) {
            I2(esimDataPlan.f100212a);
            return;
        }
        m mVar = esimDataPlan.f100214c;
        String str = esimDataPlan.f100212a;
        int i = mVar == null ? -1 : e0.f135444a[mVar.ordinal()];
        if (i != -1) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVar = this.B;
                p pVarE = ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).e();
                if (pVarE == null || (list = pVarE.f135453c) == null) {
                    boolValueOf = null;
                } else {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    List<EsimDataPlan> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        z = false;
                        boolValueOf = Boolean.valueOf(z);
                    } else {
                        for (EsimDataPlan esimDataPlan2 : list2) {
                            EsimDataPlanAttributes esimDataPlanAttributes = esimDataPlan2.f100225t;
                            if (pd.b.j(esimDataPlanAttributes != null ? esimDataPlanAttributes.f100228a : null) && esimDataPlan2.f100214c == m.MOBILE_PLAN) {
                                break;
                            }
                        }
                        z = false;
                        boolValueOf = Boolean.valueOf(z);
                    }
                }
                if (pd.b.j(boolValueOf)) {
                    EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.o.f100995c;
                    C2(new u(str, esimGetPlanLaunchMode != null ? esimGetPlanLaunchMode.getF100266a() : null));
                    return;
                } else {
                    List list3 = (List) ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f100989g.getContent();
                    C2(new v(str, list3 != null ? g4i.a.k(str, list3) : null));
                    return;
                }
            }
        }
        I2(str);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    public final void L2() {
        EsimGetPlanScreenContract$DomainState.CoverageOptions coverageOptions;
        if (pw5.a.k(this.o)) {
            y yVar = this.B;
            EsimGetPlanScreenContract$DomainState.CoverageOptions coverageOptions2 = ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).d;
            if (coverageOptions2 == null) {
                K2("Attempted to open destination picker with no coverage options");
                return;
            }
            if (!((efj.d) this.f101013w).a()) {
                if (!((jte.d) this.v).c(EsimApi$Toggles.EsimPurchaseScreenRedesign.f100181c)) {
                    o oVar = ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f100986a;
                    if (oVar == null) {
                        K2("Attempted to open destination picker but no tab is selected");
                        return;
                    }
                    if (oVar == fij.m.COUNTRY) {
                        coverageOptions = new EsimGetPlanScreenContract$DomainState.CoverageOptions(6, coverageOptions2.f100990a, null, null);
                    } else if (oVar == fij.m.REGIONAL) {
                        coverageOptions = new EsimGetPlanScreenContract$DomainState.CoverageOptions(5, null, coverageOptions2.f100991b, null);
                    } else if (oVar == fij.m.GLOBAL) {
                        coverageOptions = new EsimGetPlanScreenContract$DomainState.CoverageOptions(3, null, null, coverageOptions2.f100992c);
                    } else if (oVar != fij.m.ALL && !oVar.equals(fij.n.f135450a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coverageOptions2 = coverageOptions;
                }
            }
            if (coverageOptions2.f100992c.size() + coverageOptions2.f100991b.size() + coverageOptions2.f100990a.size() <= 1) {
                K2("Attempted to open destination picker with one or fewer destinations");
                return;
            }
            h.v2(this.C, new EsimGetPlanScreenContract$ModalStep.ChooseCoverage(coverageOptions2), ModalDestination.Style.POPUP.f98311a);
        }
    }

    public final void M2() {
        p pVarE = ((EsimGetPlanScreenContract$DomainState) ((j2) this.B.f22677a).getValue()).e();
        if (pVarE == null) {
            K2("Cannot proceed to checkout: no tab selected");
            return;
        }
        List list = pVarE.f135453c;
        EsimDataPlan esimDataPlan = pVarE.f135452b;
        boolean zA = this.z.a(esimDataPlan, list);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.C;
        if (!zA) {
            EsimDataPlanAttributes esimDataPlanAttributes = esimDataPlan.f100225t;
            wi0.b bVar = esimDataPlanAttributes != null ? esimDataPlanAttributes.d : null;
            if (bVar != null) {
                h.v2(aVar, new EsimGetPlanScreenContract$ModalStep.AbroadWarning(esimDataPlan, bVar), bottom_dialog);
                return;
            } else {
                J2(esimDataPlan);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (bfj.a.c((EsimDataPlan) obj2)) {
                arrayList.add(obj2);
            }
        }
        h.v2(aVar, new EsimGetPlanScreenContract$ModalStep.PlanDurationPicker(esimDataPlan.f100212a, arrayList), bottom_dialog);
    }

    public final void N2() {
        EsimDataPlan esimDataPlan;
        EsimCoverage esimCoverage;
        p pVarE = ((EsimGetPlanScreenContract$DomainState) ((j2) this.B.f22677a).getValue()).e();
        if (pVarE == null || (esimDataPlan = pVarE.f135452b) == null || (esimCoverage = esimDataPlan.f100221p) == null) {
            K2("Attempted to display locations for plan but no plan is selected");
        } else if ((esimCoverage instanceof EsimCoverage.Country) || (esimCoverage instanceof EsimCoverage.Undefined)) {
            K2("Attempted to display locations for unsupported coverage");
        } else {
            h.v2(this.C, new EsimGetPlanScreenContract$ModalStep.IncludedCountries(esimCoverage, true), ModalDestination.Style.POPUP.f98311a);
        }
    }

    public final void O2(int i) {
        p pVar;
        o oVar;
        ArrayList arrayList;
        y yVar = this.B;
        List list = (List) ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).e.getContent();
        Object obj2 = null;
        if (list == null) {
            list = null;
        } else if (!((jte.d) this.v).c(EsimApi$Toggles.EsimPurchaseScreenRedesign.f100181c)) {
            o oVar2 = ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f100986a;
            if (oVar2 instanceof fij.m) {
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((p) obj3).f135451a instanceof fij.m) {
                        arrayList.add(obj3);
                    }
                }
            } else if (oVar2 instanceof fij.n) {
                arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((p) obj4).f135451a instanceof fij.n) {
                        arrayList.add(obj4);
                    }
                }
            } else {
                if (oVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                list = null;
            }
            list = arrayList;
        }
        if (list == null || (pVar = (p) zhm.d0.e0(i, list)) == null || (oVar = pVar.f135451a) == null) {
            return;
        }
        H2(yVar, new eed.i(this, 18, oVar, obj2));
    }

    public final void P2(Object obj2) {
        boolean z = obj2 instanceof q;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.C;
        if (z) {
            h.v2(aVar, new EsimGetPlanScreenContract$ModalStep.IncludedCountries(((q) obj2).f135454a, false), ModalDestination.Style.POPUP.f98311a);
        } else if (obj2 instanceof r) {
            r rVar = (r) obj2;
            h.v2(aVar, new EsimGetPlanScreenContract$ModalStep.PlanFeatureInfoBottomSheet(rVar.f135456b, rVar.f135455a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final void Q2(Object obj2) {
        if (obj2 instanceof EsimDataPlan) {
            y yVar = this.B;
            o oVar = ((EsimGetPlanScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f100986a;
            if (oVar == null) {
                return;
            }
            H2(yVar, new fg8.y(oVar, (EsimDataPlan) obj2, 11));
        }
    }

    public final void R2(String selectedTabId) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Iterator it8 = zhm.d0.F0(fij.n.f135450a, fij.m.a()).iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((o) next).getValue(), selectedTabId)) {
                    break;
                }
            }
        }
        o oVar = (o) next;
        if (oVar == null) {
            return;
        }
        H2(this.B, new eed.i(this, 18, oVar, obj2));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
