package dp4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardFeatureConfig;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentDocument;
import com.revolut.feature.credit.card.api.models.limit_history.CreditCardLimitHistoryItem;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$Action;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$DueDateOption;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$AccruedInterest;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$Charge;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$ChargesBreakdown;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$OutstandingBalance;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$RevolverTransaction;
import fo4.a;
import in4.a;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import on4.c;
import on4.h;
import ro4.c;
import so4.a;
import so4.b;
import so4.c;
import vo4.a;
import xo4.l;
import yn4.e0;
import yn4.f0;
import yn4.g0;
import yn4.z;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f116668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f116669x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116669x = obj2;
    }

    private final Object b(Object obj2) {
        double d;
        rn4.d dVar;
        ArrayList arrayList;
        String str = (String) this.v;
        ll4.r rVar = (ll4.r) this.f116668w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xx4.e eVar = ((c1) this.f116669x).e;
        cp4.j0 j0Var = new cp4.j0(str);
        Object obj3 = pn4.a.f237663a;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        double d5 = rVar.f196530a;
        double d6 = rVar.f196531b;
        Double d10 = rVar.f196532c;
        ll4.a0 a0Var = rVar.d;
        if (a0Var != null) {
            d = d5;
            dVar = new rn4.d(a0Var.f196502a, a0Var.f196503b, a0Var.f196504c, a0Var.d);
        } else {
            d = d5;
            dVar = null;
        }
        ll4.q qVar = rVar.e;
        c.a aVar2 = new c.a(qVar.f196527a, qVar.f196528b, qVar.f196529c, qVar.d);
        List list = rVar.f;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(jo4.a.b((CreditCardCellModel) it8.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        eVar.b(j0Var, new on4.c(d, d6, d10, dVar, aVar2, arrayList));
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        c.b bVar;
        cp4.l0 l0Var = (cp4.l0) this.v;
        List list = (List) this.f116668w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xx4.e eVar = ((c1) this.f116669x).e;
        List<ul4.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ul4.a aVar2 : list2) {
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            if (aVar2 == null) {
                throw new NoWhenBranchMatchedException();
            }
            int i = aVar2.f280883a;
            ArrayList<CreditCardSettings$RepaymentPreferenceSettings$DueDateOption> arrayList2 = aVar2.f280884b;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            for (CreditCardSettings$RepaymentPreferenceSettings$DueDateOption creditCardSettings$RepaymentPreferenceSettings$DueDateOption : arrayList2) {
                arrayList3.add(new c.a(creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68861a, creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68862b, creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68863c));
            }
            CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason = aVar2.f280885c;
            if (creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason != null) {
                String str = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68864a;
                String str2 = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68865b;
                CreditCardSettings$Action creditCardSettings$Action = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.f68866c;
                bVar = new c.b(str, str2, new ro4.b(creditCardSettings$Action.f68859a, creditCardSettings$Action.f68860b));
            } else {
                bVar = null;
            }
            arrayList.add(new ro4.c(i, arrayList3, bVar, aVar2.d));
        }
        eVar.b(l0Var, arrayList);
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        cp4.m0 m0Var = (cp4.m0) this.v;
        ll4.d0 d0Var = (ll4.d0) this.f116668w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xx4.e eVar = ((c1) this.f116669x).e;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        long j2 = d0Var.f196511a;
        long j3 = d0Var.f196512b;
        long j5 = d0Var.f196513c;
        long j16 = d0Var.d;
        ll4.z zVar = d0Var.e;
        eVar.b(m0Var, new xo4.y(j2, j3, j5, j16, new xo4.v(zVar.f196565a, zVar.f196566b, zVar.f196567c, zVar.d, zVar.e)));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        cp4.p0 p0Var = (cp4.p0) this.v;
        List list = (List) this.f116668w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xx4.e eVar = ((c1) this.f116669x).e;
        List<ll4.c0> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ll4.c0 c0Var : list2) {
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            arrayList.add(new xo4.z(c0Var.f196508a, c0Var.f196509b, c0Var.f196510c, c0Var.d, c0Var.e));
        }
        eVar.b(p0Var, arrayList);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                n nVar = new n((q) this.f116669x, (Continuation) obj4, 0);
                nVar.v = (cp4.l) obj2;
                nVar.f116668w = (ql4.a) obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n((r) this.f116669x, (Continuation) obj4, 1);
                nVar2.v = (cp4.n) obj2;
                nVar2.f116668w = (List) obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n((s) this.f116669x, (Continuation) obj4, 2);
                nVar3.v = (cp4.r) obj2;
                nVar3.f116668w = (nl4.e) obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n((t) this.f116669x, (Continuation) obj4, 3);
                nVar4.v = (cp4.t) obj2;
                nVar4.f116668w = (ol4.a) obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n((w) this.f116669x, (Continuation) obj4, 4);
                nVar5.v = (cp4.y) obj2;
                nVar5.f116668w = (vm4.b) obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n((c0) this.f116669x, (Continuation) obj4, 5);
                nVar6.v = (cp4.z) obj2;
                nVar6.f116668w = (ql4.e) obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 6:
                n nVar7 = new n((c0) this.f116669x, (Continuation) obj4, 6);
                nVar7.v = (cp4.a0) obj2;
                nVar7.f116668w = (List) obj3;
                return nVar7.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar8 = new n((c0) this.f116669x, (Continuation) obj4, 7);
                nVar8.v = (cp4.f0) obj2;
                nVar8.f116668w = (ql4.q) obj3;
                return nVar8.invokeSuspend(Unit.f186387a);
            case 8:
                n nVar9 = new n((c0) this.f116669x, (Continuation) obj4, 8);
                nVar9.v = (cp4.g0) obj2;
                nVar9.f116668w = (ql4.y) obj3;
                return nVar9.invokeSuspend(Unit.f186387a);
            case 9:
                n nVar10 = new n((c0) this.f116669x, (Continuation) obj4, 9);
                nVar10.v = (cp4.n0) obj2;
                nVar10.f116668w = (ql4.a0) obj3;
                return nVar10.invokeSuspend(Unit.f186387a);
            case 10:
                n nVar11 = new n((c0) this.f116669x, (Continuation) obj4, 10);
                nVar11.v = (cp4.o0) obj2;
                nVar11.f116668w = (ql4.d0) obj3;
                return nVar11.invokeSuspend(Unit.f186387a);
            case 11:
                n nVar12 = new n((k0) this.f116669x, (Continuation) obj4, 11);
                nVar12.v = (cp4.c0) obj2;
                nVar12.f116668w = (List) obj3;
                return nVar12.invokeSuspend(Unit.f186387a);
            case 12:
                n nVar13 = new n((k0) this.f116669x, (Continuation) obj4, 12);
                nVar13.v = (cp4.d0) obj2;
                nVar13.f116668w = (List) obj3;
                return nVar13.invokeSuspend(Unit.f186387a);
            case 13:
                n nVar14 = new n((c1) this.f116669x, (Continuation) obj4, 13);
                nVar14.v = (String) obj2;
                nVar14.f116668w = (il4.g) obj3;
                return nVar14.invokeSuspend(Unit.f186387a);
            case 14:
                n nVar15 = new n((c1) this.f116669x, (Continuation) obj4, 14);
                nVar15.v = (String) obj2;
                nVar15.f116668w = (List) obj3;
                return nVar15.invokeSuspend(Unit.f186387a);
            case 15:
                n nVar16 = new n((c1) this.f116669x, (Continuation) obj4, 15);
                nVar16.v = (cp4.h0) obj2;
                nVar16.f116668w = (ll4.o) obj3;
                return nVar16.invokeSuspend(Unit.f186387a);
            case 16:
                n nVar17 = new n((c1) this.f116669x, (Continuation) obj4, 16);
                nVar17.v = (cp4.p) obj2;
                nVar17.f116668w = (CreditCardFeatureConfig) obj3;
                return nVar17.invokeSuspend(Unit.f186387a);
            case 17:
                n nVar18 = new n((c1) this.f116669x, (Continuation) obj4, 17);
                nVar18.v = (cp4.q) obj2;
                nVar18.f116668w = (List) obj3;
                return nVar18.invokeSuspend(Unit.f186387a);
            case 18:
                n nVar19 = new n((c1) this.f116669x, (Continuation) obj4, 18);
                nVar19.v = (cp4.j) obj2;
                nVar19.f116668w = (List) obj3;
                return nVar19.invokeSuspend(Unit.f186387a);
            case 19:
                n nVar20 = new n((c1) this.f116669x, (Continuation) obj4, 19);
                nVar20.v = (cp4.m) obj2;
                nVar20.f116668w = (List) obj3;
                return nVar20.invokeSuspend(Unit.f186387a);
            case 20:
                n nVar21 = new n((c1) this.f116669x, (Continuation) obj4, 20);
                nVar21.v = (cp4.k) obj2;
                nVar21.f116668w = (kl4.b) obj3;
                return nVar21.invokeSuspend(Unit.f186387a);
            case 21:
                n nVar22 = new n((c1) this.f116669x, (Continuation) obj4, 21);
                nVar22.v = (cp4.u) obj2;
                nVar22.f116668w = (vl4.g) obj3;
                return nVar22.invokeSuspend(Unit.f186387a);
            case 22:
                n nVar23 = new n((c1) this.f116669x, (Continuation) obj4, 22);
                nVar23.v = (cp4.v) obj2;
                nVar23.f116668w = (List) obj3;
                return nVar23.invokeSuspend(Unit.f186387a);
            case 23:
                n nVar24 = new n((c1) this.f116669x, (Continuation) obj4, 23);
                nVar24.v = (cp4.w) obj2;
                nVar24.f116668w = (vl4.u) obj3;
                return nVar24.invokeSuspend(Unit.f186387a);
            case 24:
                n nVar25 = new n((c1) this.f116669x, (Continuation) obj4, 24);
                nVar25.v = (cp4.e0) obj2;
                nVar25.f116668w = (ll4.y) obj3;
                return nVar25.invokeSuspend(Unit.f186387a);
            case 25:
                n nVar26 = new n((c1) this.f116669x, (Continuation) obj4, 25);
                nVar26.v = (String) obj2;
                nVar26.f116668w = (ll4.r) obj3;
                return nVar26.invokeSuspend(Unit.f186387a);
            case 26:
                n nVar27 = new n((c1) this.f116669x, (Continuation) obj4, 26);
                nVar27.v = (cp4.l0) obj2;
                nVar27.f116668w = (List) obj3;
                return nVar27.invokeSuspend(Unit.f186387a);
            case 27:
                n nVar28 = new n((c1) this.f116669x, (Continuation) obj4, 27);
                nVar28.v = (cp4.m0) obj2;
                nVar28.f116668w = (ll4.d0) obj3;
                return nVar28.invokeSuspend(Unit.f186387a);
            case 28:
                n nVar29 = new n((c1) this.f116669x, (Continuation) obj4, 28);
                nVar29.v = (cp4.p0) obj2;
                nVar29.f116668w = (List) obj3;
                return nVar29.invokeSuspend(Unit.f186387a);
            default:
                n nVar30 = new n((c1) this.f116669x, (Continuation) obj4, 29);
                nVar30.v = (cp4.q0) obj2;
                nVar30.f116668w = (wl4.b) obj3;
                return nVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vn4.b bVar;
        List list;
        z.a aVar;
        a.C0931a c0931a;
        a.c cVar;
        l.a aVar2;
        Object iVar;
        a.f fVar;
        String str;
        a.h hVar;
        ArrayList arrayList;
        boolean z;
        a.c cVar2;
        c.a aVar3;
        c.b bVar2;
        c.b.C1482c c1482c;
        c.b.a aVar4;
        c.a.b bVar3;
        boolean z3;
        long j2;
        h.a aVar5;
        h.b bVar4;
        int i = this.u;
        Object obj3 = this.f116669x;
        switch (i) {
            case 0:
                cp4.l lVar = (cp4.l) this.v;
                ql4.a aVar6 = (ql4.a) this.f116668w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar = ((q) obj3).f116682c;
                Intrinsics.checkNotNullParameter(aVar6, "<this>");
                jo3.a aVarP = mo3.a.p(aVar6.f247081a);
                jo3.a aVarP2 = mo3.a.p(aVar6.f247082b);
                List list2 = aVar6.f247083c;
                List list3 = aVar6.d;
                String strName = aVar6.e.name();
                String strName2 = aVar6.f.name();
                ql4.n0 n0Var = aVar6.f247084g;
                yn4.l lVarR = n0Var != null ? zn4.c.r(n0Var) : null;
                List list4 = aVar6.f247085h;
                ArrayList arrayList2 = aVar6.i;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(zn4.c.q((CreditCardInstalmentDocument) it8.next()));
                }
                eVar.b(lVar, new yn4.b(aVarP, aVarP2, list2, list3, strName, strName2, lVarR, list4, arrayList3));
                return Unit.f186387a;
            case 1:
                cp4.n nVar = (cp4.n) this.v;
                List list5 = (List) this.f116668w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar2 = ((r) obj3).f116686c;
                List<ll4.f> list6 = list5;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                for (ll4.f fVar2 : list6) {
                    Intrinsics.checkNotNullParameter(fVar2, "<this>");
                    String str2 = fVar2.f196516a;
                    String str3 = fVar2.f196517b;
                    String strName3 = fVar2.f196518c.name();
                    String str4 = fVar2.e;
                    String str5 = fVar2.d;
                    String strI = ft3.g1.i(fVar2.f196520h);
                    gt3.f fVar3 = fVar2.i;
                    arrayList4.add(new xo4.k(str2, str3, strName3, str5, str4, strI, fVar3 != null ? hb9.b.G(fVar3) : null, fVar2.f196521j));
                }
                eVar2.b(nVar, arrayList4);
                return Unit.f186387a;
            case 2:
                cp4.r rVar = (cp4.r) this.v;
                nl4.e eVar3 = (nl4.e) this.f116668w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar4 = ((s) obj3).f116691c;
                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                eVar4.b(rVar, new un4.a(eVar3.f216994a, mo3.a.p(eVar3.d), mo3.a.p(eVar3.f216996c), eVar3.f216995b, eVar3.e));
                return Unit.f186387a;
            case 3:
                cp4.t tVar = (cp4.t) this.v;
                ol4.a aVar10 = (ol4.a) this.f116668w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar5 = ((t) obj3).f116696c;
                Intrinsics.checkNotNullParameter(aVar10, "<this>");
                String str6 = aVar10.f226326a;
                String str7 = aVar10.f226327b;
                ol4.b bVar5 = aVar10.f226328c;
                if (bVar5 != null) {
                    String str8 = bVar5.f226329a;
                    dx4.a1 a1Var = bVar5.f226330b;
                    String strB = a1Var != null ? a1Var.b() : null;
                    dx4.l lVar2 = bVar5.f226331c;
                    bVar = new vn4.b(str8, strB, lVar2 != null ? nx4.t.a(lVar2) : null);
                } else {
                    bVar = null;
                }
                eVar5.b(tVar, new vn4.a(str6, str7, bVar));
                return Unit.f186387a;
            case 4:
                cp4.y yVar = (cp4.y) this.v;
                vm4.b bVar6 = (vm4.b) this.f116668w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) obj3;
                xx4.e eVar6 = wVar.f116707c;
                ox4.c mapper = wVar.d;
                Intrinsics.checkNotNullParameter(bVar6, "<this>");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                List<dx4.e1> list7 = bVar6.f290531a;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list7, 10));
                for (dx4.e1 item : list7) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    arrayList5.add(mapper.b(item));
                }
                eVar6.b(yVar, new xn4.c(arrayList5));
                return Unit.f186387a;
            case 5:
                cp4.z zVar = (cp4.z) this.v;
                ql4.e eVar7 = (ql4.e) this.f116668w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar8 = ((c0) obj3).d;
                Intrinsics.checkNotNullParameter(eVar7, "<this>");
                jo3.a aVarP3 = mo3.a.p(eVar7.f247115a);
                jo3.a aVarP4 = mo3.a.p(eVar7.f247116b);
                List list8 = eVar7.f247117c;
                String strName4 = eVar7.d.name();
                String strName5 = eVar7.e.name();
                ql4.n0 n0Var2 = eVar7.f;
                yn4.l lVarR2 = n0Var2 != null ? zn4.c.r(n0Var2) : null;
                List list9 = eVar7.f247118g;
                ArrayList arrayList6 = eVar7.f247119h;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    arrayList7.add(zn4.c.q((CreditCardInstalmentDocument) it9.next()));
                }
                eVar8.b(zVar, new yn4.s(aVarP3, aVarP4, list8, strName4, strName5, lVarR2, list9, arrayList7));
                return Unit.f186387a;
            case 6:
                cp4.a0 a0Var = (cp4.a0) this.v;
                List list10 = (List) this.f116668w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar9 = ((c0) obj3).d;
                List<ql4.k> list11 = list10;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list11, 10));
                for (ql4.k kVar : list11) {
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    String str9 = kVar.f247137a;
                    String str10 = kVar.f247138b;
                    long epochMilli = kVar.f247139c.toEpochMilli();
                    String strName6 = kVar.d.name();
                    int i2 = kVar.e;
                    int i3 = kVar.f;
                    jo3.a aVarP5 = mo3.a.p(kVar.f247140g);
                    jo3.a aVarP6 = mo3.a.p(kVar.f247141h);
                    dj0.d dVar = kVar.i;
                    jo3.a aVarP7 = dVar != null ? mo3.a.p(dVar) : null;
                    LocalDate localDate = kVar.f247142j;
                    List list12 = kVar.k;
                    ql4.l lVar3 = kVar.f247143l;
                    z.a aVar15 = lVar3 != null ? new z.a(lVar3.f247146a.name(), lVar3.f247147b) : null;
                    ql4.p0 p0Var = ql4.q0.Companion;
                    String strName7 = kVar.f247144m.name();
                    p0Var.getClass();
                    arrayList8.add(new xo4.u(str9, str10, epochMilli, strName6, i2, i3, aVarP5, aVarP6, aVarP7, localDate, list12, aVar15, ql4.p0.a(strName7)));
                }
                eVar9.b(a0Var, arrayList8);
                return Unit.f186387a;
            case 7:
                cp4.f0 f0Var = (cp4.f0) this.v;
                ql4.q qVar = (ql4.q) this.f116668w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar10 = ((c0) obj3).d;
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                String str11 = qVar.f247159a;
                long epochMilli2 = qVar.f247160b.toEpochMilli();
                List list13 = qVar.f247161c;
                int i5 = qVar.d;
                int i6 = qVar.e;
                jo3.a aVarP8 = mo3.a.p(qVar.f);
                dj0.d dVar2 = qVar.f247162g;
                jo3.a aVarP9 = dVar2 != null ? mo3.a.p(dVar2) : null;
                LocalDate localDate2 = qVar.f247163h;
                jo3.a aVarP10 = mo3.a.p(qVar.i);
                jo3.a aVarP11 = mo3.a.p(qVar.f247164j);
                jo3.a aVarP12 = mo3.a.p(qVar.k);
                dj0.d dVar3 = qVar.f247165l;
                jo3.a aVarP13 = dVar3 != null ? mo3.a.p(dVar3) : null;
                dj0.d dVar4 = qVar.f247166m;
                jo3.a aVarP14 = dVar4 != null ? mo3.a.p(dVar4) : null;
                LocalDate localDate3 = qVar.f247167n;
                LocalDate localDate4 = qVar.o;
                LocalDate localDate5 = qVar.f247168p;
                LocalDate localDate6 = qVar.f247169q;
                dj0.d dVar5 = qVar.f247170r;
                jo3.a aVarP15 = dVar5 != null ? mo3.a.p(dVar5) : null;
                String str12 = qVar.f247171s;
                String str13 = qVar.f247172t;
                String strName8 = qVar.u.name();
                ql4.l lVar4 = qVar.v;
                if (lVar4 != null) {
                    list = list13;
                    aVar = new z.a(lVar4.f247146a.name(), lVar4.f247147b);
                } else {
                    list = list13;
                    aVar = null;
                }
                dj0.d dVar6 = qVar.f247173w;
                jo3.a aVarP16 = dVar6 != null ? mo3.a.p(dVar6) : null;
                jo3.a aVarP17 = mo3.a.p(qVar.f247174x);
                dj0.d dVar7 = qVar.f247175y;
                jo3.a aVarP18 = dVar7 != null ? mo3.a.p(dVar7) : null;
                dj0.d dVar8 = qVar.z;
                jo3.a aVarP19 = dVar8 != null ? mo3.a.p(dVar8) : null;
                dj0.d dVar9 = qVar.A;
                jo3.a aVarP20 = dVar9 != null ? mo3.a.p(dVar9) : null;
                ArrayList arrayList9 = qVar.B;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                Iterator it10 = arrayList9.iterator();
                while (it10.hasNext()) {
                    arrayList10.add(new z.b(((ql4.n) it10.next()).f247150a.name()));
                }
                ql4.c cVar3 = qVar.C;
                yn4.r rVar2 = cVar3 != null ? new yn4.r(cVar3.f247093a, cVar3.f247094b.name()) : null;
                ArrayList arrayList11 = qVar.D;
                ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                Iterator it11 = arrayList11.iterator();
                while (it11.hasNext()) {
                    arrayList12.add(jo4.a.b((CreditCardCellModel) it11.next()));
                }
                ArrayList arrayList13 = qVar.E;
                ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                Iterator it12 = arrayList13.iterator();
                while (it12.hasNext()) {
                    arrayList14.add(((ql4.j) it12.next()).name());
                }
                ql4.o oVar = qVar.F;
                eVar10.b(f0Var, new yn4.z(str11, epochMilli2, list, i5, i6, aVarP8, aVarP9, localDate2, aVarP10, aVarP11, aVarP12, aVarP13, aVarP14, localDate3, localDate4, localDate5, localDate6, aVarP15, str12, str13, strName8, aVar, aVarP16, aVarP17, aVarP18, aVarP19, aVarP20, arrayList10, rVar2, arrayList12, arrayList14, new z.d(zn4.c.s(oVar.f247151a), zn4.c.s(oVar.f247152b)), qVar.G, qVar.H));
                return Unit.f186387a;
            case 8:
                cp4.g0 g0Var = (cp4.g0) this.v;
                ql4.y yVar2 = (ql4.y) this.f116668w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar11 = ((c0) obj3).d;
                Intrinsics.checkNotNullParameter(yVar2, "<this>");
                String str14 = yVar2.f247194a;
                String strName9 = yVar2.f247195b.name();
                long epochMilli3 = yVar2.f247196c.toEpochMilli();
                int i21 = yVar2.d;
                ql4.w wVar2 = yVar2.e;
                eVar11.b(g0Var, new yn4.e0(str14, strName9, epochMilli3, i21, new e0.b(zn4.c.t(wVar2.f247186a), zn4.c.t(wVar2.f247187b)), yVar2.f, yVar2.f247197g.name(), yVar2.f247198h));
                return Unit.f186387a;
            case 9:
                cp4.n0 n0Var3 = (cp4.n0) this.v;
                ql4.a0 a0Var2 = (ql4.a0) this.f116668w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar12 = ((c0) obj3).d;
                Intrinsics.checkNotNullParameter(a0Var2, "<this>");
                String strName10 = a0Var2.f247086a.name();
                ql4.z zVar2 = a0Var2.f247087b;
                f0.a aVar19 = zVar2 != null ? new f0.a(zVar2.f247199a.name()) : null;
                jo3.a aVarP21 = mo3.a.p(a0Var2.f247088c);
                ArrayList arrayList15 = a0Var2.d;
                ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                Iterator it13 = arrayList15.iterator();
                while (it13.hasNext()) {
                    arrayList16.add(zn4.c.q((CreditCardInstalmentDocument) it13.next()));
                }
                eVar12.b(n0Var3, new yn4.f0(strName10, aVar19, aVarP21, arrayList16));
                return Unit.f186387a;
            case 10:
                cp4.o0 o0Var = (cp4.o0) this.v;
                ql4.d0 d0Var = (ql4.d0) this.f116668w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar13 = ((c0) obj3).d;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                String str15 = d0Var.f247101a;
                String strName11 = d0Var.f247102b.name();
                long epochMilli4 = d0Var.f247103c.toEpochMilli();
                int i22 = d0Var.d;
                LocalDate localDate7 = d0Var.e;
                String str16 = d0Var.f;
                String str17 = d0Var.f247104g;
                dj0.d dVar10 = d0Var.f247105h;
                jo3.a aVarP22 = dVar10 != null ? mo3.a.p(dVar10) : null;
                dj0.d dVar11 = d0Var.i;
                jo3.a aVarP23 = dVar11 != null ? mo3.a.p(dVar11) : null;
                jo3.a aVarP24 = mo3.a.p(d0Var.f247106j);
                dj0.d dVar12 = d0Var.k;
                jo3.a aVarP25 = dVar12 != null ? mo3.a.p(dVar12) : null;
                dj0.d dVar13 = d0Var.f247107l;
                jo3.a aVarP26 = dVar13 != null ? mo3.a.p(dVar13) : null;
                dj0.d dVar14 = d0Var.f247108m;
                jo3.a aVarP27 = dVar14 != null ? mo3.a.p(dVar14) : null;
                ql4.b0 b0Var = d0Var.f247109n;
                g0.b bVar7 = new g0.b(zn4.c.u(b0Var.f247091a), zn4.c.u(b0Var.f247092b));
                String str18 = d0Var.o;
                ArrayList arrayList17 = d0Var.f247110p;
                ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                Iterator it14 = arrayList17.iterator();
                while (it14.hasNext()) {
                    arrayList18.add(((ql4.j) it14.next()).name());
                }
                boolean z4 = d0Var.f247111q;
                ArrayList arrayList19 = d0Var.f247112r;
                ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                Iterator it15 = arrayList19.iterator();
                while (it15.hasNext()) {
                    arrayList20.add(new z.b(((ql4.n) it15.next()).f247150a.name()));
                }
                String str19 = d0Var.f247113s;
                ArrayList arrayList21 = d0Var.f247114t;
                ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                Iterator it16 = arrayList21.iterator();
                while (it16.hasNext()) {
                    arrayList22.add(jo4.a.b((CreditCardCellModel) it16.next()));
                }
                eVar13.b(o0Var, new yn4.g0(str15, strName11, epochMilli4, i22, localDate7, str16, str17, aVarP22, aVarP23, aVarP24, aVarP25, aVarP26, aVarP27, bVar7, str18, arrayList18, z4, arrayList20, str19, arrayList22));
                return Unit.f186387a;
            case 11:
                cp4.c0 c0Var = (cp4.c0) this.v;
                List list14 = (List) this.f116668w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar14 = ((k0) obj3).f116661c;
                Intrinsics.checkNotNullParameter(list14, "<this>");
                List<sl4.c> list15 = list14;
                ArrayList arrayList23 = new ArrayList(zhm.w.t(list15, 10));
                for (sl4.c cVar4 : list15) {
                    Intrinsics.checkNotNullParameter(cVar4, "<this>");
                    String str20 = cVar4.f264137a;
                    String str21 = cVar4.f264138b;
                    String str22 = cVar4.f264139c;
                    sl4.a aVar22 = cVar4.d;
                    Intrinsics.checkNotNullParameter(aVar22, "<this>");
                    arrayList23.add(new fo4.a(str20, str21, str22, new a.C0799a(aVar22.f264136b, aVar22.f264135a.name()), cVar4.e, cVar4.f));
                }
                eVar14.b(c0Var, arrayList23);
                return Unit.f186387a;
            case 12:
                cp4.d0 d0Var2 = (cp4.d0) this.v;
                List list16 = (List) this.f116668w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar15 = ((k0) obj3).f116661c;
                Intrinsics.checkNotNullParameter(list16, "<this>");
                List<sl4.d> list17 = list16;
                ArrayList arrayList24 = new ArrayList(zhm.w.t(list17, 10));
                for (sl4.d dVar15 : list17) {
                    Intrinsics.checkNotNullParameter(dVar15, "<this>");
                    arrayList24.add(new fo4.c(dVar15.f264140a, dVar15.f264141b, dVar15.f264142c, dVar15.d, dVar15.e));
                }
                eVar15.b(d0Var2, arrayList24);
                return Unit.f186387a;
            case 13:
                String str23 = (String) this.v;
                il4.g gVar = (il4.g) this.f116668w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar16 = ((c1) obj3).e;
                cp4.a aVar25 = new cp4.a(str23);
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                il4.a aVar26 = gVar.f162081a;
                if (aVar26 != null) {
                    il4.b bVar8 = aVar26.f162059a;
                    a.b bVar9 = new a.b(bVar8.f162062a, bVar8.f162063b, bVar8.f162064c, bVar8.d, bVar8.e, bVar8.f, mo3.a.p(bVar8.f162065g));
                    il4.e eVar17 = aVar26.f162060b;
                    a.d dVar16 = eVar17 != null ? new a.d(eVar17.f162070a, eVar17.f162071b, eVar17.f162072c, eVar17.d, eVar17.e, eVar17.f, mo3.a.p(eVar17.f162073g), eVar17.f162074h, mo3.a.p(eVar17.i)) : null;
                    il4.f fVar4 = aVar26.f162061c;
                    c0931a = new a.C0931a(bVar9, dVar16, fVar4 != null ? new a.e(fVar4.f162075a, fVar4.f162076b, fVar4.f162077c, fVar4.d, fVar4.e, fVar4.f, fVar4.f162078g, fVar4.f162079h, mo3.a.p(fVar4.i), mo3.a.p(fVar4.f162080j)) : null);
                } else {
                    c0931a = null;
                }
                il4.d dVar17 = gVar.f162082b;
                if (dVar17 != null) {
                    il4.c cVar5 = dVar17.f162069a;
                    cVar = new a.c(cVar5 != null ? new a.c.C0932a(cVar5.f162066a, cVar5.f162067b, cVar5.f162068c, mo3.a.p(cVar5.d), mo3.a.p(cVar5.e), mo3.a.p(cVar5.f)) : null);
                } else {
                    cVar = null;
                }
                eVar16.b(aVar25, new in4.a(c0931a, cVar));
                return Unit.f186387a;
            case 14:
                String str24 = (String) this.v;
                List list18 = (List) this.f116668w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar18 = ((c1) obj3).e;
                cp4.i iVar2 = new cp4.i(str24);
                List<il4.h> list19 = list18;
                ArrayList arrayList25 = new ArrayList(zhm.w.t(list19, 10));
                for (il4.h hVar2 : list19) {
                    Intrinsics.checkNotNullParameter(hVar2, "<this>");
                    arrayList25.add(new xo4.h(hVar2.f162083a));
                }
                eVar18.b(iVar2, arrayList25);
                return Unit.f186387a;
            case 15:
                cp4.h0 h0Var = (cp4.h0) this.v;
                ll4.o oVar2 = (ll4.o) this.f116668w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar19 = ((c1) obj3).e;
                Intrinsics.checkNotNullParameter(oVar2, "<this>");
                yw4.b bVar10 = oVar2.f196525a;
                Intrinsics.checkNotNullParameter(bVar10, "<this>");
                String strName12 = bVar10.f317315a.name();
                List list20 = bVar10.f317316b;
                ArrayList arrayList26 = new ArrayList(zhm.w.t(list20, 10));
                Iterator it17 = list20.iterator();
                while (it17.hasNext()) {
                    arrayList26.add(((yw4.a) it17.next()).name());
                }
                xo4.j jVar = new xo4.j(strName12, arrayList26);
                ll4.l lVar5 = oVar2.f196526b;
                if (lVar5 != null) {
                    List list21 = lVar5.f196524a;
                    ArrayList arrayList27 = new ArrayList(zhm.w.t(list21, 10));
                    Iterator it18 = list21.iterator();
                    while (it18.hasNext()) {
                        arrayList27.add(((ll4.m) it18.next()).name());
                    }
                    aVar2 = new l.a(arrayList27);
                } else {
                    aVar2 = null;
                }
                eVar19.b(h0Var, new xo4.l(jVar, aVar2));
                return Unit.f186387a;
            case 16:
                cp4.p pVar = (cp4.p) this.v;
                CreditCardFeatureConfig creditCardFeatureConfig = (CreditCardFeatureConfig) this.f116668w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar20 = ((c1) obj3).e;
                Intrinsics.checkNotNullParameter(creditCardFeatureConfig, "<this>");
                if (creditCardFeatureConfig instanceof CreditCardFeatureConfig.MoveMoneyFeatureConfig) {
                    CreditCardFeatureConfig.MoveMoneyFeatureConfig moveMoneyFeatureConfig = (CreditCardFeatureConfig.MoveMoneyFeatureConfig) creditCardFeatureConfig;
                    String strName13 = moveMoneyFeatureConfig.f68731a.name();
                    String strName14 = moveMoneyFeatureConfig.f68732b.name();
                    ArrayList arrayList28 = moveMoneyFeatureConfig.f68733c;
                    ArrayList arrayList29 = new ArrayList(zhm.w.t(arrayList28, 10));
                    Iterator it19 = arrayList28.iterator();
                    while (it19.hasNext()) {
                        arrayList29.add(((ll4.j) it19.next()).name());
                    }
                    iVar = new on4.i(strName14, strName13, arrayList29);
                } else {
                    if (!(creditCardFeatureConfig instanceof CreditCardFeatureConfig.UnsupportedFeatureConfig)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = on4.j.f226903a;
                }
                eVar20.b(pVar, iVar);
                return Unit.f186387a;
            case 17:
                cp4.q qVar2 = (cp4.q) this.v;
                List list22 = (List) this.f116668w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar21 = ((c1) obj3).e;
                List<yw4.g> list23 = list22;
                ArrayList arrayList30 = new ArrayList(zhm.w.t(list23, 10));
                for (yw4.g gVar2 : list23) {
                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                    arrayList30.add(new on4.b(gVar2.f317317a.name()));
                }
                eVar21.b(qVar2, arrayList30);
                return Unit.f186387a;
            case 18:
                cp4.j jVar2 = (cp4.j) this.v;
                List list24 = (List) this.f116668w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar22 = ((c1) obj3).e;
                List<CreditCardLimitHistoryItem> list25 = list24;
                ArrayList arrayList31 = new ArrayList(zhm.w.t(list25, 10));
                for (CreditCardLimitHistoryItem creditCardLimitHistoryItem : list25) {
                    Intrinsics.checkNotNullParameter(creditCardLimitHistoryItem, "<this>");
                    jo3.a aVarP28 = mo3.a.p(creditCardLimitHistoryItem.f68813a);
                    LocalDate localDate8 = creditCardLimitHistoryItem.f68814b;
                    dj0.d dVar18 = creditCardLimitHistoryItem.f68815c;
                    arrayList31.add(new bo4.a(aVarP28, localDate8, dVar18 != null ? mo3.a.p(dVar18) : null));
                }
                eVar22.b(jVar2, arrayList31);
                return Unit.f186387a;
            case 19:
                cp4.m mVar = (cp4.m) this.v;
                List list26 = (List) this.f116668w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar23 = ((c1) obj3).e;
                List<ll4.t> list27 = list26;
                ArrayList arrayList32 = new ArrayList(zhm.w.t(list27, 10));
                for (ll4.t tVar2 : list27) {
                    Intrinsics.checkNotNullParameter(tVar2, "<this>");
                    arrayList32.add(new xo4.m(tVar2.f196533a.name(), tVar2.f196534b));
                }
                eVar23.b(mVar, arrayList32);
                return Unit.f186387a;
            case 20:
                cp4.k kVar2 = (cp4.k) this.v;
                kl4.b bVar11 = (kl4.b) this.f116668w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar24 = ((c1) obj3).e;
                Intrinsics.checkNotNullParameter(bVar11, "<this>");
                boolean z6 = bVar11.f185283a;
                jo3.a aVarP29 = mo3.a.p(bVar11.f185284b);
                jo3.a aVarP30 = mo3.a.p(bVar11.f185285c);
                jo3.a aVarP31 = mo3.a.p(bVar11.d);
                kl4.a aVar34 = bVar11.e;
                eVar24.b(kVar2, new mn4.b(z6, aVarP29, aVarP30, aVarP31, aVar34 != null ? aVar34.name() : null));
                return Unit.f186387a;
            case 21:
                cp4.u uVar = (cp4.u) this.v;
                vl4.g gVar3 = (vl4.g) this.f116668w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar25 = ((c1) obj3).e;
                Intrinsics.checkNotNullParameter(gVar3, "<this>");
                LocalDate localDate9 = gVar3.f290248a;
                LocalDate localDate10 = gVar3.f290249b;
                LocalDate localDate11 = gVar3.f290250c;
                LocalDate localDate12 = gVar3.d;
                LocalDate localDate13 = gVar3.e;
                LocalDate localDate14 = gVar3.f;
                jo3.a aVarP32 = mo3.a.p(gVar3.f290251g);
                String strName15 = gVar3.f290252h.name();
                ArrayList arrayList33 = gVar3.i;
                ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                Iterator it20 = arrayList33.iterator();
                while (it20.hasNext()) {
                    arrayList34.add(to4.a.g((CreditCardInAppStatement$RevolverTransaction) it20.next()));
                }
                dj0.d dVar19 = gVar3.f290253j;
                jo3.a aVarP33 = dVar19 != null ? mo3.a.p(dVar19) : null;
                dj0.d dVar20 = gVar3.k;
                jo3.a aVarP34 = dVar20 != null ? mo3.a.p(dVar20) : null;
                dj0.d dVar21 = gVar3.f290254l;
                jo3.a aVarP35 = dVar21 != null ? mo3.a.p(dVar21) : null;
                dj0.d dVar22 = gVar3.f290255m;
                jo3.a aVarP36 = dVar22 != null ? mo3.a.p(dVar22) : null;
                dj0.d dVar23 = gVar3.f290256n;
                jo3.a aVarP37 = dVar23 != null ? mo3.a.p(dVar23) : null;
                vl4.b bVar12 = gVar3.o;
                String strName16 = bVar12 != null ? bVar12.name() : null;
                CreditCardInAppStatement$OutstandingBalance creditCardInAppStatement$OutstandingBalance = gVar3.f290257p;
                if (creditCardInAppStatement$OutstandingBalance != null) {
                    jo3.a aVarP38 = mo3.a.p(creditCardInAppStatement$OutstandingBalance.f68878a);
                    jo3.a aVarP39 = mo3.a.p(creditCardInAppStatement$OutstandingBalance.f68879b);
                    LocalDate localDate15 = creditCardInAppStatement$OutstandingBalance.f68880c;
                    LocalDate localDate16 = creditCardInAppStatement$OutstandingBalance.d;
                    LocalDate localDate17 = creditCardInAppStatement$OutstandingBalance.e;
                    boolean z11 = creditCardInAppStatement$OutstandingBalance.f;
                    CreditCardInAppStatement$ChargesBreakdown creditCardInAppStatement$ChargesBreakdown = creditCardInAppStatement$OutstandingBalance.f68881g;
                    if (creditCardInAppStatement$ChargesBreakdown != null) {
                        z = z11;
                        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge = creditCardInAppStatement$ChargesBreakdown.f68872a;
                        a.b bVarF = creditCardInAppStatement$Charge != null ? to4.a.f(creditCardInAppStatement$Charge) : null;
                        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge2 = creditCardInAppStatement$ChargesBreakdown.f68873b;
                        a.b bVarF2 = creditCardInAppStatement$Charge2 != null ? to4.a.f(creditCardInAppStatement$Charge2) : null;
                        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge3 = creditCardInAppStatement$ChargesBreakdown.f68874c;
                        a.b bVarF3 = creditCardInAppStatement$Charge3 != null ? to4.a.f(creditCardInAppStatement$Charge3) : null;
                        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge4 = creditCardInAppStatement$ChargesBreakdown.d;
                        a.b bVarF4 = creditCardInAppStatement$Charge4 != null ? to4.a.f(creditCardInAppStatement$Charge4) : null;
                        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge5 = creditCardInAppStatement$ChargesBreakdown.e;
                        cVar2 = new a.c(bVarF, bVarF2, bVarF3, bVarF4, creditCardInAppStatement$Charge5 != null ? to4.a.f(creditCardInAppStatement$Charge5) : null);
                    } else {
                        z = z11;
                        cVar2 = null;
                    }
                    fVar = new a.f(aVarP38, aVarP39, localDate15, localDate16, localDate17, z, cVar2);
                } else {
                    fVar = null;
                }
                String str25 = gVar3.f290258q;
                String str26 = gVar3.f290259r;
                vl4.f fVar5 = gVar3.f290260s;
                if (fVar5 != null) {
                    vl4.a aVar36 = fVar5.f290245a;
                    str = str25;
                    hVar = new a.h(new a.d(aVar36.f290242a, aVar36.f290243b, aVar36.f290244c, aVar36.d, aVar36.e), fVar5.f290246b, fVar5.f290247c);
                } else {
                    str = str25;
                    hVar = null;
                }
                List list28 = gVar3.u;
                if (list28 != null) {
                    List list29 = list28;
                    ArrayList arrayList35 = new ArrayList(zhm.w.t(list29, 10));
                    Iterator it21 = list29.iterator();
                    while (it21.hasNext()) {
                        CreditCardInAppStatement$AccruedInterest creditCardInAppStatement$AccruedInterest = (CreditCardInAppStatement$AccruedInterest) it21.next();
                        String str27 = creditCardInAppStatement$AccruedInterest.f68867a;
                        Iterator it22 = it21;
                        String str28 = creditCardInAppStatement$AccruedInterest.f68868b;
                        LocalDate localDate18 = localDate9;
                        jo3.a aVarP40 = mo3.a.p(creditCardInAppStatement$AccruedInterest.f68869c);
                        ArrayList arrayList36 = creditCardInAppStatement$AccruedInterest.d;
                        LocalDate localDate19 = localDate10;
                        LocalDate localDate20 = localDate11;
                        LocalDate localDate21 = localDate12;
                        ArrayList arrayList37 = new ArrayList(zhm.w.t(arrayList36, 10));
                        Iterator it23 = arrayList36.iterator();
                        while (it23.hasNext()) {
                            arrayList37.add(to4.a.g((CreditCardInAppStatement$RevolverTransaction) it23.next()));
                        }
                        arrayList35.add(new a.C1478a(str27, str28, arrayList37, aVarP40));
                        it21 = it22;
                        localDate9 = localDate18;
                        localDate10 = localDate19;
                        localDate11 = localDate20;
                        localDate12 = localDate21;
                    }
                    arrayList = arrayList35;
                } else {
                    arrayList = null;
                }
                LocalDate localDate22 = localDate9;
                LocalDate localDate23 = localDate10;
                LocalDate localDate24 = localDate11;
                LocalDate localDate25 = localDate12;
                String strName17 = gVar3.f290261t.name();
                ArrayList arrayList38 = gVar3.v;
                ArrayList arrayList39 = new ArrayList(zhm.w.t(arrayList38, 10));
                Iterator it24 = arrayList38.iterator();
                while (it24.hasNext()) {
                    arrayList39.add(jo4.a.b((CreditCardCellModel) it24.next()));
                }
                eVar25.b(uVar, new so4.a(localDate22, localDate23, localDate24, localDate25, localDate13, localDate14, aVarP32, strName15, arrayList34, aVarP33, aVarP34, aVarP35, aVarP36, aVarP37, strName16, fVar, str, str26, hVar, strName17, arrayList, arrayList39));
                return Unit.f186387a;
            case 22:
                cp4.v vVar = (cp4.v) this.v;
                List list30 = (List) this.f116668w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar26 = ((c1) obj3).e;
                List<vl4.i> list31 = list30;
                ArrayList arrayList40 = new ArrayList(zhm.w.t(list31, 10));
                for (vl4.i iVar3 : list31) {
                    Intrinsics.checkNotNullParameter(iVar3, "<this>");
                    LocalDate localDate26 = iVar3.f290263a;
                    LocalDate localDate27 = iVar3.f290264b;
                    LocalDate localDate28 = iVar3.f290265c;
                    LocalDate localDate29 = iVar3.d;
                    jo3.a aVarP41 = mo3.a.p(iVar3.e);
                    String strName18 = iVar3.f.name();
                    vl4.h hVar3 = iVar3.f290266g;
                    b.a aVar38 = hVar3 != null ? new b.a(hVar3.f290262a) : null;
                    String strName19 = iVar3.f290267h.name();
                    dj0.d dVar24 = iVar3.i;
                    arrayList40.add(new so4.b(localDate26, localDate27, localDate28, localDate29, aVarP41, strName18, aVar38, strName19, dVar24 != null ? mo3.a.p(dVar24) : null));
                }
                eVar26.b(vVar, arrayList40);
                return Unit.f186387a;
            case 23:
                cp4.w wVar3 = (cp4.w) this.v;
                vl4.u uVar2 = (vl4.u) this.f116668w;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar27 = ((c1) obj3).e;
                Intrinsics.checkNotNullParameter(uVar2, "<this>");
                vl4.s sVar = uVar2.f290288a;
                c.C1483c c1483c = sVar != null ? new c.C1483c(sVar.d, sVar.f290285a, sVar.f290286b, sVar.f290287c, sVar.e, sVar.f) : null;
                vl4.n nVar2 = uVar2.f290289b;
                if (nVar2 != null) {
                    String str29 = nVar2.f290274a;
                    String str30 = nVar2.f290275b;
                    vl4.l lVar6 = nVar2.f290276c;
                    if (lVar6 != null) {
                        vl4.j jVar3 = lVar6.f290270a;
                        c.a.C1479a c1479a = jVar3 != null ? new c.a.C1479a(jVar3.f290268a.name(), jVar3.f290269b) : null;
                        vl4.m mVar2 = lVar6.f290271b;
                        bVar3 = new c.a.b(c1479a, mVar2 != null ? new c.a.C1480c(mVar2.f290272a, mVar2.f290273b) : null);
                    } else {
                        bVar3 = null;
                    }
                    aVar3 = new c.a(str29, str30, bVar3);
                } else {
                    aVar3 = null;
                }
                vl4.r rVar3 = uVar2.f290290c;
                if (rVar3 != null) {
                    String str31 = rVar3.f290282a;
                    String str32 = rVar3.f290283b;
                    vl4.q qVar3 = rVar3.f290284c;
                    if (qVar3 != null) {
                        vl4.t tVar3 = qVar3.f290280a;
                        c1482c = new c.b.C1482c(tVar3 != null ? tVar3.name() : null, qVar3.f290281b);
                    } else {
                        c1482c = null;
                    }
                    vl4.o oVar3 = rVar3.d;
                    if (oVar3 != null) {
                        vl4.p pVar2 = oVar3.f290277a;
                        String str33 = pVar2.f290278a;
                        tl4.c cVar6 = pVar2.f290279b;
                        aVar4 = new c.b.a(new c.b.C1481b(str33, cVar6 != null ? cVar6.name() : null));
                    } else {
                        aVar4 = null;
                    }
                    bVar2 = new c.b(str31, str32, c1482c, aVar4);
                } else {
                    bVar2 = null;
                }
                eVar27.b(wVar3, new so4.c(c1483c, aVar3, bVar2, uVar2.d));
                return Unit.f186387a;
            case 24:
                cp4.e0 e0Var = (cp4.e0) this.v;
                ll4.y yVar3 = (ll4.y) this.f116668w;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar28 = ((c1) obj3).e;
                Object obj4 = pn4.a.f237663a;
                Intrinsics.checkNotNullParameter(yVar3, "<this>");
                long j3 = yVar3.f196556a;
                long jN = oc.c.N(yVar3.f196557b);
                long jN2 = oc.c.N(yVar3.f196558c);
                long j5 = yVar3.d;
                long j16 = yVar3.e;
                long jN3 = oc.c.N(yVar3.f);
                boolean z12 = yVar3.f196559g;
                long j22 = yVar3.f196560h;
                long j42 = yVar3.i;
                Long l2 = yVar3.f196561j;
                LocalDate localDate30 = yVar3.k;
                Long lValueOf = localDate30 != null ? Long.valueOf(oc.c.N(localDate30)) : null;
                LocalDate localDate31 = yVar3.f196562l;
                Long lValueOf2 = localDate31 != null ? Long.valueOf(oc.c.N(localDate31)) : null;
                Long l3 = yVar3.f196563m;
                long j46 = yVar3.f196564n;
                ll4.v vVar2 = yVar3.o;
                if (vVar2 != null) {
                    ll4.x xVar = vVar2.f196552a;
                    z3 = z12;
                    if (xVar != null) {
                        j2 = j46;
                        bVar4 = new h.b(xVar.f196553a, xVar.f196554b, xVar.f196555c);
                    } else {
                        j2 = j46;
                        bVar4 = null;
                    }
                    aVar5 = new h.a(bVar4);
                } else {
                    z3 = z12;
                    j2 = j46;
                    aVar5 = null;
                }
                eVar28.b(e0Var, new on4.h(j3, jN, jN2, jN3, j5, j16, z3, j22, j42, l2, lValueOf, lValueOf2, l3, j2, aVar5));
                return Unit.f186387a;
            case 25:
                return b(obj2);
            case 26:
                return c(obj2);
            case 27:
                return n(obj2);
            case 28:
                return o(obj2);
            default:
                cp4.q0 q0Var = (cp4.q0) this.v;
                wl4.b bVar13 = (wl4.b) this.f116668w;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar29 = ((c1) obj3).e;
                Intrinsics.checkNotNullParameter(bVar13, "<this>");
                wl4.a aVar42 = bVar13.f298410a;
                eVar29.b(q0Var, new vo4.a(aVar42 != null ? new a.C1611a(aVar42.f298408a, aVar42.f298409b) : null));
                return Unit.f186387a;
        }
    }
}
