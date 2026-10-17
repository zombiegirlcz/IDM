package iuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168630a;

    public d(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f168630a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f168630a, ((d) obj2).f168630a);
    }

    public final int hashCode() {
        return this.f168630a.hashCode();
    }
}
