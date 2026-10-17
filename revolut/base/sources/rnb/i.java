package rnb;

import com.revolut.core.model.account.AccountId;
import djb.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements djb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijb.a f255557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f255558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f255559c;
    public final wsg.n d;
    public final wa7.m e;

    public i(ijb.a savingsProductInteractor, ppg.b vaultsInteractor, w savingsVaultInteractor, wsg.n walletInteractor, ypg.c savingsBackgroundInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(savingsBackgroundInteractor, "savingsBackgroundInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f255557a = savingsProductInteractor;
        this.f255558b = vaultsInteractor;
        this.f255559c = savingsVaultInteractor;
        this.d = walletInteractor;
        this.e = hiddenAccountsInteractor;
    }

    public static pcd.e g(djb.k kVar) {
        pcd.j kVar2;
        pcd.j jVar;
        if (kVar instanceof k.a) {
            jVar = j.c.f234866a;
        } else if (kVar instanceof k.b) {
            jVar = j.d.f234867a;
        } else {
            if (kVar instanceof djb.m) {
                kVar2 = new pcd.l(((djb.m) kVar).f115284a);
            } else {
                if (!(kVar instanceof djb.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar2 = new pcd.k(((djb.l) kVar).f115283a);
            }
            jVar = kVar2;
        }
        return new pcd.e(jVar);
    }

    public final efm.r a(djb.k filter, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarDistinctUntilChanged = pd.b.r(kli.a.h(rd0.e.c(this.f255559c.a(g(filter), loadingStrategy), kotlin.coroutines.g.f186406a), this.d.J(AccountId.Personal.f51414a, loadingStrategy)), new f(loadingStrategy, this)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r b(String savingsAccountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.r(rd0.e.c(this.f255559c.c(savingsAccountId, loadingStrategy), kotlin.coroutines.g.f186406a), new f(this, loadingStrategy, 2));
    }

    public final Flow c(String savingsAccountId) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new g(this, null, 1), u0.m(this.f255559c.c(savingsAccountId, loadingStrategy), rd0.e.b(this.d.J(AccountId.Personal.f51414a, loadingStrategy))));
    }

    public final akg.n d(List list, w4l.k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String strE = ((pcd.s) it8.next()).e();
            if (strE != null) {
                arrayList.add(strE);
            }
        }
        return nim.a.v(u0.m(nim.a.A(nim.a.v(((olb.d) this.f255557a).k(d0.i1(arrayList), kVar), new rm2.s(19)), new rm2.s(20)), ypg.c.a(list)), new q2j.j(list, 26));
    }

    public final Flow e(djb.k filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new g(this, null, 3), u0.m(this.f255559c.a(g(filter), loadingStrategy), rd0.e.b(this.d.J(AccountId.Personal.f51414a, loadingStrategy))));
    }

    public final efm.r f(djb.k filter, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.r(a(filter, loadingStrategy), new f(this, loadingStrategy, 0));
    }
}
