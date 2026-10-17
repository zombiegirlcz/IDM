package a0e;

import au6.c3;
import au6.d0;
import au6.k3;
import au6.p1;
import au6.r3;
import au6.u1;
import au6.w2;
import au6.z1;
import com.revolut.data.model.Data;
import com.revolut.feature.credit_card.autopay.api.models_v3.AmountSelection;
import com.revolut.feature.credit_card.autopay.api.models_v3.BackupCardContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmation;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmationItem;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import dx4.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import s7g.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f351x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f351x = obj2;
    }

    private final Object b(Object obj2) {
        aim.f fVarB;
        ArrayList arrayList;
        String str;
        ac5.w tVar;
        ac5.w sVar;
        bc5.a aVar = (bc5.a) this.v;
        CreditCardAutopayConfig creditCardAutopayConfig = (CreditCardAutopayConfig) this.f350w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xx4.e eVar = (xx4.e) ((hd.r) this.f351x).f151366c;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(creditCardAutopayConfig, "<this>");
        ArrayList<CreditCardAutopayType> arrayList2 = creditCardAutopayConfig.f70693a;
        int i = 10;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (CreditCardAutopayType creditCardAutopayType : arrayList2) {
            Intrinsics.checkNotNullParameter(creditCardAutopayType, str2);
            if (creditCardAutopayType instanceof CreditCardAutopayType.DirectDebit) {
                CreditCardAutopayType.DirectDebit directDebit = (CreditCardAutopayType.DirectDebit) creditCardAutopayType;
                String strName = directDebit.f70729a.name();
                ArrayList arrayList4 = directDebit.f70730b;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(((nb5.e) it8.next()).name());
                }
                ArrayList arrayList6 = directDebit.f70731c;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    arrayList7.add(((nb5.e) it9.next()).name());
                }
                String strName2 = directDebit.f70733h.name();
                String str3 = directDebit.i.f297794a;
                int i2 = directDebit.f;
                ArrayList arrayList8 = directDebit.d;
                str = str2;
                ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                Iterator it10 = arrayList8.iterator();
                while (it10.hasNext()) {
                    arrayList9.add(((nb5.b) it10.next()).name());
                }
                tVar = new ac5.t(strName, arrayList5, arrayList7, strName2, str3, i2, arrayList9, directDebit.f70732g);
            } else {
                str = str2;
                if (creditCardAutopayType instanceof CreditCardAutopayType.RevolutPocket) {
                    CreditCardAutopayType.RevolutPocket revolutPocket = (CreditCardAutopayType.RevolutPocket) creditCardAutopayType;
                    String strName3 = revolutPocket.f70734a.name();
                    ArrayList arrayList10 = revolutPocket.f70735b;
                    ArrayList arrayList11 = new ArrayList(zhm.w.t(arrayList10, 10));
                    Iterator it11 = arrayList10.iterator();
                    while (it11.hasNext()) {
                        arrayList11.add(((nb5.e) it11.next()).name());
                    }
                    ArrayList arrayList12 = revolutPocket.f70736c;
                    ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                    Iterator it12 = arrayList12.iterator();
                    while (it12.hasNext()) {
                        arrayList13.add(((nb5.e) it12.next()).name());
                    }
                    ArrayList arrayList14 = revolutPocket.d;
                    ArrayList arrayList15 = new ArrayList(zhm.w.t(arrayList14, 10));
                    Iterator it13 = arrayList14.iterator();
                    while (it13.hasNext()) {
                        arrayList15.add(((nb5.b) it13.next()).name());
                    }
                    List list = revolutPocket.e;
                    ArrayList arrayList16 = new ArrayList(zhm.w.t(list, 10));
                    Iterator it14 = list.iterator();
                    while (it14.hasNext()) {
                        arrayList16.add(((com.revolut.feature.credit_card.autopay.api.models_v3.a) it14.next()).name());
                    }
                    sVar = new ac5.u(arrayList11, arrayList13, arrayList15, arrayList16, strName3, revolutPocket.f, revolutPocket.f70737g);
                } else if (creditCardAutopayType instanceof CreditCardAutopayType.BackupCard) {
                    CreditCardAutopayType.BackupCard backupCard = (CreditCardAutopayType.BackupCard) creditCardAutopayType;
                    String strName4 = backupCard.f70725a.name();
                    ArrayList arrayList17 = backupCard.f70726b;
                    ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                    Iterator it15 = arrayList17.iterator();
                    while (it15.hasNext()) {
                        arrayList18.add(((nb5.e) it15.next()).name());
                    }
                    ArrayList arrayList19 = backupCard.f70727c;
                    ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                    Iterator it16 = arrayList19.iterator();
                    while (it16.hasNext()) {
                        arrayList20.add(((nb5.e) it16.next()).name());
                    }
                    ArrayList arrayList21 = backupCard.d;
                    ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                    Iterator it17 = arrayList21.iterator();
                    while (it17.hasNext()) {
                        arrayList22.add(((nb5.b) it17.next()).name());
                    }
                    List list2 = backupCard.e;
                    ArrayList arrayList23 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it18 = list2.iterator();
                    while (it18.hasNext()) {
                        arrayList23.add(((com.revolut.feature.credit_card.autopay.api.models_v3.a) it18.next()).name());
                    }
                    sVar = new ac5.s(arrayList18, arrayList20, arrayList22, arrayList23, strName4, backupCard.f, backupCard.f70728g);
                } else {
                    if (!(creditCardAutopayType instanceof CreditCardAutopayType.Unsupported)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar = ac5.v.f3090a;
                }
                tVar = sVar;
            }
            arrayList3.add(tVar);
            str2 = str;
        }
        CreditCardAutopayContent creditCardAutopayContent = creditCardAutopayConfig.f70694b;
        if (creditCardAutopayContent != null) {
            aim.f builder = new aim.f();
            AmountSelection amountSelection = creditCardAutopayContent.f70702a;
            BackupCardContent backupCardContent = creditCardAutopayContent.f70703b;
            String str4 = amountSelection.f70687a;
            if (str4 != null) {
            }
            String str5 = amountSelection.f70688b;
            if (str5 != null) {
            }
            String str6 = amountSelection.f70689c;
            if (str6 != null) {
            }
            String str7 = backupCardContent.f70691a;
            if (str7 != null) {
            }
            String str8 = backupCardContent.f70692b;
            if (str8 != null) {
            }
            String str9 = amountSelection.d;
            if (str9 != null) {
            }
            String str10 = amountSelection.e;
            if (str10 != null) {
            }
            String str11 = amountSelection.f;
            if (str11 != null) {
            }
            String str12 = amountSelection.f70690g;
            if (str12 != null) {
                builder.put("STATEMENT_BALANCE_DESCRIPTION", str12);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            fVarB = builder.b();
        } else {
            fVarB = null;
        }
        List list3 = creditCardAutopayConfig.f70695c;
        if (list3 != null) {
            List<CreditCardAutopayConfirmation> list4 = list3;
            ArrayList arrayList24 = new ArrayList(zhm.w.t(list4, 10));
            for (CreditCardAutopayConfirmation creditCardAutopayConfirmation : list4) {
                com.revolut.feature.credit_card.autopay.api.models_v3.a aVar3 = creditCardAutopayConfirmation.f70696a;
                String strName5 = aVar3 != null ? aVar3.name() : null;
                String str13 = creditCardAutopayConfirmation.f70697b;
                String str14 = creditCardAutopayConfirmation.f70698c;
                ArrayList<CreditCardAutopayConfirmationItem> arrayList25 = creditCardAutopayConfirmation.d;
                ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, i));
                for (CreditCardAutopayConfirmationItem creditCardAutopayConfirmationItem : arrayList25) {
                    a1 a1Var = creditCardAutopayConfirmationItem.f70699a;
                    arrayList26.add(new ac5.c(a1Var != null ? a1Var.b() : null, creditCardAutopayConfirmationItem.f70700b, creditCardAutopayConfirmationItem.f70701c));
                }
                arrayList24.add(new ac5.b(strName5, str13, str14, creditCardAutopayConfirmation.e, arrayList26));
                i = 10;
            }
            arrayList = arrayList24;
        } else {
            arrayList = null;
        }
        eVar.b(aVar, new ac5.a(arrayList3, fVarB, arrayList));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                o oVar = new o((b) this.f351x, (Continuation) obj4, 0);
                oVar.v = (Data) obj2;
                oVar.f350w = (Data) obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o((a5b.g) this.f351x, (Continuation) obj4, 1);
                oVar2.v = (Data) obj2;
                oVar2.f350w = (del.f) obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
            case 2:
                o oVar3 = new o((a9d.u) this.f351x, (Continuation) obj4, 2);
                oVar3.f350w = (ra3.a) obj2;
                oVar3.v = (Data) obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
            case 3:
                o oVar4 = new o((acd.a) this.f351x, (Continuation) obj4, 3);
                oVar4.v = (mcd.c) obj2;
                oVar4.f350w = (List) obj3;
                return oVar4.invokeSuspend(Unit.f186387a);
            case 4:
                o oVar5 = new o((com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f351x, (Continuation) obj4, 4);
                oVar5.v = (List) obj2;
                oVar5.f350w = (Set) obj3;
                return oVar5.invokeSuspend(Unit.f186387a);
            case 5:
                o oVar6 = new o((ald.a) this.f351x, (Continuation) obj4, 5);
                oVar6.v = (SlotChecklistFetchConfig) obj2;
                oVar6.f350w = (SlotChecklist) obj3;
                return oVar6.invokeSuspend(Unit.f186387a);
            case 6:
                String str = ((AcquiringOrder$Id) obj2).f73342a;
                o oVar7 = new o((au6.v) this.f351x, (Continuation) obj4, 6);
                oVar7.v = str;
                oVar7.f350w = (List) obj3;
                return oVar7.invokeSuspend(Unit.f186387a);
            case 7:
                String str2 = ((AcquiringOrder$Id) obj2).f73342a;
                o oVar8 = new o((au6.v) this.f351x, (Continuation) obj4, 7);
                oVar8.v = str2;
                oVar8.f350w = (nr6.w) obj3;
                return oVar8.invokeSuspend(Unit.f186387a);
            case 8:
                String str3 = ((AcquiringPayment$Id) obj2).f73363a;
                o oVar9 = new o((d0) this.f351x, (Continuation) obj4, 8);
                oVar9.v = str3;
                oVar9.f350w = (List) obj3;
                return oVar9.invokeSuspend(Unit.f186387a);
            case 9:
                o oVar10 = new o((p1) this.f351x, (Continuation) obj4, 9);
                oVar10.v = (ur6.b) obj2;
                oVar10.f350w = (List) obj3;
                return oVar10.invokeSuspend(Unit.f186387a);
            case 10:
                o oVar11 = new o((u1) this.f351x, (Continuation) obj4, 10);
                oVar11.v = (String) obj2;
                oVar11.f350w = (FreelancerPaymentReceipt) obj3;
                return oVar11.invokeSuspend(Unit.f186387a);
            case 11:
                o oVar12 = new o((z1) this.f351x, (Continuation) obj4, 11);
                oVar12.v = (ir6.c) obj2;
                oVar12.f350w = (String) obj3;
                return oVar12.invokeSuspend(Unit.f186387a);
            case 12:
                o oVar13 = new o((w2) this.f351x, (Continuation) obj4, 12);
                oVar13.v = (ds6.j) obj2;
                oVar13.f350w = (ds6.q) obj3;
                return oVar13.invokeSuspend(Unit.f186387a);
            case 13:
                o oVar14 = new o((w2) this.f351x, (Continuation) obj4, 13);
                oVar14.v = (ds6.j) obj2;
                oVar14.f350w = (List) obj3;
                return oVar14.invokeSuspend(Unit.f186387a);
            case 14:
                o oVar15 = new o((c3) this.f351x, (Continuation) obj4, 14);
                oVar15.v = (String) obj2;
                oVar15.f350w = (TaxHubVatSummary) obj3;
                return oVar15.invokeSuspend(Unit.f186387a);
            case 15:
                o oVar16 = new o((k3) this.f351x, (Continuation) obj4, 15);
                oVar16.v = (ds6.j) obj2;
                oVar16.f350w = (ds6.i) obj3;
                return oVar16.invokeSuspend(Unit.f186387a);
            case 16:
                o oVar17 = new o((r3) this.f351x, (Continuation) obj4, 16);
                oVar17.v = (String) obj2;
                oVar17.f350w = (TaxHubVatSummary) obj3;
                return oVar17.invokeSuspend(Unit.f186387a);
            case 17:
                o oVar18 = new o((ayc.i) this.f351x, (Continuation) obj4, 17);
                oVar18.v = (List) obj2;
                oVar18.f350w = (List) obj3;
                return oVar18.invokeSuspend(Unit.f186387a);
            case 18:
                o oVar19 = new o((ayc.i) this.f351x, (Continuation) obj4, 18);
                oVar19.v = (EntityConfigRepository$Params) obj2;
                oVar19.f350w = (gr2.y) obj3;
                return oVar19.invokeSuspend(Unit.f186387a);
            case 19:
                o oVar20 = new o((b4g.f) this.f351x, (Continuation) obj4, 19);
                oVar20.v = (String) obj2;
                oVar20.f350w = (f0) obj3;
                return oVar20.invokeSuspend(Unit.f186387a);
            case 20:
                o oVar21 = new o((b4g.u) this.f351x, (Continuation) obj4, 20);
                oVar21.v = (b4g.s) obj2;
                oVar21.f350w = (u7g.f) obj3;
                return oVar21.invokeSuspend(Unit.f186387a);
            case 21:
                o oVar22 = new o((b6a.e) this.f351x, (Continuation) obj4, 21);
                oVar22.v = (y5a.a) obj2;
                oVar22.f350w = (y5a.d) obj3;
                return oVar22.invokeSuspend(Unit.f186387a);
            case 22:
                o oVar23 = new o((b79.m) this.f351x, (Continuation) obj4, 22);
                oVar23.v = (s69.j) obj2;
                oVar23.f350w = (List) obj3;
                return oVar23.invokeSuspend(Unit.f186387a);
            case 23:
                o oVar24 = new o((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f351x, (Continuation) obj4, 23);
                oVar24.f350w = (Pair) obj2;
                oVar24.v = (Data) obj3;
                return oVar24.invokeSuspend(Unit.f186387a);
            case 24:
                o oVar25 = new o((b9d.n) this.f351x, (Continuation) obj4, 24);
                oVar25.v = (Data) obj2;
                oVar25.f350w = (Data) obj3;
                return oVar25.invokeSuspend(Unit.f186387a);
            case 25:
                o oVar26 = new o((hd.r) this.f351x, (Continuation) obj4, 25);
                oVar26.v = (bc5.a) obj2;
                oVar26.f350w = (CreditCardAutopayConfig) obj3;
                return oVar26.invokeSuspend(Unit.f186387a);
            case 26:
                o oVar27 = new o((hd.r) this.f351x, (Continuation) obj4, 26);
                oVar27.v = (bc5.b) obj2;
                oVar27.f350w = (CreditCardDirectDebitMandate) obj3;
                return oVar27.invokeSuspend(Unit.f186387a);
            case 27:
                o oVar28 = new o((hd.r) this.f351x, (Continuation) obj4, 27);
                oVar28.v = (bc5.c) obj2;
                oVar28.f350w = (CreditCardAutopayPayments) obj3;
                return oVar28.invokeSuspend(Unit.f186387a);
            case 28:
                o oVar29 = new o((bwb.p) this.f351x, (Continuation) obj4, 28);
                oVar29.v = (bwb.a) obj2;
                oVar29.f350w = (UserVoucherDetails) obj3;
                return oVar29.invokeSuspend(Unit.f186387a);
            default:
                o oVar30 = new o((bwb.p) this.f351x, (Continuation) obj4, 29);
                oVar30.v = (bwb.b) obj2;
                oVar30.f350w = (List) obj3;
                return oVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0987  */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v34, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 3264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0e.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
