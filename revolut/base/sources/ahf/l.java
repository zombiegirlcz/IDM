package ahf;

import com.revolut.data.model.Data;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrdersWidgetContract$Config f5084c;
    public final String d;
    public final boolean e;
    public final chf.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lgf.a f5085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f5086h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5087j;
    public final k71.q k;

    public l(Data recurringPaymentsData, List fxOrders, OrdersWidgetContract$Config fxOrdersConfig, String searchQuery, boolean z, chf.g incomeSorter, lgf.a aVar, List slotManagerItems, int i, int i2, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(recurringPaymentsData, "recurringPaymentsData");
        Intrinsics.checkNotNullParameter(fxOrders, "fxOrders");
        Intrinsics.checkNotNullParameter(fxOrdersConfig, "fxOrdersConfig");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f5082a = recurringPaymentsData;
        this.f5083b = fxOrders;
        this.f5084c = fxOrdersConfig;
        this.d = searchQuery;
        this.e = z;
        this.f = incomeSorter;
        this.f5085g = aVar;
        this.f5086h = slotManagerItems;
        this.i = i;
        this.f5087j = i2;
        this.k = transactionsExtraData;
    }

    public static l a(l lVar, Data data, List list, String str, boolean z, chf.g gVar, lgf.a aVar, List list2, int i, int i2, k71.q qVar, int i3) {
        if ((i3 & 1) != 0) {
            data = lVar.f5082a;
        }
        Data recurringPaymentsData = data;
        if ((i3 & 2) != 0) {
            list = lVar.f5083b;
        }
        List fxOrders = list;
        OrdersWidgetContract$Config fxOrdersConfig = lVar.f5084c;
        if ((i3 & 8) != 0) {
            str = lVar.d;
        }
        String searchQuery = str;
        boolean z3 = (i3 & 16) != 0 ? lVar.e : z;
        chf.g incomeSorter = (i3 & 32) != 0 ? lVar.f : gVar;
        lgf.a aVar2 = (i3 & 64) != 0 ? lVar.f5085g : aVar;
        List slotManagerItems = (i3 & 128) != 0 ? lVar.f5086h : list2;
        int i5 = (i3 & 256) != 0 ? lVar.i : i;
        int i6 = (i3 & 512) != 0 ? lVar.f5087j : i2;
        k71.q transactionsExtraData = (i3 & 1024) != 0 ? lVar.k : qVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPaymentsData, "recurringPaymentsData");
        Intrinsics.checkNotNullParameter(fxOrders, "fxOrders");
        Intrinsics.checkNotNullParameter(fxOrdersConfig, "fxOrdersConfig");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new l(recurringPaymentsData, fxOrders, fxOrdersConfig, searchQuery, z3, incomeSorter, aVar2, slotManagerItems, i5, i6, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f5082a, lVar.f5082a) && Intrinsics.f(this.f5083b, lVar.f5083b) && Intrinsics.f(this.f5084c, lVar.f5084c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f5085g, lVar.f5085g) && Intrinsics.f(this.f5086h, lVar.f5086h) && this.i == lVar.i && this.f5087j == lVar.f5087j && Intrinsics.f(this.k, lVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + j6.a.c(p.a.c((this.f5084c.hashCode() + p.a.d(this.f5082a.hashCode() * 31, 31, this.f5083b)) * 31, 31, this.d), 31, this.e)) * 31;
        lgf.a aVar = this.f5085g;
        return this.k.hashCode() + j6.a.b(this.f5087j, j6.a.b(this.i, p.a.d((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f5086h), 31), 31);
    }
}
