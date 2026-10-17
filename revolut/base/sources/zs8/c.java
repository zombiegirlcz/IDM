package zs8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324827a;

    public c(String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f324827a = redirectUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f324827a, ((c) obj2).f324827a);
    }

    public final int hashCode() {
        return this.f324827a.hashCode();
    }
}
