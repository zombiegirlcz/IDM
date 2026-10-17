package uoc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281606a;

    public d(dj0.d contribution) {
        Intrinsics.checkNotNullParameter(contribution, "contribution");
        this.f281606a = contribution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f281606a, ((d) obj2).f281606a);
    }

    public final int hashCode() {
        return this.f281606a.hashCode();
    }
}
