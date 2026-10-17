package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300856a;

    public c(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f300856a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f300856a, ((c) obj2).f300856a);
    }

    public final int hashCode() {
        return this.f300856a.hashCode();
    }
}
