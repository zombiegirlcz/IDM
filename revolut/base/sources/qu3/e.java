package qu3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu3.d f249201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f249202c;
    public final c d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f249203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f249204h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f249205j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f249206l;

    public e(String id10, pu3.d debtType, xi0.b currency, c creditProvider, b bVar, b bVar2, b bVar3, c cVar, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(creditProvider, "creditProvider");
        this.f249200a = id10;
        this.f249201b = debtType;
        this.f249202c = currency;
        this.d = creditProvider;
        this.e = bVar;
        this.f = bVar2;
        this.f249203g = bVar3;
        this.f249204h = cVar;
        this.i = z;
        this.f249205j = z3;
        this.k = z4;
        this.f249206l = z6;
    }

    public final boolean a() {
        if (!this.f249206l) {
            d[] elements = {this.d, this.e, this.f, this.f249203g, this.f249204h};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            if (!listL.isEmpty()) {
                Iterator it8 = listL.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    d dVar = (d) it8.next();
                    if (dVar.f0() && dVar.k0() && dVar.getValue() == null) {
                        if (!this.i) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        e other = (e) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        pu3.d dVar = other.f249201b;
        pu3.d[] dVarArr = (pu3.d[]) pu3.d.a().toArray(new pu3.d[0]);
        return kotlin.collections.d.Y(dVarArr, this.f249201b) - kotlin.collections.d.Y(dVarArr, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f249200a, eVar.f249200a) && this.f249201b == eVar.f249201b && Intrinsics.f(this.f249202c, eVar.f249202c) && this.d.equals(eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f249203g, eVar.f249203g) && Intrinsics.f(this.f249204h, eVar.f249204h) && this.i == eVar.i && this.f249205j == eVar.f249205j && this.k == eVar.k && this.f249206l == eVar.f249206l;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + h30.l.j(this.f249202c, (this.f249201b.hashCode() + (this.f249200a.hashCode() * 31)) * 31, 31)) * 31;
        d dVar = this.e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f249203g;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.f249204h;
        return Boolean.hashCode(this.f249206l) + j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31, 31, this.i), 31, this.f249205j), 31, this.k);
    }

    public final boolean x3() {
        d[] elements = {this.d, this.e, this.f, this.f249203g, this.f249204h};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (!listL.isEmpty()) {
            Iterator it8 = listL.iterator();
            while (it8.hasNext()) {
                if (((d) it8.next()).x3()) {
                    return true;
                }
            }
        }
        return false;
    }
}
