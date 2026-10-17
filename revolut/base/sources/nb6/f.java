package nb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213993a;

    public f(String collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.f213993a = collectionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f213993a, ((f) obj2).f213993a);
    }

    public final int hashCode() {
        return this.f213993a.hashCode();
    }
}
