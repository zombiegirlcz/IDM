package j83;

import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminatedCard f172108a;

    public h(TerminatedCard terminatedCard) {
        Intrinsics.checkNotNullParameter(terminatedCard, "terminatedCard");
        this.f172108a = terminatedCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f172108a, ((h) obj2).f172108a);
    }

    public final int hashCode() {
        return this.f172108a.hashCode();
    }
}
