package n35;

import ip0.v7;
import java.io.Serializable;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f211866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f211867c;
    public final String d;
    public final LocalDateTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f211868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f211869h;

    public a(String id10, long j2, long j3, String currency, LocalDateTime date, String str, double d, String transactionId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f211865a = id10;
        this.f211866b = j2;
        this.f211867c = j3;
        this.d = currency;
        this.e = date;
        this.f = str;
        this.f211868g = d;
        this.f211869h = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f211865a, aVar.f211865a) && this.f211866b == aVar.f211866b && this.f211867c == aVar.f211867c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Double.compare(this.f211868g, aVar.f211868g) == 0 && Intrinsics.f(this.f211869h, aVar.f211869h);
    }

    public final int hashCode() {
        int i = v7.i(this.e, p.a.c(a0.d.c(a0.d.c(this.f211865a.hashCode() * 31, 31, this.f211866b), 31, this.f211867c), 31, this.d), 31);
        String str = this.f;
        return this.f211869h.hashCode() + m72.b.c((i + (str == null ? 0 : str.hashCode())) * 31, this.f211868g, 31);
    }
}
