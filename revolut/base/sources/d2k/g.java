package d2k;

import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public interface g {
    /* JADX WARN: Multi-variable type inference failed */
    static FeatureCommand a(g gVar, f5j.a beneficiary, BankTransferInputReference bankTransferInputReference, TransferFlowType transferFlowType, TransferMoneyPocket transferMoneyPocket, m1l.a aVar, FlowExtras flowExtras, Map map, ScannedBillDetails scannedBillDetails, int i) {
        dj0.d dVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        BankTransferInputReference bankTransferInputReference2 = (i & 2) != 0 ? null : bankTransferInputReference;
        TransferFlowType flowType = (i & 4) != 0 ? TransferFlowType.Default.f92257b : transferFlowType;
        TransferMoneyPocket moneyPocket = (i & 8) != 0 ? new TransferMoneyPocket(dVar, objArr2 == true ? 1 : 0, 3) : transferMoneyPocket;
        TransferScheduleData scheduleData = new TransferScheduleData(0L, (jli.c) (objArr == true ? 1 : 0), 7);
        m1l.a scheduleMode = (i & 32) != 0 ? m1l.a.SCHEDULE_ENABLED : aVar;
        FlowExtras flowExtras2 = (i & 128) != 0 ? null : flowExtras;
        Map mapG = (i & 256) != 0 ? null : map;
        ScannedBillDetails scannedBillDetails2 = (i & 512) != 0 ? null : scannedBillDetails;
        ((x2k.e) gVar).getClass();
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        if (mapG == null) {
            mapG = r0.g();
        }
        return new FeatureCommand(new BankTransferBridgeFeatureConfig(new BankTransferInputData(beneficiary, flowType, bankTransferInputReference2, moneyPocket, scheduleMode, scheduleData, (p) null, flowExtras2, mapG, (UltimateDebtor) null, (kq2.g) null, (Set) null, false, scannedBillDetails2, (TransferAppSource.AIR_WIDGET) null, 48640)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static FeatureCommand b(x2k.e eVar, f5j.a beneficiary, TransferFlowType transferFlowType, String str, BankTransferInputReference bankTransferInputReference, TransferMoneyPocket moneyPocket, TransferScheduleData transferScheduleData, m1l.a aVar, p pVar, FlowExtras flowExtras, UltimateDebtor ultimateDebtor, kq2.g gVar, int i) {
        TransferFlowType flowType = (i & 2) != 0 ? TransferFlowType.Default.f92257b : transferFlowType;
        Object[] objArr = 0;
        String str2 = (i & 4) != 0 ? null : str;
        BankTransferInputReference simpleNote = (i & 8) != 0 ? null : bankTransferInputReference;
        TransferScheduleData scheduleData = (i & 32) != 0 ? new TransferScheduleData(0L, (jli.c) (objArr == true ? 1 : 0), 7) : transferScheduleData;
        m1l.a scheduleMode = (i & 64) != 0 ? m1l.a.SCHEDULE_ENABLED : aVar;
        p pVar2 = (i & 128) != 0 ? null : pVar;
        FlowExtras flowExtras2 = (i & 256) != 0 ? null : flowExtras;
        kq2.g gVar2 = (i & 2048) != 0 ? null : gVar;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        if (simpleNote == null) {
            simpleNote = str2 != null ? new BankTransferInputReference.SimpleNote(str2) : null;
        }
        return new FeatureCommand(new BankTransferBridgeFeatureConfig(new BankTransferInputData(beneficiary, flowType, simpleNote, moneyPocket, scheduleMode, scheduleData, pVar2, flowExtras2, r0.g(), ultimateDebtor, gVar2, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 47104)));
    }
}
