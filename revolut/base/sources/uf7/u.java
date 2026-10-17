package uf7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279621a;

    public u(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f279621a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f279621a, ((u) obj2).f279621a);
    }

    public final int hashCode() {
        return this.f279621a.hashCode();
    }
}
