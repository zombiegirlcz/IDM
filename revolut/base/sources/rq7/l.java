package rq7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256490a;

    public l(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f256490a = applicationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f256490a, ((l) obj2).f256490a);
    }

    public final int hashCode() {
        return this.f256490a.hashCode();
    }
}
