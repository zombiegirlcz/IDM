package uye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f284286w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, xi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f284286w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f284286w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r4 == r3) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            com.revolut.feature.topup_screen.impl.flows.topup.flow.i r1 = r0.v
            uye.g r2 = r1.o
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.u
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L25
            if (r4 == r5) goto L21
            if (r4 != r6) goto L19
            yhm.o.b(r22)
            r4 = r22
            goto Lb8
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            yhm.o.b(r22)
            goto L4b
        L25:
            yhm.o.b(r22)
            gte.a r4 = r1.f90947q
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$TopUpCurrencyChooserImprovements r7 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.TopUpCurrencyChooserImprovements.f90472c
            jte.d r4 = (jte.d) r4
            boolean r4 = r4.c(r7)
            if (r4 == 0) goto L4b
            wsg.n r4 = r1.E
            com.revolut.feature.topup_screen.common.TopUpTarget r7 = r2.f284275a
            com.revolut.core.model.account.AccountId r7 = e1f.c.a(r7)
            xi0.b r8 = r0.f284286w
            pfm.r r4 = r4.n0(r8, r7)
            r0.u = r5
            java.lang.Object r4 = nim.a.a(r4, r0)
            if (r4 != r3) goto L4b
            goto Lb7
        L4b:
            boolean r4 = r1.O2()
            r5 = 14
            r7 = 0
            if (r4 == 0) goto L8e
            nii.y0 r2 = new nii.y0
            nii.j0 r8 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.topup_screen.impl.R$string.open_banking_mandate_topup_success_dialog_title
            r9.<init>(r3, r7, r7, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.topup_screen.impl.R$string.open_banking_mandate_topup_success_dialog_subtitle
            r10.<init>(r3, r7, r7, r5)
            r19 = 0
            r20 = 4092(0xffc, float:5.734E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            r4 = 5
            r2.<init>(r7, r8, r3, r4)
            kotlinx.coroutines.flow.Flow r2 = r1.X1(r2)
            up2.q r3 = new up2.q
            r4 = 16
            r3.<init>(r1, r7, r4)
            r4 = 3
            skm.a2 r1 = yji.l.b1(r1, r2, r7, r3, r4)
            return r1
        L8e:
            eye.c r4 = r1.H
            com.revolut.feature.topup_screen.common.TopUpTarget r2 = r2.f284275a
            r0.u = r6
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r2 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action r6 = new com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action
            com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction$Success r8 = new com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction$Success
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            rh6.b r4 = r4.f130849a
            int r4 = com.revolut.feature.external_accounts.impl.R$string.open_banking_topup_submitted_toast_title
            r9.<init>(r4, r7, r7, r5)
            r8.<init>(r9, r7)
            r6.<init>(r8)
            r2.<init>(r7, r6)
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r4 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = ibb.c.f160140a
            r6 = 12
            r4.<init>(r5, r2, r7, r6)
            if (r4 != r3) goto Lb8
        Lb7:
            return r3
        Lb8:
            com.revolut.kompot.bridge.navigation.KompotDestination r4 = (com.revolut.kompot.bridge.navigation.KompotDestination) r4
            aii.n r1 = r1.C1(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uye.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
