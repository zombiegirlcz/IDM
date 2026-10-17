package ip0;

import com.revolut.core.ui_kit.delegates.HistogramLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class tn implements qv0.q, s31.c, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f166543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166544c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166546h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166547j;

    public tn(String listId) {
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166542a = listId;
        this.f166543b = positionInBox;
        this.f166544c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166545g = i;
        this.f166546h = i;
        this.i = i2;
        this.f166547j = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HistogramLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF54213a() {
        return this.f166542a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj2;
        return Intrinsics.f(this.f166542a, tnVar.f166542a) && Intrinsics.f(this.f166543b, tnVar.f166543b) && Intrinsics.f(this.f166544c, tnVar.f166544c) && Intrinsics.f(this.d, tnVar.d) && Intrinsics.f(this.e, tnVar.e) && Intrinsics.f(this.f, tnVar.f) && Intrinsics.f(null, null) && this.f166545g == tnVar.f166545g && this.f166546h == tnVar.f166546h && this.i == tnVar.i && this.f166547j == tnVar.f166547j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52788m() {
        return this.f166545g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166545g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166543b, this.f166542a.hashCode() * 961, 31);
        p31.c cVar = this.f166544c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f166547j) + j6.a.b(this.i, j6.a.b(this.f166546h, j6.a.b(this.f166545g, (((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31) + 0) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52787l() {
        return this.f166544c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166543b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52789n() {
        return this.f166546h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52790p() {
        return this.f166547j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166546h = i;
    }

    @Override // s31.c
    public final hx7.i p() {
        return null;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52785h() {
        return this.f166543b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52786j() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166544c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }
}
