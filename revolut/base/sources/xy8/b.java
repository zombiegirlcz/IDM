package xy8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import my8.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f309647a;

    public b(s kycSubmissionResult) {
        Intrinsics.checkNotNullParameter(kycSubmissionResult, "kycSubmissionResult");
        this.f309647a = kycSubmissionResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f309647a, ((b) obj2).f309647a);
    }

    public final int hashCode() {
        return this.f309647a.hashCode();
    }
}
