package mc2;

import aii.u;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends yji.n implements c12.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kz9.a f204250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cc2.a f204251m;

    public d(kz9.a chatNavigationProvider, cc2.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f204250l = chatNavigationProvider;
        this.f204251m = apmNavigationProvider;
    }

    @Override // c12.f
    public final boolean A(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return !d0.W(value);
    }

    @Override // c12.f
    public final void d(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        A2(new com.revolut.kompot.common.b(new QvikSettingsScreen(), (ModalDestination.Style) null, 6));
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        u uVarC;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof QvikContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ApmContact.SimpleState simpleState = ((QvikContact) contact).f;
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            uVarC = new com.revolut.kompot.common.b(o2(this.f204251m.g(contact, direction, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6);
        } else {
            if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVarC = u0.c(((uz9.a) this.f204250l).a(new ChatTransferRecipient.ApmTransferRecipient(contact), null));
        }
        A2(uVarC);
    }
}
