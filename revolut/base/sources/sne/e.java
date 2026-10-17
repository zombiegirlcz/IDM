package sne;

import a2l.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiApplications;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteTransactionWidget;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeStatus;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingButton;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import dcl.t;
import do3.n;
import do3.q;
import eel.h;
import eel.l;
import gim.i;
import hha.w0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k71.k;
import kbk.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import qua.p;
import tof.a3;
import tof.x0;
import vdl.d1;
import vdl.h0;
import vdl.j1;
import vdl.l1;
import vdl.z0;
import wim.z;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f264564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f264565x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f264565x = obj2;
    }

    private final Object b(Object obj2) {
        Pair pair;
        Pair pair2;
        l1 l1Var = (l1) this.f264565x;
        j1 j1Var = (j1) this.v;
        eel.e eVar = (eel.e) this.f264564w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = eVar.e;
        Object obj3 = tcl.f.f269881a;
        if (hVar == null) {
            pair2 = new Pair(null, null);
        } else {
            if (hVar instanceof eel.f) {
                pair = new Pair(cp5.c.M(((eel.f) hVar).f125230a), null);
            } else {
                if (!(hVar instanceof eel.g)) {
                    throw new IllegalStateException(a0.d.l(hVar.getClass(), "provide handling for "));
                }
                pair = new Pair(null, ((eel.g) hVar).f125231a);
            }
            pair2 = pair;
        }
        ko3.b bVar = (ko3.b) pair2.f186385a;
        BigDecimal bigDecimal = (BigDecimal) pair2.f186386b;
        ue0.c cVar = l1Var.f287998c;
        String strA = l1.a(l1Var, j1Var);
        eel.c cVar2 = j1Var.f287987b;
        cVar.G(new icl.a(eVar.f125228b, eVar.f125229c, bVar, bigDecimal != null ? bigDecimal.toPlainString() : null), strA, z.d(o0.b(icl.a.class)));
        t tVar = l1Var.f287997b;
        String str = j1Var.f287986a;
        String id10 = cVar2.getId();
        eel.i iVar = j1Var.f287988c;
        List<l> list = eVar.f125227a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            String period = cVar2.getId();
            eel.i valueType = j1Var.f287988c;
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(valueType, "valueType");
            String str2 = lVar.f125237a;
            long j2 = lVar.f125238b;
            h hVar2 = lVar.f125239c;
            ej0.b bVar2 = hVar2 instanceof eel.f ? ((eel.f) hVar2).f125230a : null;
            ko3.b bVarM = bVar2 != null ? cp5.c.M(bVar2) : null;
            BigDecimal bigDecimal2 = hVar2 instanceof eel.g ? ((eel.g) hVar2).f125231a : null;
            arrayList.add(new icl.c(str2, period, j2, valueType, bVarM, bigDecimal2 == null ? null : bigDecimal2));
        }
        tVar.c(str, id10, iVar, arrayList);
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) this.v;
        List list = (List) this.f264564w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        utk.f fVar = (utk.f) this.f264565x;
        Set setA = bkc.c.a(rentAndBillsLinkedPayments);
        LocalDate localDateE = ((l80.f) ((l80.e) fVar.f283123c)).e();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (setA.contains(((p) obj3).f249314a.f160150a)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            org.joda.time.LocalDate localDate = ((p) it8.next()).f249314a.f;
            if (localDate != null) {
                arrayList2.add(localDate);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (!jli.b.e((org.joda.time.LocalDate) obj4).isBefore(localDateE)) {
                arrayList3.add(obj4);
            }
        }
        org.joda.time.LocalDate localDate2 = (org.joda.time.LocalDate) d0.u0(arrayList3);
        if (localDate2 != null) {
            return jli.b.e(localDate2);
        }
        return null;
    }

    private final Object n(Object obj2) {
        vbk.b bVar;
        vbk.b bVar2;
        vbk.b bVar3;
        vbk.a aVar;
        vbk.b bVar4;
        vbk.g gVar;
        vbk.b bVar5;
        String str = (String) this.v;
        j jVar = (j) this.f264564w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ue0.c cVar = ((wbk.h) this.f264565x).f296247c;
        String str2 = "KEY_RECEIVER_INTRO_" + str;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str3 = jVar.f182627a;
        String str4 = jVar.f182628b;
        vbk.e eVarB = xbk.a.b(jVar.f182629c);
        vbk.e eVarB2 = xbk.a.b(jVar.d);
        vbk.e eVarB3 = xbk.a.b(jVar.e);
        kbk.d dVar = jVar.f;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        vbk.a aVar3 = new vbk.a(dVar.f182620a, dVar.f182621b.a());
        String str5 = jVar.f182630g;
        PlanGiftingButton planGiftingButton = jVar.f182631h;
        if (planGiftingButton != null) {
            Intrinsics.checkNotNullParameter(planGiftingButton, "<this>");
            bVar = new vbk.b(planGiftingButton.f102432a);
        } else {
            bVar = null;
        }
        PlanGiftingButton planGiftingButton2 = jVar.i;
        if (planGiftingButton2 != null) {
            Intrinsics.checkNotNullParameter(planGiftingButton2, "<this>");
            bVar2 = new vbk.b(planGiftingButton2.f102432a);
        } else {
            bVar2 = null;
        }
        PlanGiftingButton planGiftingButton3 = jVar.f182632j;
        if (planGiftingButton3 != null) {
            Intrinsics.checkNotNullParameter(planGiftingButton3, "<this>");
            bVar3 = new vbk.b(planGiftingButton3.f102432a);
        } else {
            bVar3 = null;
        }
        PlanGiftingRefund planGiftingRefund = jVar.k;
        if (planGiftingRefund != null) {
            Intrinsics.checkNotNullParameter(planGiftingRefund, "<this>");
            vbk.e eVarB4 = xbk.a.b(planGiftingRefund.f102444b);
            vbk.e eVarB5 = xbk.a.b(planGiftingRefund.f102445c);
            dj0.d dVar2 = planGiftingRefund.f102443a;
            vbk.b bVar6 = bVar3;
            vbk.g gVar2 = new vbk.g(dVar2 != null ? mo3.a.p(dVar2) : null, eVarB4, eVarB5);
            aVar = aVar3;
            bVar4 = bVar;
            bVar5 = bVar6;
            gVar = gVar2;
        } else {
            aVar = aVar3;
            bVar4 = bVar;
            gVar = null;
            bVar5 = bVar3;
        }
        cVar.G(new vbk.f(str3, str4, eVarB, eVarB2, eVarB3, aVar, str5, bVar4, bVar2, bVar5, gVar), str2, z.d(o0.b(vbk.f.class)));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        a3 a3Var = (a3) this.v;
        n nVar = (n) this.f264564w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        wkf.f fVar = (wkf.f) this.f264565x;
        wi0.b bVarY = q.y(nVar);
        fVar.getClass();
        boolean zB1 = k.b1(a3Var);
        dj0.d dVar = a3Var.f272599l;
        dj0.d dVar2 = a3Var.k;
        if (!zB1) {
            dj0.d dVarA = dVar2.a();
            dj0.d dVarA2 = dVar.a();
            aim.e eVarB = u.b();
            eVarB.add(new CellDetailsDelegate.Model("purchase_amount", new TextLocalisedClause(R$string.transactionUI_transaction_pay_later_purchase_refund, null, null, 14), new MoneyClause(dVarA, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            if (!dVarA2.k()) {
                eVarB.add(new CellDetailsDelegate.Model("ID_PAY_LATER_REPAYMENT_FEE", new TextLocalisedClause(R$string.transactionUI_transaction_pay_later_fee_refund, null, null, 14), new MoneyClause(dVarA2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            aim.e eVarA = u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            return eVarA;
        }
        x0 x0Var = a3Var.f272615t0;
        if (x0Var == null) {
            return f0.f322471a;
        }
        dj0.d dVarA3 = new dj0.d(x0Var.d, dVar2.f115083b).a();
        dj0.d dVarH = pyd.c.H(dVar.a(), dVarA3);
        aim.e eVarB2 = u.b();
        eVarB2.add(new CellDetailsDelegate.Model("purchase_amount", new TextLocalisedClause(R$string.transactionUI_transaction_pay_later_purchase_amount, null, null, 14), new MoneyClause(dVar2.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        if (!dVarH.k()) {
            eVarB2.add(new CellDetailsDelegate.Model("ID_PAY_LATER_REPAYMENT_FEE", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_repayment_details_fee, null, null, 14), new MoneyClause(dVarH, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        if (!dVarA3.k()) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_repayment_details_late_interest, null, null, 14);
            MoneyClause moneyClause = new MoneyClause(dVarA3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(x0Var.f273154c));
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            eVarB2.add(new CellDetailsActionDelegate.Model("ID_PAY_LATER_REPAYMENT_LATE_INTEREST", textLocalisedClause, 0, null, moneyClause, false, false, null, new bi9.c(new Pair(bigDecimalMultiply, bVarY)), 0, 0, 32224));
        }
        aim.e eVarA2 = u.a(eVarB2);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        return eVarA2;
    }

    private final Object p(Object obj2) {
        String str = (String) this.v;
        List list = (List) this.f264564w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ue0.c cVar = ((wq8.c) this.f264565x).f299421a;
        String strB = wq8.c.b(str);
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<sq8.d> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (sq8.d dVar : list2) {
            String str2 = dVar.f265024a;
            String str3 = dVar.f265025b;
            boolean z = dVar.f265027g;
            String str4 = dVar.f265026c;
            String str5 = dVar.d;
            String str6 = dVar.e;
            String str7 = dVar.f;
            String strName = dVar.f265028h.name();
            w0 w0Var = dVar.i;
            arrayList.add(new tq8.c(str2, str3, str4, str5, str6, str7, strName, w0Var != null ? w0Var.name() : null, z));
        }
        cVar.G(arrayList, strB, kii.e.o(tq8.c.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                e eVar = new e((g) this.f264565x, (Continuation) obj4, 0);
                eVar.v = (d) obj2;
                eVar.f264564w = (one.d) obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            case 1:
                e eVar2 = new e((com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a) this.f264565x, (Continuation) obj4, 1);
                eVar2.v = (Data) obj2;
                eVar2.f264564w = (Data) obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
            case 2:
                e eVar3 = new e((tff.d) this.f264565x, (Continuation) obj4, 2);
                eVar3.v = (rff.a) obj2;
                eVar3.f264564w = (List) obj3;
                return eVar3.invokeSuspend(Unit.f186387a);
            case 3:
                e eVar4 = new e((th6.h) this.f264565x, (Continuation) obj4, 3);
                eVar4.v = (String) obj2;
                eVar4.f264564w = (IndiaUpiApplications) obj3;
                return eVar4.invokeSuspend(Unit.f186387a);
            case 4:
                e eVar5 = new e((th6.q) this.f264565x, (Continuation) obj4, 4);
                eVar5.v = (String) obj2;
                eVar5.f264564w = (ph6.b) obj3;
                return eVar5.invokeSuspend(Unit.f186387a);
            case 5:
                e eVar6 = new e((tjb.g) this.f264565x, (Continuation) obj4, 5);
                eVar6.v = (String) obj2;
                eVar6.f264564w = (qib.i) obj3;
                return eVar6.invokeSuspend(Unit.f186387a);
            case 6:
                e eVar7 = new e((tjb.g) this.f264565x, (Continuation) obj4, 6);
                eVar7.v = (String) obj2;
                eVar7.f264564w = (SavingsChallenge) obj3;
                return eVar7.invokeSuspend(Unit.f186387a);
            case 7:
                e eVar8 = new e((tuj.g) this.f264565x, (Continuation) obj4, 7);
                eVar8.v = (String) obj2;
                eVar8.f264564w = (puj.e) obj3;
                return eVar8.invokeSuspend(Unit.f186387a);
            case 8:
                e eVar9 = new e((tw5.i) this.f264564w, (String) this.f264565x, (Continuation) obj4);
                eVar9.v = (cw5.f) obj3;
                return eVar9.invokeSuspend(Unit.f186387a);
            case 9:
                e eVar10 = new e((u1l.e) this.f264565x, (Continuation) obj4, 9);
                eVar10.v = (String) obj2;
                eVar10.f264564w = (y) obj3;
                return eVar10.invokeSuspend(Unit.f186387a);
            case 10:
                e eVar11 = new e((u66.b) this.f264565x, (Continuation) obj4, 10);
                eVar11.v = (q66.c) obj2;
                eVar11.f264564w = (t66.f) obj3;
                return eVar11.invokeSuspend(Unit.f186387a);
            case 11:
                e eVar12 = new e((un8.b) this.f264565x, (Continuation) obj4, 11);
                eVar12.v = (String) obj2;
                eVar12.f264564w = (List) obj3;
                return eVar12.invokeSuspend(Unit.f186387a);
            case 12:
                e eVar13 = new e((un8.h) this.f264565x, (Continuation) obj4, 12);
                eVar13.v = (String) obj2;
                eVar13.f264564w = (in8.c) obj3;
                return eVar13.invokeSuspend(Unit.f186387a);
            case 13:
                e eVar14 = new e((un8.k) this.f264565x, (Continuation) obj4, 13);
                eVar14.v = (String) obj2;
                eVar14.f264564w = (jn8.b) obj3;
                return eVar14.invokeSuspend(Unit.f186387a);
            case 14:
                e eVar15 = new e((uwa.q) this.f264565x, (Continuation) obj4, 14);
                eVar15.v = (uwa.f) obj2;
                eVar15.f264564w = (ReferralCampaignV4) obj3;
                return eVar15.invokeSuspend(Unit.f186387a);
            case 15:
                e eVar16 = new e((uwa.q) this.f264565x, (Continuation) obj4, 15);
                eVar16.v = (pwa.n) obj2;
                eVar16.f264564w = (pwa.g) obj3;
                return eVar16.invokeSuspend(Unit.f186387a);
            case 16:
                e eVar17 = new e((uwa.q) this.f264565x, (Continuation) obj4, 16);
                eVar17.v = (pwa.n) obj2;
                eVar17.f264564w = (InviteeStatus) obj3;
                return eVar17.invokeSuspend(Unit.f186387a);
            case 17:
                e eVar18 = new e((uwa.q) this.f264565x, (Continuation) obj4, 17);
                eVar18.v = (uwa.j) obj2;
                eVar18.f264564w = (pwa.k) obj3;
                return eVar18.invokeSuspend(Unit.f186387a);
            case 18:
                e eVar19 = new e((uwa.q) this.f264565x, (Continuation) obj4, 18);
                eVar19.v = (uwa.k) obj2;
                eVar19.f264564w = (InviteTransactionWidget) obj3;
                return eVar19.invokeSuspend(Unit.f186387a);
            case 19:
                e eVar20 = new e((vdl.f) this.f264565x, (Continuation) obj4, 19);
                eVar20.v = (String) obj2;
                eVar20.f264564w = (List) obj3;
                return eVar20.invokeSuspend(Unit.f186387a);
            case 20:
                e eVar21 = new e((vdl.o) this.f264565x, (Continuation) obj4, 20);
                eVar21.v = (String) obj2;
                eVar21.f264564w = (nel.w) obj3;
                return eVar21.invokeSuspend(Unit.f186387a);
            case 21:
                e eVar22 = new e((h0) this.f264565x, (Continuation) obj4, 21);
                eVar22.v = (String) obj2;
                eVar22.f264564w = (uel.c) obj3;
                return eVar22.invokeSuspend(Unit.f186387a);
            case 22:
                e eVar23 = new e((d1) this.f264565x, (Continuation) obj4, 22);
                eVar23.v = (z0) obj2;
                eVar23.f264564w = (eel.a) obj3;
                return eVar23.invokeSuspend(Unit.f186387a);
            case 23:
                e eVar24 = new e((l1) this.f264565x, (Continuation) obj4, 23);
                eVar24.v = (j1) obj2;
                eVar24.f264564w = (eel.e) obj3;
                return eVar24.invokeSuspend(Unit.f186387a);
            case 24:
                e eVar25 = new e((utk.f) this.f264565x, (Continuation) obj4, 24);
                eVar25.v = (RentAndBillsLinkedPayments) obj2;
                eVar25.f264564w = (List) obj3;
                return eVar25.invokeSuspend(Unit.f186387a);
            case 25:
                e eVar26 = new e((vpk.p) this.f264565x, (Continuation) obj4, 25);
                eVar26.v = (vpk.g) obj2;
                eVar26.f264564w = (qta.b) obj3;
                return eVar26.invokeSuspend(Unit.f186387a);
            case 26:
                e eVar27 = new e((wbk.h) this.f264565x, (Continuation) obj4, 26);
                eVar27.v = (String) obj2;
                eVar27.f264564w = (j) obj3;
                return eVar27.invokeSuspend(Unit.f186387a);
            case 27:
                e eVar28 = new e((wkf.f) this.f264565x, (Continuation) obj4, 27);
                eVar28.v = (a3) obj2;
                eVar28.f264564w = (n) obj3;
                return eVar28.invokeSuspend(Unit.f186387a);
            case 28:
                e eVar29 = new e((wq8.c) this.f264565x, (Continuation) obj4, 28);
                eVar29.v = (String) obj2;
                eVar29.f264564w = (List) obj3;
                return eVar29.invokeSuspend(Unit.f186387a);
            default:
                e eVar30 = new e((wqj.j) this.f264565x, (Continuation) obj4, 29);
                eVar30.v = (wqj.e) obj2;
                eVar30.f264564w = (od0.i) obj3;
                return eVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tw5.i iVar, String str, Continuation continuation) {
        super(3, continuation);
        this.u = 8;
        this.f264564w = iVar;
        this.f264565x = str;
    }
}
