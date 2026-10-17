package ryi;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f258376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f258378c;

    public c(Data refundsInfo, List entriesSelectedForRefund, g totalRefund) {
        Intrinsics.checkNotNullParameter(refundsInfo, "refundsInfo");
        Intrinsics.checkNotNullParameter(entriesSelectedForRefund, "entriesSelectedForRefund");
        Intrinsics.checkNotNullParameter(totalRefund, "totalRefund");
        this.f258376a = refundsInfo;
        this.f258377b = entriesSelectedForRefund;
        this.f258378c = totalRefund;
    }

    public static c a(c cVar, Data refundsInfo, List entriesSelectedForRefund, g totalRefund, int i) {
        if ((i & 1) != 0) {
            refundsInfo = cVar.f258376a;
        }
        if ((i & 2) != 0) {
            entriesSelectedForRefund = cVar.f258377b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(refundsInfo, "refundsInfo");
        Intrinsics.checkNotNullParameter(entriesSelectedForRefund, "entriesSelectedForRefund");
        Intrinsics.checkNotNullParameter(totalRefund, "totalRefund");
        return new c(refundsInfo, entriesSelectedForRefund, totalRefund);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258376a, cVar.f258376a) && Intrinsics.f(this.f258377b, cVar.f258377b) && Intrinsics.f(this.f258378c, cVar.f258378c);
    }

    public final int hashCode() {
        return this.f258378c.hashCode() + p.a.d(this.f258376a.hashCode() * 31, 31, this.f258377b);
    }
}
