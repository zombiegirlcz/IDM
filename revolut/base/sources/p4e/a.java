package p4e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jel.e2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mel.j0;
import org.jetbrains.annotations.NotNull;
import q4e.c;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    public static final C1291a Companion = new C1291a();

    /* JADX INFO: renamed from: p4e.a$a, reason: collision with other inner class name */
    public static final class C1291a {
        private C1291a() {
        }
    }

    public static c a(e2 performanceBasis, List recommendations) {
        Double dV0;
        Intrinsics.checkNotNullParameter(performanceBasis, "performanceBasis");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        if (!recommendations.isEmpty()) {
            List list = recommendations;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (true) {
                double dDoubleValue = 0.0d;
                if (it8.hasNext()) {
                    int i = b.f232916b[((j0) it8.next()).ordinal()];
                    if (i == 1 || i == 2) {
                        dDoubleValue = 1.0d;
                    } else if (i == 3) {
                        continue;
                    } else {
                        if (i != 4 && i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dDoubleValue = -1.0d;
                    }
                    arrayList.add(Double.valueOf(dDoubleValue));
                } else {
                    int i2 = b.f232915a[performanceBasis.ordinal()];
                    if (i2 == 1) {
                        dV0 = (Double) d0.M0(arrayList);
                    } else if (i2 == 2) {
                        dV0 = d0.v0(arrayList);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intrinsics.checkNotNullParameter(arrayList, "<this>");
                        Iterator it9 = arrayList.iterator();
                        int i3 = 0;
                        while (it9.hasNext()) {
                            dDoubleValue += ((Number) it9.next()).doubleValue();
                            i3++;
                            if (i3 < 0) {
                                v.r();
                                throw null;
                            }
                        }
                        dV0 = Double.valueOf(i3 == 0 ? Double.NaN : dDoubleValue / ((double) i3));
                    }
                    if (dV0 != null) {
                        double dDoubleValue2 = dV0.doubleValue();
                        return new c(dDoubleValue2 > 0.34d ? q4e.b.BUY : dDoubleValue2 < -0.34d ? q4e.b.SELL : q4e.b.HOLD, recommendations.size(), performanceBasis);
                    }
                }
            }
        }
        return null;
    }
}
