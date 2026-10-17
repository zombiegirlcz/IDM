package mc2;

import c12.y;
import c12.z;
import com.revolut.feature.apm.core.api.ApmToggles$Qvik;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.qvik.impl.ui.new_recipient.QvikNewRecipientFlow;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import hy1.b0;
import hy1.g0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.v;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends yji.n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ky1.c f204259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cc2.a f204260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f204261n;
    public final gte.a o;

    public k(ky1.c contactsProvider, cc2.a apmNavigationProvider, g newContactNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(contactsProvider, "contactsProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f204259l = contactsProvider;
        this.f204260m = apmNavigationProvider;
        this.f204261n = newContactNavigationProvider;
        this.o = featureToggleInteractor;
    }

    @Override // c12.z
    public final void X(y params) {
        hrf.f fVar = params.f20359b;
        Intrinsics.checkNotNullParameter(params, "params");
        if (((jte.d) this.o).c(ApmToggles$Qvik.f61802c) && fVar == hrf.f.INCOMING) {
            A2(new com.revolut.kompot.common.b(new QvikNewRecipientFlow(new sc2.c(fVar)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
        } else {
            A2(new com.revolut.kompot.common.b(o2(this.f204261n.a(fVar, false, params.f20358a)), (ModalDestination.Style) null, 6));
        }
    }

    @Override // c12.z
    public final void d(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        A2(new com.revolut.kompot.common.b(new QvikSettingsScreen(), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        A2(new com.revolut.kompot.common.b(o2(this.f204260m.g((QvikContact) recipient, transferDirection, new TransferMoneyPocket(null, null, 3))), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final Flow g2(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new v((b0) ((g0) this.f204259l).a(null), transferDirection, 11);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.QVIK;
    }

    @Override // c12.z
    public final void y0(hrf.f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        IllegalStateException illegalStateException = new IllegalStateException("onContactRecipient action not supported in QVIK");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }
}
