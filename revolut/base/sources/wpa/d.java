package wpa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299210a;

    public d(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.f299210a = scheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f299210a, ((d) obj2).f299210a);
    }

    public final int hashCode() {
        return this.f299210a.hashCode();
    }
}
