package hrf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f154814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f154816c;

    public e(d transferLimits, boolean z, Long l2) {
        Intrinsics.checkNotNullParameter(transferLimits, "transferLimits");
        this.f154814a = transferLimits;
        this.f154815b = z;
        this.f154816c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154814a, eVar.f154814a) && this.f154815b == eVar.f154815b && Intrinsics.f(this.f154816c, eVar.f154816c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f154814a.hashCode() * 31, 31, this.f154815b);
        Long l2 = this.f154816c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
