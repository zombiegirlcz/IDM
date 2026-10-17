package ak8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5738a;

    public f(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f5738a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f5738a, ((f) obj2).f5738a);
    }

    public final int hashCode() {
        return this.f5738a.hashCode();
    }
}
