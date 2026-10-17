package td2;

import c12.y;
import c12.z;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreen;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import hrf.f;
import hy1.b0;
import hy1.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rv6.e;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0 f269917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f269918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final od2.a f269919n;

    public d(j0 spinContactsProvider, b navigationProvider, od2.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(spinContactsProvider, "spinContactsProvider");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f269917l = spinContactsProvider;
        this.f269918m = navigationProvider;
        this.f269919n = apmNavigationProvider;
    }

    @Override // c12.z
    public final void X(y params) {
        Intrinsics.checkNotNullParameter(params, "params");
        A2(new com.revolut.kompot.common.b(o2(this.f269918m.a(params.f20358a)), (ModalDestination.Style) null, 6));
    }

    @Override // c12.z
    public final void d(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item, "SETTINGS_MENU_ITEM_ID")) {
            A2(new com.revolut.kompot.common.b(new SpinSettingsScreen(), (ModalDestination.Style) null, 6));
        }
    }

    @Override // c12.z
    public final void e1(ApmRecipient recipient, f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        TransferMoneyPocket transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
        A2(((pd2.f) this.f269919n).m((SpinContact) recipient, transferDirection, transferMoneyPocket));
    }

    @Override // c12.z
    public final Flow g2(f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new e((b0) this.f269917l.a(null), 13);
    }

    @Override // c12.z
    public final n02.b l1() {
        return n02.b.SPIN;
    }

    @Override // c12.z
    public final void y0(f transferDirection, zm3.f recipient) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
    }
}
