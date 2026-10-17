package ip0;

import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class l1 implements qv0.q, qv0.l, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppTipUIModel f165101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165102c;
    public final Object d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f165104h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.k f165105j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f165107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f165108n;

    public l1(AppTipUIModel appTipModel) {
        qv0.k kVar;
        Intrinsics.checkNotNullParameter(appTipModel, "appTipModel");
        String str = appTipModel.f57725a;
        int i = k1.f164934a[appTipModel.f57728g.ordinal()];
        if (i == 1) {
            kVar = qv0.k.OutOfGroup;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = qv0.k.Single;
        }
        boolean z = appTipModel.f57729h;
        Object obj2 = appTipModel.i;
        int i2 = R$attr.uikit_dp0;
        this.f165100a = str;
        this.f165101b = appTipModel;
        this.f165102c = z;
        this.d = obj2;
        this.e = i2;
        this.f = i2;
        this.f165103g = i2;
        this.f165104h = i2;
        this.i = c.d.f249513a;
        this.f165105j = kVar;
        this.k = null;
        this.f165106l = null;
        this.f165107m = null;
        this.f165108n = null;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return this.f165102c;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f165105j = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AppTipDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f165100a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f165100a, l1Var.f165100a) && Intrinsics.f(this.f165101b, l1Var.f165101b) && this.f165102c == l1Var.f165102c && Intrinsics.f(this.d, l1Var.d) && this.e == l1Var.e && this.f == l1Var.f && this.f165103g == l1Var.f165103g && this.f165104h == l1Var.f165104h && Intrinsics.f(this.i, l1Var.i) && this.f165105j == l1Var.f165105j && Intrinsics.f(this.k, l1Var.k) && Intrinsics.f(this.f165106l, l1Var.f165106l) && Intrinsics.f(this.f165107m, l1Var.f165107m) && Intrinsics.f(this.f165108n, l1Var.f165108n);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.e;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getG() {
        return this.f165105j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f165101b.hashCode() + (this.f165100a.hashCode() * 31)) * 31, 31, this.f165102c);
        Object obj2 = this.d;
        int iHashCode = (this.f165105j.hashCode() + h30.l.i(this.i, j6.a.b(this.f165104h, j6.a.b(this.f165103g, j6.a.b(this.f, j6.a.b(this.e, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31)) * 31;
        p31.c cVar = this.k;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165106l;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165107m;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165108n;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.f165106l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165107m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.f165104h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.f165108n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f165107m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f165103g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165106l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165108n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof l1 ? (l1) oldItem : null) == null) {
            return null;
        }
        l1 l1Var = (l1) oldItem;
        AppTipUIModel appTipUIModel = l1Var.f165101b;
        AppTipUIModel appTipUIModel2 = l1Var.f165101b;
        aw0.u uVar = appTipUIModel.f57726b;
        AppTipUIModel appTipUIModel3 = this.f165101b;
        return new m1(!Intrinsics.f(uVar, appTipUIModel3.f57726b), !Intrinsics.f(appTipUIModel2.f57727c, appTipUIModel3.f57727c), !Intrinsics.f(appTipUIModel2.d, appTipUIModel3.d), !Intrinsics.f(appTipUIModel2.f, appTipUIModel3.f), !Intrinsics.f(appTipUIModel2.e, appTipUIModel3.e), or0.b.m(this, (qv0.l) oldItem));
    }
}
