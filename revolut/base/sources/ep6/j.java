package ep6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128089a;

    public j(String stepId) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f128089a = stepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f128089a, ((j) obj2).f128089a);
    }

    public final int hashCode() {
        return this.f128089a.hashCode();
    }
}
