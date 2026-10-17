package s4e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f259835a;

    public c(RowDelegate rowDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        this.f259835a = rowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f259835a, ((c) obj2).f259835a);
    }

    public final int hashCode() {
        return this.f259835a.hashCode();
    }
}
