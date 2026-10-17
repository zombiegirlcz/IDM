package tob;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272564a;

    public d(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f272564a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f272564a, ((d) obj2).f272564a);
    }

    public final int hashCode() {
        return this.f272564a.hashCode();
    }
}
