package e8h;

import com.revolut.feature.wealth.impl.data.network.topmovers.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 extends kotlin.jvm.internal.q implements Function1 {
    public static final h0 f = new h0();

    public h0() {
        super(1, com.revolut.feature.wealth.impl.data.network.topmovers.c.class, "toDomain", "toDomain(Lcom/revolut/feature/wealth/impl/data/network/topmovers/TopMoversDto;)Lcom/revolut/feature/wealth/api/domain/model/TopMovers;", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xzg.l0 l0Var;
        ?? arrayList;
        ?? arrayList2;
        com.revolut.feature.wealth.impl.data.network.topmovers.a p0 = (com.revolut.feature.wealth.impl.data.network.topmovers.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        a.c timeSpan = p0.getTimeSpan();
        int i = timeSpan == null ? -1 : com.revolut.feature.wealth.impl.data.network.topmovers.b.f95505a[timeSpan.ordinal()];
        if (i == -1) {
            throw new IllegalStateException(("Unsupported time span " + timeSpan).toString());
        }
        if (i == 1) {
            l0Var = xzg.l0.ONE_DAY;
        } else if (i == 2) {
            l0Var = xzg.l0.ONE_WEEK;
        } else if (i == 3) {
            l0Var = xzg.l0.ONE_MONTH;
        } else if (i == 4) {
            l0Var = xzg.l0.ONE_YEAR;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = xzg.l0.FIVE_YEARS;
        }
        List topGainers = p0.getTopGainers();
        if (topGainers != null) {
            List list = topGainers;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(com.revolut.feature.wealth.impl.data.network.topmovers.c.a((a.b) it8.next()));
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        List topLosers = p0.getTopLosers();
        if (topLosers != null) {
            List list2 = topLosers;
            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(com.revolut.feature.wealth.impl.data.network.topmovers.c.a((a.b) it9.next()));
            }
        } else {
            arrayList2 = zhm.f0.f322471a;
        }
        return new xzg.m0(l0Var, arrayList, arrayList2);
    }
}
