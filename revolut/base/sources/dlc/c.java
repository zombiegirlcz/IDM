package dlc;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f115724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CellDetailsChevronDelegate f115725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButtonDelegate f115726c;

    public c(RowDelegate rowDelegate, CellDetailsChevronDelegate cellDetailsChevronDelegate, LargeActionButtonDelegate largeActionButtonDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(cellDetailsChevronDelegate, "cellDetailsChevronDelegate");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
        this.f115724a = rowDelegate;
        this.f115725b = cellDetailsChevronDelegate;
        this.f115726c = largeActionButtonDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f115724a, cVar.f115724a) && Intrinsics.f(this.f115725b, cVar.f115725b) && Intrinsics.f(this.f115726c, cVar.f115726c);
    }

    public final int hashCode() {
        return this.f115726c.hashCode() + ((this.f115725b.hashCode() + (this.f115724a.hashCode() * 31)) * 31);
    }
}
