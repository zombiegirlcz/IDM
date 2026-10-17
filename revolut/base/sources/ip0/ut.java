package ip0;

import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ut implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166725c;
    public final tt d;
    public final boolean e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166727h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166728j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f166729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f166730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f166731n;
    public final int o;

    public ut(String listId, Clause title, int i, tt bulletType, boolean z, Object obj2, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bulletType, "bulletType");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166723a = listId;
        this.f166724b = title;
        this.f166725c = i;
        this.d = bulletType;
        this.e = z;
        this.f = obj2;
        this.f166726g = positionInBox;
        this.f166727h = cVar;
        this.i = cVar2;
        this.f166728j = cVar3;
        this.k = cVar4;
        this.f166729l = i2;
        this.f166730m = i3;
        this.f166731n = i5;
        this.o = i6;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListCellBulletDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52289a() {
        return this.f166723a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ut)) {
            return false;
        }
        ut utVar = (ut) obj2;
        return Intrinsics.f(this.f166723a, utVar.f166723a) && Intrinsics.f(this.f166724b, utVar.f166724b) && this.f166725c == utVar.f166725c && this.d == utVar.d && this.e == utVar.e && Intrinsics.f(this.f, utVar.f) && Intrinsics.f(this.f166726g, utVar.f166726g) && Intrinsics.f(this.f166727h, utVar.f166727h) && Intrinsics.f(this.i, utVar.i) && Intrinsics.f(this.f166728j, utVar.f166728j) && Intrinsics.f(this.k, utVar.k) && this.f166729l == utVar.f166729l && this.f166730m == utVar.f166730m && this.f166731n == utVar.f166731n && this.o == utVar.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f166729l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166729l = i;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + j6.a.b(this.f166725c, p.a.a(this.f166723a.hashCode() * 31, 31, this.f166724b), 31)) * 31, 31, this.e);
        Object obj2 = this.f;
        int i = h30.l.i(this.f166726g, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f166727h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166728j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f166731n, j6.a.b(this.f166730m, j6.a.b(this.f166729l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52298p() {
        return this.f166727h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166726g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52299q() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166728j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52295l() {
        return this.f166730m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52297n() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166730m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f166726g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52301s() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52300r() {
        return this.f166728j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166727h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52296m() {
        return this.f166731n;
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
        if ((oldItem instanceof ut ? (ut) oldItem : null) == null) {
            return null;
        }
        ut utVar = (ut) oldItem;
        return new vt(!Intrinsics.f(utVar.f166724b, this.f166724b), utVar.f166725c != this.f166725c, !Intrinsics.f(utVar.f166726g, this.f166726g), utVar.d != this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ut(String listId, Clause title, int i, boolean z, tt ttVar, SectionContent.NumberedActionCell numberedActionCell, int i2) {
        boolean z3 = (i2 & 8) != 0 ? false : z;
        tt bulletType = (i2 & 16) != 0 ? tt.OUTLINE : ttVar;
        SectionContent.NumberedActionCell numberedActionCell2 = (i2 & 32) != 0 ? null : numberedActionCell;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bulletType, "bulletType");
        this(listId, title, i, bulletType, z3, numberedActionCell2, c.d.f249513a, null, null, null, null, i3, i3, i3, i3);
    }
}
