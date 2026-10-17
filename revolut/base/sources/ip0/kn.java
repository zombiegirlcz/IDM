package ip0;

import com.revolut.core.ui_kit.delegates.HistogramDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class kn implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f165043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.s5 f165044c;
    public final aw0.t5 d;
    public final aw0.k1 e;
    public final aw0.q5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f165045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jn f165046h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165047j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f165049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f165050n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f165051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f165052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uw0.i f165053r;

    public kn(ArrayList items, aw0.s5 s5Var, aw0.t5 t5Var, aw0.k1 k1Var, LinkedHashMap itemHeaders) {
        aw0.q5 style = new aw0.q5();
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp8;
        Intrinsics.checkNotNullParameter("DRIVING_SCORE_HISTORY_HISTOGRAM", "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(itemHeaders, "itemHeaders");
        jn clickHandlingMode = jn.f164896a;
        Intrinsics.checkNotNullParameter(clickHandlingMode, "clickHandlingMode");
        Intrinsics.checkNotNullParameter("DRIVING_SCORE_HISTORY_HISTOGRAM", "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(itemHeaders, "itemHeaders");
        Intrinsics.checkNotNullParameter(clickHandlingMode, "clickHandlingMode");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165042a = "DRIVING_SCORE_HISTORY_HISTOGRAM";
        this.f165043b = items;
        this.f165044c = s5Var;
        this.d = t5Var;
        this.e = k1Var;
        this.f = style;
        this.f165045g = itemHeaders;
        this.f165046h = clickHandlingMode;
        this.i = positionInBox;
        this.f165047j = null;
        this.k = null;
        this.f165048l = null;
        this.f165049m = null;
        this.f165050n = i;
        this.o = i2;
        this.f165051p = i;
        this.f165052q = i;
        this.f165053r = new uw0.i("DRIVING_SCORE_HISTORY_HISTOGRAM", uw0.g.UNTIL_ANY_FINISHED, false);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HistogramDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getE() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52603a() {
        return this.f165042a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj2;
        return Intrinsics.f(this.f165042a, knVar.f165042a) && Intrinsics.f(this.f165043b, knVar.f165043b) && Intrinsics.f(this.f165044c, knVar.f165044c) && Intrinsics.f(this.d, knVar.d) && Intrinsics.f(this.e, knVar.e) && Intrinsics.f(this.f, knVar.f) && Intrinsics.f(this.f165045g, knVar.f165045g) && Intrinsics.f(this.f165046h, knVar.f165046h) && Intrinsics.f(this.i, knVar.i) && Intrinsics.f(this.f165047j, knVar.f165047j) && Intrinsics.f(this.k, knVar.k) && Intrinsics.f(this.f165048l, knVar.f165048l) && Intrinsics.f(this.f165049m, knVar.f165049m) && this.f165050n == knVar.f165050n && this.o == knVar.o && this.f165051p == knVar.f165051p && this.f165052q == knVar.f165052q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52606g() {
        return this.f165050n;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165050n = i;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f165043b, this.f165042a.hashCode() * 31, 961);
        aw0.s5 s5Var = this.f165044c;
        int iHashCode = (iB + (s5Var == null ? 0 : s5Var.hashCode())) * 31;
        aw0.t5 t5Var = this.d;
        int iHashCode2 = (iHashCode + (t5Var == null ? 0 : t5Var.f10541a.hashCode())) * 31;
        aw0.k1 k1Var = this.e;
        int i = h30.l.i(this.i, (this.f165046h.hashCode() + r6.b.e(this.f165045g, (this.f.hashCode() + ((iHashCode2 + (k1Var == null ? 0 : k1Var.hashCode())) * 31)) * 31, 31)) * 29791, 31);
        p31.c cVar = this.f165047j;
        int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165048l;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165049m;
        return Integer.hashCode(this.f165052q) + j6.a.b(this.f165051p, j6.a.b(this.o, j6.a.b(this.f165050n, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52610m() {
        return this.f165047j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52611n() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165048l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52607h() {
        return this.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52608j() {
        return this.f165052q;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.o = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52609l() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52612p() {
        return this.f165049m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.f165048l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165047j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f165051p;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165049m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof kn ? (kn) oldItem : null) == null) {
            return null;
        }
        kn knVar = (kn) oldItem;
        return new ln(!Intrinsics.f(knVar.f165043b, this.f165043b), !Intrinsics.f(knVar.f165044c, this.f165044c), !Intrinsics.f(knVar.d, this.d), !Intrinsics.f(knVar.e, this.e), !Intrinsics.f(knVar.f, this.f), !true, !Intrinsics.f(knVar.i, this.i), !Intrinsics.f(knVar.f165053r, this.f165053r), !true);
    }
}
