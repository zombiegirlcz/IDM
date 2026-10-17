package t50;

import com.revolut.chat.domain.model.rate.RateChatExperienceData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateChatExperienceData f268021a;

    public j(RateChatExperienceData chosenRating) {
        Intrinsics.checkNotNullParameter(chosenRating, "chosenRating");
        this.f268021a = chosenRating;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f268021a, ((j) obj2).f268021a);
    }

    public final int hashCode() {
        return this.f268021a.hashCode();
    }
}
