package qmh;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollerDelegate f247842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionCardDelegate f247843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderDelegate f247844c;

    public d(ActionCardDelegate actionCardDelegate, ListSubheaderDelegate listSubheaderDelegate, ScrollerDelegate scrollerDelegate) {
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        Intrinsics.checkNotNullParameter(actionCardDelegate, "actionCardDelegate");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        this.f247842a = scrollerDelegate;
        this.f247843b = actionCardDelegate;
        this.f247844c = listSubheaderDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f247842a, dVar.f247842a) && Intrinsics.f(this.f247843b, dVar.f247843b) && Intrinsics.f(this.f247844c, dVar.f247844c);
    }

    public final int hashCode() {
        return this.f247844c.hashCode() + ((this.f247843b.hashCode() + (this.f247842a.hashCode() * 31)) * 31);
    }
}
