package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285774a;

    public g(String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f285774a = entityId;
    }

    @Override // v30.q0
    public final String a() {
        return this.f285774a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f285774a, ((g) obj2).f285774a);
    }

    public final int hashCode() {
        return this.f285774a.hashCode();
    }
}
