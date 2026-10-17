package com.revolut.feature.defi.remittances.impl.ui.send.flow;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import v56.b;
import v56.d;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final DeFiSendFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f71850p;

    public a(DeFiSendFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        v48.d dVar = new v48.d(this, 3);
        this.f71850p = cp5.d.a(this, DeFiSendFlowContract$Step.WalletList.f71849a, f0.f322471a, dVar);
    }

    public static ChatTransferRecipient.CryptoAddressRecipient K2(ChatTransferRecipient chatTransferRecipient) {
        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient ? (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient : null;
        if (cryptoAddressRecipient != null) {
            return cryptoAddressRecipient;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, "DeFiSendFlowModel", j6.a.q("Recipient from chat was not CryptoAddressRecipient: ", o0.f186429a.b(chatTransferRecipient.getClass()).m()), null, h0Var);
        return null;
    }

    public final void I2(CryptoAddress cryptoAddress, boolean z) {
        h.t2(this, this.f71850p, new DeFiSendFlowContract$Step.AmountInput(cryptoAddress, z), false, null, false, 14);
    }

    public final void J2(String str) {
        h.t2(this, this.f71850p, new DeFiSendFlowContract$Step.WalletDetails(str), false, null, false, 14);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71850p;
    }
}
