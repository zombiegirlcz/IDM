package krc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188847a;

    public c(String submissionId) {
        Intrinsics.checkNotNullParameter(submissionId, "submissionId");
        this.f188847a = submissionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f188847a, ((c) obj2).f188847a);
    }

    public final int hashCode() {
        return this.f188847a.hashCode();
    }
}
