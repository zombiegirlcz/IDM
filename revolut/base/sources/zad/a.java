package zad;

import abd.c;
import abd.d;
import com.revolut.feature.shared.order_initiation.api.domain.CustomFieldDefinition;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import vad.e;
import vad.f;
import xi0.b;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final OrderInitiationPage a(d dVar) {
        OrderInitiationPage.Usage usage;
        f fVar;
        e eVar;
        dj0.d dVar2;
        b bVarA;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String str = dVar.f2938a;
        String str2 = dVar.f2941g;
        Long l2 = dVar.f;
        Integer num = dVar.k;
        LocalDateTime localDateTimeY = oi0.d.Y(dVar.f2939b);
        String str3 = dVar.f2940c;
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i = 0;
        while (true) {
            usage = null;
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i];
            if (a0.z(fVar.name(), str3, true)) {
                break;
            }
            i++;
        }
        if (fVar == null) {
            fVar = f.UNKNOWN;
        }
        String str4 = dVar.d;
        e[] eVarArrValues = e.values();
        int length2 = eVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i2];
            if (a0.z(eVar.name(), str4, true)) {
                break;
            }
            i2++;
        }
        if (eVar == null) {
            eVar = e.UNKNOWN;
        }
        String str5 = dVar.e;
        if (l2 == null || str2 == null) {
            dVar2 = null;
        } else {
            if (l2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            long jLongValue = l2.longValue();
            xi0.a aVar = b.Companion;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.getClass();
            dVar2 = new dj0.d(jLongValue, xi0.a.a(str2));
        }
        String str6 = dVar.f2942h;
        if (str6 != null) {
            b.Companion.getClass();
            bVarA = xi0.a.a(str6);
        } else {
            bVarA = null;
        }
        String str7 = dVar.i;
        Integer num2 = dVar.f2943j;
        if (num2 != null && num != null) {
            if (num2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = num2.intValue();
            if (num == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            usage = new OrderInitiationPage.Usage(iIntValue, num.intValue());
        }
        OrderInitiationPage.Usage usage2 = usage;
        int iIntValue2 = num != null ? num.intValue() : 0;
        e eVar2 = eVar;
        Integer num3 = dVar.f2943j;
        List<c> list = dVar.f2944l;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (c cVar : list) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new CustomFieldDefinition(cVar.f2936a, cVar.f2937b));
        }
        return new OrderInitiationPage(str, localDateTimeY, fVar, eVar2, str5, dVar2, bVarA, str7, usage2, null, null, iIntValue2, num3, arrayList);
    }

    public static final d b(OrderInitiationPage orderInitiationPage) {
        b bVar;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(orderInitiationPage, "<this>");
        String str2 = orderInitiationPage.f86427a;
        OrderInitiationPage.Usage usage = orderInitiationPage.i;
        long jR = oi0.d.R(orderInitiationPage.f86428b);
        String strName = orderInitiationPage.f86429c.name();
        String strName2 = orderInitiationPage.d.name();
        String str3 = orderInitiationPage.e;
        dj0.d dVar = orderInitiationPage.f;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
        String str4 = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
        b bVar2 = orderInitiationPage.f86430g;
        String str5 = bVar2 != null ? bVar2.f306286a : null;
        String str6 = orderInitiationPage.f86431h;
        Integer numValueOf = usage != null ? Integer.valueOf(usage.f86436a) : null;
        Integer numValueOf2 = usage != null ? Integer.valueOf(usage.f86437b) : null;
        List list = orderInitiationPage.f86435n;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            CustomFieldDefinition customFieldDefinition = (CustomFieldDefinition) it8.next();
            Intrinsics.checkNotNullParameter(customFieldDefinition, str);
            arrayList.add(new c(customFieldDefinition.f86425a, customFieldDefinition.f86426b));
            it8 = it8;
            str = str;
        }
        return new d(str2, jR, strName, strName2, str3, lValueOf, str4, str5, str6, numValueOf, numValueOf2, arrayList);
    }
}
