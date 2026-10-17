package rnb;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.f0;
import pcd.g0;
import pcd.j;
import tof.ec;
import tof.fc;
import tof.hc;
import tof.i7;
import tof.oa;
import tof.r2;
import tof.va;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements djb.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f255584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djb.n f255585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f255586c;
    public final lqg.a d;
    public final gte.a e;

    public v(w savingsVaultInteractor, djb.n savingsAccountsDetailsInteractor, wsg.n walletInteractor, lqg.a transactionsFilterFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterFactory, "transactionsFilterFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f255584a = savingsVaultInteractor;
        this.f255585b = savingsAccountsDetailsInteractor;
        this.f255586c = walletInteractor;
        this.d = transactionsFilterFactory;
        this.e = featureToggleInteractor;
    }

    public final go.g a(AccountId.Joint accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return zi0.c.i(zhm.v.k(r2.f273022a, new hc(accountId.f51413b, null)));
    }

    public final Flow b(AccountId.Joint accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return boh.f.e(this.f255584a.d(new pcd.e(j.c.f234866a)), new t(1, 0, v.class, this, "observeSavingsTransactionsFilter", "observeSavingsTransactionsFilter(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;"));
    }

    public final Flow c() {
        return boh.f.e(this.f255584a.d(new pcd.e(j.d.f234867a)), new u(1, this, v.class, "observeSavingsTransactionsFilter", "observeSavingsTransactionsFilter(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 0));
    }

    public final Flow d(String savingsAccountId) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        return boh.f.e(rd0.e.b(((i) this.f255585b).b(savingsAccountId, w4l.j.f294644c)), new s(this, 0));
    }

    public final go.g e(List vaults) {
        pcd.p pVar;
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        if (vaults.isEmpty()) {
            return new go.g(new Data(null, new IllegalArgumentException("Vaults should not be empty"), false, 5, null), 2);
        }
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        List<pcd.s> list = vaults;
        ArrayList arrayList = new ArrayList();
        for (pcd.s sVar : list) {
            Set set = lqg.a.f199313a;
            String[] elements = {sVar.f234881a, sVar.f234882b};
            Intrinsics.checkNotNullParameter(elements, "elements");
            a0.x(d0.U(kotlin.collections.d.L(elements)), arrayList);
        }
        List listU = d0.U(arrayList);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new ec((String) it8.next()));
        }
        i7 i7VarA = fc.a(new oa(arrayList2), lqg.a.f199314b);
        ArrayList arrayList3 = new ArrayList();
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            g0 g0Var = ((pcd.s) it9.next()).f234885h;
            String str = null;
            f0 f0Var = g0Var instanceof f0 ? (f0) g0Var : null;
            if (f0Var != null && (pVar = f0Var.d) != null) {
                str = pVar.f234875a;
            }
            if (str != null) {
                arrayList3.add(str);
            }
        }
        Set setI1 = d0.i1(arrayList3);
        if (!setI1.isEmpty()) {
            i7VarA = fc.c(new va(setI1), i7VarA);
        }
        return zi0.c.i(i7VarA);
    }

    public final akg.n f(String savingsAccountId) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        return nim.a.v(this.f255584a.c(savingsAccountId, w4l.h.f294642c), new s(this, 1));
    }
}
