package t36;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f267657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f267658c;

    public a(dj0.d balance, dj0.d fiatValue, String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(fiatValue, "fiatValue");
        this.f267656a = pocketId;
        this.f267657b = balance;
        this.f267658c = fiatValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f267656a, aVar.f267656a) && Intrinsics.f(this.f267657b, aVar.f267657b) && Intrinsics.f(this.f267658c, aVar.f267658c);
    }

    public final int hashCode() {
        return this.f267658c.hashCode() + v7.c(this.f267656a.hashCode() * 31, 31, this.f267657b);
    }
}
