package czj;

import kotlin.jvm.internal.Intrinsics;
import mha.s;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f110265a;

    public b(s planLimit) {
        Intrinsics.checkNotNullParameter(planLimit, "planLimit");
        this.f110265a = planLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f110265a, ((b) obj2).f110265a);
    }

    public final int hashCode() {
        return this.f110265a.hashCode();
    }
}
