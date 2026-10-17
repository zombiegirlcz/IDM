package nel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jel.c3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f214597c;
    public final String d;
    public final String e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f214598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f214599h;
    public final xi0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f214600j;
    public final t k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f214601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f214602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f214603n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f214604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xi0.b f214605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f214606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f214607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c3 f214608t;
    public final Long u;

    public n(String id10, String ref2, z type, String name, String ticker, v stateDetails, j0 j0Var, a aVar, xi0.b currency, String str, t exchange, Integer num, int i, Integer num2, String str2, List allSymbols, xi0.b bVar, ArrayList promotionCampaigns, u uVar, c3 c3Var, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(stateDetails, "stateDetails");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(allSymbols, "allSymbols");
        Intrinsics.checkNotNullParameter(promotionCampaigns, "promotionCampaigns");
        this.f214595a = id10;
        this.f214596b = ref2;
        this.f214597c = type;
        this.d = name;
        this.e = ticker;
        this.f = stateDetails;
        this.f214598g = j0Var;
        this.f214599h = aVar;
        this.i = currency;
        this.f214600j = str;
        this.k = exchange;
        this.f214601l = num;
        this.f214602m = i;
        this.f214603n = num2;
        this.o = str2;
        this.f214604p = allSymbols;
        this.f214605q = bVar;
        this.f214606r = promotionCampaigns;
        this.f214607s = uVar;
        this.f214608t = c3Var;
        this.u = l2;
    }

    public final String a() {
        return this.f214596b;
    }

    public final boolean b() {
        u uVar = this.f214607s;
        return (uVar == null || uVar.f214624a) ? false : true;
    }

    public final boolean c() {
        z zVar = this.f214597c;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == z.MUTUAL_FUND;
    }

    public final boolean d() {
        return io3.h.k(this.f214597c) && this.f214606r.contains(g0.f214575b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f214595a, nVar.f214595a) && Intrinsics.f(this.f214596b, nVar.f214596b) && this.f214597c == nVar.f214597c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f.equals(nVar.f) && Intrinsics.f(this.f214598g, nVar.f214598g) && Intrinsics.f(this.f214599h, nVar.f214599h) && this.i.equals(nVar.i) && Intrinsics.f(this.f214600j, nVar.f214600j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f214601l, nVar.f214601l) && this.f214602m == nVar.f214602m && Intrinsics.f(this.f214603n, nVar.f214603n) && Intrinsics.f(this.o, nVar.o) && Intrinsics.f(this.f214604p, nVar.f214604p) && Intrinsics.f(this.f214605q, nVar.f214605q) && this.f214606r.equals(nVar.f214606r) && Intrinsics.f(this.f214607s, nVar.f214607s) && this.f214608t == nVar.f214608t && Intrinsics.f(this.u, nVar.u);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c((this.f214597c.hashCode() + p.a.c(this.f214595a.hashCode() * 31, 31, this.f214596b)) * 31, 31, this.d), 31, this.e)) * 31;
        j0 j0Var = this.f214598g;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.f214580a.hashCode())) * 31;
        a aVar = this.f214599h;
        int iJ = h30.l.j(this.i, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        String str = this.f214600j;
        int iHashCode3 = (this.k.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.f214601l;
        int iB = j6.a.b(this.f214602m, (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f214603n;
        int iHashCode4 = (iB + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.o;
        int iD = p.a.d((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f214604p);
        xi0.b bVar = this.f214605q;
        int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f214606r, (iD + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        u uVar = this.f214607s;
        int iHashCode5 = (iB2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        c3 c3Var = this.f214608t;
        int iHashCode6 = (iHashCode5 + (c3Var == null ? 0 : c3Var.hashCode())) * 31;
        Long l2 = this.u;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }
}
