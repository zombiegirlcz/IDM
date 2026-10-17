package bwk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19374c;

    public g(Data orderBookData, List limitOrders, boolean z) {
        Intrinsics.checkNotNullParameter(orderBookData, "orderBookData");
        Intrinsics.checkNotNullParameter(limitOrders, "limitOrders");
        this.f19372a = orderBookData;
        this.f19373b = limitOrders;
        this.f19374c = z;
    }

    public static g a(g gVar, Data orderBookData, List limitOrders, int i) {
        if ((i & 1) != 0) {
            orderBookData = gVar.f19372a;
        }
        if ((i & 2) != 0) {
            limitOrders = gVar.f19373b;
        }
        boolean z = gVar.f19374c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(orderBookData, "orderBookData");
        Intrinsics.checkNotNullParameter(limitOrders, "limitOrders");
        return new g(orderBookData, limitOrders, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19372a, gVar.f19372a) && Intrinsics.f(this.f19373b, gVar.f19373b) && this.f19374c == gVar.f19374c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19374c) + p.a.d(this.f19372a.hashCode() * 31, 31, this.f19373b);
    }
}
