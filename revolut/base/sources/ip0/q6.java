package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class q6 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f165923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f165924c;
    public final boolean d;
    public final p6 e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f165925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165926h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165927j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f165928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f165929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f165930n;
    public final int o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q6(String listId, Clause title, p6 value) {
        this(listId, title, null, false, value, null, 0, 0, 0, 0, 30720);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsBadgeDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getE() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53634a() {
        return this.f165922a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj2;
        return Intrinsics.f(this.f165922a, q6Var.f165922a) && Intrinsics.f(this.f165923b, q6Var.f165923b) && Intrinsics.f(this.f165924c, q6Var.f165924c) && this.d == q6Var.d && Intrinsics.f(this.e, q6Var.e) && Intrinsics.f(this.f, q6Var.f) && Intrinsics.f(this.f165925g, q6Var.f165925g) && Intrinsics.f(this.f165926h, q6Var.f165926h) && Intrinsics.f(this.i, q6Var.i) && Intrinsics.f(this.f165927j, q6Var.f165927j) && Intrinsics.f(this.k, q6Var.k) && this.f165928l == q6Var.f165928l && this.f165929m == q6Var.f165929m && this.f165930n == q6Var.f165930n && this.o == q6Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.f165928l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165928l = i;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f165922a.hashCode() * 31, 31, this.f165923b);
        Image image = this.f165924c;
        int iHashCode = (this.e.hashCode() + j6.a.c((iB + (image == null ? 0 : image.hashCode())) * 31, 31, this.d)) * 31;
        Object obj2 = this.f;
        int i = h30.l.i(this.f165925g, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f165926h;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165927j;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f165930n, j6.a.b(this.f165929m, j6.a.b(this.f165928l, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f165926h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165925g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165927j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53897g() {
        return this.f165929m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165929m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.f165925g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.f165927j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165926h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53898h() {
        return this.f165930n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        q6 q6Var = oldItem instanceof q6 ? (q6) oldItem : null;
        if (q6Var == null) {
            return null;
        }
        boolean z = !Intrinsics.f(q6Var.f165923b, this.f165923b);
        boolean z3 = !Intrinsics.f(q6Var.f165924c, this.f165924c);
        boolean z4 = q6Var.d != this.d;
        q6 q6Var2 = (q6) oldItem;
        p6 p6Var = q6Var2.e;
        p6 p6Var2 = q6Var2.e;
        TagViewData tagViewDataX = p6Var.X();
        p6 p6Var3 = this.e;
        boolean z6 = !Intrinsics.f(tagViewDataX, p6Var3.X());
        boolean z11 = !Intrinsics.f(null, null);
        m6 m6Var = p6Var2 instanceof m6 ? (m6) p6Var2 : null;
        Object obj2 = m6Var != null ? m6Var.f165322b : null;
        return new r6(z, z3, z4, z6, z11, !Intrinsics.f(obj2, (p6Var3 instanceof m6 ? (m6) p6Var3 : null) != null ? r7.f165322b : null));
    }

    public q6(String str, Clause clause, Image image, boolean z, p6 p6Var, Object obj2, int i, int i2, int i3, int i5, int i6) {
        i = (i6 & 2048) != 0 ? R$attr.uikit_dp12 : i;
        i2 = (i6 & 4096) != 0 ? R$attr.uikit_dp12 : i2;
        i3 = (i6 & 8192) != 0 ? R$attr.uikit_dp16 : i3;
        i5 = (i6 & 16384) != 0 ? R$attr.uikit_dp16 : i5;
        this.f165922a = str;
        this.f165923b = clause;
        this.f165924c = image;
        this.d = z;
        this.e = p6Var;
        this.f = obj2;
        this.f165925g = c.d.f249513a;
        this.f165926h = null;
        this.i = null;
        this.f165927j = null;
        this.k = null;
        this.f165928l = i;
        this.f165929m = i2;
        this.f165930n = i3;
        this.o = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q6(String listId, TextLocalisedClause title, TagViewData tagViewData, ResourceImage resourceImage, TravelExperiencesOption travelExperiencesOption, int i, int i2, int i3) {
        ResourceImage resourceImage2 = (i3 & 8) != 0 ? null : resourceImage;
        boolean z = (i3 & 16) == 0;
        TravelExperiencesOption travelExperiencesOption2 = (i3 & 64) != 0 ? null : travelExperiencesOption;
        int i5 = (i3 & 128) != 0 ? R$attr.uikit_dp12 : i;
        int i6 = (i3 & 256) != 0 ? R$attr.uikit_dp12 : i2;
        int i21 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        this(listId, title, resourceImage2, z, new o6(tagViewData), travelExperiencesOption2, i5, i6, i21, i21, 1920);
    }
}
