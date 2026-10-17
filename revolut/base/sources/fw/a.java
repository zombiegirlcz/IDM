package fw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f138504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138506c;
    public final d d;

    public a(int i, int i2, int i3, d sign) {
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.f138504a = i;
        this.f138505b = i2;
        this.f138506c = i3;
        this.d = sign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f138504a == aVar.f138504a && this.f138505b == aVar.f138505b && this.f138506c == aVar.f138506c && this.d == aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f138506c, j6.a.b(this.f138505b, Integer.hashCode(this.f138504a) * 31, 31), 31);
    }
}
