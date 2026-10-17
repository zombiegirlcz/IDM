package an;

import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.b f6503a;

    public e(p0.b closeClickData) {
        Intrinsics.checkNotNullParameter(closeClickData, "closeClickData");
        this.f6503a = closeClickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f6503a, ((e) obj2).f6503a);
    }

    public final int hashCode() {
        return this.f6503a.hashCode();
    }
}
