package kbi;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends com.revolut.feature_retail_user_declarations.employer.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f182602b;

    public h(String companyName, Address address) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.f182601a = companyName;
        this.f182602b = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f182601a, hVar.f182601a) && Intrinsics.f(this.f182602b, hVar.f182602b);
    }

    public final int hashCode() {
        int iHashCode = this.f182601a.hashCode() * 31;
        Address address = this.f182602b;
        return iHashCode + (address == null ? 0 : address.hashCode());
    }
}
