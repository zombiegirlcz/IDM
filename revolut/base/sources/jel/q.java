package jel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173542c;
    public final String d;
    public final s e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f173543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f173544h;
    public final List i;

    public q(String symbol, String ref2, String str, String stockExchangeCode, s sVar, r rVar, String str2, String str3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f173540a = symbol;
        this.f173541b = ref2;
        this.f173542c = str;
        this.d = stockExchangeCode;
        this.e = sVar;
        this.f = rVar;
        this.f173543g = str2;
        this.f173544h = str3;
        this.i = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f173540a, qVar.f173540a) && Intrinsics.f(this.f173541b, qVar.f173541b) && Intrinsics.f(this.f173542c, qVar.f173542c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f173543g, qVar.f173543g) && Intrinsics.f(this.f173544h, qVar.f173544h) && Intrinsics.f(this.i, qVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173540a.hashCode() * 31, 31, this.f173541b);
        String str = this.f173542c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        s sVar = this.e;
        int iHashCode = (iC2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        r rVar = this.f;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str2 = this.f173543g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f173544h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.i;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // jel.c
    public final String i() {
        return this.f173541b;
    }
}
