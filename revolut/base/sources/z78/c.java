package z78;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t68.f f319944a;

    public c(t68.f juniorProfileWithWalletId) {
        Intrinsics.checkNotNullParameter(juniorProfileWithWalletId, "juniorProfileWithWalletId");
        this.f319944a = juniorProfileWithWalletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f319944a, ((c) obj2).f319944a);
    }

    public final int hashCode() {
        return this.f319944a.hashCode();
    }
}
