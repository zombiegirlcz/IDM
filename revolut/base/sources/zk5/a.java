package zk5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f322907c;

    public a(String cryptoAddressId, String displayName, String address) {
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f322905a = cryptoAddressId;
        this.f322906b = displayName;
        this.f322907c = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322905a, aVar.f322905a) && Intrinsics.f(this.f322906b, aVar.f322906b) && Intrinsics.f(this.f322907c, aVar.f322907c);
    }

    public final int hashCode() {
        return this.f322907c.hashCode() + p.a.c(this.f322905a.hashCode() * 31, 31, this.f322906b);
    }
}
