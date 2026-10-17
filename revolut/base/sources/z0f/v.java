package z0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318286a;

    public v(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f318286a = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f318286a, ((v) obj2).f318286a);
    }

    public final int hashCode() {
        return this.f318286a.hashCode();
    }
}
