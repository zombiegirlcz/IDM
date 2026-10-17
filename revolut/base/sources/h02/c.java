package h02;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148182c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f148183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDateTime f148184h;
    public final LocalDateTime i;

    public c(String id10, String pin, String operationIdentifier, String merchantName, String revolutCardId, String serviceCardNumber, dj0.d amount, LocalDateTime purchasedDate, LocalDateTime expirationDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(operationIdentifier, "operationIdentifier");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(revolutCardId, "revolutCardId");
        Intrinsics.checkNotNullParameter(serviceCardNumber, "serviceCardNumber");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(purchasedDate, "purchasedDate");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f148180a = id10;
        this.f148181b = pin;
        this.f148182c = operationIdentifier;
        this.d = merchantName;
        this.e = revolutCardId;
        this.f = serviceCardNumber;
        this.f148183g = amount;
        this.f148184h = purchasedDate;
        this.i = expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f148180a, cVar.f148180a) && Intrinsics.f(this.f148181b, cVar.f148181b) && Intrinsics.f(this.f148182c, cVar.f148182c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f148183g, cVar.f148183g) && Intrinsics.f(this.f148184h, cVar.f148184h) && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + v7.i(this.f148184h, v7.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f148180a.hashCode() * 31, 31, this.f148181b), 31, this.f148182c), 31, this.d), 31, this.e), 31, this.f), 31, this.f148183g), 31);
    }
}
