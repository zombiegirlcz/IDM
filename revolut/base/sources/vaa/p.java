package vaa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f287210a;

    public p(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f287210a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f287210a, ((p) obj2).f287210a);
    }

    public final int hashCode() {
        return this.f287210a.hashCode();
    }
}
