package ou3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229785a;

    public b(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f229785a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f229785a, ((b) obj2).f229785a);
    }

    public final int hashCode() {
        return this.f229785a.hashCode();
    }
}
