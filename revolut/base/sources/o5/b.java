package o5;

import android.view.View;
import androidx.content.NavController;
import androidx.content.NavControllerViewModelKt;
import androidx.content.NavDestination;
import androidx.content.NavGraph;
import androidx.content.NavGraphBuilder;
import androidx.content.NavOptionsBuilder;
import androidx.content.Navigation;
import androidx.content.Navigator;
import androidx.content.PopUpToBuilder;
import androidx.lifecycle.viewmodel.CreationExtras;
import c55.a0;
import c55.g0;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentData;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d55.f;
import efm.r;
import i55.c0;
import i55.f0;
import i55.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import n35.d;
import n35.e;
import n35.g;
import n35.h;
import n35.i;
import o45.x1;
import p35.e0;
import q35.s;
import z9h.n;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222302a;

    public /* synthetic */ b(int i) {
        this.f222302a = i;
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LoanRepaymentTerms.Breakdown breakdown;
        LoanRepaymentTerms.ScheduleInfo scheduleInfo;
        LoanRepaymentTerms.DateDifference dateDifference;
        LoanRepaymentTerms.DateDifference dateDifference2;
        LoanRepaymentTerms.Breakdown unhealthyFull;
        Set setI1;
        boolean z = true;
        obj = null;
        Object obj3 = null;
        switch (this.f222302a) {
            case 0:
                return NavController.handleDeepLink$lambda$21$lambda$20((PopUpToBuilder) obj2);
            case 1:
                return NavControllerViewModelKt.FACTORY$lambda$1$lambda$0((CreationExtras) obj2);
            case 2:
                return NavDestination.Companion._get_hierarchy_$lambda$1((NavDestination) obj2);
            case 3:
                return NavGraph.Companion.childHierarchy$lambda$0((NavDestination) obj2);
            case 4:
                return NavGraphBuilder.build$lambda$1$lambda$0((NavDestination) obj2);
            case 5:
                return Navigation.findViewNavController$lambda$2((View) obj2);
            case 6:
                return Navigation.findViewNavController$lambda$3((View) obj2);
            case 7:
                return Navigator.onLaunchSingleTop$lambda$3((NavOptionsBuilder) obj2);
            case 8:
                String str = (String) obj2;
                if (str != null && str.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                String str2 = (String) obj2;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                AutoPayRepaymentData it8 = (AutoPayRepaymentData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Data(it8, null, false, 6, null);
            case 11:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Data(null, it9, false, 1, null);
            case 12:
                List pref = (List) obj2;
                Intrinsics.checkNotNullParameter(pref, "pref");
                List list = pref;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList.add(((s) it10.next()).f241839a);
                }
                return arrayList;
            case 13:
                List preferences = (List) obj2;
                Intrinsics.checkNotNullParameter(preferences, "preferences");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : preferences) {
                    if (((x1) obj4).c()) {
                        arrayList2.add(obj4);
                    }
                }
                return d0.i1(arrayList2);
            case 14:
                Collection content = (Collection) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                Collection<x1> collection = content;
                ArrayList arrayList3 = new ArrayList(w.t(collection, 10));
                for (x1 x1Var : collection) {
                    Object obj5 = f.f111363a;
                    Intrinsics.checkNotNullParameter(x1Var, "<this>");
                    arrayList3.add(new s(x1Var.f222137a, x1Var.f222138b));
                }
                return arrayList3;
            case 15:
                Pair it11 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj6 = it11.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj6, "<get-first>(...)");
                Object obj7 = it11.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj7, "<get-second>(...)");
                return d0.E0((Iterable) obj7, (Collection) obj6);
            case 16:
                f0 it12 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj8 = g0.f21442a;
                Intrinsics.checkNotNullParameter(it12, "<this>");
                xi0.a aVar = xi0.b.Companion;
                String strD = it12.getCurrency();
                aVar.getClass();
                xi0.b bVarA = xi0.a.a(strD);
                String strH = it12.getToken();
                h hVar = (h) u1.u(it12.getType(), g0.f21442a);
                i iVar = (i) u1.u(it12.getVariant(), g0.f21443b);
                d dVar = (d) u1.u(it12.getBehaviour(), g0.f21444c);
                String strG = it12.getSettlementType();
                g gVar = strG != null ? (g) u1.u(strG, g0.d) : null;
                String strF = it12.getScheduleUpdateType();
                n35.f fVar = strF != null ? (n35.f) u1.u(strF, g0.e) : null;
                dj0.d dVar2 = new dj0.d(it12.getAmount(), bVarA);
                f0.b bVarC = it12.getBreakdown();
                if (bVarC != null) {
                    if (bVarC instanceof f0.b.C0909b) {
                        f0.b.C0909b c0909b = (f0.b.C0909b) bVarC;
                        Long lD = c0909b.getInnerBreakdown().getPrincipal();
                        dj0.d dVar3 = lD != null ? new dj0.d(lD.longValue(), bVarA) : null;
                        Long lE = c0909b.getInnerBreakdown().getRescheduledPrincipal();
                        dj0.d dVar4 = lE != null ? new dj0.d(lE.longValue(), bVarA) : null;
                        i55.b bVarC2 = c0909b.getInnerBreakdown().getInterest();
                        LoanAccrual loanAccrualA = bVarC2 != null ? d55.c.a(bVarC2, bVarA) : null;
                        i55.b bVarB = c0909b.getInnerBreakdown().getFee();
                        LoanAccrual loanAccrualA2 = bVarB != null ? d55.c.a(bVarB, bVarA) : null;
                        f0.b.a aVarA = c0909b.getInnerBreakdown().getBreakageFee();
                        unhealthyFull = new LoanRepaymentTerms.Breakdown.Healthy(dVar3, dVar4, loanAccrualA, loanAccrualA2, aVarA != null ? new dj0.d(aVarA.getAmount(), bVarA) : null);
                    } else if (bVarC instanceof f0.b.d) {
                        f0.b.d dVar5 = (f0.b.d) bVarC;
                        Long lE2 = dVar5.getInnerBreakdown().getPrincipal();
                        dj0.d dVar6 = lE2 != null ? new dj0.d(lE2.longValue(), bVarA) : null;
                        Long lC = dVar5.getInnerBreakdown().getMonthlyRepayment();
                        dj0.d dVar7 = lC != null ? new dj0.d(lC.longValue(), bVarA) : null;
                        Long lA = dVar5.getInnerBreakdown().getAdditionalRepayment();
                        dj0.d dVar8 = lA != null ? new dj0.d(lA.longValue(), bVarA) : null;
                        Long lD2 = dVar5.getInnerBreakdown().getOverdueRepayment();
                        dj0.d dVar9 = lD2 != null ? new dj0.d(lD2.longValue(), bVarA) : null;
                        f0.b.a aVarB = dVar5.getInnerBreakdown().getBreakageFee();
                        unhealthyFull = new LoanRepaymentTerms.Breakdown.UnhealthyPartial(dVar6, dVar7, dVar8, dVar9, aVarB != null ? new dj0.d(aVarB.getAmount(), bVarA) : null);
                    } else {
                        if (!(bVarC instanceof f0.b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f0.b.c cVar = (f0.b.c) bVarC;
                        Long lD3 = cVar.getInnerBreakdown().getPrincipal();
                        dj0.d dVar10 = lD3 != null ? new dj0.d(lD3.longValue(), bVarA) : null;
                        Long lE3 = cVar.getInnerBreakdown().getRescheduledPrincipal();
                        dj0.d dVar11 = lE3 != null ? new dj0.d(lE3.longValue(), bVarA) : null;
                        i55.b bVarB2 = cVar.getInnerBreakdown().getInterest();
                        LoanAccrual loanAccrualA3 = bVarB2 != null ? d55.c.a(bVarB2, bVarA) : null;
                        i55.b bVarC3 = cVar.getInnerBreakdown().getPenalty();
                        LoanAccrual loanAccrualA4 = bVarC3 != null ? d55.c.a(bVarC3, bVarA) : null;
                        f0.b.a aVarA2 = cVar.getInnerBreakdown().getBreakageFee();
                        unhealthyFull = new LoanRepaymentTerms.Breakdown.UnhealthyFull(dVar10, dVar11, loanAccrualA3, loanAccrualA4, aVarA2 != null ? new dj0.d(aVarA2.getAmount(), bVarA) : null);
                    }
                    breakdown = unhealthyFull;
                } else {
                    breakdown = null;
                }
                f0.d dVarE = it12.getScheduleInfo();
                if (dVarE != null) {
                    f0.a aVarD = dVarE.getNextRepayment();
                    LoanRepaymentTerms.AmountDifference amountDifferenceA = aVarD != null ? g0.a(aVarD, bVarA) : null;
                    f0.a aVarC = dVarE.getMonthlyRepayment();
                    LoanRepaymentTerms.AmountDifference amountDifferenceA2 = aVarC != null ? g0.a(aVarC, bVarA) : null;
                    f0.a aVarA3 = dVarE.getFinalRepayment();
                    LoanRepaymentTerms.AmountDifference amountDifferenceA3 = aVarA3 != null ? g0.a(aVarA3, bVarA) : null;
                    f0.c cVarE = dVarE.getNextRepaymentDate();
                    if (cVarE != null) {
                        LocalDate localDate = LocalDate.parse(cVarE.getCurrent());
                        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                        String strB = cVarE.getNew();
                        dateDifference = new LoanRepaymentTerms.DateDifference(localDate, strB != null ? LocalDate.parse(strB) : null);
                    } else {
                        dateDifference = null;
                    }
                    f0.c cVarB = dVarE.getFinalRepaymentDate();
                    if (cVarB != null) {
                        LocalDate localDate2 = LocalDate.parse(cVarB.getCurrent());
                        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                        String strB2 = cVarB.getNew();
                        dateDifference2 = new LoanRepaymentTerms.DateDifference(localDate2, strB2 != null ? LocalDate.parse(strB2) : null);
                    } else {
                        dateDifference2 = null;
                    }
                    scheduleInfo = new LoanRepaymentTerms.ScheduleInfo(amountDifferenceA, amountDifferenceA2, amountDifferenceA3, dateDifference, dateDifference2, (e) u1.u(dVarE.getRepaymentType(), g0.f));
                } else {
                    scheduleInfo = null;
                }
                return new LoanRepaymentTerms(strH, hVar, iVar, dVar, fVar, gVar, dVar2, breakdown, scheduleInfo);
            case 17:
                List repaymentEntities = (List) obj2;
                Intrinsics.checkNotNullParameter(repaymentEntities, "repaymentEntities");
                return zi0.c.P(knm.b.J(repaymentEntities), false, null, 3);
            case 18:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                Object content2 = data.getContent();
                if (((List) content2) != null && (!r4.isEmpty())) {
                    obj3 = content2;
                }
                List list2 = (List) obj3;
                if (list2 == null) {
                    list2 = (List) data2.getContent();
                }
                Throwable error2 = data.getError();
                if (error2 == null) {
                    error2 = data2.getError();
                }
                if (!data.getLoading() && !data2.getLoading()) {
                    z = false;
                }
                return new Data(list2, error2, z);
            case 20:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return knm.b.J(it13);
            case 21:
                t it14 = (t) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.getItems();
            case 22:
                c0 it15 = (c0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj9 = a0.f21422a;
                Intrinsics.checkNotNullParameter(it15, "<this>");
                dj0.d dVarO = mo3.a.o(it15.getMonthlyRepayment());
                LocalDate localDate3 = LocalDate.parse(it15.getFirstRepaymentDate());
                Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                dj0.d dVarO2 = mo3.a.o(it15.getFirstRepayment());
                LocalDate localDate4 = LocalDate.parse(it15.getLastRepaymentDate());
                Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
                String strF2 = it15.getNextScheduleRegenerationDate();
                return new LoanRepaymentDayChangeTerms(dVarO, localDate3, dVarO2, mo3.a.o(it15.getFinalRepaymentAmount()), localDate4, strF2 != null ? LocalDate.parse(strF2) : null, it15.getScheduleVersion(), (n35.c) u1.u(it15.getRepaymentType(), a0.f21422a));
            case 23:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Set set = (Set) pair2.f186385a;
                List list3 = (List) pair2.f186386b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj10 : list3) {
                    if (!set.contains(((e0) obj10).getId())) {
                        arrayList4.add(obj10);
                    }
                }
                return arrayList4;
            case 24:
                Data preferences2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(preferences2, "preferences");
                try {
                    Object content3 = preferences2.getContent();
                    if (content3 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj11 : (List) content3) {
                            if (((x1) obj11).c()) {
                                arrayList5.add(obj11);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        Iterator it16 = arrayList5.iterator();
                        while (it16.hasNext()) {
                            arrayList6.add(((x1) it16.next()).b());
                        }
                        setI1 = d0.i1(arrayList6);
                    } else {
                        setI1 = null;
                    }
                    return new Data(setI1, preferences2.getError(), preferences2.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, preferences2.getLoading());
                }
            case 25:
                Data transferQuoteData = (Data) obj2;
                Intrinsics.checkNotNullParameter(transferQuoteData, "transferQuoteData");
                try {
                    Object content4 = transferQuoteData.getContent();
                    return new Data(content4 != null ? pw5.a.H((nrf.c) content4) : null, transferQuoteData.getError(), transferQuoteData.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, transferQuoteData.getLoading());
                }
            case 26:
                OrderQuote quote = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return quote.f104755g.f104731a;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return x39.b.DISABLED;
            case 28:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                r rVarF = n.f(null, error3, false, 5, null);
                Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
                return rVarF;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
        }
    }
}
