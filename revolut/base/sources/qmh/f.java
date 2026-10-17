package qmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247847a;

    public f(String collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f247847a = collectionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f247847a, ((f) obj2).f247847a);
    }

    public final int hashCode() {
        return this.f247847a.hashCode();
    }
}
