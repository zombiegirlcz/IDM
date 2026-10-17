package bg2;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dpf.c f15073b;

    public /* synthetic */ p(dpf.c cVar, int i) {
        this.f15072a = i;
        this.f15073b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15072a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, null, null, null, null, ((dpf.b) this.f15073b).f116876a, false, null, 7935);
            case 1:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData, 0L, null, null, null, null, null, ((dpf.b) this.f15073b).f116876a, null, null, null, null, null, null, 1048319);
            case 2:
                eg2.g update2 = (eg2.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return eg2.g.a(update2, ((dpf.b) this.f15073b).f116876a, null, null, LDSFile.EF_SOD_TAG);
            case 3:
                eh9.a update3 = (eh9.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return eh9.a.a(update3, null, null, 0, ((dpf.b) this.f15073b).f116876a, 239);
            case 4:
                fo1.g update4 = (fo1.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return fo1.g.a(update4, null, null, null, null, ((dpf.b) this.f15073b).f116876a, null, null, 495);
            case 5:
                g8i.r updateState = (g8i.r) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return g8i.r.a(updateState, null, false, new OrderMode.Scheduling(((dpf.b) this.f15073b).f116876a, null), null, null, null, null, 4031);
            case 6:
                jh9.f update5 = (jh9.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return jh9.f.a(update5, null, null, ((dpf.b) this.f15073b).f116876a, 7);
            case 7:
                RemittanceTransferData updateTransferData2 = (RemittanceTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData2, "$this$updateTransferData");
                return RemittanceTransferData.a(updateTransferData2, 0L, null, null, null, null, null, null, ((dpf.b) this.f15073b).f116876a, null, null, null, 7935);
            case 8:
                PeerToPeerTransferData updateTransferData3 = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData3, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData3, 0L, null, null, null, null, null, null, null, ((dpf.b) this.f15073b).f116876a, null, null, 253951);
            case 9:
                qba.h update6 = (qba.h) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return qba.h.a(update6, null, null, null, ((dpf.b) this.f15073b).f116876a, 255);
            case 10:
                BankTransferData updateTransferData4 = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData4, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData4, 0L, null, null, null, null, null, ((dpf.b) this.f15073b).f116876a, null, null, null, null, null, null, 1048319);
            case 11:
                so1.f update7 = (so1.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return so1.f.a(update7, null, ((dpf.b) this.f15073b).f116876a, 123);
            default:
                TransferData updateTransferData5 = (TransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData5, "$this$updateTransferData");
                return TransferData.e(updateTransferData5, null, 0L, null, null, null, ((dpf.b) this.f15073b).f116876a, null, 191);
        }
    }
}
