package ox5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw5.a f230596b;

    public m(List products, cw5.a rateTilesItems) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(rateTilesItems, "rateTilesItems");
        this.f230595a = products;
        this.f230596b = rateTilesItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f230595a, mVar.f230595a) && Intrinsics.f(this.f230596b, mVar.f230596b);
    }

    public final int hashCode() {
        return this.f230596b.hashCode() + (this.f230595a.hashCode() * 31);
    }
}
