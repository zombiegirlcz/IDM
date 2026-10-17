package ra1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f252777c;
    public final String d;

    public a(String prodCert, String kekCert, String sredIksn, String pinIksn) {
        Intrinsics.checkNotNullParameter(prodCert, "prodCert");
        Intrinsics.checkNotNullParameter(kekCert, "kekCert");
        Intrinsics.checkNotNullParameter(sredIksn, "sredIksn");
        Intrinsics.checkNotNullParameter(pinIksn, "pinIksn");
        this.f252775a = prodCert;
        this.f252776b = kekCert;
        this.f252777c = sredIksn;
        this.d = pinIksn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f252775a, aVar.f252775a) && Intrinsics.f(this.f252776b, aVar.f252776b) && Intrinsics.f(this.f252777c, aVar.f252777c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f252775a.hashCode() * 31, 31, this.f252776b), 31, this.f252777c);
    }
}
