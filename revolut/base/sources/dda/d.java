package dda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f113168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113169c;
    public final String d;
    public final wi0.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f113170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f113171h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f113172j;

    public d(String id10, xi0.b currency, String type, String name, wi0.b country, String str, g gVar, z tips, b bVar, List qrCodes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(qrCodes, "qrCodes");
        this.f113167a = id10;
        this.f113168b = currency;
        this.f113169c = type;
        this.d = name;
        this.e = country;
        this.f = str;
        this.f113170g = gVar;
        this.f113171h = tips;
        this.i = bVar;
        this.f113172j = qrCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f113167a, dVar.f113167a) && Intrinsics.f(this.f113168b, dVar.f113168b) && Intrinsics.f(this.f113169c, dVar.f113169c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f113170g, dVar.f113170g) && Intrinsics.f(this.f113171h, dVar.f113171h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f113172j, dVar.f113172j);
    }

    @Override // dda.f
    public final wi0.b getCountry() {
        return this.e;
    }

    @Override // dda.f
    public final xi0.b getCurrency() {
        return this.f113168b;
    }

    @Override // dda.f
    public final String getName() {
        return this.d;
    }

    @Override // dda.f
    public final String getType() {
        return this.f113169c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(h30.l.j(this.f113168b, this.f113167a.hashCode() * 31, 31), 31, this.f113169c), 31, this.d), 31, this.e.f297794a);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f113170g;
        int iHashCode2 = (this.f113171h.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        b bVar = this.i;
        return this.f113172j.hashCode() + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
