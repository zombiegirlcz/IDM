package col;

import com.revolut.sso.api.models.WebAuthnEvidence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebAuthnEvidence f25571a;

    public a(WebAuthnEvidence evidence) {
        Intrinsics.checkNotNullParameter(evidence, "evidence");
        this.f25571a = evidence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f25571a, ((a) obj2).f25571a);
    }

    public final int hashCode() {
        return this.f25571a.hashCode();
    }
}
