package x8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f303449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f303450b;

    public i(xi0.b pocketCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f303449a = pocketCurrency;
        this.f303450b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f303449a, iVar.f303449a) && this.f303450b == iVar.f303450b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f303450b) + (this.f303449a.hashCode() * 31);
    }
}
