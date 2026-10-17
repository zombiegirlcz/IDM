package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kc implements qv0.n, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc f164990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc f164991c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164992g;

    public kc(String listId, mc topRow, mc mcVar) {
        sq0.m mVar = new sq0.m(R$attr.uikit_dp8);
        sq0.b bVar = new sq0.b(R$attr.uikit_dp8);
        sq0.l lVar = new sq0.l(R$attr.uikit_dp16);
        sq0.h hVar = new sq0.h(R$attr.uikit_dp16);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(topRow, "topRow");
        this.f164989a = listId;
        this.f164990b = topRow;
        this.f164991c = mcVar;
        this.d = mVar;
        this.e = bVar;
        this.f = lVar;
        this.f164992g = hVar;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51809a() {
        return this.f164989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj2;
        return Intrinsics.f(this.f164989a, kcVar.f164989a) && Intrinsics.f(this.f164990b, kcVar.f164990b) && Intrinsics.f(this.f164991c, kcVar.f164991c) && Intrinsics.f(this.d, kcVar.d) && Intrinsics.f(this.e, kcVar.e) && Intrinsics.f(this.f, kcVar.f) && Intrinsics.f(this.f164992g, kcVar.f164992g);
    }

    public final int hashCode() {
        int iHashCode = (this.f164990b.hashCode() + (this.f164989a.hashCode() * 31)) * 31;
        mc mcVar = this.f164991c;
        int iHashCode2 = (iHashCode + (mcVar == null ? 0 : mcVar.hashCode())) * 31;
        p31.c cVar = this.d;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164992g;
        return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51814j() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164992g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51815l() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f164992g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        kc kcVar = oldItem instanceof kc ? (kc) oldItem : null;
        if (kcVar != null) {
            mc mcVar = kcVar.f164991c;
            boolean zF = Intrinsics.f(this.f164990b, kcVar.f164990b);
            boolean z = !zF;
            mc mcVar2 = this.f164991c;
            boolean zF2 = Intrinsics.f(mcVar2, mcVar);
            boolean z3 = !zF2;
            boolean z4 = (mcVar2 == null ? ft0.p.SINGLE : ft0.p.TOP) != (mcVar == null ? ft0.p.SINGLE : ft0.p.TOP);
            lc lcVar = new lc(z, z3, z4);
            if (!zF || !zF2 || z4) {
                return lcVar;
            }
        }
        return null;
    }
}
