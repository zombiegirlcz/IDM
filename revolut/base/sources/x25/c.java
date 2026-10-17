package x25;

import aim.e;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.j1;
import g25.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import o95.g;
import rf9.h;
import vkm.f;
import vkm.i;
import w4l.k;
import x1.n;
import x15.b0;
import x15.c0;
import x15.d0;
import x15.y;
import x15.z;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f302508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302509b;

    public c(g overdraftProductFeatureTogglesInteractor, p creditApplicationAccountMapper) {
        Intrinsics.checkNotNullParameter(overdraftProductFeatureTogglesInteractor, "overdraftProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationAccountMapper, "creditApplicationAccountMapper");
        this.f302508a = overdraftProductFeatureTogglesInteractor;
        this.f302509b = creditApplicationAccountMapper;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return i.f290039a;
    }

    @Override // a35.i
    public final Flow e(List products, List applicationAccounts) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(applicationAccounts, "applicationAccounts");
        e eVarB = u.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : products) {
            if (obj2 instanceof d0) {
                arrayList.add(obj2);
            }
        }
        d0 d0Var = (d0) zhm.d0.K0(arrayList);
        if (d0Var instanceof c0) {
            b0 b0Var = ((c0) d0Var).f302248a;
            if ((b0Var instanceof z ? (z) b0Var : null) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : applicationAccounts) {
                    if (((x15.e) obj3).f302252a.f14164b == j1.OVERDRAFT) {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(this.f302509b.d((x15.e) it8.next()));
                    }
                    eVarB.addAll(arrayList3);
                }
            }
        } else if (!(d0Var instanceof y)) {
            throw new NoWhenBranchMatchedException();
        }
        return zi0.c.i(u.a(eVarB));
    }

    @Override // a35.i
    public final f k(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.y yVarE = rd0.e.e(xam.a.h(new h((Continuation) null, this, 19), this.f302508a.j()), h0.f322473a, new x18.c(3, 2, null));
        y yVar = y.f302306a;
        jhi.k kVarS = n14.k.s(yVarE, yVar);
        Data data = new Data(yVar, null, false, 6, null);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return zi0.c.M(kVarS, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "OverdraftProduct");
    }

    @Override // a35.i
    public final Flow l() {
        return this.f302508a.j();
    }

    public final Flow o() {
        g gVar = this.f302508a;
        return rd0.e.e(nim.a.v(u0.m(gVar.d(), gVar.c(w4l.h.f294642c)), new n(28)), h0.f322473a, new x18.c(3, 3, null));
    }
}
