package ip0;

import com.revolut.core.ui_kit.delegates.HorizontalLegendDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qo implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.l0 f166031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166032c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166034h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166035j;
    public final int k;

    public qo(String listId, aw0.l0 legend, int i, int i2) {
        int i3 = R$attr.uikit_dp0;
        i = (i2 & 256) != 0 ? i3 : i;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(legend, "legend");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166030a = listId;
        this.f166031b = legend;
        this.f166032c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166033g = null;
        this.f166034h = i3;
        this.i = i;
        this.f166035j = i3;
        this.k = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HorizontalLegendDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55203g() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f166030a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj2;
        return Intrinsics.f(this.f166030a, qoVar.f166030a) && this.f166031b.equals(qoVar.f166031b) && Intrinsics.f(this.f166032c, qoVar.f166032c) && Intrinsics.f(this.d, qoVar.d) && Intrinsics.f(this.e, qoVar.e) && Intrinsics.f(this.f, qoVar.f) && Intrinsics.f(this.f166033g, qoVar.f166033g) && this.f166034h == qoVar.f166034h && this.i == qoVar.i && this.f166035j == qoVar.f166035j && this.k == qoVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f166034h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166034h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166032c, (this.f166031b.hashCode() + (this.f166030a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166033g;
        return j6.a.b(this.k, j6.a.b(this.f166035j, j6.a.b(this.i, j6.a.b(this.f166034h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166032c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f166032c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f166033g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f166035j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166033g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof qo ? (qo) oldItem : null) != null) {
            return new ro(!((qo) oldItem).f166031b.equals(this.f166031b));
        }
        return null;
    }
}
