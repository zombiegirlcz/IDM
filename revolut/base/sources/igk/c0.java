package igk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f161240a;

    public c0(hha.d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f161240a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f161240a, ((c0) obj2).f161240a);
    }

    public final int hashCode() {
        return this.f161240a.hashCode();
    }
}
