package xka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306638a;

    public j(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f306638a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f306638a, ((j) obj2).f306638a);
    }

    public final int hashCode() {
        return this.f306638a.hashCode();
    }
}
