package eqa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import eqa.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a.AbstractC0741a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f128416a;

    public b(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f128416a = cardOwner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f128416a, ((b) obj2).f128416a);
    }

    public final int hashCode() {
        return this.f128416a.hashCode();
    }
}
