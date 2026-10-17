package i4h;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f158484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eel.c f158485c;
    public final /* synthetic */ nel.n d;

    public /* synthetic */ s(p0 p0Var, eel.c cVar, nel.n nVar, int i) {
        this.f158483a = i;
        this.f158484b = p0Var;
        this.f158485c = cVar;
        this.d = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long lC;
        Pair pairB;
        vgl.d dVar;
        LinkedHashMap linkedHashMap;
        Long lC2;
        Pair pairB2;
        switch (this.f158483a) {
            case 0:
                eel.a chart = (eel.a) obj2;
                Intrinsics.checkNotNullParameter(chart, "chart");
                final zhl.n nVar = this.f158484b.f158472q;
                nel.u uVar = this.d.f214607s;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(chart, "chart");
                eel.c chartPeriod = this.f158485c;
                Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
                if (uVar == null) {
                    return chart;
                }
                List list = chart.f125219c;
                if (list.isEmpty()) {
                    return chart;
                }
                eel.b bVar = (eel.b) zhm.d0.b0(list);
                final long j2 = bVar.f125223g - bVar.f;
                if (j2 <= 0 || (lC = zhl.n.c(chartPeriod, ((eel.b) zhm.d0.m0(list)).f125223g)) == null) {
                    return chart;
                }
                long jLongValue = lC.longValue();
                long j3 = bVar.f;
                if (jLongValue >= j3 || (pairB = zhl.n.b(j3 - jLongValue, j2)) == null) {
                    return chart;
                }
                long jLongValue2 = ((Number) pairB.f186385a).longValue();
                boolean zBooleanValue = ((Boolean) pairB.f186386b).booleanValue();
                final ej0.b bVar2 = bVar.f125220a;
                return eel.a.a(chart, jLongValue, zhm.d0.E0(list, zhl.n.a(jLongValue2, zBooleanValue, jLongValue, j2, j3, new Function3() { // from class: zhl.m
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        long jLongValue3 = ((Long) obj3).longValue();
                        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                        long jLongValue4 = ((Long) obj5).longValue();
                        if (!zBooleanValue2) {
                            jLongValue4 = jLongValue3 + j2;
                        }
                        long j5 = jLongValue4;
                        nVar.getClass();
                        ej0.b bVar3 = bVar2;
                        return new eel.b(bVar3, bVar3, bVar3, bVar3, 0L, jLongValue3, j5, bVar3, bVar3, null);
                    }
                })), 2);
            default:
                eel.k chart2 = (eel.k) obj2;
                Intrinsics.checkNotNullParameter(chart2, "chart");
                zhl.n nVar2 = this.f158484b.f158472q;
                nel.u uVar2 = this.d.f214607s;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(chart2, "chart");
                eel.c chartPeriod2 = this.f158485c;
                Intrinsics.checkNotNullParameter(chartPeriod2, "chartPeriod");
                List list2 = chart2.f125232a;
                long j5 = chart2.f125233b;
                long j16 = chart2.f125234c;
                eel.i iVar = chart2.e;
                eel.e chart3 = new eel.e(list2, j5, j16, iVar, chart2.d);
                Intrinsics.checkNotNullParameter(chart3, "chart");
                Intrinsics.checkNotNullParameter(chartPeriod2, "chartPeriod");
                LinkedHashMap linkedHashMap2 = null;
                if (uVar2 == null || iVar != eel.i.PRICE || list2.size() < 2) {
                    dVar = new vgl.d(chart3, null);
                } else {
                    long j22 = ((eel.l) list2.get(1)).f125238b - ((eel.l) list2.get(0)).f125238b;
                    if (j22 > 0 && (lC2 = zhl.n.c(chartPeriod2, ((eel.l) zhm.d0.m0(list2)).f125238b)) != null) {
                        long jLongValue3 = lC2.longValue();
                        long epochMilli = uVar2.f214625b.toEpochMilli();
                        if (jLongValue3 < epochMilli && (pairB2 = zhl.n.b(epochMilli - jLongValue3, j22)) != null) {
                            aim.e eVarA = zhl.n.a(((Number) pairB2.f186385a).longValue(), ((Boolean) pairB2.f186386b).booleanValue(), jLongValue3, j22, epochMilli, new zhl.l(((eel.l) zhm.d0.b0(list2)).f125237a, ((eel.l) zhm.d0.b0(list2)).f125239c, 0));
                            dVar = new vgl.d(eel.e.a(chart3, zhm.d0.E0(list2, eVarA), jLongValue3, 28), Integer.valueOf(eVarA.size() - 1));
                        } else {
                            dVar = new vgl.d(chart3, null);
                        }
                    } else {
                        dVar = new vgl.d(chart3, null);
                    }
                }
                Integer num = dVar.f289215b;
                int iIntValue = num != null ? num.intValue() + 1 : 0;
                eel.e eVar = dVar.f289214a;
                if (iIntValue <= 0) {
                    return eel.k.a(chart2, eVar.f125227a, eVar.f125228b, eVar.f125229c, null, null, dVar.f289215b, SyslogConstants.LOG_CLOCK);
                }
                List list3 = eVar.f125227a;
                long j42 = eVar.f125228b;
                long j46 = eVar.f125229c;
                Map map = chart2.f;
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(Integer.valueOf(((Number) entry.getKey()).intValue() + iIntValue), entry.getValue());
                    }
                } else {
                    linkedHashMap = null;
                }
                Map map2 = chart2.f125235g;
                if (map2 != null) {
                    linkedHashMap2 = new LinkedHashMap(q0.b(map2.size()));
                    for (Map.Entry entry2 : map2.entrySet()) {
                        linkedHashMap2.put(Integer.valueOf(((Number) entry2.getKey()).intValue() + iIntValue), entry2.getValue());
                    }
                }
                return eel.k.a(chart2, list3, j42, j46, linkedHashMap, linkedHashMap2, dVar.f289215b, 24);
        }
    }
}
