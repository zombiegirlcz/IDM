package gu1;

import c12.y;
import c12.z;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import fnc.s;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends yji.n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hy1.p f146680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f146681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wt1.a f146682n;

    public r(hy1.p blikContactsProvider, s blikNewContactNavigationProvider, wt1.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(blikContactsProvider, "blikContactsProvider");
        Intrinsics.checkNotNullParameter(blikNewContactNavigationProvider, "blikNewContactNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f146680l = blikContactsProvider;
        this.f146681m = blikNewContactNavigationProvider;
        this.f146682n = apmNavigationProvider;
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(this.f146681m.h(params.f20358a)), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        A2(new com.revolut.kompot.common.b(o2(this.f146682n.g((BlikContact) recipient, transferDirection, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new exe.j((g0c.e) this.f146680l.a(null), 9);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.BLIK;
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        IllegalStateException illegalStateException = new IllegalStateException("onContactRecipient action not supported in BLIK");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }
}
