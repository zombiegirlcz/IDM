package vb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287363a;

    public f(String storedMethodId) {
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        this.f287363a = storedMethodId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f287363a, ((f) obj2).f287363a);
    }

    public final int hashCode() {
        return this.f287363a.hashCode();
    }
}
