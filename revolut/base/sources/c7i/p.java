package c7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f22020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f22021b;

    public p(o topAccount, o bottomAccount) {
        Intrinsics.checkNotNullParameter(topAccount, "topAccount");
        Intrinsics.checkNotNullParameter(bottomAccount, "bottomAccount");
        this.f22020a = topAccount;
        this.f22021b = bottomAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f22020a, pVar.f22020a) && Intrinsics.f(this.f22021b, pVar.f22021b);
    }

    public final int hashCode() {
        return this.f22021b.hashCode() + (this.f22020a.hashCode() * 31);
    }
}
