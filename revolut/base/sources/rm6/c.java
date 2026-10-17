package rm6;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.BillField;
import com.revolut.feature.apm.bills.core.api.model.BillInput;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.BillSearchResponse;
import com.revolut.feature.apm.bills.core.api.model.BillTransferDarfDetails;
import com.revolut.feature.apm.bills.core.api.model.BillTransferDarfType;
import com.revolut.feature.apm.bills.core.api.model.BillTransferData;
import com.revolut.feature.apm.bills.core.api.model.BillTransferDataV2;
import com.revolut.feature.apm.bills.core.api.model.BillTransferPayer;
import com.revolut.feature.apm.bills.core.api.model.BillTransferPayerType;
import com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails;
import com.revolut.feature.apm.bills.core.api.model.BillTransferResultV2;
import com.revolut.feature.apm.bills.core.api.model.BillTransferScheduleData;
import com.revolut.feature.apm.bills.core.api.model.BillWarning;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsService;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsServiceV2;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$InputData;
import gim.i;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import klf.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import om4.k0;
import om4.r0;
import pp1.f;
import qog.d;
import qp1.n;
import r10.r;
import rmb.q;
import rnd.y;
import rnf.l;
import rp1.j;
import rpd.k;
import ru5.z;
import ryj.x;
import skm.e0;
import skm.p0;
import tof.i3;
import txl.e;
import u09.v;
import v6l.b1;
import vkm.j2;
import vkm.z1;
import xo1.f;
import xo1.g;
import xo1.h;
import xo1.m;
import xo1.p;
import yhm.m;
import yhm.o;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f255208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f255209x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255209x = obj2;
        this.f255208w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) this.f255209x, (String) this.f255208w, continuation, 0);
            case 1:
                return new c((q) this.f255209x, (String) this.f255208w, continuation, 1);
            case 2:
                return new c((com.revolut.feature.spending_analytics.impl.ui.budget.a) this.f255209x, (i3) this.f255208w, continuation, 2);
            case 3:
                return new c((rmk.i) this.f255209x, (TermsScope) this.f255208w, continuation, 3);
            case 4:
                c cVar = new c((y) this.f255208w, continuation, 4);
                cVar.f255209x = obj2;
                return cVar;
            case 5:
                return new c((l) this.f255209x, (File) this.f255208w, continuation, 5);
            case 6:
                return new c((com.revolut.feature.user_declarations.shared.flows.tracking.flow.a) this.f255209x, (d) this.f255208w, continuation, 6);
            case 7:
                return new c((j) this.f255209x, (g) this.f255208w, continuation, 7);
            case 8:
                return new c((j) this.f255209x, (BillTransferData) this.f255208w, continuation, 8);
            case 9:
                return new c((j) this.f255209x, (BillTransferDataV2) this.f255208w, continuation, 9);
            case 10:
                return new c((j) this.f255209x, (h) this.f255208w, continuation, 10);
            case 11:
                return new c((j) this.f255209x, (BillTransferScheduleData) this.f255208w, continuation, 11);
            case 12:
                return new c((j) this.f255209x, (xo1.i) this.f255208w, continuation, 12);
            case 13:
                return new c((j) this.f255209x, (xo1.l) this.f255208w, continuation, 13);
            case 14:
                return new c((j) this.f255209x, (m) this.f255208w, continuation, 14);
            case 15:
                return new c((com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) this.f255209x, (String) this.f255208w, continuation, 15);
            case 16:
                return new c((rp4.j) this.f255209x, (String) this.f255208w, continuation, 16);
            case 17:
                return new c((k) this.f255209x, (rpd.b) this.f255208w, continuation, 17);
            case 18:
                c cVar2 = new c((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.f255208w, continuation, 18);
                cVar2.f255209x = obj2;
                return cVar2;
            case 19:
                return new c((rsh.b) this.f255209x, (dsh.l) this.f255208w, continuation, 19);
            case 20:
                return new c((z) this.f255209x, (String) this.f255208w, continuation, 20);
            case 21:
                return new c((rv7.j) this.f255209x, (String) this.f255208w, continuation, 21);
            case 22:
                return new c((rw9.g) this.f255209x, (String) this.f255208w, continuation, 22);
            case 23:
                return new c((rxl.b) this.f255209x, (e) this.f255208w, continuation, 23);
            case 24:
                return new c((py2.c) this.f255209x, (String) this.f255208w, continuation, 24);
            case 25:
                return new c((com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) this.f255209x, (ArrayList) this.f255208w, continuation, 25);
            case 26:
                return new c((x) this.f255208w, continuation, 26);
            case 27:
                return new c((com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) this.f255209x, (rik.e) this.f255208w, continuation, 27);
            case 28:
                return new c((s06.j) this.f255209x, (jf0.c) this.f255208w, continuation, 28);
            default:
                return new c((awa.b) this.f255209x, (zli.b) this.f255208w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objR;
        Object bills;
        ArrayList arrayList;
        String str;
        pp1.a aVar;
        Object objPayBill;
        f fVar;
        String str2;
        String str3;
        Object objPayBill2;
        Object objPostBills;
        Object objSearchBill;
        Object objVerifyBill;
        Object objA;
        LocalDate localDate;
        Object objVerifyBill2;
        Object objA2;
        LocalDate localDate2;
        Object objB;
        jl4.a aVar2;
        Object objX;
        x xVar;
        int i = this.u;
        int i2 = 0;
        int i3 = 2;
        l = null;
        Long l2 = null;
        Object obj3 = this.f255208w;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) this.f255209x;
                    gg6.a aVar5 = aVar4.f72943s;
                    TopUpMethodsContext topUpMethodsContext = aVar4.o.e;
                    this.v = 1;
                    th6.h hVar = aVar5.f143600b;
                    hVar.getClass();
                    qqj.g gVar = new qqj.g(hVar, topUpMethodsContext, (String) obj3, null, 24);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, gVar, this);
                    Object obj4 = objJ;
                    if (objJ != aVar3) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar3) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                q qVar = (q) this.f255209x;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    r rVar = qVar.f255234s;
                    String str4 = (String) obj3;
                    SavingsProductData savingsProductData = ((rmb.a) ((j2) qVar.f255237x.f22677a).getValue()).f255216b;
                    str = savingsProductData != null ? savingsProductData.f86683a.f86617a : 0;
                    this.v = 1;
                    objR = rVar.r(str4, str, this);
                    if (objR == obj5) {
                        return obj5;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objR = obj2;
                }
                if (!((Boolean) objR).booleanValue()) {
                    this.v = 2;
                    if (lg0.b.x1(qVar.f255235t, (String) obj3, null, null, this, 2) == obj5) {
                        return obj5;
                    }
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.spending_analytics.impl.ui.budget.a aVar6 = (com.revolut.feature.spending_analytics.impl.ui.budget.a) this.f255209x;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    smd.y yVar = aVar6.o;
                    this.v = 1;
                    Object objEmit = yVar.f264441a.emit((i3) obj3, this);
                    if (objEmit != aVar7) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(aVar6.f87509p.e(true));
            case 3:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                rmk.i iVar = (rmk.i) this.f255209x;
                oqk.h hVar2 = new oqk.h(iVar, (TermsScope) obj3, (Continuation) str, 28);
                this.v = 1;
                Object objP2 = iVar.p2(this, hVar2);
                return objP2 == aVar8 ? aVar8 : objP2;
            case 4:
                y yVar2 = (y) obj3;
                FlowCollector flowCollector = (FlowCollector) this.f255209x;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    if (yVar2.f255650h.a("ACCOUNT.linked_account")) {
                        t38.e eVarC = y.c(yVar2);
                        this.f255209x = null;
                        this.v = 1;
                        if (eVarC.collect(flowCollector, this) == aVar9) {
                            return aVar9;
                        }
                    } else {
                        Data dataP = zi0.c.P(f0.f322471a, false, null, 3);
                        this.f255209x = null;
                        this.v = 2;
                        if (flowCollector.emit(dataP, this) == aVar9) {
                            return aVar9;
                        }
                    }
                } else {
                    if (i33 != 1 && i33 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                File file = (File) obj3;
                l lVar = (l) this.f255209x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    zk0.b bVar = lVar.f255663a;
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    ((a80.h) bVar).d(absolutePath);
                    enf.c cVar = lVar.f255664b;
                    this.v = 1;
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, new enb.f(cVar, file, str, i5), this);
                    Object obj6 = objJ2;
                    if (objJ2 != aVar10) {
                        obj6 = Unit.f186387a;
                    }
                    if (obj6 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        if (i43 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                z1 z1Var = lVar.f255665c;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (z1Var.emit(unit, this) == aVar10) {
                    return aVar10;
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    com.revolut.feature.user_declarations.shared.flows.tracking.flow.a aVar12 = (com.revolut.feature.user_declarations.shared.flows.tracking.flow.a) this.f255209x;
                    d dVar = (d) obj3;
                    String str5 = ((qog.c) dVar).f248210b;
                    rog.c cVar2 = new rog.c(aVar12, dVar, null);
                    this.v = 1;
                    if (u0.b0(aVar12.X(), str5, cVar2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                Object obj7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV2 = ((j) this.f255209x).f256245b;
                    String strName = ((g) obj3).name();
                    this.v = 1;
                    bills = billsServiceV2.getBills(strName, this);
                    if (bills == obj7) {
                        return obj7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    bills = obj2;
                }
                hp1.e eVar = (hp1.e) bills;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                List bills2 = eVar.getBills();
                ArrayList arrayList2 = new ArrayList(w.t(bills2, 10));
                Iterator it8 = bills2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(hx7.e.p((hp1.b) it8.next()));
                }
                return arrayList2;
            case 8:
                Object obj8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    BillsService billsService = ((j) this.f255209x).f256244a;
                    BillTransferData billTransferData = (BillTransferData) obj3;
                    Intrinsics.checkNotNullParameter(billTransferData, "<this>");
                    String str6 = billTransferData.f61330a;
                    String strName2 = billTransferData.f61331b.name();
                    jo3.a aVarP = mo3.a.p(billTransferData.f61332c);
                    List list = billTransferData.e;
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(gj7.b.S((BillInput) it9.next()));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str7 = billTransferData.f;
                    BillTransferDarfDetails billTransferDarfDetails = billTransferData.i;
                    if (billTransferDarfDetails != null) {
                        Intrinsics.checkNotNullParameter(billTransferDarfDetails, "<this>");
                        Long l3 = billTransferDarfDetails.d;
                        str = "BILL_PAYMENT_IDEMPOTENCY_KEY";
                        Date date = l3 != null ? new Date(l3.longValue()) : null;
                        dj0.d dVar2 = billTransferDarfDetails.i;
                        jo3.a aVarP2 = dVar2 != null ? mo3.a.p(dVar2) : null;
                        dj0.d dVar3 = billTransferDarfDetails.f61329h;
                        jo3.a aVarP3 = dVar3 != null ? mo3.a.p(dVar3) : null;
                        Long l4 = billTransferDarfDetails.e;
                        Date date2 = l4 != null ? new Date(l4.longValue()) : null;
                        BillTransferPayer billTransferPayer = billTransferDarfDetails.f61326b;
                        if (billTransferPayer != null) {
                            Intrinsics.checkNotNullParameter(billTransferPayer, "<this>");
                            String str8 = billTransferPayer.f61341a;
                            BillTransferPayerType billTransferPayerType = billTransferPayer.f61342b;
                            fVar = new f(str8, billTransferPayerType != null ? billTransferPayerType.name() : null, billTransferPayer.f61343c);
                        } else {
                            fVar = null;
                        }
                        Long l5 = billTransferDarfDetails.f61327c;
                        Date date3 = l5 != null ? new Date(l5.longValue()) : null;
                        Long l22 = billTransferDarfDetails.f;
                        String str9 = billTransferDarfDetails.f61328g;
                        BillTransferDarfType billTransferDarfType = billTransferDarfDetails.f61325a;
                        int i92 = billTransferDarfType == null ? -1 : sp1.d.f264875a[billTransferDarfType.ordinal()];
                        if (i92 == 1) {
                            str2 = "N";
                        } else if (i92 != 2) {
                            str3 = null;
                            aVar = new pp1.a(str3, fVar, date3, date, date2, l22, str9, aVarP3, aVarP2);
                        } else {
                            str2 = "S";
                        }
                        str3 = str2;
                        aVar = new pp1.a(str3, fVar, date3, date, date2, l22, str9, aVarP3, aVarP2);
                    } else {
                        str = "BILL_PAYMENT_IDEMPOTENCY_KEY";
                        aVar = null;
                    }
                    ApmPaymentSource apmPaymentSource = billTransferData.d;
                    String str10 = apmPaymentSource != null ? apmPaymentSource.f62207a : null;
                    t02.d dVarB = apmPaymentSource != null ? oc.c.B(apmPaymentSource) : null;
                    String str11 = billTransferData.f61333g;
                    String str12 = billTransferData.f61334h;
                    BillTransferPaymentMethodDetails billTransferPaymentMethodDetails = billTransferData.f61335j;
                    xo1.k kVarR4 = billTransferPaymentMethodDetails != null ? billTransferPaymentMethodDetails.r4() : null;
                    String str13 = billTransferData.k;
                    p pVar = billTransferData.f61336l;
                    String strName3 = pVar != null ? pVar.name() : null;
                    LocalDate localDate3 = billTransferData.f61337m;
                    pp1.b bVar2 = new pp1.b(str6, strName2, aVarP, str10, dVarB, arrayList, str7, aVar, str11, str12, kVarR4, str13, strName3, localDate3 != null ? localDate3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null);
                    this.v = 1;
                    objPayBill = billsService.payBill(bVar2, new wj0.b(str), this);
                    if (objPayBill == obj8) {
                        return obj8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objPayBill = obj2;
                }
                pp1.d dVar4 = (pp1.d) objPayBill;
                Intrinsics.checkNotNullParameter(dVar4, "<this>");
                return dVar4.getTransactionId() != null ? new xo1.e(dVar4.getTransactionId(), dVar4.getCounterpartyId()) : new f.a(dVar4.getStandingOrderId());
            case 9:
                Object obj9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV22 = ((j) this.f255209x).f256245b;
                    BillTransferDataV2 billTransferDataV2 = (BillTransferDataV2) obj3;
                    Intrinsics.checkNotNullParameter(billTransferDataV2, "<this>");
                    String str14 = billTransferDataV2.f61338a;
                    String str15 = billTransferDataV2.f61339b;
                    String str16 = billTransferDataV2.e;
                    List list3 = billTransferDataV2.d;
                    ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        arrayList4.add(sp1.c.b((BillInputV2) it10.next()));
                    }
                    jo3.a aVarP4 = mo3.a.p(billTransferDataV2.f61340c);
                    LocalDate localDate4 = billTransferDataV2.f;
                    pp1.c cVar3 = new pp1.c(str14, str15, str16, localDate4 != null ? localDate4.toString() : null, arrayList4, aVarP4);
                    this.v = 1;
                    objPayBill2 = billsServiceV22.payBill(cVar3, new wj0.b("BILL_PAYMENT_IDEMPOTENCY_KEY"), this);
                    if (objPayBill2 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objPayBill2 = obj2;
                }
                pp1.e eVar2 = (pp1.e) objPayBill2;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                return new BillTransferResultV2(eVar2.getPaymentIntentId());
            case 10:
                Object obj10 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV23 = ((j) this.f255209x).f256245b;
                    hp1.f fVarF = hb9.b.F((h) obj3);
                    this.v = 1;
                    objPostBills = billsServiceV23.postBills(fVarF, new wj0.b("BILL_PAYMENT_IDEMPOTENCY_KEY"), this);
                    if (objPostBills == obj10) {
                        return obj10;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objPostBills = obj2;
                }
                return hx7.e.p((hp1.b) objPostBills);
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    BillsService billsService2 = ((j) this.f255209x).f256244a;
                    BillTransferScheduleData billTransferScheduleData = (BillTransferScheduleData) obj3;
                    Intrinsics.checkNotNullParameter(billTransferScheduleData, "<this>");
                    pp1.g gVar2 = new pp1.g(billTransferScheduleData.f61345a, billTransferScheduleData.f61346b.name(), billTransferScheduleData.f61347c, mo3.a.p(billTransferScheduleData.d), billTransferScheduleData.f, billTransferScheduleData.e, billTransferScheduleData.f61348g);
                    this.v = 1;
                    if (billsService2.scheduleBill(gVar2, new wj0.b("BILL_PAYMENT_IDEMPOTENCY_KEY"), this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                Object obj11 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    BillsService billsService3 = ((j) this.f255209x).f256244a;
                    xo1.i iVar2 = (xo1.i) obj3;
                    Intrinsics.checkNotNullParameter(iVar2, "<this>");
                    String strName4 = iVar2.f307574a.name();
                    ArrayList arrayList5 = iVar2.f307575b;
                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                    Iterator it11 = arrayList5.iterator();
                    while (it11.hasNext()) {
                        arrayList6.add(gj7.b.S((BillInput) it11.next()));
                    }
                    jp1.b bVar3 = new jp1.b(strName4, arrayList6);
                    this.v = 1;
                    objSearchBill = billsService3.searchBill(bVar3, new wj0.b("BILL_PAYMENT_IDEMPOTENCY_KEY"), this);
                    if (objSearchBill == obj11) {
                        return obj11;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objSearchBill = obj2;
                }
                jp1.c cVar4 = (jp1.c) objSearchBill;
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                dj0.d dVarO = mo3.a.o(cVar4.getAmount());
                jo3.a aVarD = cVar4.getMin();
                dj0.d dVarO2 = aVarD != null ? mo3.a.o(aVarD) : null;
                jo3.a aVarC = cVar4.getMax();
                dj0.d dVarO3 = aVarC != null ? mo3.a.o(aVarC) : null;
                boolean zB = cVar4.getAmountEditable();
                gp1.e eVarE = cVar4.getWarning();
                return new BillSearchResponse(dVarO, dVarO2, dVarO3, zB, eVarE != null ? hx7.b.z(eVarE) : null);
            case 13:
                Object obj12 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    BillsService billsService4 = ((j) this.f255209x).f256244a;
                    xo1.l lVar2 = (xo1.l) obj3;
                    Intrinsics.checkNotNullParameter(lVar2, "<this>");
                    String strName5 = lVar2.f307576a.name();
                    String strName6 = lVar2.f307577b.name();
                    List list4 = lVar2.f307578c;
                    ArrayList arrayList7 = new ArrayList(w.t(list4, 10));
                    Iterator it12 = list4.iterator();
                    while (it12.hasNext()) {
                        arrayList7.add(gj7.b.S((BillInput) it12.next()));
                    }
                    jo3.a aVarP5 = mo3.a.p(lVar2.d);
                    ApmPaymentSource apmPaymentSource2 = lVar2.e;
                    String str17 = apmPaymentSource2.f62207a;
                    t02.d dVarB2 = oc.c.B(apmPaymentSource2);
                    BillTransferPaymentMethodDetails billTransferPaymentMethodDetails2 = lVar2.f;
                    qp1.l lVar3 = new qp1.l(strName5, strName6, arrayList7, aVarP5, str17, dVarB2, billTransferPaymentMethodDetails2 != null ? billTransferPaymentMethodDetails2.r4() : null);
                    this.v = 1;
                    objVerifyBill = billsService4.verifyBill(lVar3, new wj0.b("BILL_PAYMENT_IDEMPOTENCY_KEY"), this);
                    if (objVerifyBill == obj12) {
                        return obj12;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objVerifyBill = obj2;
                }
                n nVar = (n) objVerifyBill;
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                dj0.d dVarO4 = mo3.a.o(nVar.getAmount());
                List<qp1.a> listC = nVar.getFields();
                ArrayList arrayList8 = new ArrayList(w.t(listC, 10));
                for (qp1.a aVar14 : listC) {
                    Intrinsics.checkNotNullParameter(aVar14, "<this>");
                    arrayList8.add(new BillField(aVar14.getLabel(), aVar14.getValue()));
                }
                if (nVar.getEstimatedArrival() != null) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = LocalDate.parse(nVar.getEstimatedArrival());
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = o.a(th10);
                    }
                    if (yhm.m.a(objA) != null) {
                        objA = null;
                    }
                    localDate = (LocalDate) objA;
                    break;
                } else {
                    localDate = null;
                }
                gp1.e eVarE2 = nVar.getWarning();
                BillWarning billWarningZ = eVarE2 != null ? hx7.b.z(eVarE2) : null;
                mp1.b bVarD = nVar.getServiceProvider();
                return new xo1.n(dVarO4, arrayList8, localDate, billWarningZ, bVarD != null ? hx7.a.t(bVarD) : null);
            case 14:
                Object obj13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV24 = ((j) this.f255209x).f256245b;
                    xo1.m mVar = (xo1.m) obj3;
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                    String strName7 = mVar.f307579a.name();
                    List list5 = mVar.f307580b;
                    ArrayList arrayList9 = new ArrayList(w.t(list5, 10));
                    Iterator it13 = list5.iterator();
                    while (it13.hasNext()) {
                        arrayList9.add(sp1.c.b((BillInputV2) it13.next()));
                    }
                    jo3.a aVarP6 = mo3.a.p(mVar.f307581c);
                    String str18 = mVar.d;
                    t02.d dVar5 = str18 != null ? new t02.d(str18, t02.c.POCKET.a()) : null;
                    LocalDate localDate5 = mVar.e;
                    qp1.m mVar2 = new qp1.m(strName7, arrayList9, aVarP6, str18, dVar5, localDate5 != null ? localDate5.toString() : null);
                    this.v = 1;
                    objVerifyBill2 = billsServiceV24.verifyBill(mVar2, new wj0.b("BILL_PAYMENT_IDEMPOTENCY_KEY"), this);
                    if (objVerifyBill2 == obj13) {
                        return obj13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objVerifyBill2 = obj2;
                }
                qp1.o oVar = (qp1.o) objVerifyBill2;
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                dj0.d dVarO5 = mo3.a.o(oVar.getAmount());
                List listB = oVar.getFields();
                ArrayList arrayList10 = new ArrayList(w.t(listB, 10));
                Iterator it14 = listB.iterator();
                while (it14.hasNext()) {
                    arrayList10.add(sp1.f.a((qp1.b) it14.next()));
                }
                if (oVar.getScheduledDate() != null) {
                    try {
                        m.Companion companion3 = yhm.m.INSTANCE;
                        objA2 = LocalDate.parse(oVar.getScheduledDate());
                    } catch (Throwable th11) {
                        m.Companion companion4 = yhm.m.INSTANCE;
                        objA2 = o.a(th11);
                    }
                    if (yhm.m.a(objA2) != null) {
                        objA2 = null;
                    }
                    localDate2 = (LocalDate) objA2;
                    break;
                } else {
                    localDate2 = null;
                }
                gp1.e eVarE3 = oVar.getWarning();
                return new xo1.o(dVarO5, arrayList10, localDate2, eVarE3 != null ? hx7.b.z(eVarE3) : null, oVar.getFooter());
            case 15:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) this.f255209x).f64049p, (String) obj3, null, null, this, 6);
                return objX1 == aVar15 ? aVar15 : objX1;
            case 16:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                rp4.j jVar = (rp4.j) this.f255209x;
                rp4.i iVar3 = new rp4.i(jVar, (String) obj3, str, i5);
                this.v = 1;
                Object objB2 = pu7.a.B(jVar.k, "open-pdf", iVar3, this);
                return objB2 == aVar16 ? aVar16 : objB2;
            case 17:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    k kVar = (k) this.f255209x;
                    r25.a aVar18 = new r25.a(kVar, (rpd.b) obj3, str, 14);
                    this.v = 1;
                    if (kVar.p2(this, aVar18) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar5 = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) obj3;
                Data data = (Data) this.f255209x;
                Object obj14 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    k0 k0Var = cVar5.f69188t;
                    String str19 = cVar5.o.f69172a;
                    yw4.f fVar2 = yw4.f.CREDIT_LIMIT_CAP;
                    this.f255209x = data;
                    this.v = 1;
                    objB = k0Var.b(str19, fVar2, this);
                    if (objB == obj14) {
                        return obj14;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                rq4.i iVar4 = (rq4.i) data.getContent();
                if (iVar4 != null && (aVar2 = iVar4.f256462a) != null) {
                    l2 = new Long(aVar2.f175590a.f115082a);
                }
                cVar5.H2(cVar5.C, new pud.b(data, l2, zBooleanValue, 9));
                return Unit.f186387a;
            case 19:
                rsh.b bVar4 = (rsh.b) this.f255209x;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                try {
                    if (i108 == 0) {
                        o.b(obj2);
                        ash.i iVar5 = bVar4.f257078t;
                        WidgetCustomisationFlowContact$InputData widgetCustomisationFlowContact$InputData = bVar4.v;
                        WidgetContext widgetContext = widgetCustomisationFlowContact$InputData.f96371b;
                        String str20 = widgetCustomisationFlowContact$InputData.f96372c;
                        dsh.e eVar3 = ((dsh.l) obj3).f117329a;
                        this.v = 1;
                        Object objH = ((gsh.n) ((ish.z) iVar5).c(widgetContext)).h(str20, eVar3, this);
                        if (objH != aVar19) {
                            objH = Unit.f186387a;
                        }
                        if (objH == aVar19) {
                            return aVar19;
                        }
                    } else {
                        if (i108 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                bVar4.I2();
                return Unit.f186387a;
            case 20:
                String str21 = (String) obj3;
                z zVar = (z) this.f255209x;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (z.y2(zVar, str21, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i109 != 1) {
                        if (i109 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                Object objJ3 = e0.J(p0.f264002b, new ru5.o(zVar, str21, null), this);
                Object obj15 = objJ3;
                if (objJ3 != aVar20) {
                    obj15 = Unit.f186387a;
                }
                if (obj15 == aVar20) {
                    return aVar20;
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                lg0.a aVar22 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX12 = lg0.b.x1(((rv7.j) this.f255209x).f257729p, (String) obj3, aVar22, null, this, 4);
                return objX12 == aVar21 ? aVar21 : objX12;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objA3 = ((rw9.g) this.f255209x).f257861b.a(this, (String) obj3, true);
                return objA3 == aVar23 ? aVar23 : objA3;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    wxl.a aVar25 = ((rxl.b) this.f255209x).f258191c;
                    String strB = ((lie.a) ((e) obj3)).b();
                    this.v = 1;
                    if (aVar25.b(strB, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l93.f fVar3 = ((py2.c) this.f255209x).d;
                String str22 = (String) obj3;
                Intrinsics.h(str22);
                this.v = 1;
                Object objV = ((b1) ((ha3.x) fVar3).f.f319829a).v(str22, this);
                return objV == aVar26 ? aVar26 : objV;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar28 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) this.f255209x;
                ryi.j jVar2 = new ryi.j(aVar28, (ArrayList) obj3, str, i5);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar28.k, "refund_entries", jVar2, this);
                return objB3 == aVar27 ? aVar27 : objB3;
            case 26:
                x xVar2 = (x) obj3;
                Object obj16 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    ryj.w wVar = new ryj.w(xVar2.f258423r.f139374a.d.c(Unit.f186387a, false), i2);
                    this.f255209x = xVar2;
                    this.v = 1;
                    objX = vkm.q.x(wVar, this);
                    if (objX == obj16) {
                        return obj16;
                    }
                    xVar = xVar2;
                } else {
                    if (i115 != 1) {
                        if (i115 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    x xVar3 = (x) this.f255209x;
                    o.b(obj2);
                    xVar = xVar3;
                    objX = obj2;
                }
                Iterable iterable = (Iterable) objX;
                ArrayList arrayList11 = new ArrayList(w.t(iterable, 10));
                Iterator it15 = iterable.iterator();
                while (it15.hasNext()) {
                    arrayList11.add(((u09.w) it15.next()).f276156a);
                }
                xVar.getClass();
                List listC2 = u.c(ryj.n.f258404a);
                ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                Iterator it16 = arrayList11.iterator();
                while (it16.hasNext()) {
                    arrayList12.add(new ryj.o((v) it16.next()));
                }
                wkm.l lVarQ = vkm.q.Q(new vkm.y(new w1(i3, 20, str), xVar2.f258424s), new r0(str, d0.E0(arrayList12, listC2), xVar2, 26));
                rt4.o oVar2 = new rt4.o(xVar2, str, 15);
                this.f255209x = null;
                this.v = 2;
                if (vkm.q.o(lVarQ, oVar2, this) == obj16) {
                    return obj16;
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar30 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) this.f255209x;
                    rik.e eVar4 = new rik.e((rik.e) obj3, str, 11);
                    this.v = 1;
                    if (aVar30.p2(this, eVar4) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r10.a aVar32 = ((s06.j) this.f255209x).i;
                String str23 = ((jf0.c) obj3).f173627a;
                this.v = 1;
                Object objE = aVar32.E(str23, this);
                return objE == aVar31 ? aVar31 : objE;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objA4 = ((awa.b) this.f255209x).a((zli.b) obj3, this);
                return objA4 == aVar33 ? aVar33 : objA4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255208w = obj2;
    }
}
