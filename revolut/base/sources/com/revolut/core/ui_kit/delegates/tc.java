package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.g60;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class tc implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedQuantityClause f54768c;
    public final TextClause d;
    public final CdnImage e;
    public final uc f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54770h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54771j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f54773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54774n;
    public qv0.c o;

    public tc(String listId, TextLocalisedClause title, TextLocalisedQuantityClause textLocalisedQuantityClause, TextClause caption, CdnImage image, uc ucVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(image, "image");
        int i = R$attr.uikit_dp16;
        c.e eVar = new c.e((qv0.h) null, 3);
        this.f54766a = listId;
        this.f54767b = title;
        this.f54768c = textLocalisedQuantityClause;
        this.d = caption;
        this.e = image;
        this.f = ucVar;
        this.f54769g = i;
        this.f54770h = i;
        this.i = i;
        this.f54771j = i;
        this.k = null;
        this.f54772l = null;
        this.f54773m = null;
        this.f54774n = null;
        this.o = eVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressionCountDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getD() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53293a() {
        return this.f54766a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj2;
        return Intrinsics.f(this.f54766a, tcVar.f54766a) && Intrinsics.f(this.f54767b, tcVar.f54767b) && Intrinsics.f(this.f54768c, tcVar.f54768c) && Intrinsics.f(this.d, tcVar.d) && Intrinsics.f(this.e, tcVar.e) && Intrinsics.f(this.f, tcVar.f) && this.f54769g == tcVar.f54769g && this.f54770h == tcVar.f54770h && this.i == tcVar.i && this.f54771j == tcVar.f54771j && Intrinsics.f(this.k, tcVar.k) && Intrinsics.f(this.f54772l, tcVar.f54772l) && Intrinsics.f(this.f54773m, tcVar.f54773m) && Intrinsics.f(this.f54774n, tcVar.f54774n) && Intrinsics.f(this.o, tcVar.o);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f54769g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54769g = i;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f54766a.hashCode() * 31, 31, this.f54767b);
        TextLocalisedQuantityClause textLocalisedQuantityClause = this.f54768c;
        int iHashCode = (this.e.hashCode() + ip0.v7.b((iA + (textLocalisedQuantityClause == null ? 0 : textLocalisedQuantityClause.hashCode())) * 31, 31, this.d)) * 31;
        uc ucVar = this.f;
        int iB = j6.a.b(this.f54771j, j6.a.b(this.i, j6.a.b(this.f54770h, j6.a.b(this.f54769g, (iHashCode + (ucVar == null ? 0 : Integer.hashCode(ucVar.f54829a))) * 961, 31), 31), 31), 31);
        p31.c cVar = this.k;
        int iHashCode2 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54772l;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54773m;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54774n;
        return this.o.hashCode() + ((iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53298j() {
        return this.f54774n;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.o = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53296g() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54772l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53299l() {
        return this.f54770h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53301n() {
        return this.f54771j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54770h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f54773m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53297h() {
        return this.f54772l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54774n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53300m() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54773m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        tc tcVar = oldItem instanceof tc ? (tc) oldItem : null;
        if (tcVar == null) {
            return null;
        }
        tc tcVar2 = (tc) oldItem;
        return new g60(!Intrinsics.f(tcVar2.f54767b, this.f54767b), !Intrinsics.f(tcVar2.f54768c, this.f54768c), !Intrinsics.f(tcVar2.d, this.d), !Intrinsics.f(tcVar2.e, this.e), !Intrinsics.f(tcVar2.f, this.f), or0.b.l(this, tcVar));
    }
}
