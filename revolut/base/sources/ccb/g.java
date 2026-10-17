package ccb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22986b;

    public g(String amount, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f22985a = amount;
        this.f22986b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f22985a, gVar.f22985a) && this.f22986b == gVar.f22986b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22986b) + (this.f22985a.hashCode() * 31);
    }
}
