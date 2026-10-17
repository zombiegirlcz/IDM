package jh2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174137a;

    public q(String shareUrl) {
        Intrinsics.checkNotNullParameter(shareUrl, "shareUrl");
        this.f174137a = shareUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f174137a, ((q) obj2).f174137a);
    }

    public final int hashCode() {
        return this.f174137a.hashCode();
    }
}
