package ip0;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements qv0.i, qv0.p, qv0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.j0 f167370c;
    public final mx0.l d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f167371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167372h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167373j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f167374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f167375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f167376n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f167377p;

    public z(String listId, List actionsLists, aw0.j0 backgroundType, mx0.l layoutType, boolean z, boolean z3, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actionsLists, "actionsLists");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f167368a = listId;
        this.f167369b = actionsLists;
        this.f167370c = backgroundType;
        this.d = layoutType;
        this.e = z;
        this.f = z3;
        this.f167371g = positionInBox;
        this.f167372h = cVar;
        this.i = cVar2;
        this.f167373j = cVar3;
        this.k = cVar4;
        this.f167374l = i;
        this.f167375m = i2;
        this.f167376n = i3;
        this.o = i5;
        this.f167377p = obj2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ActionsDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53602m() {
        return this.f167377p;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53595a() {
        return this.f167368a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f167368a, zVar.f167368a) && Intrinsics.f(this.f167369b, zVar.f167369b) && this.f167370c == zVar.f167370c && this.d == zVar.d && this.e == zVar.e && this.f == zVar.f && Intrinsics.f(this.f167371g, zVar.f167371g) && Intrinsics.f(this.f167372h, zVar.f167372h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f167373j, zVar.f167373j) && Intrinsics.f(this.k, zVar.k) && this.f167374l == zVar.f167374l && this.f167375m == zVar.f167375m && this.f167376n == zVar.f167376n && this.o == zVar.o && Intrinsics.f(this.f167377p, zVar.f167377p);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f167374l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167374l = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167371g, j6.a.c(j6.a.c((this.d.hashCode() + ((this.f167370c.hashCode() + p.a.d(this.f167368a.hashCode() * 31, 31, this.f167369b)) * 31)) * 31, 31, this.e), 31, this.f), 31);
        p31.c cVar = this.f167372h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167373j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        int iB = j6.a.b(this.o, j6.a.b(this.f167376n, j6.a.b(this.f167375m, j6.a.b(this.f167374l, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
        Object obj2 = this.f167377p;
        return iB + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f167372h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167371g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53604p() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167373j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53600j() {
        return this.f167375m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53601l() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167375m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53607s() {
        return this.f167371g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53606r() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53605q() {
        return this.f167373j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167372h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f167376n;
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
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof z ? (z) oldItem : null) == null) {
            return null;
        }
        z zVar = (z) oldItem;
        boolean z3 = !Intrinsics.f(this.f167369b, zVar.f167369b);
        boolean z4 = false;
        boolean z6 = this.e != zVar.e;
        boolean z11 = this.f != zVar.f;
        if (this.d != zVar.d) {
            z = false;
            z4 = true;
        } else {
            z = false;
        }
        return new a0(z3, z4, z6, z11, (Intrinsics.f(this.f167371g, zVar.f167371g) && this.f167374l == zVar.f167374l && this.f167375m == zVar.f167375m && this.f167376n == zVar.f167376n && this.o == zVar.o) ? z : true);
    }

    public /* synthetic */ z(String str, List list, aw0.j0 j0Var, mx0.l lVar, boolean z, boolean z3, int i, int i2, int i3, Object obj2, int i5) {
        this(str, list, (i5 & 4) != 0 ? aw0.j0.DEFAULT : j0Var, (i5 & 8) != 0 ? mx0.l.SCROLLABLE : lVar, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? false : z3, c.d.f249513a, null, null, null, null, (i5 & 2048) != 0 ? R$attr.uikit_dp16 : i, (i5 & 4096) != 0 ? R$attr.uikit_dp16 : i2, (i5 & 8192) != 0 ? R$attr.uikit_dp0 : i3, R$attr.uikit_dp0, (i5 & 32768) != 0 ? null : obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String listId, List actions, boolean z, int i, int i2, int i3) {
        aw0.j0 backgroundType = aw0.j0.DEFAULT;
        int i5 = (i3 & 64) != 0 ? R$attr.uikit_dp16 : i;
        int i6 = (i3 & 128) != 0 ? R$attr.uikit_dp16 : i2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this(listId, actions, backgroundType, z ? mx0.l.SCROLLABLE : mx0.l.NON_SCROLLABLE, i5, i6, null, 256);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String listId, List actions, aw0.j0 j0Var, mx0.l lVar, int i, int i2, int i3) {
        aw0.j0 backgroundType = (i3 & 4) != 0 ? aw0.j0.DEFAULT : j0Var;
        mx0.l layoutType = (i3 & 8) != 0 ? mx0.l.SCROLLABLE : lVar;
        int i5 = (i3 & 16) != 0 ? R$attr.uikit_dp16 : i;
        int i6 = (i3 & 32) != 0 ? R$attr.uikit_dp16 : i2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this(listId, zhm.u.c(actions), backgroundType, layoutType, false, false, i5, i6, 0, null, 59360);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String listId, List actions, aw0.j0 j0Var, mx0.l layoutType, int i, int i2, Object obj2, int i3) {
        aw0.j0 backgroundType = (i3 & 4) != 0 ? aw0.j0.DEFAULT : j0Var;
        int i5 = (i3 & 64) != 0 ? R$attr.uikit_dp16 : i;
        int i6 = (i3 & 128) != 0 ? R$attr.uikit_dp16 : i2;
        Object obj3 = (i3 & 256) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this(listId, zhm.u.c(actions), backgroundType, layoutType, false, false, i5, i6, 0, obj3, 26496);
    }
}
