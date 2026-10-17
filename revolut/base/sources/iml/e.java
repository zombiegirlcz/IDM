package iml;

import com.revolut.sso.api.models.RevolutAccountSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccountSession f162563a;

    public e(RevolutAccountSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f162563a = session;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f162563a, ((e) obj2).f162563a);
    }

    public final int hashCode() {
        return this.f162563a.hashCode();
    }
}
