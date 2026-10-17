package s2k;

import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferWithdrawalBridgeFeatureConfig;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import gim.i;
import io3.l;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import qua.p;
import x2k.e;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a u;
    public final /* synthetic */ f5j.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar, f5j.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar2 = this.u;
        e eVar = aVar2.f102007p;
        io3.d dVar = aVar2.f102008q.f102004a;
        String str = dVar != null ? dVar.f163145a : null;
        if (dVar == null || (lVar = dVar.e) == null) {
            lVar = l.CURRENT;
        }
        TransferMoneyPocket moneyPocket = new TransferMoneyPocket(null, new SourceAccount.Pocket(str, lVar, null, 4), 1);
        eVar.getClass();
        f5j.a beneficiary = this.v;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        BankTransferInputData inputData = new BankTransferInputData(beneficiary, (TransferFlowType) TransferFlowType.Default.f92257b, (BankTransferInputReference) null, moneyPocket, m1l.a.SCHEDULE_DISABLED, new TransferScheduleData(0L, (jli.c) null, 7), (p) null, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65408);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return aVar2.C1(new BridgeDestination(new FeatureCommand(new BankTransferWithdrawalBridgeFeatureConfig(new BankTransferFlowInputData.NewTransfer(inputData, false)))));
    }
}
