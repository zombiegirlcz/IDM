package t7i;

import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import mri.q;
import mri.r;
import mri.s;
import mri.v;
import mri.w;
import zhm.z0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f268717a;

    public b(w jobInteractor) {
        Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
        this.f268717a = jobInteractor;
    }

    public static s b(AccountWrapper accountWrapper) {
        SavingsAccountDetails savingsAccountDetails;
        pcd.s sVar;
        SavingsAccountDetails savingsAccountDetails2;
        pcd.s sVar2;
        SavingsAccountDetails savingsAccountDetails3;
        pcd.s sVar3;
        kel.b bVar;
        j8l.a aVar = accountWrapper.f97224a;
        AccountSource accountSource = accountWrapper.d;
        String str = null;
        switch (a.f268716a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return r.INSTANCE;
            case 8:
                return mri.h.INSTANCE;
            case 9:
                AccountSource.SavingsSource savingsSource = accountSource instanceof AccountSource.SavingsSource ? (AccountSource.SavingsSource) accountSource : null;
                if (savingsSource != null && (savingsAccountDetails = savingsSource.f97216a) != null && (sVar = savingsAccountDetails.f86460a) != null) {
                    str = sVar.f234882b;
                }
                return new mri.n(str, mri.j.PERSONAL);
            case 10:
                AccountSource.SavingsSource savingsSource2 = accountSource instanceof AccountSource.SavingsSource ? (AccountSource.SavingsSource) accountSource : null;
                if (savingsSource2 != null && (savingsAccountDetails2 = savingsSource2.f97216a) != null && (sVar2 = savingsAccountDetails2.f86460a) != null) {
                    str = sVar2.f234882b;
                }
                return new mri.n(str, mri.j.PERSONAL_JOINT);
            case 11:
                AccountSource.SavingsSource savingsSource3 = accountSource instanceof AccountSource.SavingsSource ? (AccountSource.SavingsSource) accountSource : null;
                if (savingsSource3 != null && (savingsAccountDetails3 = savingsSource3.f97216a) != null && (sVar3 = savingsAccountDetails3.f86460a) != null) {
                    str = sVar3.f234882b;
                }
                return new mri.n(str, mri.j.YOUTH);
            case 12:
            case 13:
                return new q(mri.j.PERSONAL);
            case 14:
                return new q(mri.j.PERSONAL_JOINT);
            case 15:
                return new mri.d(accountWrapper.getId());
            case 16:
                return mri.k.INSTANCE;
            case 17:
                return new q(mri.j.YOUTH);
            case 18:
                return new q(mri.j.TEEN);
            case 19:
            case 20:
                AccountSource.InvestCashHolding investCashHolding = accountSource instanceof AccountSource.InvestCashHolding ? (AccountSource.InvestCashHolding) accountSource : null;
                if (investCashHolding != null && (bVar = investCashHolding.f97199b) != null) {
                    return new mri.g(bVar.f183148a.f183146b);
                }
            case 21:
            case 22:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void a(j8l.h sourceAccount, j8l.h targetAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        if (!(sourceAccount instanceof AccountWrapper)) {
            throw new IllegalArgumentException(("Unexpected MoveMoney account: " + a6i.a.e(sourceAccount) + ". Retail supports " + AccountWrapper.class + ". Check app dependency configuration.").toString());
        }
        if (!(targetAccount instanceof AccountWrapper)) {
            throw new IllegalArgumentException(("Unexpected MoveMoney account: " + a6i.a.e(targetAccount) + ". Retail supports " + AccountWrapper.class + ". Check app dependency configuration.").toString());
        }
        v jobInfo = new v(z0.i(b((AccountWrapper) sourceAccount), b((AccountWrapper) targetAccount)));
        nzl.a aVar = (nzl.a) this.f268717a;
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) MoveMoneyBalanceSyncWorker.class);
        Data.Builder builder2 = new Data.Builder();
        rlm.b bVar = Json.d;
        bVar.getClass();
        aVar.f221092a.enqueueUniqueWork("MoveMoneyBalanceSyncWorker", ExistingWorkPolicy.REPLACE, builder.setInputData(builder2.putString("JOB_EXTRA_BALANCE_JOB_INFO", bVar.c(v.Companion.serializer(), jobInfo)).build()).setConstraints(aVar.b()).build());
    }
}
