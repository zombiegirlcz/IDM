package uek;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279475a;

    public i(String podNomineeId) {
        Intrinsics.checkNotNullParameter(podNomineeId, "podNomineeId");
        this.f279475a = podNomineeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f279475a, ((i) obj2).f279475a);
    }

    public final int hashCode() {
        return this.f279475a.hashCode();
    }
}
