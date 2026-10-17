package f0c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131075a;

    public e(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f131075a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f131075a, ((e) obj2).f131075a);
    }

    public final int hashCode() {
        return this.f131075a.hashCode();
    }
}
