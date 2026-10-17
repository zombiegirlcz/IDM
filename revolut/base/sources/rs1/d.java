package rs1;

import aii.u;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlow;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends n implements c12.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kz9.a f256932l;

    public d(kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.f256932l = chatNavigationProvider;
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        u uVarB;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof BizumContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BizumContact bizumContact = (BizumContact) contact;
        ApmContact.State state = bizumContact.f;
        if (Intrinsics.f(state, ApmContact.State.ACTIVE.f62099a)) {
            uVarB = new com.revolut.kompot.common.c(new BizumTransferFlow(new BizumTransferInputData(bizumContact, direction, new TransferMoneyPocket(null, null, 3))), (Function1) null, 6);
        } else {
            if (!Intrinsics.f(state, ApmContact.State.DELETED.f62100a) && !Intrinsics.f(state, ApmContact.State.NOT_REGISTERED.f62101a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVarB = u0.b(new FeatureCommand(((uz9.a) this.f256932l).a(new ChatTransferRecipient.ApmTransferRecipient(contact), null)));
        }
        A2(uVarB);
    }
}
