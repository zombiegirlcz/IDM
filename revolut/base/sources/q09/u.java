package q09;

import kotlin.jvm.internal.Intrinsics;
import mx0.dc;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc f241212a;

    public u(dc positionInfo) {
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        this.f241212a = positionInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f241212a, ((u) obj2).f241212a);
    }

    public final int hashCode() {
        return this.f241212a.hashCode();
    }
}
