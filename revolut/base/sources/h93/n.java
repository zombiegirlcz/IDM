package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f150154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f150156c;

    public n(int i, dj0.d current, dj0.d limit) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f150154a = current;
        this.f150155b = i;
        this.f150156c = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f150154a, nVar.f150154a) && this.f150155b == nVar.f150155b && Intrinsics.f(this.f150156c, nVar.f150156c);
    }

    public final int hashCode() {
        return this.f150156c.hashCode() + j6.a.b(this.f150155b, this.f150154a.hashCode() * 31, 31);
    }
}
