package k4a;

import aw0.k9;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends oki.h implements l {

    @NotNull
    public static final n Companion = new n();
    public static final Set D;
    public final i4b.f A;
    public final al9.a B;
    public final y C;
    public final n3a.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3a.l f180884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o4a.c f180885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b f180886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h3a.p f180887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lal.a f180888t;
    public final NewTransferScreenContract$InputData u;
    public final h3a.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final oy1.b f180889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yn3.d f180890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f180891y;
    public final t4a.a z;

    static {
        WhoToTransferActionItem[] elements = {WhoToTransferActionItem.BankRecipient.f80085a, WhoToTransferActionItem.Remittance.f80101a, WhoToTransferActionItem.AddBankRecipient.f80057a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        D = kotlin.collections.d.y0(elements);
    }

    public u(n3a.a contactsPermissionsController, h3a.l itemNavigationCommandFactory, o4a.c availableTransferMethodsProvider, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b transferActionsNaviCommandFactory, h3a.p searchActionsNavigationCommandFactory, lal.a paymentsItemsDataProvider, NewTransferScreenContract$InputData inputData, h3a.n navBarSearchFieldActionButtonsProvider, oy1.b apmNavigationProvider, yn3.d cooldownCheckerInteractor, ang.f userInteractor, t4a.a paymentLinkActionItemHandler, i4b.f legalEntityContextProvider, al9.a payWithPhotoExtension, x stateMapper) {
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(itemNavigationCommandFactory, "itemNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(availableTransferMethodsProvider, "availableTransferMethodsProvider");
        Intrinsics.checkNotNullParameter(transferActionsNaviCommandFactory, "transferActionsNaviCommandFactory");
        Intrinsics.checkNotNullParameter(searchActionsNavigationCommandFactory, "searchActionsNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(paymentsItemsDataProvider, "paymentsItemsDataProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarSearchFieldActionButtonsProvider, "navBarSearchFieldActionButtonsProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(cooldownCheckerInteractor, "cooldownCheckerInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkActionItemHandler, "paymentLinkActionItemHandler");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(payWithPhotoExtension, "payWithPhotoExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = contactsPermissionsController;
        this.f180884p = itemNavigationCommandFactory;
        this.f180885q = availableTransferMethodsProvider;
        this.f180886r = transferActionsNaviCommandFactory;
        this.f180887s = searchActionsNavigationCommandFactory;
        this.f180888t = paymentsItemsDataProvider;
        this.u = inputData;
        this.v = navBarSearchFieldActionButtonsProvider;
        this.f180889w = apmNavigationProvider;
        this.f180890x = cooldownCheckerInteractor;
        this.f180891y = userInteractor;
        this.z = paymentLinkActionItemHandler;
        this.A = legalEntityContextProvider;
        this.B = payWithPhotoExtension;
        this.C = mra.d.b(this, new k(new Data(null, null, false, 7, null), true, h0.f322473a, new k9(null, null, 3), false, null, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final void I2(u uVar, dx1.h hVar) {
        uVar.C1(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(uVar.f180889w.d(hVar), yhi.b.SOLID, (Integer) 1, 8))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(k4a.u r5, jq9.t r6, gim.c r7) {
        /*
            com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData r0 = r5.u
            boolean r1 = r7 instanceof k4a.q
            if (r1 == 0) goto L15
            r1 = r7
            k4a.q r1 = (k4a.q) r1
            int r2 = r1.f180881w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f180881w = r2
            goto L1a
        L15:
            k4a.q r1 = new k4a.q
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f180881w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            h3a.l r7 = r5.f180884p
            g3a.e r3 = r0.d
            com.revolut.feature.transfer.core.models.TransferFlowType r3 = g3a.g.a(r3)
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel r0 = r0.f80120b
            if (r0 == 0) goto L43
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r0 = r0.f80045a
            goto L44
        L43:
            r0 = 0
        L44:
            r1.f180881w = r4
            java.lang.Object r7 = r7.c(r6, r3, r0, r1)
            if (r7 != r2) goto L4d
            return r2
        L4d:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r6.<init>(r7)
            r5.C1(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k4a.u.J2(k4a.u, jq9.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(k4a.u r5, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof k4a.r
            if (r0 == 0) goto L13
            r0 = r7
            k4a.r r0 = (k4a.r) r0
            int r1 = r0.f180882w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180882w = r1
            goto L18
        L13:
            k4a.r r0 = new k4a.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180882w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b r7 = r5.f180886r
            com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData r2 = r5.u
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel r4 = r2.f80120b
            g3a.e r2 = r2.d
            r0.f180882w = r3
            java.lang.Object r7 = r7.a(r6, r4, r2, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            if (r7 == 0) goto L52
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r6.<init>(r7)
            aii.n r5 = r5.C1(r6)
            if (r5 != 0) goto L65
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Item is not supported"
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r7, r0, r0, r5, r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L65:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k4a.u.K2(k4a.u, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.v.getClass();
        efm.r rVarX = h3a.n.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarA = ((n3a.b) this.o).a();
        NewTransferScreenContract$InputData newTransferScreenContract$InputData = this.u;
        efm.r rVarP = ue0.e.p(this.f180888t.y(newTransferScreenContract$InputData.f80119a), h0.f322473a);
        efm.r rVarX2 = this.f180891y.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        Continuation continuation = null;
        yji.l.a1(this, new t38.e(rd0.e.b(te0.w.n(rVarX, rVarA, rVarP, rVarX2)), 24, this.f180885q.a(newTransferScreenContract$InputData.f80119a), new hwi.b(3, 18, continuation)), null, null, new o(this, continuation, 1), 3);
        yji.l.a1(this, this.A.j(null), null, null, new o(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
