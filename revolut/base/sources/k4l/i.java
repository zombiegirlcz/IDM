package k4l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f180982c;

    public i(dj0.d investment, String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(investment, "investment");
        this.f180980a = ref2;
        this.f180981b = symbol;
        this.f180982c = investment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f180980a, iVar.f180980a) && Intrinsics.f(this.f180981b, iVar.f180981b) && Intrinsics.f(this.f180982c, iVar.f180982c);
    }

    public final int hashCode() {
        return this.f180982c.hashCode() + p.a.c(this.f180980a.hashCode() * 31, 31, this.f180981b);
    }
}
