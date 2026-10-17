package anh;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f7778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f7779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f7780c;

    public a(ListSubheaderDelegate listSubheaderDelegate, FullScreenStateDelegate fullScreenStateDelegate, RowDelegate rowDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(fullScreenStateDelegate, "fullScreenStateDelegate");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        this.f7778a = listSubheaderDelegate;
        this.f7779b = fullScreenStateDelegate;
        this.f7780c = rowDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f7778a, aVar.f7778a) && Intrinsics.f(this.f7779b, aVar.f7779b) && Intrinsics.f(this.f7780c, aVar.f7780c);
    }

    public final int hashCode() {
        return this.f7780c.hashCode() + ((this.f7779b.hashCode() + (this.f7778a.hashCode() * 31)) * 31);
    }
}
