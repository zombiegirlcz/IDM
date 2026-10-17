package rz9;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.e;
import zm3.f;
import zm3.l;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static String a(ChatTransferRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof ChatTransferRecipient.ApmTransferRecipient) {
            return ((ChatTransferRecipient.ApmTransferRecipient) recipient).f79715a.getF62137a().getF62112a();
        }
        if (recipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
            return ((ChatTransferRecipient.BeneficiaryRecipient) recipient).f79716a.f132329a;
        }
        if (recipient instanceof ChatTransferRecipient.CardRecipient) {
            return ((ChatTransferRecipient.CardRecipient) recipient).f79718a.f81490a;
        }
        if (!(recipient instanceof ChatTransferRecipient.ContactRecipient)) {
            if (recipient instanceof ChatTransferRecipient.CharityRecipient) {
                return ((ChatTransferRecipient.CharityRecipient) recipient).f79719a.f13938a;
            }
            if (recipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                return ((ChatTransferRecipient.CryptoAddressRecipient) recipient).f79721a.f71059a;
            }
            if (recipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient) {
                return ((ChatTransferRecipient.PaymentCounterpartyRecipient) recipient).f79724a.f79060a;
            }
            throw new NoWhenBranchMatchedException();
        }
        zm3.a aVar = ((ChatTransferRecipient.ContactRecipient) recipient).f79720a;
        if (aVar instanceof l) {
            return ((l) aVar).getCode();
        }
        if (aVar instanceof e) {
            return ((e) aVar).f323340a;
        }
        if (aVar instanceof f) {
            return ((f) aVar).f323345a;
        }
        if (aVar instanceof n) {
            return ((n) aVar).f323373a;
        }
        if (aVar instanceof o) {
            return ((o) aVar).f323376a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
