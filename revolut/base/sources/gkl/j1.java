package gkl;

import com.revolut.sso.impl.domain.models.SessionToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionToken f144461a;

    public j1(SessionToken sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.f144461a = sessionToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j1) && Intrinsics.f(this.f144461a, ((j1) obj2).f144461a);
    }

    public final int hashCode() {
        return this.f144461a.f106160a.hashCode();
    }
}
