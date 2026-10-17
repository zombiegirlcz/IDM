package pfk;

import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.pricingplans.models.PricingPlanSubscriptionBillingChange;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import com.revolut.feature.pricingplans.models.subscribe_info.PricingPlanSubscribeInfoIneligibilityReason;
import hha.x0;
import hha.y0;
import hha.z0;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.joda.time.DateTime;
import org.joda.time.Period;
import zek.z;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f235644b;

    public /* synthetic */ i0(p0 p0Var, int i) {
        this.f235643a = i;
        this.f235644b = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r25v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v75, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v76, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v77, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v78, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        hha.e eVar;
        ?? arrayList;
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo;
        lha.o oVar;
        hha.b0 b0Var;
        PricingPlanSubscriptionBillingChange pricingPlanSubscriptionBillingChange;
        lha.o oVar2;
        hha.e eVar2;
        Long lI;
        Integer num;
        int i;
        String str;
        String str2;
        String str3;
        ArrayList arrayList2;
        jha.c cVar;
        jha.c cVar2;
        BigDecimal largePercent;
        jha.b bVar;
        jha.d dVar;
        hha.w wVar;
        mha.k kVar;
        mha.k iVar;
        ?? arrayList3;
        ?? arrayList4;
        iha.w wVar2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        qha.g gVar;
        PricingPlanSubscribeInfoIneligibilityReason pricingPlanSubscribeInfoIneligibilityReason;
        String duration;
        x0 x0Var;
        hha.i iVar2;
        int i2 = this.f235643a;
        int i3 = 0;
        int i5 = 10;
        p0 p0Var = this.f235644b;
        switch (i2) {
            case 0:
                List pricingPlansEntity = (List) obj2;
                Intrinsics.checkNotNullParameter(pricingPlansEntity, "pricingPlansEntity");
                List list = pricingPlansEntity;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    zek.o oVar3 = (zek.o) it8.next();
                    Object obj3 = bfk.b.f15010a;
                    Intrinsics.checkNotNullParameter(oVar3, "<this>");
                    String str4 = oVar3.f321740a;
                    String str5 = oVar3.f321741b;
                    String str6 = oVar3.f321742c;
                    xi0.a aVar = xi0.b.Companion;
                    String str7 = oVar3.d;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str7);
                    List list2 = oVar3.f321743g;
                    ArrayList arrayList8 = new ArrayList(zhm.w.t(list2, i5));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList8.add(bfk.b.e((zek.p) it9.next()));
                    }
                    List<zek.g> list3 = oVar3.f321744h;
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(list3, i5));
                    for (zek.g gVar2 : list3) {
                        Intrinsics.checkNotNullParameter(gVar2, "<this>");
                        switch (bfk.a.f15008a[gVar2.getName().ordinal()]) {
                            case 1:
                                wVar = hha.w.EVERYDAY_BENEFITS;
                                break;
                            case 2:
                                wVar = hha.w.TRAVEL_BENEFITS;
                                break;
                            case 3:
                                wVar = hha.w.INSURANCE_BENEFITS;
                                break;
                            case 4:
                                wVar = hha.w.INVESTMENTS;
                                break;
                            case 5:
                                wVar = hha.w.TRAVEL_SAVINGS_AND_PROTECTION;
                                break;
                            case 6:
                                wVar = hha.w.FEATURES_FOR_YOU;
                                break;
                            case 7:
                                wVar = hha.w.UNKNOWN;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        hha.w wVar3 = wVar;
                        List features = gVar2.getIb.b.Features java.lang.String();
                        Iterator it10 = it8;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(features, i5));
                        Iterator it11 = features.iterator();
                        while (it11.hasNext()) {
                            arrayList10.add(bfk.b.e((zek.p) it11.next()));
                        }
                        arrayList9.add(new hha.v(wVar3, arrayList10));
                        it8 = it10;
                    }
                    Iterator it12 = it8;
                    List<zek.a> list4 = oVar3.i;
                    ArrayList arrayList11 = new ArrayList(zhm.w.t(list4, i5));
                    for (zek.a aVar2 : list4) {
                        Intrinsics.checkNotNullParameter(aVar2, "<this>");
                        arrayList11.add(new b93.j(new b93.b(aVar2.getCode()), aVar2.getBrand()));
                    }
                    List list5 = oVar3.f;
                    ArrayList arrayList12 = new ArrayList(zhm.w.t(list5, 10));
                    Iterator it13 = list5.iterator();
                    while (it13.hasNext()) {
                        arrayList12.add(bfk.b.a((zek.l) it13.next()));
                    }
                    List list6 = oVar3.f321745j;
                    ArrayList arrayList13 = new ArrayList(zhm.w.t(list6, 10));
                    Iterator it14 = list6.iterator();
                    while (it14.hasNext()) {
                        zek.u uVar = (zek.u) it14.next();
                        Intrinsics.checkNotNullParameter(uVar, "<this>");
                        Iterator it15 = it14;
                        oha.c cVar3 = new oha.c(uVar.getCode());
                        ArrayList arrayList14 = arrayList11;
                        oha.e eVar3 = new oha.e(uVar.getType());
                        double dC = uVar.getFee();
                        jo3.b bVarA2 = uVar.getAbsoluteFee();
                        dj0.d dVarV = bVarA2 != null ? hx7.a.v(bVarA2) : null;
                        Long lE = uVar.getLimit();
                        boolean zF = uVar.getRecurring();
                        jo3.b bVarD = uVar.getFeeMin();
                        arrayList13.add(new oha.a(cVar3, eVar3, dC, lE, zF, dVarV, bVarD != null ? hx7.a.v(bVarD) : null));
                        it14 = it15;
                        arrayList11 = arrayList14;
                    }
                    ArrayList arrayList15 = arrayList11;
                    String str8 = oVar3.e;
                    Period period = str8 != null ? Period.parse(str8) : null;
                    String str9 = oVar3.k;
                    hha.g0 g0Var = str9 != null ? (hha.g0) u1.u(str9, bfk.b.f15010a) : null;
                    Integer num2 = oVar3.f321746l;
                    int i6 = oVar3.f321747m;
                    int i21 = oVar3.f321748n;
                    zek.e eVar4 = oVar3.o;
                    if (eVar4 != null) {
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        BigDecimal smallPercent = eVar4.getSmallPercent();
                        if (smallPercent == null || (largePercent = eVar4.getLargePercent()) == null) {
                            num = num2;
                            i = i6;
                            str = str4;
                            str2 = str5;
                            str3 = str6;
                            arrayList2 = arrayList12;
                            cVar2 = null;
                        } else {
                            zek.d cap = eVar4.getCap();
                            num = num2;
                            if (cap != null) {
                                i = i6;
                                Long startDate = cap.getStartDate();
                                str = str4;
                                str2 = str5;
                                str3 = str6;
                                long amount = cap.getAmount();
                                xi0.a aVar3 = xi0.b.Companion;
                                String currency = cap.getCurrency();
                                aVar3.getClass();
                                arrayList2 = arrayList12;
                                bVar = new jha.b(startDate, new dj0.d(amount, xi0.a.a(currency)));
                            } else {
                                i = i6;
                                str = str4;
                                str2 = str5;
                                str3 = str6;
                                arrayList2 = arrayList12;
                                bVar = null;
                            }
                            LinkedHashMap linkedHashMap = nfk.b.f215084a;
                            String userRegion = eVar4.getUserRegion();
                            if (userRegion == null || (dVar = (jha.d) u1.v(userRegion, nfk.b.f215084a)) == null) {
                                dVar = jha.d.OTHER;
                            }
                            jha.d dVar2 = dVar;
                            zek.c boost = eVar4.getBoost();
                            cVar2 = new jha.c(smallPercent, largePercent, bVar, dVar2, boost != null ? new jha.a(new DateTime(boost.getEndDate()), boost.getLargePc(), boost.getSmallPc()) : null);
                        }
                        cVar = cVar2;
                    } else {
                        num = num2;
                        i = i6;
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                        arrayList2 = arrayList12;
                        cVar = null;
                    }
                    arrayList7.add(new hha.d(str, str2, str3, bVarA, arrayList8, arrayList9, arrayList15, arrayList2, arrayList13, period, g0Var, num, i, i21, cVar, oVar3.f321749p));
                    it8 = it12;
                    i5 = 10;
                }
                zek.x xVar = (zek.x) p0Var.f235670c.T2("SUBSCRIPTION", p0.o);
                if (xVar == null) {
                    return new Data(null, null, false, 6, null);
                }
                Iterator it16 = arrayList7.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next = it16.next();
                        if (Intrinsics.f(((hha.d) next).f152287a, xVar.getId())) {
                        }
                    } else {
                        next = null;
                    }
                }
                hha.d pricingPlan = (hha.d) next;
                if (pricingPlan == null) {
                    throw new IllegalStateException(p.a.p("Pricing plan with ", xVar.getId(), " id is not found"));
                }
                Object obj4 = bfk.b.f15010a;
                Intrinsics.checkNotNullParameter(xVar, "<this>");
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                String strA = xVar.getAccountType();
                hha.e[] eVarArrValues = hha.e.values();
                int length = eVarArrValues.length;
                int i22 = 0;
                while (true) {
                    if (i22 < length) {
                        eVar = eVarArrValues[i22];
                        if (!kotlin.text.a0.z(eVar.name(), strA, true)) {
                            i22++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar == null) {
                    eVar = hha.e.UNKNOWN;
                }
                hha.e eVar5 = eVar;
                String strB = xVar.getBillingCycleId();
                Period period2 = xVar.getBillingPeriod() != null ? Period.parse(xVar.getBillingPeriod()) : null;
                DateTime dateTime = new DateTime(xVar.getStartDate());
                DateTime dateTime2 = (xVar.getEndDate() == null || ((lI = xVar.getEndDate()) != null && lI.longValue() == 0)) ? null : new DateTime(xVar.getEndDate().longValue());
                DateTime dateTime3 = xVar.getNextBillingDate() != null ? new DateTime(xVar.getNextBillingDate().longValue()) : null;
                zek.l lVarG = xVar.getCurrentBilling();
                hha.g gVarA = lVarG != null ? bfk.b.a(lVarG) : null;
                List listN = xVar.getNextBilling();
                if (listN != null) {
                    List list7 = listN;
                    arrayList = new ArrayList(zhm.w.t(list7, 10));
                    Iterator it17 = list7.iterator();
                    while (it17.hasNext()) {
                        arrayList.add(bfk.b.a((zek.l) it17.next()));
                    }
                } else {
                    arrayList = zhm.f0.f322471a;
                }
                ?? r312 = arrayList;
                zek.t tVarP = xVar.getNextPlan();
                if (tVarP != null) {
                    Intrinsics.checkNotNullParameter(tVarP, "<this>");
                    String id10 = tVarP.getId();
                    String accountType = tVarP.getAccountType();
                    hha.e[] eVarArrValues2 = hha.e.values();
                    int length2 = eVarArrValues2.length;
                    int i32 = 0;
                    while (true) {
                        if (i32 < length2) {
                            eVar2 = eVarArrValues2[i32];
                            if (!kotlin.text.a0.z(eVar2.name(), accountType, true)) {
                                i32++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 == null) {
                        eVar2 = hha.e.UNKNOWN;
                    }
                    hha.e eVar6 = eVar2;
                    String billingPeriod = tVarP.getBillingPeriod();
                    Period period3 = billingPeriod != null ? Period.parse(billingPeriod) : null;
                    Long startDate2 = tVarP.getStartDate();
                    Long nextBillingDate = tVarP.getNextBillingDate();
                    boolean zJ = pd.b.j(tVarP.getIsFamily());
                    String displayCode = tVarP.getDisplayCode();
                    zek.l billingDetails = tVarP.getBillingDetails();
                    pricingPlanNextPlanInfo = new PricingPlanNextPlanInfo(id10, billingDetails != null ? bfk.b.a(billingDetails) : null, period3, startDate2, nextBillingDate, zJ, displayCode, tVarP.getCanCancel(), eVar6);
                } else {
                    pricingPlanNextPlanInfo = null;
                }
                jo3.b bVarQ = xVar.getRefund();
                dj0.d dVarV2 = bVarQ != null ? hx7.a.v(bVarQ) : null;
                zek.b0 b0VarH = xVar.getDiscount();
                hha.i0 i0VarG = b0VarH != null ? bfk.b.g(b0VarH) : null;
                zek.i iVarK = xVar.getFreeTrial();
                hha.z zVarF = iVarK != null ? bfk.b.f(iVarK) : null;
                zek.b0 b0VarS = xVar.getUpcomingDiscount();
                hha.i0 i0VarG2 = b0VarS != null ? bfk.b.g(b0VarS) : null;
                Boolean boolU = xVar.getIsDefault();
                boolean zBooleanValue = boolU != null ? boolU.booleanValue() : true;
                Boolean boolW = xVar.getIsRevolutCardRequiredForInsuranceActivation();
                boolean zBooleanValue2 = boolW != null ? boolW.booleanValue() : false;
                zek.b bVarF = xVar.getCashbackBoostCampaign();
                hha.m mVarC = bVarF != null ? bfk.b.c(bVarF) : null;
                Boolean boolE = xVar.getCanChangeBillingPeriod();
                boolean zBooleanValue3 = boolE != null ? boolE.booleanValue() : true;
                Boolean boolT = xVar.getIsBillingPeriodChangeBeneficial();
                boolean zBooleanValue4 = boolT != null ? boolT.booleanValue() : true;
                Boolean boolV = xVar.getIsFirstInvoice();
                boolean zBooleanValue5 = boolV != null ? boolV.booleanValue() : false;
                String strJ = xVar.getFamilyRole();
                if (strJ != null) {
                    lha.o[] oVarArrValues = lha.o.values();
                    int length3 = oVarArrValues.length;
                    int i33 = 0;
                    while (true) {
                        if (i33 < length3) {
                            oVar2 = oVarArrValues[i33];
                            if (!kotlin.text.a0.z(oVar2.name(), strJ, true)) {
                                i33++;
                            }
                        } else {
                            oVar2 = null;
                        }
                    }
                    oVar = oVar2;
                } else {
                    oVar = null;
                }
                zek.q qVarL = xVar.getGift();
                if (qVarL != null) {
                    Intrinsics.checkNotNullParameter(qVarL, "<this>");
                    java.time.Period period4 = java.time.Period.parse(qVarL.getDuration());
                    Intrinsics.checkNotNullExpressionValue(period4, "parse(...)");
                    Long startDate3 = qVarL.getStartDate();
                    Instant instantOfEpochMilli = startDate3 != null ? Instant.ofEpochMilli(startDate3.longValue()) : null;
                    Long endDate = qVarL.getEndDate();
                    b0Var = new hha.b0(period4, instantOfEpochMilli, endDate != null ? Instant.ofEpochMilli(endDate.longValue()) : null);
                } else {
                    b0Var = null;
                }
                zek.a0 a0VarD = xVar.getBillingPeriodChange();
                if (a0VarD != null) {
                    Intrinsics.checkNotNullParameter(a0VarD, "<this>");
                    String code = a0VarD.getCode();
                    boolean isBeneficial = a0VarD.getIsBeneficial();
                    jo3.b amountSaved = a0VarD.getAmountSaved();
                    pricingPlanSubscriptionBillingChange = new PricingPlanSubscriptionBillingChange(code, isBeneficial, amountSaved != null ? hx7.a.v(amountSaved) : null, a0VarD.getPercentageSaved());
                } else {
                    pricingPlanSubscriptionBillingChange = null;
                }
                return zi0.c.P(new w0(new PricingPlanSubscription(pricingPlan, eVar5, strB, period2, dateTime, dateTime2, dateTime3, gVarA, r312, pricingPlanNextPlanInfo, dVarV2, i0VarG, zVarF, i0VarG2, zBooleanValue, zBooleanValue2, mVarC, zBooleanValue3, zBooleanValue5, oVar, b0Var, pricingPlanSubscriptionBillingChange, zBooleanValue4), arrayList7), false, null, 3);
            case 1:
                w0 w0Var = (w0) obj2;
                Intrinsics.checkNotNullParameter(w0Var, "<destruct>");
                PricingPlanSubscription pricingPlanSubscription = w0Var.f235705a;
                List list8 = w0Var.f235706b;
                p0Var.getClass();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj5 : list8) {
                    hha.d dVar3 = (hha.d) obj5;
                    if (dVar3.f152294m > pricingPlanSubscription.f81129a.f152294m && hha.s.k(dVar3)) {
                        arrayList16.add(obj5);
                    }
                }
                return (hha.d) zhm.d0.o0(zhm.d0.P0(arrayList16, new hha.f0(null)));
            case 2:
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (nha.c) p0Var.d.get("CACHE_KEY_MINIMUM_BALANCE_INFO");
            case 3:
                hha.e accountType2 = (hha.e) obj2;
                Intrinsics.checkNotNullParameter(accountType2, "accountType");
                List list9 = (List) p0Var.f235670c.T2(p0.d(accountType2), p0.f235663p);
                if (list9 == null) {
                    return null;
                }
                List list10 = list9;
                ArrayList arrayList17 = new ArrayList(zhm.w.t(list10, 10));
                Iterator it19 = list10.iterator();
                while (it19.hasNext()) {
                    arrayList17.add(nfk.e.c((gfk.v) it19.next()));
                }
                return arrayList17;
            case 4:
                Unit it20 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                efm.d0<List<gfk.r0>> planLimits = p0Var.f235668a.getPlanLimits();
                pfa.c cVar4 = new pfa.c(new h0(2), 7);
                planLimits.getClass();
                ufm.i iVar3 = new ufm.i(planLimits, cVar4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 5:
                Unit it21 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return (List) p0Var.d.get("CACHE_KEY_PLAN_LIMITS");
            case 6:
                Unit it22 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                List list11 = (List) p0Var.f235670c.T2("STORAGE_KEY_PLAN_LIMITS", p0.f235664q);
                if (list11 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(list11, "<this>");
                List<zek.c0> list12 = list11;
                ArrayList arrayList18 = new ArrayList(zhm.w.t(list12, 10));
                for (zek.c0 c0Var : list12) {
                    Intrinsics.checkNotNullParameter(c0Var, "<this>");
                    xi0.a aVar4 = xi0.b.Companion;
                    String currency2 = c0Var.getCurrency();
                    aVar4.getClass();
                    xi0.b currency3 = xi0.a.a(currency2);
                    String name = c0Var.getName();
                    if (name == null) {
                        name = "";
                    }
                    String str10 = name;
                    mha.q qVar = mha.r.Companion;
                    String name2 = c0Var.getName();
                    qVar.getClass();
                    mha.r rVarA = mha.q.a(name2);
                    String upperCase = c0Var.getType().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    mha.m mVar = new mha.m(upperCase);
                    Long startDate4 = c0Var.getStartDate();
                    DateTime dateTime4 = startDate4 != null ? new DateTime(startDate4.longValue()) : null;
                    Long endDate2 = c0Var.getEndDate();
                    DateTime dateTime5 = endDate2 != null ? new DateTime(endDate2.longValue()) : null;
                    zek.j fee2 = c0Var.getFee();
                    if (fee2 != null) {
                        Intrinsics.checkNotNullParameter(fee2, "<this>");
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        String type = fee2.getType();
                        if (Intrinsics.f(type, "PERCENTAGE")) {
                            double d = Double.parseDouble(fee2.getValue());
                            Long minMoneyAmount = fee2.getMinMoneyAmount();
                            iVar = new mha.j(d, minMoneyAmount != null ? new dj0.d(minMoneyAmount.longValue(), currency3) : null);
                        } else {
                            if (!Intrinsics.f(type, "ABSOLUTE")) {
                                throw new IllegalArgumentException(j6.a.q("unknown plan limit fee type: ", fee2.getType()));
                            }
                            iVar = new mha.i(new dj0.d(Long.parseLong(fee2.getValue()), currency3));
                        }
                        kVar = iVar;
                    } else {
                        kVar = null;
                    }
                    zek.k limit = c0Var.getLimit();
                    mha.p pVarD = limit != null ? jb3.l.D(limit, currency3) : null;
                    Long quantityLimit = c0Var.getQuantityLimit();
                    zek.k usage = c0Var.getUsage();
                    arrayList18.add(new mha.s(str10, rVarA, mVar, currency3, dateTime4, dateTime5, kVar, pVarD, quantityLimit, usage != null ? jb3.l.D(usage, currency3) : null, c0Var.getQuantityUsage(), c0Var.getIsRecurring()));
                }
                return arrayList18;
            case 7:
                u0 params = (u0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                efm.d0<hfk.o> planSubscribeInfo = p0Var.f235668a.getPlanSubscribeInfo(params.f235699a, params.f235700b, params.f235701c, params.d, params.e, params.f);
                pfa.c cVar5 = new pfa.c(new i0(p0Var, 13), 14);
                planSubscribeInfo.getClass();
                ufm.i iVar4 = new ufm.i(planSubscribeInfo, cVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 8:
                u0 params2 = (u0) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (qha.a) p0Var.d.get(params2.a());
            case 9:
                v0 params3 = (v0) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (hha.q0) p0Var.d.get(params3.a());
            case 10:
                Unit it23 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                efm.d0<List<gfk.h0>> planSuggestions = p0Var.f235668a.getPlanSuggestions();
                pfa.c cVar6 = new pfa.c(new h0(8), 15);
                planSuggestions.getClass();
                ufm.i iVar5 = new ufm.i(planSuggestions, cVar6, 1);
                Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                return iVar5;
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) p0Var.d.get("PLAN_SUGGESTIONS");
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                List list13 = (List) p0Var.f235670c.T2("PLAN_SUGGESTIONS", p0.f235665r);
                if (list13 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(list13, "<this>");
                List<zek.y> list14 = list13;
                ArrayList arrayList19 = new ArrayList(zhm.w.t(list14, 10));
                for (zek.y yVar : list14) {
                    String planId = yVar.getPlanId();
                    boolean recommended = yVar.getRecommended();
                    List suggestedFeatures = yVar.getSuggestedFeatures();
                    ArrayList arrayList20 = new ArrayList(zhm.w.t(suggestedFeatures, 10));
                    Iterator it24 = suggestedFeatures.iterator();
                    while (it24.hasNext()) {
                        arrayList20.add(new hha.u((String) it24.next()));
                    }
                    arrayList19.add(new hha.r0(planId, arrayList20, recommended));
                }
                return arrayList19;
            case 13:
                hfk.o it25 = (hfk.o) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                ifk.c screenConfigMapper = p0Var.e;
                Intrinsics.checkNotNullParameter(it25, "<this>");
                Intrinsics.checkNotNullParameter(screenConfigMapper, "screenConfigMapper");
                jo3.a refundAmount = it25.getRefundAmount();
                dj0.d dVarO = refundAmount != null ? mo3.a.o(refundAmount) : null;
                gfk.c refundAmountCharge = it25.getRefundAmountCharge();
                hha.o oVarE = refundAmountCharge != null ? nfk.e.e(refundAmountCharge) : null;
                List fees = it25.getFees();
                if (fees != null) {
                    List list15 = fees;
                    arrayList3 = new ArrayList(zhm.w.t(list15, 10));
                    Iterator it26 = list15.iterator();
                    while (it26.hasNext()) {
                        arrayList3.add(pw5.a.E((hfk.n) it26.next()));
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = zhm.f0.f322471a;
                }
                ?? r252 = arrayList3;
                List taxes = it25.getTaxes();
                if (taxes != null) {
                    List list16 = taxes;
                    arrayList4 = new ArrayList(zhm.w.t(list16, 10));
                    Iterator it27 = list16.iterator();
                    while (it27.hasNext()) {
                        arrayList4.add(pw5.a.E((hfk.n) it27.next()));
                    }
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = zhm.f0.f322471a;
                }
                ?? r262 = arrayList4;
                jo3.a totalDueAmount = it25.getTotalDueAmount();
                dj0.d dVarO2 = totalDueAmount != null ? mo3.a.o(totalDueAmount) : null;
                DateTime dateTime6 = it25.getEndDate() != null ? new DateTime(it25.getEndDate().longValue()) : null;
                DateTime dateTime7 = it25.getPenalisationPeriodEndDate() != null ? new DateTime(it25.getPenalisationPeriodEndDate().longValue()) : null;
                Boolean hasPaymentsBeforeEndDate = it25.getHasPaymentsBeforeEndDate();
                boolean zBooleanValue6 = hasPaymentsBeforeEndDate != null ? hasPaymentsBeforeEndDate.booleanValue() : false;
                hfk.i screenConfig = it25.getScreenConfig();
                PricingPlanCancelScreenConfig pricingPlanCancelScreenConfigB = screenConfig != null ? screenConfigMapper.b(screenConfig) : null;
                hfk.l noticePeriod = it25.getNoticePeriod();
                if (noticePeriod == null || (duration = noticePeriod.getDuration()) == null) {
                    wVar2 = null;
                } else {
                    java.time.Period period5 = java.time.Period.parse(duration);
                    Intrinsics.checkNotNullExpressionValue(period5, "parse(...)");
                    wVar2 = new iha.w(period5);
                }
                List<String> ineligibilityReasons = it25.getIneligibilityReasons();
                if (ineligibilityReasons != null) {
                    ArrayList arrayList21 = new ArrayList();
                    for (String str11 : ineligibilityReasons) {
                        PricingPlanSubscribeInfoIneligibilityReason[] pricingPlanSubscribeInfoIneligibilityReasonArrValues = PricingPlanSubscribeInfoIneligibilityReason.values();
                        int length4 = pricingPlanSubscribeInfoIneligibilityReasonArrValues.length;
                        int i43 = 0;
                        while (true) {
                            if (i43 < length4) {
                                pricingPlanSubscribeInfoIneligibilityReason = pricingPlanSubscribeInfoIneligibilityReasonArrValues[i43];
                                if (!kotlin.text.a0.z(pricingPlanSubscribeInfoIneligibilityReason.name(), str11, true)) {
                                    i43++;
                                }
                            } else {
                                pricingPlanSubscribeInfoIneligibilityReason = null;
                            }
                        }
                        if (pricingPlanSubscribeInfoIneligibilityReason != null) {
                            arrayList21.add(pricingPlanSubscribeInfoIneligibilityReason);
                        }
                    }
                    arrayList5 = arrayList21;
                } else {
                    arrayList5 = null;
                }
                String planId2 = it25.getPlanId();
                boolean zJ2 = pd.b.j(it25.getCreditCardActivationRequired());
                List rewards = it25.getRewards();
                if (rewards != null) {
                    List<hfk.p> list17 = rewards;
                    ArrayList arrayList22 = new ArrayList(zhm.w.t(list17, 10));
                    for (hfk.p pVar : list17) {
                        Intrinsics.checkNotNullParameter(pVar, "<this>");
                        arrayList22.add(new qha.f(pVar.getTitle(), pVar.getDescription(), pVar.getIcon()));
                    }
                    arrayList6 = arrayList22;
                } else {
                    arrayList6 = null;
                }
                hfk.q successAction = it25.getSuccessAction();
                if (successAction != null) {
                    Intrinsics.checkNotNullParameter(successAction, "<this>");
                    gVar = new qha.g(successAction.getMessage(), successAction.getDescription(), successAction.getDeeplink());
                } else {
                    gVar = null;
                }
                return new qha.a(dVarO, oVarE, r252, r262, dVarO2, dateTime6, zBooleanValue6, wVar2, dateTime7, pricingPlanCancelScreenConfigB, arrayList5, planId2, Boolean.valueOf(zJ2), arrayList6, gVar);
            case 14:
                Unit it28 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                efm.d0<gfk.x> planHub = p0Var.f235668a.getPlanHub();
                pfa.c cVar7 = new pfa.c(new h0(9), 4);
                planHub.getClass();
                ufm.i iVar6 = new ufm.i(planHub, cVar7, 1);
                Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                return iVar6;
            case 15:
                Unit it29 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return (hha.c0) p0Var.d.get("CACHE_KEY_PLAN_HUB");
            case 16:
                Unit it30 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                zek.r rVar = (zek.r) p0Var.f235670c.T2("STORAGE_KEY_PLAN_HUB", p0.f235666s);
                if (rVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                List benefits = rVar.getBenefits();
                ArrayList arrayList23 = new ArrayList(zhm.w.t(benefits, 10));
                Iterator it31 = benefits.iterator();
                while (it31.hasNext()) {
                    arrayList23.add(new hha.u((String) it31.next()));
                }
                List plans = rVar.getPlans();
                if (plans == null) {
                    plans = zhm.f0.f322471a;
                }
                List<zek.s> list18 = plans;
                ArrayList arrayList24 = new ArrayList(zhm.w.t(list18, 10));
                for (zek.s sVar : list18) {
                    Intrinsics.checkNotNullParameter(sVar, "<this>");
                    arrayList24.add(new hha.d0(sVar.getId(), sVar.getSuggested()));
                }
                return new hha.c0(arrayList23, arrayList24);
            case 17:
                Unit it32 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it32, "it");
                return (List) p0Var.d.get("CACHE_KEY_PLAN_FEATURES");
            case 18:
                Unit it33 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it33, "it");
                return (hha.l) p0Var.d.get("CACHE_KEY_PLAN_CAMPAIGNS");
            case 19:
                Unit it34 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it34, "it");
                return (List) p0Var.d.get("CACHE_KEY_LOYALTY_EARNING");
            case 20:
                Unit it35 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it35, "it");
                return (w0) p0Var.d.get("CACHE_KEY_SUBSCRIPTION_WITH_PLANS");
            case 21:
                Unit it36 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it36, "it");
                xe0.e eVar7 = p0Var.f235670c;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(zek.z.class);
                companion.getClass();
                List list19 = (List) eVar7.T2("STORAGE_KEY_LOYALTY_EARNING", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                if (list19 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(list19, "<this>");
                List<zek.z> list20 = list19;
                ArrayList arrayList25 = new ArrayList(zhm.w.t(list20, 10));
                for (zek.z zVar : list20) {
                    Intrinsics.checkNotNullParameter(zVar, "<this>");
                    String planId3 = zVar.getPlanId();
                    boolean recommended2 = zVar.getRecommended();
                    boolean current = zVar.getCurrent();
                    String displayCode2 = zVar.getDisplayCode();
                    z.b loyaltyRate = zVar.getLoyaltyRate();
                    Intrinsics.checkNotNullParameter(loyaltyRate, "<this>");
                    y0 y0Var = new y0(loyaltyRate.getPointsForCardSpend(), hx7.a.v(loyaltyRate.getCashForCardSpend()));
                    z.a billing = zVar.getBilling();
                    if (billing != null) {
                        Intrinsics.checkNotNullParameter(billing, "<this>");
                        String period6 = billing.getPeriod();
                        hha.i[] iVarArrValues = hha.i.values();
                        int length5 = iVarArrValues.length;
                        int i59 = 0;
                        while (true) {
                            if (i59 < length5) {
                                iVar2 = iVarArrValues[i59];
                                if (!kotlin.text.a0.z(iVar2.name(), period6, true)) {
                                    i59++;
                                }
                            } else {
                                iVar2 = null;
                            }
                        }
                        if (iVar2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        x0Var = new x0(hx7.a.v(billing.getFee()), iVar2);
                    } else {
                        x0Var = null;
                    }
                    arrayList25.add(new z0(planId3, recommended2, current, displayCode2, y0Var, x0Var));
                }
                return arrayList25;
            case 22:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                efm.d0 d0VarA = p0Var.f235669b.a();
                pfa.c cVar8 = new pfa.c(new i0(p0Var, i3), 6);
                d0VarA.getClass();
                ufm.i iVar7 = new ufm.i(d0VarA, cVar8, 1);
                Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                return iVar7;
            default:
                hha.e accountType3 = (hha.e) obj2;
                Intrinsics.checkNotNullParameter(accountType3, "accountType");
                return (List) p0Var.d.get(p0.d(accountType3));
        }
    }
}
