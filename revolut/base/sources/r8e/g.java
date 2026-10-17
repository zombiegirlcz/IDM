package r8e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.n f252406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f252407b;

    public g(do3.n user, boolean z) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f252406a = user;
        this.f252407b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f252406a, gVar.f252406a) && this.f252407b == gVar.f252407b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252407b) + (this.f252406a.hashCode() * 31);
    }
}
