package ip0;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class xk implements qv0.i, o31.c, qv0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f167180c;
    public final Float d;
    public final Float e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimationRequest f167181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167182h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167183j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f167184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f167185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f167186n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f167187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public qv0.c f167188q;

    /* JADX WARN: Illegal instructions before constructor call */
    public xk(String listId, List items, Integer num, Float f, Float f4, int i) {
        Integer num2 = (i & 4) != 0 ? null : num;
        Float f5 = (i & 8) != 0 ? null : f;
        Float f6 = (i & 16) != 0 ? null : f4;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        this(listId, items, num2, f5, f6, 0, 0, 0, 0, 63392);
    }

    public final List a() {
        return this.f167179b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59488a() {
        return this.f167178a;
    }

    public final void e() {
        qv0.c eVar;
        List<koi.j> list = this.f167179b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!(((koi.j) it8.next()) instanceof qv0.i)) {
                    return;
                }
            }
        }
        qv0.h hVar = !(this.f167188q instanceof c.d) ? qv0.h.MEDIUM : qv0.h.LARGE;
        for (koi.j jVar : list) {
            if (jVar instanceof qv0.i) {
                qv0.i iVar = (qv0.i) jVar;
                qv0.c f51841p = iVar.getF51841p();
                if (f51841p instanceof c.f) {
                    c.f fVar = (c.f) f51841p;
                    qv0.h hVar2 = fVar.f249516a;
                    eVar = fVar;
                    if (hVar2 != hVar) {
                        eVar = new c.f(hVar, 2);
                    }
                } else {
                    boolean z = f51841p instanceof c.b;
                    eVar = f51841p;
                    if (!z) {
                        if (f51841p instanceof c.a) {
                            c.a aVar = (c.a) f51841p;
                            qv0.h hVar3 = aVar.f249510a;
                            eVar = aVar;
                            if (hVar3 != hVar) {
                                eVar = new c.a(hVar);
                            }
                        } else if (f51841p instanceof c.e) {
                            c.e eVar2 = (c.e) f51841p;
                            qv0.h hVar4 = eVar2.f249514a;
                            eVar = eVar2;
                            if (hVar4 != hVar) {
                                eVar = new c.e(hVar, 2);
                            }
                        } else {
                            boolean z3 = f51841p instanceof c.d;
                            eVar = f51841p;
                            if (!z3) {
                                boolean z4 = f51841p instanceof c.C1364c;
                                eVar = f51841p;
                                if (!z4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                }
                iVar.j(eVar);
            }
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj2;
        return Intrinsics.f(this.f167178a, xkVar.f167178a) && Intrinsics.f(this.f167179b, xkVar.f167179b) && Intrinsics.f(this.f167180c, xkVar.f167180c) && Intrinsics.f(this.d, xkVar.d) && Intrinsics.f(this.e, xkVar.e) && this.f == xkVar.f && Intrinsics.f(this.f167181g, xkVar.f167181g) && this.f167182h == xkVar.f167182h && this.i == xkVar.i && this.f167183j == xkVar.f167183j && this.k == xkVar.k && Intrinsics.f(this.f167184l, xkVar.f167184l) && Intrinsics.f(this.f167185m, xkVar.f167185m) && Intrinsics.f(this.f167186n, xkVar.f167186n) && Intrinsics.f(this.o, xkVar.o) && Intrinsics.f(this.f167187p, xkVar.f167187p);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51846w() {
        return this.f167182h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167182h = i;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f167178a.hashCode() * 31, 31, this.f167179b);
        Integer num = this.f167180c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.e;
        int iC = j6.a.c((iHashCode2 + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.f);
        AnimationRequest animationRequest = this.f167181g;
        int i = h30.l.i(this.f167184l, j6.a.b(this.k, j6.a.b(this.f167183j, j6.a.b(this.i, j6.a.b(this.f167182h, (iC + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f167185m;
        int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167186n;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.o;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167187p;
        return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51843r() {
        return this.f167185m;
    }

    @Override // qv0.i
    public final void j(qv0.c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f167188q = value;
        this.f167184l = value;
        e();
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51844s() {
        return this.f167186n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51847x() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getZ() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51841p() {
        return this.f167188q;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getU() {
        return this.f167187p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51845t() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167185m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51848y() {
        return this.f167183j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167186n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f167187p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        xk xkVar = oldItem instanceof xk ? (xk) oldItem : null;
        if (xkVar != null) {
            return new yk(!Intrinsics.f(this.f167179b, xkVar.f167179b), or0.b.l(this, xkVar));
        }
        return null;
    }

    public xk(String listId, List items, Integer num, Float f, Float f4, int i, int i2, int i3, int i5, int i6) {
        num = (i6 & 4) != 0 ? null : num;
        f = (i6 & 8) != 0 ? null : f;
        f4 = (i6 & 16) != 0 ? null : f4;
        boolean z = (i6 & 32) != 0;
        i = (i6 & 128) != 0 ? R$attr.uikit_dp16 : i;
        i2 = (i6 & 256) != 0 ? R$attr.uikit_dp16 : i2;
        i3 = (i6 & 512) != 0 ? R$attr.uikit_dp8 : i3;
        i5 = (i6 & 1024) != 0 ? R$attr.uikit_dp8 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        c.d _positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(_positionInBox, "_positionInBox");
        this.f167178a = listId;
        this.f167179b = items;
        this.f167180c = num;
        this.d = f;
        this.e = f4;
        this.f = z;
        this.f167181g = null;
        this.f167182h = i;
        this.i = i2;
        this.f167183j = i3;
        this.k = i5;
        this.f167184l = _positionInBox;
        this.f167185m = null;
        this.f167186n = null;
        this.o = null;
        this.f167187p = null;
        this.f167188q = _positionInBox;
        e();
    }
}
