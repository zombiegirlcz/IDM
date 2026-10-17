package wxg;

import ip0.v7;
import java.math.BigDecimal;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f300982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f300983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f300984c;
    public final float d;

    public k(mwg.c asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        a3 sector = ta6.a.c0(asset.f209442a);
        BigDecimal quantity = asset.f209443b;
        dj0.d value = asset.f209444c;
        float f = asset.d;
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f300982a = sector;
        this.f300983b = quantity;
        this.f300984c = value;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f300982a == kVar.f300982a && Intrinsics.f(this.f300983b, kVar.f300983b) && Intrinsics.f(this.f300984c, kVar.f300984c) && Float.compare(this.d, kVar.d) == 0;
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.d;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f300984c;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + v7.c(t61.a.d(this.f300983b, this.f300982a.hashCode() * 31, 31), 31, this.f300984c);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f300983b;
    }
}
