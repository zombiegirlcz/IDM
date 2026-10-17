package ek7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreenContract$InputData;
import ej6.x;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends jki.g implements l {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACInsuranceReviewClaimScreenContract$InputData f126972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fj7.a f126973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mj7.b f126974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f126975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f126976t;
    public final i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jki.p stateMapper, CFACInsuranceReviewClaimScreenContract$InputData inputData, fj7.a cfacInsuranceInteractor, mj7.b claimCacheRepository, j60.a bottomExpandableDialogControllerExtension, r policyBottomDialogProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfacInsuranceInteractor, "cfacInsuranceInteractor");
        Intrinsics.checkNotNullParameter(claimCacheRepository, "claimCacheRepository");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(policyBottomDialogProvider, "policyBottomDialogProvider");
        this.f126972p = inputData;
        this.f126973q = cfacInsuranceInteractor;
        this.f126974r = claimCacheRepository;
        this.f126975s = bottomExpandableDialogControllerExtension;
        this.f126976t = policyBottomDialogProvider;
        CFACInsuranceDetails cFACInsuranceDetails = inputData.f75102a;
        List listB = claimCacheRepository.b();
        List listA = claimCacheRepository.a();
        String str = inputData.f75103b;
        long j2 = inputData.f75104c;
        boolean z = inputData.d;
        CFACExcess cFACExcess = inputData.f75106h;
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.u = new i(cFACInsuranceDetails, listB, listA, str, j2, z, cFACExcess, data, "", false, false, false);
    }

    @Override // yji.l
    public final void T1(long j2) {
        x2(new ei8.d(this, 8));
        y2(this.f126974r.b());
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2(List list) {
        if (list.isEmpty()) {
            x2(new x(24));
            return;
        }
        List<CFACClaimExpense> list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap transactionIdToClaimedAmount = new LinkedHashMap(iB);
        for (CFACClaimExpense cFACClaimExpense : list2) {
            a3 a3Var = cFACClaimExpense.f74926a;
            String str = a3Var.f272581b;
            dj0.d dVar = cFACClaimExpense.f74927b;
            if (dVar == null) {
                dVar = a3Var.k;
            }
            transactionIdToClaimedAmount.put(str, dVar.a());
        }
        fj7.a aVar = this.f126973q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transactionIdToClaimedAmount, "transactionIdToClaimedAmount");
        kj7.f fVar = aVar.f135545a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionIdToClaimedAmount, "transactionIdToClaimedAmount");
        yji.l.b1(this, rd0.e.b(fVar.d.f(transactionIdToClaimedAmount, false)), null, new ea4.d(this, null, 24), 3);
    }
}
