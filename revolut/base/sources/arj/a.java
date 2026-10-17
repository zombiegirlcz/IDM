package arj;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8721c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8723h;

    public a(long j2, String id10, String type, String walletId, String currency, String startDate, String endDate, String categoryTag) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(categoryTag, "categoryTag");
        this.f8719a = id10;
        this.f8720b = type;
        this.f8721c = j2;
        this.d = walletId;
        this.e = currency;
        this.f = startDate;
        this.f8722g = endDate;
        this.f8723h = categoryTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8719a, aVar.f8719a) && Intrinsics.f(this.f8720b, aVar.f8720b) && this.f8721c == aVar.f8721c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f8722g, aVar.f8722g) && Intrinsics.f(this.f8723h, aVar.f8723h);
    }

    public final int hashCode() {
        return this.f8723h.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(d.c(p.a.c(this.f8719a.hashCode() * 31, 31, this.f8720b), 31, this.f8721c), 31, this.d), 31, this.e), 31, this.f), 31, this.f8722g);
    }
}
