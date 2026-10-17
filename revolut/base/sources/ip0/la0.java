package ip0;

import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class la0 implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f165154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f165155c;
    public final TextClause d;
    public final Image e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f165156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f165157h;
    public final ia0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.core.m f165158j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f165160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f165161n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qv0.c f165162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f165163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f165164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f165165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f165166t;

    public la0(String listId, Clause title, Clause subtitle, TextClause rating, UrlImage urlImage, TextLocalisedClause textLocalisedClause, TextClause textClause, TextLocalisedClause textLocalisedClause2, ia0 actionLabelVisibility, ja0 ja0Var, Object obj2, int i) {
        urlImage = (i & 16) != 0 ? null : urlImage;
        textLocalisedClause = (i & 32) != 0 ? null : textLocalisedClause;
        textClause = (i & 64) != 0 ? null : textClause;
        textLocalisedClause2 = (i & 128) != 0 ? null : textLocalisedClause2;
        actionLabelVisibility = (i & 256) != 0 ? ia0.VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED : actionLabelVisibility;
        com.fasterxml.jackson.core.m heightMode = ja0Var;
        heightMode = (i & 512) != 0 ? ka0.d : heightMode;
        obj2 = (i & 1024) != 0 ? null : obj2;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(actionLabelVisibility, "actionLabelVisibility");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f165153a = listId;
        this.f165154b = title;
        this.f165155c = subtitle;
        this.d = rating;
        this.e = urlImage;
        this.f = textLocalisedClause;
        this.f165156g = textClause;
        this.f165157h = textLocalisedClause2;
        this.i = actionLabelVisibility;
        this.f165158j = heightMode;
        this.k = obj2;
        this.f165159l = null;
        this.f165160m = null;
        this.f165161n = null;
        this.o = null;
        this.f165162p = c.d.f249513a;
        this.f165163q = i2;
        this.f165164r = i2;
        this.f165165s = i2;
        this.f165166t = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ReviewCardDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55137g() {
        return this.k;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55135b() {
        return this.f165153a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj2;
        return Intrinsics.f(this.f165153a, la0Var.f165153a) && Intrinsics.f(this.f165154b, la0Var.f165154b) && Intrinsics.f(this.f165155c, la0Var.f165155c) && Intrinsics.f(this.d, la0Var.d) && Intrinsics.f(this.e, la0Var.e) && Intrinsics.f(this.f, la0Var.f) && Intrinsics.f(this.f165156g, la0Var.f165156g) && Intrinsics.f(this.f165157h, la0Var.f165157h) && this.i == la0Var.i && Intrinsics.f(this.f165158j, la0Var.f165158j) && Intrinsics.f(this.k, la0Var.k) && Intrinsics.f(this.f165159l, la0Var.f165159l) && Intrinsics.f(this.f165160m, la0Var.f165160m) && Intrinsics.f(this.f165161n, la0Var.f165161n) && Intrinsics.f(this.o, la0Var.o) && Intrinsics.f(this.f165162p, la0Var.f165162p) && this.f165163q == la0Var.f165163q && this.f165164r == la0Var.f165164r && this.f165165s == la0Var.f165165s && this.f165166t == la0Var.f165166t;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f165163q;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165163q = i;
    }

    public final int hashCode() {
        int iB = v7.b(p.a.b(p.a.b(this.f165153a.hashCode() * 31, 31, this.f165154b), 31, this.f165155c), 31, this.d);
        Image image = this.e;
        int iHashCode = (iB + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f165156g;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f165157h;
        int iHashCode4 = (this.f165158j.hashCode() + ((this.i.hashCode() + ((iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31)) * 31)) * 31;
        Object obj2 = this.k;
        int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        p31.c cVar = this.f165159l;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165160m;
        int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165161n;
        int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.o;
        return Integer.hashCode(this.f165166t) + j6.a.b(this.f165165s, j6.a.b(this.f165164r, j6.a.b(this.f165163q, h30.l.i(this.f165162p, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f165159l;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165162p = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.f165160m;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165161n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.f165164r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.f165166t;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165164r = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f165162p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f165161n;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165159l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f165165s;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165160m = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.o = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof la0 ? (la0) oldItem : null) == null) {
            return null;
        }
        la0 la0Var = (la0) oldItem;
        return new ma0(!Intrinsics.f(la0Var.f165154b, this.f165154b), !Intrinsics.f(la0Var.f165155c, this.f165155c), !Intrinsics.f(la0Var.d, this.d), !Intrinsics.f(la0Var.e, this.e), !Intrinsics.f(la0Var.f, this.f), !Intrinsics.f(la0Var.f165156g, this.f165156g), !Intrinsics.f(la0Var.f165157h, this.f165157h), la0Var.i != this.i, !Intrinsics.f(la0Var.f165158j, this.f165158j), (Intrinsics.f(la0Var.f165159l, this.f165159l) && Intrinsics.f(la0Var.f165160m, this.f165160m) && Intrinsics.f(la0Var.f165161n, this.f165161n) && Intrinsics.f(la0Var.o, this.o)) ? false : true);
    }
}
