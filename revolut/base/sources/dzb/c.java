package dzb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121301a;

    public c(String newChallengeId) {
        Intrinsics.checkNotNullParameter(newChallengeId, "newChallengeId");
        this.f121301a = newChallengeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f121301a, ((c) obj2).f121301a);
    }

    public final int hashCode() {
        return this.f121301a.hashCode();
    }
}
