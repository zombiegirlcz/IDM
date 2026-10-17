package usb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282875a;

    public h(dj0.d maximum) {
        Intrinsics.checkNotNullParameter(maximum, "maximum");
        this.f282875a = maximum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f282875a, ((h) obj2).f282875a);
    }

    public final int hashCode() {
        return this.f282875a.hashCode();
    }
}
