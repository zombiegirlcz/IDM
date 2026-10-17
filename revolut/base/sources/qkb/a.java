package qkb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246977a;

    public a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f246977a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f246977a, ((a) obj2).f246977a);
    }

    public final int hashCode() {
        return this.f246977a.hashCode();
    }
}
