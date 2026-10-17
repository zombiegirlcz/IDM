package lv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200306a;

    public m(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f200306a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f200306a, ((m) obj2).f200306a);
    }

    public final int hashCode() {
        return this.f200306a.hashCode();
    }
}
