package zje;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$TabPagerItem;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import com.revolut.feature.tab.crypto.models.TabCryptoModalStep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends oki.h implements ski.b, dje.b {
    public final eke.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eke.c f322806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eke.d f322807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f322808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f322809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final usc.a f322810t;
    public final cli.h u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ali.b f322811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f322812x;

    public n(cli.n stateMapper, eke.h flowDelegateProvider, eke.c allAccountsExtensionHolder, eke.d currentAccountExtensionHolder, ImmutableSet accountsExtension, a accountSelectionRelay) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(flowDelegateProvider, "flowDelegateProvider");
        Intrinsics.checkNotNullParameter(allAccountsExtensionHolder, "allAccountsExtensionHolder");
        Intrinsics.checkNotNullParameter(currentAccountExtensionHolder, "currentAccountExtensionHolder");
        Intrinsics.checkNotNullParameter(accountsExtension, "accountsExtension");
        Intrinsics.checkNotNullParameter(accountSelectionRelay, "accountSelectionRelay");
        this.o = flowDelegateProvider;
        this.f322806p = allAccountsExtensionHolder;
        this.f322807q = currentAccountExtensionHolder;
        this.f322808r = accountsExtension;
        this.f322809s = accountSelectionRelay;
        this.f322810t = new usc.a(this, 25);
        Intrinsics.checkNotNullParameter("TabCryptoFlowV2", "keyValue");
        final int i = 0;
        this.u = mra.d.e(this, "TabCryptoFlowV2", new TabCryptoFlowV2Contract$FlowState((List) null, 3), stateMapper, new Function2(this) { // from class: zje.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f322804b;

            {
                this.f322804b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Object next2;
                com.revolut.kompot.navigable.a aVarD2;
                switch (i) {
                    case 0:
                        TabCryptoFlowV2Contract$FlowState restored = (TabCryptoFlowV2Contract$FlowState) obj3;
                        Intrinsics.checkNotNullParameter((TabCryptoFlowV2Contract$FlowState) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(restored, "restored");
                        for (AccountsExtensionContract$AccountsState restoredState : restored.f89812b) {
                            Set set = this.f322804b.f322808r;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it8 = set.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        dje.a aVar = (dje.a) it8.next();
                                        aVar.getClass();
                                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                                        if (aVar.i().getClass().equals(restoredState.getClass())) {
                                            aVar.R(restoredState);
                                        }
                                    }
                                }
                            }
                        }
                        return restored;
                    case 1:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TabCryptoFlowContract$TabPagerItem item = (TabCryptoFlowContract$TabPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        eke.c cVar = this.f322804b.f322806p;
                        String accountId = item.f89793a;
                        eke.b bVar = (eke.b) cVar;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Iterator it9 = bVar.f127031a.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (((dje.a) next).i().a7(accountId)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        dje.a aVar2 = (dje.a) next;
                        if (aVar2 != null) {
                            return aVar2.K0(accountId);
                        }
                        throw new IllegalStateException(j6.a.q("AccountsExtension can't provide controller for provided accountId: ", accountId));
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabCryptoModalStep step = (TabCryptoModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        eke.b bVar2 = (eke.b) this.f322804b.f322806p;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(step, "step");
                        Set set2 = bVar2.f127031a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : set2) {
                            if (obj4 instanceof dje.f) {
                                arrayList.add(obj4);
                            }
                        }
                        Iterator it10 = arrayList.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (((dje.f) next2).P0(step)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        dje.f fVar = (dje.f) next2;
                        if (fVar != null && (aVarD2 = fVar.d2(step)) != null) {
                            return aVarD2;
                        }
                        throw new IllegalStateException("AccountsExtension can't provide controller for provided modal step: " + step);
                }
            }
        }, 8);
        this.v = yhm.j.b(new zh0.b(this, 5));
        final int i2 = 1;
        this.f322811w = md6.s.b(this, new Function2(this) { // from class: zje.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f322804b;

            {
                this.f322804b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Object next2;
                com.revolut.kompot.navigable.a aVarD2;
                switch (i2) {
                    case 0:
                        TabCryptoFlowV2Contract$FlowState restored = (TabCryptoFlowV2Contract$FlowState) obj3;
                        Intrinsics.checkNotNullParameter((TabCryptoFlowV2Contract$FlowState) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(restored, "restored");
                        for (AccountsExtensionContract$AccountsState restoredState : restored.f89812b) {
                            Set set = this.f322804b.f322808r;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it8 = set.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        dje.a aVar = (dje.a) it8.next();
                                        aVar.getClass();
                                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                                        if (aVar.i().getClass().equals(restoredState.getClass())) {
                                            aVar.R(restoredState);
                                        }
                                    }
                                }
                            }
                        }
                        return restored;
                    case 1:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TabCryptoFlowContract$TabPagerItem item = (TabCryptoFlowContract$TabPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        eke.c cVar = this.f322804b.f322806p;
                        String accountId = item.f89793a;
                        eke.b bVar = (eke.b) cVar;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Iterator it9 = bVar.f127031a.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (((dje.a) next).i().a7(accountId)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        dje.a aVar2 = (dje.a) next;
                        if (aVar2 != null) {
                            return aVar2.K0(accountId);
                        }
                        throw new IllegalStateException(j6.a.q("AccountsExtension can't provide controller for provided accountId: ", accountId));
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabCryptoModalStep step = (TabCryptoModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        eke.b bVar2 = (eke.b) this.f322804b.f322806p;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(step, "step");
                        Set set2 = bVar2.f127031a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : set2) {
                            if (obj4 instanceof dje.f) {
                                arrayList.add(obj4);
                            }
                        }
                        Iterator it10 = arrayList.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (((dje.f) next2).P0(step)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        dje.f fVar = (dje.f) next2;
                        if (fVar != null && (aVarD2 = fVar.d2(step)) != null) {
                            return aVarD2;
                        }
                        throw new IllegalStateException("AccountsExtension can't provide controller for provided modal step: " + step);
                }
            }
        });
        final int i3 = 2;
        this.f322812x = hx7.e.a(this, new Function2(this) { // from class: zje.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f322804b;

            {
                this.f322804b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Object next2;
                com.revolut.kompot.navigable.a aVarD2;
                switch (i3) {
                    case 0:
                        TabCryptoFlowV2Contract$FlowState restored = (TabCryptoFlowV2Contract$FlowState) obj3;
                        Intrinsics.checkNotNullParameter((TabCryptoFlowV2Contract$FlowState) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(restored, "restored");
                        for (AccountsExtensionContract$AccountsState restoredState : restored.f89812b) {
                            Set set = this.f322804b.f322808r;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it8 = set.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        dje.a aVar = (dje.a) it8.next();
                                        aVar.getClass();
                                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                                        if (aVar.i().getClass().equals(restoredState.getClass())) {
                                            aVar.R(restoredState);
                                        }
                                    }
                                }
                            }
                        }
                        return restored;
                    case 1:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TabCryptoFlowContract$TabPagerItem item = (TabCryptoFlowContract$TabPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        eke.c cVar = this.f322804b.f322806p;
                        String accountId = item.f89793a;
                        eke.b bVar = (eke.b) cVar;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Iterator it9 = bVar.f127031a.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (((dje.a) next).i().a7(accountId)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        dje.a aVar2 = (dje.a) next;
                        if (aVar2 != null) {
                            return aVar2.K0(accountId);
                        }
                        throw new IllegalStateException(j6.a.q("AccountsExtension can't provide controller for provided accountId: ", accountId));
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabCryptoModalStep step = (TabCryptoModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        eke.b bVar2 = (eke.b) this.f322804b.f322806p;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(step, "step");
                        Set set2 = bVar2.f127031a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : set2) {
                            if (obj4 instanceof dje.f) {
                                arrayList.add(obj4);
                            }
                        }
                        Iterator it10 = arrayList.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (((dje.f) next2).P0(step)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        dje.f fVar = (dje.f) next2;
                        if (fVar != null && (aVarD2 = fVar.d2(step)) != null) {
                            return aVarD2;
                        }
                        throw new IllegalStateException("AccountsExtension can't provide controller for provided modal step: " + step);
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f322811w;
    }

    @Override // yji.l
    public final void I1() {
        ((eke.b) this.f322807q).a(((TabCryptoFlowV2Contract$FlowState) ((j2) this.u.f22677a).getValue()).f89811a.f);
        List list = ((eke.b) this.f322806p).f127032b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((dje.a) it8.next()).v());
        }
        yji.l.a1(this, vkm.q.q(new ag1.k((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 16)), null, null, new m(this, null, 1), 3);
        yji.l.a1(this, this.f322809s.f322791b, null, null, new m(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f322812x;
    }

    @Override // dje.b
    public final void L(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        ((eke.b) this.f322807q).L(clickData);
    }

    @Override // dje.b
    public final void N1(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ((eke.b) this.f322807q).N1(model);
    }

    @Override // dje.b
    public final void Q(AccountSelectionNavBarContentView.b scrollingState) {
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
        ((eke.b) this.f322807q).Q(scrollingState);
    }

    @Override // dje.b
    public final void V1(ux0.s state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((eke.b) this.f322807q).V1(state);
    }

    @Override // dje.b
    public final void W1() {
        ((eke.b) this.f322807q).W1();
    }

    @Override // dje.b
    public final void c1() {
        ((eke.b) this.f322807q).c1();
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // dje.b
    public final void j() {
        ((eke.b) this.f322807q).j();
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof dje.d)) {
            return super.o2(event);
        }
        dje.d dVar = (dje.d) event;
        oki.h.v2(this.f322812x, dVar.f115326b, dVar.f115327c);
        return null;
    }

    @Override // yji.l
    public final void y1(tji.f dialogDisplayer, aii.o eventsDispatcher, aki.c controllersCache, CoroutineDispatcher mainDispatcher, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        super.y1(dialogDisplayer, eventsDispatcher, controllersCache, mainDispatcher, controllerModelExtensions);
        v1((eke.e) this.v.getValue(), null);
    }
}
