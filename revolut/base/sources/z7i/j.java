package z7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320019a;

    public j(String legalEntityId) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        this.f320019a = legalEntityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f320019a, ((j) obj2).f320019a);
    }

    public final int hashCode() {
        return this.f320019a.hashCode();
    }
}
