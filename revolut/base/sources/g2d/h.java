package g2d;

import kotlin.jvm.internal.Intrinsics;
import z0h.t1;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements lgd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f139969a;

    public h(t1 wealthDisclaimersData) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        this.f139969a = wealthDisclaimersData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f139969a, ((h) obj2).f139969a);
    }

    public final int hashCode() {
        return this.f139969a.hashCode();
    }
}
