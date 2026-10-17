package yod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amd.j f315659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f315660b;

    public h(amd.j group, dj0.d balance) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f315659a = group;
        this.f315660b = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f315659a, hVar.f315659a) && Intrinsics.f(this.f315660b, hVar.f315660b);
    }

    public final int hashCode() {
        return this.f315660b.hashCode() + (this.f315659a.hashCode() * 31);
    }
}
