package g4k;

import android.content.Intent;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f140548c;
    public final g0 d;
    public final LargeActionButtonDelegate e;

    public f0(j60.a bottomDialogExtension, g0 modelExtension) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f140548c = bottomDialogExtension;
        this.d = modelExtension;
        this.e = new LargeActionButtonDelegate();
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(this.e.d.f121375b), new e0(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f140548c.E()), new ft.d(this, null, 24), 3);
    }

    @Override // yji.d
    public final void onActivityResult(int i, int i2, Intent intent) {
        BankTransferInputData bankTransferInputData;
        i0 i0Var = (i0) this.d;
        i0Var.getClass();
        if (i != 226587) {
            return;
        }
        if (i2 == 0) {
            i0Var.Z2();
            return;
        }
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        BankTransferFlowInputData bankTransferFlowInputData = i0Var.f140556l;
        if (bankTransferFlowInputData instanceof BankTransferFlowInputData.NewTransfer) {
            bankTransferInputData = ((BankTransferFlowInputData.NewTransfer) bankTransferFlowInputData).f101944h;
        } else {
            if (!(bankTransferFlowInputData instanceof BankTransferFlowInputData.ReviewOnly)) {
                throw new NoWhenBranchMatchedException();
            }
            BankTransferFlowInputData.ReviewOnly reviewOnly = (BankTransferFlowInputData.ReviewOnly) bankTransferFlowInputData;
            BankTransferData bankTransferData = reviewOnly.f101949n;
            bankTransferInputData = new BankTransferInputData(reviewOnly.f101945h, reviewOnly.i, (BankTransferInputReference) null, new TransferMoneyPocket(bankTransferData.u, new SourceAccount.Pocket(null, null, null, 6)), bankTransferData.f101928h, bankTransferData.i, bankTransferData.f101929j, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (kq2.g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65408);
        }
        i0Var.A2(u0.b(com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(new BankTransferBridgeFeatureConfig(bankTransferInputData)))));
    }

    @Override // yji.d
    public final void onCreate() {
        this.f140548c.d(zhm.u.c(this.e));
    }
}
