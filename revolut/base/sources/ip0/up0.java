package ip0;

import com.revolut.core.ui_kit.delegates.YearPickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class up0 implements koi.j, qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f166714c;
    public final Integer d;
    public final Integer e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166716h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166717j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f166720n;
    public p31.c o;

    public up0(String str, int i, Integer num, Integer num2, Integer num3, Object obj2, qv0.c cVar, int i2, int i3, int i5, int i6, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5) {
        this.f166712a = str;
        this.f166713b = i;
        this.f166714c = num;
        this.d = num2;
        this.e = num3;
        this.f = obj2;
        this.f166715g = cVar;
        this.f166716h = i2;
        this.i = i3;
        this.f166717j = i5;
        this.k = i6;
        this.f166718l = cVar2;
        this.f166719m = cVar3;
        this.f166720n = cVar4;
        this.o = cVar5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new YearPickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return this.f166712a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof up0)) {
            return false;
        }
        up0 up0Var = (up0) obj2;
        return Intrinsics.f(this.f166712a, up0Var.f166712a) && this.f166713b == up0Var.f166713b && Intrinsics.f(this.f166714c, up0Var.f166714c) && Intrinsics.f(this.d, up0Var.d) && Intrinsics.f(this.e, up0Var.e) && Intrinsics.f(this.f, up0Var.f) && Intrinsics.f(this.f166715g, up0Var.f166715g) && this.f166716h == up0Var.f166716h && this.i == up0Var.i && this.f166717j == up0Var.f166717j && this.k == up0Var.k && Intrinsics.f(this.f166718l, up0Var.f166718l) && Intrinsics.f(this.f166719m, up0Var.f166719m) && Intrinsics.f(this.f166720n, up0Var.f166720n) && Intrinsics.f(this.o, up0Var.o);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52815m() {
        return this.f166716h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166716h = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f166713b, this.f166712a.hashCode() * 31, 31);
        Integer num = this.f166714c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj2 = this.f;
        int iB2 = j6.a.b(this.k, j6.a.b(this.f166717j, j6.a.b(this.i, j6.a.b(this.f166716h, h30.l.i(this.f166715g, (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166718l;
        int iHashCode4 = (iB2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166719m;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166720n;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.o;
        return iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.o;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166715g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.f166718l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166719m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52816n() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52817p() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f166715g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f166720n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f166719m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f166717j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166718l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166720n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof up0 ? (up0) oldItem : null) == null) {
            return null;
        }
        return new vp0(((up0) oldItem).f166713b != this.f166713b, !Intrinsics.f(r9.f166714c, this.f166714c), !Intrinsics.f(r9.d, this.d), !Intrinsics.f(r9.e, this.e), !Intrinsics.f(r9.f166715g, this.f166715g));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public up0(String listId, int i, Integer num, Integer num2, Integer num3) {
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp4;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this(listId, i, num, num2, num3, null, c.d.f249513a, i2, i3, i5, i5, null, null, null, null);
    }
}
