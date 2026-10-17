package fpk;

import androidx.sqlite.SQLiteConnection;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreenContract$StatementPagerItem;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.api.model.MandateConstraints;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.payments.FreelancerOrderPaymentReceipt;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoiceDateOption;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentSchedule;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.FreelancerEmailFlowContract$Step;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.repository.ReadOnlyDialog;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import efm.i;
import f0d.m;
import fr8.r;
import ft4.i0;
import ft4.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kx7.y0;
import mp.p;
import nze.e;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import pfm.z;
import qfm.g0;
import qfm.j1;
import qfm.n;
import qfm.x;
import te0.w;
import tof.a3;
import tof.hc;
import tof.q6;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;
import vkm.j2;
import w4l.j;
import w4l.k;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f137117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f137118c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f137116a = i;
        this.f137118c = obj2;
        this.f137117b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v26, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterable iterable;
        dj0.d dVar;
        l lVarA;
        FreelancerPaymentReceipt freelancerPaymentReceipt;
        String str;
        Map mapQ;
        ?? pagerItems;
        List list;
        String str2;
        ReadOnlyDialog.Button button;
        FlowStep saleDatePicker;
        int i = this.f137116a;
        int i2 = 23;
        int i3 = 6;
        int i5 = 2;
        int i6 = 1;
        int i21 = 0;
        ?? r112 = 0;
        fyh.b bVar = null;
        nze.a aVar = null;
        sr6.b bVar2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = this.f137117b;
        Object obj6 = this.f137118c;
        switch (i) {
            case 0:
                ((c) obj6).f137120b.insert((SQLiteConnection) obj2, (Iterable) obj5);
                return null;
            case 1:
                ((e) obj6).f137125b.insert((SQLiteConnection) obj2, (Iterable) obj5);
                return null;
            case 2:
                q6 q6Var = (q6) obj6;
                fqj.h hVar = (fqj.h) obj5;
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (!isEnabled.booleanValue()) {
                    int i22 = i.f125385a;
                    return g0.f245413b;
                }
                n nVar = new n(new j1(m70.a.g(q6Var instanceof hc ? w.h(new Data(((hc) q6Var).f272790a, null, false, 6, null)) : nim.a.w(hVar.f137274c.X(AccountId.Personal.f51414a, j.f294644c), new fo9.a(14)), null, new fq7.j(i6), 1).switchMapSingle(new fjj.b(new fqj.b(hVar, i21), 27)).firstOrError().p(new fjj.b(new fqj.b(hVar, i6), 28)).v(), new fjj.b(new fo9.a(15), 22), i5), new fjj.b(new fo9.a(11), i2), 2);
                m mVar = new m(hVar, q6Var, 13);
                dfm.c cVar = mfm.f.d;
                return new x(nVar, cVar, cVar, mfm.f.f205043c, mVar);
            case 3:
                psg.a walletProfile = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
                return nim.a.v(hj8.a.a(((r) obj6).f137435r, walletProfile.f239485b, (k) obj5), new b88.j(walletProfile, 1));
            case 4:
                r rVar = (r) obj6;
                fo3.c cVar2 = (fo3.c) obj5;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it8 = pockets.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        io3.d dVar2 = (io3.d) next;
                        if (Intrinsics.f(dVar2.f163147c, cVar2.d.f306286a) && dVar2.e == io3.l.CURRENT) {
                            r112 = next;
                        }
                    }
                }
                io3.d dVar3 = (io3.d) r112;
                if (dVar3 != null) {
                    return dVar3;
                }
                throw new NoSuchElementException(j6.a.q("Could not find pocket with type current in wallet with id = ", rVar.f137433p.f77455a));
            case 5:
                p pVar = (p) obj6;
                xi0.b bVar3 = (xi0.b) obj5;
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                ArrayList<io3.d> arrayList = new ArrayList();
                for (Object obj7 : pockets2) {
                    if (!Intrinsics.f(((io3.d) obj7).f163147c, bVar3.f306286a)) {
                        arrayList.add(obj7);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (io3.d dVar4 : arrayList) {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str3 = dVar4.f163147c;
                    aVar2.getClass();
                    v1.c.A(arrayList2, xi0.a.a(str3), bVar3);
                }
                return ((ppk.f) pVar.d).c(arrayList2, n9l.b.SEC_3);
            case 6:
                ql4.e eVar = (ql4.e) obj5;
                whf.p pVar2 = (whf.p) obj2;
                y yVar = ((i0) obj6).v;
                l lVar = (l) ((ft4.m) ((j2) yVar.f22677a).getValue()).f137920a.getContent();
                ft4.k kVar = lVar != null ? lVar.f137917a : null;
                ft4.i iVar = kVar instanceof ft4.i ? (ft4.i) kVar : null;
                if (iVar == null || (iterable = iVar.f137909c) == null) {
                    iterable = h0.f322473a;
                }
                l lVar2 = (l) ((ft4.m) ((j2) yVar.f22677a).getValue()).f137920a.getContent();
                ft4.k kVar2 = lVar2 != null ? lVar2.f137917a : null;
                ft4.i iVar2 = kVar2 instanceof ft4.i ? (ft4.i) kVar2 : null;
                if (iVar2 == null || (dVar = iVar2.d) == null) {
                    dVar = new dj0.d(0L, eVar.f247115a.f115083b);
                }
                dj0.d dVar5 = dVar;
                Iterable iterable2 = iterable;
                dj0.d dVar6 = eVar.f247115a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : iterable2) {
                    if (eVar.f247117c.contains(((a3) obj8).f272581b)) {
                        arrayList3.add(obj8);
                    }
                }
                return new ft4.i(pVar2, dVar6, d0.i1(arrayList3), dVar5, eVar.d);
            case 7:
                ft4.h hVar2 = (ft4.h) obj6;
                ft4.i iVar3 = (ft4.i) obj5;
                ft4.m mVar2 = (ft4.m) obj2;
                Object content = mVar2.f137920a.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                l lVar3 = (l) content;
                int i32 = ft4.g0.f137905a[hVar2.ordinal()];
                if (i32 == 1) {
                    lVarA = l.a(lVar3, iVar3, null, 2);
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarA = l.a(lVar3, null, iVar3, 1);
                }
                return ft4.m.a(mVar2, Data.copy$default(mVar2.f137920a, lVarA, null, false, 6, null), null, null, 6);
            case 8:
                FreelancerAcquiringOrderDetailsScreenContract$ModalStep.RefundPaymentSelection refundPaymentSelection = (FreelancerAcquiringOrderDetailsScreenContract$ModalStep.RefundPaymentSelection) obj6;
                com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar3 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) obj5;
                su6.e result = (su6.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it9 = refundPaymentSelection.f73672a.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (Intrinsics.f(((AcquiringOrderPayment) next2).f73355a, result.f265680a)) {
                            obj4 = next2;
                        }
                    }
                }
                AcquiringOrderPayment acquiringOrderPayment = (AcquiringOrderPayment) obj4;
                if (acquiringOrderPayment != null) {
                    aVar3.C1(new FreelancerBizFeatureConfig.OrderPaymentRefund(acquiringOrderPayment, pyd.c.H(acquiringOrderPayment.f73358g, acquiringOrderPayment.i)));
                }
                return Unit.f186387a;
            case 9:
                FreelancerAcquiringOrderDetailsScreenContract$ModalStep.ReceiptPaymentSelection receiptPaymentSelection = (FreelancerAcquiringOrderDetailsScreenContract$ModalStep.ReceiptPaymentSelection) obj6;
                com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar4 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) obj5;
                su6.e result2 = (su6.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it10 = receiptPaymentSelection.f73671a.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next3 = it10.next();
                        if (Intrinsics.f(((FreelancerOrderPaymentReceipt) next3).f73459a.f73355a, result2.f265680a)) {
                            obj3 = next3;
                        }
                    }
                }
                FreelancerOrderPaymentReceipt freelancerOrderPaymentReceipt = (FreelancerOrderPaymentReceipt) obj3;
                if (freelancerOrderPaymentReceipt != null && (freelancerPaymentReceipt = freelancerOrderPaymentReceipt.f73460b) != null && (str = freelancerPaymentReceipt.f73461a) != null) {
                    tqi.g gVar = aVar4.f73677t;
                    m70.a.c(t0.f186434a);
                    aVar4.C1(u0.b(gVar.f(8378, "", str)));
                }
                return Unit.f186387a;
            case 10:
                Integer num = (Integer) obj6;
                fuk.b bVar4 = (fuk.b) obj5;
                fuk.h update = (fuk.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Map mapG = update.f138240b;
                if (mapG == null) {
                    mapG = r0.g();
                }
                if (num == null || (mapQ = r0.q(mapG, new Pair(bVar4, num))) == null) {
                    mapQ = mapG;
                }
                return fuk.h.a(update, null, mapQ, null, null, 13);
            case 11:
                fuk.h hVar3 = (fuk.h) obj2;
                return fuk.h.a(hVar3, r0.q(hVar3.f138239a, new Pair((fuk.b) obj6, (Data) obj5)), null, null, null, 14);
            case 12:
                Data content2 = (Data) obj6;
                com.revolut.feature.credit.card.impl.ui.statement.details.a aVar5 = (com.revolut.feature.credit.card.impl.ui.statement.details.a) obj5;
                fv4.f fVar = (fv4.f) obj2;
                fv4.e eVar2 = (fv4.e) content2.getContent();
                if (eVar2 == null || (list = eVar2.f138323a) == null) {
                    pagerItems = f0.f322471a;
                } else {
                    List list2 = list;
                    pagerItems = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it11 = list2.iterator();
                    while (it11.hasNext()) {
                        pagerItems.add(new CreditCardStatementDetailsScreenContract$StatementPagerItem(((vl4.i) it11.next()).f290264b));
                    }
                }
                String string = fVar.f138326b;
                if (string == null) {
                    string = aVar5.o.f69658b.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                }
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                Intrinsics.checkNotNullParameter(content2, "content");
                return new fv4.f(content2, string, pagerItems);
            case 13:
                AcquiringPaymentsQuery acquiringPaymentsQuery = (AcquiringPaymentsQuery) obj6;
                Boolean bool = (Boolean) obj5;
                fv6.g update2 = (fv6.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return fv6.g.a(update2, null, acquiringPaymentsQuery, null, bool != null ? bool.booleanValue() : update2.d, 5);
            case 14:
                TransactionsLimitsScreenContract$Step transactionsLimitsScreenContract$Step = (TransactionsLimitsScreenContract$Step) obj6;
                com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar6 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) obj5;
                eii.k result3 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof eii.g) {
                    OutboundTransactionLimit outboundTransactionLimit = ((TransactionsLimitsScreenContract$Step.ReadOnlyLimitDialog) transactionsLimitsScreenContract$Step).f85743a;
                    ReadOnlyDialog readOnlyDialog = outboundTransactionLimit.f85487s;
                    if (readOnlyDialog == null || (button = readOnlyDialog.d) == null || (str2 = button.f85498b) == null) {
                        str2 = outboundTransactionLimit.u;
                    }
                    if (str2 != null) {
                        aVar6.n2(new fjd.g0(aVar6, str2, r112, i2), new whi.b(i3));
                    }
                }
                return Unit.f186387a;
            case 15:
                Data combinedLimits = (Data) obj6;
                ((fwc.j) obj2).getClass();
                Intrinsics.checkNotNullParameter(combinedLimits, "combinedLimits");
                return new fwc.j(combinedLimits, (TransactionsLimitsScreenContract$LimitFlowType) obj5);
            case 16:
                String petId = (String) obj5;
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "compressedFile");
                y0 y0Var = (y0) ((fx7.f) obj6).f138760a;
                y0Var.getClass();
                Intrinsics.checkNotNullParameter(petId, "petId");
                Intrinsics.checkNotNullParameter(file, "file");
                e1 e1Var = MultipartBody$Part.Companion;
                String name = file.getName();
                p1 p1Var = RequestBody.Companion;
                b1.Companion.getClass();
                b1 b1VarB = a1.b("image/*");
                p1Var.getClass();
                k1 k1VarA = p1.a(file, b1VarB);
                e1Var.getClass();
                pfm.a aVarE = y0Var.f190501a.uploadPetPicture(petId, e1.c("photo", name, k1VarA)).e(y0Var.a().g(Unit.f186387a, false));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return w.g0(aVarE);
            case 17:
                return fy5.a.a((fy5.a) obj2, (qta.f) obj6, null, null, (Data) obj5, 6);
            case 18:
                InvoiceDateOption.DateOffset dateOffset = (InvoiceDateOption.DateOffset) obj6;
                fy6.p pVar3 = (fy6.p) obj5;
                fy6.i update3 = (fy6.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                InvoicePaymentSchedule invoicePaymentSchedule = update3.f138938b;
                InvoiceDateOption invoiceDateOption = pVar3 instanceof InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker ? dateOffset : null;
                if (invoiceDateOption == null) {
                    invoiceDateOption = invoicePaymentSchedule.f73896b;
                }
                InvoiceDateOption invoiceDateOption2 = invoiceDateOption;
                InvoiceDateOption invoiceDateOption3 = pVar3 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker ? dateOffset : null;
                if (invoiceDateOption3 == null) {
                    invoiceDateOption3 = invoicePaymentSchedule.f73897c;
                }
                return fy6.i.a(update3, null, InvoicePaymentSchedule.a(invoicePaymentSchedule, null, invoiceDateOption2, invoiceDateOption3, null, 25), null, null, 13);
            case 19:
                com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar3 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) obj6;
                fy6.p pVar4 = (fy6.p) obj5;
                mw6.e result4 = (mw6.e) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof mw6.c) {
                    String str4 = ((mw6.c) result4).f209401a;
                    if (Intrinsics.f(str4, "ITEM_ID_CUSTOM")) {
                        com.revolut.kompot.navigable.vc.modal.a aVar7 = cVar3.u;
                        if (pVar4 instanceof InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker) {
                            saleDatePicker = new InvoicePaymentScheduleScreenContract$Step.DueDatePicker(((InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker) pVar4).f73905a);
                        } else {
                            if (!(pVar4 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            saleDatePicker = new InvoicePaymentScheduleScreenContract$Step.SaleDatePicker(((InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker) pVar4).f73912a);
                        }
                        oki.h.v2(aVar7, saleDatePicker, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        sr6.b[] bVarArrValues = sr6.b.values();
                        int length = bVarArrValues.length;
                        while (true) {
                            if (i21 < length) {
                                sr6.b bVar5 = bVarArrValues[i21];
                                if (a0.z(bVar5.name(), str4, true)) {
                                    bVar2 = bVar5;
                                } else {
                                    i21++;
                                }
                            }
                        }
                        if (bVar2 == null) {
                            return Unit.f186387a;
                        }
                        cVar3.H2(cVar3.v, new b(new InvoiceDateOption.DateOffset(bVar2), pVar4, 18));
                    }
                }
                return Unit.f186387a;
            case 20:
                nze.b bVar6 = (nze.b) obj5;
                String institutionId = (String) obj2;
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                oe6.a aVar8 = (oe6.a) ((p) obj6).f207710c;
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                return ((xg6.j) aVar8).f(uuidRandomUUID, institutionId, null, null, bVar6.f221024a, bVar6.f221026c);
            case 21:
                nze.c cVar4 = (nze.c) obj6;
                fye.b bVar7 = (fye.b) obj5;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Mandate mandate = (Mandate) pair.f186385a;
                e7l.f fVar2 = (e7l.f) pair.f186386b;
                dj0.d amount = cVar4.f221027a;
                String str5 = cVar4.f221028b;
                Intrinsics.h(mandate);
                MandateConstraints mandateConstraints = mandate.f72226c;
                boolean zF = amount.f(mandateConstraints.f72227a);
                boolean zF2 = amount.f(pyd.c.H(mandateConstraints.f72228b, mandateConstraints.f72229c));
                if (zF && zF2) {
                    aVar = nze.a.BOTH_LIMITS;
                } else if (zF) {
                    aVar = nze.a.TRANSFER_LIMIT;
                } else if (zF2) {
                    aVar = nze.a.MONTHLY_LIMIT;
                }
                if (aVar == null) {
                    wsg.n nVar2 = bVar7.f138984c;
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    z zVarD = nVar2.o0(amount.f115082a, amount.f115083b.f306286a).e(bVar7.f138982a.f(amount, str5, false)).D(new nze.f(str5));
                    Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                    return zVarD;
                }
                boolean z = mandate.e;
                e.a aVar9 = e.a.f221030a;
                if (!z) {
                    ufm.b bVarM = efm.d0.m(aVar9);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (amount.e(pyd.c.k(fVar2.O0, 2L))) {
                    ufm.b bVarM2 = efm.d0.m(aVar9);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                ufm.b bVarM3 = efm.d0.m(new nze.d(aVar));
                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                return bVarM3;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return ((fyg.g) obj6).a((xi0.b) obj5);
            case 23:
                fyh.a update4 = (fyh.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                fyh.d dVarA = fyh.d.a((fyh.d) ((fyh.f) obj6), (myh.j) obj5, null, 6);
                update4.getClass();
                return new fyh.a(dVarA);
            case 24:
                cyh.c cVar5 = (cyh.c) obj5;
                fyh.a aVar10 = (fyh.a) obj2;
                CryptoOrderDetailsInputData cryptoOrderDetailsInputData = ((fyh.n) obj6).o;
                if (cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.RecurringInputData) {
                    CryptoOrderDetailsInputData.RecurringInputData recurringInputData = (CryptoOrderDetailsInputData.RecurringInputData) cryptoOrderDetailsInputData;
                    bVar = new fyh.b(recurringInputData.f96658a, recurringInputData.f96659b, recurringInputData.f96660c, recurringInputData.d, recurringInputData.e, recurringInputData.f, cVar5);
                }
                aVar10.getClass();
                return new fyh.a(bVar);
            case 25:
                fz4.g updateState = (fz4.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return fz4.g.a(updateState, r0.q(updateState.f139091a, new Pair((String) obj6, (fz4.n) obj5)), false, 2);
            case 26:
                fzd.j update5 = (fzd.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return fzd.j.a(update5, zi0.c.P(CustomisationParameters.copy$default((CustomisationParameters) obj6, null, null, null, null, (List) obj5, 15, null), false, null, 3), null, 2);
            case 27:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar8 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b) obj6;
                yki.l lVar4 = (yki.l) obj5;
                com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a result5 = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof dze.f) {
                    bVar8.C2(ste.h.f265563a);
                } else if (result5 instanceof dze.e) {
                    bVar8.C2(new ste.g(((dze.e) result5).f121330a));
                } else if (Intrinsics.f(result5, a.C0560a.f90958a)) {
                    oki.h.D2(lVar4);
                } else {
                    if (!Intrinsics.f(result5, a.b.f90959a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot return IdealTopupFinished in this flow");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 28:
                g03.a update6 = (g03.a) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return g03.a.a(update6, null, (h93.f0) obj6, null, new Data((ld6.f) obj5, null, false, 6, null), null, 21);
            default:
                com.revolut.feature.freelancer.impl.ui.profile.email_flow.a aVar11 = (com.revolut.feature.freelancer.impl.ui.profile.email_flow.a) obj6;
                yki.l lVar5 = (yki.l) obj5;
                j07.f output = (j07.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof j07.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar11, lVar5, new FreelancerEmailFlowContract$Step.CheckEmail(((j07.e) output).f169983a), false, null, false, 12);
                return Unit.f186387a;
        }
    }
}
