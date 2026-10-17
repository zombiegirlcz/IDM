package ej9;

import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.data.model.Data;
import ej9.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.d1;
import zh9.r0;
import zh9.s0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f126816b;

    public /* synthetic */ j(p pVar, int i) {
        this.f126815a = i;
        this.f126816b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r0 r0Var;
        String str;
        dj9.o oVar;
        hi9.c fVar;
        switch (this.f126815a) {
            case 0:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                return this.f126816b.c(plans);
            case 1:
                List plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                return this.f126816b.c(plans2);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                od0.i iVar = (od0.i) data.getContent();
                if (iVar == null || (r0Var = (r0) iVar.f224257a) == null) {
                    r0Var = (r0) data2.getContent();
                }
                Throwable error = data.getError();
                Throwable error2 = data2.getError();
                this.f126816b.getClass();
                return new Data(r0Var, p.a(error, error2), data.getLoading() || data2.getLoading());
            case 3:
                Intrinsics.checkNotNullParameter((d.b) obj2, "<unused var>");
                gi9.c cVar = this.f126816b.f126822b;
                efm.r map = RxRoom.createObservable(cVar.f144100a, true, new String[]{"repayments", "plan_preferences", "plans"}, new gd3.i(cVar, 19)).map(new eif.h(new ej6.x(9), 18));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 4:
                String planId = (String) obj2;
                Intrinsics.checkNotNullParameter(planId, "id");
                ne0.d dVar = this.f126816b.f126823c;
                Intrinsics.checkNotNullParameter(planId, "planId");
                return (s0) dVar.get("PLAN_DETAILS_:" + planId);
            case 5:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                hi9.b bVar = (hi9.b) zhm.d0.d0((List) DBUtil.performBlocking(this.f126816b.f126822b.f144100a, true, false, new g58.h(id10, 24)));
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                return new s0(bVar.f152542b);
            case 6:
                m request = (m) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                request.getClass();
                p pVar = this.f126816b;
                hi9.n nVar = (hi9.n) DBUtil.performBlocking(pVar.f126822b.f144100a, true, false, new ghk.r(13));
                efm.d0<List<dj9.o>> payLaterPlans = pVar.f126821a.getPayLaterPlans(200, nVar != null ? Long.valueOf(nVar.f152570b) : null);
                eif.h hVar = new eif.h(new j(pVar, 1), 24);
                payLaterPlans.getClass();
                efm.b bVarIgnoreElements = new sfm.b(payLaterPlans, hVar, 2).doOnNext(new eif.h(new j(pVar, 11), 25)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                pfm.z zVarD = bVarIgnoreElements.D(Unit.f186387a);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return zVarD;
            case 7:
                d.b key = (d.b) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                ne0.d dVar2 = this.f126816b.f126823c;
                key.getClass();
                return (List) dVar2.get("PAY_LATER_PLANS");
            case 8:
                String planId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(planId2, "planId");
                gi9.c cVar2 = this.f126816b.f126822b;
                efm.r map2 = RxRoom.createObservable(cVar2.f144100a, true, new String[]{"repayments", "plan_preferences", "plans"}, new gbi.c(cVar2, planId2, 21)).map(new eif.h(new ej6.x(8), 26));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            case 9:
                String planId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(planId3, "planId");
                ne0.d dVar3 = this.f126816b.f126823c;
                Intrinsics.checkNotNullParameter(planId3, "planId");
                return (od0.i) dVar3.get("PLAN_ID_:" + planId3);
            case 10:
                n params = (n) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                ne0.d dVar4 = this.f126816b.f126823c;
                String transactionId = params.f126819a;
                String facilityId = params.f126820b;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return (List) dVar4.get("REPAYMENTS_PARTS:" + facilityId + "-" + transactionId);
            case 11:
                List list = (List) obj2;
                Intrinsics.h(list);
                if (!list.isEmpty()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        dj9.o oVar2 = (dj9.o) it8.next();
                        Intrinsics.checkNotNullParameter(oVar2, "<this>");
                        Intrinsics.checkNotNullParameter(oVar2, "<this>");
                        String id11 = oVar2.getId();
                        String facilityId2 = oVar2.getFacilityId();
                        String transactionId2 = oVar2.getTransactionId();
                        String merchantName = oVar2.getMerchantName();
                        if (merchantName == null) {
                            merchantName = "";
                        }
                        String merchantLogoUrl = oVar2.getMerchantLogoUrl();
                        String merchantLogoName = oVar2.getMerchantLogoName();
                        String merchantCategory = oVar2.getMerchantCategory();
                        long startDateTime = oVar2.getStartDateTime();
                        long updateDateTime = oVar2.getUpdateDateTime();
                        long amount = oVar2.getAmount();
                        long paidAmount = oVar2.getPaidAmount();
                        long remainingAmount = oVar2.getRemainingAmount();
                        Long revPoints = oVar2.getRevPoints();
                        long fee2 = oVar2.getFee();
                        String currency = oVar2.getCurrency();
                        String state = oVar2.getState();
                        boolean isLimitWithdrawn = oVar2.getIsLimitWithdrawn();
                        String feeType = oVar2.getFeeType();
                        String origin = oVar2.getOrigin();
                        String countryCode = oVar2.getCountryCode();
                        String instalmentType = oVar2.getInstalmentType();
                        String string = oVar2.getTermFeeRate().toString();
                        List list3 = list;
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        long minFeeAmount = oVar2.getMinFeeAmount();
                        String cancellationOrigin = oVar2.getCancellationOrigin();
                        Integer rescheduleCount = oVar2.getRescheduleCount();
                        String withdrawalTransactionId = oVar2.getWithdrawalTransactionId();
                        dj9.n feeDetails = oVar2.getFeeDetails();
                        Intrinsics.checkNotNullParameter(feeDetails, "<this>");
                        Iterator it9 = it8;
                        if (feeDetails instanceof dj9.m) {
                            dj9.m mVar = (dj9.m) feeDetails;
                            str = string;
                            oVar = oVar2;
                            fVar = new hi9.j(mVar.getInterest(), mVar.getInterestRate());
                        } else {
                            str = string;
                            oVar = oVar2;
                            if (!(feeDetails instanceof dj9.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fVar = new hi9.f(((dj9.l) feeDetails).getAmount());
                        }
                        hi9.k kVar = new hi9.k(id11, facilityId2, transactionId2, merchantName, merchantLogoUrl, merchantLogoName, merchantCategory, startDateTime, updateDateTime, amount, paidAmount, remainingAmount, revPoints, fee2, currency, state, isLimitWithdrawn, feeType, origin, countryCode, instalmentType, str, minFeeAmount, cancellationOrigin, rescheduleCount, withdrawalTransactionId, fVar);
                        List<dj9.e> instalments = oVar.getInstalments();
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(instalments, 10));
                        for (dj9.e eVar : instalments) {
                            String planId4 = oVar.getId();
                            String currencyCode = oVar.getCurrency();
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            Intrinsics.checkNotNullParameter(planId4, "planId");
                            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                            arrayList2.add(new hi9.a(planId4, eVar.getIndex(), eVar.getDueDate(), eVar.getState(), currencyCode, eVar.getPaidDateTime(), eVar.getTransactionIds(), eVar.getAmount(), eVar.getRepaidAmount(), eVar.getFee(), eVar.getRepaidFee(), eVar.getLateInterest(), eVar.getRepaidLateInterest(), eVar.getIsOverLimit()));
                        }
                        arrayList.add(new ki9.a(kVar, arrayList2, new hi9.l(oVar.getId(), null)));
                        list = list3;
                        it8 = it9;
                    }
                    List list4 = list;
                    gi9.c cVar3 = this.f126816b.f126822b;
                    hi9.m mVar2 = hi9.n.Companion;
                    long jD = p.d(list4);
                    mVar2.getClass();
                    DBUtil.performBlocking(cVar3.f144100a, false, true, new g31.e(cVar3, 6, arrayList, new hi9.n("SINGLETON_ID", jD)));
                }
                return Unit.f186387a;
            default:
                n params2 = (n) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                List<hi9.o> list5 = (List) DBUtil.performBlocking(this.f126816b.f126822b.f144100a, true, false, new g58.h(params2.f126819a, 22));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
                for (hi9.o oVar3 : list5) {
                    Intrinsics.checkNotNullParameter(oVar3, "<this>");
                    arrayList3.add(new d1(oVar3.f152573c, oVar3.d, oVar3.e, oVar3.f, oVar3.f152571a, oVar3.f152572b));
                }
                return arrayList3;
        }
    }
}
