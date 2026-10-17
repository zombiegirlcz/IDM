package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class hb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272789a;

    public hb(Set groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        this.f272789a = groupIds;
    }

    public final Set a() {
        return this.f272789a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hb) && Intrinsics.f(this.f272789a, ((hb) obj2).f272789a);
    }

    public final int hashCode() {
        return this.f272789a.hashCode();
    }
}
