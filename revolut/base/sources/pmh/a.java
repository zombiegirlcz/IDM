package pmh;

import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f237566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RowLoadingDelegate f237567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderDelegate f237568c;
    public final HybridTileDelegate d;

    public a(RowDelegate rowDelegate, RowLoadingDelegate rowLoadingDelegate, ListSubheaderDelegate listSubheaderDelegate, HybridTileDelegate hybridTileDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(hybridTileDelegate, "hybridTileDelegate");
        this.f237566a = rowDelegate;
        this.f237567b = rowLoadingDelegate;
        this.f237568c = listSubheaderDelegate;
        this.d = hybridTileDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f237566a, aVar.f237566a) && Intrinsics.f(this.f237567b, aVar.f237567b) && Intrinsics.f(this.f237568c, aVar.f237568c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f237568c.hashCode() + ((this.f237567b.hashCode() + (this.f237566a.hashCode() * 31)) * 31)) * 31);
    }
}
