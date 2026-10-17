package w30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f294121a;

    public s(b0 unavailabilityReason) {
        Intrinsics.checkNotNullParameter(unavailabilityReason, "unavailabilityReason");
        this.f294121a = unavailabilityReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f294121a, ((s) obj2).f294121a);
    }

    public final int hashCode() {
        return this.f294121a.hashCode();
    }
}
