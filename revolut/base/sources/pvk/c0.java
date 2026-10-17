package pvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240268a;

    public c0(String indexRef) {
        Intrinsics.checkNotNullParameter(indexRef, "indexRef");
        this.f240268a = indexRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f240268a, ((c0) obj2).f240268a);
    }

    public final int hashCode() {
        return this.f240268a.hashCode();
    }
}
