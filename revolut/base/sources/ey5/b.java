package ey5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130572a;

    public b(String collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f130572a = collectionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f130572a, ((b) obj2).f130572a);
    }

    public final int hashCode() {
        return this.f130572a.hashCode();
    }
}
