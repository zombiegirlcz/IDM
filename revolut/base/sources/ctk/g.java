package ctk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f108685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f108686b;

    public g(ListSubheaderDelegate listSubheaderDelegate, f scrollerBoxDelegates) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(scrollerBoxDelegates, "scrollerBoxDelegates");
        this.f108685a = listSubheaderDelegate;
        this.f108686b = scrollerBoxDelegates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f108685a, gVar.f108685a) && Intrinsics.f(this.f108686b, gVar.f108686b);
    }

    public final int hashCode() {
        return this.f108686b.f108684a.hashCode() + (this.f108685a.hashCode() * 31);
    }
}
