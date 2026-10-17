package ux0;

import aw0.d8;
import aw0.e8;
import aw0.h8;
import aw0.i8;
import aw0.l6;
import aw0.y7;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 implements m0, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283766c;
    public final boolean d;
    public final d1 e;
    public final tx0.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f283767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f283768h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f283769j;

    public j0(String pageId, List products, List models, boolean z, d1 productIntroStateProvider, tx0.q qVar, boolean z3, boolean z4, boolean z6, e0 background) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f283764a = pageId;
        this.f283765b = products;
        this.f283766c = models;
        this.d = z;
        this.e = productIntroStateProvider;
        this.f = qVar;
        this.f283767g = z3;
        this.f283768h = z4;
        this.i = z6;
        this.f283769j = background;
        if (products.isEmpty()) {
            throw new IllegalArgumentException("ProductIntro state requires at least one product");
        }
    }

    public static j0 p(j0 j0Var, String str, List list, List list2, tx0.q qVar, boolean z, boolean z3, boolean z4, e0 e0Var, int i) {
        if ((i & 1) != 0) {
            str = j0Var.f283764a;
        }
        String pageId = str;
        List products = (i & 2) != 0 ? j0Var.f283765b : list;
        List models = (i & 4) != 0 ? j0Var.f283766c : list2;
        boolean z6 = (i & 8) != 0 ? j0Var.d : true;
        d1 productIntroStateProvider = j0Var.e;
        tx0.q qVar2 = (i & 32) != 0 ? j0Var.f : qVar;
        boolean z11 = (i & 64) != 0 ? j0Var.f283767g : z;
        boolean z12 = (i & 128) != 0 ? j0Var.f283768h : z3;
        boolean z29 = (i & 256) != 0 ? j0Var.i : z4;
        e0 background = (i & 512) != 0 ? j0Var.f283769j : e0Var;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        Intrinsics.checkNotNullParameter(background, "background");
        return new j0(pageId, products, models, z6, productIntroStateProvider, qVar2, z11, z12, z29, background);
    }

    @Override // ux0.l0
    public final l0 b(List models, tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        String str = this.f283764a;
        aw0.b bVarE = l0.e(str, this.f283766c);
        i8 i8Var = bVarE != null ? bVarE.f10239a : null;
        aw0.b bVarE2 = l0.e(str, models);
        i8 i8Var2 = bVarE2 != null ? bVarE2.f10239a : null;
        if (i8Var == null) {
            return p(this, null, null, models, pagerIndicatorType, false, false, false, null, 987);
        }
        if (i8Var2 != null && g(i8Var2)) {
            return r(models, pagerIndicatorType);
        }
        boolean z = i8Var instanceof d8;
        if (z && (i8Var2 instanceof e8)) {
            if (((e8) i8Var2).f10295a) {
                s();
            }
            return r(models, pagerIndicatorType);
        }
        boolean z3 = i8Var instanceof y7;
        if ((z3 || (i8Var instanceof h8)) && (i8Var2 instanceof e8)) {
            s();
            return r(models, pagerIndicatorType);
        }
        if (i8Var2 != null) {
            return p(this, null, null, models, pagerIndicatorType, false, false, false, l0.a(i8Var2), 475);
        }
        if ((z3 || (i8Var instanceof h8)) && !this.d) {
            throw new IllegalStateException(new IllegalStateException("Inconsistent product intro updates. Had intro for product " + zi0.c.y(i8Var) + " but product is missing after models update").toString());
        }
        if (z && str.length() > 0 && !str.equals("ID_NULL_PAGE")) {
            IllegalStateException illegalStateException = new IllegalStateException("Inconsistent product intro updates. Had intro for product " + ((d8) i8Var).f10282a + " but product is missing after models update");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return p(this, null, null, models, pagerIndicatorType, false, false, false, null, 987);
    }

    @Override // ux0.l0
    public final l0 c(a0 pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        String str = pagingState.f283733a;
        List list = this.f283766c;
        aw0.b bVarE = l0.e(str, list);
        i8 i8Var = bVarE != null ? bVarE.f10239a : null;
        aw0.b bVarE2 = l0.e(this.f283764a, list);
        boolean z = (bVarE2 != null ? bVarE2.f10239a : null) == null;
        if (i8Var != null) {
            d1 d1Var = this.e;
            if (l0.j(d1Var, i8Var) || g(i8Var)) {
                if (!this.d) {
                    return new h0(str, this.f283766c, false, this.e, this.f);
                }
                if (!z) {
                    return this;
                }
                if ((i8Var instanceof e8) && ((e8) i8Var).f10295a) {
                    s();
                }
                return q(str, list, this.f);
            }
            List listD = l0.d(d1Var, i8Var);
            if (z && !listD.isEmpty()) {
                return p(this, str, listD, null, null, false, false, false, l0.a(i8Var), 508);
            }
        }
        return this;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f283764a, j0Var.f283764a) && Intrinsics.f(this.f283765b, j0Var.f283765b) && Intrinsics.f(this.f283766c, j0Var.f283766c) && this.d == j0Var.d && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f) && this.f283767g == j0Var.f283767g && this.f283768h == j0Var.f283768h && this.i == j0Var.i && Intrinsics.f(this.f283769j, j0Var.f283769j);
    }

    @Override // ux0.l0
    public final l0 h() {
        return p(this, null, null, null, null, false, false, false, null, 1015);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.c(p.a.d(p.a.d(this.f283764a.hashCode() * 31, 31, this.f283765b), 31, this.f283766c), 31, this.d)) * 31;
        tx0.q qVar = this.f;
        return this.f283769j.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f283767g), 31, this.f283768h), 31, this.i);
    }

    @Override // ux0.l0
    public final List i() {
        return this.f283766c;
    }

    @Override // ux0.l0
    public final l0 m(Throwable th10) {
        tx0.q qVar = this.f;
        List list = this.f283766c;
        String str = this.f283764a;
        if (th10 == null) {
            s();
            return q(str, list, qVar);
        }
        boolean z = this.d;
        List list2 = this.f283765b;
        d1 d1Var = this.e;
        if (z) {
            l0.k(d1Var, th10, list2);
            return q(str, list, qVar);
        }
        l0.k(d1Var, th10, list2);
        return new h0(this.f283764a, this.f283766c, false, this.e, this.f);
    }

    @Override // ux0.l0
    public final d1 n() {
        return this.e;
    }

    public final k0 q(String str, List list, tx0.q qVar) {
        return new k0(new h0(str, list, true, this.e, qVar), this, str, list, this.e, qVar, 0, zhm.h0.f322473a);
    }

    public final l0 r(List list, tx0.q qVar) {
        return this.d ? q(this.f283764a, list, qVar) : new h0(this.f283764a, list, false, this.e, qVar);
    }

    public final void s() {
        List list = this.f283765b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l6 product = (l6) list.get(i);
            tnb.g0 g0Var = (tnb.g0) this.e;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            ((AccountsNavBarContentView) g0Var.f272384b).setIntroViewed(product);
        }
    }
}
