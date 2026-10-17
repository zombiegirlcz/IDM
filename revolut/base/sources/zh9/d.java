package zh9;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322257a;

    public d(dj0.d totalToRepay) {
        Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
        this.f322257a = totalToRepay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f322257a, ((d) obj2).f322257a);
    }

    public final int hashCode() {
        return this.f322257a.hashCode();
    }
}
