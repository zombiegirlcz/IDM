package yy8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import my8.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f317865a;

    public c(s kycSubmissionResult) {
        Intrinsics.checkNotNullParameter(kycSubmissionResult, "kycSubmissionResult");
        this.f317865a = kycSubmissionResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f317865a, ((c) obj2).f317865a);
    }

    public final int hashCode() {
        return this.f317865a.hashCode();
    }
}
