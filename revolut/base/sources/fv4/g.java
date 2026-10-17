package fv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f138330c;

    public g(String facilityId, List interests, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(interests, "interests");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f138328a = facilityId;
        this.f138329b = interests;
        this.f138330c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f138328a, gVar.f138328a) && Intrinsics.f(this.f138329b, gVar.f138329b) && Intrinsics.f(this.f138330c, gVar.f138330c);
    }

    public final int hashCode() {
        return this.f138330c.f297794a.hashCode() + p.a.d(this.f138328a.hashCode() * 31, 31, this.f138329b);
    }
}
