package y4e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f310891a;

    public c(RowDelegate rowDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        this.f310891a = rowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f310891a, ((c) obj2).f310891a);
    }

    public final int hashCode() {
        return this.f310891a.hashCode();
    }
}
