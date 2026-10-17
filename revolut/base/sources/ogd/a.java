package ogd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f225103b;

    public a(String orderingKey, List assetPairIds) {
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        Intrinsics.checkNotNullParameter(assetPairIds, "assetPairIds");
        this.f225102a = orderingKey;
        this.f225103b = assetPairIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f225102a, aVar.f225102a) && Intrinsics.f(this.f225103b, aVar.f225103b);
    }

    public final int hashCode() {
        return this.f225103b.hashCode() + (this.f225102a.hashCode() * 31);
    }
}
