package h87;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f149953a;

    public g(f collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f149953a = collectionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f149953a == ((g) obj2).f149953a;
    }

    public final int hashCode() {
        return this.f149953a.hashCode();
    }
}
