package lmh;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f197072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f197073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallActionButtonDelegate f197074c;
    public final ActionsDelegate d;
    public final TextDelegate e;
    public final FullScreenStateDelegate f;

    public a(RowDelegate rowDelegate, ListSubheaderDelegate listSubheaderDelegate, SmallActionButtonDelegate smallActionButtonDelegate, ActionsDelegate actionsDelegate, TextDelegate textDelegate, FullScreenStateDelegate fullScreenStateDelegate) {
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(smallActionButtonDelegate, "smallActionButtonDelegate");
        Intrinsics.checkNotNullParameter(actionsDelegate, "actionsDelegate");
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(fullScreenStateDelegate, "fullScreenStateDelegate");
        this.f197072a = rowDelegate;
        this.f197073b = listSubheaderDelegate;
        this.f197074c = smallActionButtonDelegate;
        this.d = actionsDelegate;
        this.e = textDelegate;
        this.f = fullScreenStateDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f197072a, aVar.f197072a) && Intrinsics.f(this.f197073b, aVar.f197073b) && Intrinsics.f(this.f197074c, aVar.f197074c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f197074c.hashCode() + ((this.f197073b.hashCode() + (this.f197072a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
