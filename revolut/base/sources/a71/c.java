package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1723c;

    public c(String maskedPan, String expiry, String deliveryAddress) {
        Intrinsics.checkNotNullParameter(maskedPan, "maskedPan");
        Intrinsics.checkNotNullParameter(expiry, "expiry");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        this.f1721a = maskedPan;
        this.f1722b = expiry;
        this.f1723c = deliveryAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f1721a, cVar.f1721a) && Intrinsics.f(this.f1722b, cVar.f1722b) && Intrinsics.f(this.f1723c, cVar.f1723c);
    }

    public final int hashCode() {
        return this.f1723c.hashCode() + p.a.c(this.f1721a.hashCode() * 31, 31, this.f1722b);
    }
}
