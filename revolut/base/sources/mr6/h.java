package mr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f208066a;

    public h(g reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f208066a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f208066a, ((h) obj2).f208066a);
    }

    public final int hashCode() {
        return this.f208066a.hashCode();
    }
}
