package ip0;

import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class gu implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.j0 f164468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f164469c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164471h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164472j;
    public final int k;

    public gu(String listId, aw0.j0 backgroundType, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f164467a = listId;
        this.f164468b = backgroundType;
        this.f164469c = positionInBox;
        this.d = cVar;
        this.e = cVar2;
        this.f = cVar3;
        this.f164470g = cVar4;
        this.f164471h = i;
        this.i = i2;
        this.f164472j = i3;
        this.k = i5;
    }

    public static gu a(gu guVar, String listId, int i, int i2) {
        aw0.j0 backgroundType = guVar.f164468b;
        qv0.c positionInBox = guVar.f164469c;
        p31.c cVar = guVar.d;
        p31.c cVar2 = guVar.e;
        p31.c cVar3 = guVar.f;
        p31.c cVar4 = guVar.f164470g;
        if ((i2 & 128) != 0) {
            i = guVar.f164471h;
        }
        int i3 = guVar.i;
        int i5 = guVar.f164472j;
        int i6 = guVar.k;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return new gu(listId, backgroundType, positionInBox, cVar, cVar2, cVar3, cVar4, i, i3, i5, i6);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListSubheaderLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59198a() {
        return this.f164467a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj2;
        return Intrinsics.f(this.f164467a, guVar.f164467a) && this.f164468b == guVar.f164468b && Intrinsics.f(this.f164469c, guVar.f164469c) && Intrinsics.f(this.d, guVar.d) && Intrinsics.f(this.e, guVar.e) && Intrinsics.f(this.f, guVar.f) && Intrinsics.f(this.f164470g, guVar.f164470g) && this.f164471h == guVar.f164471h && this.i == guVar.i && this.f164472j == guVar.f164472j && this.k == guVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52606g() {
        return this.f164471h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164471h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164469c, (this.f164468b.hashCode() + (this.f164467a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164470g;
        return Integer.hashCode(this.k) + j6.a.b(this.f164472j, j6.a.b(this.i, j6.a.b(this.f164471h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52610m() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164469c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52611n() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52607h() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52608j() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52609l() {
        return this.f164469c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52612p() {
        return this.f164470g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f164472j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164470g = cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gu(String listId, int i, int i2, int i3) {
        int i5 = (i3 & 2) != 0 ? R$attr.uikit_dp16 : i;
        int i6 = (i3 & 4) != 0 ? R$attr.uikit_dp16 : i2;
        int i21 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this(listId, aw0.j0.DEFAULT, c.d.f249513a, null, null, null, null, i5, i6, i21, i21);
    }
}
