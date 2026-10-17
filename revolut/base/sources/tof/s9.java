package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273048a;

    public s9(Set groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        this.f273048a = groupIds;
    }

    public final Set a() {
        return this.f273048a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s9) && Intrinsics.f(this.f273048a, ((s9) obj2).f273048a);
    }

    public final int hashCode() {
        return this.f273048a.hashCode();
    }
}
