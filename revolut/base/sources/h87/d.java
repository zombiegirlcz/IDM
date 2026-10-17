package h87;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f149948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f149949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f149950c;
    public final RowLoadingDelegate d;

    public d(FullScreenStateDelegate fullScreenStateDelegate, ListSubheaderDelegate listSubheaderDelegate, RowDelegate rowDelegate, RowLoadingDelegate rowLoadingDelegate) {
        Intrinsics.checkNotNullParameter(fullScreenStateDelegate, "fullScreenStateDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        this.f149948a = fullScreenStateDelegate;
        this.f149949b = listSubheaderDelegate;
        this.f149950c = rowDelegate;
        this.d = rowLoadingDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f149948a, dVar.f149948a) && Intrinsics.f(this.f149949b, dVar.f149949b) && Intrinsics.f(this.f149950c, dVar.f149950c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f149950c.hashCode() + ((this.f149949b.hashCode() + (this.f149948a.hashCode() * 31)) * 31)) * 31);
    }
}
