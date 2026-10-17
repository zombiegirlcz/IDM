package qje;

import bke.y;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$ModalStep;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$TabPagerItem;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends oki.h implements l {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eke.h f246852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f246853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f246854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.h f246855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f246856t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f246857w;

    public u(cli.n stateMapper, y accountDelegateProvider, eke.h flowDelegateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountDelegateProvider, "accountDelegateProvider");
        Intrinsics.checkNotNullParameter(flowDelegateProvider, "flowDelegateProvider");
        this.o = accountDelegateProvider;
        this.f246852p = flowDelegateProvider;
        this.f246853q = new t(this, 1);
        this.f246854r = new t(this, 0);
        Intrinsics.checkNotNullParameter("TabCryptoFlow", "keyValue");
        this.f246855s = mra.d.e(this, "TabCryptoFlow", new TabCryptoFlowContract$FlowState((ake.a) null, 3), stateMapper, null, 24);
        final int i = 0;
        this.f246856t = md6.s.b(this, new Function2(this) { // from class: qje.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f246847b;

            {
                this.f246847b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TabCryptoFlowContract$TabPagerItem it8 = (TabCryptoFlowContract$TabPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f246847b.I2().f3();
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabCryptoFlowContract$ModalStep step = (TabCryptoFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        return this.f246847b.I2().e3(step);
                }
            }
        });
        final int i2 = 1;
        this.u = hx7.e.a(this, new Function2(this) { // from class: qje.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f246847b;

            {
                this.f246847b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TabCryptoFlowContract$TabPagerItem it8 = (TabCryptoFlowContract$TabPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f246847b.I2().f3();
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabCryptoFlowContract$ModalStep step = (TabCryptoFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        return this.f246847b.I2().e3(step);
                }
            }
        });
        final int i3 = 0;
        this.v = yhm.j.b(new Function0(this) { // from class: qje.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f246849b;

            {
                this.f246849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        u uVar = this.f246849b;
                        eke.h hVar = uVar.f246852p;
                        t stateUpdater = uVar.f246853q;
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(stateUpdater, "stateUpdater");
                        return new eke.g(stateUpdater, hVar.f127039a, hVar.f127040b, hVar.f127041c, hVar.d);
                    default:
                        u uVar2 = this.f246849b;
                        return uVar2.o.a(uVar2.f246854r, new s(2, 0, u.class, uVar2, "openModal", "openModal(Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep;Lcom/revolut/kompot/common/ModalDestination$Style;)V"));
                }
            }
        });
        final int i5 = 1;
        this.f246857w = yhm.j.b(new Function0(this) { // from class: qje.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f246849b;

            {
                this.f246849b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        u uVar = this.f246849b;
                        eke.h hVar = uVar.f246852p;
                        t stateUpdater = uVar.f246853q;
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(stateUpdater, "stateUpdater");
                        return new eke.g(stateUpdater, hVar.f127039a, hVar.f127040b, hVar.f127041c, hVar.d);
                    default:
                        u uVar2 = this.f246849b;
                        return uVar2.o.a(uVar2.f246854r, new s(2, 0, u.class, uVar2, "openModal", "openModal(Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep;Lcom/revolut/kompot/common/ModalDestination$Style;)V"));
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f246856t;
    }

    public final bke.a I2() {
        return (bke.a) this.f246857w.getValue();
    }

    public final eke.e J2() {
        return (eke.e) this.v.getValue();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f246855s;
    }

    @Override // yji.l
    public final void y1(tji.f dialogDisplayer, aii.o eventsDispatcher, aki.c controllersCache, CoroutineDispatcher mainDispatcher, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        super.y1(dialogDisplayer, eventsDispatcher, controllersCache, mainDispatcher, controllerModelExtensions);
        v1(J2(), null);
        v1(I2(), null);
    }
}
