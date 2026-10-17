package ip4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f167652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f167653c;
    public final dj0.d d;
    public final xi0.b e;

    public g(String cardholderId, dj0.d limitAmount, dj0.d limitMin, dj0.d limitMax, xi0.b currency) {
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(limitMin, "limitMin");
        Intrinsics.checkNotNullParameter(limitMax, "limitMax");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f167651a = cardholderId;
        this.f167652b = limitAmount;
        this.f167653c = limitMin;
        this.d = limitMax;
        this.e = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f167651a, gVar.f167651a) && Intrinsics.f(this.f167652b, gVar.f167652b) && Intrinsics.f(this.f167653c, gVar.f167653c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f167651a.hashCode() * 31, 31, this.f167652b), 31, this.f167653c), 31, this.d);
    }
}
