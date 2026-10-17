package pya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f240714a;

    public g(f nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f240714a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f240714a, ((g) obj2).f240714a);
    }

    public final int hashCode() {
        return this.f240714a.hashCode();
    }
}
