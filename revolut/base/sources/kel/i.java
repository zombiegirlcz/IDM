package kel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183167b;

    public i(String id10, String portfolioId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f183166a = id10;
        this.f183167b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f183166a, iVar.f183166a) && Intrinsics.f(this.f183167b, iVar.f183167b);
    }

    public final int hashCode() {
        return this.f183167b.hashCode() + (this.f183166a.hashCode() * 31);
    }
}
