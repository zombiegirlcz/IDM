package mf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f204965b;

    public f(String userId, e kyc2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        this.f204964a = userId;
        this.f204965b = kyc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204964a, fVar.f204964a) && Intrinsics.f(this.f204965b, fVar.f204965b);
    }

    public final int hashCode() {
        return this.f204965b.hashCode() + (this.f204964a.hashCode() * 31);
    }
}
