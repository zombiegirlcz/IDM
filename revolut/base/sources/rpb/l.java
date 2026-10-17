package rpb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcd.b f256330a;

    public l(pcd.b accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f256330a = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f256330a == ((l) obj2).f256330a;
    }

    public final int hashCode() {
        return this.f256330a.hashCode();
    }
}
