package t44;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv3.a f267883a;

    public k(hv3.a address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f267883a = address;
    }

    @Override // t44.n
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f267883a, ((k) obj2).f267883a);
    }

    public final int hashCode() {
        return this.f267883a.hashCode();
    }
}
