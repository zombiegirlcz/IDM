package bjl;

import com.revolut.sso.api.models.RevolutAccountSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccountSession f16173a;

    public j0(RevolutAccountSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f16173a = session;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f16173a, ((j0) obj2).f16173a);
    }

    public final int hashCode() {
        return this.f16173a.hashCode();
    }
}
