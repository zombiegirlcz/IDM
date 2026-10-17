package ip0;

import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class l70 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QrCodeImage f165139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165140c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f165142h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165143j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165144l;

    public l70(String listId, QrCodeImage qrCodeImage, boolean z, int i, int i2) {
        z = (i2 & 4) != 0 ? true : z;
        i = (i2 & 8) != 0 ? R$attr.uikit_dp0 : i;
        int i3 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165138a = listId;
        this.f165139b = qrCodeImage;
        this.f165140c = z;
        this.d = i;
        this.e = i3;
        this.f = i3;
        this.f165141g = i3;
        this.f165142h = c.d.f249513a;
        this.i = null;
        this.f165143j = null;
        this.k = null;
        this.f165144l = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new QrCodePlainDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51730a() {
        return this.f165138a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l70)) {
            return false;
        }
        l70 l70Var = (l70) obj2;
        return Intrinsics.f(this.f165138a, l70Var.f165138a) && this.f165139b.equals(l70Var.f165139b) && this.f165140c == l70Var.f165140c && this.d == l70Var.d && this.e == l70Var.e && this.f == l70Var.f && this.f165141g == l70Var.f165141g && Intrinsics.f(this.f165142h, l70Var.f165142h) && Intrinsics.f(this.i, l70Var.i) && Intrinsics.f(this.f165143j, l70Var.f165143j) && Intrinsics.f(this.k, l70Var.k) && Intrinsics.f(this.f165144l, l70Var.f165144l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getU() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165142h, j6.a.b(this.f165141g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.c((this.f165139b.hashCode() + (this.f165138a.hashCode() * 31)) * 31, 31, this.f165140c), 31), 31), 31), 31), 31);
        p31.c cVar = this.i;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165143j;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.k;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165144l;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getZ() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165142h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getA() {
        return this.f165143j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getV() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51745x() {
        return this.f165141g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51746y() {
        return this.f165142h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getC() {
        return this.f165144l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getB() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51744w() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165143j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165144l = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof l70 ? (l70) oldItem : null) == null) {
            return null;
        }
        return new m70(!r5.f165139b.equals(this.f165139b), ((l70) oldItem).f165140c != this.f165140c);
    }
}
