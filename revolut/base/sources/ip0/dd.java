package ip0;

import com.revolut.core.ui_kit.delegates.CountDownTimerCompactDelegate;
import com.revolut.core.ui_kit.internal.views.timer.TimerViewLabels;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dd implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd f163874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ev0.c f163875c;
    public final TimerViewLabels d;
    public final ev0.d e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f163876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f163877h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f163878j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f163879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f163880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f163881n;

    public dd(bd clockType, ev0.c timerMode, TimerViewLabels timerViewLabels) {
        ev0.d theme = ev0.d.SYSTEM;
        Intrinsics.checkNotNullParameter("LIST_ID_COUNTDOWN", "listId");
        Intrinsics.checkNotNullParameter(clockType, "clockType");
        Intrinsics.checkNotNullParameter(timerMode, "timerMode");
        Intrinsics.checkNotNullParameter(timerViewLabels, "timerViewLabels");
        Intrinsics.checkNotNullParameter(theme, "theme");
        int i = R$attr.uikit_dp0;
        this.f163873a = "LIST_ID_COUNTDOWN";
        this.f163874b = clockType;
        this.f163875c = timerMode;
        this.d = timerViewLabels;
        this.e = theme;
        this.f = i;
        this.f163876g = i;
        this.f163877h = i;
        this.i = i;
        this.f163878j = c.d.f249513a;
        this.k = null;
        this.f163879l = null;
        this.f163880m = null;
        this.f163881n = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CountDownTimerCompactDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51573a() {
        return this.f163873a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj2;
        return Intrinsics.f(this.f163873a, ddVar.f163873a) && Intrinsics.f(this.f163874b, ddVar.f163874b) && this.f163875c == ddVar.f163875c && Intrinsics.f(this.d, ddVar.d) && this.e == ddVar.e && this.f == ddVar.f && this.f163876g == ddVar.f163876g && this.f163877h == ddVar.f163877h && this.i == ddVar.i && Intrinsics.f(this.f163878j, ddVar.f163878j) && Intrinsics.f(this.k, ddVar.k) && Intrinsics.f(this.f163879l, ddVar.f163879l) && Intrinsics.f(this.f163880m, ddVar.f163880m) && Intrinsics.f(this.f163881n, ddVar.f163881n);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51584r() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163878j, j6.a.b(this.i, j6.a.b(this.f163877h, j6.a.b(this.f163876g, j6.a.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.f163875c.hashCode() + a0.d.c(this.f163873a.hashCode() * 31, 31, this.f163874b.f163582a)) * 31)) * 31)) * 961, 31), 31), 31), 31), 31);
        p31.c cVar = this.k;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163879l;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163880m;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163881n;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51581n() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163878j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f163879l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163880m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51585s() {
        return this.f163876g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163876g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51580m() {
        return this.f163878j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51583q() {
        return this.f163881n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51582p() {
        return this.f163880m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51586t() {
        return this.f163877h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163879l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163881n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof dd ? (dd) oldItem : null) == null) {
            return null;
        }
        dd ddVar = (dd) oldItem;
        return new ed(!Intrinsics.f(ddVar.f163874b, this.f163874b), ddVar.f163875c != this.f163875c, !Intrinsics.f(ddVar.d, this.d), ddVar.e != this.e, or0.b.l(this, (qv0.i) oldItem));
    }
}
