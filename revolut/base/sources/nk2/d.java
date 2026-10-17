package nk2;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.impl.ui.redesign.limits.AtmWithdrawalLimitsBottomSheetScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import njj.n0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends oki.h implements e {
    public final AtmWithdrawalLimitsBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f216628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jla.h f216629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bk2.b f216630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f216631s;

    public d(n stateMapper, AtmWithdrawalLimitsBottomSheetScreenContract$InputData inputData, l93.f revolutCardsInteractor, jla.h productCatalogueInteractor, bk2.b atmFeatureAvailabilityChecker) {
        Data data;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(atmFeatureAvailabilityChecker, "atmFeatureAvailabilityChecker");
        this.o = inputData;
        this.f216628p = revolutCardsInteractor;
        this.f216629q = productCatalogueInteractor;
        this.f216630r = atmFeatureAvailabilityChecker;
        tj2.c cVar = inputData.f63175a;
        dj0.d dVar = inputData.f63176b;
        int i = b.f216624a[cVar.ordinal()];
        if (i == 1) {
            data = new Data(null, null, true, 3, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            data = null;
        }
        this.f216631s = mra.d.b(this, new f(cVar, dVar, data, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        AtmWithdrawalLimitsBottomSheetScreenContract$InputData atmWithdrawalLimitsBottomSheetScreenContract$InputData = this.o;
        if (atmWithdrawalLimitsBottomSheetScreenContract$InputData.f63175a == tj2.c.MONTHLY) {
            if (this.f216629q.d("cash_withdrawal.atm_limit_increase_request", null) == bla.c.ENABLED) {
                l2(new x(this, null, 21), new yi5.b(26));
            } else {
                H2(this.f216631s, new njf.d(11));
            }
        }
        if (atmWithdrawalLimitsBottomSheetScreenContract$InputData.f63175a == tj2.c.DAILY) {
            l2(new n0(3, (Continuation) null, this), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f216631s;
    }
}
