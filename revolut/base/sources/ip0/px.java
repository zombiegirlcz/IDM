package ip0;

import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class px implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.k1 f165893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.s7 f165894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f165895c;
    public final Object d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f165897h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165898j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f165900m;

    public px(aw0.k1 header, aw0.s7 dataset, TextLocalisedClause textLocalisedClause, Object obj2) {
        Intrinsics.checkNotNullParameter("MULTI_TARGET_FAN_CHART_DELEGATE", "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(dataset, "dataset");
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        this.f165893a = header;
        this.f165894b = dataset;
        this.f165895c = textLocalisedClause;
        this.d = obj2;
        this.e = i;
        this.f = i2;
        this.f165896g = i2;
        this.f165897h = i2;
        this.i = c.d.f249513a;
        this.f165898j = null;
        this.k = null;
        this.f165899l = null;
        this.f165900m = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MultiTargetFanChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getE() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53634a() {
        return "MULTI_TARGET_FAN_CHART_DELEGATE";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof px)) {
            return false;
        }
        px pxVar = (px) obj2;
        return this.f165893a.equals(pxVar.f165893a) && this.f165894b.equals(pxVar.f165894b) && this.f165895c.equals(pxVar.f165895c) && Intrinsics.f(this.d, pxVar.d) && this.e == pxVar.e && this.f == pxVar.f && this.f165896g == pxVar.f165896g && this.f165897h == pxVar.f165897h && Intrinsics.f(this.i, pxVar.i) && Intrinsics.f(this.f165898j, pxVar.f165898j) && Intrinsics.f(this.k, pxVar.k) && Intrinsics.f(this.f165899l, pxVar.f165899l) && Intrinsics.f(this.f165900m, pxVar.f165900m);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.e;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        int iA = t61.a.a((this.f165894b.hashCode() + ((this.f165893a.hashCode() - 52610618) * 31)) * 31, 31, this.f165895c);
        Object obj2 = this.d;
        int i = h30.l.i(this.i, j6.a.b(this.f165897h, j6.a.b(this.f165896g, j6.a.b(this.f, j6.a.b(this.e, (iA + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f165898j;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165899l;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165900m;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f165898j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165899l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53897g() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f165897h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f165900m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.f165899l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165898j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53898h() {
        return this.f165896g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165900m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof px ? (px) oldItem : null) == null) {
            return null;
        }
        return new qx(!r0.f165893a.equals(this.f165893a), !r0.f165894b.equals(this.f165894b), !r0.f165895c.equals(this.f165895c), or0.b.l(this, (qv0.i) oldItem));
    }
}
