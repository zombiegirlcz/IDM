package wrl;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f299632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f299633c;

    public b(long j2, d amount, String exchange) {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f299631a = exchange;
        this.f299632b = amount;
        this.f299633c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f299631a, bVar.f299631a) && Intrinsics.f(this.f299632b, bVar.f299632b) && this.f299633c == bVar.f299633c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f299633c) + v7.c(this.f299631a.hashCode() * 31, 31, this.f299632b);
    }
}
