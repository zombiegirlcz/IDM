package hra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f154798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f154799c;

    public a(boolean z, b limits, Long l2) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f154797a = z;
        this.f154798b = limits;
        this.f154799c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f154797a == aVar.f154797a && Intrinsics.f(this.f154798b, aVar.f154798b) && Intrinsics.f(this.f154799c, aVar.f154799c);
    }

    public final int hashCode() {
        int iHashCode = (this.f154798b.hashCode() + (Boolean.hashCode(this.f154797a) * 31)) * 31;
        Long l2 = this.f154799c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
