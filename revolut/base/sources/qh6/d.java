package qh6;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.external_accounts.api.CrossBorderOpenBankingApi$Toggles;
import com.revolut.feature.external_accounts.api.ExternalAccountsApi$FeatureToggle;
import com.revolut.feature.external_accounts.api.navigation.AkahuDestination;
import com.revolut.feature.external_accounts.api.navigation.IndiaNetBankingDestination;
import com.revolut.feature.external_accounts.api.navigation.IndiaUpiDestination;
import com.revolut.feature.external_accounts.api.navigation.LinkSuccessDestination;
import com.revolut.feature.external_accounts.api.navigation.PseDestination;
import com.revolut.feature.external_accounts.api.navigation.SelectAccountToLinkDestination;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlow;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.navigation.CrossBorderLinkAccountDestination;
import com.revolut.feature.external_accounts.impl.navigation.EasyBankTransferDestination;
import com.revolut.feature.external_accounts.impl.navigation.LinkAccountDestination;
import com.revolut.feature.external_accounts.impl.navigation.UsPlaidLinkAccountDestination;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.BrazilInboundMandateConfirmationFlow;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.BrazilInboundOpenbankingFlow;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.PseTopupFlow;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.PseTopupFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.early_credit.EarlyCreditScreen;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlow;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.LinkExternalAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.LinkExternalAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlow;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlow;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.JapanEasyBankAuthorizationFlow;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.JapanEasyBankAuthorizationFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlow;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlow;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.link.instructions.InstructionsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlow;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.accounts_to_link.AccountsToLinkScreen;
import com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.AkahuFlow;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlow;
import edk.f;
import java.util.List;
import java.util.Set;
import ke6.f0;
import kotlin.jvm.internal.Intrinsics;
import we6.b0;
import we6.j;
import we6.l0;
import we6.r;
import we6.s;
import we6.t0;
import we6.w;
import we6.x;
import we6.x0;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f246488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do6.b f246489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f246490c;
    public final f0 d;
    public final f e;

    public d(f80.a uriHelper, do6.b customLinkResultDestinationStorage, com.revolut.feature.external_accounts.api.navigation.a navigationFactory, f0 storedMethodAuthTopupDeeplinkActionPerformer, f pseColombiaDeeplinkActionPerformer) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(customLinkResultDestinationStorage, "customLinkResultDestinationStorage");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(storedMethodAuthTopupDeeplinkActionPerformer, "storedMethodAuthTopupDeeplinkActionPerformer");
        Intrinsics.checkNotNullParameter(pseColombiaDeeplinkActionPerformer, "pseColombiaDeeplinkActionPerformer");
        this.f246488a = uriHelper;
        this.f246489b = customLinkResultDestinationStorage;
        this.f246490c = navigationFactory;
        this.d = storedMethodAuthTopupDeeplinkActionPerformer;
        this.e = pseColombiaDeeplinkActionPerformer;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof we6.f0) {
            we6.f0 f0Var = (we6.f0) descriptor;
            return f0Var.a(new InstructionsScreen(new gn6.e(f0Var.c(), f0Var.b(), f0Var.d())));
        }
        if (descriptor instanceof s) {
            s sVar = (s) descriptor;
            return sVar.a(new EarlyCreditScreen(new cm6.e(sVar.c(), sVar.b())));
        }
        if (descriptor instanceof t0) {
            t0 t0Var = (t0) descriptor;
            return t0Var.a(new PennyTopUpFlow(new PennyTopUpFlowContract$InputData(t0Var.b(), t0Var.f(), t0Var.g(), t0Var.e(), t0Var.c(), t0Var.d())));
        }
        if (descriptor instanceof w) {
            w wVar = (w) descriptor;
            return wVar.a(new EasyBankTransferFlow(new EasyBankTransferFlowContract$InputData(wVar.b(), wVar.f(), zm6.a.d(), wVar.c(), wVar.e(), wVar.d())));
        }
        if (descriptor instanceof com.revolut.feature.external_accounts.api.navigation.b) {
            com.revolut.feature.external_accounts.api.navigation.b bVar = (com.revolut.feature.external_accounts.api.navigation.b) descriptor;
            return bVar.a(new JapanEasyBankTransferFlow(new JapanEasyBankTransferFlowContract$InputData(bVar.b())));
        }
        if (descriptor instanceof l0) {
            l0 l0Var = (l0) descriptor;
            return l0Var.a(new JapanEasyBankAuthorizationFlow(new JapanEasyBankAuthorizationFlowContract$InputData(l0Var.c(), l0Var.b(), l0Var.d())));
        }
        if (descriptor instanceof r) {
            r rVar = (r) descriptor;
            return rVar.a(new CrossBorderEasyBankTransferFlow(new CrossBorderEasyBankTransferFlowContract$InputData(rVar.b(), rVar.f(), rVar.e(), rVar.c(), rVar.d())));
        }
        if (descriptor instanceof x0) {
            x0 x0Var = (x0) descriptor;
            return x0Var.a(new PseTopupFlow(new PseTopupFlowContract$InputData(x0Var.b(), x0Var.c(), null, null)));
        }
        if (descriptor instanceof j) {
            j jVar = (j) descriptor;
            return jVar.a(new BrazilInboundOpenbankingFlow(jVar.b()));
        }
        if (descriptor instanceof we6.e) {
            we6.e eVar = (we6.e) descriptor;
            return eVar.a(new BrazilInboundMandateConfirmationFlow(eVar.b()));
        }
        if (descriptor instanceof x) {
            x xVar = (x) descriptor;
            return xVar.a(new IndiaNetBankingFlow(new IndiaNetBankingFlowContract$InputData(xVar.b(), xVar.e(), null, xVar.c(), xVar.d())));
        }
        if (descriptor instanceof b0) {
            b0 b0Var = (b0) descriptor;
            return b0Var.a(new UpiTransferFlow(new UpiTransferFlowContract$InputData(b0Var.b(), b0Var.e(), null, b0Var.c(), b0Var.d())));
        }
        if (!(descriptor instanceof com.revolut.feature.external_accounts.api.navigation.c)) {
            return null;
        }
        com.revolut.feature.external_accounts.api.navigation.c cVar = (com.revolut.feature.external_accounts.api.navigation.c) descriptor;
        return cVar.a(new LinkExternalAccountFlow(new LinkExternalAccountFlowContract$InputData(cVar.c(), cVar.b(), false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r17, kotlin.coroutines.Continuation r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof qh6.c
            if (r2 == 0) goto L17
            r2 = r1
            qh6.c r2 = (qh6.c) r2
            int r3 = r2.f246487w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f246487w = r3
            goto L1e
        L17:
            qh6.c r2 = new qh6.c
            gim.c r1 = (gim.c) r1
            r2.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f246487w
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            yhm.o.b(r1)
            goto L6c
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r1)
            r1 = r17
            boolean r1 = r1 instanceof qh6.a
            if (r1 == 0) goto L78
            com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$TrueLayer r6 = new com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$TrueLayer
            r14 = 0
            r15 = 16381(0x3ffd, float:2.2955E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$DirectLink r7 = new com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$DirectLink
            java.lang.Integer r8 = new java.lang.Integer
            r1 = 1337(0x539, float:1.874E-42)
            r8.<init>(r1)
            r13 = 126(0x7e, float:1.77E-43)
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.revolut.feature.external_accounts.api.navigation.a r1 = r0.f246490c
            ym6.d r1 = (ym6.d) r1
            ufm.i r1 = r1.b(r6, r7, r5)
            r2.f246487w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L6c
            return r3
        L6c:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.revolut.retail.core.navigation.NaviCommand r1 = (com.revolut.retail.core.navigation.NaviCommand) r1
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.b(r1)
            return r1
        L78:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qh6.d.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(CrossBorderOpenBankingApi$Toggles.a(), ExternalAccountsApi$FeatureToggle.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CrossBorderLinkAccountDestination) {
            return gc0.c.b(new CrossBorderLinkAccountFlow(((CrossBorderLinkAccountDestination) destination).getF72481a()), new b(destination, this, 0));
        }
        if (destination instanceof LinkAccountDestination) {
            return gc0.c.b(new LinkAccountFlow(((LinkAccountDestination) destination).getF72483a()), new b(destination, this, 1));
        }
        if (destination instanceof EasyBankTransferDestination) {
            return new EasyBankTransferFlow(((EasyBankTransferDestination) destination).getF72482a());
        }
        if (destination instanceof UsPlaidLinkAccountDestination) {
            return gc0.c.b(new UsPlaidFlow(((UsPlaidLinkAccountDestination) destination).getF72484a()), new ogk.b(16));
        }
        if (destination instanceof SelectAccountToLinkDestination) {
            return new AccountsToLinkScreen(new pn6.g(((SelectAccountToLinkDestination) destination).getF72358a()));
        }
        if (destination instanceof LinkSuccessDestination) {
            LinkSuccessDestination linkSuccessDestination = (LinkSuccessDestination) destination;
            return new LinkResultFlow(new LinkResultFlowContract$InputData(linkSuccessDestination.getF72333a(), linkSuccessDestination.getF72334b(), linkSuccessDestination.getF72335c(), linkSuccessDestination.getD(), this.f246489b.b()));
        }
        if (destination instanceof IndiaUpiDestination) {
            IndiaUpiDestination indiaUpiDestination = (IndiaUpiDestination) destination;
            return new UpiTransferFlow(new UpiTransferFlowContract$InputData(indiaUpiDestination.getF72328a(), indiaUpiDestination.getF72329b(), indiaUpiDestination.getF72330c(), indiaUpiDestination.getD(), indiaUpiDestination.getE()));
        }
        if (destination instanceof PseDestination) {
            PseDestination pseDestination = (PseDestination) destination;
            return new PseTopupFlow(new PseTopupFlowContract$InputData(pseDestination.getF72353a(), pseDestination.getF72354b(), pseDestination.getF72355c(), pseDestination.getD()));
        }
        if (destination instanceof IndiaNetBankingDestination) {
            IndiaNetBankingDestination indiaNetBankingDestination = (IndiaNetBankingDestination) destination;
            return new IndiaNetBankingFlow(new IndiaNetBankingFlowContract$InputData(indiaNetBankingDestination.getF72325a(), indiaNetBankingDestination.getF72326b(), indiaNetBankingDestination.getF72327c(), indiaNetBankingDestination.getD(), indiaNetBankingDestination.getE()));
        }
        if (destination instanceof AkahuDestination) {
            return gc0.c.b(new AkahuFlow(), new an4.b(this, 7));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        xii.b[] elements = {this.d, this.e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
