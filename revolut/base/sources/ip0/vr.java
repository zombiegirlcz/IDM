package ip0;

import com.revolut.core.ui_kit.delegates.InputTravelSearchDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class vr implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i6 f166877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166878c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166880h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166881j;
    public final int k;

    public vr(String listId, aw0.i6 configuration) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166876a = listId;
        this.f166877b = configuration;
        this.f166878c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166879g = null;
        this.f166880h = i;
        this.i = i;
        this.f166881j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new InputTravelSearchDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52973a() {
        return this.f166876a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vr)) {
            return false;
        }
        vr vrVar = (vr) obj2;
        return this.f166876a.equals(vrVar.f166876a) && this.f166877b.equals(vrVar.f166877b) && Intrinsics.f(this.f166878c, vrVar.f166878c) && Intrinsics.f(this.d, vrVar.d) && Intrinsics.f(this.e, vrVar.e) && Intrinsics.f(this.f, vrVar.f) && Intrinsics.f(this.f166879g, vrVar.f166879g) && this.f166880h == vrVar.f166880h && this.i == vrVar.i && this.f166881j == vrVar.f166881j && this.k == vrVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.f166880h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166880h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166878c, (this.f166877b.hashCode() + (this.f166876a.hashCode() * 31)) * 961, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166879g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166881j, j6.a.b(this.i, j6.a.b(this.f166880h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f166879g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166878c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f166878c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166879g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.f166881j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof vr ? (vr) oldItem : null) != null) {
            return new wr(!((vr) oldItem).f166877b.equals(this.f166877b));
        }
        return null;
    }
}
