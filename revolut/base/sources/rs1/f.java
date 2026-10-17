package rs1;

import ax9.o;
import c12.y;
import c12.z;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlow;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import hy1.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pak.h;
import sl3.k;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f256934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fl3.a f256935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f256936n;

    public f(l bizumContactsProvider, fl3.a contactsRepository, h navigationProvider) {
        Intrinsics.checkNotNullParameter(bizumContactsProvider, "bizumContactsProvider");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.f256934l = bizumContactsProvider;
        this.f256935m = contactsRepository;
        this.f256936n = navigationProvider;
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(this.f256936n.d(params.f20359b, params.f20358a)), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        A2(new com.revolut.kompot.common.c(new BizumTransferFlow(new BizumTransferInputData((BizumContact) recipient, transferDirection, new TransferMoneyPocket(null, null, 3))), (Function1) null, 6));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new o(yh5.b.d(this.f256934l.a(null), rd0.e.b(((k) this.f256935m).g())), 12);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.BIZUM;
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(recipient, "<this>");
        ApmDescriptor.Phone phone = new ApmDescriptor.Phone(recipient.f323345a);
        A2(new com.revolut.kompot.common.c(new BizumTransferFlow(new BizumTransferInputData(new BizumContact(phone, phone, recipient.f323347c, null, recipient.f, ApmContact.State.ACTIVE.f62099a), transferDirection, new TransferMoneyPocket(null, null, 3))), (Function1) null, 6));
    }
}
