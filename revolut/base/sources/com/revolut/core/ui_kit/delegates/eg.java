package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ec0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class eg implements qv0.i, qv0.m, o31.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dg f54127c;
    public final float d;
    public final boolean e;
    public final tw0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f54128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54129h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54130j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f54131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f54133n;
    public final int o;

    public eg(String listId, List items, dg scrollBehavior, float f, boolean z, tw0.h hVar, int i, int i2, int i3, int i5, int i6) {
        scrollBehavior = (i6 & 4) != 0 ? dg.c.f54053a : scrollBehavior;
        f = (i6 & 8) != 0 ? 2.0f : f;
        z = (i6 & 16) != 0 ? false : z;
        hVar = (i6 & 32) != 0 ? null : hVar;
        i3 = (i6 & 8192) != 0 ? R$attr.uikit_dp8 : i3;
        i5 = (i6 & 16384) != 0 ? R$attr.uikit_dp8 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollBehavior, "scrollBehavior");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f54125a = listId;
        this.f54126b = items;
        this.f54127c = scrollBehavior;
        this.d = f;
        this.e = z;
        this.f = hVar;
        this.f54128g = positionInBox;
        this.f54129h = null;
        this.i = null;
        this.f54130j = null;
        this.k = null;
        this.f54131l = i;
        this.f54132m = i2;
        this.f54133n = i3;
        this.o = i5;
    }

    public final List a() {
        return this.f54126b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f54125a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj2;
        return Intrinsics.f(this.f54125a, egVar.f54125a) && Intrinsics.f(this.f54126b, egVar.f54126b) && Intrinsics.f(this.f54127c, egVar.f54127c) && Float.compare(this.d, egVar.d) == 0 && this.e == egVar.e && Intrinsics.f(this.f, egVar.f) && Intrinsics.f(this.f54128g, egVar.f54128g) && Intrinsics.f(this.f54129h, egVar.f54129h) && Intrinsics.f(this.i, egVar.i) && Intrinsics.f(this.f54130j, egVar.f54130j) && Intrinsics.f(this.k, egVar.k) && this.f54131l == egVar.f54131l && this.f54132m == egVar.f54132m && this.f54133n == egVar.f54133n && this.o == egVar.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53157m() {
        return this.f54131l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54131l = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(m72.b.b(this.d, (this.f54127c.hashCode() + p.a.d(this.f54125a.hashCode() * 31, 31, this.f54126b)) * 31, 31), 31, this.e);
        tw0.j jVar = this.f;
        int i = h30.l.i(this.f54128g, (iC + (jVar == null ? 0 : jVar.hashCode())) * 31, 31);
        p31.c cVar = this.f54129h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54130j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f54133n, j6.a.b(this.f54132m, j6.a.b(this.f54131l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f54129h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54128g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53155j() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54130j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53158n() {
        return this.f54132m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53159p() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54132m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53154h() {
        return this.f54128g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53156l() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f54130j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54129h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f54133n;
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
        if ((oldItem instanceof eg ? (eg) oldItem : null) == null) {
            return null;
        }
        eg egVar = (eg) oldItem;
        return new ec0(!Intrinsics.f(egVar.f54127c, this.f54127c), !(egVar.d == this.d), egVar.e != this.e, or0.b.l((qv0.i) oldItem, this), egVar.f == null && this.f != null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eg(String listId, List items, dg dgVar, float f, int i, int i2, int i3) {
        dg scrollBehavior = (i3 & 4) != 0 ? dg.c.f54053a : dgVar;
        float f4 = (i3 & 8) != 0 ? 2.0f : f;
        boolean z = (i3 & 16) == 0;
        int i5 = (i3 & 64) != 0 ? R$attr.uikit_dp16 : i;
        int i6 = (i3 & 128) != 0 ? R$attr.uikit_dp16 : i2;
        int i21 = R$attr.uikit_dp8;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollBehavior, "scrollBehavior");
        this(listId, items, scrollBehavior, f4, z, null, i5, i6, i21, i21, 1920);
    }
}
