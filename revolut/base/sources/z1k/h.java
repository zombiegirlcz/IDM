package z1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f318862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f318863b;

    public h(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f318862a = j2;
        this.f318863b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f318862a == hVar.f318862a && Intrinsics.f(this.f318863b, hVar.f318863b);
    }

    public final int hashCode() {
        return this.f318863b.hashCode() + (Long.hashCode(this.f318862a) * 31);
    }
}
