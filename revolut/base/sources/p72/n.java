package p72;

import c12.z;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import hy1.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends yji.n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f233535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f233536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v62.a f233537n;

    public n(y multibancoContactsProvider, d0 newContactNavigationProvider, v62.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(multibancoContactsProvider, "multibancoContactsProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f233535l = multibancoContactsProvider;
        this.f233536m = newContactNavigationProvider;
        this.f233537n = apmNavigationProvider;
    }

    @Override // c12.z
    public final void X(c12.y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(this.f233536m.c(params.f20359b, params.f20358a)), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        A2(new com.revolut.kompot.common.b(o2(this.f233537n.g((MultibancoContact) recipient, transferDirection, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new njj.l((g0c.e) this.f233535l.a(null), 11);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.MBWAY;
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        IllegalStateException illegalStateException = new IllegalStateException("onContactRecipient action not supported in MB");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }
}
