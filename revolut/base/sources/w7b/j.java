package w7b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f295499a;

    public j(e93.f cardDesign) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f295499a = cardDesign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f295499a, ((j) obj2).f295499a);
    }

    public final int hashCode() {
        return this.f295499a.hashCode();
    }
}
