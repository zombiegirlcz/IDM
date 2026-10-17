package ft6;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueLineItem;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerOrderCustomer;
import com.revolut.feature.freelancer.common.models.FreelancerOrderPayment;
import com.revolut.feature.freelancer.common.models.FreelancerOrderTransaction;
import com.revolut.feature.freelancer.common.models.FreelancerOriginalOrderDetails;
import com.revolut.feature.freelancer.common.models.FreelancerTaxAllocation;
import com.revolut.feature.freelancer.common.models.orders.FreelancerOrderInvoiceDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import ks6.h0;
import ks6.i0;
import ks6.j0;
import ks6.l0;
import ks6.m0;
import ks6.o0;
import ks6.u;
import le.u1;
import lr6.k0;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd1.a f137954a;

    public u(bd1.a litePosCatalogueLineItemMapper) {
        Intrinsics.checkNotNullParameter(litePosCatalogueLineItemMapper, "litePosCatalogueLineItemMapper");
        this.f137954a = litePosCatalogueLineItemMapper;
    }

    public static Map a() {
        return r0.k(new Pair("CARD", lr6.q.CARD), new Pair("BANK_TRANSFER", lr6.q.BANK_TRANSFER), new Pair("PAY_WITH_REVOLUT", lr6.q.PAY_WITH_REVOLUT), new Pair("APPLE_PAY", lr6.q.APPLE_PAY), new Pair("GOOGLE_PAY", lr6.q.GOOGLE_PAY), new Pair("CARD_PRESENT", lr6.q.CARD_PRESENT), new Pair("OPEN_BANKING", lr6.q.OPEN_BANKING));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    public static FreelancerOrder c(i0 entity) {
        lr6.l lVar;
        lr6.k kVar;
        lr6.s sVar;
        FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetails;
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        ArrayList arrayList2;
        String str6;
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ?? arrayList6;
        ArrayList arrayList7;
        l0 l0Var;
        k0 k0Var;
        lr6.i0 i0Var;
        lr6.a aVar;
        FreelancerTaxAllocation freelancerTaxAllocation;
        lr6.a aVar2;
        k0 k0Var2;
        Intrinsics.checkNotNullParameter(entity, "entity");
        String str7 = entity.f189161a;
        lr6.r rVar = (lr6.r) u1.u(entity.f189162b, mra.d.r());
        String str8 = entity.f189163c;
        lr6.k kVar2 = (lr6.k) u1.t(entity.d, null, mra.d.q());
        String str9 = entity.e;
        if (str9 != null) {
            lr6.l[] lVarArrValues = lr6.l.values();
            int length = lVarArrValues.length;
            for (int i = 0; i < length; i++) {
                lVar = lVarArrValues[i];
                if (a0.z(lVar.name(), str9, true)) {
                    break;
                }
            }
            lVar = null;
        } else {
            lVar = null;
        }
        lr6.s sVar2 = (lr6.s) u1.u(entity.f, mra.d.s());
        h0 h0Var = entity.f189164g;
        FreelancerOrderCustomer freelancerOrderCustomer = h0Var != null ? new FreelancerOrderCustomer(h0Var.f189155a, h0Var.f189156b, h0Var.f189157c) : null;
        j0 j0Var = entity.f189165h;
        if (j0Var != null) {
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            String id10 = j0Var.getId();
            String numberFormatted = j0Var.getNumberFormatted();
            sr6.n nVar = (sr6.n) u1.u(j0Var.getStatus(), h.c());
            DateTime dateTime = new DateTime(j0Var.getDueDate());
            Long paidDate = j0Var.getPaidDate();
            DateTime dateTime2 = paidDate != null ? new DateTime(paidDate.longValue()) : null;
            Long sentDate = j0Var.getSentDate();
            kVar = kVar2;
            sVar = sVar2;
            freelancerOrderInvoiceDetails = new FreelancerOrderInvoiceDetails(id10, nVar, numberFormatted, dateTime, dateTime2, sentDate != null ? new DateTime(sentDate.longValue()) : null, new DateTime(j0Var.getCreatedDate()), new DateTime(j0Var.getUpdatedDate()));
        } else {
            kVar = kVar2;
            sVar = sVar2;
            freelancerOrderInvoiceDetails = null;
        }
        String str10 = entity.i;
        lr6.l lVar2 = lVar;
        dj0.d dVar = new dj0.d(entity.f189166j, new xi0.b(6, entity.k, null));
        jo3.b bVar = entity.f189167l;
        dj0.d dVarV = bVar != null ? hx7.a.v(bVar) : null;
        jo3.b bVar2 = entity.f189168m;
        dj0.d dVarV2 = bVar2 != null ? hx7.a.v(bVar2) : null;
        jo3.b bVar3 = entity.f189169n;
        dj0.d dVarV3 = bVar3 != null ? hx7.a.v(bVar3) : null;
        String str11 = entity.o;
        String str12 = entity.f189170p;
        List list = entity.f189171q;
        if (list != null) {
            List list2 = list;
            str = str7;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList8.add(c((i0) it8.next()));
            }
            arrayList = arrayList8;
            str3 = str10;
            str4 = str11;
            str2 = str12;
        } else {
            str = str7;
            str2 = str12;
            str3 = str10;
            str4 = str11;
            arrayList = null;
        }
        List list3 = entity.f189172r;
        if (list3 != null) {
            List list4 = list3;
            str5 = str3;
            ArrayList arrayList9 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                l0 l0Var2 = (l0) it9.next();
                Intrinsics.checkNotNullParameter(l0Var2, "<this>");
                String id11 = l0Var2.getId();
                Iterator it10 = it9;
                lr6.j0 j0Var2 = (lr6.j0) u1.u(l0Var2.getState(), n14.e.n());
                lr6.l0 l0Var3 = (lr6.l0) u1.u(l0Var2.getType(), n14.e.o());
                String subtype = l0Var2.getSubtype();
                if (subtype != null) {
                    k0[] k0VarArrValues = k0.values();
                    l0Var = l0Var2;
                    int length2 = k0VarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            k0Var2 = null;
                            break;
                        }
                        k0 k0Var3 = k0VarArrValues[i2];
                        int i3 = i2;
                        int i5 = length2;
                        if (a0.z(k0Var3.name(), subtype, true)) {
                            k0Var2 = k0Var3;
                            break;
                        }
                        i2 = i3 + 1;
                        length2 = i5;
                    }
                    k0Var = k0Var2;
                } else {
                    l0Var = l0Var2;
                    k0Var = null;
                }
                String paymentMethod = l0Var.getPaymentMethod();
                lr6.i0[] i0VarArrValues = lr6.i0.values();
                int length3 = i0VarArrValues.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length3) {
                        i0Var = null;
                        break;
                    }
                    lr6.i0 i0Var2 = i0VarArrValues[i6];
                    int i21 = i6;
                    int i22 = length3;
                    if (a0.z(i0Var2.name(), paymentMethod, true)) {
                        i0Var = i0Var2;
                        break;
                    }
                    i6 = i21 + 1;
                    length3 = i22;
                }
                if (i0Var == null) {
                    i0Var = lr6.i0.UNKNOWN;
                }
                lr6.i0 i0Var3 = i0Var;
                String refundComment = l0Var.getRefundComment();
                String acquiringState = l0Var.getAcquiringState();
                if (acquiringState != null) {
                    lr6.a[] aVarArrValues = lr6.a.values();
                    int length4 = aVarArrValues.length;
                    int i32 = 0;
                    while (true) {
                        if (i32 >= length4) {
                            aVar2 = null;
                            break;
                        }
                        lr6.a aVar3 = aVarArrValues[i32];
                        int i33 = i32;
                        int i43 = length4;
                        if (a0.z(aVar3.name(), acquiringState, true)) {
                            aVar2 = aVar3;
                            break;
                        }
                        i32 = i33 + 1;
                        length4 = i43;
                    }
                    aVar = aVar2;
                } else {
                    aVar = null;
                }
                o0 taxAllocation = l0Var.getTaxAllocation();
                if (taxAllocation != null) {
                    Intrinsics.checkNotNullParameter(taxAllocation, "<this>");
                    freelancerTaxAllocation = new FreelancerTaxAllocation(taxAllocation.getTaxName(), taxAllocation.getTaxRate());
                } else {
                    freelancerTaxAllocation = null;
                }
                jo3.b billedAmount = l0Var.getBilledAmount();
                dj0.d dVarV4 = billedAmount != null ? hx7.a.v(billedAmount) : null;
                jo3.b creditedAmount = l0Var.getCreditedAmount();
                arrayList9.add(new FreelancerOrderTransaction(id11, j0Var2, l0Var3, k0Var, i0Var3, refundComment, aVar, dVarV4, creditedAmount != null ? hx7.a.v(creditedAmount) : null, freelancerTaxAllocation));
                it9 = it10;
            }
            arrayList2 = arrayList9;
        } else {
            str5 = str3;
            arrayList2 = null;
        }
        m0 m0Var = entity.f189173s;
        if (m0Var != null) {
            Intrinsics.checkNotNullParameter(m0Var, "<this>");
            FreelancerOriginalOrderDetails freelancerOriginalOrderDetails2 = new FreelancerOriginalOrderDetails(m0Var.getId(), m0Var.getDescription(), (lr6.s) u1.u(m0Var.getType(), mra.d.s()), (lr6.r) u1.u(m0Var.getState(), mra.d.r()), (lr6.k) u1.t(m0Var.getChannel(), null, mra.d.q()));
            str6 = str5;
            freelancerOriginalOrderDetails = freelancerOriginalOrderDetails2;
        } else {
            str6 = str5;
            freelancerOriginalOrderDetails = null;
        }
        List list5 = entity.f189174t;
        if (list5 != null) {
            List list6 = list5;
            arrayList3 = arrayList2;
            ArrayList arrayList10 = new ArrayList(zhm.w.t(list6, 10));
            Iterator it11 = list6.iterator();
            while (it11.hasNext()) {
                ks6.u uVar = (ks6.u) it11.next();
                String name = uVar.getName();
                String itemType = uVar.getItemType();
                cd1.b.Companion.getClass();
                Iterator it12 = it11;
                cd1.b bVar4 = (cd1.b) u1.v(itemType, cd1.b.MAPPING);
                if (bVar4 == null) {
                    bVar4 = cd1.b.CUSTOM;
                }
                cd1.b bVar5 = bVar4;
                long unitPriceAmount = uVar.getUnitPriceAmount();
                int value = uVar.getQuantity().getValue();
                String str13 = str6;
                String unit = uVar.getQuantity().getUnit();
                cd1.j.Companion.getClass();
                lr6.r rVar2 = rVar;
                CatalogueLineItem.Quantity quantity = new CatalogueLineItem.Quantity(value, (cd1.j) u1.t(unit, cd1.j.ITEM, cd1.j.MAPPING));
                List taxes = uVar.getTaxes();
                if (taxes != null) {
                    List<u.b> list7 = taxes;
                    ArrayList arrayList11 = new ArrayList(zhm.w.t(list7, 10));
                    for (u.b bVar6 : list7) {
                        arrayList11.add(new CatalogueLineItem.Tax(bVar6.getRateId(), bVar6.getName(), bVar6.getAmount(), bVar6.getRate()));
                    }
                    arrayList7 = arrayList11;
                } else {
                    arrayList7 = null;
                }
                arrayList10.add(new CatalogueLineItem(name, bVar5, unitPriceAmount, quantity, arrayList7, uVar.getTotalAmount(), uVar.getTotalTaxAmount(), uVar.getDescription(), uVar.getProductId(), null, uVar.getColor()));
                it11 = it12;
                str6 = str13;
                rVar = rVar2;
            }
            arrayList4 = arrayList10;
        } else {
            arrayList3 = arrayList2;
            arrayList4 = null;
        }
        String str14 = str6;
        lr6.r rVar3 = rVar;
        List list8 = entity.u;
        if (list8 != null) {
            List<ks6.k0> list9 = list8;
            arrayList5 = new ArrayList(zhm.w.t(list9, 10));
            for (ks6.k0 k0Var4 : list9) {
                arrayList5.add(new FreelancerOrderPayment(k0Var4.f189203a, lr6.p.valueOf(k0Var4.f189204b)));
            }
        } else {
            arrayList5 = null;
        }
        DateTime dateTime3 = new DateTime(entity.v);
        ArrayList arrayList12 = arrayList4;
        DateTime dateTime4 = new DateTime(entity.f189175w);
        DateTime dateTime5 = new DateTime(entity.f189176x);
        List list10 = entity.f189177y;
        if (list10 != null) {
            arrayList6 = new ArrayList();
            Iterator it13 = list10.iterator();
            while (it13.hasNext()) {
                lr6.q qVar = (lr6.q) u1.v((String) it13.next(), a());
                if (qVar != null) {
                    arrayList6.add(qVar);
                }
            }
        } else {
            arrayList6 = f0.f322471a;
        }
        return new FreelancerOrder(str, rVar3, str8, kVar, lVar2, sVar, freelancerOrderCustomer, freelancerOrderInvoiceDetails, str14, dVar, dVarV, dVarV2, dVarV3, str4, str2, arrayList, arrayList3, freelancerOriginalOrderDetails, arrayList12, arrayList5, arrayList6, dateTime3, dateTime4, dateTime5);
    }

    public static i0 d(FreelancerOrder domain) {
        String strG;
        j0 j0Var;
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        m0 m0Var;
        ArrayList arrayList4;
        ArrayList arrayList5;
        u.a aVar;
        String str3;
        ArrayList arrayList6;
        String strG2;
        String str4;
        String str5;
        o0 o0Var;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String str6 = domain.f73289a;
        String strG3 = u1.g(domain.f73290b, mra.d.r());
        String str7 = domain.f73291c;
        lr6.k kVar = domain.d;
        if (kVar != null) {
            strG = u1.g(kVar, mra.d.q());
        } else {
            m70.a.c(t0.f186434a);
            strG = "";
        }
        lr6.l lVar = domain.e;
        String strName = lVar != null ? lVar.name() : null;
        String strG4 = u1.g(domain.f, mra.d.s());
        FreelancerOrderCustomer freelancerOrderCustomer = domain.f73292g;
        h0 h0Var = freelancerOrderCustomer != null ? new h0(freelancerOrderCustomer.f73305a, freelancerOrderCustomer.f73306b, freelancerOrderCustomer.f73307c) : null;
        FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetails = domain.f73293h;
        if (freelancerOrderInvoiceDetails != null) {
            Intrinsics.checkNotNullParameter(freelancerOrderInvoiceDetails, "<this>");
            String str8 = freelancerOrderInvoiceDetails.f73450a;
            String str9 = freelancerOrderInvoiceDetails.f73452c;
            String strName2 = freelancerOrderInvoiceDetails.f73451b.name();
            long millis = freelancerOrderInvoiceDetails.d.getMillis();
            DateTime dateTime = freelancerOrderInvoiceDetails.e;
            Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
            DateTime dateTime2 = freelancerOrderInvoiceDetails.f;
            j0Var = new j0(str8, strName2, str9, millis, lValueOf, dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null, freelancerOrderInvoiceDetails.f73453g.getMillis(), freelancerOrderInvoiceDetails.f73454h.getMillis());
        } else {
            j0Var = null;
        }
        String str10 = domain.i;
        dj0.d dVar = domain.f73294j;
        long j2 = dVar.f115082a;
        String str11 = dVar.f115083b.f306286a;
        dj0.d dVar2 = domain.k;
        jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
        String str12 = strName;
        dj0.d dVar3 = domain.f73295l;
        jo3.b bVarA2 = dVar3 != null ? hx7.a.A(dVar3) : null;
        dj0.d dVar4 = domain.f73296m;
        jo3.b bVarA3 = dVar4 != null ? hx7.a.A(dVar4) : null;
        String str13 = domain.f73297n;
        String str14 = domain.o;
        List list = domain.f73298p;
        if (list != null) {
            List list2 = list;
            str = str6;
            str2 = strG3;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(d((FreelancerOrder) it8.next()));
            }
        } else {
            str = str6;
            str2 = strG3;
            arrayList = null;
        }
        List list3 = domain.f73299q;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = arrayList;
            arrayList3 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                FreelancerOrderTransaction freelancerOrderTransaction = (FreelancerOrderTransaction) it9.next();
                Intrinsics.checkNotNullParameter(freelancerOrderTransaction, "<this>");
                String str15 = freelancerOrderTransaction.f73312a;
                Iterator it10 = it9;
                String strG5 = u1.g(freelancerOrderTransaction.f73313b, n14.e.n());
                String strG6 = u1.g(freelancerOrderTransaction.f73314c, n14.e.o());
                k0 k0Var = freelancerOrderTransaction.d;
                String strName3 = k0Var != null ? k0Var.name() : null;
                String strName4 = freelancerOrderTransaction.e.name();
                String str16 = freelancerOrderTransaction.f;
                lr6.a aVar2 = freelancerOrderTransaction.f73315g;
                String strName5 = aVar2 != null ? aVar2.name() : null;
                FreelancerTaxAllocation freelancerTaxAllocation = freelancerOrderTransaction.f73317j;
                if (freelancerTaxAllocation != null) {
                    Intrinsics.checkNotNullParameter(freelancerTaxAllocation, "<this>");
                    str4 = str16;
                    str5 = str7;
                    o0Var = new o0(freelancerTaxAllocation.f73334b, freelancerTaxAllocation.f73333a);
                } else {
                    str4 = str16;
                    str5 = str7;
                    o0Var = null;
                }
                dj0.d dVar5 = freelancerOrderTransaction.f73316h;
                jo3.b bVarA4 = dVar5 != null ? hx7.a.A(dVar5) : null;
                dj0.d dVar6 = freelancerOrderTransaction.i;
                arrayList3.add(new l0(str15, str4, strG5, strG6, strName3, strName4, strName5, o0Var, bVarA4, dVar6 != null ? hx7.a.A(dVar6) : null));
                it9 = it10;
                str7 = str5;
            }
        } else {
            arrayList2 = arrayList;
            arrayList3 = null;
        }
        String str17 = str7;
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails = domain.f73300r;
        if (freelancerOriginalOrderDetails != null) {
            Intrinsics.checkNotNullParameter(freelancerOriginalOrderDetails, "<this>");
            String str18 = freelancerOriginalOrderDetails.f73318a;
            String str19 = freelancerOriginalOrderDetails.f73319b;
            String strG7 = u1.g(freelancerOriginalOrderDetails.f73320c, mra.d.s());
            String strG8 = u1.g(freelancerOriginalOrderDetails.d, mra.d.r());
            lr6.k kVar2 = freelancerOriginalOrderDetails.e;
            if (kVar2 != null) {
                strG2 = u1.g(kVar2, mra.d.q());
            } else {
                m70.a.c(t0.f186434a);
                strG2 = "";
            }
            m0Var = new m0(str18, str19, strG8, strG7, strG2);
        } else {
            m0Var = null;
        }
        List list5 = domain.f73301s;
        if (list5 != null) {
            List list6 = list5;
            ArrayList arrayList7 = new ArrayList(zhm.w.t(list6, 10));
            Iterator it11 = list6.iterator();
            while (it11.hasNext()) {
                CatalogueLineItem catalogueLineItem = (CatalogueLineItem) it11.next();
                String str20 = catalogueLineItem.f60672a;
                String strB = catalogueLineItem.f60673b.b();
                ArrayList arrayList8 = arrayList3;
                long j3 = catalogueLineItem.f60674c;
                Iterator it12 = it11;
                CatalogueLineItem.Quantity quantity = catalogueLineItem.d;
                u.a aVar3 = new u.a(quantity.f60678a, quantity.f60679b.b());
                List list7 = catalogueLineItem.e;
                if (list7 != null) {
                    List list8 = list7;
                    aVar = aVar3;
                    str3 = strG;
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(list8, 10));
                    Iterator it13 = list8.iterator();
                    while (it13.hasNext()) {
                        CatalogueLineItem.Tax tax = (CatalogueLineItem.Tax) it13.next();
                        arrayList9.add(new u.b(tax.f60680a, tax.f60681b, tax.f60682c, tax.d));
                        it13 = it13;
                        bVarA = bVarA;
                    }
                    arrayList6 = arrayList9;
                } else {
                    aVar = aVar3;
                    str3 = strG;
                    arrayList6 = null;
                }
                jo3.b bVar = bVarA;
                arrayList7.add(new ks6.u(str20, strB, j3, aVar, arrayList6, catalogueLineItem.f, catalogueLineItem.f60675g, catalogueLineItem.f60676h, catalogueLineItem.i, catalogueLineItem.k));
                arrayList3 = arrayList8;
                it11 = it12;
                strG = str3;
                bVarA = bVar;
            }
            arrayList4 = arrayList7;
        } else {
            arrayList4 = null;
        }
        ArrayList arrayList10 = arrayList3;
        String str21 = strG;
        jo3.b bVar2 = bVarA;
        List list9 = domain.f73302t;
        if (list9 != null) {
            List<FreelancerOrderPayment> list10 = list9;
            arrayList5 = new ArrayList(zhm.w.t(list10, 10));
            for (FreelancerOrderPayment freelancerOrderPayment : list10) {
                arrayList5.add(new ks6.k0(freelancerOrderPayment.f73308a, freelancerOrderPayment.f73309b.name()));
            }
        } else {
            arrayList5 = null;
        }
        long millis2 = domain.v.getMillis();
        long millis3 = domain.f73303w.getMillis();
        long millis4 = domain.f73304x.getMillis();
        List list11 = domain.u;
        ArrayList arrayList11 = new ArrayList(zhm.w.t(list11, 10));
        for (Iterator it14 = list11.iterator(); it14.hasNext(); it14 = it14) {
            arrayList11.add(u1.g((lr6.q) it14.next(), a()));
        }
        return new i0(str, str2, str17, str21, str12, strG4, h0Var, j0Var, str10, j2, str11, bVar2, bVarA2, bVarA3, str13, str14, arrayList2, arrayList10, m0Var, arrayList4, arrayList5, millis2, millis3, millis4, arrayList11);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.freelancer.common.models.FreelancerOrder b(com.revolut.feature.freelancer.impl.network.models.v r47) {
        /*
            Method dump skipped, instruction units count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft6.u.b(com.revolut.feature.freelancer.impl.network.models.v):com.revolut.feature.freelancer.common.models.FreelancerOrder");
    }
}
