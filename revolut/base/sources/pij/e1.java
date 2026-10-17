package pij;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sij.b;

/* JADX INFO: loaded from: classes11.dex */
public final class e1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f236542w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e1 e1Var = new e1(this.f236542w, continuation);
        e1Var.v = obj2;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e1) create((b.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r10.d(r9) == r1) goto L34;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.v
            sij.b$a r0 = (sij.b.a) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.u
            r3 = 2
            r4 = 1
            r5 = 0
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b r6 = r9.f236542w
            if (r2 == 0) goto L25
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            yhm.o.b(r10)
            goto Lab
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L9e
        L25:
            yhm.o.b(r10)
            boolean r10 = r0 instanceof sij.a
            if (r10 == 0) goto Lae
            sij.a r0 = (sij.a) r0
            com.revolut.retail.feature.esim.api.model.EsimProfile r10 = r0.f263640a
            if (r10 == 0) goto L84
            gte.a r0 = r6.P
            com.revolut.retail.feature.esim.api.EsimApi$Toggles$EsimMobilePlanFlexibleStart r2 = com.revolut.retail.feature.esim.api.EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c
            jte.d r0 = (jte.d) r0
            boolean r0 = r0.c(r2)
            if (r0 == 0) goto L4c
            com.revolut.kompot.navigable.vc.modal.a r0 = r6.f0
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep$EsimInstallation r2 = new com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep$EsimInstallation
            r7 = 0
            r2.<init>(r10, r7)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r10 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r0, r2, r10)
            goto L91
        L4c:
            java.lang.String r0 = r10.f100423a
            com.revolut.retail.feature.esim.api.model.EsimProfileDetails r2 = r10.f100426g
            if (r2 == 0) goto L55
            java.lang.String r2 = r2.f100434b
            goto L56
        L55:
            r2 = r5
        L56:
            if (r2 != 0) goto L5a
            java.lang.String r2 = ""
        L5a:
            ehj.d r7 = r6.W
            r7.getClass()
            java.lang.String r10 = ehj.d.a(r10)
            chj.d r7 = r6.E
            r7.getClass()
            java.lang.String r8 = "esimProfileId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
            java.lang.String r8 = "esimActivationCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            if (r10 == 0) goto L7a
            com.revolut.retail.feature.esim.api.model.EsimProfileDetails$InstallationType$InstallationLink r2 = new com.revolut.retail.feature.esim.api.model.EsimProfileDetails$InstallationType$InstallationLink
            r2.<init>(r10)
            goto L80
        L7a:
            com.revolut.retail.feature.esim.api.model.EsimProfileDetails$InstallationType$ActivationCode r10 = new com.revolut.retail.feature.esim.api.model.EsimProfileDetails$InstallationType$ActivationCode
            r10.<init>(r2)
            r2 = r10
        L80:
            r7.b3(r0, r2)
            goto L91
        L84:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r2 = "Esim profile is not ready to be installed after transferring the esim to current device"
            java.lang.String r7 = "EsimSubscriptionsScreenModel"
            rd0.d.a(r0, r7, r2, r5, r10)
        L91:
            dfj.k0 r10 = r6.f101088x
            r9.v = r5
            r9.u = r4
            java.lang.Object r10 = r10.e(r9)
            if (r10 != r1) goto L9e
            goto Laa
        L9e:
            dfj.s3 r10 = r6.v
            r9.v = r5
            r9.u = r3
            java.lang.Object r10 = r10.d(r9)
            if (r10 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lae:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pij.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
