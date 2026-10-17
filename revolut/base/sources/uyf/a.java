package uyf;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingTransaction;
import com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRefund;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAddress;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingTicket;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBrief;
import com.revolut.feature.travel.experiences.api.models.visitors.TravelExperiencesVisitorsCount;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationCondition;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import cp5.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import rzf.g;
import zhm.w;
import zyf.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking a(gzf.d r26) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uyf.a.a(gzf.d):com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking b(u0g.a r27) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uyf.a.b(u0g.a):com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking");
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.Map] */
    public static final u0g.a c(TravelExperiencesBooking travelExperiencesBooking) {
        String str;
        rzf.b bVar;
        ArrayList arrayList;
        hzf.b bVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        g gVar;
        ArrayList arrayList2;
        hzf.a aVar;
        jzf.b bVar3;
        ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(travelExperiencesBooking, "<this>");
        String str7 = travelExperiencesBooking.f92746a;
        iyf.c cVar = travelExperiencesBooking.f92747b;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String string = cVar.toString();
        String string2 = travelExperiencesBooking.f92748c.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = travelExperiencesBooking.d.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String str8 = travelExperiencesBooking.e;
        TravelExperienceBrief travelExperienceBrief = travelExperiencesBooking.f;
        Intrinsics.checkNotNullParameter(travelExperienceBrief, "<this>");
        String str9 = travelExperienceBrief.f92804a;
        String str10 = travelExperienceBrief.f92805b;
        List list = travelExperienceBrief.f92806c;
        TravelExperienceAddress travelExperienceAddress = travelExperienceBrief.d;
        if (travelExperienceAddress != null) {
            Intrinsics.checkNotNullParameter(travelExperienceAddress, "<this>");
            str = str7;
            bVar = new rzf.b(travelExperienceAddress.f92780a, travelExperienceAddress.f92781b, travelExperienceAddress.f92782c, travelExperienceAddress.d, travelExperienceAddress.e, travelExperienceAddress.f);
        } else {
            str = str7;
            bVar = null;
        }
        g gVar2 = new g(str9, str10, list, bVar);
        List list2 = travelExperiencesBooking.f92749g;
        if (list2 != null) {
            List<TravelExperiencesVisitorsCount> list3 = list2;
            arrayList = new ArrayList(w.t(list3, 10));
            for (TravelExperiencesVisitorsCount travelExperiencesVisitorsCount : list3) {
                Intrinsics.checkNotNullParameter(travelExperiencesVisitorsCount, "<this>");
                arrayList.add(new h0g.a(travelExperiencesVisitorsCount.f92917a, u1.g(travelExperiencesVisitorsCount.f92918b, f.f326460a)));
            }
        } else {
            arrayList = null;
        }
        iyf.a aVar2 = travelExperiencesBooking.f92750h;
        String string4 = aVar2 != null ? aVar2.toString() : null;
        TravelExperienceBookingTicket travelExperienceBookingTicket = travelExperiencesBooking.i;
        if (travelExperienceBookingTicket != null) {
            Object obj2 = b.f284334a;
            Intrinsics.checkNotNullParameter(travelExperienceBookingTicket, "<this>");
            bVar2 = new hzf.b(travelExperienceBookingTicket.f92801a, u1.g(travelExperienceBookingTicket.f92802b, b.f284334a), u1.g(travelExperienceBookingTicket.f92803c, b.f284335b));
        } else {
            bVar2 = null;
        }
        a0g.b bVarL = ebm.a.L(travelExperiencesBooking.k);
        iyf.b bVar4 = travelExperiencesBooking.f92752l;
        String string5 = bVar4 != null ? bVar4.toString() : null;
        lzf.a aVarE0 = ue8.c.e0(travelExperiencesBooking.f92751j);
        String str11 = travelExperiencesBooking.f92753m;
        TravelExperienceCancellationPolicy.Booking booking = travelExperiencesBooking.f92754n;
        if (booking != null) {
            Intrinsics.checkNotNullParameter(booking, "<this>");
            str2 = string4;
            boolean z = booking.f93179a;
            str3 = string;
            boolean z3 = booking.f93180b;
            str4 = string2;
            ArrayList arrayList4 = booking.f93181c;
            str5 = string3;
            str6 = str8;
            gVar = gVar2;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                TravelExperienceCancellationCondition travelExperienceCancellationCondition = (TravelExperienceCancellationCondition) it8.next();
                Object obj3 = vyf.a.f293317a;
                Intrinsics.checkNotNullParameter(travelExperienceCancellationCondition, "<this>");
                arrayList5.add(new jzf.a(u1.g(travelExperienceCancellationCondition.f93177a, vyf.a.f293317a), travelExperienceCancellationCondition.f93178b));
                it8 = it8;
                arrayList = arrayList;
            }
            arrayList2 = arrayList;
            ArrayList arrayList6 = booking.d;
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                TravelExperienceCancellationWindow.Booking booking2 = (TravelExperienceCancellationWindow.Booking) it9.next();
                Intrinsics.checkNotNullParameter(booking2, "<this>");
                String string6 = booking2.f93185a.toString();
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                Iterator it10 = it9;
                String string7 = booking2.f93186b.toString();
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                arrayList7.add(new rzf.f(string6, string7, booking2.f93187c));
                it9 = it10;
            }
            aVar = new hzf.a(z, z3, arrayList5, arrayList7);
        } else {
            str2 = string4;
            str3 = string;
            str4 = string2;
            str5 = string3;
            str6 = str8;
            gVar = gVar2;
            arrayList2 = arrayList;
            aVar = null;
        }
        TravelExperienceCancellationRefund travelExperienceCancellationRefund = travelExperiencesBooking.o;
        if (travelExperienceCancellationRefund != null) {
            Intrinsics.checkNotNullParameter(travelExperienceCancellationRefund, "<this>");
            bVar3 = new jzf.b(hx7.a.A(travelExperienceCancellationRefund.f92770a), hx7.a.A(travelExperienceCancellationRefund.f92771b), hx7.a.A(travelExperienceCancellationRefund.f92772c));
        } else {
            bVar3 = null;
        }
        List list4 = travelExperiencesBooking.f92755p;
        if (list4 != null) {
            List<TravelExperiencesBookingTransaction> list5 = list4;
            arrayList3 = new ArrayList(w.t(list5, 10));
            for (TravelExperiencesBookingTransaction travelExperiencesBookingTransaction : list5) {
                Object obj4 = c.f284336a;
                Intrinsics.checkNotNullParameter(travelExperiencesBookingTransaction, "<this>");
                arrayList3.add(new hzf.c(travelExperiencesBookingTransaction.f92767a, u1.g(travelExperiencesBookingTransaction.f92768b, c.f284336a), travelExperiencesBookingTransaction.f92769c.name(), travelExperiencesBookingTransaction.d.name()));
            }
        } else {
            arrayList3 = null;
        }
        Double d = travelExperiencesBooking.f92756q;
        String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
        TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesBooking.f92757r;
        jzf.b bVar5 = bVar3;
        return new u0g.a(str, str3, str4, str5, str6, gVar, arrayList2, str2, bVar2, bVarL, string5, aVarE0, str11, aVar, bVar5, arrayList3, strValueOf, travelExperiencesPointsOption != null ? d.Z(travelExperiencesPointsOption) : null);
    }
}
