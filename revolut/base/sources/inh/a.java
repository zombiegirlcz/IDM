package inh;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f162937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScrollerDelegate f162938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionCardDelegate f162939c;

    public a(ActionCardDelegate actionCardDelegate, ListSubheaderDelegate listSubheaderDelegate, ScrollerDelegate scrollerDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        Intrinsics.checkNotNullParameter(actionCardDelegate, "actionCardDelegate");
        this.f162937a = listSubheaderDelegate;
        this.f162938b = scrollerDelegate;
        this.f162939c = actionCardDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162937a, aVar.f162937a) && Intrinsics.f(this.f162938b, aVar.f162938b) && Intrinsics.f(this.f162939c, aVar.f162939c);
    }

    public final int hashCode() {
        return this.f162939c.hashCode() + ((this.f162938b.hashCode() + (this.f162937a.hashCode() * 31)) * 31);
    }
}
