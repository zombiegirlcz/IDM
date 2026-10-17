package ip0;

import com.revolut.core.ui_kit.delegates.MarginChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cx implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i7 f163800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f163802c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    public cx(aw0.i7 marginChartModel) {
        Intrinsics.checkNotNullParameter("LIST_ID_MARGIN_CHART", "listId");
        Intrinsics.checkNotNullParameter(marginChartModel, "marginChartModel");
        this.f163800a = marginChartModel;
        this.f163801b = c.d.f249513a;
        this.f163802c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MarginChartDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55069b() {
        return "LIST_ID_MARGIN_CHART";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj2;
        return this.f163800a.equals(cxVar.f163800a) && Intrinsics.f(this.f163801b, cxVar.f163801b) && Intrinsics.f(this.f163802c, cxVar.f163802c) && Intrinsics.f(this.d, cxVar.d) && Intrinsics.f(this.e, cxVar.e) && Intrinsics.f(this.f, cxVar.f);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getU() {
        return R$attr.uikit_dp0;
    }

    @Override // qv0.o
    public final void g(int i) {
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163801b, (this.f163800a.hashCode() + 318739728) * 31, 31);
        p31.c cVar = this.f163802c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF55078q() {
        return this.f163802c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163801b = cVar;
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
        return R$attr.uikit_dp0;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF55083x() {
        return R$attr.uikit_dp0;
    }

    @Override // qv0.o
    public final void o(int i) {
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF55077p() {
        return this.f163801b;
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
        this.f163802c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF55082w() {
        return R$attr.uikit_dp0;
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
        if (!(oldItem instanceof cx)) {
            return null;
        }
        return new dx(!this.f163800a.equals(((cx) oldItem).f163800a), or0.b.l((qv0.i) oldItem, this));
    }
}
