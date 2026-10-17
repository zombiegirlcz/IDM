package l83;

import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminatedCard f192765a;

    public b(TerminatedCard terminatedCard) {
        Intrinsics.checkNotNullParameter(terminatedCard, "terminatedCard");
        this.f192765a = terminatedCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f192765a, ((b) obj2).f192765a);
    }

    public final int hashCode() {
        return this.f192765a.hashCode();
    }
}
