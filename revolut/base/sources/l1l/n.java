package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f191589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f191590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f191591c;

    public n(Long l2, xi0.b limitCurrency, long j2) {
        Intrinsics.checkNotNullParameter(limitCurrency, "limitCurrency");
        this.f191589a = l2;
        this.f191590b = limitCurrency;
        this.f191591c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f191589a, nVar.f191589a) && Intrinsics.f(this.f191590b, nVar.f191590b) && this.f191591c == nVar.f191591c;
    }

    public final int hashCode() {
        Long l2 = this.f191589a;
        return Long.hashCode(this.f191591c) + h30.l.j(this.f191590b, (l2 == null ? 0 : l2.hashCode()) * 31, 31);
    }
}
