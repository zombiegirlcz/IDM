package qll;

import com.revolut.sso.api.models.RevolutAccountSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccountSession f247601a;

    public s(RevolutAccountSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f247601a = session;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f247601a, ((s) obj2).f247601a);
    }

    public final int hashCode() {
        return this.f247601a.hashCode();
    }
}
