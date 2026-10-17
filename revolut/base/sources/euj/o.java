package euj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129630a;

    public o(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f129630a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f129630a, ((o) obj2).f129630a);
    }

    public final int hashCode() {
        return this.f129630a.hashCode();
    }
}
