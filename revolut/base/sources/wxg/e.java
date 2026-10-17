package wxg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300964c;
    public final dj0.d d;
    public final String e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f300965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f300966h;

    public e(mwg.c cfdAsset, String name, String ref2, String symbol, dj0.d dVar, String str) {
        Intrinsics.checkNotNullParameter(cfdAsset, "cfdAsset");
        Intrinsics.checkNotNullParameter(name, "assetName");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        dj0.d value = cfdAsset.f209444c;
        float f = cfdAsset.d;
        BigDecimal quantity = cfdAsset.f209443b;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f300962a = symbol;
        this.f300963b = ref2;
        this.f300964c = name;
        this.d = dVar;
        this.e = str;
        this.f = value;
        this.f300965g = f;
        this.f300966h = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f300962a, eVar.f300962a) && Intrinsics.f(this.f300963b, eVar.f300963b) && Intrinsics.f(this.f300964c, eVar.f300964c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Float.compare(this.f300965g, eVar.f300965g) == 0 && Intrinsics.f(this.f300966h, eVar.f300966h);
    }

    @Override // wxg.m
    public final float getAllocation() {
        return this.f300965g;
    }

    @Override // wxg.m
    public final dj0.d getValue() {
        return this.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f300962a.hashCode() * 31, 31, this.f300963b), 31, this.f300964c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.e;
        return this.f300966h.hashCode() + m72.b.b(this.f300965g, v7.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31);
    }

    @Override // wxg.m
    public final BigDecimal u() {
        return this.f300966h;
    }
}
