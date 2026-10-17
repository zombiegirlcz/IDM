package cy4;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f110038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct.Retail f110040c;

    public a(lw0.a header, List list, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f110038a = header;
        this.f110039b = list;
        this.f110040c = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f110038a.equals(aVar.f110038a) && Intrinsics.f(this.f110039b, aVar.f110039b) && this.f110040c.equals(aVar.f110040c);
    }

    public final int hashCode() {
        int iHashCode = this.f110038a.hashCode() * 31;
        List list = this.f110039b;
        return (this.f110040c.f50300a.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
    }
}
