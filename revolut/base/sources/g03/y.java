package g03;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r7 == r2) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.revolut.feature.cards.models.exceptions.CardLimitReachedException.DailyLimitReached {
        /*
            r6 = this;
            com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b r0 = r6.v
            cli.y r1 = r0.B
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r7)
            goto L79
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L70
        L20:
            yhm.o.b(r7)
            java.lang.Object r7 = r1.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            g03.a r7 = (g03.a) r7
            h93.f0 r7 = r7.f139254b
            java.lang.Object r3 = r1.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            g03.a r3 = (g03.a) r3
            com.revolut.data.model.Data r3 = r3.f139255c
            java.lang.Object r3 = r3.getContent()
            e93.e r3 = (e93.e) r3
            if (r3 == 0) goto L50
            java.util.List r3 = r3.f123845h
            if (r3 == 0) goto L50
            boolean r3 = hx7.q.m(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L51
        L50:
            r3 = 0
        L51:
            boolean r3 = pd.b.j(r3)
            if (r3 != 0) goto L8a
            boolean r3 = ifk.b.m(r7)
            if (r3 != 0) goto L70
            l93.f r3 = r0.f64870p
            java.lang.String r7 = r7.f150110a
            ha3.x r3 = (ha3.x) r3
            pfm.h r7 = r3.m(r7)
            r6.u = r5
            java.lang.Object r7 = nim.a.a(r7, r6)
            if (r7 != r2) goto L70
            goto L78
        L70:
            r6.u = r4
            java.lang.Object r7 = r0.K2(r6)
            if (r7 != r2) goto L79
        L78:
            return r2
        L79:
            h93.f0 r7 = (h93.f0) r7
            avc.o r2 = new avc.o
            r3 = 2
            r2.<init>(r7, r3)
            r0.H2(r1, r2)
            r0.L2()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L8a:
            com.revolut.feature.cards.models.exceptions.CardLimitReachedException$DailyLimitReached r7 = new com.revolut.feature.cards.models.exceptions.CardLimitReachedException$DailyLimitReached
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
