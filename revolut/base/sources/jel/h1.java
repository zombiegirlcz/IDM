package jel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173463c;
    public final String d;
    public final j1 e;
    public final a3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f173464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nel.z f173465h;
    public final List i;

    public h1(String symbol, String ref2, String str, String stockExchangeCode, j1 j1Var, a3 sector, b bVar, nel.z type, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f173461a = symbol;
        this.f173462b = ref2;
        this.f173463c = str;
        this.d = stockExchangeCode;
        this.e = j1Var;
        this.f = sector;
        this.f173464g = bVar;
        this.f173465h = type;
        this.i = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f173461a, h1Var.f173461a) && Intrinsics.f(this.f173462b, h1Var.f173462b) && Intrinsics.f(this.f173463c, h1Var.f173463c) && Intrinsics.f(this.d, h1Var.d) && Intrinsics.f(this.e, h1Var.e) && this.f == h1Var.f && Intrinsics.f(this.f173464g, h1Var.f173464g) && this.f173465h == h1Var.f173465h && Intrinsics.f(this.i, h1Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173461a.hashCode() * 31, 31, this.f173462b);
        String str = this.f173463c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        j1 j1Var = this.e;
        int iHashCode = (this.f.hashCode() + ((iC2 + (j1Var == null ? 0 : j1Var.hashCode())) * 31)) * 31;
        b bVar = this.f173464g;
        int iHashCode2 = (this.f173465h.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        List list = this.i;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // jel.c
    public final String i() {
        return this.f173462b;
    }
}
