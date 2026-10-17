package com.revolut.feature.tab.accounts.impl.ui.spaces;

import a0e.o;
import aie.s;
import aie.t;
import aie.u;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesContract$State;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesContract$Step;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import skm.a2;
import vfg.p;
import vge.t3;
import vge.z2;
import vkm.q;
import wa7.m;
import yji.l;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends oki.h implements aie.b {

    @NotNull
    public static final s Companion = new s();
    public final ghe.a A;
    public final TabAccountsMode B;
    public final uge.e C;
    public final d4m.a D;
    public volatile boolean E;
    public volatile boolean F;
    public boolean G;
    public a2 H;
    public final cli.h I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f89637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xge.a f89638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z2 f89639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0 f89640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r70.c f89641t;
    public final p u;
    public final m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final oa7.a f89642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final the.a f89643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fhe.a f89644y;
    public final i4b.f z;

    public i(j mapper, c dragReorderingCoordinator, xge.a accountSpacesInteractor, z2 accountsInteractor, l0 popupDisplayer, r70.c hapticEngine, p hiddenAccountEntryPointItemProvider, m hiddenAccountsInteractor, oa7.a hiddenAccountsActionsExtension, the.a eventDispatcher, fhe.a discoverItemsMapper, i4b.f legalEntityContextProvider, ghe.a spaceContentToAccountProductsPickerMapper, TabAccountsMode mode, uge.e addNewProductDestinationFactory, d4m.a totalWealthInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dragReorderingCoordinator, "dragReorderingCoordinator");
        Intrinsics.checkNotNullParameter(accountSpacesInteractor, "accountSpacesInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(popupDisplayer, "popupDisplayer");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(hiddenAccountEntryPointItemProvider, "hiddenAccountEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        Intrinsics.checkNotNullParameter(discoverItemsMapper, "discoverItemsMapper");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(spaceContentToAccountProductsPickerMapper, "spaceContentToAccountProductsPickerMapper");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(addNewProductDestinationFactory, "addNewProductDestinationFactory");
        Intrinsics.checkNotNullParameter(totalWealthInteractor, "totalWealthInteractor");
        this.o = mapper;
        this.f89637p = dragReorderingCoordinator;
        this.f89638q = accountSpacesInteractor;
        this.f89639r = accountsInteractor;
        this.f89640s = popupDisplayer;
        this.f89641t = hapticEngine;
        this.u = hiddenAccountEntryPointItemProvider;
        this.v = hiddenAccountsInteractor;
        this.f89642w = hiddenAccountsActionsExtension;
        this.f89643x = eventDispatcher;
        this.f89644y = discoverItemsMapper;
        this.z = legalEntityContextProvider;
        this.A = spaceContentToAccountProductsPickerMapper;
        this.B = mode;
        this.C = addNewProductDestinationFactory;
        this.D = totalWealthInteractor;
        AccountSpacesContract$State accountSpacesContract$State = new AccountSpacesContract$State(f0.f322471a);
        String keyValue = mode.f3();
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        this.I = mra.d.e(this, keyValue, accountSpacesContract$State, mapper, null, 24);
        this.J = hx7.e.a(this, new ack.f(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.tab.accounts.impl.ui.spaces.i r9, com.revolut.core.ui_kit.models.popup.PopupMenuItem r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.ui.spaces.i.I2(com.revolut.feature.tab.accounts.impl.ui.spaces.i, com.revolut.core.ui_kit.models.popup.PopupMenuItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ArrayList J2(i iVar, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            List list3 = ((SpaceContentModel) it8.next()).f89558c;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((SubSpaceContentModel) it9.next()).getF());
            }
            arrayList.add(w.u(arrayList2));
        }
        return w.u(arrayList);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, mo3.a.g(((t3) this.f89639r).g(), null, null, 3), null, null, new ad4.c(this, continuation, 15), 3);
        l.a1(this, q.Q(q.q(new a3i.i(new a35.d(this.I.B(new h0() { // from class: aie.b0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((AccountSpacesContract$State) obj2).f89607a;
            }
        }), 6), this, 10)), new t(1, this, continuation)), null, null, new u(2, this, continuation), 3);
        l.a1(this, q.Q(((xge.g) this.f89638q).a(sfe.a.CACHE_ONLY, qfe.i.f245294a), new t(0, this, continuation)), null, null, new u(0, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    public final void K2() {
        a2 a2Var = this.H;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f89640s.a();
        this.G = false;
    }

    public final void L2(Object obj2) throws Throwable {
        if (obj2 instanceof ra7.a) {
            oki.h.v2(this.J, AccountSpacesContract$Step.HiddenAccounts.f89610a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
            return;
        }
        Continuation continuation = null;
        SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel = obj2 instanceof SpaceContentListMapper$ItemParcel ? (SpaceContentListMapper$ItemParcel) obj2 : null;
        if (spaceContentListMapper$ItemParcel == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Unknown item payload: "));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem) {
            ProductAccountDescriptor$Value productAccountDescriptor$Value = ((SpaceContentListMapper$ItemParcel.SubspaceValueItem) spaceContentListMapper$ItemParcel).f89621c;
            this.F = true;
            ((t3) this.f89639r).t(productAccountDescriptor$Value, tge.b.ACCOUNT_PICKER);
            B2();
            return;
        }
        if (spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.PendingItem) {
            n2(new e(this, spaceContentListMapper$ItemParcel, null), new whi.b(6));
            return;
        }
        if (spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.SubspaceHeader) {
            K2();
            n2(new ad4.c(this, spaceContentListMapper$ItemParcel, continuation, 14), new whi.b(6));
        } else {
            if (!(spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductAccountDescriptor$Value productAccountDescriptor$Value2 = ((SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) spaceContentListMapper$ItemParcel).f89616c;
            this.F = true;
            ((t3) this.f89639r).t(productAccountDescriptor$Value2, tge.b.ACCOUNT_PICKER);
            B2();
        }
    }

    @Override // yji.l
    public final void P1() {
        l2(new aie.w(0, this, null), new yi5.b(26));
        K2();
        this.F = false;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.q(new t38.e(((xge.g) this.f89638q).a(sfe.a.RELOAD, qfe.j.f245295a), 24, this.v.k(), new o(this, continuation, 4))), null, new u(1, this, continuation), 3);
        n2(new aie.w(2, this, continuation), new whi.b(6));
        l.b1(this, rd0.e.b(this.f89640s.f256113c), null, new a97.i(2, this, i.class, "onPopupMenuItemClicked", "onPopupMenuItemClicked(Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.I;
    }
}
