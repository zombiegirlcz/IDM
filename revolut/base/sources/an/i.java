package an;

import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.b f6507a;

    public i(p0.b closeClickData) {
        Intrinsics.checkNotNullParameter(closeClickData, "closeClickData");
        this.f6507a = closeClickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f6507a, ((i) obj2).f6507a);
    }

    public final int hashCode() {
        return this.f6507a.hashCode();
    }
}
