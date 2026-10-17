package w4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294583a;

    public p(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f294583a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f294583a, ((p) obj2).f294583a);
    }

    public final int hashCode() {
        return this.f294583a.hashCode();
    }
}
