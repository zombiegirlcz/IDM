package nya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f220757a;

    public s(r nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f220757a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f220757a, ((s) obj2).f220757a);
    }

    public final int hashCode() {
        return this.f220757a.hashCode();
    }
}
