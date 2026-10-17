package rbd;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lcd.e;
import lcd.f;
import lcd.g;
import lcd.h;
import lcd.i;
import lcd.r;
import ncd.j;
import qbd.d0;
import qbd.e0;
import qbd.l;
import qbd.q;
import qbd.u;
import qbd.v;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final ArrayList a(String currentUserId, List list) {
        i iVarB;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            try {
                iVarB = b((v) it8.next(), currentUserId);
            } catch (Throwable th10) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, th10, h0Var);
                iVarB = null;
            }
            if (iVarB != null) {
                arrayList.add(iVarB);
            }
        }
        return arrayList;
    }

    public static final i b(v vVar, String currentUserId) {
        lcd.d dVar;
        Long l2;
        f fVar;
        dj0.d dVar2;
        lcd.a aVar;
        String str;
        j jVar;
        lcd.b bVar;
        String str2;
        dj0.d dVar3;
        String str3;
        String str4;
        h hVar;
        r rVar;
        e eVar;
        f fVar2;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        String str5 = vVar.f244208a;
        Long l3 = vVar.f244213j;
        jo3.a aVar2 = vVar.k;
        Long l4 = vVar.i;
        String str6 = vVar.f244209b;
        String str7 = vVar.f244210c;
        String str8 = vVar.d;
        String str9 = vVar.e;
        lcd.d[] dVarArrValues = lcd.d.values();
        int length = dVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i];
            if (a0.z(dVar.name(), str9, true)) {
                break;
            }
            i++;
        }
        if (dVar == null) {
            throw new IllegalArgumentException(j6.a.q("Unknown savings account state ", str9));
        }
        l lVar = vVar.f;
        if (lVar != null) {
            String str10 = lVar.f244196a;
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            e[] eVarArrValues = e.values();
            int length2 = eVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    l2 = l3;
                    eVar = null;
                    break;
                }
                e eVar2 = eVarArrValues[i2];
                l2 = l3;
                if (a0.z(eVar2.name(), str10, true)) {
                    eVar = eVar2;
                    break;
                }
                i2++;
                l3 = l2;
            }
            if (eVar != null) {
                fVar2 = new f(eVar, lVar.f244197b);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unsupported Savings account state reason type ", str10));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
                fVar2 = null;
            }
            fVar = fVar2;
        } else {
            l2 = l3;
            fVar = null;
        }
        String str11 = vVar.f244211g;
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(vVar.f244212h), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant, "ofInstant(...)");
        if (l4 != null) {
            long jLongValue = l4.longValue();
            xi0.a aVar3 = xi0.b.Companion;
            String currency = aVar2.getCurrency();
            aVar3.getClass();
            dVar2 = new dj0.d(jLongValue, xi0.a.a(currency));
        } else {
            dVar2 = null;
        }
        ZonedDateTime zonedDateTimeOfInstant2 = l2 != null ? ZonedDateTime.ofInstant(Instant.ofEpochMilli(l2.longValue()), ZoneId.systemDefault()) : null;
        dj0.d dVarO = mo3.a.o(aVar2);
        String str12 = vVar.f244214l;
        String str13 = vVar.f244215m;
        lcd.a[] aVarArrValues = lcd.a.values();
        int length3 = aVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i3];
            int i5 = length3;
            int i6 = i3;
            if (a0.z(aVar.name(), str13, true)) {
                break;
            }
            i3 = i6 + 1;
            length3 = i5;
        }
        if (aVar == null) {
            aVar = lcd.a.UNKNOWN;
        }
        int i21 = a.f253024b[aVar.ordinal()];
        if (i21 != 1 && i21 != 2 && i21 != 3 && i21 != 4) {
            if (i21 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = Intrinsics.f(str12, currentUserId) ? lcd.a.PERSONAL : lcd.a.TEEN;
        }
        e0 e0Var = vVar.o;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        ncd.i iVarV = cp5.d.V(e0Var.f244182a);
        d0 d0Var = e0Var.f244183b;
        j jVar2 = new j(iVarV, d0Var != null ? cp5.d.V(d0Var) : null);
        String str14 = vVar.f244217p;
        String str15 = vVar.f244216n;
        if (str15 != null) {
            lcd.b[] bVarArrValues = lcd.b.values();
            int length4 = bVarArrValues.length;
            str = str14;
            int i22 = 0;
            while (i22 < length4) {
                bVar = bVarArrValues[i22];
                int i32 = i22;
                jVar = jVar2;
                if (a0.z(bVar.name(), str15, true)) {
                    break;
                }
                i22 = i32 + 1;
                jVar2 = jVar;
            }
        } else {
            str = str14;
        }
        jVar = jVar2;
        bVar = null;
        String str16 = vVar.f244218q;
        jo3.a aVar4 = vVar.f244219r;
        dj0.d dVarO2 = aVar4 != null ? mo3.a.o(aVar4) : null;
        qbd.r rVar2 = vVar.f244220s;
        if (rVar2 != null) {
            Intrinsics.checkNotNullParameter(rVar2, "<this>");
            String str17 = rVar2.f244203a;
            str2 = str16;
            q qVar = rVar2.f244204b;
            dVar3 = dVarO2;
            String str18 = qVar.f244200a;
            str3 = str5;
            str4 = str6;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(qVar.f244201b);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            hVar = new h(str17, new g(str18, qVar.f244202c, instantOfEpochMilli));
        } else {
            str2 = str16;
            dVar3 = dVarO2;
            str3 = str5;
            str4 = str6;
            hVar = null;
        }
        u uVar = vVar.f244221t;
        if (uVar != null) {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            rVar = new r(uVar.f244206a, uVar.f244207b);
        } else {
            rVar = null;
        }
        return new i(str3, str4, str7, str8, dVar, fVar, str11, zonedDateTimeOfInstant, dVar2, zonedDateTimeOfInstant2, dVarO, str12, aVar, jVar, str, bVar, str2, dVar3, hVar, rVar);
    }

    public static final qbd.a c(lcd.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i = a.f253023a[jVar.ordinal()];
        if (i == 1) {
            return qbd.a.BUY;
        }
        if (i == 2) {
            return qbd.a.SELL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final v d(i iVar) {
        l lVar;
        String str;
        e0 e0Var;
        String str2;
        jo3.a aVar;
        qbd.r rVar;
        u uVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str3 = iVar.f193848a;
        String str4 = iVar.f193849b;
        String str5 = iVar.f193850c;
        String str6 = iVar.d;
        String strName = iVar.e.name();
        f fVar = iVar.f;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            lVar = new l(fVar.f193841a.name(), fVar.f193842b);
        } else {
            lVar = null;
        }
        String str7 = iVar.f193851g;
        long jI = pu7.a.I(iVar.f193852h);
        dj0.d dVar = iVar.i;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
        ZonedDateTime zonedDateTime = iVar.f193853j;
        Long lValueOf2 = zonedDateTime != null ? Long.valueOf(pu7.a.I(zonedDateTime)) : null;
        jo3.a aVarP = mo3.a.p(iVar.k);
        String str8 = iVar.f193854l;
        lcd.b bVar = iVar.f193857p;
        String strName2 = bVar != null ? bVar.name() : null;
        String strName3 = iVar.f193855m.name();
        j jVar = iVar.f193856n;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        ncd.i iVar2 = jVar.f214177a;
        d0 d0Var = new d0(iVar2.f214174a, iVar2.f214175b, iVar2.f214176c.name());
        ncd.i iVar3 = jVar.f214178b;
        e0 e0Var2 = new e0(d0Var, iVar3 != null ? new d0(iVar3.f214174a, iVar3.f214175b, iVar3.f214176c.name()) : null);
        String str9 = iVar.o;
        String str10 = iVar.f193858q;
        dj0.d dVar2 = iVar.f193859r;
        jo3.a aVarP2 = dVar2 != null ? mo3.a.p(dVar2) : null;
        h hVar = iVar.f193860s;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            String str11 = hVar.f193846a;
            str = str9;
            g gVar = hVar.f193847b;
            e0Var = e0Var2;
            str2 = str10;
            aVar = aVarP2;
            rVar = new qbd.r(str11, new q(gVar.f193843a, gVar.f193844b.toEpochMilli(), gVar.f193845c));
        } else {
            str = str9;
            e0Var = e0Var2;
            str2 = str10;
            aVar = aVarP2;
            rVar = null;
        }
        r rVar2 = iVar.f193861t;
        if (rVar2 != null) {
            Intrinsics.checkNotNullParameter(rVar2, "<this>");
            uVar = new u(rVar2.f193868a, rVar2.f193869b);
        } else {
            uVar = null;
        }
        return new v(str3, str4, str5, str6, strName, lVar, str7, jI, lValueOf, lValueOf2, aVarP, str8, strName3, strName2, e0Var, str, str2, aVar, rVar, uVar);
    }
}
