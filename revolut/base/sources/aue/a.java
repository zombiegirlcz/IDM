package aue;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f9804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f9805c;
    public final dj0.d d;
    public final dj0.d e;

    public a(c type, dj0.d totalLimit, dj0.d usedLimit, dj0.d remainingLimit, dj0.d remainingLimitInTopUpCurrency) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
        Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
        Intrinsics.checkNotNullParameter(remainingLimitInTopUpCurrency, "remainingLimitInTopUpCurrency");
        this.f9803a = type;
        this.f9804b = totalLimit;
        this.f9805c = usedLimit;
        this.d = remainingLimit;
        this.e = remainingLimitInTopUpCurrency;
    }

    @Override // aue.b
    public final c a() {
        return this.f9803a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f9803a == aVar.f9803a && Intrinsics.f(this.f9804b, aVar.f9804b) && Intrinsics.f(this.f9805c, aVar.f9805c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f9803a.hashCode() * 31, 31, this.f9804b), 31, this.f9805c), 31, this.d);
    }
}
