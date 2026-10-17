package gu1;

import aii.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends yji.n implements c12.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kz9.a f146660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wt1.a f146661m;

    public d(kz9.a chatNavigationProvider, wt1.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f146660l = chatNavigationProvider;
        this.f146661m = apmNavigationProvider;
    }

    @Override // c12.f
    public final Clause Z0() {
        return new TextLocalisedClause(R$string.blik_new_contact_number_not_found_dialog_title, null, null, 14);
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        u uVarC;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof BlikContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ApmContact.SimpleState simpleState = ((BlikContact) contact).f;
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            uVarC = new com.revolut.kompot.common.b(o2(this.f146661m.g(contact, direction, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6);
        } else {
            if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVarC = u0.c(((uz9.a) this.f146660l).a(new ChatTransferRecipient.ApmTransferRecipient(contact), null));
        }
        A2(uVarC);
    }
}
