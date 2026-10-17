package kzb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191087a;

    public e(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f191087a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f191087a, ((e) obj2).f191087a);
    }

    public final int hashCode() {
        return this.f191087a.hashCode();
    }
}
