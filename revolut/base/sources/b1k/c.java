package b1k;

import aw0.ab;
import aw0.ya;
import ip0.bm0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c extends e {
    public static BigDecimal g(qta.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Pair pair = (Pair) d0.o0(dVar.e);
        BigDecimal bigDecimal = pair != null ? new BigDecimal(String.valueOf(((Number) pair.f186386b).doubleValue())) : null;
        Pair pair2 = (Pair) d0.d0(dVar.e);
        BigDecimal bigDecimal2 = pair2 != null ? new BigDecimal(String.valueOf(((Number) pair2.f186386b).doubleValue())) : null;
        if (bigDecimal != null && bigDecimal2 != null) {
            return l.t(bigDecimal, bigDecimal2);
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // b1k.e
    public final bm0 a(d1k.c trendPreview) {
        Intrinsics.checkNotNullParameter(trendPreview, "trendPreview");
        Pair pair = (Pair) d0.d0(trendPreview.a().e);
        if (pair != null) {
            return new bm0((float) ((Number) pair.f186386b).doubleValue());
        }
        return null;
    }

    @Override // b1k.e
    public final ya b(d1k.c trendPreview) {
        Intrinsics.checkNotNullParameter(trendPreview, "trendPreview");
        if (g(trendPreview.a()).compareTo(BigDecimal.ZERO) > 0) {
            ya.Companion.getClass();
            return ya.e;
        }
        ya.Companion.getClass();
        return ya.f;
    }

    @Override // b1k.e
    public final ArrayList c(d1k.c trendPreview) {
        Intrinsics.checkNotNullParameter(trendPreview, "trendPreview");
        List list = trendPreview.a().e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ab(((Number) r1.f186385a).longValue(), (float) ((Number) ((Pair) it8.next()).f186386b).doubleValue()));
        }
        return arrayList;
    }

    @Override // b1k.e
    public final void d(d1k.c trendPreview) {
        Intrinsics.checkNotNullParameter(trendPreview, "trendPreview");
    }
}
