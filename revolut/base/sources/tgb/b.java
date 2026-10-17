package tgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f271127b;

    public b(dj0.d prizeAmount, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f271126a = deeplink;
        this.f271127b = prizeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f271126a, bVar.f271126a) && Intrinsics.f(this.f271127b, bVar.f271127b);
    }

    public final int hashCode() {
        return this.f271127b.hashCode() + (this.f271126a.hashCode() * 31);
    }
}
