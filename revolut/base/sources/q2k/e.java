package q2k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import efm.d0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kq2.m;
import kq2.o;
import l2k.g;
import mri.w;
import ufm.i;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements y1k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f241737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f241738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f241739c;
    public final z71.a d;
    public final w e;
    public final lal.a f;

    public e(xua.a recurringPaymentInteractor, f bankTransferRepository, n walletInteractor, z71.a bankAccountsRepository, w jobInteractor, lal.a transferLocationInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(bankTransferRepository, "bankTransferRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(bankAccountsRepository, "bankAccountsRepository");
        Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
        Intrinsics.checkNotNullParameter(transferLocationInteractor, "transferLocationInteractor");
        this.f241737a = recurringPaymentInteractor;
        this.f241738b = bankTransferRepository;
        this.f241739c = walletInteractor;
        this.d = bankAccountsRepository;
        this.e = jobInteractor;
        this.f = transferLocationInteractor;
    }

    public static String c(AccountId accountId) {
        if (accountId instanceof AccountId.Joint) {
            String id10 = ((AccountId.Joint) accountId).f51413b;
            Intrinsics.checkNotNullParameter(id10, "id");
            return id10;
        }
        if (accountId instanceof AccountId.Personal) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final d0 b(xi0.b targetCurrency, wi0.b recipientCountry, long j2, String beneficiaryId) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        g gVar = (g) this.f241738b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        d0 d0VarFirstOrError = zi0.c.q(gVar.f.f(new l2k.a(j2, targetCurrency.f306286a, recipientCountry.f297794a, beneficiaryId), true), new krf.a()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final i d(String str, FundingSource fundingSource, xi0.b bVar, xi0.b bVar2, long j2, String str2, prf.f fVar, UltimateDebtor ultimateDebtor, m mVar, TransferAppSource transferAppSource, rtf.c cVar, kq2.c cVar2, o oVar, Map map, kq2.g gVar, String str3, String str4, Integer num) {
        i iVar = new i(this.f.H(new wj0.b("payments_bank_transfer")), new q09.c(29, new c(this, str, fundingSource, bVar, bVar2, j2, str2, fVar, ultimateDebtor, mVar, transferAppSource, cVar, cVar2, oVar, map, gVar, str3, str4, num)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.n e(String beneficiaryId, xi0.b sourceCurrency, xi0.b targetCurrency, long j2, long j3, AccountId accountId, kq2.c cVar, String str) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return ((g) this.f241738b).c(beneficiaryId, sourceCurrency, targetCurrency, j2, j3, c(accountId), cVar, str);
    }
}
