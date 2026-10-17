package plg;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f237390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f237391b;

    public l(co3.a aVar, Address address) {
        this.f237390a = aVar;
        this.f237391b = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f237390a, lVar.f237390a) && Intrinsics.f(this.f237391b, lVar.f237391b);
    }

    public final int hashCode() {
        co3.a aVar = this.f237390a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Address address = this.f237391b;
        return iHashCode + (address != null ? address.hashCode() : 0);
    }
}
