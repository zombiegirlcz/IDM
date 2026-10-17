package d58;

import kotlin.jvm.internal.Intrinsics;
import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f111396a;

    public b(d0 invitation) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        this.f111396a = invitation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f111396a, ((b) obj2).f111396a);
    }

    public final int hashCode() {
        return this.f111396a.hashCode();
    }
}
