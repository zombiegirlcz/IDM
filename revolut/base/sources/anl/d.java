package anl;

import com.revolut.sso.api.models.RevolutAccountSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccountSession f7809a;

    public d(RevolutAccountSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f7809a = session;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f7809a, ((d) obj2).f7809a);
    }

    public final int hashCode() {
        return this.f7809a.hashCode();
    }
}
