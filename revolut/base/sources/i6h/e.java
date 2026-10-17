package i6h;

import kotlin.jvm.internal.Intrinsics;
import lk0.f;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159015b;

    public e(String portfolioId, String str) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f159014a = portfolioId;
        this.f159015b = str;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        r6.b.D("Use cursor-based pagination");
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f159014a, eVar.f159014a) && Intrinsics.f(this.f159015b, eVar.f159015b);
    }

    public final int hashCode() {
        int iHashCode = this.f159014a.hashCode() * 31;
        String str = this.f159015b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
