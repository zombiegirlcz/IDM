package x0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301593a;

    public m(String externalCardId) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        this.f301593a = externalCardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f301593a, ((m) obj2).f301593a);
    }

    public final int hashCode() {
        return this.f301593a.hashCode();
    }
}
