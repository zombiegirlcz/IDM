package ip0;

import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qt implements qv0.i, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f166054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f166055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166056c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166058h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new LinearProgressWithAmountLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53405g() {
        return Boolean.FALSE;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55187b() {
        return "statement_bottom_sheet_linear_progress_loading_id";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj2;
        Object obj3 = Boolean.FALSE;
        return obj3.equals(obj3) && Intrinsics.f(this.f166054a, qtVar.f166054a) && Intrinsics.f(this.f166055b, qtVar.f166055b) && Intrinsics.f(this.f166056c, qtVar.f166056c) && Intrinsics.f(this.d, qtVar.d) && Intrinsics.f(this.e, qtVar.e) && this.f == qtVar.f && this.f166057g == qtVar.f166057g && this.f166058h == qtVar.f166058h && this.i == qtVar.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53410n() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166054a, j6.a.c((Boolean.FALSE.hashCode() + 240010086) * 31, 31, false), 31);
        p31.c cVar = this.f166055b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166056c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return Integer.hashCode(this.i) + j6.a.b(this.f166058h, j6.a.b(this.f166057g, j6.a.b(this.f, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53407j() {
        return this.f166055b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166054a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f166056c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.f166057g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53412q() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166057g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getI() {
        return this.f166054a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53409m() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53408l() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166055b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53411p() {
        return this.f166058h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166056c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof qt ? (qt) oldItem : null) != null) {
            return new rt(!Intrinsics.f(this.f166054a, r3.f166054a), false);
        }
        return null;
    }
}
