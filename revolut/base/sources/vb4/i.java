package vb4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287407a;

    public i(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f287407a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f287407a, ((i) obj2).f287407a);
    }

    public final int hashCode() {
        return this.f287407a.hashCode();
    }
}
