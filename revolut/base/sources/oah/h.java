package oah;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lah.c f223646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a f223647x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(lah.c cVar, com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f223646w = cVar;
        this.f223647x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f223646w, this.f223647x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r9)
            goto La1
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r1 = r8.u
            yhm.o.b(r9)
            goto L67
        L20:
            yhm.o.b(r9)
            lah.c r9 = r8.f223646w
            com.revolut.feature.wealth.api.navigation.models.DepositInfo r1 = r9.f193397a
            boolean r5 = r1 instanceof com.revolut.feature.wealth.api.navigation.models.DepositInfo.RecurringDeposit
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r6 = r8.f223647x
            if (r5 == 0) goto L40
            r6.getClass()
            oah.j r0 = new oah.j
            r0.<init>(r9, r6, r4)
            yi5.b r9 = new yi5.b
            r1 = 26
            r9.<init>(r1)
            r6.l2(r0, r9)
            goto La1
        L40:
            if (r1 == 0) goto L4d
            boolean r9 = r1 instanceof com.revolut.feature.wealth.api.navigation.models.DepositInfo.OneOffDeposit
            if (r9 == 0) goto L47
            goto L4d
        L47:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L4d:
            epc.c r9 = r6.f95560r
            oah.d r5 = r6.o
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r5 = r5.f223636a
            boolean r7 = r1 instanceof com.revolut.feature.wealth.api.navigation.models.DepositInfo.OneOffDeposit
            if (r7 == 0) goto L5a
            com.revolut.feature.wealth.api.navigation.models.DepositInfo$OneOffDeposit r1 = (com.revolut.feature.wealth.api.navigation.models.DepositInfo.OneOffDeposit) r1
            goto L5b
        L5a:
            r1 = r4
        L5b:
            r8.u = r6
            r8.v = r3
            java.lang.Object r9 = r9.b(r5, r1, r8)
            if (r9 != r0) goto L66
            goto La0
        L66:
            r1 = r6
        L67:
            o1h.d r9 = (o1h.d) r9
            r8.u = r4
            r8.v = r2
            yki.a r2 = r1.f95561s
            o1h.a r3 = o1h.a.f221386a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r9, r3)
            if (r3 == 0) goto L7b
            oki.h.D2(r2)
            goto L8a
        L7b:
            o1h.b r3 = o1h.b.f221387a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r9, r3)
            if (r3 == 0) goto L8d
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step$OfferSetupRecurringDepositDialog r9 = com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step.OfferSetupRecurringDepositDialog.f95557a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r2, r9, r1)
        L8a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            goto L9e
        L8d:
            boolean r2 = r9 instanceof o1h.c
            if (r2 == 0) goto La4
            o1h.c r9 = (o1h.c) r9
            com.revolut.feature.wealth.api.navigation.models.DepositInfo r9 = r9.f221388a
            java.lang.Object r9 = r1.J2(r9, r8)
            if (r9 != r0) goto L9c
            goto L9e
        L9c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L9e:
            if (r9 != r0) goto La1
        La0:
            return r0
        La1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        La4:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oah.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
