package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272737a;

    public e8(Set charityIds) {
        Intrinsics.checkNotNullParameter(charityIds, "charityIds");
        this.f272737a = charityIds;
    }

    public final Set a() {
        return this.f272737a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e8) && Intrinsics.f(this.f272737a, ((e8) obj2).f272737a);
    }

    public final int hashCode() {
        return this.f272737a.hashCode();
    }
}
