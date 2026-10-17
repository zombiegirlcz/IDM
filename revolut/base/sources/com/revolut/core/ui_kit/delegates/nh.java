package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.jh0;
import ip0.kh0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class nh implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.j0 f54514c;
    public final jh0 d;
    public final int e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f54515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54516h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54517j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f54518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f54520n;
    public final int o;

    public nh(String listId, List suggestions, aw0.j0 backgroundType, jh0 layoutStyle, int i, int i2, int i3, int i5, int i6, int i21) {
        backgroundType = (i21 & 4) != 0 ? aw0.j0.TRANSPARENT : backgroundType;
        i = (i21 & 16) != 0 ? R$attr.uikit_dp12 : i;
        i2 = (i21 & 2048) != 0 ? R$attr.uikit_dp0 : i2;
        i3 = (i21 & 4096) != 0 ? R$attr.uikit_dp0 : i3;
        i5 = (i21 & 8192) != 0 ? R$attr.uikit_dp0 : i5;
        i6 = (i21 & 16384) != 0 ? R$attr.uikit_dp0 : i6;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f54512a = listId;
        this.f54513b = suggestions;
        this.f54514c = backgroundType;
        this.d = layoutStyle;
        this.e = i;
        this.f = null;
        this.f54515g = positionInBox;
        this.f54516h = null;
        this.i = null;
        this.f54517j = null;
        this.k = null;
        this.f54518l = i2;
        this.f54519m = i3;
        this.f54520n = i5;
        this.o = i6;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SuggestionsBarDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51917h() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51913a() {
        return this.f54512a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj2;
        return Intrinsics.f(this.f54512a, nhVar.f54512a) && Intrinsics.f(this.f54513b, nhVar.f54513b) && this.f54514c == nhVar.f54514c && this.d == nhVar.d && this.e == nhVar.e && Intrinsics.f(this.f, nhVar.f) && Intrinsics.f(this.f54515g, nhVar.f54515g) && Intrinsics.f(this.f54516h, nhVar.f54516h) && Intrinsics.f(this.i, nhVar.i) && Intrinsics.f(this.f54517j, nhVar.f54517j) && Intrinsics.f(this.k, nhVar.k) && this.f54518l == nhVar.f54518l && this.f54519m == nhVar.f54519m && this.f54520n == nhVar.f54520n && this.o == nhVar.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.f54518l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54518l = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, (this.d.hashCode() + ((this.f54514c.hashCode() + p.a.d(this.f54512a.hashCode() * 31, 31, this.f54513b)) * 31)) * 31, 31);
        Object obj2 = this.f;
        int i = h30.l.i(this.f54515g, (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f54516h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54517j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f54520n, j6.a.b(this.f54519m, j6.a.b(this.f54518l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f54516h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54515g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51919l() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54517j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51922p() {
        return this.f54519m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51924r() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54519m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51918j() {
        return this.f54515g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51921n() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51920m() {
        return this.f54517j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54516h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51923q() {
        return this.f54520n;
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
        if ((oldItem instanceof nh ? (nh) oldItem : null) == null) {
            return null;
        }
        return new kh0(!Intrinsics.f(this.f54513b, r5.f54513b), this.d != ((nh) oldItem).d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nh(String listId, List suggestions, jh0 layoutStyle, int i, int i2, int i3, int i5, int i6, int i21) {
        int i22 = (i21 & 32) != 0 ? R$attr.uikit_dp0 : i2;
        int i32 = (i21 & 64) != 0 ? R$attr.uikit_dp0 : i3;
        int i33 = (i21 & 128) != 0 ? R$attr.uikit_dp0 : i5;
        int i43 = (i21 & 256) != 0 ? R$attr.uikit_dp0 : i6;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        this(listId, suggestions, null, layoutStyle, i, i22, i32, i33, i43, 1924);
    }
}
