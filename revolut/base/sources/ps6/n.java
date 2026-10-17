package ps6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f239421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239422b;

    public n(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f239421a = j2;
        this.f239422b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f239421a == nVar.f239421a && Intrinsics.f(this.f239422b, nVar.f239422b);
    }

    public final int hashCode() {
        return this.f239422b.hashCode() + (Long.hashCode(this.f239421a) * 31);
    }
}
