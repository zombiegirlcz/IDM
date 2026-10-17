package awk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f10794a;

    public a(RowDelegate rowDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        this.f10794a = rowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f10794a, ((a) obj2).f10794a);
    }

    public final int hashCode() {
        return this.f10794a.hashCode();
    }
}
