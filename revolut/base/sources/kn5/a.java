package kn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f185997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185998c;

    public a(String address, wk5.a blockchain, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f185996a = address;
        this.f185997b = blockchain;
        this.f185998c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f185996a, aVar.f185996a) && this.f185997b == aVar.f185997b && this.f185998c == aVar.f185998c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185998c) + ((this.f185997b.hashCode() + (this.f185996a.hashCode() * 31)) * 31);
    }
}
