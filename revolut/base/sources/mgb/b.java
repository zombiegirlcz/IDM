package mgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f205226b;

    public b(dj0.d prizeAmount, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f205225a = deeplink;
        this.f205226b = prizeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f205225a, bVar.f205225a) && Intrinsics.f(this.f205226b, bVar.f205226b);
    }

    public final int hashCode() {
        return this.f205226b.hashCode() + (this.f205225a.hashCode() * 31);
    }
}
