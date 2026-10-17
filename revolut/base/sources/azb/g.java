package azb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11426a;

    public g(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f11426a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f11426a, ((g) obj2).f11426a);
    }

    public final int hashCode() {
        return this.f11426a.hashCode();
    }
}
