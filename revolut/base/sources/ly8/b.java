package ly8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import my8.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200747a;

    public b(s kycSubmissionResult) {
        Intrinsics.checkNotNullParameter(kycSubmissionResult, "kycSubmissionResult");
        this.f200747a = kycSubmissionResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f200747a, ((b) obj2).f200747a);
    }

    public final s f() {
        return this.f200747a;
    }

    public final int hashCode() {
        return this.f200747a.hashCode();
    }
}
