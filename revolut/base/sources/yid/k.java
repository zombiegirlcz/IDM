package yid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314311a;

    public k(String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f314311a = redirectUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f314311a, ((k) obj2).f314311a);
    }

    public final int hashCode() {
        return this.f314311a.hashCode();
    }
}
