package ux0;

import aw0.i8;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h0 implements m0, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f283753c;
    public final d1 d;
    public final Set e;
    public final tx0.q f;

    public h0(String str, List list, boolean z, d1 d1Var, tx0.q qVar) {
        this(str, list, z, d1Var, zhm.h0.f322473a, qVar);
    }

    public static h0 p(h0 h0Var, String str, List list, Set set, tx0.q qVar, int i) {
        if ((i & 1) != 0) {
            str = h0Var.f283751a;
        }
        String pageId = str;
        if ((i & 2) != 0) {
            list = h0Var.f283752b;
        }
        List models = list;
        boolean z = (i & 4) != 0 ? h0Var.f283753c : true;
        d1 productIntroStateProvider = h0Var.d;
        if ((i & 16) != 0) {
            set = h0Var.e;
        }
        Set hiddenPageIds = set;
        if ((i & 32) != 0) {
            qVar = h0Var.f;
        }
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        Intrinsics.checkNotNullParameter(hiddenPageIds, "hiddenPageIds");
        return new h0(pageId, models, z, productIntroStateProvider, hiddenPageIds, qVar);
    }

    @Override // ux0.l0
    public final l0 b(List models, tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        aw0.b bVarE = l0.e(this.f283751a, models);
        if (bVarE != null && g(bVarE.f10239a)) {
            return p(this, null, models, null, pagerIndicatorType, 29);
        }
        if (bVarE == null || l0.j(this.d, bVarE.f10239a)) {
            return p(this, null, models, null, pagerIndicatorType, 29);
        }
        boolean z = this.f283753c;
        String str = this.f283751a;
        return z ? new k0(l0.f(bVarE.f10239a, str, models, this.d, pagerIndicatorType, true), this, str, models, this.d, pagerIndicatorType, 0, this.e) : l0.f(bVarE.f10239a, str, models, this.d, pagerIndicatorType, false);
    }

    @Override // ux0.l0
    public final l0 c(a0 pagingState) {
        tx0.r rVar;
        tx0.r rVar2;
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        String str = pagingState.f283733a;
        List list = this.f283752b;
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((aw0.b) it8.next()).f10240b.getId(), str)) {
                break;
            }
            i++;
        }
        aw0.b bVar = (aw0.b) zhm.d0.e0(i, list);
        String id10 = null;
        setI = null;
        Set setI = null;
        id10 = null;
        if (bVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Page ", str, " doesn't have a corresponding model"));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return this;
        }
        i8 i8Var = bVar.f10239a;
        if (this.f == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("PagerIndicatorType must be defined");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return this;
        }
        d1 d1Var = this.d;
        if (!l0.j(d1Var, i8Var) && !g(i8Var)) {
            int i2 = pagingState.f283734b;
            boolean z = this.f283753c;
            List list2 = this.f283752b;
            tx0.q qVar = this.f;
            return z ? new k0(l0.f(bVar.f10239a, str, list2, this.d, qVar, true), this, str, list2, this.d, qVar, i2, this.e) : l0.f(bVar.f10239a, str, list2, this.d, qVar, false);
        }
        int i3 = pagingState.f283734b;
        if (i3 == 1 || i3 == 2) {
            aw0.b bVar2 = (aw0.b) zhm.d0.e0(i - 1, list);
            if (bVar2 == null || l0.j(d1Var, bVar2.f10239a)) {
                bVar2 = null;
            }
            aw0.b bVar3 = (aw0.b) zhm.d0.e0(i + 1, list);
            if (bVar3 == null || l0.j(d1Var, bVar3.f10239a)) {
                bVar3 = null;
            }
            if (bVar2 != null || bVar3 != null) {
                String id11 = (bVar2 == null || (rVar2 = bVar2.f10240b) == null) ? null : rVar2.getId();
                if (bVar3 != null && (rVar = bVar3.f10240b) != null) {
                    id10 = rVar.getId();
                }
                setI = zhm.z0.i(id11, id10);
            }
        }
        return setI != null ? p(this, str, null, setI, null, 46) : p(this, str, null, zhm.h0.f322473a, null, 46);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f283751a, h0Var.f283751a) && Intrinsics.f(this.f283752b, h0Var.f283752b) && this.f283753c == h0Var.f283753c && Intrinsics.f(this.d, h0Var.d) && Intrinsics.f(this.e, h0Var.e) && Intrinsics.f(this.f, h0Var.f);
    }

    @Override // ux0.l0
    public final l0 h() {
        return p(this, null, null, null, null, 59);
    }

    public final int hashCode() {
        int iF = p.a.f((this.d.hashCode() + j6.a.c(p.a.d(this.f283751a.hashCode() * 31, 31, this.f283752b), 31, this.f283753c)) * 31, 31, this.e);
        tx0.q qVar = this.f;
        return iF + (qVar == null ? 0 : qVar.hashCode());
    }

    @Override // ux0.l0
    public final List i() {
        return this.f283752b;
    }

    @Override // ux0.l0
    public final Set l() {
        return this.e;
    }

    @Override // ux0.l0
    public final d1 n() {
        return this.d;
    }

    public h0(String pageId, List models, boolean z, d1 productIntroStateProvider, Set hiddenPageIds, tx0.q qVar) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        Intrinsics.checkNotNullParameter(hiddenPageIds, "hiddenPageIds");
        this.f283751a = pageId;
        this.f283752b = models;
        this.f283753c = z;
        this.d = productIntroStateProvider;
        this.e = hiddenPageIds;
        this.f = qVar;
    }
}
