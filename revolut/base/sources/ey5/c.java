package ey5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130573a;

    public c(String collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f130573a = collectionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f130573a, ((c) obj2).f130573a);
    }

    public final int hashCode() {
        return this.f130573a.hashCode();
    }
}
