package eqj;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import eli.k;
import jqj.m;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import pfm.r;
import pfm.z;
import te0.w;
import tof.q6;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f128479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f128480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fqj.a f128481c;

    public g(m transactionAnalyticsRepository, n walletInteractor, fqj.a analyticsTransactionsUpdatesLoader) {
        Intrinsics.checkNotNullParameter(transactionAnalyticsRepository, "transactionAnalyticsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsUpdatesLoader, "analyticsTransactionsUpdatesLoader");
        this.f128479a = transactionAnalyticsRepository;
        this.f128480b = walletInteractor;
        this.f128481c = analyticsTransactionsUpdatesLoader;
    }

    public final r a(q6... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        pfm.n nVar = new pfm.n(new a09.r(this, scopes, 27), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return w.g0(nVar);
    }

    public final pfm.a b(String pocketId, String str, boolean z, String groupId, boolean z3, boolean z4, dj0.d dVar) {
        Object objM;
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        if (z) {
            h hVar = i.Companion;
            Boolean bool = Boolean.FALSE;
            hVar.getClass();
            objM = d0.m(h.a(bool));
        } else {
            d0 d0VarZ = this.f128480b.z(AccountId.Personal.f51414a, pocketId);
            k kVar = new k(new eqd.h(2), 5);
            d0VarZ.getClass();
            z zVar = new z(new ufm.i(d0VarZ, kVar, 1), 1, new dug.e(13), null);
            Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
            objM = zVar;
        }
        pfm.a aVar = new pfm.a(objM, new k(new bhl.b(this, groupId, str, z3, z4, dVar), 4), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
