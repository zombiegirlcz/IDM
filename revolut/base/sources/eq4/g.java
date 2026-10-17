package eq4;

import a31.w;
import ab4.q;
import ahd.y;
import bw0.k;
import bw0.m;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlowContract$FlowState;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationConfig;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$State;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.payments.FreelancerOrderPaymentReceipt;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import do3.n;
import dv5.p;
import eq5.m1;
import eq5.r;
import eql.j;
import esj.f0;
import esj.o;
import esj.x;
import et6.e2;
import et6.f2;
import et6.h1;
import et6.i2;
import et6.l2;
import et6.p1;
import et6.z;
import ip0.oj0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import lr6.s;
import mx0.f3;
import mx0.h3;
import od0.i;
import vkm.v1;
import zh9.u0;
import zhm.a0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128245b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f128244a = i;
        this.f128245b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, java.lang.Object[], koi.j[]] */
    /* JADX WARN: Type inference failed for: r3v24, types: [b9k.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, w4l.i, w4l.k] */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowI;
        Flow flowI2;
        String orderId;
        String str;
        s sVar;
        List listC;
        int i = this.f128244a;
        int i2 = 26;
        i iVar = i.f224256b;
        ?? r62 = w4l.i.f294643c;
        w4l.h hVar = w4l.h.f294642c;
        int i3 = 1;
        int i5 = 0;
        Object obj3 = this.f128245b;
        switch (i) {
            case 0:
                return new CreditCardWithdrawalFlowContract$State.Content((CreditCardCancellationConfig) obj3);
            case 1:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, false, null, null, null, null, (CryptoAddressCounterparty) obj3, 786431);
            case 2:
                return r.a((r) obj2, null, null, null, (nqi.c) obj3, null, null, null, null, null, false, null, null, null, null, null, 1048543);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((m1) obj3).f128291a.c();
            case 4:
                String productId = (String) obj2;
                Intrinsics.checkNotNullParameter(productId, "productId");
                return (pjb.c) ((eqb.b) obj3).f128418b.get(eqb.b.a(productId));
            case 5:
                gqh.g createdScreenerId = (gqh.g) obj2;
                Intrinsics.checkNotNullParameter(createdScreenerId, "createdScreenerId");
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.a) obj3).C2(eqh.h.f128464a);
                return Unit.f186387a;
            case 6:
                eql.h updateState = (eql.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return new eql.f(((ug0.b) obj3).f279915a);
            case 7:
                ug0.d dVar = (ug0.d) obj3;
                eql.h updateState2 = (eql.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return new eql.g(dVar.f279917a, dVar.f279918b);
            case 8:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((j) obj3).d3(new q(it8, 10));
                return Unit.f186387a;
            case 9:
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                return ((er9.e) obj3).d.j0(groupMembers);
            case 10:
                vr.f fVar = (vr.f) obj3;
                BiometricVerificationLauncherFlowContract$FlowState update = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return BiometricVerificationLauncherFlowContract$FlowState.a(update, null, fVar.f291442b, null, fVar.d, fVar.e, 5);
            case 11:
                BiometricVerificationLauncherFlowContract$FlowState update2 = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                vr.f fVar2 = (vr.f) ((vr.i) obj3);
                return BiometricVerificationLauncherFlowContract$FlowState.a(update2, null, fVar2.f291442b, null, fVar2.d, fVar2.e, 5);
            case 12:
                Intrinsics.checkNotNullParameter((oj0) obj2, "it");
                return Boolean.valueOf(((es0.q) obj3).f128844b.b());
            case 13:
                com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a aVar = (com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.a) obj3;
                gu4.d result = (gu4.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof gu4.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.B2();
                return Unit.f186387a;
            case 14:
                com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar2 = (com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) obj3;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.f) {
                    aVar2.l2(new esa.j(aVar2, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 15:
                return esa.d.a((esa.d) obj2, (CardOwner) obj3, null, null, null, 14);
            case 16:
                return (o) obj3;
            case 17:
                f0 f0Var = (f0) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                bw0.h hVar2 = new bw0.h("", null, true, null, Boolean.FALSE, false, false, false, false, null, 8086);
                f3 f3Var = new f3(null, null, null, false, h3.LOADING, true);
                m.Companion.getClass();
                ?? elements = {new CenteredAmountDelegate.Model("AMOUNT_LIST_ID", null, hVar2, f3Var, k.a(), null, null, false, false, null, null, 2018), new s7("BUDGET_CYCLE_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), f0Var.f128974c.f101562a == bsj.a.UPDATE ? new s7("CATEGORY_BUDGETS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126) : 0};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new x(kotlin.collections.d.L(elements), zhm.f0.f322471a, false, false, null, f0Var.b());
            case 18:
                return ChatBubbleView.g0((ChatBubbleView) obj3);
            case 19:
                ty0.a clickData = (ty0.a) obj2;
                int i6 = et0.t0.e;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((et0.t0) obj3).f129116c.onNext(clickData);
                return Unit.f186387a;
            case 20:
                b9k.f fVar3 = (b9k.f) obj3;
                i orderOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(orderOptional, "orderOptional");
                nr6.b bVar = (nr6.b) orderOptional.f224257a;
                if (bVar == null) {
                    i.Companion.getClass();
                    return zi0.c.i(iVar);
                }
                fVar3.getClass();
                nr6.q qVar = bVar.f218548r;
                if (qVar == null || (str = qVar.f218578a) == null) {
                    i.Companion.getClass();
                    flowI = zi0.c.i(iVar);
                } else {
                    flowI = nim.a.A(nim.a.v(rd0.e.b(((p1) fVar3.f13818c).d(str, r62.equals(r62))), new eqd.h(i2)), new eqd.h(27));
                }
                nr6.o oVar = bVar.f218546p;
                int i21 = 29;
                if (oVar == null || (orderId = oVar.f218576a) == null) {
                    i.Companion.getClass();
                    flowI2 = zi0.c.i(iVar);
                } else {
                    bbd.b bVar2 = (bbd.b) fVar3.d;
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    dbd.g gVar = bVar2.f14254a;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    flowI2 = nim.a.A(nim.a.v(gVar.f112734h.c(orderId, true), new eqd.h(28)), new eqd.h(i21));
                }
                return nim.a.v(nim.a.u(new w(fVar3, bVar, (Continuation) , i21), u0.m(flowI, flowI2)), new eqd.h(25));
            case 21:
                r10.r rVar = (r10.r) obj3;
                i paymentOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(paymentOptional, "paymentOptional");
                pr6.e eVar = (pr6.e) paymentOptional.f224257a;
                if (eVar == null) {
                    i.Companion.getClass();
                    return zi0.c.i(iVar);
                }
                rVar.getClass();
                String str2 = eVar.f238948q;
                return nim.a.v(str2 != null ? new y(nim.a.u(new et6.x(rVar, eVar, , i5), ((b9k.f) rVar.f250851a).s(str2, r62)), rVar, eVar, 23) : new v1(new et6.x(rVar, eVar, , i3)), new et6.w(i5));
            case 22:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar3 = (xi0.b) pair.f186385a;
                return nim.a.v(((z) obj3).f129389b.q(bVar3, hVar), new c((pr6.q) pair.f186386b, bVar3, 18));
            case 23:
                h1 h1Var = (h1) obj3;
                List sales = (List) obj2;
                Intrinsics.checkNotNullParameter(sales, "sales");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : sales) {
                    FreelancerOrder freelancerOrder = (FreelancerOrder) obj4;
                    h1Var.getClass();
                    if (freelancerOrder.d != lr6.k.LINK || freelancerOrder.f73290b != lr6.r.FAILED || ((sVar = freelancerOrder.f) != s.PAYMENT && sVar != s.PAYMENT_REQUEST)) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 24:
                FreelancerPaymentReceipt receipt = (FreelancerPaymentReceipt) obj2;
                Intrinsics.checkNotNullParameter(receipt, "receipt");
                return new FreelancerOrderPaymentReceipt((AcquiringOrderPayment) obj3, receipt);
            case 25:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list = (List) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                ((o7.d) obj3).getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    Iterable iterable = ((cgc.c) it9.next()).f;
                    if (iterable == null) {
                        iterable = zhm.f0.f322471a;
                    }
                    a0.x(iterable, linkedHashSet);
                }
                Set setI1 = d0.i1(linkedHashSet);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (setI1.contains(((cgc.g) obj5).f23912a)) {
                        arrayList2.add(obj5);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : arrayList2) {
                    if (((cgc.g) obj6).d == cgc.h.VERTICAL) {
                        arrayList3.add(obj6);
                    } else {
                        arrayList4.add(obj6);
                    }
                }
                return new ht6.b(d0.E0(d0.P0(arrayList4, new f2()), d0.P0(arrayList3, new e2())), list);
            case 26:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return nim.a.v(((i2) obj3).d(baseCurrency, hVar), new p(13, baseCurrency));
            case 27:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                zr6.a aVar3 = (zr6.a) pair3.f186385a;
                n nVar = (n) pair3.f186386b;
                ft6.s sVar2 = ((l2) obj3).f129269c;
                Address address = nVar.k;
                wi0.b bVarG = address != null ? nz8.d.g(address) : null;
                if (aVar3 == null || bVarG == null) {
                    return zhm.f0.f322471a;
                }
                List items = aVar3.getItems();
                ArrayList<as6.b> arrayList5 = new ArrayList();
                Iterator it10 = items.iterator();
                while (it10.hasNext()) {
                    as6.b bVarA = sVar2.a((zr6.f) it10.next(), bVarG);
                    if (bVarA != null) {
                        arrayList5.add(bVarA);
                    }
                }
                as6.b[] elements2 = {ft6.s.b(arrayList5, as6.a.REVOLUT_PAY_ONLINE), ft6.s.b(arrayList5, as6.a.REVOLUT_PAY_IN_PERSON)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL = kotlin.collections.d.L(elements2);
                ArrayList arrayList6 = new ArrayList();
                for (as6.b bVar4 : arrayList5) {
                    as6.a aVar4 = bVar4.f8797a;
                    if (aVar4 != as6.a.REVOLUT_PAY_ONLINE && aVar4 != as6.a.REVOLUT_PAY_IN_PERSON) {
                        listC = u.c(bVar4);
                    } else if (i5 == 0) {
                        listC = listL;
                        i5 = 1;
                    } else {
                        listC = zhm.f0.f322471a;
                    }
                    a0.x(listC, arrayList6);
                }
                return arrayList6;
            case 28:
                ds6.j jVar = (ds6.j) obj3;
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                if (jVar == null) {
                    return events;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : events) {
                    if (((TaxHubCalendarEvent) obj7).f73484b == jVar) {
                        arrayList7.add(obj7);
                    }
                }
                return arrayList7;
            default:
                com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a aVar5 = (com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) obj3;
                vf0.h hVar3 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar3, "<destruct>");
                CreditCard creditCard = (CreditCard) hVar3.f288433a;
                return nim.a.v(nim.a.v(aVar5.f69567t.e(hVar), new p(14, creditCard.f69798l)), new dqd.a((wi0.b) hVar3.d, creditCard, aVar5, (i) hVar3.f288434b, (i) hVar3.f288435c));
        }
    }
}
