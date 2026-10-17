package enk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127833a;

    public b(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f127833a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f127833a, ((b) obj2).f127833a);
    }

    public final int hashCode() {
        return this.f127833a.hashCode();
    }

    @Override // enk.d
    public final String n0() {
        return this.f127833a;
    }
}
