package y8k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import efm.d0;
import hrf.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q8k.g;
import tof.a3;
import tof.o3;
import tof.w5;
import zm3.l;
import zm3.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f311670a;

    public b(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f311670a = dateProvider;
    }

    public final PeerToPeerTransferBridgeFeatureConfig c(f direction, a3 transaction, zm3.a contact, String country, TransferFlowType transferFlowType, AccountId accountId) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        PeerToPeerTransferInputData.Companion companion = PeerToPeerTransferInputData.INSTANCE;
        PeerToPeerRecipient peerToPeerRecipient = new PeerToPeerRecipient(contact, ContactTargetAccount.PersonalAccount.f102259a);
        TransferScheduleData transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
        m1l.a aVar = m1l.a.SCHEDULE_ENABLED;
        if (!(contact instanceof l)) {
            if (!(contact instanceof zm3.g) && !(contact instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = m1l.a.SCHEDULE_DISABLED;
        }
        o3 o3Var = transaction.J;
        if (o3Var == null || (dVar = o3Var.f272965a) == null) {
            dVar = transaction.k;
        }
        w5 w5Var = transaction.f272624y;
        return new PeerToPeerTransferBridgeFeatureConfig(PeerToPeerTransferInputData.Companion.a(companion, peerToPeerRecipient, direction, transferFlowType, new TransferMoneyPocket(dVar, new SourceAccount.Pocket(accountId, w5Var.f273144b, w5Var.f273143a)), transferScheduleData, aVar, false, transaction.I.f273162b, transaction.f272614t, null, new FlowExtras(new FinishCommand(null, null, null, 7)), null, null, null, null, 128320));
    }

    public final ufm.b d(zm3.a contact, dj0.d dVar, boolean z, FlowExtras flowExtras) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(contact, "contact");
        ufm.b bVarM = d0.m(new PeerToPeerTransferBridgeFeatureConfig(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(contact), f.INCOMING, z ? TransferFlowType.Crypto.f92256b : TransferFlowType.Default.f92257b, new TransferMoneyPocket(dVar, null, 2), new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_DISABLED, false, null, null, null, flowExtras, null, null, null, null, 128960)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
