package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfj.i f113948a;

    public e2(pfj.i authorizationResponse) {
        Intrinsics.checkNotNullParameter(authorizationResponse, "authorizationResponse");
        this.f113948a = authorizationResponse;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e2) && Intrinsics.f(this.f113948a, ((e2) obj2).f113948a);
    }

    public final int hashCode() {
        return this.f113948a.hashCode();
    }
}
