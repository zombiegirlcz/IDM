package usb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282876a;

    public i(dj0.d minimum) {
        Intrinsics.checkNotNullParameter(minimum, "minimum");
        this.f282876a = minimum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f282876a, ((i) obj2).f282876a);
    }

    public final int hashCode() {
        return this.f282876a.hashCode();
    }
}
