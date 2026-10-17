package ip0;

import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cl0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f163754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.ma f163755c;
    public final Object d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163757h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163758j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f163760m;

    public cl0(String listId, LocalTime localTime, aw0.ma maVar, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f163753a = listId;
        this.f163754b = localTime;
        this.f163755c = maVar;
        this.d = obj2;
        this.e = c.d.f249513a;
        this.f = null;
        this.f163756g = null;
        this.f163757h = null;
        this.i = null;
        this.f163758j = i;
        this.k = i;
        this.f163759l = i;
        this.f163760m = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TimePickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getE() {
        return this.f163753a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cl0)) {
            return false;
        }
        cl0 cl0Var = (cl0) obj2;
        return Intrinsics.f(this.f163753a, cl0Var.f163753a) && Intrinsics.f(this.f163754b, cl0Var.f163754b) && this.f163755c == cl0Var.f163755c && Intrinsics.f(this.d, cl0Var.d) && Intrinsics.f(this.e, cl0Var.e) && Intrinsics.f(this.f, cl0Var.f) && Intrinsics.f(this.f163756g, cl0Var.f163756g) && Intrinsics.f(this.f163757h, cl0Var.f163757h) && Intrinsics.f(this.i, cl0Var.i) && this.f163758j == cl0Var.f163758j && this.k == cl0Var.k && this.f163759l == cl0Var.f163759l && this.f163760m == cl0Var.f163760m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51602s() {
        return this.f163758j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163758j = i;
    }

    public final int hashCode() {
        int iHashCode = this.f163753a.hashCode() * 31;
        LocalTime localTime = this.f163754b;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        aw0.ma maVar = this.f163755c;
        int iHashCode3 = (iHashCode2 + (maVar == null ? 0 : maVar.hashCode())) * 31;
        Object obj2 = this.d;
        int i = h30.l.i(this.e, (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f;
        int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163756g;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163757h;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f163760m) + j6.a.b(this.f163759l, j6.a.b(this.k, j6.a.b(this.f163758j, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51978l() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51979m() {
        return this.f163756g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163757h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51603t() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f163760m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51598n() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51980n() {
        return this.f163757h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.f163759l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163756g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof cl0 ? (cl0) oldItem : null) == null) {
            return null;
        }
        return new dl0(!Intrinsics.f(r5.f163754b, this.f163754b), ((cl0) oldItem).f163755c != this.f163755c);
    }

    public /* synthetic */ cl0(String str, LocalTime localTime, aw0.ma maVar, h3g.a aVar, int i) {
        this(str, localTime, (i & 4) != 0 ? null : maVar, (i & 8) != 0 ? null : aVar);
    }
}
