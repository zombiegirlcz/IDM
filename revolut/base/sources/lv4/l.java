package lv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200305a;

    public l(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f200305a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f200305a, ((l) obj2).f200305a);
    }

    public final int hashCode() {
        return this.f200305a.hashCode();
    }
}
