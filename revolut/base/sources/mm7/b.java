package mm7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207167a;

    public b(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f207167a = policyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f207167a, ((b) obj2).f207167a);
    }

    public final int hashCode() {
        return this.f207167a.hashCode();
    }
}
