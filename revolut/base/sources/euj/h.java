package euj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129622a;

    public h(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f129622a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f129622a, ((h) obj2).f129622a);
    }

    public final int hashCode() {
        return this.f129622a.hashCode();
    }
}
