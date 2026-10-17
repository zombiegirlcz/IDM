package rlh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255067a;

    public o(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f255067a = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f255067a, ((o) obj2).f255067a);
    }

    public final int hashCode() {
        return this.f255067a.hashCode();
    }
}
