package omh;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f226844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RowLoadingDelegate f226845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderDelegate f226846c;

    public a(RowDelegate rowDelegate, RowLoadingDelegate rowLoadingDelegate, ListSubheaderDelegate listSubheaderDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        this.f226844a = rowDelegate;
        this.f226845b = rowLoadingDelegate;
        this.f226846c = listSubheaderDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f226844a, aVar.f226844a) && Intrinsics.f(this.f226845b, aVar.f226845b) && Intrinsics.f(this.f226846c, aVar.f226846c);
    }

    public final int hashCode() {
        return this.f226846c.hashCode() + ((this.f226845b.hashCode() + (this.f226844a.hashCode() * 31)) * 31);
    }
}
