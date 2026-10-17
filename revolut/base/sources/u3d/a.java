package u3d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276922c;
    public final String d;
    public final Integer e;

    public a(int i, Integer num, String assetId, String symbol, String str, String str2) {
        str2 = (i & 8) != 0 ? null : str2;
        num = (i & 16) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f276920a = assetId;
        this.f276921b = symbol;
        this.f276922c = str;
        this.d = str2;
        this.e = num;
    }

    public final String a() {
        return this.f276920a;
    }

    public final String b() {
        return this.f276922c;
    }

    public final String c() {
        return this.f276921b;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f276920a, aVar.f276920a) && Intrinsics.f(this.f276921b, aVar.f276921b) && Intrinsics.f(this.f276922c, aVar.f276922c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f276920a.hashCode() * 31, 31, this.f276921b);
        String str = this.f276922c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
