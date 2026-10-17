package u07;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276080a;

    public g(String taxProfileId) {
        Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
        this.f276080a = taxProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f276080a, ((g) obj2).f276080a);
    }

    public final int hashCode() {
        return this.f276080a.hashCode();
    }
}
