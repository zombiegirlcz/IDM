package ly9;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f200757a;

    public c(CardOwner card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f200757a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f200757a, ((c) obj2).f200757a);
    }

    public final int hashCode() {
        return this.f200757a.hashCode();
    }
}
