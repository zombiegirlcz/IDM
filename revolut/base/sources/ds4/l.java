package ds4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117215a;

    public l(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f117215a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f117215a, ((l) obj2).f117215a);
    }

    public final int hashCode() {
        return this.f117215a.hashCode();
    }
}
