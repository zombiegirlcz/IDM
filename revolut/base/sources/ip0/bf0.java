package ip0;

import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class bf0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163599c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163601h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163602j;

    public bf0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f163597a = listId;
        this.f163598b = i;
        this.f163599c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f163600g = null;
        this.f163601h = null;
        this.i = null;
        this.f163602j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SingleChoiceLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53544a() {
        return this.f163597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bf0)) {
            return false;
        }
        bf0 bf0Var = (bf0) obj2;
        return Intrinsics.f(this.f163597a, bf0Var.f163597a) && this.f163598b == bf0Var.f163598b && this.f163599c == bf0Var.f163599c && this.d == bf0Var.d && this.e == bf0Var.e && Intrinsics.f(this.f, bf0Var.f) && Intrinsics.f(this.f163600g, bf0Var.f163600g) && Intrinsics.f(this.f163601h, bf0Var.f163601h) && Intrinsics.f(this.i, bf0Var.i) && Intrinsics.f(this.f163602j, bf0Var.f163602j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f163598b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163598b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f163599c, j6.a.b(this.f163598b, this.f163597a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f163600g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163601h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163602j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f163602j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52952p() {
        return this.f163600g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163601h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52948j() {
        return this.f163599c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52949l() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163599c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52951n() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52954r() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52953q() {
        return this.f163601h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163602j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163600g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof bf0 ? (bf0) oldItem : null) != null) {
            return new cf0(or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
