package i83;

import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends com.revolut.feature.card_screen.impl.kompot.reactivate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminatedCard f159421a;

    public g(TerminatedCard terminatedCard) {
        Intrinsics.checkNotNullParameter(terminatedCard, "terminatedCard");
        this.f159421a = terminatedCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f159421a, ((g) obj2).f159421a);
    }

    public final int hashCode() {
        return this.f159421a.hashCode();
    }
}
