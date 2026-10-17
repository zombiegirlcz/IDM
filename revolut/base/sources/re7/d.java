package re7;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChecklistChallenge f253533a;

    public d(ChecklistChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f253533a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f253533a, ((d) obj2).f253533a);
    }

    public final int hashCode() {
        return this.f253533a.hashCode();
    }
}
