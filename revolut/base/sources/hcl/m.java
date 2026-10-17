package hcl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151068c;
    public final String d;
    public final o e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151070h;
    public final List i;

    public m(String ref2, String symbol, String str, String stockExchangeCode, o oVar, n nVar, String str2, String str3, List list) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f151066a = ref2;
        this.f151067b = symbol;
        this.f151068c = str;
        this.d = stockExchangeCode;
        this.e = oVar;
        this.f = nVar;
        this.f151069g = str2;
        this.f151070h = str3;
        this.i = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f151066a, mVar.f151066a) && Intrinsics.f(this.f151067b, mVar.f151067b) && Intrinsics.f(this.f151068c, mVar.f151068c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f151069g, mVar.f151069g) && Intrinsics.f(this.f151070h, mVar.f151070h) && Intrinsics.f(this.i, mVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f151066a.hashCode() * 31, 31, this.f151067b);
        String str = this.f151068c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        o oVar = this.e;
        int iHashCode = (iC2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        n nVar = this.f;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str2 = this.f151069g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f151070h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.i;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
