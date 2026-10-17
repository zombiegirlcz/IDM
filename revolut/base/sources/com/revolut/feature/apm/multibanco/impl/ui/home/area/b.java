package com.revolut.feature.apm.multibanco.impl.ui.home.area;

import a82.c;
import a82.f;
import a82.k;
import a82.m;
import a82.o;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoViaVerdeDestination;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import h93.f0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import oki.h;
import om4.d0;
import p72.p;
import ry9.d;
import te0.w;
import vkm.q;
import vkm.z1;
import vz1.j;
import yji.l;
import z72.e;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements f {
    public final y A;
    public final z1 B;
    public final MultibancoHomeAreaContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f62602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m72.a f62603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f62604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f62605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h12.a f62606t;
    public final pn3.a u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e12.f f62607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y62.b f62608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f62609y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(MultibancoHomeAreaContract$InputData inputData, e areaProvider, m72.a sdkInteractor, d0 newContactNavigationProvider, p recipientListNavigationProvider, h12.a apmAreaHandler, pn3.a contactsPermissionsController, j apmPreferencesRepository, e12.f apmTransactionAreaListExtension, y62.b withdrawalExtension, d sendFromClipboardExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(areaProvider, "areaProvider");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(withdrawalExtension, "withdrawalExtension");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62602p = areaProvider;
        this.f62603q = sdkInteractor;
        this.f62604r = newContactNavigationProvider;
        this.f62605s = recipientListNavigationProvider;
        this.f62606t = apmAreaHandler;
        this.u = contactsPermissionsController;
        this.v = apmPreferencesRepository;
        this.f62607w = apmTransactionAreaListExtension;
        this.f62608x = withdrawalExtension;
        this.f62609y = sendFromClipboardExtension;
        this.z = hx7.e.a(this, new a09.b(this, 22));
        this.A = mra.d.b(this, new c(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.B = z1VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.multibanco.impl.ui.home.area.b r5, gim.c r6) throws com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError {
        /*
            boolean r0 = r6 instanceof a82.w
            if (r0 == 0) goto L13
            r0 = r6
            a82.w r0 = (a82.w) r0
            int r1 = r0.f2027w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2027w = r1
            goto L18
        L13:
            a82.w r0 = new a82.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2027w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            m72.a r6 = r5.f62603q
            m72.k r6 = (m72.k) r6
            vkm.j2 r6 = r6.f203297g
            vkm.u1 r6 = vkm.q.h(r6)
            a82.v r2 = new a82.v
            r4 = 0
            r2.<init>(r6, r4)
            r0.f2027w = r3
            java.lang.Object r6 = vkm.q.x(r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            z92.j r6 = (z92.j) r6
            boolean r0 = r6 instanceof z92.i
            if (r0 == 0) goto L63
            com.revolut.kompot.navigable.vc.modal.a r5 = r5.z
            com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep$PayFlow r6 = com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep.PayFlow.f62597a
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r5, r6, r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L63:
            boolean r5 = r6 instanceof z92.h
            if (r5 != 0) goto L78
            if (r6 != 0) goto L72
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable r5 = new com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable
            java.lang.String r6 = "AREA"
            r0 = 0
            r5.<init>(r6, r0)
            throw r5
        L72:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L78:
            z92.h r6 = (z92.h) r6
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError r5 = r6.f320305a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(com.revolut.feature.apm.multibanco.impl.ui.home.area.b, gim.c):java.lang.Object");
    }

    public static void J2(Object obj2) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "MultibancoArea: handling not supported: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(w.l(((pn3.b) this.u).b(), this.v.a(n02.b.MBWAY))), null, null, new o(0, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final void K2(a82.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = k.f2008a[action.ordinal()];
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.z;
        Continuation continuation = null;
        switch (i) {
            case 1:
                h.v2(aVar, new MultibancoHomeAreaContract$ModalStep.RecipientList(hrf.f.OUTGOING), popup);
                return;
            case 2:
                h.v2(aVar, new MultibancoHomeAreaContract$ModalStep.RecipientList(hrf.f.INCOMING), popup);
                return;
            case 3:
                h.v2(aVar, MultibancoHomeAreaContract$ModalStep.AddNewContact.f62596a, popup);
                return;
            case 4:
                h.v2(aVar, MultibancoHomeAreaContract$ModalStep.WithdrawalFlow.f62600a, popup);
                return;
            case 5:
                l2(new m(1, this, continuation), new yi5.b(26));
                return;
            case 6:
                C1(new PayBillsAndTaxesDestination(new PayBillsAndTaxesNavigation$InputData((String) null, 3)));
                return;
            case 7:
                C1(MultibancoViaVerdeDestination.f62553b);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void L2(Object obj2) {
        BridgeDestination bridgeDestinationA = ((u12.a) this.f62606t).a(obj2);
        if (bridgeDestinationA != null) {
            C1(bridgeDestinationA);
            return;
        }
        if (obj2 instanceof f0) {
            C1(new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((f0) obj2).f150110a, 6, false, false), null, 47));
            return;
        }
        if (obj2 instanceof a82.a) {
            K2((a82.a) obj2);
            return;
        }
        if (obj2 instanceof ty9.a) {
            this.f62609y.Z2();
        } else {
            if (!(obj2 instanceof MultibancoWithdrawalCode)) {
                J2(obj2);
                return;
            }
            h.v2(this.z, new MultibancoHomeAreaContract$ModalStep.WithdrawalDetails((MultibancoWithdrawalCode) obj2), ModalDestination.Style.POPUP.f98311a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        oki.h.v2(r2.z, com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep.WithdrawalList.f62601a, com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r3.equals("MultibancoAreaWithdrawalsMapper_header") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r3.equals("MultibancoAreaWithdrawalsMapper_event") == false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M2(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1341304868: goto L3f;
                case -1254901926: goto L29;
                case 579105963: goto L16;
                case 842474140: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L47
        Ld:
            java.lang.String r0 = "MultibancoAreaWithdrawalsMapper_header"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1f
            goto L47
        L16:
            java.lang.String r0 = "MultibancoAreaWithdrawalsMapper_event"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1f
            goto L47
        L1f:
            com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep$WithdrawalList r3 = com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep.WithdrawalList.f62601a
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            com.revolut.kompot.navigable.vc.modal.a r1 = r2.z
            oki.h.v2(r1, r3, r0)
            return
        L29:
            java.lang.String r0 = "ApmAreaContactsMapper_event"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L32
            goto L47
        L32:
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination$PaymentsSearch r3 = new com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination$PaymentsSearch
            com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter$ApmMultibanco r0 = com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter.ApmMultibanco.f79990a
            r1 = 29
            r3.<init>(r0, r1)
            r2.C1(r3)
            return
        L3f:
            java.lang.String r0 = "ApmAreaTransactionsMapper_event"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4b
        L47:
            J2(r3)
            return
        L4b:
            r2.N2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.multibanco.impl.ui.home.area.b.M2(java.lang.String):void");
    }

    public final void N2() {
        C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.f62607w)), (ModalDestination.Style) null, 6));
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.u).e();
        Continuation continuation = null;
        l.b1(this, q.Q(this.B, new a82.p(0, this, continuation)), null, new o(1, this, continuation), 3);
        a2g.a func = new a2g.a(this, 5);
        y62.b bVar = this.f62608x;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(func, "func");
        Job job2 = bVar.f311119m;
        if (job2 != null) {
            job2.f(null);
        }
        bVar.f311119m = (Job) func.invoke();
    }

    @Override // cli.z
    public final g getState() {
        return this.A;
    }
}
