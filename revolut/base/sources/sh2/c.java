package sh2;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends yji.n implements c12.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kz9.a f263392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fh2.a f263393m;

    public c(kz9.a chatNavigationProvider, fh2.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f263392l = chatNavigationProvider;
        this.f263393m = apmNavigationProvider;
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        aii.u uVarC;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof WeroContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ApmContact.SimpleState simpleState = ((WeroContact) contact).f;
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            uVarC = new com.revolut.kompot.common.b(o2(this.f263393m.g(contact, direction, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6);
        } else {
            if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVarC = u0.c(((uz9.a) this.f263392l).a(new ChatTransferRecipient.ApmTransferRecipient(contact), null));
        }
        A2(uVarC);
    }
}
