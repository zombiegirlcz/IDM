package pae;

import com.revolut.core.model.account.AccountId;
import efm.r;
import f28.b0;
import io3.i;
import io3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n8i.q0;
import qua.w;
import qua.x;
import qua.z;
import yua.q;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nae.d f234541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f234542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f234543c;
    public final l80.e d;

    public e(nae.d transactionsProvider, xua.a recurringPaymentInteractor, b state, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(transactionsProvider, "transactionsProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f234541a = transactionsProvider;
        this.f234542b = recurringPaymentInteractor;
        this.f234543c = state;
        this.d = dateProvider;
    }

    public final r a(AccountId accountId, String str) {
        String id10;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        boolean z = accountId instanceof AccountId.Joint;
        AccountId.Joint joint = z ? (AccountId.Joint) accountId : null;
        if (joint == null || (id10 = joint.f51413b) == null) {
            id10 = null;
        } else {
            Intrinsics.checkNotNullParameter(id10, "id");
        }
        nae.d dVar = this.f234541a;
        q qVar = (q) dVar.f213863b;
        z walletFilter = w.f249340a;
        z walletFilter2 = id10 != null ? new x(id10) : walletFilter;
        Intrinsics.checkNotNullParameter(walletFilter2, "walletFilter");
        r rVarSwitchMap = m70.a.g(qVar.i(nim.a.w(qVar.s(true, walletFilter2, true), new ysk.a(11)), new ypg.h(22)), null, new n87.r(12), 1).switchMap(new na1.e(29, new nae.b(dVar, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        if (id10 != null) {
            walletFilter = new x(id10);
        }
        Intrinsics.checkNotNullParameter(walletFilter, "walletFilter");
        r rVarSwitchMap2 = m70.a.g(qVar.i(nim.a.w(qVar.s(true, walletFilter, true), new ysk.a(11)), new ypg.h(22)), null, new n87.r(11), 1).switchMap(new nae.a(new nae.b(dVar, 0), 4));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        r rVarZipWith = rVarSwitchMap.zipWith(rVarSwitchMap2, new nae.a(new b0(str, 10), 3));
        Intrinsics.checkNotNullExpressionValue(rVarZipWith, "zipWith(...)");
        if (!(accountId instanceof AccountId.Personal)) {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            rVarZipWith = te0.w.l(rVarZipWith, m70.a.g(osg.b.e(dVar.f213862a, false, l.CURRENT, null, i.INTERNAL, null, null, accountId, 52), null, new n87.r(10), 1)).map(new nae.a(new q0(7), 2));
            Intrinsics.checkNotNullExpressionValue(rVarZipWith, "map(...)");
        }
        r map = te0.w.l(m70.a.g(whf.b.a(dVar.e, rVarZipWith, dVar.d, null, accountId, 4), null, new p4a.g(23), 1), ((h) this.f234543c).x0().c(te0.q.f270015a)).map(new p8k.b(12, new d(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
