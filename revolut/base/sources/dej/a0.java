package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f113482a;

    public a0(z eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f113482a = eligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && this.f113482a == ((a0) obj2).f113482a;
    }

    public final int hashCode() {
        return this.f113482a.hashCode();
    }
}
