package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f195338a;

    public f(d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f195338a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f195338a, ((f) obj2).f195338a);
    }

    public final int hashCode() {
        return this.f195338a.hashCode();
    }
}
