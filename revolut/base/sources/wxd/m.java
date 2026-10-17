package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300873a;

    public m(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f300873a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f300873a, ((m) obj2).f300873a);
    }

    public final int hashCode() {
        return this.f300873a.hashCode();
    }
}
