package gch;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f142474a;

    public d(RowDelegate rowDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        this.f142474a = rowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f142474a, ((d) obj2).f142474a);
    }

    public final int hashCode() {
        return this.f142474a.hashCode();
    }
}
