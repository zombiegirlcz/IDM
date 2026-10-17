package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6 f273028a;

    public r6(s6 brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f273028a = brand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r6) && Intrinsics.f(this.f273028a, ((r6) obj2).f273028a);
    }

    public final int hashCode() {
        return this.f273028a.f273046a.hashCode();
    }
}
