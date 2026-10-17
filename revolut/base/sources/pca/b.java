package pca;

import ax9.o;
import c12.y;
import c12.z;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.kompot.common.ModalDestination;
import hy1.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pb2.v;
import sl3.k;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f234835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fl3.a f234836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lca.f f234837n;

    public b(c0 pixContactsProvider, fl3.a contactsRepository, lca.f pixApmTransferExtension) {
        Intrinsics.checkNotNullParameter(pixContactsProvider, "pixContactsProvider");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(pixApmTransferExtension, "pixApmTransferExtension");
        this.f234835l = pixContactsProvider;
        this.f234836m = contactsRepository;
        this.f234837n = pixApmTransferExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f234837n, null);
    }

    @Override // c12.z
    public final void W0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(new com.revolut.feature.pix.api.navigation.a(new PixTransferNavigation$InputData.NewContact(params.f20358a))), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f234837n.Z2(new PixTransferNavigation$InputData.ApmTransfer((PixContact) recipient, transferDirection, 4), new v(this, 4));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new o(yh5.b.d(this.f234835l.a(null), rd0.e.b(((k) this.f234836m).g())), 10);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.PIX;
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        A2(new com.revolut.kompot.common.b(o2(new com.revolut.feature.pix.api.navigation.a(new PixTransferNavigation$InputData.NewContact(recipient.f323345a))), (ModalDestination.Style) null, 6));
    }
}
