package ip4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f167655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f167656c;
    public final dj0.d d;
    public final xi0.b e;

    public h(String cardholderId, dj0.d dVar, dj0.d limitMin, dj0.d limitMax, xi0.b currency) {
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(limitMin, "limitMin");
        Intrinsics.checkNotNullParameter(limitMax, "limitMax");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f167654a = cardholderId;
        this.f167655b = dVar;
        this.f167656c = limitMin;
        this.d = limitMax;
        this.e = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f167654a, hVar.f167654a) && Intrinsics.f(this.f167655b, hVar.f167655b) && Intrinsics.f(this.f167656c, hVar.f167656c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f167654a.hashCode() * 31;
        dj0.d dVar = this.f167655b;
        return this.e.hashCode() + v7.c(v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f167656c), 31, this.d);
    }
}
