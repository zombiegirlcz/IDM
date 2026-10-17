package kj7;

import aj7.d0;
import aj7.e0;
import aj7.p;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.insurance.api.models.cfac.CFACClaim;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimCancellation;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimCancellationFile;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimCancellationReason;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetails;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetailsExpense;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimExpenseCancellation;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimExpenseEvent;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimExpenseSummary;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimExpenseTransaction;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimIds;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimProgress;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimStatus;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimTotalSummary;
import com.revolut.feature.insurance.impl.network.InsuranceService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj7.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements xi7.b {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f184337h;
    public static final Type i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f184338j;
    public static final Type k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceService f184339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f184340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f184341c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f184342g;

    static {
        Type type = new TypeToken<bj7.e>() { // from class: com.revolut.feature.insurance.impl.repository.InsuranceRepositoryImpl$Companion$TYPE_CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f184337h = type;
        Type type2 = new TypeToken<List<? extends e0>>() { // from class: com.revolut.feature.insurance.impl.repository.InsuranceRepositoryImpl$Companion$TYPE_CACHE_KEY_INSURANCE_SUBTYPE_LIMITS_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        i = type2;
        f184338j = new TypeToken<List<? extends aj7.f>>() { // from class: com.revolut.feature.insurance.impl.repository.InsuranceRepositoryImpl$Companion$TYPE_CFAC_CLAIM_ENTITY$1
        }.getType();
        k = new TypeToken<aj7.e>() { // from class: com.revolut.feature.insurance.impl.repository.InsuranceRepositoryImpl$Companion$TYPE_CFAC_CLAIM_DETAILS_ENTITY$1
        }.getType();
    }

    public o(InsuranceService insuranceService, ne0.d memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(insuranceService, "insuranceService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f184339a = insuranceService;
        this.f184340b = memoryCache;
        this.f184341c = storage;
        final int i2 = 10;
        Function2 function2 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i3 = i2;
                o oVar = this.f184334b;
                switch (i3) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i3 = 3;
        Function1 function1 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i5 = i3;
                int i6 = 10;
                o oVar = this.f184336b;
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i6));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i6 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i5 = 5;
        Function2 function22 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i32 = i5;
                o oVar = this.f184334b;
                switch (i32) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i6 = 4;
        Function1 function12 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i59 = i6;
                int i66 = 10;
                o oVar = this.f184336b;
                switch (i59) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i66));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i66 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i21 = 6;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i32 = i21;
                o oVar = this.f184334b;
                switch (i32) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 7;
        Function2 function23 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i32 = i22;
                o oVar = this.f184334b;
                switch (i32) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i32 = 5;
        Function1 function13 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i59 = i32;
                int i66 = 10;
                o oVar = this.f184336b;
                switch (i59) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i66));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i66 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i33 = 8;
        Function2 function24 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i33;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i43 = 6;
        Function1 function14 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i59 = i43;
                int i66 = 10;
                o oVar = this.f184336b;
                switch (i59) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i66));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i66 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i59 = 9;
        this.e = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i59;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i66 = 11;
        Function2 function25 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i66;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i74 = 7;
        Function1 function15 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i592 = i74;
                int i662 = 10;
                o oVar = this.f184336b;
                switch (i592) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i662));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i662 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i92 = 0;
        Function2 function26 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i92;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        Function1 function16 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i592 = i92;
                int i662 = 10;
                o oVar = this.f184336b;
                switch (i592) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i662));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i662 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i96 = 1;
        this.f = new w4l.f(function25, function15, function26, function16, new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i96;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i99 = 2;
        Function2 function27 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i99;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i100 = 1;
        Function1 function17 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i592 = i100;
                int i662 = 10;
                o oVar = this.f184336b;
                switch (i592) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i662));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i662 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i101 = 3;
        Function2 function28 = new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i101;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        };
        final int i102 = 2;
        Function1 function18 = new Function1(this) { // from class: kj7.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184336b;

            {
                this.f184336b = this;
            }

            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                int i592 = i102;
                int i662 = 10;
                o oVar = this.f184336b;
                switch (i592) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) oVar.f184341c.T2("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", o.i);
                        if (list == null) {
                            return null;
                        }
                        Object obj3 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<e0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (e0 e0Var : list2) {
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            dl7.a aVarH = ebm.a.H(e0Var.getInsuranceSubtype());
                            List limits = e0Var.getLimits();
                            Intrinsics.checkNotNullParameter(limits, "<this>");
                            List<d0> list3 = limits;
                            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                            for (d0 d0Var : list3) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                ti7.d dVar = (ti7.d) u1.t(d0Var.getKey(), ti7.d.UNKNOWN, zi7.c.f322508a);
                                dj0.d dVarV = hx7.a.v(d0Var.getMoneyLimit());
                                jo3.b excess = d0Var.getExcess();
                                arrayList3.add(new ti7.c(dVar, dVarV, excess != null ? hx7.a.v(excess) : null));
                            }
                            arrayList2.add(new ti7.e(aVarH, arrayList3));
                        }
                        return arrayList2;
                    case 1:
                        String claimId = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        return (CFACClaimDetails) oVar.f184340b.get(claimId);
                    case 2:
                        String claimId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        xe0.e eVar = oVar.f184341c;
                        Type TYPE_CFAC_CLAIM_DETAILS_ENTITY = o.k;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_DETAILS_ENTITY, "TYPE_CFAC_CLAIM_DETAILS_ENTITY");
                        aj7.e eVar2 = (aj7.e) eVar.T2(claimId2, TYPE_CFAC_CLAIM_DETAILS_ENTITY);
                        if (eVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar2, "<this>");
                        CFACClaimIds cFACClaimIds = new CFACClaimIds(eVar2.getClaimIds().getInternalId(), eVar2.getClaimIds().getExternalId());
                        long createdDate = eVar2.getCreatedDate();
                        String claimName = eVar2.getClaimName();
                        CFACClaimCancellationReason cFACClaimCancellationReason = new CFACClaimCancellationReason(eVar2.getCancellation().getReason().getCode(), eVar2.getCancellation().getReason().getComment());
                        List<aj7.c> documents = eVar2.getCancellation().getDocuments();
                        ArrayList arrayList4 = new ArrayList(w.t(documents, 10));
                        for (aj7.c cVar : documents) {
                            arrayList4.add(new CFACClaimCancellationFile(cVar.getId(), cVar.getName(), cVar.getSize()));
                        }
                        CFACClaimCancellation cFACClaimCancellation = new CFACClaimCancellation(cFACClaimCancellationReason, arrayList4);
                        dj0.d dVarV2 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getTotal());
                        dj0.d dVarV3 = hx7.a.v(eVar2.getExpenseSummary().getAmounts().getClaimedAmount());
                        jo3.b refunded = eVar2.getExpenseSummary().getAmounts().getRefunded();
                        dj0.d dVarV4 = refunded != null ? hx7.a.v(refunded) : null;
                        jo3.b excessPayable = eVar2.getExpenseSummary().getAmounts().getExcessPayable();
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = new CFACClaimExpenseSummary(new CFACClaimTotalSummary(dVarV2, dVarV3, dVarV4, excessPayable != null ? hx7.a.v(excessPayable) : null), eVar2.getExpenseSummary().getCoveragePercentage());
                        List<aj7.k> expenses = eVar2.getExpenses();
                        ArrayList arrayList5 = new ArrayList(w.t(expenses, 10));
                        for (aj7.k kVar : expenses) {
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = new CFACClaimExpenseTransaction(kVar.getTransaction().getId(), kVar.getTransaction().getDescription(), kVar.getTransaction().getMerchantLogoUrl(), kVar.getTransaction().getCreatedDate(), hx7.a.v(kVar.getTransaction().getClaimedAmount()));
                            String cancellerCode = kVar.getCancellation().getCancellerCode();
                            long date = kVar.getCancellation().getDate();
                            List<aj7.c> documents2 = kVar.getCancellation().getDocuments();
                            ArrayList arrayList6 = new ArrayList(w.t(documents2, i662));
                            for (aj7.c cVar2 : documents2) {
                                arrayList6.add(new CFACClaimCancellationFile(cVar2.getId(), cVar2.getName(), cVar2.getSize()));
                                eVar2 = eVar2;
                                cFACClaimIds = cFACClaimIds;
                                cFACClaimCancellation = cFACClaimCancellation;
                            }
                            arrayList5.add(new CFACClaimDetailsExpense(cFACClaimExpenseTransaction, new CFACClaimExpenseEvent(kVar.getEvent().getPurposeCode(), kVar.getEvent().getStartDate()), new CFACClaimExpenseCancellation(date, cancellerCode, arrayList6)));
                            eVar2 = eVar2;
                            cFACClaimIds = cFACClaimIds;
                            cFACClaimCancellation = cFACClaimCancellation;
                            i662 = 10;
                        }
                        CFACClaimIds cFACClaimIds2 = cFACClaimIds;
                        CFACClaimCancellation cFACClaimCancellation2 = cFACClaimCancellation;
                        List<aj7.n> statusHistory = eVar2.getStatusHistory();
                        ArrayList arrayList7 = new ArrayList(w.t(statusHistory, 10));
                        for (aj7.n nVar : statusHistory) {
                            arrayList7.add(new CFACClaimProgress((CFACClaimStatus) u1.u(nVar.getStatus(), hj7.a.f152668a), nVar.getDate(), nVar.getDetails()));
                        }
                        return new CFACClaimDetails(cFACClaimIds2, createdDate, claimName, arrayList7, cFACClaimExpenseSummary, cFACClaimCancellation2, arrayList5);
                    case 3:
                        dl7.a subtype = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        return (List) oVar.f184340b.get("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)));
                    case 4:
                        dl7.a subtype2 = (dl7.a) obj2;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        xe0.e eVar3 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Type TYPE_CFAC_CLAIM_ENTITY = o.f184338j;
                        Intrinsics.checkNotNullExpressionValue(TYPE_CFAC_CLAIM_ENTITY, "TYPE_CFAC_CLAIM_ENTITY");
                        List list4 = (List) eVar3.T2(strConcat, TYPE_CFAC_CLAIM_ENTITY);
                        if (list4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list4, "<this>");
                        List<aj7.f> list5 = list4;
                        ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                        for (aj7.f fVar : list5) {
                            arrayList8.add(new CFACClaim(new CFACClaimIds(fVar.getClaimIds().getInternalId(), fVar.getClaimIds().getExternalId()), fVar.getCreatedDate(), (CFACClaimStatus) u1.u(fVar.getStatus(), hj7.a.f152668a), fVar.getClaimName()));
                        }
                        return arrayList8;
                    case 5:
                        String planId = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        return (ti7.f) v1.c.s("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId, oVar.f184340b);
                    case 6:
                        String planId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        bj7.e eVar4 = (bj7.e) oVar.f184341c.T2(j6.a.q("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_", planId2), o.f184337h);
                        if (eVar4 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(eVar4, "<this>");
                        List data = eVar4.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullParameter(data, "<this>");
                            List<bj7.c> list6 = data;
                            ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                            for (bj7.c cVar3 : list6) {
                                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                                ti7.i iVar = (ti7.i) u1.v(cVar3.getType(), gj7.b.n());
                                if (iVar == null) {
                                    iVar = ti7.i.UNKNOWN;
                                }
                                ti7.i iVar2 = iVar;
                                String title = cVar3.getTitle();
                                List<bj7.d> documentsInfo = cVar3.getDocumentsInfo();
                                ArrayList arrayList10 = new ArrayList(w.t(documentsInfo, 10));
                                for (bj7.d dVar2 : documentsInfo) {
                                    arrayList10.add(new ti7.j(dVar2.getTitle(), dVar2.getUrl(), (vi7.a) u1.u(dVar2.getType(), ij7.b.f161721a)));
                                }
                                List conditions = cVar3.getConditions();
                                Intrinsics.checkNotNullParameter(conditions, "<this>");
                                List<bj7.b> list7 = conditions;
                                ArrayList arrayList11 = new ArrayList(w.t(list7, 10));
                                for (bj7.b bVar : list7) {
                                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                                    arrayList11.add(new ti7.g(bVar.getName(), bVar.getValue()));
                                }
                                arrayList9.add(new ti7.h(iVar2, title, arrayList10, arrayList11, cVar3.getOtherProvidersUrl()));
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        List suitabilityStatement = eVar4.getSuitabilityStatement();
                        String generalInfoUrl = eVar4.getGeneralInfoUrl();
                        bj7.a documentsBanner = eVar4.getDocumentsBanner();
                        ti7.a aVar = documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null;
                        bj7.d claimsEligibilityStatement = eVar4.getClaimsEligibilityStatement();
                        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, claimsEligibilityStatement != null ? new ti7.j(claimsEligibilityStatement.getTitle(), claimsEligibilityStatement.getUrl(), (vi7.a) u1.u(claimsEligibilityStatement.getType(), ij7.b.f161721a)) : null, aVar, eVar4.getFooter());
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) oVar.f184340b.get("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS");
                }
            }
        };
        final int i103 = 4;
        this.f184342g = new w4l.f(function27, function17, function28, function18, new Function2(this) { // from class: kj7.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184334b;

            {
                this.f184334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                int i322 = i103;
                o oVar = this.f184334b;
                switch (i322) {
                    case 0:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        oVar.f184340b.f("CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", domain);
                        return Unit.f186387a;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = oVar.f184341c;
                        Object obj4 = zi7.c.f322508a;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        List<ti7.e> list = domain2;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        for (ti7.e eVar2 : list) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            el7.a aVarK = ebm.a.K(eVar2.f271431a);
                            ArrayList<ti7.c> arrayList3 = eVar2.f271432b;
                            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                            for (ti7.c cVar : arrayList3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                String strG = u1.g(cVar.f271428a, zi7.c.f322508a);
                                jo3.b bVarA = hx7.a.A(cVar.f271429b);
                                dj0.d dVar = cVar.f271430c;
                                arrayList4.add(new d0(strG, bVarA, dVar != null ? hx7.a.A(dVar) : null));
                            }
                            arrayList2.add(new e0(aVarK, arrayList4));
                        }
                        eVar.G(arrayList2, "CACHE_KEY_INSURANCE_SUBTYPE_LIMITS", kii.e.o(e0.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String claimId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(claimId, "claimId");
                        efm.d0<jj7.j> cFACClaimDetails = oVar.f184339a.getCFACClaimDetails(claimId);
                        kce.c cVar2 = new kce.c(new kh4.b(21), 18);
                        cFACClaimDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimDetails, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String claimId2 = (String) obj2;
                        CFACClaimDetails domain3 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId2, "claimId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        oVar.f184340b.f(claimId2, domain3);
                        return Unit.f186387a;
                    case 4:
                        String claimId3 = (String) obj2;
                        CFACClaimDetails domain4 = (CFACClaimDetails) obj3;
                        Intrinsics.checkNotNullParameter(claimId3, "claimId");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        xe0.e eVar3 = oVar.f184341c;
                        Intrinsics.checkNotNullParameter(domain4, "<this>");
                        CFACClaimIds cFACClaimIds = domain4.f74942a;
                        CFACClaimExpenseSummary cFACClaimExpenseSummary = domain4.e;
                        aj7.m mVar = new aj7.m(cFACClaimIds.f74959a, cFACClaimIds.f74960b);
                        long j2 = domain4.f74943b;
                        String str = domain4.f74944c;
                        CFACClaimCancellation cFACClaimCancellation = domain4.f;
                        CFACClaimCancellationReason cFACClaimCancellationReason = cFACClaimCancellation.f74935a;
                        aj7.d dVar2 = new aj7.d(cFACClaimCancellationReason.f74940a, cFACClaimCancellationReason.f74941b);
                        ArrayList arrayList5 = cFACClaimCancellation.f74936b;
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (Iterator it8 = arrayList5.iterator(); it8.hasNext(); it8 = it8) {
                            CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) it8.next();
                            arrayList6.add(new aj7.c(cFACClaimCancellationFile.f74937a, cFACClaimCancellationFile.f74938b, cFACClaimCancellationFile.f74939c));
                            mVar = mVar;
                        }
                        aj7.m mVar2 = mVar;
                        aj7.b bVar = new aj7.b(dVar2, arrayList6);
                        long j3 = j2;
                        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
                        jo3.b bVarA2 = hx7.a.A(cFACClaimTotalSummary.f74964a);
                        jo3.b bVarA3 = hx7.a.A(cFACClaimTotalSummary.f74965b);
                        dj0.d dVar3 = cFACClaimTotalSummary.f74966c;
                        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
                        dj0.d dVar4 = cFACClaimTotalSummary.d;
                        aj7.i iVar2 = new aj7.i(new p(bVarA2, bVarA3, bVarA4, dVar4 != null ? hx7.a.A(dVar4) : null), cFACClaimExpenseSummary.f74955b);
                        ArrayList arrayList7 = domain4.f74945g;
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACClaimDetailsExpense cFACClaimDetailsExpense = (CFACClaimDetailsExpense) it9.next();
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction = cFACClaimDetailsExpense.f74946a;
                            String str2 = cFACClaimExpenseTransaction.f74956a;
                            jo3.b bVarA5 = hx7.a.A(cFACClaimExpenseTransaction.e);
                            CFACClaimExpenseTransaction cFACClaimExpenseTransaction2 = cFACClaimDetailsExpense.f74946a;
                            aj7.j jVar = new aj7.j(str2, cFACClaimExpenseTransaction2.f74957b, cFACClaimExpenseTransaction2.f74958c, cFACClaimExpenseTransaction2.d, bVarA5);
                            CFACClaimExpenseCancellation cFACClaimExpenseCancellation = cFACClaimDetailsExpense.f74948c;
                            String str3 = cFACClaimExpenseCancellation.f74950b;
                            long j5 = cFACClaimExpenseCancellation.f74949a;
                            ArrayList arrayList9 = cFACClaimExpenseCancellation.f74951c;
                            long j16 = j3;
                            Iterator it10 = it9;
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                CFACClaimCancellationFile cFACClaimCancellationFile2 = (CFACClaimCancellationFile) it11.next();
                                arrayList10.add(new aj7.c(cFACClaimCancellationFile2.f74937a, cFACClaimCancellationFile2.f74938b, cFACClaimCancellationFile2.f74939c));
                                it11 = it11;
                                str = str;
                                bVar = bVar;
                                iVar2 = iVar2;
                            }
                            aj7.g gVar = new aj7.g(j5, str3, arrayList10);
                            CFACClaimExpenseEvent cFACClaimExpenseEvent = cFACClaimDetailsExpense.f74947b;
                            arrayList8.add(new aj7.k(jVar, new aj7.h(cFACClaimExpenseEvent.f74952a, cFACClaimExpenseEvent.f74953b), gVar));
                            it9 = it10;
                            j3 = j16;
                            bVar = bVar;
                            iVar2 = iVar2;
                        }
                        long j22 = j3;
                        String str4 = str;
                        aj7.i iVar3 = iVar2;
                        aj7.b bVar2 = bVar;
                        ArrayList<CFACClaimProgress> arrayList11 = domain4.d;
                        ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                        for (CFACClaimProgress cFACClaimProgress : arrayList11) {
                            arrayList12.add(new aj7.n(u1.g(cFACClaimProgress.f74961a, hj7.a.f152668a), cFACClaimProgress.f74962b, cFACClaimProgress.f74963c));
                        }
                        eVar3.G(new aj7.e(mVar2, j22, str4, arrayList12, iVar3, bVar2, arrayList8), claimId3, z.d(o0.b(aj7.e.class)));
                        return Unit.f186387a;
                    case 5:
                        dl7.a subtype = (dl7.a) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype, "subtype");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        oVar.f184340b.f("CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype, gj7.a.f144239b)), domain5);
                        return Unit.f186387a;
                    case 6:
                        dl7.a subtype2 = (dl7.a) obj2;
                        List domain6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(subtype2, "subtype");
                        Intrinsics.checkNotNullParameter(domain6, "domain");
                        xe0.e eVar4 = oVar.f184341c;
                        String strConcat = "CACHE_KEY_CFAC_CLAIMS".concat(u1.g(subtype2, gj7.a.f144239b));
                        Intrinsics.checkNotNullParameter(domain6, "<this>");
                        List<CFACClaim> list2 = domain6;
                        ArrayList arrayList13 = new ArrayList(w.t(list2, 10));
                        for (CFACClaim cFACClaim : list2) {
                            CFACClaimIds cFACClaimIds2 = cFACClaim.f74932a;
                            arrayList13.add(new aj7.f(new aj7.m(cFACClaimIds2.f74959a, cFACClaimIds2.f74960b), cFACClaim.f74933b, u1.g(cFACClaim.f74934c, hj7.a.f152668a), cFACClaim.d));
                        }
                        eVar4.G(arrayList13, strConcat, kii.e.o(aj7.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String planId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(planId, "planId");
                        efm.d0<x0> planInsuranceReviewDetails = oVar.f184339a.getPlanInsuranceReviewDetails(planId);
                        n nVar = n.f;
                        joe.e eVar5 = new joe.e(15);
                        planInsuranceReviewDetails.getClass();
                        ufm.i iVar4 = new ufm.i(planInsuranceReviewDetails, eVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        String planId2 = (String) obj2;
                        ti7.f domain7 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId2, "planId");
                        Intrinsics.checkNotNullParameter(domain7, "domain");
                        oVar.f184340b.f("CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId2, domain7);
                        return Unit.f186387a;
                    case 9:
                        String planId3 = (String) obj2;
                        ti7.f domain8 = (ti7.f) obj3;
                        Intrinsics.checkNotNullParameter(planId3, "planId");
                        Intrinsics.checkNotNullParameter(domain8, "domain");
                        xe0.e eVar6 = oVar.f184341c;
                        String str5 = "CACHE_KEY_PLAN_INSURANCE_REVIEW_DETAILS_" + planId3;
                        Intrinsics.checkNotNullParameter(domain8, "<this>");
                        List list3 = domain8.f271433a;
                        if (list3 != null) {
                            Intrinsics.checkNotNullParameter(list3, "<this>");
                            List<ti7.h> list4 = list3;
                            ArrayList arrayList14 = new ArrayList(w.t(list4, 10));
                            for (ti7.h hVar : list4) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                String strH = u1.h(hVar.f271438a, gj7.b.n());
                                if (strH == null) {
                                    m70.a.c(t0.f186434a);
                                    strH = "";
                                }
                                String str6 = strH;
                                String str7 = hVar.f271439b;
                                ArrayList<ti7.j> arrayList15 = hVar.f271440c;
                                ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                                for (ti7.j jVar2 : arrayList15) {
                                    arrayList16.add(new bj7.d(jVar2.f271441a, jVar2.f271442b, u1.g(jVar2.f271443c, ij7.b.f161721a)));
                                }
                                ArrayList<ti7.g> arrayList17 = hVar.d;
                                Intrinsics.checkNotNullParameter(arrayList17, "<this>");
                                ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                                for (ti7.g gVar2 : arrayList17) {
                                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                                    arrayList18.add(new bj7.b(gVar2.f271436a, gVar2.f271437b));
                                }
                                arrayList14.add(new bj7.c(str6, str7, hVar.e, arrayList16, arrayList18));
                            }
                            arrayList = arrayList14;
                        } else {
                            arrayList = null;
                        }
                        List list5 = domain8.f271434b;
                        String str8 = domain8.f271435c;
                        ti7.j jVar3 = domain8.d;
                        bj7.d dVar5 = jVar3 != null ? new bj7.d(jVar3.f271441a, jVar3.f271442b, u1.g(jVar3.f271443c, ij7.b.f161721a)) : null;
                        ti7.a aVar = domain8.e;
                        eVar6.G(new bj7.e(arrayList, list5, str8, dVar5, aVar != null ? new bj7.a(aVar.f271426a, aVar.f271427b) : null, domain8.f), str5, z.d(o0.b(bj7.e.class)));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        dl7.a subtype3 = (dl7.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(subtype3, "subtype");
                        efm.d0<List<jj7.k>> cFACClaims = oVar.f184339a.getCFACClaims(u1.g(subtype3, gj7.a.f144239b));
                        kce.c cVar3 = new kce.c(new kh4.b(22), 19);
                        cFACClaims.getClass();
                        ufm.i iVar5 = new ufm.i(cFACClaims, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    default:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        efm.d0<List<jj7.t0>> insuranceSubtypeLimits = oVar.f184339a.getInsuranceSubtypeLimits();
                        kce.c cVar4 = new kce.c(new kh4.b(20), 17);
                        insuranceSubtypeLimits.getClass();
                        ufm.i iVar6 = new ufm.i(insuranceSubtypeLimits, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
