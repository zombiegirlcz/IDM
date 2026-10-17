package ps6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f239419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239420b;

    public m(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f239419a = j2;
        this.f239420b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f239419a == mVar.f239419a && Intrinsics.f(this.f239420b, mVar.f239420b);
    }

    public final int hashCode() {
        return this.f239420b.hashCode() + (Long.hashCode(this.f239419a) * 31);
    }
}
