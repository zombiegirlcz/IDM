package bi5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec5.c f15435a;

    public c(ec5.c onboardingProcess) {
        Intrinsics.checkNotNullParameter(onboardingProcess, "onboardingProcess");
        this.f15435a = onboardingProcess;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f15435a, ((c) obj2).f15435a);
    }

    public final int hashCode() {
        return this.f15435a.hashCode();
    }
}
