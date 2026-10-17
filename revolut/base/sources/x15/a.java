package x15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll4.a f302242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f302243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f302244c;

    public a(ll4.a info, xi0.b currency, int i) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f302242a = info;
        this.f302243b = currency;
        this.f302244c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f302242a, aVar.f302242a) && Intrinsics.f(this.f302243b, aVar.f302243b) && this.f302244c == aVar.f302244c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f302244c) + h30.l.j(this.f302243b, this.f302242a.hashCode() * 31, 31);
    }
}
