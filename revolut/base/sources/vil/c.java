package vil;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentChallenge.App f289611a;

    public c(ConsentChallenge.App challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f289611a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f289611a, ((c) obj2).f289611a);
    }

    public final int hashCode() {
        return this.f289611a.hashCode();
    }
}
