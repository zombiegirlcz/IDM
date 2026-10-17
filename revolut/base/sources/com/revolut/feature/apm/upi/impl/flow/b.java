package com.revolut.feature.apm.upi.impl.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import lf2.d;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements lf2.b {

    @NotNull
    public static final d Companion = new d();
    public final UpiTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b3a.a f62975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jf2.a f62976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f62977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ag2.a f62978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public UpiTransferFlowContract$Recipient f62979t;
    public final Object u;
    public final i v;

    public b(UpiTransferFlowContract$InputData inputData, b3a.a chatTransferNavigationProvider, jf2.a upiAliasResolveExtension, wj0.a idempotencyKeyHolder, ag2.a screenConfigurationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(upiAliasResolveExtension, "upiAliasResolveExtension");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(screenConfigurationProvider, "screenConfigurationProvider");
        this.o = inputData;
        this.f62975p = chatTransferNavigationProvider;
        this.f62976q = upiAliasResolveExtension;
        this.f62977r = idempotencyKeyHolder;
        this.f62978s = screenConfigurationProvider;
        this.f62979t = inputData.f62957a;
        this.u = w.y0(new kob.a(this, 27));
        this.v = d8l.d.a(this, new c(this, 5));
    }

    public static final UpiTransferFlowContract$Step I2(b bVar) {
        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = bVar.o;
        dj0.d dVar = upiTransferFlowContract$InputData.f62958b;
        if (dVar == null) {
            return UpiTransferFlowContract$Step.Amount.f62969a;
        }
        String str = upiTransferFlowContract$InputData.f62959c;
        if (str == null) {
            str = "";
        }
        return new UpiTransferFlowContract$Step.Review(new TransferScheduleData(0L, (jli.c) null, 7), dVar, null, str, null);
    }

    @Override // yji.l
    public final void I1() {
        this.f62977r.a("payments-upi-transfer");
    }

    public final void J2(k71.i iVar) {
        ChatTransferRecipient beneficiaryRecipient;
        UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = this.f62979t;
        if (upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.Alias) {
            beneficiaryRecipient = new ChatTransferRecipient.PaymentCounterpartyRecipient(((UpiTransferFlowContract$Recipient.Alias) upiTransferFlowContract$Recipient).f62963a);
        } else if (upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.BankBeneficiary) {
            beneficiaryRecipient = new ChatTransferRecipient.BeneficiaryRecipient(((UpiTransferFlowContract$Recipient.BankBeneficiary) upiTransferFlowContract$Recipient).f62966a, null);
        } else {
            if (!(upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.UpiMerchant)) {
                throw new NoWhenBranchMatchedException();
            }
            beneficiaryRecipient = null;
        }
        b3a.a aVar = this.f62975p;
        C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), beneficiaryRecipient != null ? ((v3a.b) aVar).b(beneficiaryRecipient) : ((v3a.b) aVar).e(iVar, null))));
    }

    public final boolean K2(UpiTransferFlowContract$InputData upiTransferFlowContract$InputData) {
        AliasMerchant aliasMerchant;
        if (upiTransferFlowContract$InputData.f != we2.a.QR_UPLOAD) {
            return false;
        }
        UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = this.f62979t;
        UpiTransferFlowContract$Recipient.UpiMerchant upiMerchant = upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.UpiMerchant ? (UpiTransferFlowContract$Recipient.UpiMerchant) upiTransferFlowContract$Recipient : null;
        if (upiMerchant == null || (aliasMerchant = upiMerchant.f62967a) == null) {
            return true;
        }
        return !Intrinsics.f(aliasMerchant.f, Boolean.TRUE);
    }

    @Override // yki.j
    public final void M0() {
        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = this.o;
        dj0.d dVar = upiTransferFlowContract$InputData.f62958b;
        long j2 = dVar != null ? dVar.f115082a : 0L;
        Continuation continuation = null;
        if (!K2(upiTransferFlowContract$InputData) || j2 <= 200000) {
            l2(new kze.h(this, continuation, 8), new yi5.b(26));
        } else {
            l.a1(this, X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.upi_transfer_uploaded_qr_amount_limit, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new la8.h(this, null, 10), 3);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
