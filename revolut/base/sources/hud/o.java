package hud;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.staking.impl.confirmation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.staking.impl.confirmation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (vkm.q.o(r8, r1, r7) == r2) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.staking.impl.confirmation.a r0 = r7.v
            com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L20
            if (r3 == r4) goto L1c
            if (r3 != r5) goto L14
            yhm.o.b(r8)
            goto L77
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L36
        L20:
            yhm.o.b(r8)
            wsg.n r8 = r0.f88117r
            java.lang.String r3 = r1.f88107b
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            efm.d0 r8 = r8.z(r6, r3)
            r7.u = r4
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r2) goto L36
            goto L76
        L36:
            io3.d r8 = (io3.d) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            xi0.b r8 = z92.f.l(r8)
            com.revolut.feature.staking.api.model.StakingProduct r1 = r1.d
            xi0.b r1 = r1.d
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L77
            tga.k r8 = r0.A
            com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Staking r1 = new com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Staking
            cli.y r3 = r0.D
            java.lang.Object r3 = r3.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            hud.i r3 = (hud.i) r3
            dj0.d r3 = r3.f155625b
            r1.<init>(r3)
            efm.r r8 = r8.c(r1)
            vkm.d r8 = rd0.e.b(r8)
            hp2.d r1 = new hp2.d
            r3 = 13
            r4 = 0
            r1.<init>(r0, r4, r3)
            r7.u = r5
            java.lang.Object r8 = vkm.q.o(r8, r1, r7)
            if (r8 != r2) goto L77
        L76:
            return r2
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hud.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
