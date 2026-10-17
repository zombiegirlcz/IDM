package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfj.i f113931a;

    public c2(pfj.i authorizationResponse) {
        Intrinsics.checkNotNullParameter(authorizationResponse, "authorizationResponse");
        this.f113931a = authorizationResponse;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c2) && Intrinsics.f(this.f113931a, ((c2) obj2).f113931a);
    }

    public final int hashCode() {
        return this.f113931a.hashCode();
    }
}
