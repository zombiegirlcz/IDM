package q03;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r12 == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 2
            r3 = 1
            com.revolut.feature.card_management.impl.ui.kompot.settings.b r4 = r11.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r12)
            goto L4e
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            yhm.o.b(r12)
            goto L32
        L1e:
            yhm.o.b(r12)
            q03.n0 r12 = r4.f64912s
            q03.h0 r12 = (q03.h0) r12
            jhi.b r12 = r12.e()
            r11.u = r3
            java.lang.Object r12 = vkm.q.x(r12, r11)
            if (r12 != r0) goto L32
            goto L4d
        L32:
            h93.f0 r12 = (h93.f0) r12
            ku1.v r7 = new ku1.v
            r1 = 16
            r7.<init>(r1)
            q03.r r8 = new q03.r
            r1 = 0
            r8.<init>(r4, r12, r1)
            r11.u = r2
            r5 = 0
            r6 = 0
            r10 = 3
            r9 = r11
            java.lang.Object r12 = n14.k.V(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L4e
        L4d:
            return r0
        L4e:
            nii.h r12 = (nii.h) r12
            boolean r0 = r12 instanceof nii.g
            if (r0 == 0) goto L74
            f73.c r0 = r4.f64916y
            com.revolut.feature.card_screen.api.models.CardScreenAction$Select r1 = new com.revolut.feature.card_screen.api.models.CardScreenAction$Select
            nii.g r12 = (nii.g) r12
            java.lang.Object r12 = r12.f216152a
            h93.f0 r12 = (h93.f0) r12
            java.lang.String r12 = r12.f150110a
            r2 = 4
            r3 = 0
            r1.<init>(r12, r2, r3, r3)
            com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData r12 = r4.o
            com.revolut.core.model.account.AccountId r12 = r12.f64901b
            com.revolut.retail.core.navigation.CompositeCommand r12 = r0.c(r1, r12)
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = zh9.u0.b(r12)
            r4.C1(r12)
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
