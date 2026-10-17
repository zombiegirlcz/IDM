package hl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152981c;

    public f(boolean z, String str, String str2) {
        this.f152979a = z;
        this.f152980b = str;
        this.f152981c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f152979a == fVar.f152979a && Intrinsics.f(this.f152980b, fVar.f152980b) && Intrinsics.f(this.f152981c, fVar.f152981c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f152979a) * 31;
        String str = this.f152980b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f152981c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
