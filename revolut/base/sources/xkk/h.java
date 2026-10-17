package xkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f306850a;

    public h(hha.d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f306850a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f306850a, ((h) obj2).f306850a);
    }

    public final int hashCode() {
        return this.f306850a.hashCode();
    }
}
