package zqa;

import aii.m;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOwner f324449b;

    public i(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f324449b = cardOwner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f324449b, ((i) obj2).f324449b);
    }

    public final int hashCode() {
        return this.f324449b.hashCode();
    }
}
