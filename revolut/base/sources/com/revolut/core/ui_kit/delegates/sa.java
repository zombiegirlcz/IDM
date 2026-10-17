package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.a20;
import ip0.c20;
import ip0.d20;
import ip0.y10;
import ip0.z10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class sa implements qv0.i, qv0.p, qv0.q {

    @NotNull
    public static final z10 Companion = new z10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f54701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54702c;
    public final PlainTextWarningDelegate.a d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c20 f54703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y10 f54704h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f54705j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f54707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54708n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f54710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f54711r;

    /* JADX WARN: Illegal instructions before constructor call */
    public sa(String listId, Clause clause, Clause clause2, ra raVar, ResourceImage resourceImage, int i) {
        zhm.f0 actions = zhm.f0.f322471a;
        boolean z = (i & 32) != 0;
        y10 background = y10.LIGHT;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(background, "background");
        this(listId, clause, clause2, raVar, actions, z, resourceImage != null ? new a20(resourceImage) : null, background, null, i2, i2, i2, i2, 15360);
    }

    public static sa e(sa saVar, kr2.h hVar, int i) {
        String listId = saVar.f54700a;
        Clause clause = saVar.f54701b;
        Clause clause2 = saVar.f54702c;
        PlainTextWarningDelegate.a aVar = saVar.d;
        List actions = saVar.e;
        boolean z = saVar.f;
        c20 c20Var = saVar.f54703g;
        y10 background = saVar.f54704h;
        Object obj2 = (i & 256) != 0 ? saVar.i : hVar;
        qv0.c positionInBox = saVar.f54705j;
        p31.c cVar = saVar.k;
        p31.c cVar2 = saVar.f54706l;
        p31.c cVar3 = saVar.f54707m;
        p31.c cVar4 = saVar.f54708n;
        int i2 = saVar.o;
        int i3 = saVar.f54709p;
        int i5 = saVar.f54710q;
        int i6 = saVar.f54711r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return new sa(listId, clause, clause2, aVar, actions, z, c20Var, background, obj2, positionInBox, cVar, cVar2, cVar3, cVar4, i2, i3, i5, i6);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PlainTextWarningDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53564b() {
        return this.i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53563a() {
        return this.f54700a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj2;
        return Intrinsics.f(this.f54700a, saVar.f54700a) && Intrinsics.f(this.f54701b, saVar.f54701b) && Intrinsics.f(this.f54702c, saVar.f54702c) && Intrinsics.f(this.d, saVar.d) && Intrinsics.f(this.e, saVar.e) && this.f == saVar.f && Intrinsics.f(this.f54703g, saVar.f54703g) && this.f54704h == saVar.f54704h && Intrinsics.f(this.i, saVar.i) && Intrinsics.f(this.f54705j, saVar.f54705j) && Intrinsics.f(this.k, saVar.k) && Intrinsics.f(this.f54706l, saVar.f54706l) && Intrinsics.f(this.f54707m, saVar.f54707m) && Intrinsics.f(this.f54708n, saVar.f54708n) && this.o == saVar.o && this.f54709p == saVar.f54709p && this.f54710q == saVar.f54710q && this.f54711r == saVar.f54711r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53567h() {
        return this.o;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.o = i;
    }

    public final int hashCode() {
        int iHashCode = this.f54700a.hashCode() * 31;
        Clause clause = this.f54701b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f54702c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        PlainTextWarningDelegate.a aVar = this.d;
        int iC = j6.a.c(p.a.d((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e), 31, this.f);
        c20 c20Var = this.f54703g;
        int iHashCode4 = (this.f54704h.hashCode() + ((iC + (c20Var == null ? 0 : c20Var.hashCode())) * 31)) * 31;
        Object obj2 = this.i;
        int i = h30.l.i(this.f54705j, (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.k;
        int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54706l;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54707m;
        int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54708n;
        return Integer.hashCode(this.f54711r) + j6.a.b(this.f54710q, j6.a.b(this.f54709p, j6.a.b(this.o, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53569l() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54705j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53570m() {
        return this.f54706l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54707m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getI() {
        return this.f54709p;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getK() {
        return this.f54711r;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54709p = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53566g() {
        return this.f54705j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f54708n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53571n() {
        return this.f54707m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53568j() {
        return this.f54710q;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54706l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54708n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof sa ? (sa) oldItem : null) == null) {
            return null;
        }
        sa saVar = (sa) oldItem;
        return new d20(!Intrinsics.f(saVar.f54701b, this.f54701b), !Intrinsics.f(saVar.f54702c, this.f54702c), !Intrinsics.f(saVar.d, this.d), !Intrinsics.f(saVar.e, this.e), saVar.f != this.f, !Intrinsics.f(saVar.f54703g, this.f54703g), saVar.f54704h != this.f54704h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sa(String listId, Clause clause, Clause clause2, List list, boolean z, Image image, y10 y10Var, Object obj2, int i) {
        List actions = (i & 8) != 0 ? zhm.f0.f322471a : list;
        boolean z3 = (i & 16) != 0 ? true : z;
        y10 background = (i & 64) != 0 ? y10.LIGHT : y10Var;
        Object obj3 = (i & 128) != 0 ? null : obj2;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(background, "background");
        this(listId, clause, clause2, null, actions, z3, image != null ? new a20(image) : null, background, obj3, i2, i2, i2, i2, 15872);
    }

    public sa(String str, Clause clause, Clause clause2, List list, boolean z, c20 c20Var, y10 y10Var, Object obj2, int i) {
        this(str, (i & 2) != 0 ? null : clause, clause2, (i & 8) != 0 ? zhm.f0.f322471a : list, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : c20Var, (i & 64) != 0 ? y10.LIGHT : y10Var, (i & 128) != 0 ? null : obj2);
    }

    public sa(String str, Clause clause, Clause clause2, PlainTextWarningDelegate.a aVar, List list, boolean z, c20 c20Var, y10 y10Var, Object obj2, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5) {
        this.f54700a = str;
        this.f54701b = clause;
        this.f54702c = clause2;
        this.d = aVar;
        this.e = list;
        this.f = z;
        this.f54703g = c20Var;
        this.f54704h = y10Var;
        this.i = obj2;
        this.f54705j = cVar;
        this.k = cVar2;
        this.f54706l = cVar3;
        this.f54707m = cVar4;
        this.f54708n = cVar5;
        this.o = i;
        this.f54709p = i2;
        this.f54710q = i3;
        this.f54711r = i5;
    }

    public /* synthetic */ sa(String str, Clause clause, Clause clause2, PlainTextWarningDelegate.a aVar, List list, boolean z, c20 c20Var, y10 y10Var, Object obj2, int i, int i2, int i3, int i5, int i6) {
        this(str, clause, clause2, aVar, list, z, c20Var, y10Var, obj2, c.d.f249513a, null, null, null, null, (i6 & 16384) != 0 ? R$attr.uikit_dp16 : i, (32768 & i6) != 0 ? R$attr.uikit_dp16 : i2, (65536 & i6) != 0 ? R$attr.uikit_dp16 : i3, (i6 & 131072) != 0 ? R$attr.uikit_dp16 : i5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sa(String listId, Clause clause, Clause clause2, List actions, boolean z, c20 c20Var, y10 background, Object obj2) {
        this(listId, clause, clause2, null, actions, z, c20Var, background, obj2, 0, 0, 0, 0, 261632);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(background, "background");
    }
}
