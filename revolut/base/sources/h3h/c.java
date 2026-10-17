package h3h;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HeaderDelegate f149123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f149124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f149125c;
    public final RowDelegate d;
    public final RowLoadingDelegate e;

    public c(HeaderDelegate headerDelegate, ListSubheaderDelegate listSubheaderDelegate, ListSubheaderLoadingDelegate listSubheaderLoadingDelegate, RowDelegate rowDelegate, RowLoadingDelegate rowLoadingDelegate) {
        Intrinsics.checkNotNullParameter(headerDelegate, "headerDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderLoadingDelegate, "listSubheaderLoadingDelegate");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        this.f149123a = headerDelegate;
        this.f149124b = listSubheaderDelegate;
        this.f149125c = listSubheaderLoadingDelegate;
        this.d = rowDelegate;
        this.e = rowLoadingDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f149123a, cVar.f149123a) && Intrinsics.f(this.f149124b, cVar.f149124b) && Intrinsics.f(this.f149125c, cVar.f149125c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f149125c.hashCode() + ((this.f149124b.hashCode() + (this.f149123a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
