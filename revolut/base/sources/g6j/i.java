package g6j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f140969b;

    public i(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f140968a = j2;
        this.f140969b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f140968a == iVar.f140968a && Intrinsics.f(this.f140969b, iVar.f140969b);
    }

    public final int hashCode() {
        return this.f140969b.hashCode() + (Long.hashCode(this.f140968a) * 31);
    }
}
