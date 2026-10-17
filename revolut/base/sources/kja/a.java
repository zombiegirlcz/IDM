package kja;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct.Retail f184344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f184346c;

    public a(AnalyticsProduct.Retail analyticsProduct, String str, wi0.b bVar) {
        Intrinsics.checkNotNullParameter("ACCOUNT", "product");
        Intrinsics.checkNotNullParameter("PERSONAL", "accountType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f184344a = analyticsProduct;
        this.f184345b = str;
        this.f184346c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f184344a.equals(aVar.f184344a) && Intrinsics.f(this.f184345b, aVar.f184345b) && Intrinsics.f(this.f184346c, aVar.f184346c);
    }

    public final int hashCode() {
        int iHashCode = (this.f184344a.f50300a.hashCode() + (304380045 * 31)) * 31;
        String str = this.f184345b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wi0.b bVar = this.f184346c;
        return iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
