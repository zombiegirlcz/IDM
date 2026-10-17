package eke;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$TabPagerItem;
import com.revolut.kompot.common.ModalDestination;
import dy0.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zje.b f127035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kbb.c f127036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final utk.f f127037n;
    public final j40.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f127038p;

    public g(zje.b stateUpdater, kbb.c headerUiParamsProvider, utk.f profileNotificationInteractor, j40.a assistantModelExtension, q userRegisteredIdentitiesInteractor) {
        Intrinsics.checkNotNullParameter(stateUpdater, "stateUpdater");
        Intrinsics.checkNotNullParameter(headerUiParamsProvider, "headerUiParamsProvider");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f127035l = stateUpdater;
        this.f127036m = headerUiParamsProvider;
        this.f127037n = profileNotificationInteractor;
        this.o = assistantModelExtension;
        this.f127038p = userRegisteredIdentitiesInteractor;
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, vkm.q.q(this.f127036m.P()), null, new f(this, null, 0), 3);
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, this.f127037n.d(), null, new a2g.q(this, (Continuation) null, 15), 3);
        n.l2(this, this.o.Z2(), null, new f(this, null, 1), 3);
    }

    @Override // eke.e
    public final void Z2() {
        A2(new MainContainerScreenDestination.Slide(o.RIGHT, false));
    }

    @Override // eke.e
    public final void b3() {
        if (this.f127038p.E()) {
            n.P2(this, o2(h9b.a.f150222a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }

    @Override // eke.e
    public final void c3(NavBarMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.o.b3(message);
    }

    @Override // eke.e
    public final void d3(NavBarMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.o.c3(message);
    }

    @Override // eke.e
    public final void e3(TabCryptoFlowContract$TabPagerItem pagerItem) {
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        this.f127035l.c(new ei8.d(pagerItem, 10));
    }
}
