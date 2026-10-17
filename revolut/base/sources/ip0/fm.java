package ip0;

import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class fm implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm f164284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164285c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164287h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164288j;
    public qv0.c k;

    public fm(String listId) {
        hm style = hm.HERO;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        int i = R$attr.uikit_dp16;
        this.f164283a = listId;
        this.f164284b = style;
        this.f164285c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f164286g = null;
        this.f164287h = null;
        this.i = null;
        this.f164288j = null;
        this.k = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HeroBannerLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return this.f164283a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj2;
        return Intrinsics.f(this.f164283a, fmVar.f164283a) && this.f164284b == fmVar.f164284b && this.f164285c == fmVar.f164285c && this.d == fmVar.d && this.e == fmVar.e && this.f == fmVar.f && Intrinsics.f(this.f164286g, fmVar.f164286g) && Intrinsics.f(this.f164287h, fmVar.f164287h) && Intrinsics.f(this.i, fmVar.i) && Intrinsics.f(this.f164288j, fmVar.f164288j) && Intrinsics.f(this.k, fmVar.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f164285c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164285c = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f164285c, (this.f164284b.hashCode() + (this.f164283a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        p31.c cVar = this.f164286g;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164287h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164288j;
        return this.k.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53287g() {
        return this.f164288j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53288h() {
        return this.f164286g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164287h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53290l() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53292n() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53289j() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getI() {
        return this.f164287h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164288j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53291m() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164286g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof fm ? (fm) oldItem : null) != null) {
            return new gm(((fm) oldItem).f164284b != this.f164284b);
        }
        return null;
    }
}
