package sgl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f262675c;

    public d(String symbol, String ref2, e fees) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f262673a = symbol;
        this.f262674b = ref2;
        this.f262675c = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f262673a, dVar.f262673a) && Intrinsics.f(this.f262674b, dVar.f262674b) && Intrinsics.f(this.f262675c, dVar.f262675c);
    }

    public final int hashCode() {
        return this.f262675c.hashCode() + p.a.c(this.f262673a.hashCode() * 31, 31, this.f262674b);
    }
}
