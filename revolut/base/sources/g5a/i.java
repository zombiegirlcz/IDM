package g5a;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerWithStats f140706a;

    public i(CardOwnerWithStats cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f140706a = cardOwner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f140706a, ((i) obj2).f140706a);
    }

    public final int hashCode() {
        return this.f140706a.hashCode();
    }
}
