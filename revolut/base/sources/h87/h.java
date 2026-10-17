package h87;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f149954a;

    public h(f collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f149954a = collectionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f149954a == ((h) obj2).f149954a;
    }

    public final int hashCode() {
        return this.f149954a.hashCode();
    }
}
