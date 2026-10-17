package com.revolut.feature.payments.who_to_transfer.impl.transfer.search;

import au9.b;
import aw0.k9;
import ax9.o;
import cji.d;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import efm.r;
import fu6.t;
import h3a.l;
import h3a.n;
import h3a.p;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import od0.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q3d.c;
import q4a.f;
import q4a.m;
import q97.g3;
import rul.e;
import t4a.g;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements q4a.h {

    @NotNull
    public static final m Companion = new m();
    public final y A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final d C;
    public final d D;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b f80129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f80130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3a.a f80131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f80132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f80133t;
    public final PaymentsSearchScreenContract$InputData u;
    public final n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h3a.a f80134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t4a.a f80135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f80136y;
    public final ry9.d z;

    public a(b paymentsPreferences, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b transferActionsNaviCommandFactory, l itemNavigationCommandFactory, n3a.a contactsPermissionsController, g paymentsSearchScreenProvider, p searchActionsNavigationCommandFactory, PaymentsSearchScreenContract$InputData inputData, n navBarSearchFieldActionButtonsProvider, h3a.a availableFiltersProvider, t4a.a paymentLinkActionItemHandler, e newTransferGridDataProvider, ry9.d sendFromClipboardExtension, t stateMapper) {
        Intrinsics.checkNotNullParameter(paymentsPreferences, "paymentsPreferences");
        Intrinsics.checkNotNullParameter(transferActionsNaviCommandFactory, "transferActionsNaviCommandFactory");
        Intrinsics.checkNotNullParameter(itemNavigationCommandFactory, "itemNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(paymentsSearchScreenProvider, "paymentsSearchScreenProvider");
        Intrinsics.checkNotNullParameter(searchActionsNavigationCommandFactory, "searchActionsNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarSearchFieldActionButtonsProvider, "navBarSearchFieldActionButtonsProvider");
        Intrinsics.checkNotNullParameter(availableFiltersProvider, "availableFiltersProvider");
        Intrinsics.checkNotNullParameter(paymentLinkActionItemHandler, "paymentLinkActionItemHandler");
        Intrinsics.checkNotNullParameter(newTransferGridDataProvider, "newTransferGridDataProvider");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentsPreferences;
        this.f80129p = transferActionsNaviCommandFactory;
        this.f80130q = itemNavigationCommandFactory;
        this.f80131r = contactsPermissionsController;
        this.f80132s = paymentsSearchScreenProvider;
        this.f80133t = searchActionsNavigationCommandFactory;
        this.u = inputData;
        this.v = navBarSearchFieldActionButtonsProvider;
        this.f80134w = availableFiltersProvider;
        this.f80135x = paymentLinkActionItemHandler;
        this.f80136y = newTransferGridDataProvider;
        this.z = sendFromClipboardExtension;
        this.A = mra.d.b(this, new f(true, true, "", inputData.f80126b, new Data(null, null, false, 7, null), true, new k9(null, null, 3), new q4a.g(0), false), stateMapper, null, false, 12);
        this.B = hx7.e.a(this, new pu4.d(this, 25));
        this.C = new d("");
        od0.h hVar = i.Companion;
        WhoToTransferFilter whoToTransferFilter = inputData.f80126b;
        hVar.getClass();
        this.D = new d(od0.h.a(whoToTransferFilter));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (((t4a.c) r6).Z2(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a r6, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a.I2(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a r5, jq9.t r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof q4a.o
            if (r0 == 0) goto L13
            r0 = r7
            q4a.o r0 = (q4a.o) r0
            int r1 = r0.f242113w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242113w = r1
            goto L18
        L13:
            q4a.o r0 = new q4a.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242113w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            h3a.l r7 = r5.f80130q
            com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreenContract$InputData r2 = r5.u
            com.revolut.feature.transfer.core.models.TransferFlowType r4 = r2.f80127c
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel r2 = r2.e
            if (r2 == 0) goto L3f
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r2 = r2.f80045a
            goto L40
        L3f:
            r2 = 0
        L40:
            r0.f242113w = r3
            java.lang.Object r7 = r7.c(r6, r4, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r6.<init>(r7)
            r5.C1(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a.J2(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a, jq9.t, gim.c):java.lang.Object");
    }

    public static String K2(WhoToTransferActionItem whoToTransferActionItem) {
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) {
            return j6.a.l(((WhoToTransferActionItem.AddNewRecipient) whoToTransferActionItem).f80064a.size(), "AddNewRecipient(actionItemsCount=", ")");
        }
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor) {
            return p.a.p("FavoritePaymentVendor(paymentVendorId=", ((WhoToTransferActionItem.FavoritePaymentVendor) whoToTransferActionItem).f80091a.f64079a, ")");
        }
        String strM = o0.f186429a.b(whoToTransferActionItem.getClass()).m();
        return strM == null ? "UnknownWhoToTransferActionItem" : strM;
    }

    @Override // yji.l
    public final void I1() {
        r rVarA = ((n3a.b) this.f80131r).a();
        r rVarA2 = this.o.a();
        this.v.getClass();
        r rVarX = n.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(w.m(rVarA, rVarA2, rVarX)), null, null, new q4a.p(this, continuation, 0), 3);
        r rVarC = this.C.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r rVarDoOnNext = w.y(rVarC, 200L).doOnNext(new c(11, new q4a.l(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        r rVarC2 = this.D.c();
        PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = this.u;
        r rVarX2 = this.f80134w.a(paymentsSearchScreenContract$InputData.f80125a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        r rVarSwitchMap = w.m(rVarDoOnNext, rVarC2, rVarX2).distinctUntilChanged().switchMap(new c(9, new q4a.l(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new q4a.p(this, continuation, 1), 3);
        Set availableFilters = paymentsSearchScreenContract$InputData.f80125a;
        e eVar = this.f80136y;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        yji.l.a1(this, new o(yh5.b.d(((o4a.c) eVar.f257629a).a(availableFilters), new g3(mo3.a.g(((ang.f) eVar.f257630b).j(w4l.h.f294642c), null, new szb.f(27), 1), 15)), 14), null, null, new q4a.p(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
