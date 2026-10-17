package ijh;

import adh.k;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import del.f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wjh.a0;
import wjh.y;
import wjh.z;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    public d(nmc.d roboPortfolioUiMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
    }

    public static final String a(d dVar, a0 a0Var) {
        if (a0Var instanceof y) {
            return ((y) a0Var).f298131a.f113704a;
        }
        if (!(a0Var instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        RoboPortfolioInfo roboPortfolioInfo = ((z) a0Var).f298132a.f17172a.f17211b;
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        String str = roboPortfolioInfo.d;
        if (str == null) {
            Template template = roboPortfolioInfo.f95701a;
            str = template != null ? template.d : null;
            if (str == null) {
                Template template2 = roboPortfolioInfo.f95702b;
                str = template2 != null ? template2.d : null;
            }
        }
        return str == null ? "" : str;
    }

    public static final BigDecimal b(d dVar, a0 a0Var) {
        if (a0Var instanceof y) {
            return ((y) a0Var).f298131a.d;
        }
        if (!(a0Var instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        del.b bVar = ((z) a0Var).f298132a.f17172a.f17212c;
        if (bVar != null) {
            return bVar.d;
        }
        return null;
    }

    public static final long c(d dVar, a0 a0Var) {
        if (a0Var instanceof y) {
            dj0.d dVarB = ((y) a0Var).f298131a.b();
            if (dVarB != null) {
                return dVarB.f115082a;
            }
            return 0L;
        }
        if (!(a0Var instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        del.b bVar = ((z) a0Var).f298132a.f17172a.f17212c;
        if (bVar != null) {
            return mif.a.Q(bVar.f113708a).f115082a;
        }
        return 0L;
    }

    public final ArrayList d(List instrumentBalances, Data data, f sortBy) {
        Comparator cVar;
        Intrinsics.checkNotNullParameter(instrumentBalances, "instrumentBalances");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        List list = instrumentBalances;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new y((del.a) it8.next()));
        }
        List listL = oc.c.L(data);
        ArrayList arrayList2 = new ArrayList(w.t(listL, 10));
        Iterator it9 = listL.iterator();
        while (it9.hasNext()) {
            arrayList2.add(new z((bnh.b) it9.next()));
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        int i = b.f161794a[sortBy.f113714a.ordinal()];
        if (i == 1) {
            cVar = new c(this, 0);
        } else if (i == 2) {
            cVar = new c(this, 1);
        } else if (i == 3) {
            cVar = new c(this, 2);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new k(this, 5);
        }
        int i2 = b.f161795b[sortBy.f113715b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = cVar.reversed();
            Intrinsics.checkNotNullExpressionValue(cVar, "reversed(...)");
        }
        List listP0 = d0.P0(arrayList2, cVar);
        ArrayList arrayList3 = new ArrayList(listP0.size() + arrayList.size());
        int i3 = 0;
        int i5 = 0;
        while (i3 < arrayList.size() && i5 < listP0.size()) {
            if (cVar.compare(listP0.get(i5), arrayList.get(i3)) < 0) {
                arrayList3.add(listP0.get(i5));
                i5++;
            } else {
                arrayList3.add(arrayList.get(i3));
                i3++;
            }
        }
        while (i3 < arrayList.size()) {
            arrayList3.add(arrayList.get(i3));
            i3++;
        }
        while (i5 < listP0.size()) {
            arrayList3.add(listP0.get(i5));
            i5++;
        }
        return arrayList3;
    }
}
