package aeh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f3585a;

    public c(RowDelegate rowDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        this.f3585a = rowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f3585a, ((c) obj2).f3585a);
    }

    public final int hashCode() {
        return this.f3585a.hashCode();
    }
}
