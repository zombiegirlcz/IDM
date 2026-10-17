package suj;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.rev_points.models.Logo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.m;
import no3.b;
import puj.d;
import puj.e;
import quj.h;
import quj.k;
import quj.l;
import rd0.c;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final e a(l lVar) {
        String str;
        String str2;
        String str3;
        Address address;
        Logo logo;
        m1c.l lVar2;
        String str4 = "<this>";
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str5 = lVar.f249477a;
        String str6 = lVar.f249478b;
        String str7 = lVar.f249479c;
        String str8 = lVar.d;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.parse(str8, dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
        LocalDateTime localDateTime2 = LocalDateTime.parse(lVar.e, dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(...)");
        String str9 = lVar.f;
        String str10 = lVar.f249480g;
        List list = lVar.f249481h;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            h hVar = (h) it8.next();
            LocalDateTime localDateTime3 = LocalDateTime.parse(hVar.f249468a, DateTimeFormatter.ISO_DATE_TIME);
            Intrinsics.checkNotNullExpressionValue(localDateTime3, "parse(...)");
            List<k> list2 = hVar.f249469b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i));
            for (k kVar : list2) {
                String str11 = kVar.f249471a;
                Iterator it9 = it8;
                boolean z = kVar.f249472b;
                String str12 = kVar.f249473c;
                String str13 = kVar.d;
                String str14 = kVar.e;
                d dVarC = c(kVar.f);
                m mVar = kVar.f249474g;
                LocalDateTime localDateTime4 = localDateTime;
                if (mVar != null) {
                    Intrinsics.checkNotNullParameter(mVar, str4);
                    String logo2 = mVar.getLogo();
                    String type = mVar.getType();
                    str = str4;
                    m1c.l[] lVarArrValues = m1c.l.values();
                    str2 = str5;
                    int length = lVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            lVar2 = null;
                            break;
                        }
                        lVar2 = lVarArrValues[i2];
                        int i3 = i2;
                        int i5 = length;
                        if (a0.z(lVar2.name(), type, true)) {
                            break;
                        }
                        i2 = i3 + 1;
                        length = i5;
                    }
                    if (lVar2 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown Logo.Type value: ", mVar.getType()));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        str3 = str6;
                        address = null;
                        rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
                        lVar2 = m1c.l.UNKNOWN;
                    } else {
                        str3 = str6;
                        address = null;
                    }
                    logo = new Logo(logo2, lVar2);
                } else {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    address = null;
                    logo = null;
                }
                b bVar = kVar.f249475h;
                Address addressA = bVar != null ? oo3.a.a(bVar) : address;
                String str15 = kVar.i;
                puj.c cVarB = b(kVar.f249476j);
                LocalDateTime localDateTime5 = LocalDateTime.parse(kVar.k, DateTimeFormatter.ISO_DATE_TIME);
                Intrinsics.checkNotNullExpressionValue(localDateTime5, "parse(...)");
                arrayList2.add(new puj.b(str11, z, str12, str13, str14, dVarC, logo, addressA, str15, cVarB, localDateTime5));
                it8 = it9;
                localDateTime = localDateTime4;
                str4 = str;
                str5 = str2;
                str6 = str3;
            }
            arrayList.add(new puj.a(localDateTime3, arrayList2));
            it8 = it8;
            i = 10;
        }
        return new e(str5, str6, str7, localDateTime, localDateTime2, str9, str10, arrayList);
    }

    public static final puj.c b(String str) {
        puj.c cVar;
        puj.c[] cVarArrValues = puj.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (a0.z(cVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (cVar != null) {
            return cVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown ItemType value: ", str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
        return puj.c.UNKNOWN;
    }

    public static final d c(String str) {
        d dVar;
        d[] dVarArrValues = d.values();
        int length = dVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i];
            if (a0.z(dVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            return dVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown SubtitleColor value: ", str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
        return d.NEUTRAL;
    }
}
