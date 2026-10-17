package dtk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate f117463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f117464b;

    public d(CellDetailsDelegate cellDetailsDelegate, ListSubheaderDelegate listSubheaderDelegate) {
        Intrinsics.checkNotNullParameter(cellDetailsDelegate, "cellDetailsDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        this.f117463a = cellDetailsDelegate;
        this.f117464b = listSubheaderDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f117463a, dVar.f117463a) && Intrinsics.f(this.f117464b, dVar.f117464b);
    }

    public final int hashCode() {
        return this.f117464b.hashCode() + (this.f117463a.hashCode() * 31);
    }
}
