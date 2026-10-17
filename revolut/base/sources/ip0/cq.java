package ip0;

import com.revolut.core.ui_kit.delegates.IndicesBarDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cq implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f163776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163778c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163780h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163781j;

    public cq(ArrayList items) {
        Intrinsics.checkNotNullParameter("main_index_bar", "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        int i = R$attr.uikit_dp0;
        this.f163776a = items;
        this.f163777b = c.d.f249513a;
        this.f163778c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163779g = i;
        this.f163780h = i;
        this.i = i;
        this.f163781j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new IndicesBarDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51573a() {
        return "main_index_bar";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj2;
        return this.f163776a.equals(cqVar.f163776a) && Intrinsics.f(this.f163777b, cqVar.f163777b) && Intrinsics.f(this.f163778c, cqVar.f163778c) && Intrinsics.f(this.d, cqVar.d) && Intrinsics.f(this.e, cqVar.e) && Intrinsics.f(this.f, cqVar.f) && this.f163779g == cqVar.f163779g && this.f163780h == cqVar.f163780h && this.i == cqVar.i && this.f163781j == cqVar.f163781j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51584r() {
        return this.f163779g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163779g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163777b, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f163776a, 1726413792, 31), 31);
        p31.c cVar = this.f163778c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f163781j) + j6.a.b(this.i, j6.a.b(this.f163780h, j6.a.b(this.f163779g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51581n() {
        return this.f163778c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163777b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51585s() {
        return this.f163780h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f163781j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163780h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51580m() {
        return this.f163777b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51583q() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51582p() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163778c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51586t() {
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

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof xc) {
            return new dq(!Intrinsics.f(((xc) oldItem).f167123b, this.f163776a), or0.b.l(this, (qv0.i) oldItem));
        }
        super.z(oldItem);
        return null;
    }
}
