package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class s7 implements qv0.i, tw0.y, qv0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166311c;
    public final int d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.k f166312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f166313h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166314j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166315l;

    public s7(String listId, int i, int i2, int i3, int i5, boolean z, qv0.k positionInGroup) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        this.f166309a = listId;
        this.f166310b = i;
        this.f166311c = i2;
        this.d = i3;
        this.e = i5;
        this.f = z;
        this.f166312g = positionInGroup;
        this.f166313h = c.d.f249513a;
    }

    public static s7 a(s7 s7Var, String str, int i) {
        if ((i & 1) != 0) {
            str = s7Var.f166309a;
        }
        String listId = str;
        int i2 = s7Var.f166310b;
        int i3 = s7Var.f166311c;
        int i5 = s7Var.d;
        int i6 = s7Var.e;
        boolean z = s7Var.f;
        qv0.k positionInGroup = s7Var.f166312g;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        return new s7(listId, i2, i3, i5, i6, z, positionInGroup);
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f166312g = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55144b() {
        return this.f166309a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj2;
        return Intrinsics.f(this.f166309a, s7Var.f166309a) && this.f166310b == s7Var.f166310b && this.f166311c == s7Var.f166311c && this.d == s7Var.d && this.e == s7Var.e && this.f == s7Var.f && this.f166312g == s7Var.f166312g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.f166310b;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getV() {
        return this.f166312g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166310b = i;
    }

    public final int hashCode() {
        return this.f166312g.hashCode() + j6.a.c(j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166311c, j6.a.b(this.f166310b, this.f166309a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166313h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f166314j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.f166311c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166311c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.f166313h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.f166315l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166314j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166315l = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return null;
    }

    public /* synthetic */ s7(String str, int i, int i2, int i3, int i5, boolean z, qv0.k kVar, int i6) {
        this(str, (i6 & 2) != 0 ? R$attr.uikit_dp0 : i, (i6 & 4) != 0 ? R$attr.uikit_dp0 : i2, (i6 & 8) != 0 ? R$attr.uikit_dp0 : i3, (i6 & 16) != 0 ? R$attr.uikit_dp0 : i5, (i6 & 32) != 0 ? true : z, (i6 & 64) != 0 ? qv0.k.OutOfGroup : kVar);
    }
}
