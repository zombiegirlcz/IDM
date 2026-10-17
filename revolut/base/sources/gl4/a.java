package gl4;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f144554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f144555c;
    public final String d;
    public final String e;
    public final Instant f;

    public a(String id10, dj0.d amount, LocalDate validUntil, String billNumber, String qrCode, Instant createdAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(validUntil, "validUntil");
        Intrinsics.checkNotNullParameter(billNumber, "billNumber");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f144553a = id10;
        this.f144554b = amount;
        this.f144555c = validUntil;
        this.d = billNumber;
        this.e = qrCode;
        this.f = createdAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f144553a, aVar.f144553a) && Intrinsics.f(this.f144554b, aVar.f144554b) && Intrinsics.f(this.f144555c, aVar.f144555c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(y.a(v7.c(this.f144553a.hashCode() * 31, 31, this.f144554b), 31, this.f144555c), 31, this.d), 31, this.e);
    }
}
