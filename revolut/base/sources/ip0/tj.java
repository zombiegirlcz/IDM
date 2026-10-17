package ip0;

import com.revolut.core.ui_kit.delegates.ForecastLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class tj implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166529c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166531h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166532j;

    public tj(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f166527a = listId;
        this.f166528b = i;
        this.f166529c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f166530g = null;
        this.f166531h = null;
        this.i = null;
        this.f166532j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ForecastLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53544a() {
        return this.f166527a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj2;
        return Intrinsics.f(this.f166527a, tjVar.f166527a) && this.f166528b == tjVar.f166528b && this.f166529c == tjVar.f166529c && this.d == tjVar.d && this.e == tjVar.e && Intrinsics.f(this.f, tjVar.f) && Intrinsics.f(this.f166530g, tjVar.f166530g) && Intrinsics.f(this.f166531h, tjVar.f166531h) && Intrinsics.f(this.i, tjVar.i) && Intrinsics.f(this.f166532j, tjVar.f166532j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f166528b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166528b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166529c, j6.a.b(this.f166528b, this.f166527a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166530g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166531h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166532j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f166530g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52952p() {
        return this.f166531h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52948j() {
        return this.f166529c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52949l() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166529c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52951n() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52954r() {
        return this.f166532j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52953q() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166530g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166531h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166532j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof tj ? (tj) oldItem : null) != null) {
            return new uj(or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
