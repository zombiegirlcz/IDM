package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309984b;

    public e(String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f309983a = symbol;
        this.f309984b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f309983a, eVar.f309983a) && Intrinsics.f(this.f309984b, eVar.f309984b);
    }

    public final int hashCode() {
        return this.f309984b.hashCode() + (this.f309983a.hashCode() * 31);
    }
}
