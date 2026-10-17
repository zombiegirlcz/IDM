package kx7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDate;
import zw7.c1;
import zw7.g1;
import zw7.h1;
import zw7.i1;
import zw7.j1;
import zw7.k1;
import zw7.l1;
import zw7.s0;
import zw7.z0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f190477b;

    public /* synthetic */ n0(y0 y0Var, int i) {
        this.f190476a = i;
        this.f190477b = y0Var;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zw7.e eVar;
        dj0.d dVarV;
        i1 j1Var;
        zw7.a0 a0Var;
        zw7.s0 r0Var;
        l1 l1Var;
        Iterator it8;
        k1 k1Var;
        zw7.h0 h0Var;
        zw7.j0 j0Var;
        int i = this.f190476a;
        boolean z = false;
        int i2 = 10;
        y0 y0Var = this.f190477b;
        switch (i) {
            case 0:
                String petType = (String) obj2;
                Intrinsics.checkNotNullParameter(petType, "petType");
                return (List) v1.c.s("CACHE_KEY_BREEDS", petType, y0Var.f190503c);
            case 1:
                String petType2 = (String) obj2;
                Intrinsics.checkNotNullParameter(petType2, "petType");
                List list = (List) y0Var.f190502b.T2(j6.a.q("CACHE_KEY_BREEDS", petType2), y0.k);
                if (list == null) {
                    return null;
                }
                Object obj3 = hx7.c.f156394a;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList.add(hx7.c.a((gx7.e) it9.next()));
                }
                return arrayList;
            case 2:
                String policyId = (String) obj2;
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                return (List) v1.c.s("CACHE_KEY_POLICY_CANCELLATION_REASONS", policyId, y0Var.f190503c);
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (List) y0Var.f190503c.get("CACHE_KEY_PETS");
            case 4:
                String policyId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(policyId2, "policyId");
                return (List) v1.c.s("CACHE_KEY_POLICY_RENEWAL_OPT_OUT_REASONS", policyId2, y0Var.f190503c);
            case 5:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list3 = (List) y0Var.f190502b.T2("CACHE_KEY_PETS", y0.f190499j);
                if (list3 == null) {
                    return null;
                }
                Object obj4 = hx7.j.f156402a;
                Intrinsics.checkNotNullParameter(list3, "<this>");
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    gx7.m mVar = (gx7.m) it12.next();
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                    String id10 = mVar.getId();
                    zw7.c0 c0Var = (zw7.c0) u1.t(mVar.getPetType(), zw7.c0.UNKNOWN, hx7.j.f156402a);
                    String imageLink = mVar.getImageLink();
                    String name = mVar.getName();
                    zw7.z zVar = (zw7.z) u1.t(mVar.getGender(), zw7.z.UNKNOWN, hx7.j.f156403b);
                    gx7.e breedDetails = mVar.getBreedDetails();
                    if (breedDetails != null) {
                        eVar = hx7.c.a(breedDetails);
                    } else {
                        String breedCode = mVar.getBreed();
                        String breedType = mVar.getBreedType();
                        Object obj5 = hx7.c.f156394a;
                        Intrinsics.checkNotNullParameter(breedCode, "breedCode");
                        Intrinsics.checkNotNullParameter(breedType, "breedType");
                        eVar = new zw7.e(breedCode, breedCode, (zw7.h) u1.t(breedType, zw7.h.UNKNOWN, hx7.c.f156394a), z);
                    }
                    LocalDate localDate = LocalDate.parse(mVar.getDateOfBirth());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    String purchasePrice = mVar.getPurchasePrice();
                    jo3.b purchasePriceMoney = mVar.getPurchasePriceMoney();
                    if (purchasePriceMoney != null) {
                        dVarV = hx7.a.v(purchasePriceMoney);
                    } else {
                        dj0.d.Companion.getClass();
                        dVarV = dj0.d.d;
                    }
                    dj0.d dVar = dVarV;
                    boolean sterilized = mVar.getSterilized();
                    Boolean editable = mVar.getEditable();
                    boolean zBooleanValue = editable != null ? editable.booleanValue() : z;
                    gx7.x quoteRequest = mVar.getQuoteRequest();
                    if (quoteRequest == null) {
                        j1Var = i1.a.f325794a;
                    } else {
                        String petId = quoteRequest.getPetId();
                        LocalDate localDate2 = LocalDate.parse(quoteRequest.getPolicyStartDate());
                        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                        j1Var = new j1(petId, localDate2);
                    }
                    List issues = mVar.getIssues();
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(issues, 10));
                    Iterator it13 = issues.iterator();
                    while (it13.hasNext()) {
                        arrayList3.add((zw7.t) u1.t((String) it13.next(), zw7.t.UNKNOWN, hx7.g.f156398a));
                    }
                    String policyStatus = mVar.getPolicyStatus();
                    if (policyStatus == null || (a0Var = (zw7.a0) u1.v(policyStatus, hx7.r.f156410a)) == null) {
                        a0Var = zw7.a0.UNKNOWN;
                    }
                    zw7.a0 a0Var2 = a0Var;
                    gx7.s policy = mVar.getPolicy();
                    Object obj6 = hx7.p.f156407a;
                    if (policy == null) {
                        it8 = it12;
                        r0Var = s0.a.f325852a;
                    } else {
                        String id11 = policy.getId();
                        String policyNumber = policy.getPolicyNumber();
                        zw7.g0 g0Var = (zw7.g0) u1.u(policy.getPlanName(), hx7.n.f156405a);
                        String planDisplayName = policy.getPlanDisplayName();
                        LocalDate localDate3 = LocalDate.parse(policy.getStartDate());
                        Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                        LocalDate localDate4 = LocalDate.parse(policy.getEndDate());
                        Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
                        String coverageAmount = policy.getCoverageAmount();
                        String paymentAmount = policy.getPaymentAmount();
                        zw7.w wVar = (zw7.w) u1.u(policy.getPaymentFrequency(), hx7.p.f156409c);
                        gx7.i insurer = policy.getInsurer();
                        Intrinsics.checkNotNullParameter(insurer, "<this>");
                        String name2 = insurer.getName();
                        String phone = insurer.getPhone();
                        String email = insurer.getEmail();
                        String claimsUrl = insurer.getClaimsUrl();
                        if (claimsUrl == null) {
                            claimsUrl = "";
                        }
                        zw7.s sVar = new zw7.s(name2, phone, email, claimsUrl);
                        ArrayList arrayListB = hx7.d.b(policy.getDocuments());
                        zw7.t0 t0Var = (zw7.t0) u1.u(policy.getStatus(), hx7.p.f156407a);
                        String cancellationReason = policy.getCancellationReason();
                        if (cancellationReason == null || (l1Var = (l1) u1.v(cancellationReason, hx7.p.f156408b)) == null) {
                            l1Var = l1.NONE;
                        }
                        l1 l1Var2 = l1Var;
                        List coverages = policy.getCoverages();
                        Intrinsics.checkNotNullParameter(coverages, "<this>");
                        List<gx7.r> list5 = coverages;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (gx7.r rVar : list5) {
                            Intrinsics.checkNotNullParameter(rVar, "<this>");
                            String icon = rVar.getIcon();
                            zw7.i iVar = icon != null ? (zw7.i) u1.v(icon, hx7.f.f156397a) : null;
                            String value = rVar.getValue();
                            gx7.f details = rVar.getDetails();
                            arrayList4.add(new z0(iVar, value, details != null ? hx7.l.E(details) : null));
                        }
                        List restrictions = policy.getRestrictions();
                        Intrinsics.checkNotNullParameter(restrictions, "<this>");
                        List list6 = restrictions;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                        Iterator it14 = list6.iterator();
                        while (it14.hasNext()) {
                            gx7.t tVar = (gx7.t) it14.next();
                            Intrinsics.checkNotNullParameter(tVar, "<this>");
                            String name3 = tVar.getName();
                            Iterator it15 = it14;
                            String value2 = tVar.getValue();
                            Iterator it16 = it12;
                            String newValue = tVar.getNewValue();
                            gx7.f details2 = tVar.getDetails();
                            arrayList5.add(new c1(name3, value2, newValue, details2 != null ? hx7.l.E(details2) : null));
                            it14 = it15;
                            it12 = it16;
                        }
                        it8 = it12;
                        gx7.y renewalDetails = policy.getRenewalDetails();
                        if (renewalDetails != null) {
                            LocalDate localDate5 = LocalDate.parse(renewalDetails.getRenewalDate());
                            Intrinsics.checkNotNullExpressionValue(localDate5, "parse(...)");
                            k1Var = new k1(localDate5, renewalDetails.getIsOptedIn(), hx7.a.v(renewalDetails.getMonthlyPayment()));
                        } else {
                            k1Var = null;
                        }
                        r0Var = new zw7.r0(id11, policyNumber, g0Var, planDisplayName, localDate3, localDate4, coverageAmount, paymentAmount, wVar, sVar, arrayListB, t0Var, l1Var2, arrayList4, arrayList5, k1Var);
                    }
                    arrayList2.add(new zw7.d0(id10, c0Var, imageLink, name, zVar, eVar, localDate, sterilized, purchasePrice, dVar, zBooleanValue, j1Var, arrayList3, a0Var2, r0Var));
                    it12 = it8;
                    z = false;
                }
                return arrayList2;
            case 6:
                ix7.t policy2 = (ix7.t) obj2;
                Intrinsics.checkNotNullParameter(policy2, "policy");
                efm.b bVarG = y0Var.a().g(Unit.f186387a, false);
                Intrinsics.checkNotNullParameter(policy2, "<this>");
                ufm.b bVarM = efm.d0.m(new zw7.u0(policy2.getCoolingPeriodFinished(), policy2.getPetLoss()));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarG.f(bVarM);
            case 7:
                ix7.x policy3 = (ix7.x) obj2;
                Intrinsics.checkNotNullParameter(policy3, "policy");
                efm.b bVarG2 = y0Var.a().g(Unit.f186387a, false);
                ufm.b bVarM2 = efm.d0.m(hx7.p.a(policy3));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarG2.f(bVarM2);
            case 8:
                r0 params = (r0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (zw7.k0) y0Var.f190503c.get(y0.c(params));
            default:
                r0 params2 = (r0) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                gx7.p pVar = (gx7.p) y0Var.f190502b.T2(y0.c(params2), y0.f190500l);
                if (pVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(pVar, "<this>");
                List<gx7.o> plans = pVar.getPlans();
                Intrinsics.checkNotNullParameter(plans, "<this>");
                ArrayList arrayList6 = new ArrayList();
                for (gx7.o oVar : plans) {
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    zw7.g0 g0Var2 = (zw7.g0) u1.v(oVar.getName(), hx7.n.f156405a);
                    if (g0Var2 != null) {
                        String id12 = oVar.getId();
                        String displayName = oVar.getDisplayName();
                        String coverageAmount2 = oVar.getCoverageAmount();
                        List quotes = oVar.getQuotes();
                        Intrinsics.checkNotNullParameter(quotes, "<this>");
                        List<gx7.w> list7 = quotes;
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list7, i2));
                        for (gx7.w wVar2 : list7) {
                            Intrinsics.checkNotNullParameter(wVar2, "<this>");
                            String id13 = wVar2.getId();
                            String monthlyPayment = wVar2.getMonthlyPayment();
                            String excess = wVar2.getExcess();
                            String coPayment = wVar2.getCoPayment();
                            gx7.g discount = wVar2.getDiscount();
                            zw7.l lVar = discount != null ? new zw7.l(discount.getMonthlyPayment(), discount.getDurationMonths()) : null;
                            jo3.b paymentDelta = wVar2.getPaymentDelta();
                            arrayList7.add(new h1(id13, monthlyPayment, excess, coPayment, lVar, paymentDelta != null ? hx7.a.v(paymentDelta) : null));
                        }
                        List<gx7.n> coverages2 = oVar.getCoverages();
                        Object obj7 = hx7.k.f156404a;
                        Intrinsics.checkNotNullParameter(coverages2, "<this>");
                        ArrayList arrayList8 = new ArrayList();
                        for (gx7.n nVar : coverages2) {
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            zw7.i0 i0Var = (zw7.i0) u1.v(nVar.getState(), hx7.k.f156404a);
                            if (i0Var != null) {
                                String icon2 = nVar.getIcon();
                                j0Var = new zw7.j0(icon2 != null ? (zw7.i) u1.v(icon2, hx7.f.f156397a) : null, nVar.getName(), i0Var);
                            } else {
                                j0Var = null;
                            }
                            if (j0Var != null) {
                                arrayList8.add(j0Var);
                            }
                        }
                        ArrayList arrayListB2 = hx7.d.b(oVar.getDocuments());
                        gx7.v promotionalBanner = oVar.getPromotionalBanner();
                        h0Var = new zw7.h0(id12, g0Var2, displayName, coverageAmount2, arrayList7, arrayList8, arrayListB2, promotionalBanner != null ? new g1(promotionalBanner.getTitle(), promotionalBanner.getContent()) : null);
                    } else {
                        h0Var = null;
                    }
                    if (h0Var != null) {
                        arrayList6.add(h0Var);
                    }
                    i2 = 10;
                }
                return new zw7.k0(arrayList6);
        }
    }
}
