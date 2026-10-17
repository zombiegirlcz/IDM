package f3b;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements f2b.b {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f131928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f131929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f131930c;

    public f(l80.e dateProvider, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        this.f131928a = diagnosticEventsTracker;
        this.f131929b = new LinkedHashMap();
        this.f131930c = h0.f322473a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(f3b.d r4, java.util.ArrayList r5) {
        /*
            java.util.Set r0 = r4.f131926b
            java.lang.String r4 = r4.f131925a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            r3 = r2
            f3b.a r3 = (f3b.a) r3
            java.lang.String r3 = r3.f131919b
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto Lf
            r1.add(r2)
            goto Lf
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r5.next()
            r3 = r2
            f3b.a r3 = (f3b.a) r3
            java.lang.String r3 = r3.f131919b
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L31
            r0.add(r2)
            goto L31
        L4a:
            int r4 = r1.size()
            int r5 = r0.size()
            r2 = 1
            if (r4 == r5) goto L57
            goto Lc3
        L57:
            r4 = 10
            int r4 = zhm.w.t(r1, r4)
            int r4 = zhm.q0.b(r4)
            r5 = 16
            if (r4 >= r5) goto L66
            r4 = r5
        L66:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L6f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r4.next()
            r3 = r1
            f3b.a r3 = (f3b.a) r3
            java.lang.String r3 = r3.f131918a
            r5.put(r3, r1)
            goto L6f
        L82:
            boolean r4 = r0.isEmpty()
            r1 = 0
            if (r4 == 0) goto L8a
            goto Lc4
        L8a:
            java.util.Iterator r4 = r0.iterator()
        L8e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r4.next()
            f3b.a r0 = (f3b.a) r0
            java.lang.String r3 = r0.f131918a
            java.lang.Object r3 = r5.get(r3)
            f3b.a r3 = (f3b.a) r3
            if (r3 == 0) goto Lc0
            java.math.BigDecimal r3 = r3.f131920c
            java.math.BigDecimal r0 = r0.f131920c
            if (r3 == 0) goto Lb7
            if (r0 != 0) goto Lad
            goto Lb7
        Lad:
            int r0 = r3.compareTo(r0)
            if (r0 != 0) goto Lb5
            r0 = r2
            goto Lbb
        Lb5:
            r0 = r1
            goto Lbb
        Lb7:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r3, r0)
        Lbb:
            if (r0 != 0) goto Lbe
            goto Lc0
        Lbe:
            r0 = r1
            goto Lc1
        Lc0:
            r0 = r2
        Lc1:
            if (r0 == 0) goto L8e
        Lc3:
            return r2
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3b.f.a(f3b.d, java.util.ArrayList):boolean");
    }

    public static e d(f fVar, e eVar, Long l2, String str) {
        long jB = eVar.b();
        fVar.getClass();
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            String instrumentRef = cVar.f131921a;
            String positionId = cVar.f131922b;
            Set baselinePositions = cVar.f131923c;
            Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            Intrinsics.checkNotNullParameter(baselinePositions, "baselinePositions");
            return new c(instrumentRef, positionId, baselinePositions, jB, true, l2, str);
        }
        if (!(eVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = (d) eVar;
        String instrumentRef2 = dVar.f131925a;
        Set baselinePositions2 = dVar.f131926b;
        Intrinsics.checkNotNullParameter(instrumentRef2, "instrumentRef");
        Intrinsics.checkNotNullParameter(baselinePositions2, "baselinePositions");
        return new d(instrumentRef2, baselinePositions2, jB, true, l2, str);
    }

    public final void b(String str, f2b.a aVar) {
        String str2;
        LinkedHashMap linkedHashMap = this.f131929b;
        e eVar = (e) linkedHashMap.get(str);
        if (eVar == null) {
            return;
        }
        linkedHashMap.remove(str);
        if (eVar instanceof c) {
            str2 = "cfd_close_position_to_visible";
        } else {
            if (!(eVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "cfd_order_to_visible";
        }
        String str3 = str2;
        long jCurrentTimeMillis = System.currentTimeMillis() - eVar.b();
        long j2 = jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L;
        aim.f builder = new aim.f();
        Long lA = eVar.a();
        if (lA != null) {
            builder.put("request_duration_ms", Long.valueOf(lA.longValue()));
        }
        String strC = eVar.c();
        if (strC != null) {
            builder.put("request_result", strC);
        }
        if (aVar != null) {
            String lowerCase = aVar.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            builder.put("screen_source", lowerCase);
        }
        Unit unit = Unit.f186387a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ((com.revolut.analytics.tracking.v3.f) this.f131928a).j(str3, j2, fVarB, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
    }

    public final void c(List positions, f2b.a screenSource) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(screenSource, "screenSource");
        synchronized (this) {
            try {
                List<y49.e> list = positions;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (y49.e eVar : list) {
                    arrayList.add(new a(eVar.f310837a, eVar.f310838b, eVar.f310842j));
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((a) it8.next()).f131918a);
                }
                Set setI1 = d0.i1(arrayList2);
                LinkedHashMap linkedHashMap = this.f131929b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof String) && (value instanceof c)) {
                        linkedHashMap2.put(key, value);
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str = (String) entry2.getKey();
                    if (!setI1.contains(((c) entry2.getValue()).f131922b)) {
                        b(str, screenSource);
                    }
                }
                LinkedHashMap linkedHashMap3 = this.f131929b;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    Object key2 = entry3.getKey();
                    Object value2 = entry3.getValue();
                    if ((key2 instanceof String) && (value2 instanceof d)) {
                        linkedHashMap4.put(key2, value2);
                    }
                }
                for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                    String str2 = (String) entry4.getKey();
                    if (a((d) entry4.getValue(), arrayList)) {
                        b(str2, screenSource);
                    }
                }
                this.f131930c = d0.i1(arrayList);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
