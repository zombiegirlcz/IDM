package tvb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f274742b;

    public a(String userVoucherId, d purchaseState) {
        Intrinsics.checkNotNullParameter(userVoucherId, "userVoucherId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        this.f274741a = userVoucherId;
        this.f274742b = purchaseState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f274741a, aVar.f274741a) && this.f274742b == aVar.f274742b;
    }

    public final int hashCode() {
        return this.f274742b.hashCode() + (this.f274741a.hashCode() * 31);
    }
}
