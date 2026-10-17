package av3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9910b;

    public j(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f9909a = currency;
        this.f9910b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f9909a, jVar.f9909a) && this.f9910b == jVar.f9910b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9910b) + (this.f9909a.hashCode() * 31);
    }
}
