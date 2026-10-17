package tll;

import com.revolut.sso.impl.domain.models.Challenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Challenge f272111a;

    public g(Challenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f272111a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f272111a, ((g) obj2).f272111a);
    }

    public final int hashCode() {
        return this.f272111a.hashCode();
    }
}
