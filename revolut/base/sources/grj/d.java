package grj;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lim.q;
import nkm.y;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import zhm.t0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146025a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qzi.a f146026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f146027c;

    public /* synthetic */ d(f fVar, qzi.a aVar, LocalDate localDate) {
        this.f146026b = aVar;
        this.f146027c = localDate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f146025a) {
            case 0:
                he3.a dailySpending = (he3.a) obj2;
                Intrinsics.checkNotNullParameter(dailySpending, "dailySpending");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                q qVarB = t0.B(dailySpending.f151556c);
                qzi.a aVar = this.f146026b;
                LocalDate localDate = this.f146027c;
                nkm.g gVar = new nkm.g(y.n(qVarB, new d(aVar, localDate)));
                while (gVar.hasNext()) {
                    Map.Entry entry = (Map.Entry) gVar.next();
                    LocalDate localDate2 = (LocalDate) entry.getKey();
                    long jAbs = Math.abs(((Number) entry.getValue()).longValue());
                    Long l2 = (Long) linkedHashMap.get(localDate2);
                    if (l2 != null) {
                        linkedHashMap.put(localDate2, Long.valueOf(l2.longValue() + jAbs));
                    } else {
                        linkedHashMap.put(localDate2, Long.valueOf(jAbs));
                    }
                }
                nkm.g gVar2 = new nkm.g(y.n(t0.B(dailySpending.f151555b), new d(localDate, aVar)));
                while (gVar2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) gVar2.next();
                    LocalDate localDate3 = (LocalDate) entry2.getKey();
                    long jAbs2 = Math.abs(((Number) entry2.getValue()).longValue());
                    Long l3 = (Long) linkedHashMap2.get(localDate3);
                    Long l4 = (Long) linkedHashMap.get(localDate3);
                    long jLongValue = l4 != null ? l4.longValue() : 0L;
                    if (l3 != null) {
                        linkedHashMap2.put(localDate3, Long.valueOf((l3.longValue() + jAbs2) - jLongValue));
                    } else {
                        linkedHashMap2.put(localDate3, Long.valueOf(jAbs2 - jLongValue));
                    }
                }
                return new e(linkedHashMap2, linkedHashMap);
            case 1:
                Map.Entry entry3 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry3, "<destruct>");
                LocalDate localDate4 = (LocalDate) entry3.getKey();
                return Boolean.valueOf(localDate4.compareTo((ReadablePartial) this.f146026b.e) >= 0 && localDate4.compareTo((ReadablePartial) this.f146027c) <= 0);
            default:
                Map.Entry entry4 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry4, "<destruct>");
                LocalDate localDate5 = (LocalDate) entry4.getKey();
                return Boolean.valueOf(localDate5.compareTo((ReadablePartial) this.f146027c) <= 0 && localDate5.compareTo((ReadablePartial) this.f146026b.e) >= 0);
        }
    }

    public /* synthetic */ d(LocalDate localDate, qzi.a aVar) {
        this.f146027c = localDate;
        this.f146026b = aVar;
    }

    public /* synthetic */ d(qzi.a aVar, LocalDate localDate) {
        this.f146026b = aVar;
        this.f146027c = localDate;
    }
}
