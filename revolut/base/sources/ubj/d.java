package ubj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f278918b;

    public d(String pocketId, wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f278917a = pocketId;
        this.f278918b = blockchain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f278917a, dVar.f278917a) && this.f278918b == dVar.f278918b;
    }

    public final int hashCode() {
        return this.f278918b.hashCode() + (this.f278917a.hashCode() * 31);
    }
}
