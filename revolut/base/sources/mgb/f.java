package mgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f205237b;

    public f(dj0.d prizeAmount, String cashDrawDeeplink) {
        Intrinsics.checkNotNullParameter(cashDrawDeeplink, "cashDrawDeeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f205236a = cashDrawDeeplink;
        this.f205237b = prizeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f205236a, fVar.f205236a) && Intrinsics.f(this.f205237b, fVar.f205237b);
    }

    public final int hashCode() {
        return this.f205237b.hashCode() + (this.f205236a.hashCode() * 31);
    }
}
