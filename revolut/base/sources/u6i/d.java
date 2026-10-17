package u6i;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f277604a;

    public d(c orderOption) {
        Intrinsics.checkNotNullParameter(orderOption, "orderOption");
        this.f277604a = orderOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f277604a == ((d) obj2).f277604a;
    }

    public final int hashCode() {
        return this.f277604a.hashCode();
    }
}
