package wga;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f297272a;

    public e(w0 planTier) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f297272a = planTier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f297272a == ((e) obj2).f297272a;
    }

    public final int hashCode() {
        return this.f297272a.hashCode();
    }
}
