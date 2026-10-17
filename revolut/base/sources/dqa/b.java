package dqa;

import aii.r;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f116929a;

    public b(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f116929a = cardOwner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f116929a, ((b) obj2).f116929a);
    }

    public final int hashCode() {
        return this.f116929a.hashCode();
    }
}
