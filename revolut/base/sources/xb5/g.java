package xb5;

import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.impl.network.ApiService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import mb5.h;
import mb5.j;
import mb5.k;
import mb5.l;
import mb5.p;
import mb5.q;
import mb5.r;
import mb5.s;
import mb5.t;
import mb5.u;
import mb5.v;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import wb5.b;
import wb5.f;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements ob5.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiService f303997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f303998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.f f303999c;
    public final ue0.c d;
    public final w4l.f e;
    public final w4l.f f;

    public g(ApiService api2, ne0.d memoryCache, r10.f networkUrlBuilder, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f303997a = api2;
        this.f303998b = memoryCache;
        this.f303999c = networkUrlBuilder;
        this.d = storage;
        final int i = 5;
        Function2 function2 = new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i2;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i3 = i;
                String str2 = "<this>";
                int i5 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i3) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i6 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i6, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i21 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i2 = i21;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i2 = i21;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i2, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i22 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i22, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i5));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 4;
        Function1 function1 = new Function1(this) { // from class: xb5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303993b;

            {
                this.f303993b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r qVar;
                switch (i2) {
                    case 0:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        wb5.a aVar = (wb5.a) this.f303993b.d.T2(g.a(facilityId), wb5.a.class);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getCurrency();
                        aVar2.getClass();
                        xi0.b currency2 = xi0.a.a(currency);
                        long currentDate = aVar.getCurrentDate();
                        List<wb5.d> autoPayments = aVar.getAutoPayments();
                        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
                        for (wb5.d dVar : autoPayments) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(currency2, "currency");
                            u uVar = (u) u1.u(dVar.getPaymentType(), tb5.b.f269461b);
                            wb5.f payment = dVar.getPayment();
                            if (payment != null) {
                                Intrinsics.checkNotNullParameter(payment, "<this>");
                                Intrinsics.checkNotNullParameter(currency2, "currency");
                                if (payment instanceof f.a) {
                                    f.a aVar3 = (f.a) payment;
                                    qVar = new p(aVar3.getId(), u.BACKUP_CARD, (v) u1.u(aVar3.getState(), tb5.b.f269460a), aVar3.getPaymentDay(), vb5.a.a(aVar3.getPaymentSource()));
                                } else {
                                    if (!(payment instanceof f.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f.b bVar = (f.b) payment;
                                    qVar = new q(bVar.getId(), u.SCHEDULED, (v) u1.u(bVar.getState(), tb5.b.f269460a), bVar.getPaymentDay(), vb5.a.a(bVar.getPaymentSource()), tb5.f.a((tb5.a) u1.u(bVar.getPaymentAmount().getAmountType(), tb5.f.f269468a), bVar.getPaymentAmount().getAmount(), currency2), bVar.getNextPaymentDate());
                                }
                            } else {
                                qVar = null;
                            }
                            arrayList.add(new s(uVar, qVar));
                        }
                        return new mb5.b(currentDate, aVar.getDueDate(), currency2, arrayList);
                    case 1:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (l) this.f303993b.f303998b.get(g.b(facilityId2));
                    case 2:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        wb5.b bVar2 = (wb5.b) this.f303993b.d.T2(g.b(facilityId3), wb5.b.class);
                        if (bVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        int changesAppliedDay = bVar2.getChangesAppliedDay();
                        List<b.C1633b> paymentSources = bVar2.getPaymentSources();
                        ArrayList arrayList2 = new ArrayList(w.t(paymentSources, 10));
                        for (b.C1633b c1633b : paymentSources) {
                            Intrinsics.checkNotNullParameter(c1633b, "<this>");
                            arrayList2.add(new k(c1633b.getId(), c1633b.getSelected(), (j) u1.u(c1633b.getState(), tb5.d.f269465a), c1633b.getBankIdentifier(), c1633b.getAccountNumber(), c1633b.getDebtorName()));
                        }
                        List<b.a> paymentRequests = bVar2.getPaymentRequests();
                        ArrayList arrayList3 = new ArrayList(w.t(paymentRequests, 10));
                        for (b.a aVar4 : paymentRequests) {
                            Intrinsics.checkNotNullParameter(aVar4, "<this>");
                            arrayList3.add(new mb5.i((h) u1.u(aVar4.getState(), tb5.d.f269466b), aVar4.getCollectionDate(), aVar4.getAmount(), aVar4.getSourceId()));
                        }
                        return new l(arrayList2, changesAppliedDay, arrayList3);
                    case 3:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (mb5.d) this.f303993b.f303998b.get(g.b(facilityId4));
                    default:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (mb5.b) this.f303993b.f303998b.get(g.a(facilityId5));
                }
            }
        };
        final int i3 = 0;
        Function2 function22 = new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i22;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i32 = i3;
                String str2 = "<this>";
                int i5 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i32) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i6 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i6, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i21 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i22 = i21;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i22 = i21;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i22, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i5));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: xb5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303993b;

            {
                this.f303993b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r qVar;
                switch (i3) {
                    case 0:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        wb5.a aVar = (wb5.a) this.f303993b.d.T2(g.a(facilityId), wb5.a.class);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getCurrency();
                        aVar2.getClass();
                        xi0.b currency2 = xi0.a.a(currency);
                        long currentDate = aVar.getCurrentDate();
                        List<wb5.d> autoPayments = aVar.getAutoPayments();
                        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
                        for (wb5.d dVar : autoPayments) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(currency2, "currency");
                            u uVar = (u) u1.u(dVar.getPaymentType(), tb5.b.f269461b);
                            wb5.f payment = dVar.getPayment();
                            if (payment != null) {
                                Intrinsics.checkNotNullParameter(payment, "<this>");
                                Intrinsics.checkNotNullParameter(currency2, "currency");
                                if (payment instanceof f.a) {
                                    f.a aVar3 = (f.a) payment;
                                    qVar = new p(aVar3.getId(), u.BACKUP_CARD, (v) u1.u(aVar3.getState(), tb5.b.f269460a), aVar3.getPaymentDay(), vb5.a.a(aVar3.getPaymentSource()));
                                } else {
                                    if (!(payment instanceof f.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f.b bVar = (f.b) payment;
                                    qVar = new q(bVar.getId(), u.SCHEDULED, (v) u1.u(bVar.getState(), tb5.b.f269460a), bVar.getPaymentDay(), vb5.a.a(bVar.getPaymentSource()), tb5.f.a((tb5.a) u1.u(bVar.getPaymentAmount().getAmountType(), tb5.f.f269468a), bVar.getPaymentAmount().getAmount(), currency2), bVar.getNextPaymentDate());
                                }
                            } else {
                                qVar = null;
                            }
                            arrayList.add(new s(uVar, qVar));
                        }
                        return new mb5.b(currentDate, aVar.getDueDate(), currency2, arrayList);
                    case 1:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (l) this.f303993b.f303998b.get(g.b(facilityId2));
                    case 2:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        wb5.b bVar2 = (wb5.b) this.f303993b.d.T2(g.b(facilityId3), wb5.b.class);
                        if (bVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        int changesAppliedDay = bVar2.getChangesAppliedDay();
                        List<b.C1633b> paymentSources = bVar2.getPaymentSources();
                        ArrayList arrayList2 = new ArrayList(w.t(paymentSources, 10));
                        for (b.C1633b c1633b : paymentSources) {
                            Intrinsics.checkNotNullParameter(c1633b, "<this>");
                            arrayList2.add(new k(c1633b.getId(), c1633b.getSelected(), (j) u1.u(c1633b.getState(), tb5.d.f269465a), c1633b.getBankIdentifier(), c1633b.getAccountNumber(), c1633b.getDebtorName()));
                        }
                        List<b.a> paymentRequests = bVar2.getPaymentRequests();
                        ArrayList arrayList3 = new ArrayList(w.t(paymentRequests, 10));
                        for (b.a aVar4 : paymentRequests) {
                            Intrinsics.checkNotNullParameter(aVar4, "<this>");
                            arrayList3.add(new mb5.i((h) u1.u(aVar4.getState(), tb5.d.f269466b), aVar4.getCollectionDate(), aVar4.getAmount(), aVar4.getSourceId()));
                        }
                        return new l(arrayList2, changesAppliedDay, arrayList3);
                    case 3:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (mb5.d) this.f303993b.f303998b.get(g.b(facilityId4));
                    default:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (mb5.b) this.f303993b.f303998b.get(g.a(facilityId5));
                }
            }
        };
        final int i5 = 1;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i22;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i32 = i5;
                String str2 = "<this>";
                int i59 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i32) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i6 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i6, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i21 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i22 = i21;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i22 = i21;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i22, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i59));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 2;
        Function2 function23 = new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i22;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i32 = i6;
                String str2 = "<this>";
                int i59 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i32) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i66 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i66, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i21 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i22 = i21;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i22 = i21;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i22, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i59));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        };
        final int i21 = 1;
        Function1 function13 = new Function1(this) { // from class: xb5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303993b;

            {
                this.f303993b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r qVar;
                switch (i21) {
                    case 0:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        wb5.a aVar = (wb5.a) this.f303993b.d.T2(g.a(facilityId), wb5.a.class);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getCurrency();
                        aVar2.getClass();
                        xi0.b currency2 = xi0.a.a(currency);
                        long currentDate = aVar.getCurrentDate();
                        List<wb5.d> autoPayments = aVar.getAutoPayments();
                        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
                        for (wb5.d dVar : autoPayments) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(currency2, "currency");
                            u uVar = (u) u1.u(dVar.getPaymentType(), tb5.b.f269461b);
                            wb5.f payment = dVar.getPayment();
                            if (payment != null) {
                                Intrinsics.checkNotNullParameter(payment, "<this>");
                                Intrinsics.checkNotNullParameter(currency2, "currency");
                                if (payment instanceof f.a) {
                                    f.a aVar3 = (f.a) payment;
                                    qVar = new p(aVar3.getId(), u.BACKUP_CARD, (v) u1.u(aVar3.getState(), tb5.b.f269460a), aVar3.getPaymentDay(), vb5.a.a(aVar3.getPaymentSource()));
                                } else {
                                    if (!(payment instanceof f.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f.b bVar = (f.b) payment;
                                    qVar = new q(bVar.getId(), u.SCHEDULED, (v) u1.u(bVar.getState(), tb5.b.f269460a), bVar.getPaymentDay(), vb5.a.a(bVar.getPaymentSource()), tb5.f.a((tb5.a) u1.u(bVar.getPaymentAmount().getAmountType(), tb5.f.f269468a), bVar.getPaymentAmount().getAmount(), currency2), bVar.getNextPaymentDate());
                                }
                            } else {
                                qVar = null;
                            }
                            arrayList.add(new s(uVar, qVar));
                        }
                        return new mb5.b(currentDate, aVar.getDueDate(), currency2, arrayList);
                    case 1:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (l) this.f303993b.f303998b.get(g.b(facilityId2));
                    case 2:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        wb5.b bVar2 = (wb5.b) this.f303993b.d.T2(g.b(facilityId3), wb5.b.class);
                        if (bVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        int changesAppliedDay = bVar2.getChangesAppliedDay();
                        List<b.C1633b> paymentSources = bVar2.getPaymentSources();
                        ArrayList arrayList2 = new ArrayList(w.t(paymentSources, 10));
                        for (b.C1633b c1633b : paymentSources) {
                            Intrinsics.checkNotNullParameter(c1633b, "<this>");
                            arrayList2.add(new k(c1633b.getId(), c1633b.getSelected(), (j) u1.u(c1633b.getState(), tb5.d.f269465a), c1633b.getBankIdentifier(), c1633b.getAccountNumber(), c1633b.getDebtorName()));
                        }
                        List<b.a> paymentRequests = bVar2.getPaymentRequests();
                        ArrayList arrayList3 = new ArrayList(w.t(paymentRequests, 10));
                        for (b.a aVar4 : paymentRequests) {
                            Intrinsics.checkNotNullParameter(aVar4, "<this>");
                            arrayList3.add(new mb5.i((h) u1.u(aVar4.getState(), tb5.d.f269466b), aVar4.getCollectionDate(), aVar4.getAmount(), aVar4.getSourceId()));
                        }
                        return new l(arrayList2, changesAppliedDay, arrayList3);
                    case 3:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (mb5.d) this.f303993b.f303998b.get(g.b(facilityId4));
                    default:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (mb5.b) this.f303993b.f303998b.get(g.a(facilityId5));
                }
            }
        };
        final int i22 = 3;
        Function2 function24 = new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i222;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i32 = i22;
                String str2 = "<this>";
                int i59 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i32) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i66 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i66, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i212 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i222, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i2222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i2222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i59));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        };
        final int i32 = 2;
        Function1 function14 = new Function1(this) { // from class: xb5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303993b;

            {
                this.f303993b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r qVar;
                switch (i32) {
                    case 0:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        wb5.a aVar = (wb5.a) this.f303993b.d.T2(g.a(facilityId), wb5.a.class);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getCurrency();
                        aVar2.getClass();
                        xi0.b currency2 = xi0.a.a(currency);
                        long currentDate = aVar.getCurrentDate();
                        List<wb5.d> autoPayments = aVar.getAutoPayments();
                        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
                        for (wb5.d dVar : autoPayments) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(currency2, "currency");
                            u uVar = (u) u1.u(dVar.getPaymentType(), tb5.b.f269461b);
                            wb5.f payment = dVar.getPayment();
                            if (payment != null) {
                                Intrinsics.checkNotNullParameter(payment, "<this>");
                                Intrinsics.checkNotNullParameter(currency2, "currency");
                                if (payment instanceof f.a) {
                                    f.a aVar3 = (f.a) payment;
                                    qVar = new p(aVar3.getId(), u.BACKUP_CARD, (v) u1.u(aVar3.getState(), tb5.b.f269460a), aVar3.getPaymentDay(), vb5.a.a(aVar3.getPaymentSource()));
                                } else {
                                    if (!(payment instanceof f.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f.b bVar = (f.b) payment;
                                    qVar = new q(bVar.getId(), u.SCHEDULED, (v) u1.u(bVar.getState(), tb5.b.f269460a), bVar.getPaymentDay(), vb5.a.a(bVar.getPaymentSource()), tb5.f.a((tb5.a) u1.u(bVar.getPaymentAmount().getAmountType(), tb5.f.f269468a), bVar.getPaymentAmount().getAmount(), currency2), bVar.getNextPaymentDate());
                                }
                            } else {
                                qVar = null;
                            }
                            arrayList.add(new s(uVar, qVar));
                        }
                        return new mb5.b(currentDate, aVar.getDueDate(), currency2, arrayList);
                    case 1:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (l) this.f303993b.f303998b.get(g.b(facilityId2));
                    case 2:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        wb5.b bVar2 = (wb5.b) this.f303993b.d.T2(g.b(facilityId3), wb5.b.class);
                        if (bVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        int changesAppliedDay = bVar2.getChangesAppliedDay();
                        List<b.C1633b> paymentSources = bVar2.getPaymentSources();
                        ArrayList arrayList2 = new ArrayList(w.t(paymentSources, 10));
                        for (b.C1633b c1633b : paymentSources) {
                            Intrinsics.checkNotNullParameter(c1633b, "<this>");
                            arrayList2.add(new k(c1633b.getId(), c1633b.getSelected(), (j) u1.u(c1633b.getState(), tb5.d.f269465a), c1633b.getBankIdentifier(), c1633b.getAccountNumber(), c1633b.getDebtorName()));
                        }
                        List<b.a> paymentRequests = bVar2.getPaymentRequests();
                        ArrayList arrayList3 = new ArrayList(w.t(paymentRequests, 10));
                        for (b.a aVar4 : paymentRequests) {
                            Intrinsics.checkNotNullParameter(aVar4, "<this>");
                            arrayList3.add(new mb5.i((h) u1.u(aVar4.getState(), tb5.d.f269466b), aVar4.getCollectionDate(), aVar4.getAmount(), aVar4.getSourceId()));
                        }
                        return new l(arrayList2, changesAppliedDay, arrayList3);
                    case 3:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (mb5.d) this.f303993b.f303998b.get(g.b(facilityId4));
                    default:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (mb5.b) this.f303993b.f303998b.get(g.a(facilityId5));
                }
            }
        };
        final int i33 = 4;
        this.f = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i222;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i322 = i33;
                String str2 = "<this>";
                int i59 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i322) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i66 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i66, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i212 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i222, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i2222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i2222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i59));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 6;
        Function2 function25 = new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i222;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i322 = i43;
                String str2 = "<this>";
                int i59 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i322) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i66 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i66, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i212 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i222, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i2222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i2222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i59));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        };
        final int i59 = 3;
        Function1 function15 = new Function1(this) { // from class: xb5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303993b;

            {
                this.f303993b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r qVar;
                switch (i59) {
                    case 0:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        wb5.a aVar = (wb5.a) this.f303993b.d.T2(g.a(facilityId), wb5.a.class);
                        if (aVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = aVar.getCurrency();
                        aVar2.getClass();
                        xi0.b currency2 = xi0.a.a(currency);
                        long currentDate = aVar.getCurrentDate();
                        List<wb5.d> autoPayments = aVar.getAutoPayments();
                        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
                        for (wb5.d dVar : autoPayments) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            Intrinsics.checkNotNullParameter(currency2, "currency");
                            u uVar = (u) u1.u(dVar.getPaymentType(), tb5.b.f269461b);
                            wb5.f payment = dVar.getPayment();
                            if (payment != null) {
                                Intrinsics.checkNotNullParameter(payment, "<this>");
                                Intrinsics.checkNotNullParameter(currency2, "currency");
                                if (payment instanceof f.a) {
                                    f.a aVar3 = (f.a) payment;
                                    qVar = new p(aVar3.getId(), u.BACKUP_CARD, (v) u1.u(aVar3.getState(), tb5.b.f269460a), aVar3.getPaymentDay(), vb5.a.a(aVar3.getPaymentSource()));
                                } else {
                                    if (!(payment instanceof f.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f.b bVar = (f.b) payment;
                                    qVar = new q(bVar.getId(), u.SCHEDULED, (v) u1.u(bVar.getState(), tb5.b.f269460a), bVar.getPaymentDay(), vb5.a.a(bVar.getPaymentSource()), tb5.f.a((tb5.a) u1.u(bVar.getPaymentAmount().getAmountType(), tb5.f.f269468a), bVar.getPaymentAmount().getAmount(), currency2), bVar.getNextPaymentDate());
                                }
                            } else {
                                qVar = null;
                            }
                            arrayList.add(new s(uVar, qVar));
                        }
                        return new mb5.b(currentDate, aVar.getDueDate(), currency2, arrayList);
                    case 1:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (l) this.f303993b.f303998b.get(g.b(facilityId2));
                    case 2:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        wb5.b bVar2 = (wb5.b) this.f303993b.d.T2(g.b(facilityId3), wb5.b.class);
                        if (bVar2 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        int changesAppliedDay = bVar2.getChangesAppliedDay();
                        List<b.C1633b> paymentSources = bVar2.getPaymentSources();
                        ArrayList arrayList2 = new ArrayList(w.t(paymentSources, 10));
                        for (b.C1633b c1633b : paymentSources) {
                            Intrinsics.checkNotNullParameter(c1633b, "<this>");
                            arrayList2.add(new k(c1633b.getId(), c1633b.getSelected(), (j) u1.u(c1633b.getState(), tb5.d.f269465a), c1633b.getBankIdentifier(), c1633b.getAccountNumber(), c1633b.getDebtorName()));
                        }
                        List<b.a> paymentRequests = bVar2.getPaymentRequests();
                        ArrayList arrayList3 = new ArrayList(w.t(paymentRequests, 10));
                        for (b.a aVar4 : paymentRequests) {
                            Intrinsics.checkNotNullParameter(aVar4, "<this>");
                            arrayList3.add(new mb5.i((h) u1.u(aVar4.getState(), tb5.d.f269466b), aVar4.getCollectionDate(), aVar4.getAmount(), aVar4.getSourceId()));
                        }
                        return new l(arrayList2, changesAppliedDay, arrayList3);
                    case 3:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (mb5.d) this.f303993b.f303998b.get(g.b(facilityId4));
                    default:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (mb5.b) this.f303993b.f303998b.get(g.a(facilityId5));
                }
            }
        };
        final int i66 = 7;
        new w4l.f(function25, function15, new Function2(this) { // from class: xb5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f303991b;

            {
                this.f303991b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Iterator it8;
                String str;
                long j2;
                long j3;
                wb5.f fVar;
                int i222;
                Long lValueOf;
                wb5.f bVar;
                dj0.d dVar;
                int i322 = i66;
                String str2 = "<this>";
                int i592 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                g gVar = this.f303991b;
                switch (i322) {
                    case 0:
                        String facilityId = (String) obj2;
                        mb5.b payment = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(payment, "payment");
                        gVar.f303998b.f(g.a(facilityId), payment);
                        return Unit.f186387a;
                    case 1:
                        String facilityId2 = (String) obj2;
                        mb5.b payment2 = (mb5.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(payment2, "payment");
                        ue0.c cVar = gVar.d;
                        String strA = g.a(facilityId2);
                        Intrinsics.checkNotNullParameter(payment2, "<this>");
                        long j5 = payment2.f204130a;
                        long j16 = payment2.f204131b;
                        String str3 = payment2.f204132c.f306286a;
                        List list = payment2.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            s sVar = (s) it9.next();
                            Intrinsics.checkNotNullParameter(sVar, str2);
                            u uVar = sVar.f204155a;
                            ?? r142 = tb5.b.f269461b;
                            String strG = u1.g(uVar, r142);
                            r rVar = sVar.f204156b;
                            if (rVar != null) {
                                Intrinsics.checkNotNullParameter(rVar, str2);
                                if (rVar instanceof p) {
                                    p pVar = (p) rVar;
                                    String str4 = pVar.f204148a;
                                    int i662 = pVar.d;
                                    t tVar = pVar.e;
                                    Intrinsics.checkNotNullParameter(tVar, str2);
                                    it8 = it9;
                                    j2 = j5;
                                    String str5 = tVar.f204157a;
                                    String str6 = tVar.f204158b;
                                    j jVar = tVar.f204159c;
                                    j3 = j16;
                                    bVar = new f.a(str4, u1.g(pVar.f204150c, tb5.b.f269460a), u1.g(pVar.f204149b, r142), i662, new wb5.e(str5, str6, jVar != null ? u1.g(jVar, tb5.d.f269465a) : null));
                                    str = str2;
                                } else {
                                    it8 = it9;
                                    j2 = j5;
                                    j3 = j16;
                                    if (!(rVar instanceof q)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    q qVar = (q) rVar;
                                    String str7 = qVar.f204151a;
                                    int i212 = qVar.d;
                                    t tVar2 = qVar.e;
                                    Intrinsics.checkNotNullParameter(tVar2, str2);
                                    String str8 = tVar2.f204157a;
                                    String str9 = tVar2.f204158b;
                                    j jVar2 = tVar2.f204159c;
                                    wb5.e eVar = new wb5.e(str8, str9, jVar2 != null ? u1.g(jVar2, tb5.d.f269465a) : null);
                                    String strG2 = u1.g(qVar.f204153c, tb5.b.f269460a);
                                    CreditScheduledAmountType creditScheduledAmountType = qVar.f;
                                    Intrinsics.checkNotNullParameter(creditScheduledAmountType, str2);
                                    String strA2 = vb5.a.b(creditScheduledAmountType).a();
                                    CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
                                    if (fixed == null || (dVar = fixed.f70684a) == null) {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = null;
                                    } else {
                                        i222 = i212;
                                        str = str2;
                                        lValueOf = Long.valueOf(dVar.f115082a);
                                    }
                                    bVar = new f.b(new wb5.c(strA2, lValueOf), str7, strG2, u1.g(qVar.f204152b, r142), i222, eVar, qVar.f204154g);
                                }
                                fVar = bVar;
                            } else {
                                it8 = it9;
                                str = str2;
                                j2 = j5;
                                j3 = j16;
                                fVar = null;
                            }
                            arrayList.add(new wb5.d(strG, fVar));
                            it9 = it8;
                            str2 = str;
                            j5 = j2;
                            j16 = j3;
                        }
                        cVar.G(new wb5.a(j5, j16, str3, arrayList), strA, z.d(o0.b(wb5.a.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        d0<ub5.f> directDebit = gVar.f303997a.getDirectDebit(facilityId3);
                        f fVar2 = f.f;
                        x2l.a aVar = new x2l.a(3, (boolean) (objArr == true ? 1 : 0));
                        directDebit.getClass();
                        i iVar = new i(directDebit, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String facilityId4 = (String) obj2;
                        l payment3 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(payment3, "payment");
                        gVar.f303998b.f(g.b(facilityId4), payment3);
                        return Unit.f186387a;
                    case 4:
                        String facilityId5 = (String) obj2;
                        l directDebit2 = (l) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(directDebit2, "directDebit");
                        ue0.c cVar2 = gVar.d;
                        String strB = g.b(facilityId5);
                        Intrinsics.checkNotNullParameter(directDebit2, "<this>");
                        int i2222 = directDebit2.f204145a;
                        List<k> list2 = directDebit2.f204146b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (k kVar : list2) {
                            Intrinsics.checkNotNullParameter(kVar, "<this>");
                            arrayList2.add(new b.C1633b(kVar.f204142a, u1.g(kVar.f204144c, tb5.d.f269465a), kVar.d, kVar.e, kVar.f, kVar.f204143b));
                        }
                        List<mb5.i> list3 = directDebit2.f204147c;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (mb5.i iVar2 : list3) {
                            Intrinsics.checkNotNullParameter(iVar2, "<this>");
                            arrayList3.add(new b.a(u1.g(iVar2.f204139a, tb5.d.f269466b), iVar2.d, iVar2.f204140b, iVar2.f204141c));
                        }
                        cVar2.G(new wb5.b(i2222, arrayList2, arrayList3), strB, z.d(o0.b(wb5.b.class)));
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String facilityId6 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        d0<ub5.b> autoPay = gVar.f303997a.getAutoPay(facilityId6);
                        e eVar2 = e.f;
                        x2l.a aVar2 = new x2l.a(2, (boolean) (objArr2 == true ? 1 : 0));
                        autoPay.getClass();
                        i iVar3 = new i(autoPay, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String facilityId7 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId7, "facilityId");
                        d0<ub5.e> creditAgreementsList = gVar.f303997a.getCreditAgreementsList(facilityId7);
                        x9h.d dVar2 = new x9h.d(14, new c(facilityId7, gVar, i592));
                        creditAgreementsList.getClass();
                        i iVar4 = new i(creditAgreementsList, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    default:
                        String facilityId8 = (String) obj2;
                        mb5.d documents = (mb5.d) obj3;
                        Intrinsics.checkNotNullParameter(facilityId8, "facilityId");
                        Intrinsics.checkNotNullParameter(documents, "documents");
                        gVar.f303998b.f(g.b(facilityId8), documents);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String a(String str) {
        return j6.a.q("credit-card-auto-pay-", str);
    }

    public static String b(String str) {
        return j6.a.q("credit-direct-debit-", str);
    }
}
