package t73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class x1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r10 != r2) goto L32;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r0 = r9.v
            cli.y r1 = r0.f65434h0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.u
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L29
            if (r3 == r6) goto L25
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            yhm.o.b(r10)
            goto L93
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            yhm.o.b(r10)
            goto L82
        L25:
            yhm.o.b(r10)
            goto L47
        L29:
            yhm.o.b(r10)
            t73.d r10 = new t73.d
            r3 = 13
            r10.<init>(r3)
            kotlinx.coroutines.flow.Flow r10 = r1.B(r10)
            qij.s r3 = new qij.s
            r8 = 19
            r3.<init>(r10, r8)
            r9.u = r6
            java.lang.Object r10 = vkm.q.x(r3, r9)
            if (r10 != r2) goto L47
            goto L92
        L47:
            t73.q0 r10 = (t73.q0) r10
            com.revolut.data.model.Data r10 = r10.f268506a
            java.lang.Object r10 = r10.getContent()
            s63.g r10 = (s63.g) r10
            if (r10 == 0) goto La1
            e93.e r10 = r10.f260125j
            if (r10 == 0) goto La1
            l93.f r3 = r0.B
            java.lang.Object r6 = r1.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            t73.q0 r6 = (t73.q0) r6
            com.revolut.core.model.account.AccountId r6 = r6.i
            boolean r8 = r6 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r8 == 0) goto L6c
            com.revolut.core.model.account.AccountId$Joint r6 = (com.revolut.core.model.account.AccountId.Joint) r6
            goto L6d
        L6c:
            r6 = r7
        L6d:
            if (r6 == 0) goto L72
            java.lang.String r6 = r6.f51413b
            goto L73
        L72:
            r6 = r7
        L73:
            r8 = 129(0x81, float:1.81E-43)
            ufm.b r10 = l93.f.g(r3, r10, r6, r8)
            r9.u = r5
            java.lang.Object r10 = nim.a.b(r10, r9)
            if (r10 != r2) goto L82
            goto L92
        L82:
            h93.f0 r10 = (h93.f0) r10
            t73.q1 r3 = new t73.q1
            r5 = 2
            r3.<init>(r0, r10, r7, r5)
            r9.u = r4
            java.lang.Object r10 = do3.q.t(r0, r3, r9)
            if (r10 != r2) goto L93
        L92:
            return r2
        L93:
            h93.g0 r10 = (h93.g0) r10
            k6a.q r2 = new k6a.q
            r3 = 1
            r2.<init>(r10, r3)
            r0.H2(r1, r2)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "disposable card design not available"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t73.x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
