package re7;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f253530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChecklistChallenge f253531b;

    public a(j card, ChecklistChallenge challenge) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f253530a = card;
        this.f253531b = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f253530a, aVar.f253530a) && Intrinsics.f(this.f253531b, aVar.f253531b);
    }

    public final int hashCode() {
        return this.f253531b.hashCode() + (this.f253530a.hashCode() * 31);
    }
}
