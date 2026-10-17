package vha;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends gim.i implements Function2 {
    public q0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f289361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.f289361w = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.f289361w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        if (r9 == r0) goto L15;
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
            int r1 = r8.v
            vha.q0 r2 = r8.f289361w
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            vha.q0 r2 = r8.u
            yhm.o.b(r9)
            goto L9b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L59
        L21:
            yhm.o.b(r9)
            vha.s r9 = r2.o
            r9.getClass()
            w4l.h r1 = w4l.h.f294642c
            java.lang.String r5 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            et6.h1 r9 = r9.f289429c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            wsg.n r5 = r9.f129236a
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            efm.r r5 = r5.J(r6, r1)
            eq4.c r6 = new eq4.c
            r7 = 20
            r6.<init>(r9, r1, r7)
            efm.r r9 = pd.b.r(r5, r6)
            r1 = 3
            java.lang.String r5 = "firstOrError(...)"
            r6 = 0
            efm.d0 r9 = prk.o.l(r9, r6, r6, r1, r5)
            r8.v = r3
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L59
            goto L9a
        L59:
            io3.d r9 = (io3.d) r9
            com.revolut.feature.topup_screen.api.destination.InitTopUpDestination r1 = new com.revolut.feature.topup_screen.api.destination.InitTopUpDestination
            com.revolut.feature.topup_screen.api.config.TopUpConfig$a r3 = com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE
            kotlin.jvm.internal.Intrinsics.h(r9)
            dj0.d r9 = z92.f.j(r9)
            xi0.b r9 = r9.f115083b
            r3.getClass()
            com.revolut.feature.topup_screen.common.TopUpTarget$Pro r3 = com.revolut.feature.topup_screen.common.TopUpTarget.Pro.f90574a
            com.revolut.feature.topup_screen.api.config.TopUpConfig r9 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.b(r9, r3)
            r1.<init>(r9)
            jr6.o r9 = r2.f289417n
            r8.u = r2
            r8.v = r4
            s17.d r9 = (s17.d) r9
            r9.getClass()
            lr6.d r3 = lr6.d.ACCOUNT_CLOSED
            lr6.d r4 = lr6.d.ACCOUNT_CLOSED_MANUALLY
            lr6.d r5 = lr6.d.INBOUND_BLOCKED
            lr6.d r6 = lr6.d.INBOUND_OUTBOUND_BLOCKED
            lr6.d[] r3 = new lr6.d[]{r3, r4, r5, r6}
            java.lang.String r4 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.util.Set r3 = kotlin.collections.d.y0(r3)
            java.lang.Object r9 = r9.c(r1, r3, r8)
            if (r9 != r0) goto L9b
        L9a:
            return r0
        L9b:
            aii.u r9 = (aii.u) r9
            aii.n r9 = r2.A2(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
