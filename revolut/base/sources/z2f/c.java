package z2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements ne0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319063a;

    public c(String compoundId) {
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        this.f319063a = compoundId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f319063a, ((c) obj2).f319063a);
    }

    @Override // ne0.a
    public final String getKey() {
        return j6.a.q("compound_id_", this.f319063a);
    }

    public final int hashCode() {
        return this.f319063a.hashCode();
    }
}
