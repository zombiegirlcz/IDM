package po9;

import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.feature.contacts.api.navigation.ContactFlowConfiguration;
import com.revolut.feature.contacts.api.navigation.ContactFlowFeatureConfig;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.feature.push_to_card.api.navigation.PushToCardRecipientDetailsDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f237910a;

    public b(e eVar) {
        this.f237910a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        ChatSmartTileSendMoneyDelegate.Model model = (ChatSmartTileSendMoneyDelegate.Model) obj2;
        String str = model.f53894a;
        com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar = this.f237910a.f237913a;
        if (Intrinsics.f(str, bVar.c3().f310974a)) {
            Object obj3 = model.e;
            r parcel = obj3 instanceof r ? (r) obj3 : null;
            if (parcel == null) {
                return Unit.f186387a;
            }
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ResolvedRecipient resolvedRecipient = parcel.f237931b;
            if (resolvedRecipient instanceof ResolvedRecipient.PeerToPeer) {
                bVar.A2(new ContactFlowFeatureConfig.BridgeDestination(new ContactFlowConfiguration(((ResolvedRecipient.PeerToPeer) resolvedRecipient).f79112a, null)));
            } else if (resolvedRecipient instanceof ResolvedRecipient.Beneficiary) {
                f5j.a aVar = ((ResolvedRecipient.Beneficiary) resolvedRecipient).f79108a;
                bVar.A2(new BankBeneficiaryDetailsDestination(aVar, aVar.f132329a));
            } else if (resolvedRecipient instanceof ResolvedRecipient.Card) {
                bVar.A2(new PushToCardRecipientDetailsDestination(((ResolvedRecipient.Card) resolvedRecipient).f79109a));
            } else {
                if (!(resolvedRecipient instanceof ResolvedRecipient.NewBeneficiary) && !(resolvedRecipient instanceof ResolvedRecipient.NewCard)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
