package h0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148389a;

    public f(String methodId) {
        Intrinsics.checkNotNullParameter(methodId, "methodId");
        this.f148389a = methodId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f148389a, ((f) obj2).f148389a);
    }

    public final int hashCode() {
        return this.f148389a.hashCode();
    }
}
