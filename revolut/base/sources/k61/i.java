package k61;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.r;
import i31.j;
import i31.k;
import i31.l;
import k50.a4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import pfm.t;
import prk.o;
import wsg.n;

/* JADX INFO: loaded from: classes.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y71.c f181611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f181612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xua.a f181613c;
    public final fk3.b d;
    public final f7l.a e;
    public final ppk.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f181614g;

    public i(y71.c transfersRepository, n walletInteractor, xua.a recurringPaymentInteractor, fk3.b configurationRepository, f7l.a sharedConfigurationInteractor, ppk.f ratesInteractor, w jobInteractor) {
        Intrinsics.checkNotNullParameter(transfersRepository, "transfersRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(sharedConfigurationInteractor, "sharedConfigurationInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
        this.f181611a = transfersRepository;
        this.f181612b = walletInteractor;
        this.f181613c = recurringPaymentInteractor;
        this.d = configurationRepository;
        this.e = sharedConfigurationInteractor;
        this.f = ratesInteractor;
        this.f181614g = jobInteractor;
    }

    public static c7l.a j(prf.a aVar) {
        int i = aVar == null ? -1 : h.f181610b[aVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return c7l.a.SAVINGS;
        }
        if (i == 2) {
            return c7l.a.INVESTMENT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final t c(String transferLinkId) {
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        l lVar = (l) this.f181611a;
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        efm.b bVarCancelTransferLink = lVar.f158085b.cancelTransferLink(transferLinkId);
        pfm.h hVar = new pfm.h(new hc7.a(lVar, transferLinkId, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarCancelTransferLink.e(hVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        t tVarL = te0.w.g0(aVarE).l(new d(this, 1));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    public final ufm.i d(String from, String to6, long j2, long j3, AccountId accountId, boolean z, Double d, Double d5, String str) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.i iVar = new ufm.i(this.f181612b.E(accountId), new k3k.l(new e(this, from, to6, j2, j3, z, d, d5, str, accountId, 0), 24), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i e(String from, String to6, long j2, long j3, AccountId accountId, boolean z, Double d, Double d5, String str) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.i iVar = new ufm.i(this.f181612b.E(accountId), new k3k.l(new e(this, from, to6, j2, j3, z, d, d5, str, accountId, 1), 27), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final d0 f(String transferLinkId) {
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLink");
        l lVar = (l) this.f181611a;
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        return o.l(lVar.k.f(new k(transferLinkId), true), null, null, 3, "firstOrError(...)");
    }

    public final r g(boolean z) {
        return nim.a.w(((l) this.f181611a).f158089j.f(j.a.f158082a, z), new a4(16));
    }

    public final r h(xi0.b limitCurrency) {
        Intrinsics.checkNotNullParameter(limitCurrency, "limitCurrency");
        r rVarSwitchMap = ((ik3.g) this.d).f161888g.c().map(new k3k.l(new i5f.g(8, limitCurrency), 15)).switchMap(new k3k.l(new b(limitCurrency, this), 16));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final pfm.r i(String transferLinkId) {
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        l lVar = (l) this.f181611a;
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        efm.b bVarRejectTransferLink = lVar.f158085b.rejectTransferLink(transferLinkId);
        pfm.h hVar = new pfm.h(new hc7.a(lVar, transferLinkId, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarRejectTransferLink.e(hVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }
}
