package c9f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8f.d f22378b;

    public g(String accountId, u8f.d direction) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f22377a = accountId;
        this.f22378b = direction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f22377a, gVar.f22377a) && this.f22378b == gVar.f22378b;
    }

    public final int hashCode() {
        return this.f22378b.hashCode() + (this.f22377a.hashCode() * 31);
    }
}
