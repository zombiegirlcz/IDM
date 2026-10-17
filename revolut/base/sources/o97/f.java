package o97;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f223099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct.Retail f223100c;

    public f(String listId, y searchPayload, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f223098a = listId;
        this.f223099b = searchPayload;
        this.f223100c = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f223098a, fVar.f223098a) && this.f223099b.equals(fVar.f223099b) && this.f223100c.equals(fVar.f223100c);
    }

    public final int hashCode() {
        return this.f223100c.f50300a.hashCode() + ((this.f223099b.hashCode() + (this.f223098a.hashCode() * 31)) * 31);
    }
}
