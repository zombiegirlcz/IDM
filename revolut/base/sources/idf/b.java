package idf;

import aii.r;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f160484a;

    public b(r0 orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f160484a = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f160484a == ((b) obj2).f160484a;
    }

    public final int hashCode() {
        return this.f160484a.hashCode();
    }
}
