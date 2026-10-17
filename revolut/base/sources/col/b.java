package col;

import com.revolut.sso.impl.domain.models.Claim;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Claim.WebAuthn f25572a;

    public b(Claim.WebAuthn claim) {
        Intrinsics.checkNotNullParameter(claim, "claim");
        this.f25572a = claim;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f25572a, ((b) obj2).f25572a);
    }

    public final int hashCode() {
        return this.f25572a.hashCode();
    }
}
