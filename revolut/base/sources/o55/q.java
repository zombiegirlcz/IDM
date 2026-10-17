package o55;

import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.credit.loan.api.models.rev10.ExcludedAmountRange;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAutoPayRepaymentSource;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCardPaymentSource;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentConfig;
import com.revolut.feature.credit.loan.api.models.rev10.LoanUnavailableFeatures;
import com.revolut.feature.credit.loan.api.models.rev10.RepaymentSuggestion;
import com.revolut.feature.credit.loan.impl.network.LoanProductService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import o45.b2;
import o45.w1;
import o45.y1;
import org.bouncycastle.asn1.BERTags;
import q35.k0;
import q35.l0;
import q35.m0;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanProductService f222360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f222361c;
    public final xx4.d d;
    public final n45.c e;
    public final c55.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f222362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f222363h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.firebase.messaging.t f222364j;

    public q(String baseUrl, LoanProductService api2, xx4.e storage, xx4.d memoryCache, n45.c loanDao, c55.s loanRefinancedCreditV2Mapper) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(loanDao, "loanDao");
        Intrinsics.checkNotNullParameter(loanRefinancedCreditV2Mapper, "loanRefinancedCreditV2Mapper");
        this.f222359a = baseUrl;
        this.f222360b = api2;
        this.f222361c = storage;
        this.d = memoryCache;
        this.e = loanDao;
        this.f = loanRefinancedCreditV2Mapper;
        final int i = 0;
        int i2 = 0;
        final int i3 = 1;
        this.f222362g = new w4l.f(new Function2(this) { // from class: o55.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f222353b;

            {
                this.f222353b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                long j2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String str;
                String str2;
                b2 b2Var;
                int i5 = i;
                q qVar = this.f222353b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g it8 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<i55.t<i55.l>> loans = qVar.f222360b.getLoans();
                        o oVar = o.f;
                        o0.a aVar = new o0.a(6);
                        loans.getClass();
                        ufm.i iVar = new ufm.i(loans, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List loans2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loans2, "loans");
                        final n45.c cVar = qVar.e;
                        Object obj4 = d55.f.f111363a;
                        Intrinsics.checkNotNullParameter(loans2, "<this>");
                        List list = loans2;
                        final ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(d55.f.c((q35.t) it9.next()));
                        }
                        cVar.getClass();
                        final int i6 = 1;
                        DBUtil.performBlocking(cVar.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj5;
                                switch (i6) {
                                    case 0:
                                        cVar.f.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                    default:
                                        cVar.d.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                }
                                return null;
                            }
                        });
                        qVar.f222361c.b(h.f222343a, Boolean.TRUE);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d key = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        efm.d0<i55.i> loanDetails = qVar.f222360b.getLoanDetails(key.f222325a);
                        n nVar = n.f;
                        o0.a aVar2 = new o0.a(7);
                        loanDetails.getClass();
                        ufm.i iVar2 = new ufm.i(loanDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        LoanDetails loanDetails2 = (LoanDetails) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loanDetails2, "loanDetails");
                        n45.c cVar2 = qVar.e;
                        Object obj5 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        w1 w1VarC = d55.f.c(loanDetails2);
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        Loan loan = loanDetails2.f70144a;
                        String str3 = loan.f70108a;
                        int i21 = loanDetails2.f70145b;
                        int i22 = loanDetails2.f70146c;
                        long j3 = loanDetails2.d.f115082a;
                        o45.c cVarD = d55.c.d(loanDetails2.e);
                        o45.c cVarD2 = d55.c.d(loanDetails2.f);
                        o45.c cVarD3 = d55.c.d(loanDetails2.f70147g);
                        Loan loan2 = loan;
                        long j5 = loanDetails2.f70148h.f115082a;
                        boolean z = loanDetails2.i;
                        LoanUnavailableFeatures loanUnavailableFeatures = loanDetails2.f70151m;
                        q35.j0 j0Var = loanUnavailableFeatures.f70201a;
                        String strG = j0Var != null ? u1.g(j0Var, d55.c.f111351a) : null;
                        l0 l0Var = loanUnavailableFeatures.f70202b;
                        String strG2 = l0Var != null ? u1.g(l0Var, d55.c.f111352b) : null;
                        m0 m0Var = loanUnavailableFeatures.f70203c;
                        String strG3 = m0Var != null ? u1.g(m0Var, d55.c.f111353c) : null;
                        k0 k0Var = loanUnavailableFeatures.d;
                        String strG4 = k0Var != null ? u1.g(k0Var, d55.c.d) : null;
                        q35.i0 i0Var = loanUnavailableFeatures.e;
                        o45.v vVar = new o45.v(strG, strG2, strG3, strG4, i0Var != null ? u1.g(i0Var, d55.c.e) : null);
                        List list2 = loanDetails2.f70150l;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            LoanBorrower loanBorrower = (LoanBorrower) it10.next();
                            Loan loan3 = loan2;
                            Iterator it11 = it10;
                            xi0.b bVar = loan3.f70123x;
                            String str4 = loanBorrower.f70138a;
                            int i32 = loanBorrower.f70139b;
                            LoanBorrower.PaymentSource paymentSource = loanBorrower.e;
                            String str5 = str3;
                            int i33 = i21;
                            String strG5 = u1.g(paymentSource.f70141a, d55.c.f111354g);
                            String strG6 = u1.g(paymentSource.f70142b, d55.c.f);
                            String str6 = paymentSource.f70143c;
                            String str7 = paymentSource.d;
                            String str8 = bVar.f306286a;
                            LoanRepaymentAccountDetails loanRepaymentAccountDetails = paymentSource.f;
                            if (loanRepaymentAccountDetails != null) {
                                Intrinsics.checkNotNullParameter(loanRepaymentAccountDetails, "<this>");
                                str = str8;
                                str2 = str6;
                                b2Var = new b2(loanRepaymentAccountDetails.f70175a, loanRepaymentAccountDetails.f70176b);
                            } else {
                                str = str8;
                                str2 = str6;
                                b2Var = null;
                            }
                            arrayList6.add(new o45.m(str4, i32, new o45.p(strG5, strG6, str2, str7, str, b2Var), loanBorrower.f70140c, loanBorrower.d));
                            it10 = it11;
                            loan2 = loan3;
                            str3 = str5;
                            i21 = i33;
                        }
                        String str9 = str3;
                        int i43 = i21;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = loanDetails2.f70149j;
                        o45.g gVar = loanAutoPayRepaymentSource != null ? new o45.g(loanAutoPayRepaymentSource.f70126a, u1.g(loanAutoPayRepaymentSource.f70127b, d55.c.f111355h), u1.g(loanAutoPayRepaymentSource.f70128c, d55.c.i), loanAutoPayRepaymentSource.d, loanAutoPayRepaymentSource.e, loanAutoPayRepaymentSource.f) : null;
                        LoanBackupCardPaymentSource loanBackupCardPaymentSource = loanDetails2.k;
                        o45.j jVar = loanBackupCardPaymentSource != null ? new o45.j(loanBackupCardPaymentSource.f70135a, loanBackupCardPaymentSource.f70136b, u1.g(loanBackupCardPaymentSource.f70137c, d55.c.f111356j), loanBackupCardPaymentSource.d) : null;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails2.f70152n;
                        dj0.d dVar = loanRepaymentConfig.f70177a;
                        q35.f0 f0Var = loanRepaymentConfig.e;
                        o45.j jVar2 = jVar;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        long j16 = loanRepaymentConfig.f70178b.f115082a;
                        long j22 = loanRepaymentConfig.f70179c.f115082a;
                        List list3 = loanRepaymentConfig.d;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = arrayList6;
                            j2 = j22;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((q35.g0) it12.next()).toString());
                            }
                            arrayList2 = arrayList7;
                        } else {
                            arrayList = arrayList6;
                            j2 = j22;
                            arrayList2 = null;
                        }
                        List list5 = f0Var.f241813a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it13 = list5.iterator();
                        while (it13.hasNext()) {
                            arrayList8.add(((io3.l) it13.next()).name());
                        }
                        Boolean boolValueOf = Boolean.valueOf(f0Var.f241814b);
                        Boolean boolValueOf2 = Boolean.valueOf(f0Var.d);
                        dj0.d dVar2 = loanRepaymentConfig.f;
                        Long lValueOf2 = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                        dj0.d dVar3 = loanRepaymentConfig.f70180g;
                        Long lValueOf3 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                        List list6 = loanRepaymentConfig.f70181h;
                        if (list6 != null) {
                            List list7 = list6;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                            Iterator it14 = list7.iterator();
                            while (it14.hasNext()) {
                                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it14.next();
                                arrayList9.add(new o45.y(repaymentSuggestion.f70204a, repaymentSuggestion.f70205b.f115082a));
                                it14 = it14;
                                i22 = i22;
                                jVar2 = jVar2;
                            }
                            arrayList3 = arrayList9;
                        } else {
                            arrayList3 = null;
                        }
                        o45.j jVar3 = jVar2;
                        int i59 = i22;
                        List list8 = loanRepaymentConfig.i;
                        if (list8 != null) {
                            List<ExcludedAmountRange> list9 = list8;
                            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                            for (ExcludedAmountRange excludedAmountRange : list9) {
                                arrayList10.add(new o45.f(excludedAmountRange.f70105a.f115082a, excludedAmountRange.f70106b.f115082a, excludedAmountRange.f70107c));
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, new q45.a(w1VarC, new o45.z(str9, i43, i59, j3, cVarD, cVarD2, cVarD3, j5, z, vVar, arrayList, gVar, jVar3, new o45.s(lValueOf, j16, j2, arrayList2, arrayList8, boolValueOf, boolValueOf2, lValueOf2, lValueOf3, arrayList3, arrayList4), loanDetails2.o)), 26));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        r key2 = (r) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        efm.d0<i55.x> refinancedCreditsV2 = qVar.f222360b.getRefinancedCreditsV2(key2.f222365a);
                        o4a.e eVar = new o4a.e(8, new nzj.n(1, qVar.f, c55.s.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanRefinancedCreditListDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRefinancedCreditList;", 0, 11));
                        refinancedCreditsV2.getClass();
                        ufm.i iVar3 = new ufm.i(refinancedCreditsV2, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        q35.z refinancedCreditsList = (q35.z) obj3;
                        Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                        ArrayList<q35.x> arrayList11 = refinancedCreditsList.d;
                        final ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        for (q35.x refinancedCreditDetails : arrayList11) {
                            c55.s sVar = qVar.f;
                            String loanId = refinancedCreditsList.f241848c;
                            String refinancingIdentifier = refinancedCreditsList.f241846a;
                            q35.y refinancingState = refinancedCreditsList.f241847b;
                            Intrinsics.checkNotNullParameter(refinancedCreditDetails, "refinancedCreditDetails");
                            Intrinsics.checkNotNullParameter(loanId, "loanId");
                            Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
                            Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
                            String strG7 = u1.g(refinancingState, sVar.e);
                            String str10 = refinancedCreditDetails.f241841a;
                            dj0.d dVar4 = refinancedCreditDetails.f241842b;
                            arrayList12.add(new y1(refinancingIdentifier, strG7, loanId, str10, u1.g(refinancedCreditDetails.f241843c, sVar.f21458c), dVar4.f115082a, dVar4.f115083b.f306286a, u1.g(refinancedCreditDetails.d, sVar.f21457b), u1.g(refinancedCreditDetails.e, sVar.d), refinancedCreditDetails.f241844g != null, refinancedCreditDetails.f, String.valueOf(refinancedCreditDetails.f241845h), refinancedCreditDetails.i));
                        }
                        final n45.c cVar3 = qVar.e;
                        cVar3.getClass();
                        final int i66 = 0;
                        DBUtil.performBlocking(cVar3.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i66) {
                                    case 0:
                                        cVar3.f.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                    default:
                                        cVar3.d.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                }
                                return null;
                            }
                        });
                        return Unit.f186387a;
                }
            }
        }, new ald.o(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i2, 10), new jki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i2, 4), new l(this, 0), new Function2(this) { // from class: o55.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f222353b;

            {
                this.f222353b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                long j2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String str;
                String str2;
                b2 b2Var;
                int i5 = i3;
                q qVar = this.f222353b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g it8 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<i55.t<i55.l>> loans = qVar.f222360b.getLoans();
                        o oVar = o.f;
                        o0.a aVar = new o0.a(6);
                        loans.getClass();
                        ufm.i iVar = new ufm.i(loans, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List loans2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loans2, "loans");
                        final n45.c cVar = qVar.e;
                        Object obj4 = d55.f.f111363a;
                        Intrinsics.checkNotNullParameter(loans2, "<this>");
                        List list = loans2;
                        final ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(d55.f.c((q35.t) it9.next()));
                        }
                        cVar.getClass();
                        final int i6 = 1;
                        DBUtil.performBlocking(cVar.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i6) {
                                    case 0:
                                        cVar.f.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                    default:
                                        cVar.d.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                }
                                return null;
                            }
                        });
                        qVar.f222361c.b(h.f222343a, Boolean.TRUE);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d key = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        efm.d0<i55.i> loanDetails = qVar.f222360b.getLoanDetails(key.f222325a);
                        n nVar = n.f;
                        o0.a aVar2 = new o0.a(7);
                        loanDetails.getClass();
                        ufm.i iVar2 = new ufm.i(loanDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        LoanDetails loanDetails2 = (LoanDetails) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loanDetails2, "loanDetails");
                        n45.c cVar2 = qVar.e;
                        Object obj5 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        w1 w1VarC = d55.f.c(loanDetails2);
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        Loan loan = loanDetails2.f70144a;
                        String str3 = loan.f70108a;
                        int i21 = loanDetails2.f70145b;
                        int i22 = loanDetails2.f70146c;
                        long j3 = loanDetails2.d.f115082a;
                        o45.c cVarD = d55.c.d(loanDetails2.e);
                        o45.c cVarD2 = d55.c.d(loanDetails2.f);
                        o45.c cVarD3 = d55.c.d(loanDetails2.f70147g);
                        Loan loan2 = loan;
                        long j5 = loanDetails2.f70148h.f115082a;
                        boolean z = loanDetails2.i;
                        LoanUnavailableFeatures loanUnavailableFeatures = loanDetails2.f70151m;
                        q35.j0 j0Var = loanUnavailableFeatures.f70201a;
                        String strG = j0Var != null ? u1.g(j0Var, d55.c.f111351a) : null;
                        l0 l0Var = loanUnavailableFeatures.f70202b;
                        String strG2 = l0Var != null ? u1.g(l0Var, d55.c.f111352b) : null;
                        m0 m0Var = loanUnavailableFeatures.f70203c;
                        String strG3 = m0Var != null ? u1.g(m0Var, d55.c.f111353c) : null;
                        k0 k0Var = loanUnavailableFeatures.d;
                        String strG4 = k0Var != null ? u1.g(k0Var, d55.c.d) : null;
                        q35.i0 i0Var = loanUnavailableFeatures.e;
                        o45.v vVar = new o45.v(strG, strG2, strG3, strG4, i0Var != null ? u1.g(i0Var, d55.c.e) : null);
                        List list2 = loanDetails2.f70150l;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            LoanBorrower loanBorrower = (LoanBorrower) it10.next();
                            Loan loan3 = loan2;
                            Iterator it11 = it10;
                            xi0.b bVar = loan3.f70123x;
                            String str4 = loanBorrower.f70138a;
                            int i32 = loanBorrower.f70139b;
                            LoanBorrower.PaymentSource paymentSource = loanBorrower.e;
                            String str5 = str3;
                            int i33 = i21;
                            String strG5 = u1.g(paymentSource.f70141a, d55.c.f111354g);
                            String strG6 = u1.g(paymentSource.f70142b, d55.c.f);
                            String str6 = paymentSource.f70143c;
                            String str7 = paymentSource.d;
                            String str8 = bVar.f306286a;
                            LoanRepaymentAccountDetails loanRepaymentAccountDetails = paymentSource.f;
                            if (loanRepaymentAccountDetails != null) {
                                Intrinsics.checkNotNullParameter(loanRepaymentAccountDetails, "<this>");
                                str = str8;
                                str2 = str6;
                                b2Var = new b2(loanRepaymentAccountDetails.f70175a, loanRepaymentAccountDetails.f70176b);
                            } else {
                                str = str8;
                                str2 = str6;
                                b2Var = null;
                            }
                            arrayList6.add(new o45.m(str4, i32, new o45.p(strG5, strG6, str2, str7, str, b2Var), loanBorrower.f70140c, loanBorrower.d));
                            it10 = it11;
                            loan2 = loan3;
                            str3 = str5;
                            i21 = i33;
                        }
                        String str9 = str3;
                        int i43 = i21;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = loanDetails2.f70149j;
                        o45.g gVar = loanAutoPayRepaymentSource != null ? new o45.g(loanAutoPayRepaymentSource.f70126a, u1.g(loanAutoPayRepaymentSource.f70127b, d55.c.f111355h), u1.g(loanAutoPayRepaymentSource.f70128c, d55.c.i), loanAutoPayRepaymentSource.d, loanAutoPayRepaymentSource.e, loanAutoPayRepaymentSource.f) : null;
                        LoanBackupCardPaymentSource loanBackupCardPaymentSource = loanDetails2.k;
                        o45.j jVar = loanBackupCardPaymentSource != null ? new o45.j(loanBackupCardPaymentSource.f70135a, loanBackupCardPaymentSource.f70136b, u1.g(loanBackupCardPaymentSource.f70137c, d55.c.f111356j), loanBackupCardPaymentSource.d) : null;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails2.f70152n;
                        dj0.d dVar = loanRepaymentConfig.f70177a;
                        q35.f0 f0Var = loanRepaymentConfig.e;
                        o45.j jVar2 = jVar;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        long j16 = loanRepaymentConfig.f70178b.f115082a;
                        long j22 = loanRepaymentConfig.f70179c.f115082a;
                        List list3 = loanRepaymentConfig.d;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = arrayList6;
                            j2 = j22;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((q35.g0) it12.next()).toString());
                            }
                            arrayList2 = arrayList7;
                        } else {
                            arrayList = arrayList6;
                            j2 = j22;
                            arrayList2 = null;
                        }
                        List list5 = f0Var.f241813a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it13 = list5.iterator();
                        while (it13.hasNext()) {
                            arrayList8.add(((io3.l) it13.next()).name());
                        }
                        Boolean boolValueOf = Boolean.valueOf(f0Var.f241814b);
                        Boolean boolValueOf2 = Boolean.valueOf(f0Var.d);
                        dj0.d dVar2 = loanRepaymentConfig.f;
                        Long lValueOf2 = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                        dj0.d dVar3 = loanRepaymentConfig.f70180g;
                        Long lValueOf3 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                        List list6 = loanRepaymentConfig.f70181h;
                        if (list6 != null) {
                            List list7 = list6;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                            Iterator it14 = list7.iterator();
                            while (it14.hasNext()) {
                                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it14.next();
                                arrayList9.add(new o45.y(repaymentSuggestion.f70204a, repaymentSuggestion.f70205b.f115082a));
                                it14 = it14;
                                i22 = i22;
                                jVar2 = jVar2;
                            }
                            arrayList3 = arrayList9;
                        } else {
                            arrayList3 = null;
                        }
                        o45.j jVar3 = jVar2;
                        int i59 = i22;
                        List list8 = loanRepaymentConfig.i;
                        if (list8 != null) {
                            List<ExcludedAmountRange> list9 = list8;
                            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                            for (ExcludedAmountRange excludedAmountRange : list9) {
                                arrayList10.add(new o45.f(excludedAmountRange.f70105a.f115082a, excludedAmountRange.f70106b.f115082a, excludedAmountRange.f70107c));
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, new q45.a(w1VarC, new o45.z(str9, i43, i59, j3, cVarD, cVarD2, cVarD3, j5, z, vVar, arrayList, gVar, jVar3, new o45.s(lValueOf, j16, j2, arrayList2, arrayList8, boolValueOf, boolValueOf2, lValueOf2, lValueOf3, arrayList3, arrayList4), loanDetails2.o)), 26));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        r key2 = (r) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        efm.d0<i55.x> refinancedCreditsV2 = qVar.f222360b.getRefinancedCreditsV2(key2.f222365a);
                        o4a.e eVar = new o4a.e(8, new nzj.n(1, qVar.f, c55.s.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanRefinancedCreditListDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRefinancedCreditList;", 0, 11));
                        refinancedCreditsV2.getClass();
                        ufm.i iVar3 = new ufm.i(refinancedCreditsV2, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        q35.z refinancedCreditsList = (q35.z) obj3;
                        Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                        ArrayList<q35.x> arrayList11 = refinancedCreditsList.d;
                        final ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        for (q35.x refinancedCreditDetails : arrayList11) {
                            c55.s sVar = qVar.f;
                            String loanId = refinancedCreditsList.f241848c;
                            String refinancingIdentifier = refinancedCreditsList.f241846a;
                            q35.y refinancingState = refinancedCreditsList.f241847b;
                            Intrinsics.checkNotNullParameter(refinancedCreditDetails, "refinancedCreditDetails");
                            Intrinsics.checkNotNullParameter(loanId, "loanId");
                            Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
                            Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
                            String strG7 = u1.g(refinancingState, sVar.e);
                            String str10 = refinancedCreditDetails.f241841a;
                            dj0.d dVar4 = refinancedCreditDetails.f241842b;
                            arrayList12.add(new y1(refinancingIdentifier, strG7, loanId, str10, u1.g(refinancedCreditDetails.f241843c, sVar.f21458c), dVar4.f115082a, dVar4.f115083b.f306286a, u1.g(refinancedCreditDetails.d, sVar.f21457b), u1.g(refinancedCreditDetails.e, sVar.d), refinancedCreditDetails.f241844g != null, refinancedCreditDetails.f, String.valueOf(refinancedCreditDetails.f241845h), refinancedCreditDetails.i));
                        }
                        final n45.c cVar3 = qVar.e;
                        cVar3.getClass();
                        final int i66 = 0;
                        DBUtil.performBlocking(cVar3.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i66) {
                                    case 0:
                                        cVar3.f.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                    default:
                                        cVar3.d.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                }
                                return null;
                            }
                        });
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 2;
        final int i6 = 3;
        this.f222363h = new w4l.f(new Function2(this) { // from class: o55.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f222353b;

            {
                this.f222353b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                long j2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String str;
                String str2;
                b2 b2Var;
                int i59 = i5;
                q qVar = this.f222353b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g it8 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<i55.t<i55.l>> loans = qVar.f222360b.getLoans();
                        o oVar = o.f;
                        o0.a aVar = new o0.a(6);
                        loans.getClass();
                        ufm.i iVar = new ufm.i(loans, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List loans2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loans2, "loans");
                        final n45.c cVar = qVar.e;
                        Object obj4 = d55.f.f111363a;
                        Intrinsics.checkNotNullParameter(loans2, "<this>");
                        List list = loans2;
                        final ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(d55.f.c((q35.t) it9.next()));
                        }
                        cVar.getClass();
                        final int i66 = 1;
                        DBUtil.performBlocking(cVar.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i66) {
                                    case 0:
                                        cVar.f.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                    default:
                                        cVar.d.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                }
                                return null;
                            }
                        });
                        qVar.f222361c.b(h.f222343a, Boolean.TRUE);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d key = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        efm.d0<i55.i> loanDetails = qVar.f222360b.getLoanDetails(key.f222325a);
                        n nVar = n.f;
                        o0.a aVar2 = new o0.a(7);
                        loanDetails.getClass();
                        ufm.i iVar2 = new ufm.i(loanDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        LoanDetails loanDetails2 = (LoanDetails) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loanDetails2, "loanDetails");
                        n45.c cVar2 = qVar.e;
                        Object obj5 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        w1 w1VarC = d55.f.c(loanDetails2);
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        Loan loan = loanDetails2.f70144a;
                        String str3 = loan.f70108a;
                        int i21 = loanDetails2.f70145b;
                        int i22 = loanDetails2.f70146c;
                        long j3 = loanDetails2.d.f115082a;
                        o45.c cVarD = d55.c.d(loanDetails2.e);
                        o45.c cVarD2 = d55.c.d(loanDetails2.f);
                        o45.c cVarD3 = d55.c.d(loanDetails2.f70147g);
                        Loan loan2 = loan;
                        long j5 = loanDetails2.f70148h.f115082a;
                        boolean z = loanDetails2.i;
                        LoanUnavailableFeatures loanUnavailableFeatures = loanDetails2.f70151m;
                        q35.j0 j0Var = loanUnavailableFeatures.f70201a;
                        String strG = j0Var != null ? u1.g(j0Var, d55.c.f111351a) : null;
                        l0 l0Var = loanUnavailableFeatures.f70202b;
                        String strG2 = l0Var != null ? u1.g(l0Var, d55.c.f111352b) : null;
                        m0 m0Var = loanUnavailableFeatures.f70203c;
                        String strG3 = m0Var != null ? u1.g(m0Var, d55.c.f111353c) : null;
                        k0 k0Var = loanUnavailableFeatures.d;
                        String strG4 = k0Var != null ? u1.g(k0Var, d55.c.d) : null;
                        q35.i0 i0Var = loanUnavailableFeatures.e;
                        o45.v vVar = new o45.v(strG, strG2, strG3, strG4, i0Var != null ? u1.g(i0Var, d55.c.e) : null);
                        List list2 = loanDetails2.f70150l;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            LoanBorrower loanBorrower = (LoanBorrower) it10.next();
                            Loan loan3 = loan2;
                            Iterator it11 = it10;
                            xi0.b bVar = loan3.f70123x;
                            String str4 = loanBorrower.f70138a;
                            int i32 = loanBorrower.f70139b;
                            LoanBorrower.PaymentSource paymentSource = loanBorrower.e;
                            String str5 = str3;
                            int i33 = i21;
                            String strG5 = u1.g(paymentSource.f70141a, d55.c.f111354g);
                            String strG6 = u1.g(paymentSource.f70142b, d55.c.f);
                            String str6 = paymentSource.f70143c;
                            String str7 = paymentSource.d;
                            String str8 = bVar.f306286a;
                            LoanRepaymentAccountDetails loanRepaymentAccountDetails = paymentSource.f;
                            if (loanRepaymentAccountDetails != null) {
                                Intrinsics.checkNotNullParameter(loanRepaymentAccountDetails, "<this>");
                                str = str8;
                                str2 = str6;
                                b2Var = new b2(loanRepaymentAccountDetails.f70175a, loanRepaymentAccountDetails.f70176b);
                            } else {
                                str = str8;
                                str2 = str6;
                                b2Var = null;
                            }
                            arrayList6.add(new o45.m(str4, i32, new o45.p(strG5, strG6, str2, str7, str, b2Var), loanBorrower.f70140c, loanBorrower.d));
                            it10 = it11;
                            loan2 = loan3;
                            str3 = str5;
                            i21 = i33;
                        }
                        String str9 = str3;
                        int i43 = i21;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = loanDetails2.f70149j;
                        o45.g gVar = loanAutoPayRepaymentSource != null ? new o45.g(loanAutoPayRepaymentSource.f70126a, u1.g(loanAutoPayRepaymentSource.f70127b, d55.c.f111355h), u1.g(loanAutoPayRepaymentSource.f70128c, d55.c.i), loanAutoPayRepaymentSource.d, loanAutoPayRepaymentSource.e, loanAutoPayRepaymentSource.f) : null;
                        LoanBackupCardPaymentSource loanBackupCardPaymentSource = loanDetails2.k;
                        o45.j jVar = loanBackupCardPaymentSource != null ? new o45.j(loanBackupCardPaymentSource.f70135a, loanBackupCardPaymentSource.f70136b, u1.g(loanBackupCardPaymentSource.f70137c, d55.c.f111356j), loanBackupCardPaymentSource.d) : null;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails2.f70152n;
                        dj0.d dVar = loanRepaymentConfig.f70177a;
                        q35.f0 f0Var = loanRepaymentConfig.e;
                        o45.j jVar2 = jVar;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        long j16 = loanRepaymentConfig.f70178b.f115082a;
                        long j22 = loanRepaymentConfig.f70179c.f115082a;
                        List list3 = loanRepaymentConfig.d;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = arrayList6;
                            j2 = j22;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((q35.g0) it12.next()).toString());
                            }
                            arrayList2 = arrayList7;
                        } else {
                            arrayList = arrayList6;
                            j2 = j22;
                            arrayList2 = null;
                        }
                        List list5 = f0Var.f241813a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it13 = list5.iterator();
                        while (it13.hasNext()) {
                            arrayList8.add(((io3.l) it13.next()).name());
                        }
                        Boolean boolValueOf = Boolean.valueOf(f0Var.f241814b);
                        Boolean boolValueOf2 = Boolean.valueOf(f0Var.d);
                        dj0.d dVar2 = loanRepaymentConfig.f;
                        Long lValueOf2 = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                        dj0.d dVar3 = loanRepaymentConfig.f70180g;
                        Long lValueOf3 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                        List list6 = loanRepaymentConfig.f70181h;
                        if (list6 != null) {
                            List list7 = list6;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                            Iterator it14 = list7.iterator();
                            while (it14.hasNext()) {
                                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it14.next();
                                arrayList9.add(new o45.y(repaymentSuggestion.f70204a, repaymentSuggestion.f70205b.f115082a));
                                it14 = it14;
                                i22 = i22;
                                jVar2 = jVar2;
                            }
                            arrayList3 = arrayList9;
                        } else {
                            arrayList3 = null;
                        }
                        o45.j jVar3 = jVar2;
                        int i592 = i22;
                        List list8 = loanRepaymentConfig.i;
                        if (list8 != null) {
                            List<ExcludedAmountRange> list9 = list8;
                            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                            for (ExcludedAmountRange excludedAmountRange : list9) {
                                arrayList10.add(new o45.f(excludedAmountRange.f70105a.f115082a, excludedAmountRange.f70106b.f115082a, excludedAmountRange.f70107c));
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, new q45.a(w1VarC, new o45.z(str9, i43, i592, j3, cVarD, cVarD2, cVarD3, j5, z, vVar, arrayList, gVar, jVar3, new o45.s(lValueOf, j16, j2, arrayList2, arrayList8, boolValueOf, boolValueOf2, lValueOf2, lValueOf3, arrayList3, arrayList4), loanDetails2.o)), 26));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        r key2 = (r) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        efm.d0<i55.x> refinancedCreditsV2 = qVar.f222360b.getRefinancedCreditsV2(key2.f222365a);
                        o4a.e eVar = new o4a.e(8, new nzj.n(1, qVar.f, c55.s.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanRefinancedCreditListDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRefinancedCreditList;", 0, 11));
                        refinancedCreditsV2.getClass();
                        ufm.i iVar3 = new ufm.i(refinancedCreditsV2, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        q35.z refinancedCreditsList = (q35.z) obj3;
                        Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                        ArrayList<q35.x> arrayList11 = refinancedCreditsList.d;
                        final ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        for (q35.x refinancedCreditDetails : arrayList11) {
                            c55.s sVar = qVar.f;
                            String loanId = refinancedCreditsList.f241848c;
                            String refinancingIdentifier = refinancedCreditsList.f241846a;
                            q35.y refinancingState = refinancedCreditsList.f241847b;
                            Intrinsics.checkNotNullParameter(refinancedCreditDetails, "refinancedCreditDetails");
                            Intrinsics.checkNotNullParameter(loanId, "loanId");
                            Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
                            Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
                            String strG7 = u1.g(refinancingState, sVar.e);
                            String str10 = refinancedCreditDetails.f241841a;
                            dj0.d dVar4 = refinancedCreditDetails.f241842b;
                            arrayList12.add(new y1(refinancingIdentifier, strG7, loanId, str10, u1.g(refinancedCreditDetails.f241843c, sVar.f21458c), dVar4.f115082a, dVar4.f115083b.f306286a, u1.g(refinancedCreditDetails.d, sVar.f21457b), u1.g(refinancedCreditDetails.e, sVar.d), refinancedCreditDetails.f241844g != null, refinancedCreditDetails.f, String.valueOf(refinancedCreditDetails.f241845h), refinancedCreditDetails.i));
                        }
                        final n45.c cVar3 = qVar.e;
                        cVar3.getClass();
                        final int i662 = 0;
                        DBUtil.performBlocking(cVar3.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i662) {
                                    case 0:
                                        cVar3.f.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                    default:
                                        cVar3.d.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                }
                                return null;
                            }
                        });
                        return Unit.f186387a;
                }
            }
        }, new ald.o(i3, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i2, 7), new jki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i2, 1), new l(this, 1), new Function2(this) { // from class: o55.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f222353b;

            {
                this.f222353b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                long j2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String str;
                String str2;
                b2 b2Var;
                int i59 = i6;
                q qVar = this.f222353b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g it8 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<i55.t<i55.l>> loans = qVar.f222360b.getLoans();
                        o oVar = o.f;
                        o0.a aVar = new o0.a(6);
                        loans.getClass();
                        ufm.i iVar = new ufm.i(loans, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List loans2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loans2, "loans");
                        final n45.c cVar = qVar.e;
                        Object obj4 = d55.f.f111363a;
                        Intrinsics.checkNotNullParameter(loans2, "<this>");
                        List list = loans2;
                        final ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(d55.f.c((q35.t) it9.next()));
                        }
                        cVar.getClass();
                        final int i66 = 1;
                        DBUtil.performBlocking(cVar.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i66) {
                                    case 0:
                                        cVar.f.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                    default:
                                        cVar.d.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                }
                                return null;
                            }
                        });
                        qVar.f222361c.b(h.f222343a, Boolean.TRUE);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d key = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        efm.d0<i55.i> loanDetails = qVar.f222360b.getLoanDetails(key.f222325a);
                        n nVar = n.f;
                        o0.a aVar2 = new o0.a(7);
                        loanDetails.getClass();
                        ufm.i iVar2 = new ufm.i(loanDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        LoanDetails loanDetails2 = (LoanDetails) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loanDetails2, "loanDetails");
                        n45.c cVar2 = qVar.e;
                        Object obj5 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        w1 w1VarC = d55.f.c(loanDetails2);
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        Loan loan = loanDetails2.f70144a;
                        String str3 = loan.f70108a;
                        int i21 = loanDetails2.f70145b;
                        int i22 = loanDetails2.f70146c;
                        long j3 = loanDetails2.d.f115082a;
                        o45.c cVarD = d55.c.d(loanDetails2.e);
                        o45.c cVarD2 = d55.c.d(loanDetails2.f);
                        o45.c cVarD3 = d55.c.d(loanDetails2.f70147g);
                        Loan loan2 = loan;
                        long j5 = loanDetails2.f70148h.f115082a;
                        boolean z = loanDetails2.i;
                        LoanUnavailableFeatures loanUnavailableFeatures = loanDetails2.f70151m;
                        q35.j0 j0Var = loanUnavailableFeatures.f70201a;
                        String strG = j0Var != null ? u1.g(j0Var, d55.c.f111351a) : null;
                        l0 l0Var = loanUnavailableFeatures.f70202b;
                        String strG2 = l0Var != null ? u1.g(l0Var, d55.c.f111352b) : null;
                        m0 m0Var = loanUnavailableFeatures.f70203c;
                        String strG3 = m0Var != null ? u1.g(m0Var, d55.c.f111353c) : null;
                        k0 k0Var = loanUnavailableFeatures.d;
                        String strG4 = k0Var != null ? u1.g(k0Var, d55.c.d) : null;
                        q35.i0 i0Var = loanUnavailableFeatures.e;
                        o45.v vVar = new o45.v(strG, strG2, strG3, strG4, i0Var != null ? u1.g(i0Var, d55.c.e) : null);
                        List list2 = loanDetails2.f70150l;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            LoanBorrower loanBorrower = (LoanBorrower) it10.next();
                            Loan loan3 = loan2;
                            Iterator it11 = it10;
                            xi0.b bVar = loan3.f70123x;
                            String str4 = loanBorrower.f70138a;
                            int i32 = loanBorrower.f70139b;
                            LoanBorrower.PaymentSource paymentSource = loanBorrower.e;
                            String str5 = str3;
                            int i33 = i21;
                            String strG5 = u1.g(paymentSource.f70141a, d55.c.f111354g);
                            String strG6 = u1.g(paymentSource.f70142b, d55.c.f);
                            String str6 = paymentSource.f70143c;
                            String str7 = paymentSource.d;
                            String str8 = bVar.f306286a;
                            LoanRepaymentAccountDetails loanRepaymentAccountDetails = paymentSource.f;
                            if (loanRepaymentAccountDetails != null) {
                                Intrinsics.checkNotNullParameter(loanRepaymentAccountDetails, "<this>");
                                str = str8;
                                str2 = str6;
                                b2Var = new b2(loanRepaymentAccountDetails.f70175a, loanRepaymentAccountDetails.f70176b);
                            } else {
                                str = str8;
                                str2 = str6;
                                b2Var = null;
                            }
                            arrayList6.add(new o45.m(str4, i32, new o45.p(strG5, strG6, str2, str7, str, b2Var), loanBorrower.f70140c, loanBorrower.d));
                            it10 = it11;
                            loan2 = loan3;
                            str3 = str5;
                            i21 = i33;
                        }
                        String str9 = str3;
                        int i43 = i21;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = loanDetails2.f70149j;
                        o45.g gVar = loanAutoPayRepaymentSource != null ? new o45.g(loanAutoPayRepaymentSource.f70126a, u1.g(loanAutoPayRepaymentSource.f70127b, d55.c.f111355h), u1.g(loanAutoPayRepaymentSource.f70128c, d55.c.i), loanAutoPayRepaymentSource.d, loanAutoPayRepaymentSource.e, loanAutoPayRepaymentSource.f) : null;
                        LoanBackupCardPaymentSource loanBackupCardPaymentSource = loanDetails2.k;
                        o45.j jVar = loanBackupCardPaymentSource != null ? new o45.j(loanBackupCardPaymentSource.f70135a, loanBackupCardPaymentSource.f70136b, u1.g(loanBackupCardPaymentSource.f70137c, d55.c.f111356j), loanBackupCardPaymentSource.d) : null;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails2.f70152n;
                        dj0.d dVar = loanRepaymentConfig.f70177a;
                        q35.f0 f0Var = loanRepaymentConfig.e;
                        o45.j jVar2 = jVar;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        long j16 = loanRepaymentConfig.f70178b.f115082a;
                        long j22 = loanRepaymentConfig.f70179c.f115082a;
                        List list3 = loanRepaymentConfig.d;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = arrayList6;
                            j2 = j22;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((q35.g0) it12.next()).toString());
                            }
                            arrayList2 = arrayList7;
                        } else {
                            arrayList = arrayList6;
                            j2 = j22;
                            arrayList2 = null;
                        }
                        List list5 = f0Var.f241813a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it13 = list5.iterator();
                        while (it13.hasNext()) {
                            arrayList8.add(((io3.l) it13.next()).name());
                        }
                        Boolean boolValueOf = Boolean.valueOf(f0Var.f241814b);
                        Boolean boolValueOf2 = Boolean.valueOf(f0Var.d);
                        dj0.d dVar2 = loanRepaymentConfig.f;
                        Long lValueOf2 = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                        dj0.d dVar3 = loanRepaymentConfig.f70180g;
                        Long lValueOf3 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                        List list6 = loanRepaymentConfig.f70181h;
                        if (list6 != null) {
                            List list7 = list6;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                            Iterator it14 = list7.iterator();
                            while (it14.hasNext()) {
                                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it14.next();
                                arrayList9.add(new o45.y(repaymentSuggestion.f70204a, repaymentSuggestion.f70205b.f115082a));
                                it14 = it14;
                                i22 = i22;
                                jVar2 = jVar2;
                            }
                            arrayList3 = arrayList9;
                        } else {
                            arrayList3 = null;
                        }
                        o45.j jVar3 = jVar2;
                        int i592 = i22;
                        List list8 = loanRepaymentConfig.i;
                        if (list8 != null) {
                            List<ExcludedAmountRange> list9 = list8;
                            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                            for (ExcludedAmountRange excludedAmountRange : list9) {
                                arrayList10.add(new o45.f(excludedAmountRange.f70105a.f115082a, excludedAmountRange.f70106b.f115082a, excludedAmountRange.f70107c));
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, new q45.a(w1VarC, new o45.z(str9, i43, i592, j3, cVarD, cVarD2, cVarD3, j5, z, vVar, arrayList, gVar, jVar3, new o45.s(lValueOf, j16, j2, arrayList2, arrayList8, boolValueOf, boolValueOf2, lValueOf2, lValueOf3, arrayList3, arrayList4), loanDetails2.o)), 26));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        r key2 = (r) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        efm.d0<i55.x> refinancedCreditsV2 = qVar.f222360b.getRefinancedCreditsV2(key2.f222365a);
                        o4a.e eVar = new o4a.e(8, new nzj.n(1, qVar.f, c55.s.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanRefinancedCreditListDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRefinancedCreditList;", 0, 11));
                        refinancedCreditsV2.getClass();
                        ufm.i iVar3 = new ufm.i(refinancedCreditsV2, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        q35.z refinancedCreditsList = (q35.z) obj3;
                        Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                        ArrayList<q35.x> arrayList11 = refinancedCreditsList.d;
                        final ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        for (q35.x refinancedCreditDetails : arrayList11) {
                            c55.s sVar = qVar.f;
                            String loanId = refinancedCreditsList.f241848c;
                            String refinancingIdentifier = refinancedCreditsList.f241846a;
                            q35.y refinancingState = refinancedCreditsList.f241847b;
                            Intrinsics.checkNotNullParameter(refinancedCreditDetails, "refinancedCreditDetails");
                            Intrinsics.checkNotNullParameter(loanId, "loanId");
                            Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
                            Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
                            String strG7 = u1.g(refinancingState, sVar.e);
                            String str10 = refinancedCreditDetails.f241841a;
                            dj0.d dVar4 = refinancedCreditDetails.f241842b;
                            arrayList12.add(new y1(refinancingIdentifier, strG7, loanId, str10, u1.g(refinancedCreditDetails.f241843c, sVar.f21458c), dVar4.f115082a, dVar4.f115083b.f306286a, u1.g(refinancedCreditDetails.d, sVar.f21457b), u1.g(refinancedCreditDetails.e, sVar.d), refinancedCreditDetails.f241844g != null, refinancedCreditDetails.f, String.valueOf(refinancedCreditDetails.f241845h), refinancedCreditDetails.i));
                        }
                        final n45.c cVar3 = qVar.e;
                        cVar3.getClass();
                        final int i662 = 0;
                        DBUtil.performBlocking(cVar3.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i662) {
                                    case 0:
                                        cVar3.f.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                    default:
                                        cVar3.d.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                }
                                return null;
                            }
                        });
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 4;
        Function2 function2 = new Function2(this) { // from class: o55.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f222353b;

            {
                this.f222353b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                long j2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String str;
                String str2;
                b2 b2Var;
                int i59 = i21;
                q qVar = this.f222353b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g it8 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<i55.t<i55.l>> loans = qVar.f222360b.getLoans();
                        o oVar = o.f;
                        o0.a aVar = new o0.a(6);
                        loans.getClass();
                        ufm.i iVar = new ufm.i(loans, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List loans2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loans2, "loans");
                        final n45.c cVar = qVar.e;
                        Object obj4 = d55.f.f111363a;
                        Intrinsics.checkNotNullParameter(loans2, "<this>");
                        List list = loans2;
                        final ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(d55.f.c((q35.t) it9.next()));
                        }
                        cVar.getClass();
                        final int i66 = 1;
                        DBUtil.performBlocking(cVar.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i66) {
                                    case 0:
                                        cVar.f.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                    default:
                                        cVar.d.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                }
                                return null;
                            }
                        });
                        qVar.f222361c.b(h.f222343a, Boolean.TRUE);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d key = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        efm.d0<i55.i> loanDetails = qVar.f222360b.getLoanDetails(key.f222325a);
                        n nVar = n.f;
                        o0.a aVar2 = new o0.a(7);
                        loanDetails.getClass();
                        ufm.i iVar2 = new ufm.i(loanDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        LoanDetails loanDetails2 = (LoanDetails) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loanDetails2, "loanDetails");
                        n45.c cVar2 = qVar.e;
                        Object obj5 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        w1 w1VarC = d55.f.c(loanDetails2);
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        Loan loan = loanDetails2.f70144a;
                        String str3 = loan.f70108a;
                        int i212 = loanDetails2.f70145b;
                        int i22 = loanDetails2.f70146c;
                        long j3 = loanDetails2.d.f115082a;
                        o45.c cVarD = d55.c.d(loanDetails2.e);
                        o45.c cVarD2 = d55.c.d(loanDetails2.f);
                        o45.c cVarD3 = d55.c.d(loanDetails2.f70147g);
                        Loan loan2 = loan;
                        long j5 = loanDetails2.f70148h.f115082a;
                        boolean z = loanDetails2.i;
                        LoanUnavailableFeatures loanUnavailableFeatures = loanDetails2.f70151m;
                        q35.j0 j0Var = loanUnavailableFeatures.f70201a;
                        String strG = j0Var != null ? u1.g(j0Var, d55.c.f111351a) : null;
                        l0 l0Var = loanUnavailableFeatures.f70202b;
                        String strG2 = l0Var != null ? u1.g(l0Var, d55.c.f111352b) : null;
                        m0 m0Var = loanUnavailableFeatures.f70203c;
                        String strG3 = m0Var != null ? u1.g(m0Var, d55.c.f111353c) : null;
                        k0 k0Var = loanUnavailableFeatures.d;
                        String strG4 = k0Var != null ? u1.g(k0Var, d55.c.d) : null;
                        q35.i0 i0Var = loanUnavailableFeatures.e;
                        o45.v vVar = new o45.v(strG, strG2, strG3, strG4, i0Var != null ? u1.g(i0Var, d55.c.e) : null);
                        List list2 = loanDetails2.f70150l;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            LoanBorrower loanBorrower = (LoanBorrower) it10.next();
                            Loan loan3 = loan2;
                            Iterator it11 = it10;
                            xi0.b bVar = loan3.f70123x;
                            String str4 = loanBorrower.f70138a;
                            int i32 = loanBorrower.f70139b;
                            LoanBorrower.PaymentSource paymentSource = loanBorrower.e;
                            String str5 = str3;
                            int i33 = i212;
                            String strG5 = u1.g(paymentSource.f70141a, d55.c.f111354g);
                            String strG6 = u1.g(paymentSource.f70142b, d55.c.f);
                            String str6 = paymentSource.f70143c;
                            String str7 = paymentSource.d;
                            String str8 = bVar.f306286a;
                            LoanRepaymentAccountDetails loanRepaymentAccountDetails = paymentSource.f;
                            if (loanRepaymentAccountDetails != null) {
                                Intrinsics.checkNotNullParameter(loanRepaymentAccountDetails, "<this>");
                                str = str8;
                                str2 = str6;
                                b2Var = new b2(loanRepaymentAccountDetails.f70175a, loanRepaymentAccountDetails.f70176b);
                            } else {
                                str = str8;
                                str2 = str6;
                                b2Var = null;
                            }
                            arrayList6.add(new o45.m(str4, i32, new o45.p(strG5, strG6, str2, str7, str, b2Var), loanBorrower.f70140c, loanBorrower.d));
                            it10 = it11;
                            loan2 = loan3;
                            str3 = str5;
                            i212 = i33;
                        }
                        String str9 = str3;
                        int i43 = i212;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = loanDetails2.f70149j;
                        o45.g gVar = loanAutoPayRepaymentSource != null ? new o45.g(loanAutoPayRepaymentSource.f70126a, u1.g(loanAutoPayRepaymentSource.f70127b, d55.c.f111355h), u1.g(loanAutoPayRepaymentSource.f70128c, d55.c.i), loanAutoPayRepaymentSource.d, loanAutoPayRepaymentSource.e, loanAutoPayRepaymentSource.f) : null;
                        LoanBackupCardPaymentSource loanBackupCardPaymentSource = loanDetails2.k;
                        o45.j jVar = loanBackupCardPaymentSource != null ? new o45.j(loanBackupCardPaymentSource.f70135a, loanBackupCardPaymentSource.f70136b, u1.g(loanBackupCardPaymentSource.f70137c, d55.c.f111356j), loanBackupCardPaymentSource.d) : null;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails2.f70152n;
                        dj0.d dVar = loanRepaymentConfig.f70177a;
                        q35.f0 f0Var = loanRepaymentConfig.e;
                        o45.j jVar2 = jVar;
                        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                        long j16 = loanRepaymentConfig.f70178b.f115082a;
                        long j22 = loanRepaymentConfig.f70179c.f115082a;
                        List list3 = loanRepaymentConfig.d;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = arrayList6;
                            j2 = j22;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((q35.g0) it12.next()).toString());
                            }
                            arrayList2 = arrayList7;
                        } else {
                            arrayList = arrayList6;
                            j2 = j22;
                            arrayList2 = null;
                        }
                        List list5 = f0Var.f241813a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it13 = list5.iterator();
                        while (it13.hasNext()) {
                            arrayList8.add(((io3.l) it13.next()).name());
                        }
                        Boolean boolValueOf = Boolean.valueOf(f0Var.f241814b);
                        Boolean boolValueOf2 = Boolean.valueOf(f0Var.d);
                        dj0.d dVar2 = loanRepaymentConfig.f;
                        Long lValueOf2 = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                        dj0.d dVar3 = loanRepaymentConfig.f70180g;
                        Long lValueOf3 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                        List list6 = loanRepaymentConfig.f70181h;
                        if (list6 != null) {
                            List list7 = list6;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                            Iterator it14 = list7.iterator();
                            while (it14.hasNext()) {
                                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it14.next();
                                arrayList9.add(new o45.y(repaymentSuggestion.f70204a, repaymentSuggestion.f70205b.f115082a));
                                it14 = it14;
                                i22 = i22;
                                jVar2 = jVar2;
                            }
                            arrayList3 = arrayList9;
                        } else {
                            arrayList3 = null;
                        }
                        o45.j jVar3 = jVar2;
                        int i592 = i22;
                        List list8 = loanRepaymentConfig.i;
                        if (list8 != null) {
                            List<ExcludedAmountRange> list9 = list8;
                            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                            for (ExcludedAmountRange excludedAmountRange : list9) {
                                arrayList10.add(new o45.f(excludedAmountRange.f70105a.f115082a, excludedAmountRange.f70106b.f115082a, excludedAmountRange.f70107c));
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, new q45.a(w1VarC, new o45.z(str9, i43, i592, j3, cVarD, cVarD2, cVarD3, j5, z, vVar, arrayList, gVar, jVar3, new o45.s(lValueOf, j16, j2, arrayList2, arrayList8, boolValueOf, boolValueOf2, lValueOf2, lValueOf3, arrayList3, arrayList4), loanDetails2.o)), 26));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        r key2 = (r) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        efm.d0<i55.x> refinancedCreditsV2 = qVar.f222360b.getRefinancedCreditsV2(key2.f222365a);
                        o4a.e eVar = new o4a.e(8, new nzj.n(1, qVar.f, c55.s.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanRefinancedCreditListDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRefinancedCreditList;", 0, 11));
                        refinancedCreditsV2.getClass();
                        ufm.i iVar3 = new ufm.i(refinancedCreditsV2, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        q35.z refinancedCreditsList = (q35.z) obj3;
                        Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                        ArrayList<q35.x> arrayList11 = refinancedCreditsList.d;
                        final ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        for (q35.x refinancedCreditDetails : arrayList11) {
                            c55.s sVar = qVar.f;
                            String loanId = refinancedCreditsList.f241848c;
                            String refinancingIdentifier = refinancedCreditsList.f241846a;
                            q35.y refinancingState = refinancedCreditsList.f241847b;
                            Intrinsics.checkNotNullParameter(refinancedCreditDetails, "refinancedCreditDetails");
                            Intrinsics.checkNotNullParameter(loanId, "loanId");
                            Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
                            Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
                            String strG7 = u1.g(refinancingState, sVar.e);
                            String str10 = refinancedCreditDetails.f241841a;
                            dj0.d dVar4 = refinancedCreditDetails.f241842b;
                            arrayList12.add(new y1(refinancingIdentifier, strG7, loanId, str10, u1.g(refinancedCreditDetails.f241843c, sVar.f21458c), dVar4.f115082a, dVar4.f115083b.f306286a, u1.g(refinancedCreditDetails.d, sVar.f21457b), u1.g(refinancedCreditDetails.e, sVar.d), refinancedCreditDetails.f241844g != null, refinancedCreditDetails.f, String.valueOf(refinancedCreditDetails.f241845h), refinancedCreditDetails.i));
                        }
                        final n45.c cVar3 = qVar.e;
                        cVar3.getClass();
                        final int i662 = 0;
                        DBUtil.performBlocking(cVar3.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i662) {
                                    case 0:
                                        cVar3.f.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                    default:
                                        cVar3.d.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                }
                                return null;
                            }
                        });
                        return Unit.f186387a;
                }
            }
        };
        ald.o oVar = new ald.o(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i2, 9);
        int i22 = 2;
        jki.d dVar = new jki.d(i22, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i2, 3);
        l lVar = new l(this, i22);
        final int i32 = 5;
        this.i = new w4l.f(function2, oVar, dVar, lVar, new Function2(this) { // from class: o55.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f222353b;

            {
                this.f222353b = this;
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ArrayList arrayList;
                long j2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String str;
                String str2;
                b2 b2Var;
                int i59 = i32;
                q qVar = this.f222353b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        g it8 = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<i55.t<i55.l>> loans = qVar.f222360b.getLoans();
                        o oVar2 = o.f;
                        o0.a aVar = new o0.a(6);
                        loans.getClass();
                        ufm.i iVar = new ufm.i(loans, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        List loans2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loans2, "loans");
                        final n45.c cVar = qVar.e;
                        Object obj4 = d55.f.f111363a;
                        Intrinsics.checkNotNullParameter(loans2, "<this>");
                        List list = loans2;
                        final ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(d55.f.c((q35.t) it9.next()));
                        }
                        cVar.getClass();
                        final int i66 = 1;
                        DBUtil.performBlocking(cVar.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i66) {
                                    case 0:
                                        cVar.f.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                    default:
                                        cVar.d.insert(sQLiteConnection, (Iterable) arrayList5);
                                        break;
                                }
                                return null;
                            }
                        });
                        qVar.f222361c.b(h.f222343a, Boolean.TRUE);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        d key = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        efm.d0<i55.i> loanDetails = qVar.f222360b.getLoanDetails(key.f222325a);
                        n nVar = n.f;
                        o0.a aVar2 = new o0.a(7);
                        loanDetails.getClass();
                        ufm.i iVar2 = new ufm.i(loanDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        LoanDetails loanDetails2 = (LoanDetails) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(loanDetails2, "loanDetails");
                        n45.c cVar2 = qVar.e;
                        Object obj5 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        w1 w1VarC = d55.f.c(loanDetails2);
                        Intrinsics.checkNotNullParameter(loanDetails2, "<this>");
                        Loan loan = loanDetails2.f70144a;
                        String str3 = loan.f70108a;
                        int i212 = loanDetails2.f70145b;
                        int i222 = loanDetails2.f70146c;
                        long j3 = loanDetails2.d.f115082a;
                        o45.c cVarD = d55.c.d(loanDetails2.e);
                        o45.c cVarD2 = d55.c.d(loanDetails2.f);
                        o45.c cVarD3 = d55.c.d(loanDetails2.f70147g);
                        Loan loan2 = loan;
                        long j5 = loanDetails2.f70148h.f115082a;
                        boolean z = loanDetails2.i;
                        LoanUnavailableFeatures loanUnavailableFeatures = loanDetails2.f70151m;
                        q35.j0 j0Var = loanUnavailableFeatures.f70201a;
                        String strG = j0Var != null ? u1.g(j0Var, d55.c.f111351a) : null;
                        l0 l0Var = loanUnavailableFeatures.f70202b;
                        String strG2 = l0Var != null ? u1.g(l0Var, d55.c.f111352b) : null;
                        m0 m0Var = loanUnavailableFeatures.f70203c;
                        String strG3 = m0Var != null ? u1.g(m0Var, d55.c.f111353c) : null;
                        k0 k0Var = loanUnavailableFeatures.d;
                        String strG4 = k0Var != null ? u1.g(k0Var, d55.c.d) : null;
                        q35.i0 i0Var = loanUnavailableFeatures.e;
                        o45.v vVar = new o45.v(strG, strG2, strG3, strG4, i0Var != null ? u1.g(i0Var, d55.c.e) : null);
                        List list2 = loanDetails2.f70150l;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            LoanBorrower loanBorrower = (LoanBorrower) it10.next();
                            Loan loan3 = loan2;
                            Iterator it11 = it10;
                            xi0.b bVar = loan3.f70123x;
                            String str4 = loanBorrower.f70138a;
                            int i322 = loanBorrower.f70139b;
                            LoanBorrower.PaymentSource paymentSource = loanBorrower.e;
                            String str5 = str3;
                            int i33 = i212;
                            String strG5 = u1.g(paymentSource.f70141a, d55.c.f111354g);
                            String strG6 = u1.g(paymentSource.f70142b, d55.c.f);
                            String str6 = paymentSource.f70143c;
                            String str7 = paymentSource.d;
                            String str8 = bVar.f306286a;
                            LoanRepaymentAccountDetails loanRepaymentAccountDetails = paymentSource.f;
                            if (loanRepaymentAccountDetails != null) {
                                Intrinsics.checkNotNullParameter(loanRepaymentAccountDetails, "<this>");
                                str = str8;
                                str2 = str6;
                                b2Var = new b2(loanRepaymentAccountDetails.f70175a, loanRepaymentAccountDetails.f70176b);
                            } else {
                                str = str8;
                                str2 = str6;
                                b2Var = null;
                            }
                            arrayList6.add(new o45.m(str4, i322, new o45.p(strG5, strG6, str2, str7, str, b2Var), loanBorrower.f70140c, loanBorrower.d));
                            it10 = it11;
                            loan2 = loan3;
                            str3 = str5;
                            i212 = i33;
                        }
                        String str9 = str3;
                        int i43 = i212;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = loanDetails2.f70149j;
                        o45.g gVar = loanAutoPayRepaymentSource != null ? new o45.g(loanAutoPayRepaymentSource.f70126a, u1.g(loanAutoPayRepaymentSource.f70127b, d55.c.f111355h), u1.g(loanAutoPayRepaymentSource.f70128c, d55.c.i), loanAutoPayRepaymentSource.d, loanAutoPayRepaymentSource.e, loanAutoPayRepaymentSource.f) : null;
                        LoanBackupCardPaymentSource loanBackupCardPaymentSource = loanDetails2.k;
                        o45.j jVar = loanBackupCardPaymentSource != null ? new o45.j(loanBackupCardPaymentSource.f70135a, loanBackupCardPaymentSource.f70136b, u1.g(loanBackupCardPaymentSource.f70137c, d55.c.f111356j), loanBackupCardPaymentSource.d) : null;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails2.f70152n;
                        dj0.d dVar2 = loanRepaymentConfig.f70177a;
                        q35.f0 f0Var = loanRepaymentConfig.e;
                        o45.j jVar2 = jVar;
                        Long lValueOf = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                        long j16 = loanRepaymentConfig.f70178b.f115082a;
                        long j22 = loanRepaymentConfig.f70179c.f115082a;
                        List list3 = loanRepaymentConfig.d;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = arrayList6;
                            j2 = j22;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it12 = list4.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(((q35.g0) it12.next()).toString());
                            }
                            arrayList2 = arrayList7;
                        } else {
                            arrayList = arrayList6;
                            j2 = j22;
                            arrayList2 = null;
                        }
                        List list5 = f0Var.f241813a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it13 = list5.iterator();
                        while (it13.hasNext()) {
                            arrayList8.add(((io3.l) it13.next()).name());
                        }
                        Boolean boolValueOf = Boolean.valueOf(f0Var.f241814b);
                        Boolean boolValueOf2 = Boolean.valueOf(f0Var.d);
                        dj0.d dVar22 = loanRepaymentConfig.f;
                        Long lValueOf2 = dVar22 != null ? Long.valueOf(dVar22.f115082a) : null;
                        dj0.d dVar3 = loanRepaymentConfig.f70180g;
                        Long lValueOf3 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                        List list6 = loanRepaymentConfig.f70181h;
                        if (list6 != null) {
                            List list7 = list6;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list7, 10));
                            Iterator it14 = list7.iterator();
                            while (it14.hasNext()) {
                                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it14.next();
                                arrayList9.add(new o45.y(repaymentSuggestion.f70204a, repaymentSuggestion.f70205b.f115082a));
                                it14 = it14;
                                i222 = i222;
                                jVar2 = jVar2;
                            }
                            arrayList3 = arrayList9;
                        } else {
                            arrayList3 = null;
                        }
                        o45.j jVar3 = jVar2;
                        int i592 = i222;
                        List list8 = loanRepaymentConfig.i;
                        if (list8 != null) {
                            List<ExcludedAmountRange> list9 = list8;
                            ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                            for (ExcludedAmountRange excludedAmountRange : list9) {
                                arrayList10.add(new o45.f(excludedAmountRange.f70105a.f115082a, excludedAmountRange.f70106b.f115082a, excludedAmountRange.f70107c));
                            }
                            arrayList4 = arrayList10;
                        } else {
                            arrayList4 = null;
                        }
                        DBUtil.performBlocking(cVar2.f212295a, false, true, new n09.j0(cVar2, new q45.a(w1VarC, new o45.z(str9, i43, i592, j3, cVarD, cVarD2, cVarD3, j5, z, vVar, arrayList, gVar, jVar3, new o45.s(lValueOf, j16, j2, arrayList2, arrayList8, boolValueOf, boolValueOf2, lValueOf2, lValueOf3, arrayList3, arrayList4), loanDetails2.o)), 26));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        r key2 = (r) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        efm.d0<i55.x> refinancedCreditsV2 = qVar.f222360b.getRefinancedCreditsV2(key2.f222365a);
                        o4a.e eVar = new o4a.e(8, new nzj.n(1, qVar.f, c55.s.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanRefinancedCreditListDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRefinancedCreditList;", 0, 11));
                        refinancedCreditsV2.getClass();
                        ufm.i iVar3 = new ufm.i(refinancedCreditsV2, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        q35.z refinancedCreditsList = (q35.z) obj3;
                        Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
                        ArrayList<q35.x> arrayList11 = refinancedCreditsList.d;
                        final ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        for (q35.x refinancedCreditDetails : arrayList11) {
                            c55.s sVar = qVar.f;
                            String loanId = refinancedCreditsList.f241848c;
                            String refinancingIdentifier = refinancedCreditsList.f241846a;
                            q35.y refinancingState = refinancedCreditsList.f241847b;
                            Intrinsics.checkNotNullParameter(refinancedCreditDetails, "refinancedCreditDetails");
                            Intrinsics.checkNotNullParameter(loanId, "loanId");
                            Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
                            Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
                            String strG7 = u1.g(refinancingState, sVar.e);
                            String str10 = refinancedCreditDetails.f241841a;
                            dj0.d dVar4 = refinancedCreditDetails.f241842b;
                            arrayList12.add(new y1(refinancingIdentifier, strG7, loanId, str10, u1.g(refinancedCreditDetails.f241843c, sVar.f21458c), dVar4.f115082a, dVar4.f115083b.f306286a, u1.g(refinancedCreditDetails.d, sVar.f21457b), u1.g(refinancedCreditDetails.e, sVar.d), refinancedCreditDetails.f241844g != null, refinancedCreditDetails.f, String.valueOf(refinancedCreditDetails.f241845h), refinancedCreditDetails.i));
                        }
                        final n45.c cVar3 = qVar.e;
                        cVar3.getClass();
                        final int i662 = 0;
                        DBUtil.performBlocking(cVar3.f212295a, false, true, new Function1() { // from class: n45.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj52;
                                switch (i662) {
                                    case 0:
                                        cVar3.f.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                    default:
                                        cVar3.d.insert(sQLiteConnection, (Iterable) arrayList12);
                                        break;
                                }
                                return null;
                            }
                        });
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        int i33 = 0;
        this.f222364j = new com.google.firebase.messaging.t(new l(this, 3), new ald.o(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i33, 8), new jki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i33, 2));
    }

    public final akg.n a() {
        return nim.a.v(nim.a.v(nim.a.v(rd0.e.b(this.f222364j.l(i.f222346a)), new o5.b(13)), new o5.b(14)), new o5.b(12));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f222359a, qVar.f222359a) && Intrinsics.f(this.f222360b, qVar.f222360b) && Intrinsics.f(this.f222361c, qVar.f222361c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f222361c.hashCode() + ((this.f222360b.hashCode() + (this.f222359a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
