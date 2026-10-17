package kue;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import hx7.l;
import io3.b;
import ive.a;
import java.time.Instant;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import rd0.c;
import sue.h;
import sue.j;
import yte.d;
import yte.e;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final e a(j jVar) {
        d dVar;
        d dVar2;
        TopupMethodType topupMethodType;
        TopupMethodType topupMethodType2;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f265739a;
        String str2 = jVar.f265741c;
        String str3 = jVar.f265740b;
        d[] dVarArrValues = d.values();
        int length = dVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i2];
            if (a0.z(dVar.name(), str3, true)) {
                break;
            }
            i2++;
        }
        if (dVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("State can't be parsed for India Stored method details: ", str3));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        TopupMethodType[] topupMethodTypeArrValues = TopupMethodType.values();
        int length2 = topupMethodTypeArrValues.length;
        while (true) {
            if (i >= length2) {
                topupMethodType = null;
                break;
            }
            topupMethodType = topupMethodTypeArrValues[i];
            if (a0.z(topupMethodType.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (topupMethodType == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Type can't be parsed for India Stored method details: ", str2));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalArgumentException2, h0Var2);
            topupMethodType2 = null;
        } else {
            topupMethodType2 = topupMethodType;
        }
        String str4 = jVar.d;
        Long l2 = jVar.f;
        Instant instantOfEpochMilli = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        que.a aVar = jVar.f265742g;
        b bVarB = aVar != null ? l.B(aVar) : null;
        h hVar = jVar.f265743h;
        return new e(str, dVar2, topupMethodType2, str4, instantOfEpochMilli, bVarB, hVar != null ? new yte.c(hVar.f265737a, hVar.f265738b) : null, jVar.e);
    }

    public static final ive.a b(e eVar) {
        a.d dVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String str = eVar.f316707a;
        d dVar2 = eVar.f316708b;
        String strName = dVar2 != null ? dVar2.name() : null;
        if (strName == null) {
            strName = "";
        }
        TopupMethodType topupMethodType = eVar.f316709c;
        String strName2 = topupMethodType != null ? topupMethodType.name() : null;
        String str2 = strName2 != null ? strName2 : "";
        String str3 = eVar.d;
        Instant instant = eVar.e;
        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
        b bVar = eVar.f;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            dVar = new a.d(bVar.f163142a.name(), bVar.f163143b);
        } else {
            dVar = null;
        }
        yte.c cVar = eVar.f316710g;
        return new ive.a(str, strName, str2, str3, eVar.f316711h, lValueOf, dVar, cVar != null ? new a.b(cVar.f316705a, cVar.f316706b) : null);
    }
}
