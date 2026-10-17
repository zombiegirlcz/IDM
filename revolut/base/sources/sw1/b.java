package sw1;

import ax9.o;
import c12.y;
import c12.z;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import g12.k;
import hrf.f;
import hy1.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bv1.a f266069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f266070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fl3.a f266071n;
    public final rv1.z o;

    public b(bv1.a apmNavigationProvider, s brebContactsProvider, fl3.a contactsRepository, rv1.z qrHandler) {
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(brebContactsProvider, "brebContactsProvider");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        this.f266069l = apmNavigationProvider;
        this.f266070m = brebContactsProvider;
        this.f266071n = contactsRepository;
        this.o = qrHandler;
    }

    @Override // c12.z
    public final void W0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (Intrinsics.f(actionId, "QR_SEARCH_FIELD_ACTION_ID")) {
            ViewController viewControllerO2 = o2(new k(new QrScannerInputData(), this.o));
            sl5.a block = new sl5.a(this, 26);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerO2.H = block;
            A2(new com.revolut.kompot.common.b(viewControllerO2, (ModalDestination.Style) null, 6));
        }
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(new com.revolut.feature.apm.breb.api.navigation.a(new BrebTransferNavigation$InputData.NewContact(params.f20358a))), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        TransferMoneyPocket transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
        A2(((com.revolut.feature.apm.breb.impl.a) this.f266069l).m((BrebContact) recipient, transferDirection, transferMoneyPocket));
    }

    @Override // c12.z
    public final Flow g2(f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new o(yh5.b.d(this.f266070m.a(null), e.b(((sl3.k) this.f266071n).g())), 13);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.BREB;
    }

    @Override // c12.z
    public final void y0(f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        String phoneNumber = recipient.f323345a;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        A2(new com.revolut.kompot.common.b(o2(new com.revolut.feature.apm.breb.api.navigation.a(new BrebTransferNavigation$InputData.NewContact(d0.e0(phoneNumber, "+57")))), (ModalDestination.Style) null, 6));
    }
}
