package e69;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f122953w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122953w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f122953w, continuation, 0);
            default:
                return new q(this.f122953w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.u
            switch(r0) {
                case 0: goto L57;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r10)
            goto L4c
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            e69.u r10 = r9.f122953w
            cli.y r1 = r10.f122959q
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            e69.f r1 = (e69.f) r1
            com.revolut.data.model.Data r1 = r1.f122941a
            java.lang.Object r1 = r1.getContent()
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r1 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r1
            if (r1 == 0) goto L4f
            dg4.c r3 = new dg4.c
            r4 = 24
            r5 = 0
            r3.<init>(r10, r1, r5, r4)
            r9.v = r2
            tji.f r10 = r10.X()
            java.lang.String r1 = "REJECT_BUTTON_TAG"
            java.lang.Object r10 = zh9.u0.b0(r10, r1, r3, r9)
            if (r10 != r0) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L4e:
            return r0
        L4f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't reject MASAV Pay to Merchant without data"
            r10.<init>(r0)
            throw r10
        L57:
            e69.u r2 = r9.f122953w
            cli.y r0 = r2.f122959q
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r8 = 1
            if (r1 == 0) goto L70
            if (r1 != r8) goto L68
            yhm.o.b(r10)
            goto Lb3
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L70:
            yhm.o.b(r10)
            java.lang.Object r10 = r0.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            e69.f r10 = (e69.f) r10
            com.revolut.data.model.Data r10 = r10.f122941a
            java.lang.Object r10 = r10.getContent()
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            e69.f r0 = (e69.f) r0
            com.revolut.data.model.Data r0 = r0.f122942b
            java.lang.Object r0 = r0.getContent()
            r5 = 0
            if (r10 == 0) goto Lb5
            if (r0 == 0) goto Lb5
            r4 = r0
            com.revolut.feature.transfer.core.models.FundingSource r4 = (com.revolut.feature.transfer.core.models.FundingSource) r4
            r3 = r10
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r3 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r3
            e69.p r1 = new e69.p
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            r9.v = r8
            tji.f r10 = r2.X()
            java.lang.String r0 = "APPROVE_BUTTON_TAG"
            java.lang.Object r10 = zh9.u0.b0(r10, r0, r1, r9)
            if (r10 != r7) goto Lb3
            goto Lb9
        Lb3:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        Lb5:
            if (r5 == 0) goto Lba
            kotlin.Unit r7 = kotlin.Unit.f186387a
        Lb9:
            return r7
        Lba:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't authorize MASAV Pay to Merchant without data"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e69.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
