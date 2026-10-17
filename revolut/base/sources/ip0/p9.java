package ip0;

import com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class p9 implements tw0.y, qv0.q {

    @NotNull
    public static final o9 Companion = new o9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9 f165785c;
    public qv0.c d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f165787h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165788j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165789l;

    public p9(String listId, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        g9 style = g9.f164371a;
        Intrinsics.checkNotNullParameter(style, "style");
        c.e eVar = new c.e((qv0.h) null, 3);
        this.f165783a = listId;
        this.f165784b = true;
        this.f165785c = style;
        this.d = eVar;
        this.e = i;
        this.f = i2;
        this.f165786g = i3;
        this.f165787h = i5;
        this.i = null;
        this.f165788j = null;
        this.k = null;
        this.f165789l = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CenteredContentTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52580a() {
        return this.f165783a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj2;
        return Intrinsics.f(this.f165783a, p9Var.f165783a) && this.f165784b == p9Var.f165784b && Intrinsics.f(this.f165785c, p9Var.f165785c) && Intrinsics.f(this.d, p9Var.d) && this.e == p9Var.e && this.f == p9Var.f && this.f165786g == p9Var.f165786g && this.f165787h == p9Var.f165787h && Intrinsics.f(this.i, p9Var.i) && Intrinsics.f(this.f165788j, p9Var.f165788j) && Intrinsics.f(this.k, p9Var.k) && Intrinsics.f(this.f165789l, p9Var.f165789l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getW() {
        return this.e;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f165787h, j6.a.b(this.f165786g, j6.a.b(this.f, j6.a.b(this.e, h30.l.i(this.d, (this.f165785c.hashCode() + j6.a.c(this.f165783a.hashCode() * 31, 31, this.f165784b)) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.i;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165788j;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.k;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f165789l;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getV() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getS() {
        return this.f165788j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getX() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getZ() {
        return this.f165787h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getR() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getU() {
        return this.f165789l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getT() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getY() {
        return this.f165786g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165788j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165789l = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        p9 p9Var = oldItem instanceof p9 ? (p9) oldItem : null;
        if (p9Var != null) {
            return new q9(p9Var.f165784b != this.f165784b, !Intrinsics.f(p9Var.f165785c, this.f165785c), or0.b.l(this, p9Var));
        }
        return null;
    }
}
