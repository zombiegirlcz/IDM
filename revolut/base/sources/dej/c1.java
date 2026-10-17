package dej;

import com.revolut.retail.feature.esim.api.model.EsimTerms;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f113506c;
    public final g1 d;
    public final i1 e;
    public final e1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1 f113507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimTerms f113508h;
    public final v3 i;

    public c1(String id10, String str, h1 type, g1 state, i1 i1Var, e1 e1Var, d1 mobilePlan, EsimTerms terms, v3 v3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f113504a = id10;
        this.f113505b = str;
        this.f113506c = type;
        this.d = state;
        this.e = i1Var;
        this.f = e1Var;
        this.f113507g = mobilePlan;
        this.f113508h = terms;
        this.i = v3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f113504a, c1Var.f113504a) && Intrinsics.f(this.f113505b, c1Var.f113505b) && Intrinsics.f(this.f113506c, c1Var.f113506c) && Intrinsics.f(this.d, c1Var.d) && Intrinsics.f(this.e, c1Var.e) && Intrinsics.f(this.f, c1Var.f) && Intrinsics.f(this.f113507g, c1Var.f113507g) && Intrinsics.f(this.f113508h, c1Var.f113508h) && Intrinsics.f(this.i, c1Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.f113504a.hashCode() * 31;
        String str = this.f113505b;
        int iHashCode2 = (this.d.hashCode() + ((this.f113506c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        i1 i1Var = this.e;
        int iHashCode3 = (iHashCode2 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        e1 e1Var = this.f;
        int iHashCode4 = (this.f113508h.hashCode() + ((this.f113507g.hashCode() + ((iHashCode3 + (e1Var == null ? 0 : e1Var.hashCode())) * 31)) * 31)) * 31;
        v3 v3Var = this.i;
        return iHashCode4 + (v3Var != null ? v3Var.hashCode() : 0);
    }
}
