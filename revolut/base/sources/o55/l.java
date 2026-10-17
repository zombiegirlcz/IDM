package o55;

import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.credit.loan.api.models.rev10.ExcludedAmountRange;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAutoPayRepaymentSource;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCardPaymentSource;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentConfig;
import com.revolut.feature.credit.loan.api.models.rev10.LoanUnavailableFeatures;
import com.revolut.feature.credit.loan.api.models.rev10.RepaymentSuggestion;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import n33.v0;
import o45.b2;
import o45.w1;
import o45.y1;
import q35.k0;
import q35.l0;
import q35.m0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f222355b;

    public /* synthetic */ l(q qVar, int i) {
        this.f222354a = i;
        this.f222355b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        ?? arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LoanBackupCardPaymentSource loanBackupCardPaymentSource;
        Iterator it8;
        LoanRepaymentAccountDetails loanRepaymentAccountDetails;
        Iterator it9;
        io3.l lVar;
        int i;
        q35.g0 g0Var;
        String str;
        int i2 = this.f222354a;
        q qVar = this.f222355b;
        switch (i2) {
            case 0:
                g it10 = (g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                n45.c cVar = qVar.e;
                List list = (List) DBUtil.performBlocking(cVar.f212295a, true, false, new n1.y(cVar, 15));
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(d55.f.a((w1) it11.next()));
                }
                if (arrayList5.isEmpty()) {
                    xx4.e eVar = qVar.f222361c;
                    Boolean bool = Boolean.FALSE;
                    h key = h.f222343a;
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(bool, "default");
                    ue0.c cVar2 = eVar.f309397a;
                    Type type = key.e().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (!((Boolean) cVar2.v0(bool, "LoanListRequestedKey", type)).booleanValue()) {
                        return null;
                    }
                }
                return arrayList5;
            case 1:
                d key2 = (d) obj2;
                Intrinsics.checkNotNullParameter(key2, "key");
                n45.c cVar3 = qVar.e;
                q45.a aVar = (q45.a) DBUtil.performBlocking(cVar3.f212295a, true, true, new n09.j0(cVar3, key2.f222325a, 28));
                if (aVar != null) {
                    Object obj3 = d55.c.f111351a;
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    o45.z zVar = aVar.f242065b;
                    w1 w1Var = aVar.f242064a;
                    if (zVar != null) {
                        xi0.a aVar2 = xi0.b.Companion;
                        String str2 = w1Var.e;
                        aVar2.getClass();
                        xi0.b bVarA = xi0.a.a(str2);
                        Loan loanA = d55.f.a(w1Var);
                        int i3 = zVar.f222153b;
                        int i5 = zVar.f222154c;
                        dj0.d dVar = new dj0.d(zVar.d, bVarA);
                        LoanAccrual loanAccrualB = d55.c.b(zVar.e, bVarA);
                        LoanAccrual loanAccrualB2 = d55.c.b(zVar.f, bVarA);
                        LoanAccrual loanAccrualB3 = d55.c.b(zVar.f222155g, bVarA);
                        dj0.d dVar2 = new dj0.d(zVar.f222156h, bVarA);
                        boolean z = zVar.i;
                        o45.v vVar = zVar.f222157j;
                        String str3 = vVar.f222110a;
                        q35.j0 j0Var = str3 != null ? (q35.j0) u1.u(str3, d55.c.f111351a) : null;
                        String str4 = vVar.f222111b;
                        l0 l0Var = str4 != null ? (l0) u1.u(str4, d55.c.f111352b) : null;
                        String str5 = vVar.f222112c;
                        m0 m0Var = str5 != null ? (m0) u1.u(str5, d55.c.f111353c) : null;
                        String str6 = vVar.d;
                        k0 k0Var = str6 != null ? (k0) u1.u(str6, d55.c.d) : null;
                        String str7 = vVar.e;
                        LoanUnavailableFeatures loanUnavailableFeatures = new LoanUnavailableFeatures(j0Var, l0Var, m0Var, k0Var, str7 != null ? (q35.i0) u1.u(str7, d55.c.e) : null);
                        o45.s sVar = zVar.f222160n;
                        Long l2 = sVar.f222098a;
                        dj0.d dVar3 = l2 != null ? new dj0.d(l2.longValue(), bVarA) : null;
                        dj0.d dVar4 = new dj0.d(sVar.f222099b, bVarA);
                        dj0.d dVar5 = new dj0.d(sVar.f222100c, bVarA);
                        List<String> list2 = sVar.d;
                        if (list2 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (String str8 : list2) {
                                q35.g0[] g0VarArrValues = q35.g0.values();
                                int length = g0VarArrValues.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length) {
                                        q35.g0 g0Var2 = g0VarArrValues[i6];
                                        int i21 = i6;
                                        i = i3;
                                        if (kotlin.text.a0.z(g0Var2.name(), str8, true)) {
                                            g0Var = g0Var2;
                                        } else {
                                            i6 = i21 + 1;
                                            i3 = i;
                                        }
                                    } else {
                                        i = i3;
                                        g0Var = null;
                                    }
                                }
                                if (g0Var != null) {
                                    arrayList6.add(g0Var);
                                }
                                i3 = i;
                            }
                            arrayList = arrayList6;
                        } else {
                            arrayList = null;
                        }
                        int i22 = i3;
                        List list3 = sVar.e;
                        if (list3 != null) {
                            arrayList2 = new ArrayList();
                            Iterator it12 = list3.iterator();
                            while (it12.hasNext()) {
                                String str9 = (String) it12.next();
                                io3.l[] lVarArrValues = io3.l.values();
                                int length2 = lVarArrValues.length;
                                int i32 = 0;
                                while (true) {
                                    if (i32 < length2) {
                                        lVar = lVarArrValues[i32];
                                        it9 = it12;
                                        io3.l[] lVarArr = lVarArrValues;
                                        if (!kotlin.text.a0.z(lVar.name(), str9, true)) {
                                            i32++;
                                            it12 = it9;
                                            lVarArrValues = lVarArr;
                                        }
                                    } else {
                                        it9 = it12;
                                        lVar = null;
                                    }
                                }
                                if (lVar != null) {
                                    arrayList2.add(lVar);
                                }
                                it12 = it9;
                            }
                        } else {
                            arrayList2 = zhm.f0.f322471a;
                        }
                        q35.f0 f0Var = new q35.f0(bVarA.f306286a, arrayList2, pd.b.j(sVar.f), pd.b.j(sVar.f222101g));
                        Long l3 = sVar.f222102h;
                        dj0.d dVar6 = l3 != null ? new dj0.d(l3.longValue(), bVarA) : null;
                        Long l4 = sVar.i;
                        dj0.d dVar7 = l4 != null ? new dj0.d(l4.longValue(), bVarA) : null;
                        List list4 = sVar.f222103j;
                        if (list4 != null) {
                            List<o45.y> list5 = list4;
                            ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                            for (o45.y yVar : list5) {
                                arrayList7.add(new RepaymentSuggestion(new dj0.d(yVar.f222140b, bVarA), yVar.f222139a));
                                dVar4 = dVar4;
                                f0Var = f0Var;
                            }
                            arrayList3 = arrayList7;
                        } else {
                            arrayList3 = null;
                        }
                        dj0.d dVar8 = dVar4;
                        q35.f0 f0Var2 = f0Var;
                        List list6 = sVar.k;
                        if (list6 != null) {
                            List<o45.f> list7 = list6;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list7, 10));
                            for (o45.f fVar : list7) {
                                arrayList8.add(new ExcludedAmountRange(new dj0.d(fVar.f222045a, bVarA), new dj0.d(fVar.f222046b, bVarA), fVar.f222047c));
                                dVar = dVar;
                            }
                            arrayList4 = arrayList8;
                        } else {
                            arrayList4 = null;
                        }
                        dj0.d dVar9 = dVar;
                        LoanRepaymentConfig loanRepaymentConfig = new LoanRepaymentConfig(dVar3, dVar8, dVar5, arrayList, f0Var2, dVar6, dVar7, arrayList3, arrayList4);
                        o45.g gVar = zVar.f222158l;
                        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = gVar != null ? new LoanAutoPayRepaymentSource(gVar.getId(), (q35.a) u1.u(gVar.getState(), d55.c.f111355h), (q35.b) u1.u(gVar.getType(), d55.c.i), gVar.getExternalId(), gVar.getBankIdentifier(), gVar.getAccountNumber()) : null;
                        o45.j jVar = zVar.f222159m;
                        if (jVar != null) {
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            loanBackupCardPaymentSource = new LoanBackupCardPaymentSource(jVar.f222066a, jVar.f222067b, (q35.c) u1.u(jVar.f222068c, d55.c.f111356j), jVar.d);
                        } else {
                            loanBackupCardPaymentSource = null;
                        }
                        List list8 = zVar.k;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list8, 10));
                        Iterator it13 = list8.iterator();
                        while (it13.hasNext()) {
                            o45.m mVar = (o45.m) it13.next();
                            String str10 = mVar.f222077a;
                            int i33 = mVar.f222078b;
                            o45.p pVar = mVar.f222079c;
                            com.revolut.feature.credit.loan.api.models.rev10.c cVar4 = (com.revolut.feature.credit.loan.api.models.rev10.c) u1.u(pVar.f222088a, d55.c.f111354g);
                            com.revolut.feature.credit.loan.api.models.rev10.b bVar = (com.revolut.feature.credit.loan.api.models.rev10.b) u1.u(pVar.f222089b, d55.c.f);
                            String str11 = pVar.f222090c;
                            String str12 = pVar.d;
                            b2 b2Var = pVar.f;
                            if (b2Var != null) {
                                Intrinsics.checkNotNullParameter(b2Var, "<this>");
                                it8 = it13;
                                loanRepaymentAccountDetails = new LoanRepaymentAccountDetails(b2Var.f222016a, b2Var.f222017b);
                            } else {
                                it8 = it13;
                                loanRepaymentAccountDetails = null;
                            }
                            dj0.d dVar10 = dVar2;
                            boolean z3 = z;
                            arrayList9.add(new LoanBorrower(str10, i33, mVar.d, mVar.e, new LoanBorrower.PaymentSource(cVar4, bVar, str11, str12, bVarA, loanRepaymentAccountDetails)));
                            dVar2 = dVar10;
                            it13 = it8;
                            z = z3;
                        }
                        return new LoanDetails(loanA, i22, i5, dVar9, loanAccrualB, loanAccrualB2, loanAccrualB3, dVar2, z, loanAutoPayRepaymentSource, loanBackupCardPaymentSource, arrayList9, loanUnavailableFeatures, loanRepaymentConfig, zVar.o);
                    }
                }
                return null;
            case 2:
                r key3 = (r) obj2;
                Intrinsics.checkNotNullParameter(key3, "key");
                List entities = (List) DBUtil.performBlocking(qVar.e.f212295a, true, false, new mll.h(key3.f222365a, 12));
                if (entities.isEmpty()) {
                    entities = null;
                }
                if (entities == null) {
                    return null;
                }
                c55.s sVar2 = qVar.f;
                Intrinsics.checkNotNullParameter(entities, "entities");
                y1 y1Var = (y1) zhm.d0.b0(entities);
                String str13 = y1Var.f222146c;
                String str14 = y1Var.f222144a;
                q35.y yVar2 = (q35.y) u1.u(y1Var.f222145b, sVar2.e);
                List<y1> list9 = entities;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(list9, 10));
                for (y1 y1Var2 : list9) {
                    if (y1Var2.f222149j) {
                        String str15 = sVar2.f21456a.getBaseUrl() + "/refinancing-management/v1/refinancing-components/" + y1Var2.d + "/receipt";
                        zi0.c.l(str15);
                        str = str15;
                    } else {
                        str = null;
                    }
                    String str16 = y1Var2.d;
                    long j2 = y1Var2.f;
                    xi0.a aVar3 = xi0.b.Companion;
                    String str17 = y1Var2.f222147g;
                    aVar3.getClass();
                    dj0.d dVar11 = new dj0.d(j2, xi0.a.a(str17));
                    q35.u uVar = (q35.u) u1.u(y1Var2.e, sVar2.f21458c);
                    q35.w wVar = (q35.w) u1.u(y1Var2.f222148h, sVar2.f21457b);
                    q35.v vVar2 = (q35.v) u1.u(y1Var2.i, sVar2.d);
                    String str18 = y1Var2.k;
                    String str19 = y1Var2.f222150l;
                    arrayList10.add(new q35.x(str16, dVar11, uVar, wVar, vVar2, str18, str, str19 != null ? ZonedDateTime.parse(str19) : null, y1Var2.f222151m));
                }
                return new q35.z(str14, yVar2, str13, arrayList10);
            case 3:
                i it14 = (i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return RxRoom.createObservable(qVar.e.f212295a, false, new String[]{"loan_preferences"}, new v0(20));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list10 = (List) pair.f186385a;
                List list11 = (List) pair.f186386b;
                ArrayList arrayList11 = new ArrayList();
                for (Object obj4 : list11) {
                    if (!list10.contains(((Loan) obj4).f70108a)) {
                        arrayList11.add(obj4);
                    }
                }
                qVar.getClass();
                return zhm.d0.P0(arrayList11, new k2j.d(new k2j.d(new p(), 24), 25));
        }
    }
}
