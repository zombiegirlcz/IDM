package hlb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153439a;

    public p(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f153439a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f153439a, ((p) obj2).f153439a);
    }

    public final int hashCode() {
        return this.f153439a.hashCode();
    }
}
