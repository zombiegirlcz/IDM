package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1741c;

    public i(String lastFour, String expiry, String address) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(expiry, "expiry");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f1739a = lastFour;
        this.f1740b = expiry;
        this.f1741c = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f1739a, iVar.f1739a) && Intrinsics.f(this.f1740b, iVar.f1740b) && Intrinsics.f(this.f1741c, iVar.f1741c);
    }

    public final int hashCode() {
        return this.f1741c.hashCode() + p.a.c(this.f1739a.hashCode() * 31, 31, this.f1740b);
    }
}
