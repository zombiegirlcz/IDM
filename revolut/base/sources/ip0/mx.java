package ip0;

import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class mx implements koi.j, o31.c, qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final YearMonth f165425c;
    public final YearMonth d;
    public final YearMonth e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f165426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165427h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165428j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f165430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f165431n;
    public p31.c o;

    public mx(String listId, int i, YearMonth yearMonth, YearMonth yearMonth2, YearMonth yearMonth3, Object obj2, qv0.c positionInBox, int i2, int i3, int i5, int i6, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165423a = listId;
        this.f165424b = i;
        this.f165425c = yearMonth;
        this.d = yearMonth2;
        this.e = yearMonth3;
        this.f = obj2;
        this.f165426g = positionInBox;
        this.f165427h = i2;
        this.i = i3;
        this.f165428j = i5;
        this.k = i6;
        this.f165429l = cVar;
        this.f165430m = cVar2;
        this.f165431n = cVar3;
        this.o = cVar4;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MonthPickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return this.f165423a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj2;
        return Intrinsics.f(this.f165423a, mxVar.f165423a) && this.f165424b == mxVar.f165424b && Intrinsics.f(this.f165425c, mxVar.f165425c) && Intrinsics.f(this.d, mxVar.d) && Intrinsics.f(this.e, mxVar.e) && Intrinsics.f(this.f, mxVar.f) && Intrinsics.f(this.f165426g, mxVar.f165426g) && this.f165427h == mxVar.f165427h && this.i == mxVar.i && this.f165428j == mxVar.f165428j && this.k == mxVar.k && Intrinsics.f(this.f165429l, mxVar.f165429l) && Intrinsics.f(this.f165430m, mxVar.f165430m) && Intrinsics.f(this.f165431n, mxVar.f165431n) && Intrinsics.f(this.o, mxVar.o);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52815m() {
        return this.f165427h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165427h = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f165424b, this.f165423a.hashCode() * 31, 31);
        YearMonth yearMonth = this.f165425c;
        int iHashCode = (iB + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        YearMonth yearMonth2 = this.d;
        int iHashCode2 = (iHashCode + (yearMonth2 == null ? 0 : yearMonth2.hashCode())) * 31;
        YearMonth yearMonth3 = this.e;
        int iHashCode3 = (iHashCode2 + (yearMonth3 == null ? 0 : yearMonth3.hashCode())) * 31;
        Object obj2 = this.f;
        int iB2 = j6.a.b(this.k, j6.a.b(this.f165428j, j6.a.b(this.i, j6.a.b(this.f165427h, h30.l.i(this.f165426g, (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f165429l;
        int iHashCode4 = (iB2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165430m;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165431n;
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
        this.f165426g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.f165429l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165430m = cVar;
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
        return this.f165426g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f165431n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f165430m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f165428j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165429l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165431n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof mx ? (mx) oldItem : null) == null) {
            return null;
        }
        return new nx(((mx) oldItem).f165424b != this.f165424b, !Intrinsics.f(r9.f165425c, this.f165425c), !Intrinsics.f(r9.d, this.d), !Intrinsics.f(r9.e, this.e), !Intrinsics.f(r9.f165426g, this.f165426g));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mx(String listId, int i, YearMonth yearMonth, YearMonth yearMonth2, YearMonth yearMonth3) {
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp4;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this(listId, i, yearMonth, yearMonth2, yearMonth3, null, c.d.f249513a, i2, i3, i5, i5, null, null, null, null);
    }
}
