package sv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265837a;

    public e(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f265837a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f265837a, ((e) obj2).f265837a);
    }

    public final int hashCode() {
        return this.f265837a.hashCode();
    }
}
