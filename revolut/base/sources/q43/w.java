package q43;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketWithSubaccount f242052a;

    public w(PocketWithSubaccount pocketWithSubaccount) {
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        this.f242052a = pocketWithSubaccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f242052a, ((w) obj2).f242052a);
    }

    public final int hashCode() {
        return this.f242052a.hashCode();
    }
}
