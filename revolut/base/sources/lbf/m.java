package lbf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f193681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f193682c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f193683g;

    public m(String id10, f code, List billing, List features, List products, List pricingPlanProducts, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(pricingPlanProducts, "pricingPlanProducts");
        this.f193680a = id10;
        this.f193681b = code;
        this.f193682c = billing;
        this.d = features;
        this.e = products;
        this.f = pricingPlanProducts;
        this.f193683g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f193680a, mVar.f193680a) && this.f193681b == mVar.f193681b && Intrinsics.f(this.f193682c, mVar.f193682c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f193683g, mVar.f193683g);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(p.a.d((this.f193681b.hashCode() + (this.f193680a.hashCode() * 31)) * 31, 31, this.f193682c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f193683g;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
