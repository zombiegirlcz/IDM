package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f310024c;

    public r(String symbol, String ref2, q assetType) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f310022a = symbol;
        this.f310023b = ref2;
        this.f310024c = assetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f310022a, rVar.f310022a) && Intrinsics.f(this.f310023b, rVar.f310023b) && this.f310024c == rVar.f310024c;
    }

    public final int hashCode() {
        return this.f310024c.hashCode() + p.a.c(this.f310022a.hashCode() * 31, 31, this.f310023b);
    }
}
