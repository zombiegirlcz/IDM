package ibd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f160149a;

    public d(dj0.d threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f160149a = threshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f160149a, ((d) obj2).f160149a);
    }

    public final int hashCode() {
        return this.f160149a.hashCode();
    }
}
