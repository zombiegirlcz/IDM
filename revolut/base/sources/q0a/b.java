package q0a;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientDetailsDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.payment.counterparty.api.navigation.CounterPartyDetailsDestination;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardRecipientDetailsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import gc0.c;
import h30.l;
import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lo5.p;
import x2k.e;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f241220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f241221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oy1.b f241222c;
    public final un9.a d;

    public b(e bankTransferNaviCommandProvider, p cryptoSendNaviCommandProvider, oy1.b apmNavigationProvider, un9.a paymentCounterpartyNavigationProvider) {
        Intrinsics.checkNotNullParameter(bankTransferNaviCommandProvider, "bankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyNavigationProvider, "paymentCounterpartyNavigationProvider");
        this.f241220a = bankTransferNaviCommandProvider;
        this.f241221b = cryptoSendNaviCommandProvider;
        this.f241222c = apmNavigationProvider;
        this.d = paymentCounterpartyNavigationProvider;
    }

    public final FeatureCommand a(ChatTransferRecipient chatTransferRecipient) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
            f5j.a aVar = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
            return u0.f(new BankBeneficiaryDetailsDestination(aVar, aVar.f132329a));
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient) {
            return c.f(new PushToCardRecipientDetailsFeatureConfig(((ChatTransferRecipient.CardRecipient) chatTransferRecipient).f79718a));
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
            return u0.f(new CryptoSendDestination(new CryptoSendInput.BeneficiaryDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a, null)));
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.CharityRecipient) {
            return c.f(new DonationsKompotFeatureConfig.Charity(((ChatTransferRecipient.CharityRecipient) chatTransferRecipient).f79719a.f13938a, null));
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.ApmTransferRecipient) {
            ApmRecipient recipient = ((ChatTransferRecipient.ApmTransferRecipient) chatTransferRecipient).f79715a;
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            return u0.f(new ApmRecipientDetailsDestination(recipient));
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient) {
            PaymentCounterpartyInfo paymentCounterparty = ((ChatTransferRecipient.PaymentCounterpartyRecipient) chatTransferRecipient).f79724a;
            Intrinsics.checkNotNullParameter(paymentCounterparty, "paymentCounterparty");
            return u0.f(new CounterPartyDetailsDestination(paymentCounterparty.f79060a));
        }
        if (chatTransferRecipient instanceof ChatTransferRecipient.ContactRecipient) {
            throw new IllegalStateException(l.r("Unsupported recipient contactName=", q.v(((ChatTransferRecipient.ContactRecipient) chatTransferRecipient).f79720a)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.payments.social.api.model.ChatTransferRecipient r18, com.revolut.feature.payments.messaging.data.api.model.ChatItem r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0a.b.b(com.revolut.feature.payments.social.api.model.ChatTransferRecipient, com.revolut.feature.payments.messaging.data.api.model.ChatItem, gim.c):java.lang.Object");
    }
}
