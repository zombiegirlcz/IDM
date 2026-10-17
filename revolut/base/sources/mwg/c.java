package mwg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f209443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f209444c;
    public final float d;
    public final String e;
    public final ej0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f209445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f209446h;
    public final BigDecimal i;

    public c(String asset, BigDecimal quantity, dj0.d value, float f, String str, ej0.b bVar, ej0.b bVar2, String str2, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f209442a = asset;
        this.f209443b = quantity;
        this.f209444c = value;
        this.d = f;
        this.e = str;
        this.f = bVar;
        this.f209445g = bVar2;
        this.f209446h = str2;
        this.i = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f209442a, cVar.f209442a) && Intrinsics.f(this.f209443b, cVar.f209443b) && Intrinsics.f(this.f209444c, cVar.f209444c) && Float.compare(this.d, cVar.d) == 0 && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f209445g, cVar.f209445g) && Intrinsics.f(this.f209446h, cVar.f209446h) && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.d, v7.c(t61.a.d(this.f209443b, this.f209442a.hashCode() * 31, 31), 31, this.f209444c), 31);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        ej0.b bVar = this.f;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ej0.b bVar2 = this.f209445g;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str2 = this.f209446h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.i;
        return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
