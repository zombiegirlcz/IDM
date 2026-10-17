package vuf;

import com.revolut.feature.transport.models.TransportTicketLogo;
import com.revolut.feature.transport.models.TransportTicketProvider;
import com.revolut.feature.transport.models.TransportTicketQrCode;
import com.revolut.feature.transport.models.fields.TransportDetailsField;
import com.revolut.feature.transport.models.fields.TransportDetailsFieldValue;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicketActivationParams;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicketValidity;
import com.revolut.feature.transport.models.transit.PurchasedTransportTicketActivationProviderParams;
import com.revolut.feature.transport.models.transit.TransitTicketDescription;
import com.revolut.feature.transport.models.transit.TransitTicketType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final TransportTicketProvider a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String str = sVar.f292392a;
        r rVar = sVar.f292393b;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        zwf.a aVar = zwf.b.Companion;
        String str2 = rVar.f292390a;
        aVar.getClass();
        return new TransportTicketProvider(str, new TransportTicketLogo(zwf.a.a(str2), rVar.f292391b));
    }

    public static final TransportDetailsField b(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String str = oVar.f292385a;
        String str2 = oVar.f292386b;
        q qVar = oVar.f292387c;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return new TransportDetailsField(str, str2, new TransportDetailsFieldValue(qVar.f292388a, qVar.f292389b));
    }

    public static final PurchasedTransitTicket c(e eVar, LocalDateTime now) {
        ArrayList arrayList;
        PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams;
        PurchasedTransitTicketValidity purchasedTransitTicketValidity;
        LocalDateTime localDateTimeD0;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        f fVar = eVar.d;
        String str = eVar.f292353c;
        List list = eVar.f292361q;
        List list2 = eVar.f292360p;
        jo3.b bVar = eVar.f292359n;
        s sVar = eVar.f292358m;
        String str2 = eVar.f292357l;
        long j2 = eVar.f292356j;
        m mVar = eVar.f292354g;
        n nVar = eVar.f;
        int i = a.f292346a[fVar.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            String str3 = eVar.f292351a;
            String str4 = eVar.f292352b;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str5 = eVar.e;
            TransitTicketType transitTicketTypeE = e(nVar);
            TransitTicketDescription transitTicketDescriptionD = d(mVar);
            List list3 = eVar.f292355h;
            List list4 = eVar.i;
            LocalDateTime localDateTimeD02 = oi0.d.d0(j2);
            String str6 = eVar.k;
            wi0.b.Companion.getClass();
            wi0.b bVarA = wi0.a.a(str2);
            TransportTicketProvider transportTicketProviderA = a(sVar);
            if (bVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dj0.d dVarV = hx7.a.v(bVar);
            String str7 = eVar.o;
            List list5 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
            Iterator it8 = list5.iterator();
            while (it8.hasNext()) {
                arrayList2.add(b((o) it8.next()));
            }
            List list6 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
            Iterator it9 = list6.iterator();
            while (it9.hasNext()) {
                arrayList3.add(b((o) it9.next()));
            }
            String str8 = eVar.f292362r;
            Boolean bool = eVar.f292363s;
            List list7 = eVar.v;
            ArrayList arrayList4 = new ArrayList(w.t(list7, 10));
            for (Iterator it10 = list7.iterator(); it10.hasNext(); it10 = it10) {
                c cVar = (c) it10.next();
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                arrayList4.add(new PurchasedTransitTicketActivationParams(cVar.f292347a, cVar.f292348b, bxf.b.valueOf(cVar.f292349c), cVar.d, cVar.e, cVar.f, cVar.f292350g));
            }
            l lVar = eVar.f292365w;
            if (lVar != null) {
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                arrayList = arrayList4;
                purchasedTransportTicketActivationProviderParams = new PurchasedTransportTicketActivationProviderParams(lVar.f292376a, lVar.f292377b, lVar.f292378c);
            } else {
                arrayList = arrayList4;
                purchasedTransportTicketActivationProviderParams = null;
            }
            Long l2 = eVar.f292366x;
            LocalDateTime localDateTimeD03 = l2 != null ? oi0.d.d0(l2.longValue()) : null;
            Long l3 = eVar.f292367y;
            return new PurchasedTransitTicket.ToBeActivated(str3, str4, str, str5, transitTicketTypeE, transitTicketDescriptionD, list3, list4, localDateTimeD02, str6, bVarA, transportTicketProviderA, dVarV, str7, arrayList2, arrayList3, str8, bool, arrayList, purchasedTransportTicketActivationProviderParams, localDateTimeD03, l3 != null ? oi0.d.d0(l3.longValue()) : null, eVar.B);
        }
        if (i == 2) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            Intrinsics.checkNotNullParameter(now, "now");
            g gVar = eVar.u;
            if (gVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            LocalDateTime localDateTimeD04 = oi0.d.d0(gVar.f292368a);
            LocalDateTime localDateTimeD05 = oi0.d.d0(gVar.f292369b);
            PurchasedTransitTicketValidity purchasedTransitTicketValidity2 = new PurchasedTransitTicketValidity(localDateTimeD04, localDateTimeD05);
            Intrinsics.checkNotNullParameter(now, "now");
            if (localDateTimeD05.isBefore(now)) {
                return h(eVar);
            }
            String str9 = eVar.f292351a;
            String str10 = eVar.f292352b;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str11 = eVar.e;
            TransitTicketType transitTicketTypeE2 = e(nVar);
            TransitTicketDescription transitTicketDescriptionD2 = d(mVar);
            List list8 = eVar.f292355h;
            List list9 = eVar.i;
            LocalDateTime localDateTimeD06 = oi0.d.d0(j2);
            String str12 = eVar.k;
            wi0.b.Companion.getClass();
            wi0.b bVarA2 = wi0.a.a(str2);
            TransportTicketProvider transportTicketProviderA2 = a(sVar);
            if (bVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dj0.d dVarV2 = hx7.a.v(bVar);
            String str13 = eVar.o;
            List list10 = list2;
            ArrayList arrayList5 = new ArrayList(w.t(list10, 10));
            Iterator it11 = list10.iterator();
            while (it11.hasNext()) {
                arrayList5.add(b((o) it11.next()));
            }
            List list11 = list;
            ArrayList arrayList6 = new ArrayList(w.t(list11, 10));
            Iterator it12 = list11.iterator();
            while (it12.hasNext()) {
                arrayList6.add(b((o) it12.next()));
            }
            String str14 = eVar.f292362r;
            Boolean bool2 = eVar.f292363s;
            t tVar = eVar.f292364t;
            if (tVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            zwf.c cVar2 = zwf.d.Companion;
            String str15 = tVar.f292394a;
            cVar2.getClass();
            TransportTicketQrCode transportTicketQrCode = new TransportTicketQrCode(zwf.c.a(str15), tVar.f292395b);
            Long l4 = eVar.z;
            if (l4 != null) {
                purchasedTransitTicketValidity = purchasedTransitTicketValidity2;
                localDateTimeD0 = oi0.d.d0(l4.longValue());
            } else {
                purchasedTransitTicketValidity = purchasedTransitTicketValidity2;
                localDateTimeD0 = null;
            }
            return new PurchasedTransitTicket.Activated(str9, str10, str, str11, transitTicketTypeE2, transitTicketDescriptionD2, list8, list9, localDateTimeD06, str12, bVarA2, transportTicketProviderA2, dVarV2, str13, arrayList5, arrayList6, str14, bool2, transportTicketQrCode, purchasedTransitTicketValidity, localDateTimeD0, eVar.A, eVar.B);
        }
        if (i == 3) {
            return h(eVar);
        }
        if (i == 4) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            String str16 = eVar.f292351a;
            String str17 = eVar.f292352b;
            String str18 = eVar.f292353c;
            String str19 = eVar.e;
            TransitTicketType transitTicketTypeE3 = e(nVar);
            TransitTicketDescription transitTicketDescriptionD3 = d(mVar);
            List list12 = eVar.f292355h;
            List list13 = eVar.i;
            LocalDateTime localDateTimeD07 = oi0.d.d0(j2);
            String str20 = eVar.k;
            wi0.b.Companion.getClass();
            wi0.b bVarA3 = wi0.a.a(str2);
            TransportTicketProvider transportTicketProviderA3 = a(sVar);
            dj0.d dVarV3 = bVar != null ? hx7.a.v(bVar) : null;
            String str21 = eVar.o;
            List list14 = list2;
            ArrayList arrayList7 = new ArrayList(w.t(list14, 10));
            Iterator it13 = list14.iterator();
            while (it13.hasNext()) {
                arrayList7.add(b((o) it13.next()));
            }
            List list15 = list;
            ArrayList arrayList8 = new ArrayList(w.t(list15, 10));
            Iterator it14 = list15.iterator();
            while (it14.hasNext()) {
                arrayList8.add(b((o) it14.next()));
            }
            return new PurchasedTransitTicket.Pending(str16, str17, str18, str19, transitTicketTypeE3, transitTicketDescriptionD3, list12, list13, localDateTimeD07, str20, bVarA3, transportTicketProviderA3, dVarV3, str21, arrayList7, arrayList8, eVar.f292362r, eVar.f292363s);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String str22 = eVar.f292351a;
        String str23 = eVar.f292352b;
        String str24 = eVar.f292353c;
        String str25 = eVar.e;
        TransitTicketType transitTicketTypeE4 = e(nVar);
        TransitTicketDescription transitTicketDescriptionD4 = d(mVar);
        List list16 = eVar.f292355h;
        List list17 = eVar.i;
        LocalDateTime localDateTimeD08 = oi0.d.d0(j2);
        String str26 = eVar.k;
        wi0.b.Companion.getClass();
        wi0.b bVarA4 = wi0.a.a(str2);
        TransportTicketProvider transportTicketProviderA4 = a(sVar);
        dj0.d dVarV4 = bVar != null ? hx7.a.v(bVar) : null;
        String str27 = eVar.o;
        List list18 = list2;
        ArrayList arrayList9 = new ArrayList(w.t(list18, 10));
        Iterator it15 = list18.iterator();
        while (it15.hasNext()) {
            arrayList9.add(b((o) it15.next()));
        }
        List list19 = list;
        ArrayList arrayList10 = new ArrayList(w.t(list19, 10));
        Iterator it16 = list19.iterator();
        while (it16.hasNext()) {
            arrayList10.add(b((o) it16.next()));
        }
        return new PurchasedTransitTicket.NotPurchased(str22, str23, str24, str25, transitTicketTypeE4, transitTicketDescriptionD4, list16, list17, localDateTimeD08, str26, bVarA4, transportTicketProviderA4, dVarV4, str27, arrayList9, arrayList10, eVar.f292362r, eVar.f292363s);
    }

    public static final TransitTicketDescription d(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new TransitTicketDescription(mVar.f292379a, mVar.f292380b, mVar.f292381c);
    }

    public static final TransitTicketType e(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        String str = nVar.f292382a;
        String str2 = nVar.f292383b;
        bxf.g gVar = bxf.h.Companion;
        String str3 = nVar.f292384c;
        gVar.getClass();
        return new TransitTicketType(str, str2, bxf.g.a(str3), nVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022f A[LOOP:1: B:92:0x0229->B:94:0x022f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258 A[LOOP:2: B:96:0x0252->B:98:0x0258, LOOP_END] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vuf.e f(com.revolut.feature.transport.models.transit.PurchasedTransitTicket r35, java.time.LocalDateTime r36) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vuf.b.f(com.revolut.feature.transport.models.transit.PurchasedTransitTicket, java.time.LocalDateTime):vuf.e");
    }

    public static final o g(TransportDetailsField transportDetailsField) {
        Intrinsics.checkNotNullParameter(transportDetailsField, "<this>");
        String str = transportDetailsField.f92625a;
        String str2 = transportDetailsField.f92626b;
        TransportDetailsFieldValue transportDetailsFieldValue = transportDetailsField.f92627c;
        Intrinsics.checkNotNullParameter(transportDetailsFieldValue, "<this>");
        return new o(str, str2, new q(transportDetailsFieldValue.f92628a, transportDetailsFieldValue.f92629b));
    }

    public static final PurchasedTransitTicket.Expired h(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String str = eVar.f292351a;
        String str2 = eVar.f292352b;
        String str3 = eVar.f292353c;
        if (str3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str4 = eVar.e;
        TransitTicketType transitTicketTypeE = e(eVar.f);
        TransitTicketDescription transitTicketDescriptionD = d(eVar.f292354g);
        List list = eVar.f292355h;
        List list2 = eVar.i;
        LocalDateTime localDateTimeD0 = oi0.d.d0(eVar.f292356j);
        String str5 = eVar.k;
        wi0.a aVar = wi0.b.Companion;
        String str6 = eVar.f292357l;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str6);
        TransportTicketProvider transportTicketProviderA = a(eVar.f292358m);
        jo3.b bVar = eVar.f292359n;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dj0.d dVarV = hx7.a.v(bVar);
        String str7 = eVar.o;
        List list3 = eVar.f292360p;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((o) it8.next()));
        }
        List list4 = eVar.f292361q;
        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
        Iterator it9 = list4.iterator();
        while (it9.hasNext()) {
            arrayList2.add(b((o) it9.next()));
        }
        String str8 = eVar.f292362r;
        Boolean bool = eVar.f292363s;
        g gVar = eVar.u;
        if (gVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new PurchasedTransitTicket.Expired(str, str2, str3, str4, transitTicketTypeE, transitTicketDescriptionD, list, list2, localDateTimeD0, str5, bVarA, transportTicketProviderA, dVarV, str7, arrayList, arrayList2, str8, bool, new PurchasedTransitTicketValidity(oi0.d.d0(gVar.f292368a), oi0.d.d0(gVar.f292369b)));
    }
}
