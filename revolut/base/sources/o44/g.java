package o44;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv3.b f221997a;

    public g(gv3.b address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f221997a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f221997a, ((g) obj2).f221997a);
    }

    public final int hashCode() {
        return this.f221997a.hashCode();
    }
}
