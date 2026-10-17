package rge;

import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import hhe.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import od0.e;
import rfe.o;
import vie.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f254139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f254140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f254141c;
    public final Object d;
    public d e;
    public d f;

    public b(ix5.b homeGraphProvider, ix5.b creditGraphProvider, h creditAvailability) {
        Intrinsics.checkNotNullParameter(homeGraphProvider, "homeGraphProvider");
        Intrinsics.checkNotNullParameter(creditGraphProvider, "creditGraphProvider");
        Intrinsics.checkNotNullParameter(creditAvailability, "creditAvailability");
        this.f254139a = homeGraphProvider;
        this.f254140b = creditGraphProvider;
        this.f254141c = creditAvailability;
        this.d = new Object();
    }

    public static void a(d dVar, ArrayList arrayList) {
        if (dVar == null) {
            return;
        }
        try {
            Iterator<E> it8 = dVar.l().iterator();
            while (it8.hasNext()) {
                try {
                    ((e) it8.next()).clear();
                } catch (Exception e) {
                    arrayList.add(e);
                }
            }
        } catch (Exception e2) {
            arrayList.add(e2);
        }
    }

    public static d f(phm.a aVar) {
        d dVar = (d) aVar.get();
        d dVar2 = dVar != null ? dVar : null;
        if (dVar2 != null) {
            return dVar2;
        }
        throw new IllegalStateException("TabAccountsModeGraphFacade must be backed by TabAccountsModeSubcomponentApi, but was ".concat(dVar.getClass().getName()).toString());
    }

    public final d b(TabAccountsMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return c(mode.getId());
    }

    public final d c(o modeId) {
        d dVarE;
        Intrinsics.checkNotNullParameter(modeId, "modeId");
        synchronized (this.d) {
            dVarE = e(modeId);
        }
        return dVarE;
    }

    public final d d() {
        d dVarE;
        synchronized (this.d) {
            dVarE = this.f254141c.a() ? e(o.CREDIT) : null;
        }
        return dVarE;
    }

    public final d e(o oVar) {
        int i = a.f254138a[oVar.ordinal()];
        if (i == 1) {
            d dVar = this.e;
            if (dVar != null) {
                return dVar;
            }
            d dVarF = f(this.f254139a);
            this.e = dVarF;
            return dVarF;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar2 = this.f;
        if (dVar2 != null) {
            return dVar2;
        }
        d dVarF2 = f(this.f254140b);
        this.f = dVarF2;
        return dVarF2;
    }
}
