package a9f;

import jo3.b;
import kotlin.jvm.internal.Intrinsics;
import u8f.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2433c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f2435h;

    public a(String accountId, String ref2, String name, String symbol, String currency, d direction, String str, b bVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f2431a = accountId;
        this.f2432b = ref2;
        this.f2433c = name;
        this.d = symbol;
        this.e = currency;
        this.f = direction;
        this.f2434g = str;
        this.f2435h = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f2431a, aVar.f2431a) && Intrinsics.f(this.f2432b, aVar.f2432b) && Intrinsics.f(this.f2433c, aVar.f2433c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f2434g, aVar.f2434g) && Intrinsics.f(this.f2435h, aVar.f2435h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f2431a.hashCode() * 31, 31, this.f2432b), 31, this.f2433c), 31, this.d), 31, this.e)) * 31;
        String str = this.f2434g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f2435h;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
