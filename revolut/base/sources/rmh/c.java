package rmh;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.BasketDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f255321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionCardDelegate f255322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasketDelegate f255323c;
    public final ScrollerDelegate d;

    public c(ListSubheaderDelegate listSubheaderDelegate, ActionCardDelegate actionCardDelegate, BasketDelegate basketDelegate, ScrollerDelegate scrollerDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(actionCardDelegate, "actionCardDelegate");
        Intrinsics.checkNotNullParameter(basketDelegate, "basketDelegate");
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        this.f255321a = listSubheaderDelegate;
        this.f255322b = actionCardDelegate;
        this.f255323c = basketDelegate;
        this.d = scrollerDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f255321a, cVar.f255321a) && Intrinsics.f(this.f255322b, cVar.f255322b) && Intrinsics.f(this.f255323c, cVar.f255323c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f255323c.hashCode() + ((this.f255322b.hashCode() + (this.f255321a.hashCode() * 31)) * 31)) * 31);
    }
}
