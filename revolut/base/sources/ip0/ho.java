package ip0;

import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ho implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f164577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f164578c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164580h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164581j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f164582l;

    public ho(String listId, List bars, int i) {
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(bars, "bars");
        this.f164576a = listId;
        this.f164577b = bars;
        this.f164578c = null;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f164579g = null;
        this.f164580h = null;
        this.i = i2;
        this.f164581j = i2;
        this.k = i2;
        this.f164582l = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HorizontalBarGroupDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return this.f164578c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f164576a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj2;
        return this.f164576a.equals(hoVar.f164576a) && Intrinsics.f(this.f164577b, hoVar.f164577b) && Intrinsics.f(this.f164578c, hoVar.f164578c) && Intrinsics.f(this.d, hoVar.d) && Intrinsics.f(this.e, hoVar.e) && Intrinsics.f(this.f, hoVar.f) && Intrinsics.f(this.f164579g, hoVar.f164579g) && Intrinsics.f(this.f164580h, hoVar.f164580h) && this.i == hoVar.i && this.f164581j == hoVar.f164581j && this.k == hoVar.k && this.f164582l == hoVar.f164582l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(100, p.a.d(this.f164576a.hashCode() * 31, 31, this.f164577b), 31);
        Object obj2 = this.f164578c;
        int i = h30.l.i(this.d, (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164579g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164580h;
        return Integer.hashCode(this.f164582l) + j6.a.b(this.k, j6.a.b(this.f164581j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164579g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f164581j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f164582l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164581j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f164580h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f164579g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164580h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ho ? (ho) oldItem : null) != null) {
            return new io(!Intrinsics.f(((ho) oldItem).f164577b, this.f164577b), false);
        }
        return null;
    }
}
