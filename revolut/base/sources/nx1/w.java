package nx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220090a;

    public w(String jobId) {
        Intrinsics.checkNotNullParameter(jobId, "jobId");
        this.f220090a = jobId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f220090a, ((w) obj2).f220090a);
    }

    public final int hashCode() {
        return this.f220090a.hashCode();
    }
}
