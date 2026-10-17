package g48;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 2
            g48.z r3 = r8.v
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r9)
            goto L94
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            goto L51
        L20:
            yhm.o.b(r9)
            g48.r0 r9 = r3.f140417a
            n38.q r1 = n38.q.ACTIVE
            n38.q r6 = n38.q.OFFBOARDING
            n38.q r7 = n38.q.PENDING
            n38.q[] r1 = new n38.q[]{r1, r6, r7}
            java.lang.String r6 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.util.Set r1 = kotlin.collections.d.y0(r1)
            w4l.h r6 = w4l.h.f294642c
            cxe.u r9 = r9.e(r1, r6)
            g3e.s r1 = new g3e.s
            r6 = 5
            r1.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r5, r1, r4)
            r8.u = r4
            java.lang.Object r9 = vkm.q.z(r9, r8)
            if (r9 != r0) goto L51
            goto L93
        L51:
            od0.i r9 = (od0.i) r9
            if (r9 == 0) goto L5a
            java.lang.Object r9 = r9.f224257a
            n38.a r9 = (n38.a) r9
            goto L5b
        L5a:
            r9 = r5
        L5b:
            if (r9 == 0) goto L62
            com.revolut.core.model.account.AccountId$Joint r1 = l38.a.c(r9)
            goto L63
        L62:
            r1 = r5
        L63:
            if (r1 == 0) goto L87
            com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination r0 = new com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination
            com.revolut.feature.vaults.common.SavingAccountType$Joint r2 = new com.revolut.feature.vaults.common.SavingAccountType$Joint
            java.lang.String r1 = r1.f51412a
            r2.<init>(r1)
            r1 = 13
            r0.<init>(r5, r2, r1)
            n38.q r9 = r9.f211925c
            n38.q r1 = n38.q.PENDING
            if (r9 != r1) goto L82
            w38.t r9 = r3.f140421h
            h38.d r0 = h38.d.JOINT_SAVINGS
            com.revolut.retail.core.navigation.FeatureCommand r9 = r9.b(r0)
            goto L96
        L82:
            com.revolut.retail.core.navigation.FeatureCommand r9 = zh9.u0.f(r0)
            goto L96
        L87:
            ufm.i r9 = r3.b()
            r8.u = r2
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L94
        L93:
            return r0
        L94:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
        L96:
            kotlin.jvm.internal.Intrinsics.h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
