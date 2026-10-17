package ip0;

import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ji implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f164839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f164840c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164842h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164843j;
    public p31.c k;

    public ji(int i, int i2, String listId, List filters) {
        i = (i2 & 4) != 0 ? R$attr.uikit_dp16 : i;
        int i3 = R$attr.uikit_dp16;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f164838a = listId;
        this.f164839b = filters;
        this.f164840c = c.d.f249513a;
        this.d = i;
        this.e = i3;
        this.f = i5;
        this.f164841g = i5;
        this.f164842h = null;
        this.i = null;
        this.f164843j = null;
        this.k = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FiltersDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53304a() {
        return this.f164838a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj2;
        return Intrinsics.f(this.f164838a, jiVar.f164838a) && Intrinsics.f(this.f164839b, jiVar.f164839b) && Intrinsics.f(this.f164840c, jiVar.f164840c) && this.d == jiVar.d && this.e == jiVar.e && this.f == jiVar.f && this.f164841g == jiVar.f164841g && Intrinsics.f(this.f164842h, jiVar.f164842h) && Intrinsics.f(this.i, jiVar.i) && Intrinsics.f(this.f164843j, jiVar.f164843j) && Intrinsics.f(this.k, jiVar.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53315r() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f164841g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, h30.l.i(this.f164840c, p.a.d(this.f164838a.hashCode() * 31, 31, this.f164839b), 31), 31), 31), 31), 31);
        p31.c cVar = this.f164842h;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164843j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53314q() {
        return this.f164842h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164840c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53312n() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164843j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53316s() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f164841g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53310l() {
        return this.f164840c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53313p() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.f164843j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164842h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53317t() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ji ? (ji) oldItem : null) != null) {
            return new ki(!Intrinsics.f(this.f164839b, ((ji) oldItem).f164839b));
        }
        return null;
    }
}
