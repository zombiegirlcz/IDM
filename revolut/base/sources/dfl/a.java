package dfl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f114178b;

    public a(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f114177a = j2;
        this.f114178b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f114177a == aVar.f114177a && Intrinsics.f(this.f114178b, aVar.f114178b);
    }

    public final int hashCode() {
        return this.f114178b.hashCode() + (Long.hashCode(this.f114177a) * 31);
    }
}
