package u4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277355a;

    public l(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f277355a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f277355a, ((l) obj2).f277355a);
    }

    public final int hashCode() {
        return this.f277355a.hashCode();
    }
}
