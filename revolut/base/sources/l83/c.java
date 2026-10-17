package l83;

import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminatedCard f192766a;

    public c(TerminatedCard terminatedCard) {
        Intrinsics.checkNotNullParameter(terminatedCard, "terminatedCard");
        this.f192766a = terminatedCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f192766a, ((c) obj2).f192766a);
    }

    public final int hashCode() {
        return this.f192766a.hashCode();
    }
}
