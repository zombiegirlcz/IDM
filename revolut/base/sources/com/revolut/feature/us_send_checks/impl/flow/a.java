package com.revolut.feature.us_send_checks.impl.flow;

import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.us_send_checks.impl.flow.SendChecksFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.Map;
import java.util.Set;
import jli.c;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nlg.b;
import nlg.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qua.p;
import t70.g;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final dj3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f94590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f94591q;

    public a(dj3.a chooserScreenCommandsFactory, g localization) {
        Intrinsics.checkNotNullParameter(chooserScreenCommandsFactory, "chooserScreenCommandsFactory");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.o = chooserScreenCommandsFactory;
        this.f94590p = localization;
        o oVar = new o(this, 1);
        this.f94591q = cp5.d.a(this, SendChecksFlowContract$Step.AddRecipient.f94587a, f0.f322471a, oVar);
    }

    public final void I2(yki.b bVar, f5j.a aVar) {
        C1(new BridgeDestination(new FeatureCommand(new BankTransferBridgeFeatureConfig(new BankTransferInputData(aVar, (TransferFlowType) TransferFlowType.Default.f92257b, (BankTransferInputReference) null, new TransferMoneyPocket(null, null, 3), m1l.a.SCHEDULE_ENABLED, new TransferScheduleData(0L, (c) null, 7), (p) null, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (kq2.g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65408)))));
        h.D2(bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94591q;
    }
}
