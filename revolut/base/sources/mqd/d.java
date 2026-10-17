package mqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207977a;

    public d(String jointAccountId) {
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        this.f207977a = jointAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f207977a, ((d) obj2).f207977a);
    }

    public final int hashCode() {
        return this.f207977a.hashCode();
    }
}
