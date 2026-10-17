package lkd;

import ekd.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f196359a;

    public f(z incentive) {
        Intrinsics.checkNotNullParameter(incentive, "incentive");
        this.f196359a = incentive;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f196359a, ((f) obj2).f196359a);
    }

    public final int hashCode() {
        return this.f196359a.hashCode();
    }
}
