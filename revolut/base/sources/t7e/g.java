package t7e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.create.flow.main.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hr6.b f268646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, hr6.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f268646w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f268646w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 2
            r3 = 1
            hr6.b r4 = r12.f268646w
            com.revolut.feature.subaccount.impl.ui.create.flow.main.c r5 = r12.v
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r13)
            r11 = r12
            goto L6f
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            yhm.o.b(r13)
            r11 = r12
            goto L3c
        L22:
            yhm.o.b(r13)
            g6e.b r13 = r5.f89039s
            java.lang.String r7 = r4.f154771a
            xi0.b r9 = r4.d
            java.lang.String r10 = r4.f154773c
            r12.u = r3
            r6 = r13
            s6e.d r6 = (s6e.d) r6
            com.revolut.feature.subaccount.api.models.SubaccountType$ProTax r8 = com.revolut.feature.subaccount.api.models.SubaccountType.ProTax.f88965a
            r11 = r12
            java.lang.Object r13 = r6.e(r7, r8, r9, r10, r11)
            if (r13 != r0) goto L3c
            goto L6e
        L3c:
            com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData r13 = r5.o
            boolean r13 = r13.f89017c
            if (r13 == 0) goto L4f
            j6e.a r13 = new j6e.a
            java.lang.String r0 = r4.f154771a
            r13.<init>(r0)
            r5.C2(r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L4f:
            zfe.e r13 = r5.f89038r
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r1 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r3 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r4 = r4.f154771a
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$ProTax r7 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.ProTax.INSTANCE
            r6.<init>(r4, r7)
            r1.<init>(r6, r3)
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r3 = ibb.c.f160140a
            r11.u = r2
            r2 = 0
            cge.e r13 = (cge.e) r13
            java.lang.Object r13 = r13.b(r1, r3, r2, r12)
            if (r13 != r0) goto L6f
        L6e:
            return r0
        L6f:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r13 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow) r13
            aii.n r13 = r5.C1(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t7e.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
