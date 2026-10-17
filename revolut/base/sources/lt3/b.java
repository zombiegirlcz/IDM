package lt3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Llt3/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "productType", "productSubtype", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditProduct")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("productSubtype")
    private final String productSubtype;

    public b(String productType, String str) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.productType = productType;
        this.productSubtype = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProductSubtype() {
        return this.productSubtype;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.productType, bVar.productType) && Intrinsics.f(this.productSubtype, bVar.productSubtype);
    }

    public final int hashCode() {
        int iHashCode = this.productType.hashCode() * 31;
        String str = this.productSubtype;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
