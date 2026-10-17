package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.wh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class wh implements qv0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv0.i f54925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54926c;
    public final AnimationRequest d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54928h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54929j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f54930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f54931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qv0.k f54932n;

    public wh(String listId, qv0.i innerItem, List actions, AnimationRequest animationRequest, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5, qv0.k positionInGroup) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(innerItem, "innerItem");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        this.f54924a = listId;
        this.f54925b = innerItem;
        this.f54926c = actions;
        this.d = animationRequest;
        this.e = positionInBox;
        this.f = cVar;
        this.f54927g = cVar2;
        this.f54928h = cVar3;
        this.i = cVar4;
        this.f54929j = i;
        this.k = i2;
        this.f54930l = i3;
        this.f54931m = i5;
        this.f54932n = positionInGroup;
    }

    public static wh a(wh whVar, RowDelegate.Model model, ArrayList arrayList, AnimationRequest animationRequest, int i) {
        String listId = whVar.f54924a;
        qv0.i innerItem = (i & 2) != 0 ? whVar.f54925b : model;
        List actions = (i & 4) != 0 ? whVar.f54926c : arrayList;
        AnimationRequest animationRequest2 = (i & 8) != 0 ? whVar.d : animationRequest;
        qv0.c positionInBox = (i & 16) != 0 ? whVar.e : c.d.f249513a;
        p31.c cVar = whVar.f;
        p31.c cVar2 = whVar.f54927g;
        p31.c cVar3 = whVar.f54928h;
        p31.c cVar4 = whVar.i;
        int i2 = whVar.f54929j;
        int i3 = whVar.k;
        int i5 = whVar.f54930l;
        int i6 = whVar.f54931m;
        qv0.k positionInGroup = whVar.f54932n;
        whVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(innerItem, "innerItem");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        return new wh(listId, innerItem, actions, animationRequest2, positionInBox, cVar, cVar2, cVar3, cVar4, i2, i3, i5, i6, positionInGroup);
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f54932n = kVar;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return this.f54924a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wh)) {
            return false;
        }
        wh whVar = (wh) obj2;
        return Intrinsics.f(this.f54924a, whVar.f54924a) && Intrinsics.f(this.f54925b, whVar.f54925b) && Intrinsics.f(this.f54926c, whVar.f54926c) && Intrinsics.f(this.d, whVar.d) && Intrinsics.f(this.e, whVar.e) && Intrinsics.f(this.f, whVar.f) && Intrinsics.f(this.f54927g, whVar.f54927g) && Intrinsics.f(this.f54928h, whVar.f54928h) && Intrinsics.f(this.i, whVar.i) && this.f54929j == whVar.f54929j && this.k == whVar.k && this.f54930l == whVar.f54930l && this.f54931m == whVar.f54931m && this.f54932n == whVar.f54932n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.f54929j;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getV() {
        return this.f54932n;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54929j = i;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f54925b.hashCode() + (this.f54924a.hashCode() * 31)) * 31, 31, this.f54926c);
        AnimationRequest animationRequest = this.d;
        int i = h30.l.i(this.e, (iD + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31, 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54927g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54928h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return this.f54932n.hashCode() + j6.a.b(this.f54931m, j6.a.b(this.f54930l, j6.a.b(this.k, j6.a.b(this.f54929j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f54927g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54928h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f54931m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.f54928h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.f54930l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54927g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof wh)) {
            return null;
        }
        return new wh0(this.f54925b.z(((wh) oldItem).f54925b), !Intrinsics.f(this.f54926c, r2.f54926c), or0.b.m(this, (qv0.l) oldItem));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wh(String listId, qv0.i innerItem, List actions, AnimationRequest animationRequest, int i) {
        AnimationRequest animationRequest2 = (i & 8) != 0 ? null : animationRequest;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(innerItem, "innerItem");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this(listId, innerItem, actions, animationRequest2, c.d.f249513a, null, null, null, null, i2, i2, i2, i2, qv0.k.OutOfGroup);
    }
}
