package bu6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderCard;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$SepaDirectDebit;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jt6.i;
import jt6.l;
import jt6.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ks6.k;
import nr6.c0;
import nr6.e0;
import nr6.i;
import nr6.m;
import nr6.o;
import nr6.q;
import nr6.s;
import nr6.u;
import nr6.y;
import pr6.j;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final AcquiringPaymentFee a(jt6.f fVar) {
        pr6.h hVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        dj0.d dVarO = mo3.a.o(fVar.getAmount());
        String type = fVar.getType();
        pr6.h[] hVarArrValues = pr6.h.values();
        int length = hVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i];
            if (a0.z(hVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (hVar == null) {
            return null;
        }
        return new AcquiringPaymentFee(dVarO, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nr6.b b(jt6.e eVar) {
        c0 c0Var;
        nr6.e eVar2;
        nr6.c cVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        y yVar;
        e0 e0Var;
        m mVar;
        o oVar;
        m mVar2;
        q qVar;
        LocalDateTime localDateTime;
        dj0.d dVarO;
        l lVar;
        j jVar;
        AcquiringOrderCard acquiringOrderCard;
        nr6.c cVar2;
        nr6.e eVar3;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String value = eVar.getId();
        Intrinsics.checkNotNullParameter(value, "value");
        LocalDateTime localDateTimeY = oi0.d.Y(eVar.getCreatedAt());
        LocalDateTime localDateTimeY2 = oi0.d.Y(eVar.getUpdatedAt());
        String status = eVar.getStatus();
        if (status != null) {
            c0[] c0VarArrValues = c0.values();
            int length = c0VarArrValues.length;
            for (int i = 0; i < length; i++) {
                c0Var = c0VarArrValues[i];
                if (a0.z(c0Var.name(), status, true)) {
                    break;
                }
            }
            c0Var = null;
        } else {
            c0Var = null;
        }
        String channel = eVar.getChannel();
        if (channel != null) {
            nr6.e[] eVarArrValues = nr6.e.values();
            int length2 = eVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    eVar3 = null;
                    break;
                }
                eVar3 = eVarArrValues[i2];
                if (a0.z(eVar3.name(), channel, true)) {
                    break;
                }
                i2++;
            }
            eVar2 = eVar3;
        } else {
            eVar2 = null;
        }
        String captureMode = eVar.getCaptureMode();
        if (captureMode != null) {
            nr6.c[] cVarArrValues = nr6.c.values();
            int length3 = cVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArrValues[i3];
                if (a0.z(cVar2.name(), captureMode, true)) {
                    break;
                }
                i3++;
            }
            cVar = cVar2;
        } else {
            cVar = null;
        }
        String merchantOrderExternalReference = eVar.getMerchantOrderExternalReference();
        String description = eVar.getDescription();
        String readableIdentifier = eVar.getReadableIdentifier();
        String customerNote = eVar.getCustomerNote();
        List customFields = eVar.getCustomFields();
        if (customFields != null) {
            List list = customFields;
            arrayList = new ArrayList(w.t(list, 10));
            for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                jt6.b bVar = (jt6.b) it8.next();
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList.add(new nr6.g(bVar.getName(), bVar.getValue()));
            }
        } else {
            arrayList = null;
        }
        List customers = eVar.getCustomers();
        if (customers != null) {
            List list2 = customers;
            arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                jt6.c cVar3 = (jt6.c) it9.next();
                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                arrayList2.add(new i(cVar3.getId(), cVar3.getFullName(), cVar3.getEmail(), cVar3.getPhone()));
                it9 = it9;
                value = value;
                localDateTimeY = localDateTimeY;
                localDateTimeY2 = localDateTimeY2;
            }
        } else {
            arrayList2 = null;
        }
        String str = value;
        LocalDateTime localDateTime2 = localDateTimeY;
        LocalDateTime localDateTime3 = localDateTimeY2;
        l primaryPayment = eVar.getPrimaryPayment();
        if (primaryPayment != null) {
            Intrinsics.checkNotNullParameter(primaryPayment, "<this>");
            String value2 = primaryPayment.getId();
            Intrinsics.checkNotNullParameter(value2, "value");
            String paymentMethod = primaryPayment.getPaymentMethod();
            j[] jVarArrValues = j.values();
            int length4 = jVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    lVar = primaryPayment;
                    jVar = null;
                    break;
                }
                j jVar2 = jVarArrValues[i5];
                lVar = primaryPayment;
                j[] jVarArr = jVarArrValues;
                if (a0.z(jVar2.name(), paymentMethod, true)) {
                    jVar = jVar2;
                    break;
                }
                i5++;
                primaryPayment = lVar;
                jVarArrValues = jVarArr;
            }
            jt6.a card = lVar.getCard();
            if (card != null) {
                Intrinsics.checkNotNullParameter(card, "<this>");
                acquiringOrderCard = new AcquiringOrderCard(card.getBinScheme(), card.getLastFour());
            } else {
                acquiringOrderCard = null;
            }
            yVar = new y(value2, jVar, acquiringOrderCard, lVar.getCampaignId());
        } else {
            yVar = null;
        }
        String locationId = eVar.getLocationId();
        u uVar = locationId != null ? new u(locationId, null) : null;
        n createdByUser = eVar.getCreatedByUser();
        if (createdByUser != null) {
            Intrinsics.checkNotNullParameter(createdByUser, "<this>");
            e0Var = new e0(createdByUser.getId(), createdByUser.getFirstName(), createdByUser.getLastName());
        } else {
            String createdByUserId = eVar.getCreatedByUserId();
            e0Var = createdByUserId != null ? new e0(createdByUserId, null, null) : null;
        }
        jt6.g initiationPage = eVar.getInitiationPage();
        if (initiationPage != null) {
            Intrinsics.checkNotNullParameter(initiationPage, "<this>");
            oVar = new o(initiationPage.getId(), initiationPage.getTitle());
            mVar = null;
        } else {
            String initiationPageId = eVar.getInitiationPageId();
            if (initiationPageId != null) {
                mVar = null;
                oVar = new o(initiationPageId, null);
            } else {
                mVar = null;
                oVar = null;
            }
        }
        jt6.d device = eVar.getDevice();
        if (device != null) {
            Intrinsics.checkNotNullParameter(device, "<this>");
            mVar2 = new m(device.getId());
        } else {
            mVar2 = mVar;
        }
        jt6.h invoice = eVar.getInvoice();
        if (invoice != null) {
            Intrinsics.checkNotNullParameter(invoice, "<this>");
            qVar = new q(invoice.getId(), invoice.getFormattedNumber());
        } else {
            qVar = mVar;
        }
        dj0.d dVarO2 = mo3.a.o(eVar.getAmount());
        jo3.a tipAmount = eVar.getTipAmount();
        Object objO = tipAmount != null ? mo3.a.o(tipAmount) : mVar;
        jo3.a outstandingAmount = eVar.getOutstandingAmount();
        if (outstandingAmount != null) {
            localDateTime = localDateTime3;
            dVarO = mo3.a.o(outstandingAmount);
        } else {
            localDateTime = localDateTime3;
            dVarO = mVar;
        }
        jo3.a discountTotalAmount = eVar.getDiscountTotalAmount();
        dj0.d dVarO3 = discountTotalAmount != null ? mo3.a.o(discountTotalAmount) : mVar;
        jo3.a subTotalAmount = eVar.getSubTotalAmount();
        dj0.d dVarO4 = subTotalAmount != null ? mo3.a.o(subTotalAmount) : mVar;
        jo3.a taxTotalAmount = eVar.getTaxTotalAmount();
        dj0.d dVarO5 = taxTotalAmount != null ? mo3.a.o(taxTotalAmount) : mVar;
        jo3.a serviceChargeAmount = eVar.getServiceChargeAmount();
        dj0.d dVarO6 = serviceChargeAmount != null ? mo3.a.o(serviceChargeAmount) : mVar;
        jo3.a surchargeAmount = eVar.getSurchargeAmount();
        dj0.d dVarO7 = surchargeAmount != null ? mo3.a.o(surchargeAmount) : mVar;
        jo3.a surchargeTaxAmount = eVar.getSurchargeTaxAmount();
        return new nr6.b(str, localDateTime2, localDateTime, c0Var, eVar2, cVar, merchantOrderExternalReference, description, readableIdentifier, customerNote, arrayList, arrayList2, yVar, uVar, e0Var, oVar, mVar2, qVar, dVarO2, objO, dVarO, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, surchargeTaxAmount != null ? mo3.a.o(surchargeTaxAmount) : mVar);
    }

    public static final nr6.b c(k kVar) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        y yVar;
        u uVar;
        e0 e0Var;
        o oVar;
        m mVar;
        q qVar;
        AcquiringOrderCard acquiringOrderCard;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String value = kVar.f189186a;
        Intrinsics.checkNotNullParameter(value, "value");
        LocalDateTime localDateTime = kVar.f189187b;
        LocalDateTime localDateTime2 = kVar.f189188c;
        String str2 = kVar.d;
        c0 c0VarValueOf = str2 != null ? c0.valueOf(str2) : null;
        String str3 = kVar.e;
        nr6.e eVarValueOf = str3 != null ? nr6.e.valueOf(str3) : null;
        String str4 = kVar.f;
        nr6.c cVarValueOf = str4 != null ? nr6.c.valueOf(str4) : null;
        String str5 = kVar.f189189g;
        nr6.e eVar = eVarValueOf;
        nr6.c cVar = cVarValueOf;
        String str6 = kVar.f189190h;
        String str7 = kVar.i;
        String str8 = kVar.f189191j;
        List list = kVar.k;
        if (list != null) {
            List list2 = list;
            str = value;
            arrayList = new ArrayList(w.t(list2, 10));
            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                ks6.c cVar2 = (ks6.c) it8.next();
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                arrayList.add(new nr6.g(cVar2.getName(), cVar2.getValue()));
            }
        } else {
            str = value;
            arrayList = null;
        }
        List list3 = kVar.f189192l;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                ks6.d dVar = (ks6.d) it9.next();
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                arrayList2.add(new i(dVar.getId(), dVar.getFullName(), dVar.getEmail(), dVar.getPhone()));
                it9 = it9;
                localDateTime = localDateTime;
                localDateTime2 = localDateTime2;
                c0VarValueOf = c0VarValueOf;
            }
        } else {
            arrayList2 = null;
        }
        LocalDateTime localDateTime3 = localDateTime;
        LocalDateTime localDateTime4 = localDateTime2;
        c0 c0Var = c0VarValueOf;
        ks6.i iVar = kVar.f189193m;
        if (iVar != null) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            String value2 = iVar.getId();
            Intrinsics.checkNotNullParameter(value2, "value");
            String paymentMethod = iVar.getPaymentMethod();
            j jVarValueOf = paymentMethod != null ? j.valueOf(paymentMethod) : null;
            ks6.a card = iVar.getCard();
            if (card != null) {
                Intrinsics.checkNotNullParameter(card, "<this>");
                acquiringOrderCard = new AcquiringOrderCard(card.getBinScheme(), card.getLastFour());
            } else {
                acquiringOrderCard = null;
            }
            yVar = new y(value2, jVarValueOf, acquiringOrderCard, iVar.getCampaignId());
        } else {
            yVar = null;
        }
        ks6.h hVar = kVar.f189194n;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            uVar = new u(hVar.getId(), hVar.getName());
        } else {
            uVar = null;
        }
        ks6.j jVar = kVar.o;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            e0Var = new e0(jVar.getId(), jVar.getFirstName(), jVar.getLastName());
        } else {
            e0Var = null;
        }
        ks6.f fVar = kVar.f189195p;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            oVar = new o(fVar.getId(), fVar.getTitle());
        } else {
            oVar = null;
        }
        ks6.e eVar2 = kVar.f189196q;
        if (eVar2 != null) {
            Intrinsics.checkNotNullParameter(eVar2, "<this>");
            mVar = new m(eVar2.getId());
        } else {
            mVar = null;
        }
        ks6.g gVar = kVar.f189197r;
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            qVar = new q(gVar.getId(), gVar.getFormattedNumber());
        } else {
            qVar = null;
        }
        dj0.d dVarV = hx7.a.v(kVar.f189198s);
        jo3.b bVar = kVar.f189199t;
        dj0.d dVarV2 = bVar != null ? hx7.a.v(bVar) : null;
        jo3.b bVar2 = kVar.u;
        dj0.d dVarV3 = bVar2 != null ? hx7.a.v(bVar2) : null;
        jo3.b bVar3 = kVar.v;
        dj0.d dVarV4 = bVar3 != null ? hx7.a.v(bVar3) : null;
        jo3.b bVar4 = kVar.f189200w;
        dj0.d dVarV5 = bVar4 != null ? hx7.a.v(bVar4) : null;
        jo3.b bVar5 = kVar.f189201x;
        dj0.d dVarV6 = bVar5 != null ? hx7.a.v(bVar5) : null;
        jo3.b bVar6 = kVar.f189202y;
        dj0.d dVarV7 = bVar6 != null ? hx7.a.v(bVar6) : null;
        jo3.b bVar7 = kVar.z;
        dj0.d dVarV8 = bVar7 != null ? hx7.a.v(bVar7) : null;
        jo3.b bVar8 = kVar.A;
        return new nr6.b(str, localDateTime3, localDateTime4, c0Var, eVar, cVar, str5, str6, str7, str8, arrayList, arrayList2, yVar, uVar, e0Var, oVar, mVar, qVar, dVarV, dVarV2, dVarV3, dVarV4, dVarV5, dVarV6, dVarV7, dVarV8, bVar8 != null ? hx7.a.v(bVar8) : null);
    }

    public static final s d(jt6.i iVar) {
        i.b image;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String name = iVar.getName();
        String description = iVar.getDescription();
        i.c product = iVar.getProduct();
        return new s(name, description, (product == null || (image = product.getImage()) == null) ? null : image.getUri(), mo3.a.o(iVar.getTotalAmount()), mo3.a.o(iVar.getUnitPrice()), iVar.getQuantity().getValue());
    }

    public static final nr6.w e(jt6.k toDomain, String str) {
        Intrinsics.checkNotNullParameter(toDomain, "$this$toDomain");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-orderId$0");
        List payments = toDomain.getPayments();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payments.iterator();
        while (it8.hasNext()) {
            AcquiringOrderPayment acquiringOrderPaymentF = f((jt6.j) it8.next(), str, pr6.d.PAYMENT);
            if (acquiringOrderPaymentF != null) {
                arrayList.add(acquiringOrderPaymentF);
            }
        }
        List refunds = toDomain.getRefunds();
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = refunds.iterator();
        while (it9.hasNext()) {
            AcquiringOrderPayment acquiringOrderPaymentF2 = f((jt6.j) it9.next(), str, pr6.d.REFUND);
            if (acquiringOrderPaymentF2 != null) {
                arrayList2.add(acquiringOrderPaymentF2);
            }
        }
        List totalFees = toDomain.getTotalFees();
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = totalFees.iterator();
        while (it10.hasNext()) {
            AcquiringPaymentFee acquiringPaymentFeeA = a((jt6.f) it10.next());
            if (acquiringPaymentFeeA != null) {
                arrayList3.add(acquiringPaymentFeeA);
            }
        }
        return new nr6.w(arrayList, arrayList2, arrayList3, mo3.a.o(toDomain.getNetAmount()));
    }

    public static final AcquiringOrderPayment f(jt6.j toDomain, String str, pr6.d paymentType) {
        lr6.a aVar;
        boolean z;
        j jVar;
        AcquiringOrderCard acquiringOrderCard;
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit;
        Intrinsics.checkNotNullParameter(toDomain, "$this$toDomain");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-orderId$0");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        String value = toDomain.getId();
        Intrinsics.checkNotNullParameter(value, "value");
        LocalDateTime localDateTimeY = oi0.d.Y(toDomain.getStartedAt());
        LocalDateTime localDateTimeY2 = oi0.d.Y(toDomain.getUpdatedAt());
        String state = toDomain.getState();
        lr6.a[] aVarArrValues = lr6.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            lr6.a aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), state, true)) {
                aVar = aVar2;
                break;
            }
            i++;
        }
        if (aVar == null) {
            return null;
        }
        dj0.d dVarO = mo3.a.o(toDomain.getAmount());
        boolean zJ = pd.b.j(toDomain.getIsRefundable());
        jo3.a refundedAmount = toDomain.getRefundedAmount();
        dj0.d dVarO2 = refundedAmount != null ? mo3.a.o(refundedAmount) : null;
        List fees = toDomain.getFees();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = fees.iterator();
        while (it8.hasNext()) {
            AcquiringPaymentFee acquiringPaymentFeeA = a((jt6.f) it8.next());
            if (acquiringPaymentFeeA != null) {
                arrayList.add(acquiringPaymentFeeA);
            }
        }
        String paymentMethod = toDomain.getPaymentMethod();
        j[] jVarArrValues = j.values();
        int length2 = jVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z = zJ;
                jVar = null;
                break;
            }
            j jVar2 = jVarArrValues[i2];
            z = zJ;
            if (a0.z(jVar2.name(), paymentMethod, true)) {
                jVar = jVar2;
                break;
            }
            i2++;
            zJ = z;
        }
        if (jVar == null) {
            return null;
        }
        jt6.a card = toDomain.getCard();
        if (card != null) {
            Intrinsics.checkNotNullParameter(card, "<this>");
            acquiringOrderCard = new AcquiringOrderCard(card.getBinScheme(), card.getLastFour());
        } else {
            acquiringOrderCard = null;
        }
        lt6.e sepaDirectDebit = toDomain.getSepaDirectDebit();
        if (sepaDirectDebit != null) {
            Intrinsics.checkNotNullParameter(sepaDirectDebit, "<this>");
            acquiringPayment$SepaDirectDebit = new AcquiringPayment$SepaDirectDebit(sepaDirectDebit.getLastFour());
        } else {
            acquiringPayment$SepaDirectDebit = null;
        }
        return new AcquiringOrderPayment(value, paymentType, str, localDateTimeY, localDateTimeY2, aVar, dVarO, z, dVarO2, arrayList, jVar, acquiringOrderCard, acquiringPayment$SepaDirectDebit);
    }

    public static final jt6.j g(AcquiringOrderPayment acquiringOrderPayment) {
        jt6.a aVar;
        lt6.e eVar;
        Intrinsics.checkNotNullParameter(acquiringOrderPayment, "<this>");
        String str = acquiringOrderPayment.f73355a;
        long jR = oi0.d.R(acquiringOrderPayment.d);
        long jR2 = oi0.d.R(acquiringOrderPayment.e);
        String strName = acquiringOrderPayment.f.name();
        jo3.a aVarP = mo3.a.p(acquiringOrderPayment.f73358g);
        Boolean boolValueOf = Boolean.valueOf(acquiringOrderPayment.f73359h);
        dj0.d dVar = acquiringOrderPayment.i;
        jo3.a aVarP2 = dVar != null ? mo3.a.p(dVar) : null;
        ArrayList<AcquiringPaymentFee> arrayList = acquiringOrderPayment.f73360j;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (AcquiringPaymentFee acquiringPaymentFee : arrayList) {
            Intrinsics.checkNotNullParameter(acquiringPaymentFee, "<this>");
            arrayList2.add(new jt6.f(mo3.a.p(acquiringPaymentFee.f73365a), acquiringPaymentFee.f73366b.name()));
        }
        String strName2 = acquiringOrderPayment.k.name();
        AcquiringOrderCard acquiringOrderCard = acquiringOrderPayment.f73361l;
        if (acquiringOrderCard != null) {
            Intrinsics.checkNotNullParameter(acquiringOrderCard, "<this>");
            aVar = new jt6.a(acquiringOrderCard.f73343a, acquiringOrderCard.f73344b);
        } else {
            aVar = null;
        }
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = acquiringOrderPayment.f73362m;
        if (acquiringPayment$SepaDirectDebit != null) {
            Intrinsics.checkNotNullParameter(acquiringPayment$SepaDirectDebit, "<this>");
            eVar = new lt6.e(acquiringPayment$SepaDirectDebit.f73364a);
        } else {
            eVar = null;
        }
        return new jt6.j(str, jR, jR2, strName, aVarP, boolValueOf, aVarP2, arrayList2, strName2, aVar, eVar);
    }

    public static final k h(nr6.b bVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LocalDateTime localDateTime;
        String str;
        ks6.i iVar;
        ks6.h hVar;
        ks6.j jVar;
        ks6.f fVar;
        ks6.e eVar;
        ks6.g gVar;
        ks6.a aVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str2 = bVar.f218537a;
        LocalDateTime localDateTime2 = bVar.f218538b;
        LocalDateTime localDateTime3 = bVar.f218539c;
        c0 c0Var = bVar.d;
        String strName = c0Var != null ? c0Var.name() : null;
        nr6.e eVar2 = bVar.e;
        String strName2 = eVar2 != null ? eVar2.name() : null;
        nr6.c cVar = bVar.f;
        String strName3 = cVar != null ? cVar.name() : null;
        String str3 = bVar.f218540g;
        String str4 = bVar.f218541h;
        String str5 = bVar.i;
        String str6 = bVar.f218542j;
        List list = bVar.k;
        if (list != null) {
            List<nr6.g> list2 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            for (nr6.g gVar2 : list2) {
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                arrayList3.add(new ks6.c(gVar2.f218558a, gVar2.f218559b));
                strName = strName;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        String str7 = strName;
        List list3 = bVar.f218543l;
        if (list3 != null) {
            List list4 = list3;
            ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                nr6.i iVar2 = (nr6.i) it8.next();
                Intrinsics.checkNotNullParameter(iVar2, "<this>");
                arrayList4.add(new ks6.d(iVar2.f218562a, iVar2.f218563b, iVar2.f218564c, iVar2.d));
                it8 = it8;
                str2 = str2;
                localDateTime2 = localDateTime2;
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        String str8 = str2;
        LocalDateTime localDateTime4 = localDateTime2;
        y yVar = bVar.f218544m;
        if (yVar != null) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
            String str9 = yVar.f218588a;
            j jVar2 = yVar.f218589b;
            String strName4 = jVar2 != null ? jVar2.name() : null;
            AcquiringOrderCard acquiringOrderCard = yVar.f218590c;
            if (acquiringOrderCard != null) {
                Intrinsics.checkNotNullParameter(acquiringOrderCard, "<this>");
                localDateTime = localDateTime3;
                str = strName2;
                aVar = new ks6.a(acquiringOrderCard.f73343a, acquiringOrderCard.f73344b);
            } else {
                localDateTime = localDateTime3;
                str = strName2;
                aVar = null;
            }
            iVar = new ks6.i(str9, strName4, aVar, yVar.d);
        } else {
            localDateTime = localDateTime3;
            str = strName2;
            iVar = null;
        }
        u uVar = bVar.f218545n;
        if (uVar != null) {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            hVar = new ks6.h(uVar.f218583a, uVar.f218584b);
        } else {
            hVar = null;
        }
        e0 e0Var = bVar.o;
        if (e0Var != null) {
            Intrinsics.checkNotNullParameter(e0Var, "<this>");
            jVar = new ks6.j(e0Var.f218555a, e0Var.f218556b, e0Var.f218557c);
        } else {
            jVar = null;
        }
        o oVar = bVar.f218546p;
        if (oVar != null) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            fVar = new ks6.f(oVar.f218576a, oVar.f218577b);
        } else {
            fVar = null;
        }
        m mVar = bVar.f218547q;
        if (mVar != null) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            eVar = new ks6.e(mVar.f218575a);
        } else {
            eVar = null;
        }
        q qVar = bVar.f218548r;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            gVar = new ks6.g(qVar.f218578a, qVar.f218579b);
        } else {
            gVar = null;
        }
        jo3.b bVarA = hx7.a.A(bVar.f218549s);
        dj0.d dVar = bVar.f218550t;
        jo3.b bVarA2 = dVar != null ? hx7.a.A(dVar) : null;
        dj0.d dVar2 = bVar.u;
        jo3.b bVarA3 = dVar2 != null ? hx7.a.A(dVar2) : null;
        dj0.d dVar3 = bVar.v;
        jo3.b bVarA4 = dVar3 != null ? hx7.a.A(dVar3) : null;
        dj0.d dVar4 = bVar.f218551w;
        jo3.b bVarA5 = dVar4 != null ? hx7.a.A(dVar4) : null;
        dj0.d dVar5 = bVar.f218552x;
        jo3.b bVarA6 = dVar5 != null ? hx7.a.A(dVar5) : null;
        dj0.d dVar6 = bVar.f218553y;
        jo3.b bVarA7 = dVar6 != null ? hx7.a.A(dVar6) : null;
        dj0.d dVar7 = bVar.z;
        jo3.b bVarA8 = dVar7 != null ? hx7.a.A(dVar7) : null;
        dj0.d dVar8 = bVar.A;
        return new k(str8, localDateTime4, localDateTime, str7, str, strName3, str3, str4, str5, str6, arrayList, arrayList2, iVar, hVar, jVar, fVar, eVar, gVar, bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8, dVar8 != null ? hx7.a.A(dVar8) : null);
    }
}
