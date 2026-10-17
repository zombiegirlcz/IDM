package s43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.a f259733b;

    public d(String id10, x33.a pocketWithBalance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pocketWithBalance, "pocketWithBalance");
        this.f259732a = id10;
        this.f259733b = pocketWithBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f259732a, dVar.f259732a) && Intrinsics.f(this.f259733b, dVar.f259733b);
    }

    public final int hashCode() {
        return this.f259733b.hashCode() + (this.f259732a.hashCode() * 31);
    }
}
