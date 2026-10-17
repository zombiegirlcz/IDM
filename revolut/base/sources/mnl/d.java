package mnl;

import com.revolut.sso.impl.domain.models.AuthResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthResult f207518a;

    public d(AuthResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f207518a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f207518a, ((d) obj2).f207518a);
    }

    public final int hashCode() {
        return this.f207518a.hashCode();
    }
}
