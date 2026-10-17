package lp6;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.FeedbackConfig;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanAttributes;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanRoamingAllowances;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberOption;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberTiers;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanHighlightGroup;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanHighlightItem;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanHighlights;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanNetworkProvider;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummary;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItemGroup;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingCredentialIssuer;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPacInfo;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyInfo;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyTerms;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingSwitchStrategy;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsFee;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsLimits;
import com.revolut.retail.feature.esim.api.model.EsimPortingStep;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberCancellationPreview;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import com.revolut.retail.feature.esim.api.model.EsimTermsConsent;
import d0j.c0;
import d0j.r;
import dej.a1;
import dej.c1;
import dej.d1;
import dej.e1;
import dej.g1;
import dej.h1;
import dej.i1;
import dej.v3;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kfj.a2;
import kfj.a4;
import kfj.a5;
import kfj.b5;
import kfj.c2;
import kfj.c3;
import kfj.c5;
import kfj.d2;
import kfj.e0;
import kfj.e2;
import kfj.f0;
import kfj.f2;
import kfj.h2;
import kfj.i2;
import kfj.j1;
import kfj.j2;
import kfj.l2;
import kfj.m1;
import kfj.n;
import kfj.n0;
import kfj.n1;
import kfj.o0;
import kfj.o1;
import kfj.p0;
import kfj.p1;
import kfj.q;
import kfj.q0;
import kfj.q1;
import kfj.s2;
import kfj.t0;
import kfj.t1;
import kfj.u1;
import kfj.v0;
import kfj.v1;
import kfj.w1;
import kfj.x;
import kfj.x0;
import kfj.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import mel.i0;
import nfj.a0;
import nfj.b0;
import nfj.d0;
import nfj.p;
import nfj.u;
import nfj.u0;
import nfj.y0;
import nfj.z0;
import t7h.s;
import wim.z;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f198938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f198939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f198939x = obj2;
    }

    private final Object b(Object obj2) {
        ArrayList arrayList;
        String str;
        n nVar;
        Long l2;
        boolean z;
        boolean z3;
        ArrayList arrayList2;
        String str2;
        String str3;
        p0 p0Var;
        p0 p0Var2;
        String str4;
        char c2;
        v0 v0Var;
        q0 q0Var;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        nfj.n nVar2 = (nfj.n) this.v;
        List list = (List) this.f198938w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        p pVar = (p) this.f198939x;
        ue0.c cVar = pVar.f215013c;
        String strC = pVar.c(nVar2);
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            EsimDataPlan esimDataPlan = (EsimDataPlan) it8.next();
            Intrinsics.checkNotNullParameter(esimDataPlan, "<this>");
            String str5 = esimDataPlan.f100212a;
            EsimCoverage esimCoverage = esimDataPlan.f100221p;
            String str6 = esimDataPlan.f100213b;
            dej.m mVar = esimDataPlan.f100214c;
            String strName = mVar != null ? mVar.name() : null;
            dej.l lVar = esimDataPlan.d;
            String strName2 = lVar != null ? lVar.name() : null;
            jo3.a aVarP = mo3.a.p(esimDataPlan.e);
            String str7 = strName2;
            String str8 = esimDataPlan.f;
            EsimDataPlanOfferInfo esimDataPlanOfferInfo = esimDataPlan.f100224s;
            kfj.p pVarB = esimDataPlanOfferInfo != null ? ofj.c.b(esimDataPlanOfferInfo) : null;
            boolean z4 = esimDataPlan.f100223r;
            Long l3 = esimDataPlan.f100215g;
            String strA = ofj.b.a(esimCoverage);
            String str9 = esimCoverage.getF100209b().f100235a;
            String f100210c = esimCoverage.getF100210c();
            List f100208a = esimCoverage.getF100208a();
            Iterator it9 = it8;
            ArrayList arrayList7 = new ArrayList(w.t(f100208a, 10));
            Iterator it10 = f100208a.iterator();
            while (it10.hasNext()) {
                arrayList7.add(((wi0.b) it10.next()).f297794a);
            }
            EsimDataPlanAttributes esimDataPlanAttributes = esimDataPlan.f100225t;
            if (esimDataPlanAttributes != null) {
                Intrinsics.checkNotNullParameter(esimDataPlanAttributes, "<this>");
                Boolean bool = esimDataPlanAttributes.f100228a;
                Integer num = esimDataPlanAttributes.f100229b;
                arrayList = arrayList7;
                Boolean bool2 = esimDataPlanAttributes.f100230c;
                wi0.b bVar = esimDataPlanAttributes.d;
                str = str5;
                nVar = new n(bool, num, bool2, bVar != null ? new kfj.m(bVar.f297794a) : null);
            } else {
                arrayList = arrayList7;
                str = str5;
                nVar = null;
            }
            EsimMobilePlanPointsOption esimMobilePlanPointsOption = esimDataPlan.u;
            t0 t0VarK = esimMobilePlanPointsOption != null ? ksj.b.K(esimMobilePlanPointsOption) : null;
            Long l4 = esimDataPlan.f100216h;
            Long l5 = esimDataPlan.i;
            boolean z6 = esimDataPlan.f100217j;
            boolean z11 = esimDataPlan.k;
            boolean z12 = esimDataPlan.f100218l;
            Long l22 = esimDataPlan.f100219m;
            Period period = esimDataPlan.f100220n;
            String string = period != null ? period.toString() : null;
            Period period2 = esimDataPlan.o;
            String string2 = period2 != null ? period2.toString() : null;
            List list3 = esimDataPlan.f100222q;
            if (list3 != null) {
                Intrinsics.checkNotNullParameter(list3, "<this>");
                List list4 = list3;
                l2 = l5;
                z = z6;
                z3 = z11;
                ArrayList arrayList8 = new ArrayList(w.t(list4, 10));
                Iterator it11 = list4.iterator();
                while (it11.hasNext()) {
                    EsimDataPlanRoamingAllowances esimDataPlanRoamingAllowances = (EsimDataPlanRoamingAllowances) it11.next();
                    Intrinsics.checkNotNullParameter(esimDataPlanRoamingAllowances, "<this>");
                    String str10 = esimDataPlanRoamingAllowances.f100247a;
                    Iterator it12 = it11;
                    Long l31 = esimDataPlanRoamingAllowances.f100248b;
                    Long l37 = esimDataPlanRoamingAllowances.f100249c;
                    Long l39 = esimDataPlanRoamingAllowances.d;
                    boolean z29 = esimDataPlanRoamingAllowances.e;
                    boolean z31 = esimDataPlanRoamingAllowances.f;
                    boolean z41 = esimDataPlanRoamingAllowances.f100250g;
                    EsimCoverage esimCoverage2 = esimDataPlanRoamingAllowances.f100251h;
                    String str11 = esimCoverage2.getF100209b().f100235a;
                    String strA2 = ofj.b.a(esimCoverage2);
                    List f100208a2 = esimCoverage2.getF100208a();
                    boolean z49 = z12;
                    ArrayList arrayList9 = new ArrayList(w.t(f100208a2, 10));
                    Iterator it13 = f100208a2.iterator();
                    while (it13.hasNext()) {
                        arrayList9.add(((wi0.b) it13.next()).f297794a);
                    }
                    arrayList8.add(new q(str10, l31, l37, l39, z29, z31, z41, strA2, str11, arrayList9));
                    it11 = it12;
                    z12 = z49;
                }
                arrayList2 = arrayList8;
            } else {
                l2 = l5;
                z = z6;
                z3 = z11;
                arrayList2 = null;
            }
            boolean z54 = z12;
            EsimMobilePlanHighlights esimMobilePlanHighlights = esimDataPlan.v;
            if (esimMobilePlanHighlights != null) {
                Intrinsics.checkNotNullParameter(esimMobilePlanHighlights, "<this>");
                List list5 = esimMobilePlanHighlights.f100297a;
                if (list5 != null) {
                    List list6 = list5;
                    arrayList4 = new ArrayList(w.t(list6, 10));
                    Iterator it14 = list6.iterator();
                    while (it14.hasNext()) {
                        arrayList4.add(ofj.j.b((EsimMobilePlanSummaryItem) it14.next()));
                    }
                } else {
                    arrayList4 = null;
                }
                List list7 = esimMobilePlanHighlights.f100298b;
                if (list7 != null) {
                    List list8 = list7;
                    arrayList5 = new ArrayList(w.t(list8, 10));
                    Iterator it15 = list8.iterator();
                    while (it15.hasNext()) {
                        EsimMobilePlanHighlightGroup esimMobilePlanHighlightGroup = (EsimMobilePlanHighlightGroup) it15.next();
                        Intrinsics.checkNotNullParameter(esimMobilePlanHighlightGroup, "<this>");
                        List list9 = esimMobilePlanHighlightGroup.f100293a;
                        Iterator it16 = it15;
                        String str12 = strName;
                        ArrayList arrayList10 = new ArrayList(w.t(list9, 10));
                        Iterator it17 = list9.iterator();
                        while (it17.hasNext()) {
                            EsimMobilePlanHighlightItem esimMobilePlanHighlightItem = (EsimMobilePlanHighlightItem) it17.next();
                            Intrinsics.checkNotNullParameter(esimMobilePlanHighlightItem, "<this>");
                            Iterator it18 = it17;
                            String str13 = esimMobilePlanHighlightItem.f100294a;
                            String str14 = str7;
                            EsimIcon esimIcon = esimMobilePlanHighlightItem.f100295b;
                            f0 f0VarC = esimIcon != null ? ofj.g.c(esimIcon) : null;
                            EsimInfoBottomSheetData esimInfoBottomSheetData = esimMobilePlanHighlightItem.f100296c;
                            arrayList10.add(new o0(str13, f0VarC, esimInfoBottomSheetData != null ? ofj.i.b(esimInfoBottomSheetData) : null));
                            it17 = it18;
                            str7 = str14;
                        }
                        arrayList5.add(new n0(arrayList10));
                        it15 = it16;
                        strName = str12;
                    }
                } else {
                    arrayList5 = null;
                }
                str2 = strName;
                str3 = str7;
                p0Var = new p0(arrayList4, arrayList5);
            } else {
                str2 = strName;
                str3 = str7;
                p0Var = null;
            }
            EsimMobilePlanSummary esimMobilePlanSummary = esimDataPlan.f100226w;
            if (esimMobilePlanSummary != null) {
                Intrinsics.checkNotNullParameter(esimMobilePlanSummary, "<this>");
                String str15 = esimMobilePlanSummary.f100310a;
                String str16 = esimMobilePlanSummary.f100311b;
                List list10 = esimMobilePlanSummary.f100312c;
                if (list10 != null) {
                    List list11 = list10;
                    arrayList3 = new ArrayList(w.t(list11, 10));
                    Iterator it19 = list11.iterator();
                    while (it19.hasNext()) {
                        EsimMobilePlanSummaryItemGroup esimMobilePlanSummaryItemGroup = (EsimMobilePlanSummaryItemGroup) it19.next();
                        Intrinsics.checkNotNullParameter(esimMobilePlanSummaryItemGroup, "<this>");
                        String str17 = esimMobilePlanSummaryItemGroup.f100316a;
                        ArrayList arrayList11 = esimMobilePlanSummaryItemGroup.f100317b;
                        p0 p0Var3 = p0Var;
                        Iterator it20 = it19;
                        String str18 = str6;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        Iterator it21 = arrayList11.iterator();
                        while (it21.hasNext()) {
                            arrayList12.add(ofj.j.b((EsimMobilePlanSummaryItem) it21.next()));
                        }
                        arrayList3.add(new x0(str17, arrayList12));
                        p0Var = p0Var3;
                        str6 = str18;
                        it19 = it20;
                    }
                } else {
                    arrayList3 = null;
                }
                p0Var2 = p0Var;
                str4 = str6;
                c2 = '\n';
                v0Var = new v0(str15, str16, arrayList3);
            } else {
                p0Var2 = p0Var;
                str4 = str6;
                c2 = '\n';
                v0Var = null;
            }
            EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider = esimDataPlan.f100227x;
            if (esimMobilePlanNetworkProvider != null) {
                Intrinsics.checkNotNullParameter(esimMobilePlanNetworkProvider, "<this>");
                q0Var = new q0(esimMobilePlanNetworkProvider.f100299a, esimMobilePlanNetworkProvider.f100300b);
            } else {
                q0Var = null;
            }
            q0 q0Var2 = q0Var;
            String str19 = str3;
            arrayList6.add(new kfj.o(str, str2, str19, str4, aVarP, str8, l3, l4, l2, Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z54), l22, string, string2, strA, str9, f100210c, arrayList2, z4, pVarB, arrayList, nVar, t0VarK, p0Var2, v0Var, q0Var2));
            it8 = it9;
        }
        cVar.G(arrayList6, strC, kii.e.o(kfj.o.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp6.g.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        String str = (String) this.v;
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = (EsimSubscriptionPhoneNumber) this.f198938w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((u0) this.f198939x).f215054c.G(ofj.p.n(esimSubscriptionPhoneNumber), j6.a.q("PHONE_NUMBER_KEY", str), z.d(kotlin.jvm.internal.o0.b(a4.class)));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        Iterator it8;
        n1 n1Var;
        kfj.w wVar;
        f2 f2Var;
        ArrayList arrayList;
        p1 p1Var;
        ArrayList arrayList2;
        boolean z;
        ArrayList arrayList3;
        kfj.f fVar;
        kfj.f fVar2;
        String str;
        t1 t1Var;
        u1 u1Var;
        o1 o1Var;
        q1 q1Var;
        a2 a2Var;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        m1 m1Var;
        nfj.q0 q0Var = (nfj.q0) this.v;
        List list = (List) this.f198938w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        u0 u0Var = (u0) this.f198939x;
        ue0.c cVar = u0Var.f215054c;
        String strA = u0Var.a(q0Var);
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        int i = 10;
        ArrayList arrayList9 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            EsimPhoneNumberSelections esimPhoneNumberSelections = (EsimPhoneNumberSelections) it9.next();
            Intrinsics.checkNotNullParameter(esimPhoneNumberSelections, "<this>");
            List list3 = esimPhoneNumberSelections.f100407a;
            EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b;
            Intrinsics.checkNotNullParameter(esimPhoneNumberSelectionOptions, "<this>");
            EsimPhoneNumberPorting esimPhoneNumberPorting = esimPhoneNumberSelectionOptions.f100404a;
            if (esimPhoneNumberPorting != null) {
                Intrinsics.checkNotNullParameter(esimPhoneNumberPorting, "<this>");
                boolean z3 = esimPhoneNumberPorting.f100331a;
                ArrayList arrayList10 = esimPhoneNumberPorting.f100332b;
                ArrayList arrayList11 = new ArrayList(w.t(arrayList10, i));
                Iterator it10 = arrayList10.iterator();
                while (it10.hasNext()) {
                    arrayList11.add(((wi0.b) it10.next()).f297794a);
                }
                List list4 = esimPhoneNumberPorting.f100333c;
                if (list4 != null) {
                    List list5 = list4;
                    arrayList = new ArrayList(w.t(list5, i));
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        arrayList.add(((a1) it11.next()).name());
                    }
                } else {
                    arrayList = null;
                }
                String str2 = esimPhoneNumberPorting.d;
                ArrayList arrayList12 = esimPhoneNumberPorting.e;
                it8 = it9;
                ArrayList arrayList13 = new ArrayList(w.t(arrayList12, i));
                Iterator it12 = arrayList12.iterator();
                while (it12.hasNext()) {
                    EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = (EsimPhoneNumberPortingInstruction) it12.next();
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingInstruction, "<this>");
                    arrayList13.add(new p1(esimPhoneNumberPortingInstruction.f100357a, esimPhoneNumberPortingInstruction.f100358b, ofj.f.a(esimPhoneNumberPortingInstruction.f100359c)));
                    it12 = it12;
                    str2 = str2;
                }
                String str3 = str2;
                EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction2 = esimPhoneNumberPorting.f;
                if (esimPhoneNumberPortingInstruction2 != null) {
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingInstruction2, "<this>");
                    p1Var = new p1(esimPhoneNumberPortingInstruction2.f100357a, esimPhoneNumberPortingInstruction2.f100358b, ofj.f.a(esimPhoneNumberPortingInstruction2.f100359c));
                } else {
                    p1Var = null;
                }
                EsimCheckoutPortingSteps esimCheckoutPortingSteps = esimPhoneNumberPorting.f100334g;
                if (esimCheckoutPortingSteps != null) {
                    Intrinsics.checkNotNullParameter(esimCheckoutPortingSteps, "<this>");
                    String str4 = esimCheckoutPortingSteps.f100193a;
                    String str5 = esimCheckoutPortingSteps.f100194b;
                    ArrayList arrayList14 = esimCheckoutPortingSteps.f100195c;
                    arrayList2 = arrayList13;
                    z = z3;
                    ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                    Iterator it13 = arrayList14.iterator();
                    while (it13.hasNext()) {
                        EsimPortingStep esimPortingStep = (EsimPortingStep) it13.next();
                        Intrinsics.checkNotNullParameter(esimPortingStep, "<this>");
                        arrayList15.add(new s2(esimPortingStep.f100416a, esimPortingStep.f100418c.name(), ofj.f.a(esimPortingStep.f100417b)));
                        it13 = it13;
                        arrayList11 = arrayList11;
                    }
                    arrayList3 = arrayList11;
                    fVar = new kfj.f(str4, str5, arrayList15);
                } else {
                    arrayList2 = arrayList13;
                    z = z3;
                    arrayList3 = arrayList11;
                    fVar = null;
                }
                String str6 = esimPhoneNumberPorting.f100335h;
                EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = esimPhoneNumberPorting.i;
                if (esimPhoneNumberPortingPacInfo != null) {
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingPacInfo, "<this>");
                    a1 a1Var = esimPhoneNumberPortingPacInfo.f100369a;
                    String strName = a1Var != null ? a1Var.name() : null;
                    String str7 = esimPhoneNumberPortingPacInfo.f100370b;
                    String str8 = esimPhoneNumberPortingPacInfo.f100371c;
                    e0 e0VarA = ofj.f.a(esimPhoneNumberPortingPacInfo.d);
                    w1 w1VarM = ofj.k.m(esimPhoneNumberPortingPacInfo.f100372g);
                    EsimHyperText esimHyperText = esimPhoneNumberPortingPacInfo.e;
                    e0 e0VarA2 = esimHyperText != null ? ofj.f.a(esimHyperText) : null;
                    EsimPhoneNumberPortingCredentialIssuer esimPhoneNumberPortingCredentialIssuer = esimPhoneNumberPortingPacInfo.f;
                    if (esimPhoneNumberPortingCredentialIssuer != null) {
                        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingCredentialIssuer, "<this>");
                        fVar2 = fVar;
                        m1Var = new m1(esimPhoneNumberPortingCredentialIssuer.f100348a, esimPhoneNumberPortingCredentialIssuer.f100349b);
                    } else {
                        fVar2 = fVar;
                        m1Var = null;
                    }
                    ArrayList arrayList16 = esimPhoneNumberPortingPacInfo.f100373h;
                    str = str6;
                    ArrayList arrayList17 = new ArrayList(w.t(arrayList16, 10));
                    Iterator it14 = arrayList16.iterator();
                    while (it14.hasNext()) {
                        arrayList17.add(ofj.k.n((EsimPhoneNumberPortingScheduleOption) it14.next()));
                    }
                    t1Var = new t1(strName, str7, str8, e0VarA, e0VarA2, m1Var, w1VarM, arrayList17, ofj.k.j(esimPhoneNumberPortingPacInfo.i));
                } else {
                    fVar2 = fVar;
                    str = str6;
                    t1Var = null;
                }
                EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = esimPhoneNumberPorting.f100336j;
                if (esimPhoneNumberPortingPowerOfAttorneyInfo != null) {
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingPowerOfAttorneyInfo, "<this>");
                    a1 a1Var2 = esimPhoneNumberPortingPowerOfAttorneyInfo.f100374a;
                    String strName2 = a1Var2 != null ? a1Var2.name() : null;
                    String str9 = esimPhoneNumberPortingPowerOfAttorneyInfo.f100375b;
                    String str10 = esimPhoneNumberPortingPowerOfAttorneyInfo.f100376c;
                    e0 e0VarA3 = ofj.f.a(esimPhoneNumberPortingPowerOfAttorneyInfo.d);
                    ArrayList<EsimPhoneNumberPortingServiceProvider> arrayList18 = esimPhoneNumberPortingPowerOfAttorneyInfo.e;
                    ArrayList arrayList19 = new ArrayList(w.t(arrayList18, 10));
                    for (EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider : arrayList18) {
                        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingServiceProvider, "<this>");
                        arrayList19.add(new z1(esimPhoneNumberPortingServiceProvider.f100397a, esimPhoneNumberPortingServiceProvider.f100398b));
                        str9 = str9;
                    }
                    String str11 = str9;
                    ArrayList arrayList20 = esimPhoneNumberPortingPowerOfAttorneyInfo.f;
                    ArrayList arrayList21 = new ArrayList(w.t(arrayList20, 10));
                    Iterator it15 = arrayList20.iterator();
                    while (it15.hasNext()) {
                        arrayList21.add(ofj.k.l((EsimPhoneNumberPortingOwnerAccountType) it15.next()));
                    }
                    ArrayList arrayList22 = esimPhoneNumberPortingPowerOfAttorneyInfo.f100377g;
                    ArrayList arrayList23 = new ArrayList(w.t(arrayList22, 10));
                    Iterator it16 = arrayList22.iterator();
                    while (it16.hasNext()) {
                        arrayList23.add(ofj.k.k((EsimPhoneNumberPortingContractType) it16.next()));
                    }
                    w1 w1VarM2 = ofj.k.m(esimPhoneNumberPortingPowerOfAttorneyInfo.f100378h);
                    EsimPhoneNumberPortingPowerOfAttorneyTerms esimPhoneNumberPortingPowerOfAttorneyTerms = esimPhoneNumberPortingPowerOfAttorneyInfo.i;
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingPowerOfAttorneyTerms, "<this>");
                    EsimHyperText esimHyperText2 = esimPhoneNumberPortingPowerOfAttorneyTerms.f100379a;
                    e0 e0VarA4 = esimHyperText2 != null ? ofj.f.a(esimHyperText2) : null;
                    EsimHyperText esimHyperText3 = esimPhoneNumberPortingPowerOfAttorneyTerms.f100380b;
                    u1Var = new u1(strName2, str11, str10, e0VarA3, arrayList19, arrayList21, arrayList23, w1VarM2, new v1(e0VarA4, esimHyperText3 != null ? ofj.f.a(esimHyperText3) : null));
                } else {
                    u1Var = null;
                }
                EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = esimPhoneNumberPorting.k;
                if (esimPhoneNumberPortingDynamicForm != null) {
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingDynamicForm, "<this>");
                    a1 a1Var3 = esimPhoneNumberPortingDynamicForm.f100350a;
                    String strName3 = a1Var3 != null ? a1Var3.name() : null;
                    String str12 = esimPhoneNumberPortingDynamicForm.f100351b;
                    String str13 = esimPhoneNumberPortingDynamicForm.f100352c;
                    e0 e0VarA5 = ofj.f.a(esimPhoneNumberPortingDynamicForm.d);
                    EsimHyperText esimHyperText4 = esimPhoneNumberPortingDynamicForm.e;
                    e0 e0VarA6 = esimHyperText4 != null ? ofj.f.a(esimHyperText4) : null;
                    Boolean boolValueOf = Boolean.valueOf(esimPhoneNumberPortingDynamicForm.f);
                    List list6 = esimPhoneNumberPortingDynamicForm.f100353g;
                    if (list6 != null) {
                        List<EsimPhoneNumberPortingServiceProvider> list7 = list6;
                        ArrayList arrayList24 = new ArrayList(w.t(list7, 10));
                        for (EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider2 : list7) {
                            Intrinsics.checkNotNullParameter(esimPhoneNumberPortingServiceProvider2, "<this>");
                            arrayList24.add(new z1(esimPhoneNumberPortingServiceProvider2.f100397a, esimPhoneNumberPortingServiceProvider2.f100398b));
                            str12 = str12;
                        }
                        arrayList4 = arrayList24;
                    } else {
                        arrayList4 = null;
                    }
                    String str14 = str12;
                    List list8 = esimPhoneNumberPortingDynamicForm.f100354h;
                    if (list8 != null) {
                        List list9 = list8;
                        ArrayList arrayList25 = new ArrayList(w.t(list9, 10));
                        Iterator it17 = list9.iterator();
                        while (it17.hasNext()) {
                            arrayList25.add(ofj.k.l((EsimPhoneNumberPortingOwnerAccountType) it17.next()));
                        }
                        arrayList5 = arrayList25;
                    } else {
                        arrayList5 = null;
                    }
                    List list10 = esimPhoneNumberPortingDynamicForm.i;
                    if (list10 != null) {
                        List list11 = list10;
                        ArrayList arrayList26 = new ArrayList(w.t(list11, 10));
                        Iterator it18 = list11.iterator();
                        while (it18.hasNext()) {
                            arrayList26.add(ofj.k.k((EsimPhoneNumberPortingContractType) it18.next()));
                        }
                        arrayList6 = arrayList26;
                    } else {
                        arrayList6 = null;
                    }
                    List list12 = esimPhoneNumberPortingDynamicForm.f100355j;
                    if (list12 != null) {
                        List list13 = list12;
                        ArrayList arrayList27 = new ArrayList(w.t(list13, 10));
                        Iterator it19 = list13.iterator();
                        while (it19.hasNext()) {
                            arrayList27.add(ofj.k.n((EsimPhoneNumberPortingScheduleOption) it19.next()));
                        }
                        arrayList7 = arrayList27;
                    } else {
                        arrayList7 = null;
                    }
                    w1 w1VarM3 = ofj.k.m(esimPhoneNumberPortingDynamicForm.k);
                    List list14 = esimPhoneNumberPortingDynamicForm.f100356l;
                    if (list14 != null) {
                        List list15 = list14;
                        ArrayList arrayList28 = new ArrayList(w.t(list15, 10));
                        Iterator it20 = list15.iterator();
                        while (it20.hasNext()) {
                            arrayList28.add(ofj.k.j((EsimPhoneNumberPortingAttribute) it20.next()));
                        }
                        arrayList8 = arrayList28;
                    } else {
                        arrayList8 = null;
                    }
                    o1Var = new o1(strName3, str14, str13, e0VarA5, e0VarA6, boolValueOf, arrayList4, arrayList5, arrayList6, arrayList7, w1VarM3, arrayList8);
                } else {
                    o1Var = null;
                }
                EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = esimPhoneNumberPorting.f100337l;
                if (esimPhoneNumberPortingOtp != null) {
                    Intrinsics.checkNotNullParameter(esimPhoneNumberPortingOtp, "<this>");
                    a1 a1Var4 = esimPhoneNumberPortingOtp.f100360a;
                    String strName4 = a1Var4 != null ? a1Var4.name() : null;
                    String str15 = esimPhoneNumberPortingOtp.f100361b;
                    String str16 = esimPhoneNumberPortingOtp.f100362c;
                    e0 e0VarA7 = ofj.f.a(esimPhoneNumberPortingOtp.d);
                    boolean z4 = esimPhoneNumberPortingOtp.e;
                    j1 j1VarJ = ofj.k.j(esimPhoneNumberPortingOtp.f);
                    String str17 = esimPhoneNumberPortingOtp.f100363g;
                    EsimHyperText esimHyperText5 = esimPhoneNumberPortingOtp.f100364h;
                    e0 e0VarA8 = esimHyperText5 != null ? ofj.f.a(esimHyperText5) : null;
                    EsimPhoneNumberPortingSwitchStrategy esimPhoneNumberPortingSwitchStrategy = esimPhoneNumberPortingOtp.i;
                    if (esimPhoneNumberPortingSwitchStrategy != null) {
                        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingSwitchStrategy, "<this>");
                        String str18 = esimPhoneNumberPortingSwitchStrategy.f100399a;
                        a1 a1Var5 = esimPhoneNumberPortingSwitchStrategy.f100400b;
                        a2Var = new a2(str18, a1Var5 != null ? a1Var5.name() : null);
                    } else {
                        a2Var = null;
                    }
                    q1Var = new q1(strName4, str15, str16, e0VarA7, z4, j1VarJ, str17, e0VarA8, a2Var);
                } else {
                    q1Var = null;
                }
                n1Var = new n1(z, arrayList3, arrayList, arrayList2, p1Var, fVar2, str3, str, t1Var, u1Var, o1Var, q1Var);
            } else {
                it8 = it9;
                n1Var = null;
            }
            c3 c3Var = esimPhoneNumberSelectionOptions.f100405b != null ? c3.f183405a : null;
            EsimFeaturedPhoneNumberOption esimFeaturedPhoneNumberOption = esimPhoneNumberSelectionOptions.f100406c;
            if (esimFeaturedPhoneNumberOption != null) {
                Intrinsics.checkNotNullParameter(esimFeaturedPhoneNumberOption, "<this>");
                ArrayList<EsimFeaturedPhoneNumberTiers> arrayList29 = esimFeaturedPhoneNumberOption.f100256a;
                ArrayList arrayList30 = new ArrayList(w.t(arrayList29, 10));
                for (EsimFeaturedPhoneNumberTiers esimFeaturedPhoneNumberTiers : arrayList29) {
                    Intrinsics.checkNotNullParameter(esimFeaturedPhoneNumberTiers, "<this>");
                    long j2 = esimFeaturedPhoneNumberTiers.f100257a;
                    String str19 = esimFeaturedPhoneNumberTiers.f100258b;
                    String str20 = esimFeaturedPhoneNumberTiers.f100259c;
                    EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = esimFeaturedPhoneNumberTiers.d;
                    arrayList30.add(new x(j2, str19, str20, esimPhoneNumberSelectionsFee != null ? ofj.k.o(esimPhoneNumberSelectionsFee) : null));
                }
                wVar = new kfj.w(arrayList30);
            } else {
                wVar = null;
            }
            EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee2 = esimPhoneNumberSelectionOptions.d;
            e2 e2VarO = esimPhoneNumberSelectionsFee2 != null ? ofj.k.o(esimPhoneNumberSelectionsFee2) : null;
            EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits = esimPhoneNumberSelectionOptions.e;
            if (esimPhoneNumberSelectionsLimits != null) {
                Intrinsics.checkNotNullParameter(esimPhoneNumberSelectionsLimits, "<this>");
                f2Var = new f2(esimPhoneNumberSelectionsLimits.f100412a, esimPhoneNumberSelectionsLimits.f100413b);
            } else {
                f2Var = null;
            }
            arrayList9.add(new d2(list3, new c2(c3Var, n1Var, wVar, e2VarO, f2Var)));
            it9 = it8;
            i = 10;
        }
        cVar.G(arrayList9, strA, kii.e.o(d2.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        String str;
        c5 c5Var;
        y0 y0Var = (y0) this.v;
        List list = (List) this.f198938w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ue0.c cVar = ((z0) this.f198939x).f215079c;
        String strA = z0.a(y0Var);
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            c1 c1Var = (c1) it8.next();
            Intrinsics.checkNotNullParameter(c1Var, "<this>");
            String str2 = c1Var.f113504a;
            h1 h1Var = c1Var.f113506c;
            String str3 = "UNKNOWN";
            if (h1Var.equals(h1.a.f113547a)) {
                str = "PRICING_PLAN_BENEFIT";
            } else {
                if (!h1Var.equals(h1.b.f113548a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "UNKNOWN";
            }
            g1 g1Var = c1Var.d;
            if (g1Var.equals(g1.a.f113537a)) {
                str3 = "AVAILABLE";
            } else if (g1Var.equals(g1.b.f113538a)) {
                str3 = "EXHAUSTED";
            } else if (g1Var.equals(g1.c.f113539a)) {
                str3 = "PRICING_PLAN_CHANGE_NEEDED";
            } else if (!g1Var.equals(g1.d.f113540a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = c1Var.f113505b;
            i1 i1Var = c1Var.e;
            l2 l2Var = i1Var != null ? new l2(i1Var.f113556a, i1Var.f113557b, i1Var.f113558c) : null;
            e1 e1Var = c1Var.f;
            i2 i2Var = e1Var != null ? new i2(e1Var.f113527a, e1Var.f113528b, e1Var.f113529c) : null;
            d1 d1Var = c1Var.f113507g;
            String str5 = d1Var.f113519a;
            EsimCoverage esimCoverage = d1Var.f113522g;
            String str6 = d1Var.f113520b;
            jo3.a aVarP = mo3.a.p(d1Var.f113521c);
            dej.l lVar = d1Var.d;
            String strName = lVar != null ? lVar.name() : null;
            String string = d1Var.e.toString();
            Iterator it9 = it8;
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            long j2 = d1Var.f;
            String f100210c = esimCoverage.getF100210c();
            String strA2 = ofj.b.a(esimCoverage);
            String str7 = esimCoverage.getF100209b().f100235a;
            List f100208a = esimCoverage.getF100208a();
            ArrayList arrayList2 = new ArrayList(w.t(f100208a, 10));
            Iterator it10 = f100208a.iterator();
            while (it10.hasNext()) {
                arrayList2.add(((wi0.b) it10.next()).f297794a);
            }
            h2 h2Var = new h2(str5, str6, aVarP, strName, string, j2, f100210c, strA2, str7, arrayList2);
            EsimTerms esimTerms = c1Var.f113508h;
            Intrinsics.checkNotNullParameter(esimTerms, "<this>");
            e0 e0VarA = ofj.f.a(esimTerms.f100526a);
            EsimHyperText esimHyperText = esimTerms.f100527b;
            e0 e0VarA2 = esimHyperText != null ? ofj.f.a(esimHyperText) : null;
            EsimHyperText esimHyperText2 = esimTerms.f100528c;
            e0 e0VarA3 = esimHyperText2 != null ? ofj.f.a(esimHyperText2) : null;
            Boolean boolValueOf = Boolean.valueOf(esimTerms.d);
            long j3 = esimTerms.e;
            String str8 = esimTerms.f;
            List list3 = esimTerms.f100529g;
            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
            Iterator it11 = list3.iterator();
            while (it11.hasNext()) {
                arrayList3.add(new a5(ofj.f.a(((EsimTermsConsent) it11.next()).f100530a)));
            }
            b5 b5Var = new b5(e0VarA, e0VarA2, e0VarA3, boolValueOf, j3, str8, arrayList3);
            v3 v3Var = c1Var.i;
            if (v3Var != null) {
                Intrinsics.checkNotNullParameter(v3Var, "<this>");
                c5Var = new c5(v3Var.f113671a, v3Var.f113672b, v3Var.f113673c, v3Var.d);
            } else {
                c5Var = null;
            }
            arrayList.add(new j2(str2, str, str3, l2Var, i2Var, str4, h2Var, b5Var, c5Var));
            it8 = it9;
        }
        cVar.G(arrayList, strA, kii.e.o(j2.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                g gVar = new g((m) this.f198939x, (Continuation) obj4, 0);
                gVar.v = (d) obj2;
                gVar.f198938w = (FeedbackConfig) obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g((lrk.o) this.f198939x, (Continuation) obj4, 1);
                gVar2.v = (String) obj2;
                gVar2.f198938w = (mel.m) obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
            case 2:
                g gVar3 = new g((lrk.o) this.f198939x, (Continuation) obj4, 2);
                gVar3.v = (String) obj2;
                gVar3.f198938w = (mel.p) obj3;
                return gVar3.invokeSuspend(Unit.f186387a);
            case 3:
                g gVar4 = new g((lrk.o) this.f198939x, (Continuation) obj4, 3);
                gVar4.v = (String) obj2;
                gVar4.f198938w = (List) obj3;
                return gVar4.invokeSuspend(Unit.f186387a);
            case 4:
                g gVar5 = new g((lrk.o) this.f198939x, (Continuation) obj4, 4);
                gVar5.v = (String) obj2;
                gVar5.f198938w = (i0) obj3;
                return gVar5.invokeSuspend(Unit.f186387a);
            case 5:
                g gVar6 = new g((lvb.c) this.f198939x, (Continuation) obj4, 5);
                gVar6.v = (Data) obj2;
                gVar6.f198938w = (Set) obj3;
                return gVar6.invokeSuspend(Unit.f186387a);
            case 6:
                g gVar7 = new g((lyd.p) this.f198939x, (Continuation) obj4, 6);
                gVar7.v = (Data) obj2;
                gVar7.f198938w = (Data) obj3;
                return gVar7.invokeSuspend(Unit.f186387a);
            case 7:
                g gVar8 = new g((mgl.f) this.f198939x, (Continuation) obj4, 7);
                gVar8.v = (String) obj2;
                gVar8.f198938w = (rel.a) obj3;
                return gVar8.invokeSuspend(Unit.f186387a);
            case 8:
                g gVar9 = new g((nki.a) this.f198938w, (String) this.f198939x, (Continuation) obj4);
                gVar9.v = (Throwable) obj3;
                return gVar9.invokeSuspend(Unit.f186387a);
            case 9:
                g gVar10 = new g((mqc.k) this.f198939x, (Continuation) obj4, 9);
                gVar10.v = (String) obj2;
                gVar10.f198938w = (bqc.j) obj3;
                return gVar10.invokeSuspend(Unit.f186387a);
            case 10:
                g gVar11 = new g((mtj.q) this.f198939x, (Continuation) obj4, 10);
                gVar11.v = (RewardsHubChallengeDetailsParams) obj2;
                gVar11.f198938w = (d0j.k) obj3;
                return gVar11.invokeSuspend(Unit.f186387a);
            case 11:
                g gVar12 = new g((mtj.q) this.f198939x, (Continuation) obj4, 11);
                gVar12.v = (d0j.l) obj2;
                gVar12.f198938w = (d0j.q) obj3;
                return gVar12.invokeSuspend(Unit.f186387a);
            case 12:
                g gVar13 = new g((mtj.q) this.f198939x, (Continuation) obj4, 12);
                gVar13.v = (String) obj2;
                gVar13.f198938w = (r) obj3;
                return gVar13.invokeSuspend(Unit.f186387a);
            case 13:
                g gVar14 = new g((mtj.q) this.f198939x, (Continuation) obj4, 13);
                gVar14.v = (String) obj2;
                gVar14.f198938w = (c0) obj3;
                return gVar14.invokeSuspend(Unit.f186387a);
            case 14:
                g gVar15 = new g((mtj.q) this.f198939x, (Continuation) obj4, 14);
                gVar15.v = (String) obj2;
                gVar15.f198938w = (List) obj3;
                return gVar15.invokeSuspend(Unit.f186387a);
            case 15:
                g gVar16 = new g((mw7.c) this.f198939x, (Continuation) obj4, 15);
                gVar16.v = (mw7.b) obj2;
                gVar16.f198938w = (com.revolut.feature.insurance_home.impl.data.model.f) obj3;
                return gVar16.invokeSuspend(Unit.f186387a);
            case 16:
                g gVar17 = new g((n4d.m) this.f198939x, (Continuation) obj4, 16);
                gVar17.v = (Pair) obj2;
                gVar17.f198938w = (ogd.a) obj3;
                return gVar17.invokeSuspend(Unit.f186387a);
            case 17:
                g gVar18 = new g((lal.a) this.f198939x, (Continuation) obj4, 17);
                gVar18.v = (t7h.d) obj2;
                gVar18.f198938w = (WealthMarginBorrowingInterest) obj3;
                return gVar18.invokeSuspend(Unit.f186387a);
            case 18:
                g gVar19 = new g((n7h.b) this.f198939x, (Continuation) obj4, 18);
                gVar19.v = (s) obj2;
                gVar19.f198938w = (WealthMarginStatus) obj3;
                return gVar19.invokeSuspend(Unit.f186387a);
            case 19:
                g gVar20 = new g((n8a.o) this.f198939x, (Continuation) obj4, 19);
                gVar20.v = (AccountId) obj2;
                gVar20.f198938w = (List) obj3;
                return gVar20.invokeSuspend(Unit.f186387a);
            case 20:
                g gVar21 = new g((nf5.d) this.f198939x, (Continuation) obj4, 20);
                gVar21.v = (List) obj2;
                gVar21.f198938w = (List) obj3;
                return gVar21.invokeSuspend(Unit.f186387a);
            case 21:
                g gVar22 = new g((p) this.f198939x, (Continuation) obj4, 21);
                gVar22.v = (nfj.n) obj2;
                gVar22.f198938w = (List) obj3;
                return gVar22.invokeSuspend(Unit.f186387a);
            case 22:
                g gVar23 = new g((u) this.f198939x, (Continuation) obj4, 22);
                gVar23.v = (List) obj2;
                gVar23.f198938w = (List) obj3;
                return gVar23.invokeSuspend(Unit.f186387a);
            case 23:
                g gVar24 = new g((b0) this.f198939x, (Continuation) obj4, 23);
                gVar24.v = (a0) obj2;
                gVar24.f198938w = (dej.b0) obj3;
                return gVar24.invokeSuspend(Unit.f186387a);
            case 24:
                g gVar25 = new g((nfj.e0) this.f198939x, (Continuation) obj4, 24);
                gVar25.v = (d0) obj2;
                gVar25.f198938w = (List) obj3;
                return gVar25.invokeSuspend(Unit.f186387a);
            case 25:
                g gVar26 = new g((u0) this.f198939x, (Continuation) obj4, 25);
                gVar26.v = (String) obj2;
                gVar26.f198938w = (EsimSubscriptionPhoneNumberCancellationPreview) obj3;
                return gVar26.invokeSuspend(Unit.f186387a);
            case 26:
                g gVar27 = new g((u0) this.f198939x, (Continuation) obj4, 26);
                gVar27.v = (String) obj2;
                gVar27.f198938w = (EsimSubscriptionPhoneNumber) obj3;
                return gVar27.invokeSuspend(Unit.f186387a);
            case 27:
                g gVar28 = new g((u0) this.f198939x, (Continuation) obj4, 27);
                gVar28.v = (nfj.q0) obj2;
                gVar28.f198938w = (List) obj3;
                return gVar28.invokeSuspend(Unit.f186387a);
            case 28:
                g gVar29 = new g((z0) this.f198939x, (Continuation) obj4, 28);
                gVar29.v = (y0) obj2;
                gVar29.f198938w = (List) obj3;
                return gVar29.invokeSuspend(Unit.f186387a);
            default:
                g gVar30 = new g((nfj.m1) this.f198939x, (Continuation) obj4, 29);
                gVar30.v = (dej.m) obj2;
                gVar30.f198938w = (List) obj3;
                return gVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bf  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 3520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp6.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nki.a aVar, String str, Continuation continuation) {
        super(3, continuation);
        this.u = 8;
        this.f198938w = aVar;
        this.f198939x = str;
    }
}
