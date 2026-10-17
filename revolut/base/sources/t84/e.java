package t84;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu3.d f268836a;

    public e(pu3.d debtType) {
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        this.f268836a = debtType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f268836a == ((e) obj2).f268836a;
    }

    public final int hashCode() {
        return this.f268836a.hashCode();
    }
}
