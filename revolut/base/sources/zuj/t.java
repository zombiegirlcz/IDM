package zuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325508a;

    public t(String itineraryId) {
        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
        this.f325508a = itineraryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f325508a, ((t) obj2).f325508a);
    }

    public final int hashCode() {
        return this.f325508a.hashCode();
    }
}
