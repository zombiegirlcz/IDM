package vj5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f289651c;

    public c(String currency, String depositAddress, wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(depositAddress, "depositAddress");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f289649a = currency;
        this.f289650b = depositAddress;
        this.f289651c = blockchain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f289649a, cVar.f289649a) && Intrinsics.f(this.f289650b, cVar.f289650b) && this.f289651c == cVar.f289651c;
    }

    public final int hashCode() {
        return this.f289651c.hashCode() + p.a.c(this.f289649a.hashCode() * 31, 31, this.f289650b);
    }
}
