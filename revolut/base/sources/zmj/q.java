package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323582a;

    public q(String dataPlanId) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        this.f323582a = dataPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f323582a, ((q) obj2).f323582a);
    }

    public final int hashCode() {
        return this.f323582a.hashCode();
    }
}
