package zh2;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.apm.wero.impl.ui.home.settings.WeroSettingsScreen;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlow;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements c {
    public final y o;

    public e(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void I2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1830237399:
                if (listId.equals("ID_REQUEST_MONEY_ACTION")) {
                    C1(new com.revolut.kompot.common.b(new WeroPayFlow(new WeroPayFlowContract$InputData(WeroNavigation$StartType.Pay.ShowUserCode.f63026a)), (ModalDestination.Style) null, 6));
                    break;
                }
                break;
            case -1059901778:
                if (listId.equals("ID_SETTINGS_ACTION")) {
                    C1(new com.revolut.kompot.common.b(new WeroSettingsScreen(), (ModalDestination.Style) null, 6));
                }
                break;
            case -868049074:
                if (listId.equals("ID_QR_CODE_ACTION")) {
                    C1(new com.revolut.kompot.common.b(new WeroPayFlow(new WeroPayFlowContract$InputData(WeroNavigation$StartType.Pay.Scanner.f63024a)), (ModalDestination.Style) null, 6));
                    break;
                }
                break;
            case 1335981032:
                if (listId.equals("ID_SEND_MONEY_ACTION")) {
                    C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmWero.f79996a, 29));
                    break;
                }
                break;
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
