package lc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f193772a;

    public t() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f193772a, ((t) obj2).f193772a);
    }

    public final int hashCode() {
        Object obj2 = this.f193772a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }

    public t(Object obj2) {
        this.f193772a = obj2;
    }
}
