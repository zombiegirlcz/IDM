package nvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqk.e f219740a;

    public w(uqk.e period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f219740a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f219740a == ((w) obj2).f219740a;
    }

    public final int hashCode() {
        return this.f219740a.hashCode();
    }
}
