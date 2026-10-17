package hp5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154468b;

    public d(String address, String blockchain) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f154467a = address;
        this.f154468b = blockchain;
    }

    public final String a() {
        return this.f154467a;
    }

    public final String b() {
        return this.f154468b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f154467a, dVar.f154467a) && Intrinsics.f(this.f154468b, dVar.f154468b);
    }

    public final int hashCode() {
        return this.f154468b.hashCode() + (this.f154467a.hashCode() * 31);
    }
}
