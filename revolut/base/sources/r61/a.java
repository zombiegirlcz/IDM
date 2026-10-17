package r61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251631c;

    public a(String cryptoAddressId, String displayName, String address) {
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f251629a = cryptoAddressId;
        this.f251630b = displayName;
        this.f251631c = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251629a, aVar.f251629a) && Intrinsics.f(this.f251630b, aVar.f251630b) && Intrinsics.f(this.f251631c, aVar.f251631c);
    }

    public final int hashCode() {
        return this.f251631c.hashCode() + p.a.c(this.f251629a.hashCode() * 31, 31, this.f251630b);
    }
}
