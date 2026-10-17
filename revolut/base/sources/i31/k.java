package i31;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158083a;

    public k(String transferLinkId) {
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        this.f158083a = transferLinkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f158083a, ((k) obj2).f158083a);
    }

    public final int hashCode() {
        return this.f158083a.hashCode();
    }
}
