package kf8;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f183323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f183324c;

    public f(String individualId, Address address, i serviceType) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f183322a = individualId;
        this.f183323b = address;
        this.f183324c = serviceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f183322a, fVar.f183322a) && Intrinsics.f(this.f183323b, fVar.f183323b) && this.f183324c == fVar.f183324c;
    }

    public final int hashCode() {
        int iHashCode = this.f183322a.hashCode() * 31;
        Address address = this.f183323b;
        return this.f183324c.hashCode() + ((iHashCode + (address == null ? 0 : address.hashCode())) * 31);
    }
}
