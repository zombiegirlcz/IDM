package jwi;

import gwi.t;
import iwi.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import svi.g;
import svi.i;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f179010a = w.y0(new jsl.b(23));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final ArrayList a(List list) {
        List<svi.h> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (svi.h hVar : list2) {
            ?? r3 = f179010a;
            Object value = r3.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            String strPrint = ((DateTimeFormatter) value).print(hVar.f265914a);
            Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
            Object value2 = r3.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            String strPrint2 = ((DateTimeFormatter) value2).print(hVar.f265915b);
            Intrinsics.checkNotNullExpressionValue(strPrint2, "print(...)");
            arrayList.add(new e.a(strPrint, strPrint2));
        }
        return arrayList;
    }

    public static final List b(List list) {
        List<t> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (t tVar : list2) {
            arrayList.add(new svi.h(g(tVar.f147517a), g(tVar.f147518b)));
        }
        return d0.P0(arrayList, new a());
    }

    public static final ArrayList c(List list) {
        List<e.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (e.a aVar : list2) {
            arrayList.add(new svi.h(g(aVar.getOpen()), g(aVar.getClose())));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        if (r1.equals("special") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r11 = r11.f147555b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        if (r11 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        return new svi.f(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1.equals("first_last_flight") == false) goto L52;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final svi.g d(gwi.x r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jwi.b.d(gwi.x):svi.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final svi.g e(iwi.e r11) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jwi.b.e(iwi.e):svi.g");
    }

    public static final iwi.e f(svi.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof g.a) {
            return new iwi.e("24h", null, null);
        }
        if (gVar instanceof svi.f) {
            return new iwi.e("special", ((svi.f) gVar).f265902a, null);
        }
        if (!(gVar instanceof i)) {
            if (gVar instanceof g.b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Map map = ((i) gVar).f265920a;
        List list = (List) map.get(1);
        ArrayList arrayListA = list != null ? a(list) : null;
        List list2 = (List) map.get(2);
        ArrayList arrayListA2 = list2 != null ? a(list2) : null;
        List list3 = (List) map.get(3);
        ArrayList arrayListA3 = list3 != null ? a(list3) : null;
        List list4 = (List) map.get(4);
        ArrayList arrayListA4 = list4 != null ? a(list4) : null;
        List list5 = (List) map.get(5);
        ArrayList arrayListA5 = list5 != null ? a(list5) : null;
        List list6 = (List) map.get(6);
        ArrayList arrayListA6 = list6 != null ? a(list6) : null;
        List list7 = (List) map.get(7);
        return new iwi.e("weekly_schedule", null, new e.b(arrayListA, arrayListA2, arrayListA3, arrayListA4, arrayListA5, arrayListA6, list7 != null ? a(list7) : null));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final LocalTime g(String str) {
        if (Intrinsics.f(str, "24:00")) {
            LocalTime MIDNIGHT = LocalTime.MIDNIGHT;
            Intrinsics.checkNotNullExpressionValue(MIDNIGHT, "MIDNIGHT");
            return MIDNIGHT;
        }
        Object value = f179010a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LocalTime localTime = LocalTime.parse(str, (DateTimeFormatter) value);
        Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
        return localTime;
    }
}
