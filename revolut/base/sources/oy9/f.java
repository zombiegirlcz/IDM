package oy9;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardRecipientDetailsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import o97.l;
import o97.y;
import ox5.t0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public static d0 a(y searchPayload) {
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        Object obj2 = searchPayload.f223136b;
        if (obj2 instanceof ly9.d) {
            ufm.b bVarM = d0.m(new l(new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat(((ly9.d) obj2).f200758a, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 30))));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (obj2 instanceof ly9.i) {
            ufm.b bVarM2 = d0.m(new l(new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat((zm3.a) ((ly9.i) obj2).f200763a, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 30))));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (obj2 instanceof ly9.b) {
            f5j.a aVar = ((ly9.b) obj2).f200756a;
            ufm.b bVarM3 = d0.m(u0.f(new BankBeneficiaryDetailsDestination(aVar, aVar.f132329a)));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            ufm.i iVar = new ufm.i(bVarM3, new b(new t0(18), 10), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        if (obj2 instanceof ly9.c) {
            ufm.b bVarM4 = d0.m(new l(new FeatureCommand(new PushToCardRecipientDetailsFeatureConfig(((ly9.c) obj2).f200757a))));
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            return bVarM4;
        }
        if (obj2 instanceof ly9.e) {
            ufm.b bVarM5 = d0.m(new l(u0.f(new TransferOnlyChatDestination(new ChatTransferRecipient.PaymentCounterpartyRecipient(((ly9.e) obj2).f200759a)))));
            Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
            return bVarM5;
        }
        ufm.b bVarM6 = d0.m(o97.e.f223096a);
        Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
        return bVarM6;
    }
}
