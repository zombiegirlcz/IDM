package w9a;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295700a;

    public d(String authorisationId) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        this.f295700a = authorisationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f295700a, ((d) obj2).f295700a);
    }

    public final int hashCode() {
        return this.f295700a.hashCode();
    }
}
