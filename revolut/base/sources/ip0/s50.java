package ip0;

import com.revolut.core.ui_kit.delegates.ProgressTimelineDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class s50 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f166299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r50 f166300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166301c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166303h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166304j;
    public qv0.c k;

    public s50(ArrayList steps, r50 r50Var) {
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("PROGRESS_TIMELINE_ID", "listId");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f166299a = steps;
        this.f166300b = r50Var;
        this.f166301c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166302g = i;
        this.f166303h = i;
        this.i = i2;
        this.f166304j = i2;
        this.k = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressTimelineDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return "PROGRESS_TIMELINE_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s50)) {
            return false;
        }
        s50 s50Var = (s50) obj2;
        return this.f166299a.equals(s50Var.f166299a) && this.f166300b.equals(s50Var.f166300b) && Intrinsics.f(this.f166301c, s50Var.f166301c) && Intrinsics.f(this.d, s50Var.d) && Intrinsics.f(this.e, s50Var.e) && Intrinsics.f(this.f, s50Var.f) && this.f166302g == s50Var.f166302g && this.f166303h == s50Var.f166303h && this.i == s50Var.i && this.f166304j == s50Var.f166304j && Intrinsics.f(this.k, s50Var.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f166302g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166302g = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f166300b.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f166299a, -2119209447, 31)) * 961;
        p31.c cVar = this.f166301c;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return this.k.hashCode() + j6.a.b(this.f166304j, j6.a.b(this.i, j6.a.b(this.f166303h, j6.a.b(this.f166302g, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f166301c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f166303h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f166304j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166303h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166301c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
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
        if ((oldItem instanceof s50 ? (s50) oldItem : null) == null) {
            return null;
        }
        s50 s50Var = (s50) oldItem;
        return new t50(!this.f166299a.equals(s50Var.f166299a), !this.f166300b.equals(s50Var.f166300b), or0.b.l(this, (qv0.i) oldItem));
    }
}
