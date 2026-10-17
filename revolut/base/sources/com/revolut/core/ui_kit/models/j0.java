package com.revolut.core.ui_kit.models;

import aw0.i4;
import aw0.j1;
import aw0.j4;
import aw0.l9;
import aw0.n4;
import aw0.o4;
import aw0.p4;
import aw0.r4;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class j0 {
    public static f a(List segments, j1 j1Var, String str, boolean z, n4 n4Var, o4 o4Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            SegmentedGaugeChartView.INSTANCE.getClass();
            n4Var = SegmentedGaugeChartView.p0;
        }
        n4 sortMode = n4Var;
        if ((i & 32) != 0) {
            o4Var = o4.FULL_CIRCLE;
        }
        o4 gaugeChartStyle = o4Var;
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(sortMode, "sortMode");
        Intrinsics.checkNotNullParameter(gaugeChartStyle, "gaugeChartStyle");
        Iterator it8 = segments.iterator();
        long jD = 0;
        while (it8.hasNext()) {
            jD += ((j4) it8.next()).d();
        }
        return new f(segments, jD, str2, j1Var, z ? new p4(0) : r4.f10512a, sortMode, gaugeChartStyle);
    }

    public static final ArrayList b(ArrayList arrayList, p4 strategy, float f) {
        Object next;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        float f4 = strategy.f10464a;
        zhm.f0 f0Var = zhm.f0.f322471a;
        int i = strategy.f10465b;
        ArrayList<j4> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            j4 j4Var = (j4) obj2;
            f0Var.contains(j4Var.a());
            if (Math.abs(j4Var.d()) > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (j4 j4Var2 : arrayList2) {
            f0Var.contains(j4Var2.a());
            if (Math.abs(j4Var2.d()) / f >= f4) {
                arrayList3.add(j4Var2);
            } else {
                arrayList4.add(j4Var2);
            }
        }
        int size = arrayList3.size() - (i - 1);
        Integer numValueOf = Integer.valueOf(size);
        i4 i4Var = null;
        if (size <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            for (j4 j4Var3 : zhm.d0.V0(zhm.d0.P0(arrayList3, new l9()), numValueOf.intValue())) {
                arrayList4.add(j4Var3);
                arrayList3.remove(j4Var3);
            }
        }
        if (!arrayList4.isEmpty() && arrayList3.size() > 1) {
            Iterator it8 = arrayList4.iterator();
            long jAbs = 0;
            while (it8.hasNext()) {
                jAbs += Math.abs(((j4) it8.next()).d());
            }
            if (jAbs / f < f4) {
                Iterator it9 = arrayList3.iterator();
                if (it9.hasNext()) {
                    next = it9.next();
                    if (it9.hasNext()) {
                        long jAbs2 = Math.abs(((j4) next).d());
                        do {
                            Object next2 = it9.next();
                            long jAbs3 = Math.abs(((j4) next2).d());
                            if (jAbs2 > jAbs3) {
                                next = next2;
                                jAbs2 = jAbs3;
                            }
                        } while (it9.hasNext());
                    }
                } else {
                    next = null;
                }
                j4 j4Var4 = (j4) next;
                if (j4Var4 != null) {
                    arrayList4.add(j4Var4);
                    arrayList3.remove(j4Var4);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            SegmentedGaugeChartView.INSTANCE.getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(SegmentedGaugeChartView.q0, null, null, 14);
            Iterator it10 = arrayList4.iterator();
            long j2 = 0;
            while (it10.hasNext()) {
                j2 += ((i4) it10.next()).f10355c;
            }
            SegmentedGaugeChartView.INSTANCE.getClass();
            i4Var = new i4("SMALL_SEGMENTS_GROUP_ID", textLocalisedClause, j2, new Color.Solid(SegmentedGaugeChartView.f57121r0), arrayList4);
        }
        return zhm.d0.E0(zhm.v.l(i4Var), arrayList3);
    }
}
