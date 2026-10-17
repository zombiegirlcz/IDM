package ip0;

import com.revolut.core.ui_kit.delegates.GroupedBarLineChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class gl implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl f164435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f164436c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164438h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164439j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f164440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f164441m;

    public gl(String listId, dl dataset, i3 i3Var, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        this.f164434a = listId;
        this.f164435b = dataset;
        this.f164436c = i3Var;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f164437g = null;
        this.f164438h = null;
        this.i = obj2;
        int i = R$attr.uikit_dp0;
        this.f164439j = i;
        this.k = i;
        this.f164440l = i;
        this.f164441m = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new GroupedBarLineChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52567m() {
        return this.i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52560a() {
        return this.f164434a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gl)) {
            return false;
        }
        gl glVar = (gl) obj2;
        return Intrinsics.f(this.f164434a, glVar.f164434a) && Intrinsics.f(this.f164435b, glVar.f164435b) && Intrinsics.f(this.f164436c, glVar.f164436c) && Intrinsics.f(this.d, glVar.d) && Intrinsics.f(this.e, glVar.e) && Intrinsics.f(this.f, glVar.f) && Intrinsics.f(this.f164437g, glVar.f164437g) && Intrinsics.f(this.f164438h, glVar.f164438h) && Intrinsics.f(this.i, glVar.i);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52568n() {
        return this.f164439j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164439j = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f164435b.hashCode() + (this.f164434a.hashCode() * 31)) * 31;
        i3 i3Var = this.f164436c;
        int i = h30.l.i(this.d, (iHashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31, 31);
        p31.c cVar = this.e;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164437g;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164438h;
        int iHashCode5 = (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
        Object obj2 = this.i;
        return iHashCode5 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52572s() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52573t() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164437g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52570q() {
        return this.f164441m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52571r() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.f164438h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.f164437g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52569p() {
        return this.f164440l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164438h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof gl ? (gl) oldItem : null) == null) {
            return null;
        }
        gl glVar = (gl) oldItem;
        return new hl(!glVar.f164435b.equals(this.f164435b), !Intrinsics.f(glVar.f164436c, this.f164436c));
    }
}
