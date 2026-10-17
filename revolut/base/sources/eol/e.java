package eol;

import com.revolut.sso.impl.domain.models.ClaimToManage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClaimToManage.WebAuthn f127998a;

    public e(ClaimToManage.WebAuthn passkey) {
        Intrinsics.checkNotNullParameter(passkey, "passkey");
        this.f127998a = passkey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f127998a, ((e) obj2).f127998a);
    }

    public final int hashCode() {
        return this.f127998a.hashCode();
    }
}
