package hcl;

import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R0\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u00070\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lhcl/a3;", "", "", "toString", "()Ljava/lang/String;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "a", "Ljava/util/List;", "()Ljava/util/List;", "products", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("products")
    @NotNull
    private final List<HashSet<String>> products;

    public a3(List products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a3) && Intrinsics.f(this.products, ((a3) obj2).products);
    }

    public final int hashCode() {
        return this.products.hashCode();
    }
}
