package v1h;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsChevronDelegate f285315a;

    public a(CellDetailsChevronDelegate cellDetailsChevronDelegate) {
        Intrinsics.checkNotNullParameter(cellDetailsChevronDelegate, "cellDetailsChevronDelegate");
        this.f285315a = cellDetailsChevronDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f285315a, ((a) obj2).f285315a);
    }

    public final int hashCode() {
        return this.f285315a.hashCode();
    }
}
