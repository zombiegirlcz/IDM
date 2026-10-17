package ux0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f283771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f283772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283773c;
    public final List d;
    public final d1 e;
    public final tx0.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f283774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f283775h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f283776j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f283777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public tx0.q f283778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f283779n;

    public k0(m0 targetState, f0 sourceState, String targetPageId, List models, d1 productIntroStateProvider, tx0.q qVar, int i, Set hiddenPageIds) {
        boolean z;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Intrinsics.checkNotNullParameter(sourceState, "sourceState");
        Intrinsics.checkNotNullParameter(targetPageId, "targetPageId");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        Intrinsics.checkNotNullParameter(hiddenPageIds, "hiddenPageIds");
        this.f283771a = targetState;
        this.f283772b = sourceState;
        this.f283773c = targetPageId;
        this.d = models;
        this.e = productIntroStateProvider;
        this.f = qVar;
        this.f283774g = i;
        this.f283775h = hiddenPageIds;
        this.f283776j = i;
        this.k = models;
        this.f283777l = targetPageId;
        this.f283778m = qVar;
        if (targetState instanceof h0) {
            z = false;
        } else {
            if (!(targetState instanceof j0)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        this.f283779n = z;
    }

    @Override // ux0.l0
    public final l0 b(List models, tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        this.k = models;
        this.f283778m = pagerIndicatorType;
        return this;
    }

    @Override // ux0.l0
    public final l0 c(a0 pagingState) {
        m0 m0VarF;
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        int i = pagingState.f283734b;
        String str = pagingState.f283733a;
        this.f283776j = i;
        m0 m0Var = this.f283771a;
        if (i == 0 && this.i) {
            return p(m0Var);
        }
        if (!Intrinsics.f(this.f283777l, str)) {
            this.f283777l = str;
            aw0.b bVarE = l0.e(str, this.k);
            if (bVarE == null) {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Can't process paging update. Requested to switch to unknown page during transition. PageId=", str));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return this;
            }
            if (l0.j(this.e, bVarE.f10239a)) {
                m0VarF = new h0(pagingState.f283733a, this.k, true, this.e, this.f);
            } else {
                m0VarF = l0.f(bVarE.f10239a, pagingState.f283733a, this.k, this.e, this.f, true);
            }
            m0 targetState = m0VarF;
            if (this.f283774g != 0) {
                String targetPageId = pagingState.f283733a;
                int i2 = pagingState.f283734b;
                Intrinsics.checkNotNullParameter(targetState, "targetState");
                f0 sourceState = this.f283772b;
                Intrinsics.checkNotNullParameter(sourceState, "sourceState");
                Intrinsics.checkNotNullParameter(targetPageId, "targetPageId");
                List models = this.d;
                Intrinsics.checkNotNullParameter(models, "models");
                d1 productIntroStateProvider = this.e;
                Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
                Set hiddenPageIds = this.f283775h;
                Intrinsics.checkNotNullParameter(hiddenPageIds, "hiddenPageIds");
                return new k0(targetState, sourceState, targetPageId, models, productIntroStateProvider, this.f, i2, hiddenPageIds);
            }
            if (targetState.getClass() != m0Var.getClass()) {
                return targetState;
            }
        }
        return this;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f283771a, k0Var.f283771a) && Intrinsics.f(this.f283772b, k0Var.f283772b) && Intrinsics.f(this.f283773c, k0Var.f283773c) && Intrinsics.f(this.d, k0Var.d) && Intrinsics.f(this.e, k0Var.e) && Intrinsics.f(this.f, k0Var.f) && this.f283774g == k0Var.f283774g && Intrinsics.f(this.f283775h, k0Var.f283775h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.d(p.a.c((this.f283772b.hashCode() + (this.f283771a.hashCode() * 31)) * 31, 31, this.f283773c), 31, this.d)) * 31;
        tx0.q qVar = this.f;
        return this.f283775h.hashCode() + j6.a.b(this.f283774g, (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31, 31);
    }

    @Override // ux0.l0
    public final List i() {
        return this.d;
    }

    @Override // ux0.l0
    public final Set l() {
        return this.f283775h;
    }

    @Override // ux0.l0
    public final l0 m(Throwable th10) {
        if (th10 == null) {
            return this;
        }
        m0 m0Var = this.f283771a;
        Intrinsics.i(m0Var, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.accounts.BaseAccountsNavBarContentView.State.ProductIntro");
        l0.k(this.e, th10, ((j0) m0Var).f283765b);
        return new h0(this.f283777l, this.k, true, this.e, this.f);
    }

    @Override // ux0.l0
    public final d1 n() {
        return this.e;
    }

    @Override // ux0.l0
    public final l0 o() {
        this.i = true;
        return this.f283776j == 0 ? p(this.f283771a) : this;
    }

    public final l0 p(m0 m0Var) {
        if (m0Var instanceof j0) {
            return j0.p((j0) m0Var, this.f283777l, null, this.k, this.f283778m, false, false, false, null, 986);
        }
        if (m0Var instanceof h0) {
            return h0.p((h0) m0Var, this.f283777l, this.k, null, this.f283778m, 28);
        }
        throw new NoWhenBranchMatchedException();
    }
}
