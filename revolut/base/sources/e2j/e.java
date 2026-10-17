package e2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f122119b;

    public e(dj0.d balance, String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f122118a = displayName;
        this.f122119b = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f122118a, eVar.f122118a) && Intrinsics.f(this.f122119b, eVar.f122119b);
    }

    public final int hashCode() {
        return this.f122119b.hashCode() + (this.f122118a.hashCode() * 31);
    }
}
