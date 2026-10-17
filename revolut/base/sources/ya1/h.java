package ya1;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f311900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f311901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f311902c;
    public final dj0.d d;
    public final dj0.d e;

    public h(dj0.d terminalPrice, dj0.d deliveryFee, dj0.d vat, dj0.d subTotal, dj0.d total) {
        Intrinsics.checkNotNullParameter(terminalPrice, "terminalPrice");
        Intrinsics.checkNotNullParameter(deliveryFee, "deliveryFee");
        Intrinsics.checkNotNullParameter(vat, "vat");
        Intrinsics.checkNotNullParameter(subTotal, "subTotal");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f311900a = terminalPrice;
        this.f311901b = deliveryFee;
        this.f311902c = vat;
        this.d = subTotal;
        this.e = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f311900a, hVar.f311900a) && Intrinsics.f(this.f311901b, hVar.f311901b) && Intrinsics.f(this.f311902c, hVar.f311902c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f311900a.hashCode() * 31, 31, this.f311901b), 31, this.f311902c), 31, this.d);
    }
}
