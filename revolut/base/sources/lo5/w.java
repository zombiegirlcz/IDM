package lo5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f197416a;

    public w(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f197416a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f197416a, ((w) obj2).f197416a);
    }

    public final int hashCode() {
        return this.f197416a.hashCode();
    }
}
