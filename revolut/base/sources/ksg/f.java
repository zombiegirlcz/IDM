package ksg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189456a;

    public f(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f189456a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f189456a, ((f) obj2).f189456a);
    }

    public final int hashCode() {
        return this.f189456a.hashCode();
    }
}
