package enk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127834a;

    public c(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f127834a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f127834a, ((c) obj2).f127834a);
    }

    public final int hashCode() {
        return this.f127834a.hashCode();
    }

    @Override // enk.d
    public final String n0() {
        return this.f127834a;
    }
}
