package ua5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278542b;

    public a(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f278541a = planId;
        this.f278542b = j6.a.q("PostTerminationPlanDetailsCacheKey", planId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f278541a, ((a) obj2).f278541a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f278542b;
    }

    public final int hashCode() {
        return this.f278541a.hashCode();
    }
}
