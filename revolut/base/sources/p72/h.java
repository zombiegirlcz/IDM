package p72;

import aii.u;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends yji.n implements c12.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kz9.a f233527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v62.a f233528m;

    public h(kz9.a chatNavigationProvider, v62.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f233527l = chatNavigationProvider;
        this.f233528m = apmNavigationProvider;
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        u uVarB;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof MultibancoContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ApmContact.SimpleState simpleState = ((MultibancoContact) contact).f;
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            uVarB = new com.revolut.kompot.common.b(o2(this.f233528m.g(contact, direction, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6);
        } else {
            if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVarB = u0.b(new FeatureCommand(((uz9.a) this.f233527l).a(new ChatTransferRecipient.ApmTransferRecipient(contact), null)));
        }
        A2(uVarB);
    }
}
