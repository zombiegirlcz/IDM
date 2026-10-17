package jbi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172640b;

    public e(String stepId, String query) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f172639a = stepId;
        this.f172640b = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f172639a, eVar.f172639a) && Intrinsics.f(this.f172640b, eVar.f172640b);
    }

    public final int hashCode() {
        return this.f172640b.hashCode() + (this.f172639a.hashCode() * 31);
    }
}
