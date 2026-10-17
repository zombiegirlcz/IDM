package zzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326729b;

    public b(String str, String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f326728a = str;
        this.f326729b = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f326728a, bVar.f326728a) && Intrinsics.f(this.f326729b, bVar.f326729b);
    }

    public final int hashCode() {
        String str = this.f326728a;
        return this.f326729b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
