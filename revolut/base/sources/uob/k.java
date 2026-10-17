package uob;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.s;
import rnb.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements h {
    public final SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f281598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f281599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mjb.a f281600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f281601s;

    public k(SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData inputData, ijb.a savingsProductInteractor, w savingsVaultInteractor, mjb.a savingsNavigationProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f281598p = savingsProductInteractor;
        this.f281599q = savingsVaultInteractor;
        this.f281600r = savingsNavigationProvider;
        this.f281601s = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow flowE;
        SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData = this.o;
        if (savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData instanceof SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.CutOffTime) {
            flowE = zi0.c.i(new e(((SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.CutOffTime) savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData).f83164a));
        } else {
            if (!(savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData instanceof SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.AmountForDailyInterestPayment)) {
                throw new NoWhenBranchMatchedException();
            }
            SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.AmountForDailyInterestPayment amountForDailyInterestPayment = (SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.AmountForDailyInterestPayment) savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData;
            String str = amountForDailyInterestPayment.f83161a;
            dj0.d dVar = amountForDailyInterestPayment.f83162b;
            s sVar = amountForDailyInterestPayment.f83163c;
            ncd.d dVar2 = amountForDailyInterestPayment.d;
            flowE = (sVar == null || dVar == null || dVar2 == null) ? boh.f.e(this.f281599q.c(str, w4l.h.f294642c), new um7.d(this, 10)) : zi0.c.i(new d(dVar, sVar, dVar2));
        }
        yji.l.a1(this, flowE, null, null, new uf0.d(this, null, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f281601s;
    }
}
