package snd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f264521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f264522b;

    public b(Data dashboardData, List airTipItems) {
        Intrinsics.checkNotNullParameter(dashboardData, "dashboardData");
        Intrinsics.checkNotNullParameter(airTipItems, "airTipItems");
        this.f264521a = dashboardData;
        this.f264522b = airTipItems;
    }

    public static b a(b bVar, Data dashboardData, List airTipItems, int i) {
        if ((i & 1) != 0) {
            dashboardData = bVar.f264521a;
        }
        if ((i & 2) != 0) {
            airTipItems = bVar.f264522b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(dashboardData, "dashboardData");
        Intrinsics.checkNotNullParameter(airTipItems, "airTipItems");
        return new b(dashboardData, airTipItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f264521a, bVar.f264521a) && Intrinsics.f(this.f264522b, bVar.f264522b);
    }

    public final int hashCode() {
        return this.f264522b.hashCode() + (this.f264521a.hashCode() * 31);
    }
}
