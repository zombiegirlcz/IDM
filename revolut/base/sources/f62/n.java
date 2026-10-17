package f62;

import c12.y;
import c12.z;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import hy1.v;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends yji.n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ApmPaymentProfile f132391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f132392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r52.a f132393n;
    public final f o;

    public n(ApmPaymentProfile paymentProfile, v irisContactsProvider, r52.a apmNavigationProvider, f newContactNavigationProvider) {
        Intrinsics.checkNotNullParameter(paymentProfile, "paymentProfile");
        Intrinsics.checkNotNullParameter(irisContactsProvider, "irisContactsProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        this.f132391l = paymentProfile;
        this.f132392m = irisContactsProvider;
        this.f132393n = apmNavigationProvider;
        this.o = newContactNavigationProvider;
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(this.o.a(params.f20358a)), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        ApmPaymentProfile apmPaymentProfile = this.f132391l;
        TransferMoneyPocket transferMoneyPocketB = t52.b.b(apmPaymentProfile);
        A2(new com.revolut.kompot.common.b(o2(((w52.f) this.f132393n).o((IrisContact) recipient, transferDirection, transferMoneyPocketB, apmPaymentProfile)), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new exe.j((g0c.e) this.f132392m.a(null), 2);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.IRIS;
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        IllegalStateException illegalStateException = new IllegalStateException("onContactRecipient action not supported in IRIS");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }
}
