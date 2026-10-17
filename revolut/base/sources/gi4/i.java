package gi4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144084a;

    public i(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f144084a = actionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f144084a, ((i) obj2).f144084a);
    }

    public final int hashCode() {
        return this.f144084a.hashCode();
    }
}
