package r38;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import efm.r;
import g48.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import jid.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import tof.ua;
import tof.va;
import v38.c;
import vkm.j2;
import vkm.q;
import wsg.n;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f251215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f251216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f251217c;
    public final psi.a d;
    public final qpa.b e;
    public final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mce.a f251218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f251219h;
    public final wa7.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2 f251220j;
    public final ne0.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ne0.k f251221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ne0.k f251222m;

    public l(r0 jointAccountInteractor, n walletInteractor, ppk.f ratesInteractor, psi.a comparator, qpa.b pushMessagesInteractor, CoroutineScope coroutineScope, mce.a recurringPaymentFilterProvider, z delistedPocketsInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(recurringPaymentFilterProvider, "recurringPaymentFilterProvider");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f251215a = jointAccountInteractor;
        this.f251216b = walletInteractor;
        this.f251217c = ratesInteractor;
        this.d = comparator;
        this.e = pushMessagesInteractor;
        this.f = coroutineScope;
        this.f251218g = recurringPaymentFilterProvider;
        this.f251219h = delistedPocketsInteractor;
        this.i = hiddenAccountsInteractor;
        this.f251220j = q.c(new Data(c.a.f285856a, null, false, 6, null));
        this.k = new ne0.k(new d(this, 2));
        this.f251221l = new ne0.k(new d(this, 3));
        this.f251222m = new ne0.k(new d(this, 4));
    }

    public final r d(e eVar) {
        r rVarDistinctUntilChanged = nim.a.w(this.f251221l.a(eVar), new r2d.d(13)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final r e(AccountId.Joint accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarDistinctUntilChanged = nim.a.w(this.f251221l.a(new e(accountId, loadingStrategy)), new r2d.d(11)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final Flow f(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        r rVarStartWith = this.e.f248320a.map(new r25.c(20, new r2d.d(12))).startWith(loadingStrategy);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        Continuation continuation = null;
        return q.q(xam.a.h(new qp7.g(this, continuation, 25), q.Q(rd0.e.b(rVarStartWith), new om4.r0(continuation, this, setY0, 16))));
    }

    public final r g(Set productAccountId, AccountId.Joint accountId) {
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Set set = productAccountId;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                String str = ((ProductAccountId) it8.next()).f89729a;
                u38.m.Companion.getClass();
                if (Intrinsics.f(str, u38.m.e)) {
                    return nim.a.w(nim.a.w(d(new e(accountId, w4l.h.f294642c)), new r2d.d(14)), new r2d.d(15));
                }
            }
        }
        if (productAccountId.size() == 1) {
            return zi0.c.j(new ua(((ProductAccountId) d0.a0(productAccountId)).f89729a));
        }
        Set set2 = productAccountId;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            arrayList.add(((ProductAccountId) it9.next()).f89729a);
        }
        return zi0.c.j(new va(d0.i1(arrayList)));
    }
}
