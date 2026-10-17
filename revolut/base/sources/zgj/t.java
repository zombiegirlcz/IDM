package zgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322184a;

    public t(dj0.d dataPlanPrice) {
        Intrinsics.checkNotNullParameter(dataPlanPrice, "dataPlanPrice");
        this.f322184a = dataPlanPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f322184a, ((t) obj2).f322184a);
    }

    public final int hashCode() {
        return this.f322184a.hashCode();
    }
}
