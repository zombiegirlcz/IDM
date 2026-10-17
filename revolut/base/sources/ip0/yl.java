package ip0;

import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class yl implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f167330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f167331c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f167332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167333h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167334j;

    public yl(String listId, int i, int i2) {
        int i3 = R$attr.uikit_dp0;
        i = (i2 & 4) != 0 ? i3 : i;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f167329a = listId;
        this.f167330b = positionInBox;
        this.f167331c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f167332g = i3;
        this.f167333h = i;
        this.i = i3;
        this.f167334j = i3;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HeaderLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f167329a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yl)) {
            return false;
        }
        yl ylVar = (yl) obj2;
        return Intrinsics.f(this.f167329a, ylVar.f167329a) && Intrinsics.f(this.f167330b, ylVar.f167330b) && Intrinsics.f(this.f167331c, ylVar.f167331c) && Intrinsics.f(this.d, ylVar.d) && Intrinsics.f(this.e, ylVar.e) && Intrinsics.f(this.f, ylVar.f) && this.f167332g == ylVar.f167332g && this.f167333h == ylVar.f167333h && this.i == ylVar.i && this.f167334j == ylVar.f167334j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52020l() {
        return this.f167332g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167332g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167330b, this.f167329a.hashCode() * 31, 31);
        p31.c cVar = this.f167331c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f167334j) + j6.a.b(this.i, j6.a.b(this.f167333h, j6.a.b(this.f167332g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52018h() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167330b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.f167331c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52021m() {
        return this.f167333h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f167334j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167333h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f167330b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167331c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
