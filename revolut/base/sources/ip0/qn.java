package ip0;

import com.revolut.core.ui_kit.delegates.HistogramEmptyDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qn implements qv0.q, s31.c, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.k1 f166022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f166023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f166024c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166026h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f166027j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f166028l;

    public qn(aw0.k1 header, TextLocalisedClause bottomTitle, ResourceImage bottomIcon) {
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter("DRIVING_SCORE_HISTORY_HISTOGRAM_EMPTY", "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(bottomTitle, "bottomTitle");
        Intrinsics.checkNotNullParameter(bottomIcon, "bottomIcon");
        Intrinsics.checkNotNullParameter("DRIVING_SCORE_HISTORY_HISTOGRAM_EMPTY", "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(bottomTitle, "bottomTitle");
        Intrinsics.checkNotNullParameter(bottomIcon, "bottomIcon");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166022a = header;
        this.f166023b = bottomTitle;
        this.f166024c = bottomIcon;
        this.d = positionInBox;
        this.e = null;
        this.f = null;
        this.f166025g = null;
        this.f166026h = null;
        this.i = i;
        this.f166027j = i2;
        this.k = i2;
        this.f166028l = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HistogramEmptyDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53496h() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return "DRIVING_SCORE_HISTORY_HISTOGRAM_EMPTY";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) obj2;
        return this.f166022a.equals(qnVar.f166022a) && this.f166023b.equals(qnVar.f166023b) && this.f166024c.equals(qnVar.f166024c) && Intrinsics.f(this.d, qnVar.d) && Intrinsics.f(this.e, qnVar.e) && Intrinsics.f(this.f, qnVar.f) && Intrinsics.f(this.f166025g, qnVar.f166025g) && Intrinsics.f(this.f166026h, qnVar.f166026h) && Intrinsics.f(null, null) && this.i == qnVar.i && this.f166027j == qnVar.f166027j && this.k == qnVar.k && this.f166028l == qnVar.f166028l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f166024c, t61.a.a((this.f166022a.hashCode() + 1246518526) * 31, 31, this.f166023b), 961), 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166025g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166026h;
        return Integer.hashCode(this.f166028l) + j6.a.b(this.k, j6.a.b(this.f166027j, j6.a.b(this.i, (((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31) + 0) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166025g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.f166027j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f166028l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166027j = i;
    }

    @Override // s31.c
    public final hx7.i p() {
        return null;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.f166026h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.f166025g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166026h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof qn ? (qn) oldItem : null) == null) {
            return null;
        }
        qn qnVar = (qn) oldItem;
        return new rn(!qnVar.f166022a.equals(this.f166022a), !qnVar.f166023b.equals(this.f166023b), !qnVar.f166024c.equals(this.f166024c), !Intrinsics.f(qnVar.d, this.d));
    }
}
