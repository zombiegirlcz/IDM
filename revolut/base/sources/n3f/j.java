package n3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f212060c;

    public j(String symbol, String ref2, jo3.b amount) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f212058a = symbol;
        this.f212059b = ref2;
        this.f212060c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f212058a, jVar.f212058a) && Intrinsics.f(this.f212059b, jVar.f212059b) && Intrinsics.f(this.f212060c, jVar.f212060c);
    }

    public final int hashCode() {
        return this.f212060c.hashCode() + p.a.c(this.f212058a.hashCode() * 31, 31, this.f212059b);
    }
}
