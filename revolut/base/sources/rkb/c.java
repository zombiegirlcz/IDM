package rkb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254789a;

    public c(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f254789a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f254789a, ((c) obj2).f254789a);
    }

    public final int hashCode() {
        return this.f254789a.hashCode();
    }
}
