package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244972a;

    public l0(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f244972a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f244972a, ((l0) obj2).f244972a);
    }

    public final int hashCode() {
        return this.f244972a.hashCode();
    }
}
