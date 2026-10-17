package ip0;

import com.revolut.core.ui_kit.delegates.WeekdayPickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class fp0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep0 f164294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f164295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164296c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164298h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164299j;

    public fp0(ep0 ep0Var) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("LIST_ID_DAY_WEEK_PICKER", "listId");
        this.f164294a = ep0Var;
        this.f164295b = c.d.f249513a;
        this.f164296c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164297g = i;
        this.f164298h = i;
        this.i = i;
        this.f164299j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new WeekdayPickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55069b() {
        return "LIST_ID_DAY_WEEK_PICKER";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fp0)) {
            return false;
        }
        fp0 fp0Var = (fp0) obj2;
        return this.f164294a == fp0Var.f164294a && Intrinsics.f(this.f164295b, fp0Var.f164295b) && Intrinsics.f(this.f164296c, fp0Var.f164296c) && Intrinsics.f(this.d, fp0Var.d) && Intrinsics.f(this.e, fp0Var.e) && Intrinsics.f(this.f, fp0Var.f) && this.f164297g == fp0Var.f164297g && this.f164298h == fp0Var.f164298h && this.i == fp0Var.i && this.f164299j == fp0Var.f164299j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getU() {
        return this.f164297g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164297g = i;
    }

    public final int hashCode() {
        int i = (-662234803) * 31;
        ep0 ep0Var = this.f164294a;
        int i2 = h30.l.i(this.f164295b, (i + (ep0Var == null ? 0 : ep0Var.hashCode())) * 29791, 31);
        p31.c cVar = this.f164296c;
        int iHashCode = (i2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f164299j) + j6.a.b(this.i, j6.a.b(this.f164298h, j6.a.b(this.f164297g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF55078q() {
        return this.f164296c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164295b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF55079r() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getV() {
        return this.f164298h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF55083x() {
        return this.f164299j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164298h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF55077p() {
        return this.f164295b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF55081t() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF55080s() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164296c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF55082w() {
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
        if ((oldItem instanceof fp0 ? (fp0) oldItem : null) == null) {
            return null;
        }
        fp0 fp0Var = (fp0) oldItem;
        fp0Var.getClass();
        return new gp0(!true, this.f164294a != fp0Var.f164294a, !true);
    }
}
