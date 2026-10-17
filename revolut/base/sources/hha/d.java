package hha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152289c;
    public final xi0.b d;
    public final List e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f152290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f152291h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Period f152292j;
    public final g0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f152293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f152294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f152295n;
    public final jha.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f152296p;

    public d(String id10, String code, String displayCode, xi0.b currency, List features, ArrayList featureGroups, ArrayList cardDesigns, List billing, ArrayList products, Period period, g0 g0Var, Integer num, int i, int i2, jha.c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(displayCode, "displayCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(featureGroups, "featureGroups");
        Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f152287a = id10;
        this.f152288b = code;
        this.f152289c = displayCode;
        this.d = currency;
        this.e = features;
        this.f = featureGroups;
        this.f152290g = cardDesigns;
        this.f152291h = billing;
        this.i = products;
        this.f152292j = period;
        this.k = g0Var;
        this.f152293l = num;
        this.f152294m = i;
        this.f152295n = i2;
        this.o = cVar;
        this.f152296p = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f152287a, dVar.f152287a) && Intrinsics.f(this.f152288b, dVar.f152288b) && Intrinsics.f(this.f152289c, dVar.f152289c) && this.d.equals(dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f.equals(dVar.f) && this.f152290g.equals(dVar.f152290g) && Intrinsics.f(this.f152291h, dVar.f152291h) && this.i.equals(dVar.i) && Intrinsics.f(this.f152292j, dVar.f152292j) && this.k == dVar.k && Intrinsics.f(this.f152293l, dVar.f152293l) && this.f152294m == dVar.f152294m && this.f152295n == dVar.f152295n && Intrinsics.f(this.o, dVar.o) && this.f152296p == dVar.f152296p;
    }

    public final String getId() {
        return this.f152287a;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f152290g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.d(h30.l.j(this.d, p.a.c(p.a.c(this.f152287a.hashCode() * 31, 31, this.f152288b), 31, this.f152289c), 31), 31, this.e), 31), 31), 31, this.f152291h), 31);
        Period period = this.f152292j;
        int iHashCode = (iB + (period == null ? 0 : period.hashCode())) * 31;
        g0 g0Var = this.k;
        int iHashCode2 = (iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        Integer num = this.f152293l;
        int iB2 = j6.a.b(this.f152295n, j6.a.b(this.f152294m, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        jha.c cVar = this.o;
        return Boolean.hashCode(this.f152296p) + ((iB2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
