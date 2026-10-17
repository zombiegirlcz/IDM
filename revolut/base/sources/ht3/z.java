package ht3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155320c;

    public z(String userId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f155318a = userId;
        this.f155319b = str;
        this.f155320c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f155318a, zVar.f155318a) && Intrinsics.f(this.f155319b, zVar.f155319b) && this.f155320c == zVar.f155320c;
    }

    public final int hashCode() {
        int iHashCode = this.f155318a.hashCode() * 31;
        String str = this.f155319b;
        return Boolean.hashCode(this.f155320c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
