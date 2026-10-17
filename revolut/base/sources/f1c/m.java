package f1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131247a;

    public m(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f131247a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f131247a, ((m) obj2).f131247a);
    }

    public final int hashCode() {
        return this.f131247a.hashCode();
    }
}
