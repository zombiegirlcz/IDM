package ksk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f189471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f189472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellDetailsDelegate f189473c;
    public final CellDetailsLoadingDelegate d;

    public c(ListSubheaderDelegate listSubheaderDelegate, ListSubheaderLoadingDelegate listSubheaderLoadingDelegate, CellDetailsDelegate cellDetailsDelegate, CellDetailsLoadingDelegate cellDetailsLoadingDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderLoadingDelegate, "listSubheaderLoadingDelegate");
        Intrinsics.checkNotNullParameter(cellDetailsDelegate, "cellDetailsDelegate");
        Intrinsics.checkNotNullParameter(cellDetailsLoadingDelegate, "cellDetailsLoadingDelegate");
        this.f189471a = listSubheaderDelegate;
        this.f189472b = listSubheaderLoadingDelegate;
        this.f189473c = cellDetailsDelegate;
        this.d = cellDetailsLoadingDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f189471a, cVar.f189471a) && Intrinsics.f(this.f189472b, cVar.f189472b) && Intrinsics.f(this.f189473c, cVar.f189473c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f189473c.hashCode() + ((this.f189472b.hashCode() + (this.f189471a.hashCode() * 31)) * 31)) * 31);
    }
}
