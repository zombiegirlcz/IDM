package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class xc implements qv0.q, qv0.o, qv0.p {

    @NotNull
    public static final wc Companion = new wc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167124c;
    public final int d;
    public final vc e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167126h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167127j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f167128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f167129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f167130n;
    public qv0.c o;

    public xc(String str, List list, boolean z, int i, vc vcVar, Object obj2, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i2, int i3, int i5, int i6, qv0.c cVar5) {
        this.f167122a = str;
        this.f167123b = list;
        this.f167124c = z;
        this.d = i;
        this.e = vcVar;
        this.f = obj2;
        this.f167125g = cVar;
        this.f167126h = cVar2;
        this.i = cVar3;
        this.f167127j = cVar4;
        this.k = i2;
        this.f167128l = i3;
        this.f167129m = i5;
        this.f167130n = i6;
        this.o = cVar5;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55203g() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55201b() {
        return this.f167122a;
    }

    public final List e() {
        return this.f167123b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj2;
        return Intrinsics.f(this.f167122a, xcVar.f167122a) && Intrinsics.f(this.f167123b, xcVar.f167123b) && this.f167124c == xcVar.f167124c && this.d == xcVar.d && Intrinsics.f(this.e, xcVar.e) && Intrinsics.f(this.f, xcVar.f) && Intrinsics.f(this.f167125g, xcVar.f167125g) && Intrinsics.f(this.f167126h, xcVar.f167126h) && Intrinsics.f(this.i, xcVar.i) && Intrinsics.f(this.f167127j, xcVar.f167127j) && this.k == xcVar.k && this.f167128l == xcVar.f167128l && this.f167129m == xcVar.f167129m && this.f167130n == xcVar.f167130n && Intrinsics.f(this.o, xcVar.o);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.k = i;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.b(this.d, j6.a.c(p.a.d(this.f167122a.hashCode() * 31, 31, this.f167123b), 31, this.f167124c), 31)) * 31;
        Object obj2 = this.f;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        p31.c cVar = this.f167125g;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167126h;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167127j;
        return this.o.hashCode() + j6.a.b(this.f167130n, j6.a.b(this.f167129m, j6.a.b(this.f167128l, j6.a.b(this.k, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f167125g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.o = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.f167126h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f167128l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f167130n;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167128l = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f167127j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167125g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f167129m;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167126h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f167127j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof xc ? (xc) oldItem : null) == null) {
            return null;
        }
        xc xcVar = (xc) oldItem;
        return new yc(!Intrinsics.f(xcVar.f167123b, this.f167123b), or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(xcVar.e, this.e));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xc(String listId, List items, int i, vc vcVar, Object obj2, int i2, int i3, int i5, int i6) {
        int i21;
        boolean z = (i6 & 4) == 0;
        int i22 = (i6 & 8) != 0 ? -1 : i;
        vc layout = (i6 & 16) != 0 ? new tc(pc.f165813a) : vcVar;
        Object obj3 = (i6 & 32) != 0 ? null : obj2;
        int i32 = R$attr.uikit_dp0;
        if ((i6 & 128) != 0) {
            i21 = z ? R$attr.uikit_dp72 : i32;
        } else {
            i21 = i2;
        }
        int i33 = (i6 & 256) != 0 ? i32 : i3;
        int i43 = (i6 & 512) != 0 ? i32 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this(listId, items, z, i22, layout, obj3, null, null, null, null, i32, i21, i33, i43, c.d.f249513a);
    }
}
