package ip0;

import com.revolut.core.ui_kit.delegates.CountDownTimerDelegate;
import com.revolut.core.ui_kit.internal.views.timer.TimerViewLabels;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class id implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd f164673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ev0.c f164674c;
    public final TimerViewLabels d;
    public final ev0.d e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164676h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164677j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f164678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f164679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f164680n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f164681p;

    public id(String listId, TextLocalisedClause textLocalisedClause, gd clockType, ev0.c timerMode, TimerViewLabels timerViewLabels) {
        ev0.d theme = ev0.d.SYSTEM;
        int i = R$attr.uikit_colorGroupedBackground;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(clockType, "clockType");
        Intrinsics.checkNotNullParameter(timerMode, "timerMode");
        Intrinsics.checkNotNullParameter(timerViewLabels, "timerViewLabels");
        Intrinsics.checkNotNullParameter(theme, "theme");
        int i2 = R$attr.uikit_dp0;
        this.f164672a = listId;
        this.f164673b = clockType;
        this.f164674c = timerMode;
        this.d = timerViewLabels;
        this.e = theme;
        this.f = textLocalisedClause;
        this.f164675g = i;
        this.f164676h = i2;
        this.i = i2;
        this.f164677j = i2;
        this.k = i2;
        this.f164678l = c.d.f249513a;
        this.f164679m = null;
        this.f164680n = null;
        this.o = null;
        this.f164681p = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CountDownTimerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51938a() {
        return this.f164672a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof id)) {
            return false;
        }
        id idVar = (id) obj2;
        return Intrinsics.f(this.f164672a, idVar.f164672a) && Intrinsics.f(this.f164673b, idVar.f164673b) && this.f164674c == idVar.f164674c && Intrinsics.f(this.d, idVar.d) && this.e == idVar.e && Intrinsics.f(this.f, idVar.f) && this.f164675g == idVar.f164675g && this.f164676h == idVar.f164676h && this.i == idVar.i && this.f164677j == idVar.f164677j && this.k == idVar.k && Intrinsics.f(this.f164678l, idVar.f164678l) && Intrinsics.f(this.f164679m, idVar.f164679m) && Intrinsics.f(this.f164680n, idVar.f164680n) && Intrinsics.f(this.o, idVar.o) && Intrinsics.f(this.f164681p, idVar.f164681p);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51945m() {
        return this.f164676h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164676h = i;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f164674c.hashCode() + a0.d.c(this.f164672a.hashCode() * 31, 31, this.f164673b.f164399a)) * 31)) * 31)) * 31;
        TextLocalisedClause textLocalisedClause = this.f;
        int i = h30.l.i(this.f164678l, j6.a.b(this.k, j6.a.b(this.f164677j, j6.a.b(this.i, j6.a.b(this.f164676h, j6.a.b(this.f164675g, j6.a.c((iHashCode + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 29791, 31, false), 961), 31), 31), 31), 31), 31);
        p31.c cVar = this.f164679m;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164680n;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.o;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164681p;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f164679m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164678l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51943j() {
        return this.f164680n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51946n() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51947p() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51941g() {
        return this.f164678l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51944l() {
        return this.f164681p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164679m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f164677j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164680n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164681p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof id ? (id) oldItem : null) == null) {
            return null;
        }
        id idVar = (id) oldItem;
        boolean z3 = !Intrinsics.f(idVar.f164673b, this.f164673b);
        boolean z4 = false;
        boolean z6 = idVar.f164674c != this.f164674c;
        boolean z11 = !Intrinsics.f(idVar.d, this.d);
        if (idVar.e != this.e) {
            z = false;
            z4 = true;
        } else {
            z = false;
        }
        boolean z12 = !Intrinsics.f(idVar.f, this.f);
        boolean z29 = z;
        boolean z31 = !true;
        if (idVar.f164675g != this.f164675g) {
            z29 = true;
        }
        return new jd(z3, z6, z11, z4, z12, z31, z29, false, or0.b.l(this, (qv0.i) oldItem));
    }
}
