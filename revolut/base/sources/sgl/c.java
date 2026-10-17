package sgl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f262672c;

    public c(String symbol, String ref2, e amount) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f262670a = symbol;
        this.f262671b = ref2;
        this.f262672c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f262670a, cVar.f262670a) && Intrinsics.f(this.f262671b, cVar.f262671b) && Intrinsics.f(this.f262672c, cVar.f262672c);
    }

    public final int hashCode() {
        return this.f262672c.hashCode() + p.a.c(this.f262670a.hashCode() * 31, 31, this.f262671b);
    }
}
