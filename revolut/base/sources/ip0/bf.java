package ip0;

import com.revolut.core.ui_kit.delegates.DraggableRowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class bf implements qv0.i, s31.c, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f163589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f163590c;
    public final boolean d;
    public final boolean e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163592h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163593j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f163594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f163595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f163596n;

    public bf(TextLocalisedClause title, ResourceImage imageStart, String listId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(imageStart, "imageStart");
        Intrinsics.checkNotNullParameter(title, "title");
        int i = R$attr.uikit_dp16;
        this.f163588a = listId;
        this.f163589b = imageStart;
        this.f163590c = title;
        this.d = z;
        this.e = z3;
        this.f = c.d.f249513a;
        this.f163591g = null;
        this.f163592h = null;
        this.i = null;
        this.f163593j = null;
        this.k = i;
        this.f163594l = i;
        this.f163595m = i;
        this.f163596n = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new DraggableRowDelegate(null);
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53832y() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f163588a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj2;
        return Intrinsics.f(this.f163588a, bfVar.f163588a) && this.f163589b.equals(bfVar.f163589b) && this.f163590c.equals(bfVar.f163590c) && this.d == bfVar.d && this.e == bfVar.e && Intrinsics.f(this.f, bfVar.f) && Intrinsics.f(this.f163591g, bfVar.f163591g) && Intrinsics.f(this.f163592h, bfVar.f163592h) && Intrinsics.f(this.i, bfVar.i) && Intrinsics.f(this.f163593j, bfVar.f163593j) && Intrinsics.f(null, null) && this.k == bfVar.k && this.f163594l == bfVar.f163594l && this.f163595m == bfVar.f163595m && this.f163596n == bfVar.f163596n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getA() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.k = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.c(j6.a.c(t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f163589b, this.f163588a.hashCode() * 31, 31), 31, this.f163590c), 31, this.d), 961, this.e), 31);
        p31.c cVar = this.f163591g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163592h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163593j;
        return Integer.hashCode(this.f163596n) + j6.a.b(this.f163595m, j6.a.b(this.f163594l, j6.a.b(this.k, (((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31) + 0) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51992p() {
        return this.f163591g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51993q() {
        return this.f163592h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getB() {
        return this.f163594l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getD() {
        return this.f163596n;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163594l = i;
    }

    @Override // s31.c
    public final hx7.i p() {
        return null;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51995s() {
        return this.f163593j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51994r() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163591g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getC() {
        return this.f163595m;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163592h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163593j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof bf ? (bf) oldItem : null) == null) {
            return null;
        }
        bf bfVar = (bf) oldItem;
        return new cf(!bfVar.f163589b.equals(this.f163589b), !bfVar.f163590c.equals(this.f163590c), bfVar.d != this.d, bfVar.e != this.e, or0.b.l(this, (qv0.i) oldItem));
    }
}
