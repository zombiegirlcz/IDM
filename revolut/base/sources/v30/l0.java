package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30.n f285805a;

    public l0(w30.n callRequest) {
        Intrinsics.checkNotNullParameter(callRequest, "callRequest");
        this.f285805a = callRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f285805a, ((l0) obj2).f285805a);
    }

    public final int hashCode() {
        return this.f285805a.hashCode();
    }
}
