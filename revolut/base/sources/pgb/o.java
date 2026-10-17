package pgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tgb.l f235847a;

    public o(tgb.l reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f235847a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f235847a, ((o) obj2).f235847a);
    }

    public final int hashCode() {
        return this.f235847a.hashCode();
    }
}
