package plh;

import aii.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tih.d f237395b;

    public a(String itemId, tih.d catalogueFeature) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(catalogueFeature, "catalogueFeature");
        this.f237394a = itemId;
        this.f237395b = catalogueFeature;
    }

    public final tih.d a() {
        return this.f237395b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f237394a, aVar.f237394a) && this.f237395b == aVar.f237395b;
    }

    public final int hashCode() {
        return this.f237395b.hashCode() + (this.f237394a.hashCode() * 31);
    }
}
