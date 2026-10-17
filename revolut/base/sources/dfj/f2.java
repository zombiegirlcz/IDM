package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfj.i f113963a;

    public f2(pfj.i authorizationResponse) {
        Intrinsics.checkNotNullParameter(authorizationResponse, "authorizationResponse");
        this.f113963a = authorizationResponse;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f2) && Intrinsics.f(this.f113963a, ((f2) obj2).f113963a);
    }

    public final int hashCode() {
        return this.f113963a.hashCode();
    }
}
