package vl1;

import aii.u;
import com.revolut.feature.apm.aani.impl.ui.settings.AaniSettingsScreen;
import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends n implements c12.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kl1.a f290167l;

    public a(kl1.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f290167l = apmNavigationProvider;
    }

    @Override // c12.f
    public final void d(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item, "SETTINGS_MENU_ITEM_ID")) {
            A2(new com.revolut.kompot.common.b(new AaniSettingsScreen(), (ModalDestination.Style) null, 6));
        }
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        u transferOnlyChatDestination;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof AaniContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ApmContact.SimpleState simpleState = ((AaniContact) contact).f;
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            transferOnlyChatDestination = new com.revolut.kompot.common.b(o2(this.f290167l.g(contact, direction, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6);
        } else {
            if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                throw new NoWhenBranchMatchedException();
            }
            transferOnlyChatDestination = new TransferOnlyChatDestination(new ChatTransferRecipient.ApmTransferRecipient(contact));
        }
        A2(transferOnlyChatDestination);
    }
}
